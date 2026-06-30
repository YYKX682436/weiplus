package wj5;

/* loaded from: classes9.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xj5.h f528370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wj5.u f528371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f528372f;

    public s(xj5.h hVar, wj5.u uVar, in5.s0 s0Var) {
        this.f528370d = hVar;
        this.f528371e = uVar;
        this.f528372f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/PayPluginTopMsgTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xj5.h hVar = this.f528370d;
        java.lang.String msg_svrId = hVar.f536438u.f458302d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msg_svrId, "msg_svrId");
        long parseLong = java.lang.Long.parseLong(msg_svrId);
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        wj5.u uVar = this.f528371e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = cj6.o2(uVar.f528375e.x(), parseLong);
        if ((o27 == null || o27.m124847x74d37ac6() == 0 || o27.mo78013xfb85f7b0() == 268445456) ? false : true) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            uVar.getClass();
            if (o27 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27193, 1, 2);
                yb5.d dVar = uVar.f528375e;
                int b17 = i65.a.b(dVar.g(), 120);
                sb5.z zVar = (sb5.z) dVar.f542241c.a(sb5.z.class);
                java.lang.String Q0 = o27.Q0();
                long m124847x74d37ac6 = o27.m124847x74d37ac6();
                hd5.n nVar = hd5.n.ACTION_POSITION;
                sb5.y yVar = new sb5.y();
                yVar.f487130b = true;
                yVar.f487131c = true;
                yVar.f487133e = b17;
                yVar.f487134f = true;
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).T0(Q0, m124847x74d37ac6, nVar, yVar);
            }
            uVar.f528377g.m0();
        } else {
            in5.s0 s0Var = this.f528372f;
            db5.t7.i(s0Var.f3639x46306858.getContext(), s0Var.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6_), com.p314xaae8f345.mm.R.raw.f80141xebd5ba06);
        }
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ni(uVar.f528375e.x(), hVar.f536438u);
        hVar.f536430e = 1;
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/PayPluginTopMsgTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
