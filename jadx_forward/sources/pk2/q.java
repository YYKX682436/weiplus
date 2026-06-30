package pk2;

/* loaded from: classes3.dex */
public final class q extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437706h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437707i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f437708j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437706h = helper.f437630m0;
        this.f437707i = "";
        this.f437708j = kz5.c0.k(new pk2.n4(helper, i17), new pk2.y0(helper, i17), new pk2.w0(helper, i17), new pk2.b3(helper, i17), new pk2.t4(helper, i17));
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
        int i17 = (int) (abstractActivityC21394xb3d2c0cf.getResources().getDisplayMetrics().heightPixels * 0.6d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(abstractActivityC21394xb3d2c0cf);
        android.view.View inflate = android.view.LayoutInflater.from(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e88, (android.view.ViewGroup) null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "showAnchorMoreCommentSettingPanel peekHeight:" + i17);
        if (o9Var.h()) {
            e3Var.g(inflate, new android.widget.FrameLayout.LayoutParams(-1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x7.b(abstractActivityC21394xb3d2c0cf)));
        } else {
            if (i17 <= 0) {
                i17 = -1;
            }
            e3Var.g(inflate, new android.widget.FrameLayout.LayoutParams(-1, i17));
        }
        android.view.View view = e3Var.f213492f;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.jrn);
        if (findViewById != null) {
            findViewById.setOnClickListener(new pk2.p(e3Var));
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.odf);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        e3Var.c(true);
        e3Var.b();
        for (qk2.f fVar : this.f437708j) {
            qk2.d dVar = fVar instanceof qk2.d ? (qk2.d) fVar : null;
            if (dVar != null) {
                qk2.d.s(dVar, e3Var, null, 2, null);
            }
        }
        D(2);
        e3Var.i();
    }

    public final void D(int i17) {
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f409896m2, gVar.toString(), null, 4, null);
    }

    @Override // qk2.f
    public java.util.List g() {
        return this.f437708j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437707i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f437706h;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575296oz1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        t(menu, i17, string, com.p314xaae8f345.mm.R.raw.f78558xcbe13d53, o9Var.f437611d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        D(1);
    }

    @Override // qk2.h
    public int y() {
        return this.f437706h;
    }
}
