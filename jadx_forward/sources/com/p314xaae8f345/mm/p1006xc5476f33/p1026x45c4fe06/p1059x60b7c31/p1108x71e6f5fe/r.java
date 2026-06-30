package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe;

/* loaded from: classes.dex */
public final class r implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.s f164505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f164507c;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f164505a = sVar;
        this.f164506b = c0Var;
        this.f164507c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.s sVar = this.f164505a;
        if (i17 != (sVar.hashCode() & 65535)) {
            return false;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiScanItem", "scanItem onResult requestCode: %d, resultCode: %d, data != null: %b", objArr);
        int i19 = this.f164507c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f164506b;
        if (i18 != -1) {
            if (i18 != 0) {
                c0Var.a(i19, sVar.o("fail"));
            } else {
                c0Var.a(i19, sVar.o("cancel"));
            }
        } else if (intent != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String stringExtra = intent.getStringExtra("key_scan_goods_result_req_key");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiScanItem", "scanItem onResult reqKey: %s", stringExtra);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
            hashMap.put("reqKey", stringExtra);
            c0Var.a(i19, sVar.p("ok", hashMap));
        } else {
            c0Var.a(i19, sVar.o("fail"));
        }
        return true;
    }
}
