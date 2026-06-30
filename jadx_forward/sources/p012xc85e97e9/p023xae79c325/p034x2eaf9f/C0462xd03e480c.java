package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.AutoValue_SurfaceOutput_Event */
/* loaded from: classes14.dex */
final class C0462xd03e480c extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.Event {

    /* renamed from: eventCode */
    private final int f817x1d7b7a7;

    /* renamed from: surfaceOutput */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee f818x1274fc0e;

    public C0462xd03e480c(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee interfaceC0567x42142bee) {
        this.f817x1d7b7a7 = i17;
        if (interfaceC0567x42142bee == null) {
            throw new java.lang.NullPointerException("Null surfaceOutput");
        }
        this.f818x1274fc0e = interfaceC0567x42142bee;
    }

    /* renamed from: equals */
    public boolean m4233xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.Event)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.Event event = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.Event) obj;
        return this.f817x1d7b7a7 == event.mo4234x14528f1() && this.f818x1274fc0e.equals(event.mo4235xcfd4b858());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.Event
    /* renamed from: getEventCode */
    public int mo4234x14528f1() {
        return this.f817x1d7b7a7;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.Event
    /* renamed from: getSurfaceOutput */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee mo4235xcfd4b858() {
        return this.f818x1274fc0e;
    }

    /* renamed from: hashCode */
    public int m4236x8cdac1b() {
        return ((this.f817x1d7b7a7 ^ 1000003) * 1000003) ^ this.f818x1274fc0e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m4237x9616526c() {
        return "Event{eventCode=" + this.f817x1d7b7a7 + ", surfaceOutput=" + this.f818x1274fc0e + "}";
    }
}
