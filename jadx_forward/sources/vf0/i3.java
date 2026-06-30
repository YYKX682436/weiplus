package vf0;

/* loaded from: classes12.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final vf0.j3 f517729a;

    public i3(vf0.j3 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f517729a = scene;
    }

    /* renamed from: equals */
    public boolean m171759xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vf0.i3) && this.f517729a == ((vf0.i3) obj).f517729a;
    }

    /* renamed from: hashCode */
    public int m171760x8cdac1b() {
        return this.f517729a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m171761x9616526c() {
        return "VideoSendParamsExtra(scene=" + this.f517729a + ')';
    }
}
