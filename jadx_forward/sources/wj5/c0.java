package wj5;

/* loaded from: classes5.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj5.e0 f528318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 f528319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xj5.n f528320f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f528321g;

    public c0(wj5.e0 e0Var, com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 c21455x9ab6ec3, xj5.n nVar, in5.s0 s0Var) {
        this.f528318d = e0Var;
        this.f528319e = c21455x9ab6ec3;
        this.f528320f = nVar;
        this.f528321g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 tvCancel = this.f528319e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tvCancel, "$tvCancel");
        wj5.e0 e0Var = this.f528318d;
        if (e0Var.q(tvCancel)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tvCancel, "$tvCancel");
            e0Var.p(tvCancel, true);
            yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        xj5.n nVar = this.f528320f;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2("msginfo@fakeuser", nVar.f536448u.w0().f454138f);
        boolean z17 = !c01.v1.C(e0Var.f528327e.x(), en1.a.a());
        if ((o27 == null || o27.m124847x74d37ac6() == 0 || o27.mo78013xfb85f7b0() == 268445456) ? false : true) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            if (o27 == null) {
                e0Var.getClass();
            } else {
                yb5.d dVar = e0Var.f528327e;
                int b17 = i65.a.b(dVar.g(), 120);
                sb5.z zVar = (sb5.z) dVar.f542241c.a(sb5.z.class);
                java.lang.String Q0 = o27.Q0();
                long m124847x74d37ac6 = o27.m124847x74d37ac6();
                hd5.n nVar2 = hd5.n.ACTION_POSITION;
                sb5.y yVar = new sb5.y();
                yVar.f487130b = true;
                yVar.f487131c = true;
                yVar.f487133e = b17;
                yVar.f487134f = true;
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).T0(Q0, m124847x74d37ac6, nVar2, yVar);
            }
            e0Var.f528329g.m0();
        } else {
            in5.s0 s0Var = this.f528321g;
            db5.t7.i(s0Var.f3639x46306858.getContext(), s0Var.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6_), com.p314xaae8f345.mm.R.raw.f80141xebd5ba06);
        }
        if (z17) {
            ak5.g0 g0Var = (ak5.g0) i95.n0.c(ak5.g0.class);
            java.lang.String t07 = nVar.f536448u.t0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t07, "getChatRoomName(...)");
            g0Var.wi(t07, nVar.f536448u.u0());
            nVar.f536430e = 1;
        }
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
