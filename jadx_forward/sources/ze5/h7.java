package ze5;

/* loaded from: classes9.dex */
public final class h7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.i7 f553504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v05.b f553506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z05.c f553507g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553508h;

    public h7(ze5.i7 i7Var, yb5.d dVar, v05.b bVar, z05.c cVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f553504d = i7Var;
        this.f553505e = dVar;
        this.f553506f = bVar;
        this.f553507g = cVar;
        this.f553508h = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemLiteAppMvvm$preDealData$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f553508h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        ze5.i7 i7Var = this.f553504d;
        i7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1293L, 34L, 1L);
        z05.c cVar = this.f553507g;
        java.lang.String m178293x5db1b11 = cVar.m178293x5db1b11();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m178293x5db1b11)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemLiteApp", "handleLiteAppClick: appId is null");
        } else {
            java.lang.String m178294xfb83cc9b = cVar.m178294xfb83cc9b();
            java.lang.String p17 = cVar.p();
            java.lang.String n17 = cVar.n();
            boolean z17 = true;
            boolean z18 = cVar.r() == 1;
            v05.b bVar = this.f553506f;
            boolean z19 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.m75945x2fec8307(bVar.f449898d + 9));
            if (z19 && !((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Lj(m178293x5db1b11)) {
                z17 = false;
            }
            if (z17) {
                g0Var.C(1293L, 83L, 1L);
                q80.d0 d0Var = new q80.d0();
                d0Var.f442182a = m178293x5db1b11;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m178294xfb83cc9b)) {
                    d0Var.f442183b = m178294xfb83cc9b;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17)) {
                    d0Var.f442184c = p17;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17)) {
                    d0Var.f442187f = n17;
                }
                d0Var.f442185d = java.lang.Boolean.valueOf(z18);
                com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
                yb5.d dVar = this.f553505e;
                c3708xc1f46f80.f14311x683188c = dVar.D() ? com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.GROUP_CHAT : com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.SINGLE_CHAT;
                d0Var.f442207z = c3708xc1f46f80;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(dVar.g(), d0Var, new ze5.y6(db5.e1.Q(dVar.g(), dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, ze5.z6.f553880d), z19, view, dVar, f9Var, i7Var, bVar));
            } else {
                g0Var.C(1293L, 84L, 1L);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemLiteAppMvvm$preDealData$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
