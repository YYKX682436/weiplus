package y75;

/* loaded from: classes15.dex */
public final class c extends lr.p {

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc f541322i;

    public c(int i17) {
        super(i17, null, null, 6, null);
    }

    @Override // lr.p, lr.k0
    public void b(android.view.View view, android.content.Context context, int i17, ir.u0 u0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (u0Var == null) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContextSearch.k(context, null)) {
            boolean z17 = u0Var instanceof ir.g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimilarEmoji", "onClick: " + i17 + ", md5 :" + (z17 ? ((ir.g) u0Var).f375369b.mo42933xb5885648() : ""));
            if (z17) {
                ir.g gVar = (ir.g) u0Var;
                if (gVar.f375370c == 102) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1257L, 4L);
                    com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = gVar.f375369b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC4987x84e327cb, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
                    ((ku5.t0) ku5.t0.f394148d).g(new z75.a(i17, (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb));
                    if (gVar.f375369b.B0() == 1) {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f375369b.mo42930x4f4a97c4())) {
                            if (((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).S(gVar.f375369b.mo42930x4f4a97c4())) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimilarEmoji", "buy and resend emoji");
                            }
                        }
                        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = gVar.f375369b;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                        aVar.f293242a = "";
                        aVar.f293262s = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j5f);
                        aVar.A = true;
                        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.bup);
                        aVar.E = new y75.b(interfaceC4987x84e327cb2, context);
                        aVar.f293266w = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                        j0Var.e(aVar);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
                        if (d0Var != null) {
                            d0Var.a(j0Var.f293370r);
                        }
                        android.view.Window window = j0Var.getWindow();
                        if (window != null) {
                            window.setSoftInputMode(48);
                            window.setFlags(131072, 131072);
                        }
                        j0Var.show();
                        return;
                    }
                    com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb3 = gVar.f375369b;
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(interfaceC4987x84e327cb3.mo42933xb5885648()) == null) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().mo880xb970c2b9((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb3);
                    }
                    interfaceC4987x84e327cb3.v1(qk.z6.SEND_FROM_SCENE_RELATED);
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 v9Var = this.f402101d;
                    if (v9Var != null) {
                        v9Var.b(interfaceC4987x84e327cb3);
                        return;
                    }
                    return;
                }
            }
            if ((u0Var instanceof ir.z0) && ((ir.z0) u0Var).f375455b == 101) {
                if (this.f541322i == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimilarEmoji", "can not jump for null data!");
                    return;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6828xd0e163fc c6828xd0e163fc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6828xd0e163fc();
                c6828xd0e163fc.f141486d = z75.c.f552155a;
                c6828xd0e163fc.f141487e = 5L;
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = z75.c.f552156b;
                c6828xd0e163fc.r(c21053xdbf1e5f4 != null ? c21053xdbf1e5f4.f68663x861009b5 : null);
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = z75.c.f552156b;
                c6828xd0e163fc.q(c21053xdbf1e5f42 != null ? c21053xdbf1e5f42.mo42933xb5885648() : null);
                c6828xd0e163fc.f141493k = 4L;
                c6828xd0e163fc.p(z75.c.f552157c);
                c6828xd0e163fc.k();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_NET_PARAM", this.f541322i);
                j45.l.n(((com.p314xaae8f345.mm.ui.xb) context).getBaseContext(), "webview", ".emojistore.ui.SosSimilarUI", intent, 229);
            }
        }
    }
}
