package pk2;

/* loaded from: classes3.dex */
public final class y1 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437923h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437924i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437923h = helper.f437616f0;
        this.f437924i = n() ? "FinderRedDotConstants.Path.AnchorLive_More_Lens" : "FinderRedDotConstants.Path.StartLive_More_Lens";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        boolean z17 = true;
        if (n()) {
            D(1);
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = o9Var.f437611d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.class);
        if (b8Var != null) {
            b8Var.f198479q = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d6.f198568e;
        }
        p012xc85e97e9.p093xedfae76a.c1 c17 = o9Var.c(mm2.c1.class);
        mm2.c1 c1Var = (mm2.c1) c17;
        if (!c1Var.a8() && !c1Var.U7()) {
            z17 = false;
        }
        if (z17) {
            c17 = null;
        }
        if (((mm2.c1) c17) != null) {
            D(0);
        }
    }

    public final void D(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var;
        new android.os.Bundle().putInt("PARAM_FINDER_LIVE_CAMERA_OPT_SCENE", i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) this.f445960a.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class);
        if (r5Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "clickLens");
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.U, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409448e), null, null, null, null, false, 124, null);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = r5Var.N6();
            if (N6 != null && (b8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8) pf5.z.f435481a.a(N6).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.class)) != null) {
                b8Var.f198479q = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d6.f198568e;
            }
            mm2.c1 c1Var = (mm2.c1) r5Var.m56788xbba4bfc0(mm2.c1.class);
            if (!c1Var.a8() && !c1Var.U7()) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("PARAM_FINDER_LIVE_CAMERA_OPT_SCENE", 0);
                r5Var.X6(qo0.b.f446883f3, bundle);
            }
            if (((mm2.c1) r5Var.m56788xbba4bfc0(mm2.c1.class)).l7()) {
                ll2.e.b(ll2.e.f400666a, "startlive.bottom.audiosetting", false, false, 6, null);
            } else {
                ll2.e.b(ll2.e.f400666a, "startlive.bottom.videosetting", false, false, 6, null);
            }
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437924i;
    }

    @Override // qk2.f
    public boolean o() {
        zl2.r4 r4Var = zl2.r4.f555483a;
        pk2.o9 o9Var = this.f445960a;
        if (r4Var.n2(((mm2.e1) o9Var.c(mm2.e1.class)).f410522s)) {
            return true;
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = ((mm2.g1) o9Var.f437607b.a(mm2.g1.class)).f410601f;
        return r4Var.G1(j2Var != null ? (r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb() : null);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437923h;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.du_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f80297x3360acc9, o9Var.f437611d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }

    @Override // qk2.h
    public int y() {
        return this.f437923h;
    }
}
