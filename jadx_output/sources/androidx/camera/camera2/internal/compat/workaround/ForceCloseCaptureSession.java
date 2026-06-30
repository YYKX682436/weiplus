package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes14.dex */
public class ForceCloseCaptureSession {
    private final androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk mCaptureSessionOnClosedNotCalledQuirk;

    @java.lang.FunctionalInterface
    /* loaded from: classes14.dex */
    public interface OnConfigured {
        void run(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession);
    }

    public ForceCloseCaptureSession(androidx.camera.core.impl.Quirks quirks) {
        this.mCaptureSessionOnClosedNotCalledQuirk = (androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk) quirks.get(androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk.class);
    }

    private void forceOnClosed(java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> set) {
        for (androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession : set) {
            synchronizedCaptureSession.getStateCallback().onClosed(synchronizedCaptureSession);
        }
    }

    private void forceOnConfigureFailed(java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> set) {
        for (androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession : set) {
            synchronizedCaptureSession.getStateCallback().onConfigureFailed(synchronizedCaptureSession);
        }
    }

    public void onSessionConfigured(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession, java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> list, java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> list2, androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession.OnConfigured onConfigured) {
        androidx.camera.camera2.internal.SynchronizedCaptureSession next;
        androidx.camera.camera2.internal.SynchronizedCaptureSession next2;
        if (shouldForceClose()) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != synchronizedCaptureSession) {
                linkedHashSet.add(next2);
            }
            forceOnConfigureFailed(linkedHashSet);
        }
        onConfigured.run(synchronizedCaptureSession);
        if (shouldForceClose()) {
            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
            java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession> it6 = list2.iterator();
            while (it6.hasNext() && (next = it6.next()) != synchronizedCaptureSession) {
                linkedHashSet2.add(next);
            }
            forceOnClosed(linkedHashSet2);
        }
    }

    public boolean shouldForceClose() {
        return this.mCaptureSessionOnClosedNotCalledQuirk != null;
    }
}
