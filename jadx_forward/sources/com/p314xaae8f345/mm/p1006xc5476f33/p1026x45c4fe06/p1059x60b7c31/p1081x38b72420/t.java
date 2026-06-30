package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes12.dex */
public class t implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.v f162144c;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f162144c = vVar;
        this.f162142a = e9Var;
        this.f162143b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.v vVar = this.f162144c;
        int i19 = vVar.f162148g;
        int i27 = this.f162143b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162142a;
        if (i19 != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseWeChatContact", "selectSingleContact requestCode not equal, requestCode = %d", java.lang.Integer.valueOf(i17));
            e9Var.a(i27, vVar.o("fail"));
            return false;
        }
        if (i18 == 0 || i18 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseWeChatContact", "selectSingleContact user cancel, resultCode = %d", java.lang.Integer.valueOf(i17));
            e9Var.a(i27, vVar.o("cancel"));
            return true;
        }
        if (i18 == -1) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseWeChatContact", "mmOnActivityResult, selectSingleContact fail, user is null");
                e9Var.a(i27, vVar.o("fail"));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12067x4933c05e c12067x4933c05e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12067x4933c05e(stringExtra);
                c12067x4933c05e.s();
                java.lang.String str = c12067x4933c05e.f162024h;
                java.lang.String str2 = c12067x4933c05e.f162025i;
                java.lang.String str3 = c12067x4933c05e.f162026m;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("avatarUrl", str3);
                hashMap.put("userName", stringExtra);
                hashMap.put("nickName", str);
                hashMap.put("remarkName", str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseWeChatContact", "selectSingleContact: nickName:%s, remarkName:%s", str, str2);
                e9Var.a(i27, vVar.p("ok", hashMap));
            }
        }
        return true;
    }
}
