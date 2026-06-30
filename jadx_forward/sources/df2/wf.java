package df2;

/* loaded from: classes3.dex */
public final class wf implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ug f313216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f313217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm2.c f313218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f313219g;

    public wf(df2.ug ugVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e, lm2.c cVar, android.content.Context context) {
        this.f313216d = ugVar;
        this.f313217e = c14197x319b1b9e;
        this.f313218f = cVar;
        this.f313219g = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = this.f313217e;
        android.content.Context context = this.f313219g;
        df2.ug ugVar = this.f313216d;
        lm2.c cVar = this.f313218f;
        switch (itemId) {
            case 154:
                r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) ugVar.m56788xbba4bfc0(mm2.e0.class)).f410503m.mo3195x754a37bb();
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
                    ugVar.X6(qo0.b.W, bundle);
                    break;
                } else {
                    db5.t7.m123883x26a183b(context, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cyc), 0).show();
                    break;
                }
                break;
            case 155:
                java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("clipboard");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((android.content.ClipboardManager) systemService).setText(cVar.j());
                break;
            case 156:
                se2.w wVar = se2.w.f488428a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
                wVar.b(context, c14197x319b1b9e.getLiveRoomData(), cVar);
                break;
            default:
                switch (itemId) {
                    case 165:
                        se2.w.f488428a.h(ugVar.f313055m, c14197x319b1b9e.getLiveRoomData(), cVar);
                        break;
                    case 166:
                        se2.w.f488428a.d(ugVar.f313055m, c14197x319b1b9e.getLiveRoomData(), cVar);
                        break;
                    case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26321xaee9b201.f52302xff8c0727 /* 167 */:
                        se2.w wVar2 = se2.w.f488428a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
                        wVar2.g(context, cVar.c());
                        break;
                }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214314a.a();
    }
}
