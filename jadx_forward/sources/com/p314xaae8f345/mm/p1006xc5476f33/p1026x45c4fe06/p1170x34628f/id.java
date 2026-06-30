package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class id implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.net.URL f168306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f168308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ed f168309g;

    public id(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ed edVar, java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f168309g = edVar;
        this.f168306d = url;
        this.f168307e = str;
        this.f168308f = valueCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ed edVar = this.f168309g;
        if (edVar.f168120p.get()) {
            return;
        }
        java.net.URL url = this.f168306d;
        if (url != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = edVar.f168112e;
            java.lang.String X1 = v5Var == null ? null : v5Var.X1();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var2 = edVar.f168112e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPWebViewRenderEngineLegacyImpl", "evaluateJavascript sourceURL:%s, componentURL:%s, componentId:%d, hash:%d", url, X1, java.lang.Integer.valueOf(v5Var2 == null ? 0 : v5Var2.mo50260x9f1221c2()), java.lang.Integer.valueOf(edVar.hashCode()));
        }
        edVar.X(this.f168307e, this.f168308f);
    }
}
