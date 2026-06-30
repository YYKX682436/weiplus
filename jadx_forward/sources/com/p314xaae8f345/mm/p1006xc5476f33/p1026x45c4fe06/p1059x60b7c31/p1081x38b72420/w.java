package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes7.dex */
public class w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.c0 f162151c;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f162151c = c0Var;
        this.f162149a = lVar;
        this.f162150b = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.Map] */
    public void a(boolean z17, java.lang.String str, android.content.Intent intent) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiEnterContact", "page enterChatting isSuccess:%b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.c0 c0Var = this.f162151c;
        int i17 = this.f162150b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162149a;
        if (!z17) {
            lVar.a(i17, c0Var.o(str));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        str2 = "";
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("keyOutPagePath");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            str2 = stringExtra != null ? stringExtra : "";
            java.lang.String a17 = nf.z.a(str2);
            ?? c17 = nf.z.c(str2);
            str2 = a17;
            hashMap2 = c17;
        }
        hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str2);
        hashMap.put("query", hashMap2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiEnterContact", "onBackFromContact path:%s, query:%s", str2, hashMap2.toString());
        lVar.a(i17, c0Var.p("ok", hashMap));
    }
}
