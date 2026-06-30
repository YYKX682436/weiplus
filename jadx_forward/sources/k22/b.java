package k22;

/* loaded from: classes12.dex */
public final class b implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k22.g f385009a;

    public b(k22.g gVar) {
        this.f385009a = gVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        k22.g gVar = this.f385009a;
        gVar.getClass();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        z85.l c17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = gVar.f385017e;
        if (c17.u1(c21053xdbf1e5f4.f68671x4b6e68b9) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.D, "doAddAction: db info is null");
            l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
            c21053xdbf1e5f4.f68653x95b20dd4 = 65;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().J0(c21053xdbf1e5f4);
        }
        int i17 = c21053xdbf1e5f4.f68653x95b20dd4;
        l75.e0 e0Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = gVar.f385021i;
        if (i17 == 17) {
            z2Var.B();
        } else {
            android.content.Context context = gVar.f385016d;
            if (i17 == 81) {
                z2Var.B();
                db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571539i8));
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ni().U(context, c21053xdbf1e5f4, gVar.B, c01.z1.r());
                z2Var.B();
            }
        }
        gVar.c();
        yz5.a aVar = gVar.f385033x;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        j22.a.d(gVar.f385017e, 1, gVar.f385035z, gVar.A, gVar.f385020h);
        k22.g.a(gVar, "addClick");
    }
}
