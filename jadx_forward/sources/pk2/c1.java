package pk2;

/* loaded from: classes3.dex */
public final class c1 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437127h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437128i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437127h = helper.C;
        this.f437128i = n() ? "anchorlive.more.help" : "startlive.more.help";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HELP_AND_FEEDBACK_ENTRY_URL_STRING_SYNC, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
        if (r26.n0.N(v17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AnchorFeedbackOption", "onItemClicked: feedback url is blank, webview will render empty (storage 仅在开播页 createliveprepare 写入)");
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", v17);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.j(o9Var.f437611d, "webview", ".ui.tools.WebViewUI", intent, null);
        if (n()) {
            pk2.f8.a(pk2.f8.f437280a, 8, 2, null, 4, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 7);
        jSONObject.put("type", 2);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437128i;
    }

    @Override // qk2.f
    public boolean o() {
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HELP_AND_FEEDBACK_ENTRY_ENABLED_BOOLEAN_SYNC, false);
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HELP_AND_FEEDBACK_ENTRY_URL_STRING_SYNC, "");
        if (!o17) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
        return r26.n0.N(v17) ^ true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dxg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        s(menu, this.f437127h, string, com.p314xaae8f345.mm.R.raw.f80136xebd52499);
        if (n()) {
            pk2.f8.a(pk2.f8.f437280a, 8, 1, null, 4, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 7);
        jSONObject.put("type", 1);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f437127h;
    }
}
