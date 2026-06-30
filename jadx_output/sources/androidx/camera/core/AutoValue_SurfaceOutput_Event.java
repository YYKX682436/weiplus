package androidx.camera.core;

/* loaded from: classes14.dex */
final class AutoValue_SurfaceOutput_Event extends androidx.camera.core.SurfaceOutput.Event {
    private final int eventCode;
    private final androidx.camera.core.SurfaceOutput surfaceOutput;

    public AutoValue_SurfaceOutput_Event(int i17, androidx.camera.core.SurfaceOutput surfaceOutput) {
        this.eventCode = i17;
        if (surfaceOutput == null) {
            throw new java.lang.NullPointerException("Null surfaceOutput");
        }
        this.surfaceOutput = surfaceOutput;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.SurfaceOutput.Event)) {
            return false;
        }
        androidx.camera.core.SurfaceOutput.Event event = (androidx.camera.core.SurfaceOutput.Event) obj;
        return this.eventCode == event.getEventCode() && this.surfaceOutput.equals(event.getSurfaceOutput());
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public int getEventCode() {
        return this.eventCode;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public androidx.camera.core.SurfaceOutput getSurfaceOutput() {
        return this.surfaceOutput;
    }

    public int hashCode() {
        return ((this.eventCode ^ 1000003) * 1000003) ^ this.surfaceOutput.hashCode();
    }

    public java.lang.String toString() {
        return "Event{eventCode=" + this.eventCode + ", surfaceOutput=" + this.surfaceOutput + "}";
    }
}
