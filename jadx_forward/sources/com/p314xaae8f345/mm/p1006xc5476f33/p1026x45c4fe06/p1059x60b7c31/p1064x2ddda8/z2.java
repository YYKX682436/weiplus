package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public class z2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce f161341a;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce c12004xb7c17ce) {
        this.f161341a = c12004xb7c17ce;
    }

    public void a(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "onFailure !");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce c12004xb7c17ce = this.f161341a;
        c12004xb7c17ce.f160933z = "fail:" + str;
        c12004xb7c17ce.C = i17;
        c12004xb7c17ce.c();
    }

    public final void b(java.lang.String str) {
        boolean isEmpty;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce c12004xb7c17ce = this.f161341a;
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(android.os.SystemClock.elapsedRealtime());
            sb6.append("");
            java.lang.String k17 = u46.l.k(new java.lang.String[]{c12004xb7c17ce.f160930y, c12004xb7c17ce.U + "", c12004xb7c17ce.f160912i + "", sb6.toString()}, "$");
            c12004xb7c17ce.f160917p = k17;
            o4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce.f160907z1;
            o4Var.putString(k17, str);
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "runInMainProcess::onSuccess, write to XProcessStore failed, appId[%s], callbackId[%d] e=%s", c12004xb7c17ce.f160930y, java.lang.Integer.valueOf(c12004xb7c17ce.f160912i), th6);
                c12004xb7c17ce.f160917p = null;
                jx3.f.INSTANCE.mo68477x336bdfd8(1063L, 1L, 1L, false);
                if (!isEmpty) {
                    return;
                }
            } finally {
                if (android.text.TextUtils.isEmpty(c12004xb7c17ce.f160917p)) {
                    c12004xb7c17ce.f160916o = str;
                }
            }
        }
        if (android.text.TextUtils.isEmpty(o4Var.getString(c12004xb7c17ce.f160917p, null))) {
            throw new java.io.IOException("write data failed");
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(1063L, 0L, 1L, false);
        if (!android.text.TextUtils.isEmpty(c12004xb7c17ce.f160917p)) {
        }
    }
}
