package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

/* loaded from: classes7.dex */
public final class b1 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.e1 f161486a;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.e1 e1Var) {
        this.f161486a = e1Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBizPublishImageForAppBrand", "receive callback, value: " + str);
        this.f161486a.m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12034xcbb61794(true, "", str.toString()));
    }
}
