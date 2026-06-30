package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes.dex */
public final class y1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f33873x366c91de = 996;

    /* renamed from: NAME */
    private static final java.lang.String f33874x24728b = "createVestUser";

    /* renamed from: g, reason: collision with root package name */
    public final int f161327g = cf.b.a(this);

    public static final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y1 y1Var, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, int i18) {
        if (intent == null) {
            e9Var.a(i17, y1Var.o("fail"));
            return;
        }
        if (i18 == 0) {
            e9Var.a(i17, y1Var.o("fail cancel"));
            return;
        }
        y1Var.getClass();
        int intExtra = intent.getIntExtra(dm.i4.f66865x76d1ec5a, -1);
        java.lang.String stringExtra = intent.getStringExtra("desc");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = intent.getStringExtra("nickname");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        java.lang.String stringExtra3 = intent.getStringExtra("avatarurl");
        java.lang.String str = stringExtra3 != null ? stringExtra3 : "";
        if (!(stringExtra2.length() == 0)) {
            if (!(str.length() == 0)) {
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("headImg", str);
                hashMap2.put("nickname", stringExtra2);
                hashMap2.put(dm.i4.f66865x76d1ec5a, java.lang.Integer.valueOf(intExtra));
                hashMap2.put("desc", stringExtra);
                hashMap.put("userInfo", hashMap2);
                e9Var.a(i17, y1Var.p("ok", hashMap));
                return;
            }
        }
        e9Var.a(i17, y1Var.o("fail"));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (e9Var == null) {
            return;
        }
        if (jSONObject == null) {
            e9Var.a(i17, o("fail:invalid data"));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject);
        if (e9Var.Z0() == null) {
            e9Var.a(i17, o("fail:internal error invalid android context"));
        }
        jSONObject.optInt(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, 0);
        java.lang.String optString = jSONObject.optString("defaultAvatarUrl", "");
        java.lang.String optString2 = jSONObject.optString("defaultAvatarFileId", "");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("editAvatarInfo");
        java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
        android.app.Activity Z0 = e9Var.Z0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Z0, "getPageContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("0", mo48798x74292566);
        intent.putExtra("extra_call_by_appbrand", true);
        intent.putExtra("default_fileid", optString2);
        if (optJSONObject != null) {
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, e9Var.mo50352x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4w));
            intent.putExtra("extra_is_edit_page", true);
            intent.putExtra("extra_edit_avatar_id", optJSONObject.optString(dm.i4.f66865x76d1ec5a));
            intent.putExtra("extra_edit_frefill_avatar_name", optJSONObject.optString("nickname"));
            intent.putExtra("extra_edit_frefill_avatar_icon", optJSONObject.optString("avatarUrl"));
        }
        boolean z17 = Z0 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf;
        int i18 = this.f161327g;
        if (z17) {
            j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) Z0, ".plugin.webview.ui.tools.CreateAvatarUI", intent, i18, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w1(this, e9Var, i17));
        } else if (Z0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) {
            nf.g.a(Z0).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.x1(this, e9Var, i17));
            j45.l.v(Z0, ".plugin.webview.ui.tools.CreateAvatarUI", intent, i18);
        }
    }
}
