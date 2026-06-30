package hw;

@j95.b
/* loaded from: classes7.dex */
public final class j1 extends i95.w implements gw.j {

    /* renamed from: d, reason: collision with root package name */
    public boolean f366923d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f366924e = jz5.h.b(new hw.h1(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f366925f = jz5.h.b(new hw.f1(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f366926g = jz5.h.b(hw.g1.f366913d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f366927h = jz5.h.b(new hw.i1(this));

    public static final void wi(hw.j1 j1Var) {
        if (j1Var.f366923d) {
            return;
        }
        jz5.g gVar = ew.e.f338498a;
        if (((java.lang.Number) ((jz5.n) ew.e.f338500c).mo141623x754a37bb()).intValue() <= 0) {
            return;
        }
        fp.d0.n("owl");
        fp.d0.n("ilink_protobuf");
        fp.d0.n("magic_brush_zidl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicFlutterPluginFeatureService", "load mb zidl lib");
        j1Var.f366923d = true;
    }

    public final fw.h Ai() {
        return (fw.h) ((jz5.n) this.f366925f).mo141623x754a37bb();
    }

    public final fw.w Bi() {
        return (fw.w) ((jz5.n) this.f366926g).mo141623x754a37bb();
    }
}
