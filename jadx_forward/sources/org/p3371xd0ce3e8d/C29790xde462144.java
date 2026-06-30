package org.p3371xd0ce3e8d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.webrtc.Histogram */
/* loaded from: classes14.dex */
public class C29790xde462144 {

    /* renamed from: handle */
    private final long f75490xb7026e28;

    public C29790xde462144(long j17) {
        this.f75490xb7026e28 = j17;
    }

    /* renamed from: createCounts */
    public static org.p3371xd0ce3e8d.C29790xde462144 m155613x3ff7b160(java.lang.String str, int i17, int i18, int i19) {
        return new org.p3371xd0ce3e8d.C29790xde462144(m155616x97d2eb17(str, i17, i18, i19));
    }

    /* renamed from: createEnumeration */
    public static org.p3371xd0ce3e8d.C29790xde462144 m155614x87f9dbab(java.lang.String str, int i17) {
        return new org.p3371xd0ce3e8d.C29790xde462144(m155617x5d811c54(str, i17));
    }

    /* renamed from: nativeAddSample */
    private static native void m155615xe5621754(long j17, int i17);

    /* renamed from: nativeCreateCounts */
    private static native long m155616x97d2eb17(java.lang.String str, int i17, int i18, int i19);

    /* renamed from: nativeCreateEnumeration */
    private static native long m155617x5d811c54(java.lang.String str, int i17);

    /* renamed from: addSample */
    public void m155618xfeff1dab(int i17) {
        m155615xe5621754(this.f75490xb7026e28, i17);
    }
}
