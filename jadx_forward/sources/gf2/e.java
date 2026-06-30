package gf2;

/* loaded from: classes.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f352805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 f352807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f352808g;

    public e(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49, yz5.p pVar) {
        this.f352805d = k0Var;
        this.f352806e = str;
        this.f352807f = c14195x2dafdb49;
        this.f352808g = pVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        yz5.p pVar = this.f352808g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49 = this.f352807f;
        java.lang.String str = this.f352806e;
        if (valueOf != null && valueOf.intValue() == 0) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49.f193104t;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_File_Name", str);
            intent.putExtra("Retr_Compress_Type", 0);
            intent.putExtra("Retr_Msg_Type", 0);
            java.lang.String str2 = c14195x2dafdb49.f193108g;
            if (str2 != null) {
                ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Di(intent, str2, 4);
            }
            android.content.Context context = c14195x2dafdb49.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            j45.l.x((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context, ".ui.transmit.MsgRetransmitUI", intent, 1014, new gf2.h(pVar));
        } else if (valueOf != null && valueOf.intValue() == 1) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49.f193104t;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Ksnsupload_type", 0);
            intent2.putExtra("sns_kemdia_path", str);
            java.lang.String str3 = c14195x2dafdb49.f193108g;
            if (str3 != null) {
                ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Di(intent2, str3, 4);
            }
            android.content.Context context2 = c14195x2dafdb49.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, ".plugin.sns.ui.SnsUploadUI", intent2, 1017, new gf2.i(pVar));
        } else if (valueOf != null && valueOf.intValue() == 2) {
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49.f193104t;
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = c14195x2dafdb49.f193106e;
            if (c19782x23db1cfa == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contact");
                throw null;
            }
            java.lang.String m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c();
            if (m76197x6c03c64c == null) {
                m76197x6c03c64c = "";
            }
            android.content.Context context3 = c14195x2dafdb49.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((c61.l7) b6Var).Wk(str, m76197x6c03c64c, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context3);
        }
        this.f352805d.u();
    }
}
