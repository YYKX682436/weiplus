package rt1;

/* loaded from: classes7.dex */
public final class p1 implements rt1.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final qt1.g f481005a;

    /* renamed from: b, reason: collision with root package name */
    public rt1.b1 f481006b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e f481007c;

    public p1(qt1.g scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f481005a = scene;
    }

    public final p3325xe03a0797.p3326xc267989b.y0 a() {
        p3325xe03a0797.p3326xc267989b.y0 a17;
        rt1.b1 b1Var = this.f481006b;
        return (b1Var == null || (a17 = b1Var.a()) == null) ? p3325xe03a0797.p3326xc267989b.z0.b() : a17;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e c13032x6313e41e = this.f481007c;
        if (c13032x6313e41e != null) {
            return c13032x6313e41e;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("_viewModel");
        throw null;
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e model) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        this.f481007c = model;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, b().f176156d)) {
            e();
            return;
        }
        rt1.b1 b1Var = this.f481006b;
        if (b1Var != null) {
            b1Var.b(b().f176156d);
        }
    }

    public void d() {
        android.app.Activity d17;
        rt1.b1 b1Var = this.f481006b;
        if (b1Var == null || (d17 = b1Var.d()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CarLicensePlateListViewPresenter", "startEditUIForCreate get NULL activity");
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(a(), null, null, new rt1.i1(d17, this, null), 3, null);
        }
    }

    public final void e() {
        p3325xe03a0797.p3326xc267989b.l.d(a(), null, null, new rt1.o1(this, !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, b().f176156d), null), 3, null);
    }
}
