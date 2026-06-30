package k22;

/* loaded from: classes12.dex */
public final class a implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k22.g f385008a;

    public a(k22.g gVar) {
        this.f385008a = gVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        k22.g gVar = this.f385008a;
        gVar.getClass();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        z85.l c17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = gVar.f385017e;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = c17.u1(c21053xdbf1e5f4.f68671x4b6e68b9);
        java.lang.String str = gVar.D;
        if (u17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "sendEmoji: db info is null");
            l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
            c21053xdbf1e5f4.f68653x95b20dd4 = 65;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().J0(c21053xdbf1e5f4);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("entranceScene ");
        int i17 = gVar.f385020h;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        qk.z6 z6Var = qk.z6.SEND_FROM_SCENE_FORWARD_FROM_PREVIEW_RECOMMEND;
        c21053xdbf1e5f4.K2 = z6Var;
        if (i17 != 0) {
            qk.z6 z6Var2 = qk.z6.SEND_FROM_SCENE_FORWARD_FROM_ALBUM_DETAIL_RECOMMEND;
            if (i17 == 59) {
                c21053xdbf1e5f4.K2 = z6Var2;
            } else if (i17 == 100009) {
                c21053xdbf1e5f4.K2 = z6Var;
            } else if (i17 != 100041) {
                switch (i17) {
                    case 71:
                        c21053xdbf1e5f4.K2 = z6Var2;
                        break;
                    case 72:
                        c21053xdbf1e5f4.K2 = z6Var;
                        break;
                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.k.f34811x366c91de /* 73 */:
                        c21053xdbf1e5f4.K2 = z6Var;
                        break;
                }
            } else {
                c21053xdbf1e5f4.K2 = qk.z6.SEND_FROM_SCENE_FORWARD_FROM_FINDER_COMMENT;
            }
        } else {
            c21053xdbf1e5f4.K2 = qk.z6.SEND_FROM_SCENE_FORWARD_FROM_ALBUM_DETAIL;
        }
        new lb5.a().n(c21053xdbf1e5f4.mo42933xb5885648());
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5 s5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) s5Var).hj(gVar.f385016d, c21053xdbf1e5f4.mo42933xb5885648(), c21053xdbf1e5f4);
        gVar.f385021i.B();
        yz5.a aVar = gVar.f385032w;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        j22.a.d(gVar.f385017e, 2, gVar.f385035z, gVar.A, gVar.f385020h);
        k22.g.a(gVar, "transportClick");
    }
}
