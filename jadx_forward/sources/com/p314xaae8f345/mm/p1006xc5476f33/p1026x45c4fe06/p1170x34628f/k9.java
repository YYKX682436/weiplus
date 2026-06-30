package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class k9 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.db f168368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168369b;

    public k9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9 w9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.db dbVar, java.lang.String str) {
        this.f168368a = dbVar;
        this.f168369b = str;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.p314xaae8f345.p3210x3857dc.l2 l2Var = (com.p314xaae8f345.p3210x3857dc.l2) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.db dbVar = this.f168368a;
        java.lang.String str = this.f168369b;
        if (l2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebView", "onReceiveValue result is null");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l6) dbVar).a(str, null);
            return;
        }
        if (!str.equalsIgnoreCase(l2Var.c())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebView", "onReceiveValue url is not current url, current url:%s,  getUrl:%s", str, l2Var.c());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebView", "onReceiveValue, url = %s, errorCode = %d", l2Var.c(), java.lang.Integer.valueOf(l2Var.b()));
        if (l2Var.b() != 0 || l2Var.a() == null || l2Var.a().limit() <= 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l6) dbVar).a(l2Var.c(), null);
            l2Var.d();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y();
            java.nio.ByteBuffer a17 = l2Var.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.j9 j9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.j9(this, l2Var);
            yVar.f168794a = a17;
            yVar.f168795b = j9Var;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l6) dbVar).a(str, yVar);
        }
    }
}
