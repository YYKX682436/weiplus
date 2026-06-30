package se2;

/* loaded from: classes3.dex */
public final class b implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f488367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ se2.d f488368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm2.c f488369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f488370g;

    public b(in5.s0 s0Var, se2.d dVar, lm2.c cVar, android.view.View view) {
        this.f488367d = s0Var;
        this.f488368e = dVar;
        this.f488369f = cVar;
        this.f488370g = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        android.view.View view = this.f488370g;
        se2.d dVar = this.f488368e;
        lm2.c cVar = this.f488369f;
        switch (itemId) {
            case 154:
                r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) dVar.a(mm2.e0.class)).f410503m.mo3195x754a37bb();
                if (qm1Var == null || (str = qm1Var.m75945x2fec8307(1)) == null) {
                    str = "";
                }
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                boolean z17 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) || c01.v1.x(str, false)) ? false : true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveBoxUtil", "isNotInChatRoom " + str + ", " + z17);
                if (!z17) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
                    r45.xn1 xn1Var = (r45.xn1) cVar.f400905e.m75936x14adae67(13);
                    bundle.putByteArray("PARAM_ENTER_COMMENT_AT_NAME", xn1Var != null ? xn1Var.mo14344x5f01b1f6() : null);
                    bundle.putLong("PARAM_ENTER_COMMENT_REPLY_MSG_SEQ", cVar.e());
                    bundle.putBoolean("PARAM_ENTER_COMMENT_HIDE_AT_ENTRANCE", true);
                    dVar.f488376b.f195901p.mo46557x60d69242(qo0.b.W, bundle);
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).vj(((mm2.c1) dVar.a(mm2.c1.class)).T ? ml2.g5.f409020n : ml2.g5.f409017h, 1, cVar.a(), cVar.j());
                    break;
                } else {
                    db5.t7.m123883x26a183b(view.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cyc), 0).show();
                    break;
                }
                break;
            case 155:
                java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("clipboard");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((android.content.ClipboardManager) systemService).setText(cVar.j());
                ((ml2.r0) i95.n0.c(ml2.r0.class)).vj(ml2.g5.f409018i, 1, cVar.a(), cVar.j());
                break;
            case 156:
                se2.w wVar = se2.w.f488428a;
                android.content.Context context = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                wVar.b(context, dVar.f488376b.S0(), cVar);
                ((ml2.r0) i95.n0.c(ml2.r0.class)).vj(((mm2.c1) dVar.a(mm2.c1.class)).T ? ml2.g5.Q : ml2.g5.f409019m, 1, cVar.a(), cVar.j());
                break;
            default:
                switch (itemId) {
                    case 165:
                        se2.w wVar2 = se2.w.f488428a;
                        in5.s0 s0Var = this.f488367d;
                        p3325xe03a0797.p3326xc267989b.y0 y0Var = s0Var.f374653d;
                        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.c7g);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
                        wVar2.t(y0Var, p17, new se2.a(dVar, cVar));
                        break;
                    case 166:
                        se2.w.f488428a.d(dVar.f488377c, dVar.f488376b.S0(), cVar);
                        ((ml2.r0) i95.n0.c(ml2.r0.class)).vj(((mm2.c1) dVar.a(mm2.c1.class)).T ? ml2.g5.L : ml2.g5.f409028v, 1, cVar.a(), cVar.j());
                        break;
                    case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26321xaee9b201.f52302xff8c0727 /* 167 */:
                        se2.w.f488428a.g(dVar.f488375a, cVar.c());
                        break;
                }
        }
        view.setBackground(dVar.f488378d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214314a.a();
    }
}
