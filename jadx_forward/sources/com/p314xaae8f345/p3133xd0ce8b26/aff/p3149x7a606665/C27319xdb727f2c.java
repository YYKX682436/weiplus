package com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665;

/* renamed from: com.tencent.wechat.aff.function_call.ZIDL_JdUMnLr0B */
/* loaded from: classes11.dex */
class C27319xdb727f2c extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.l {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.m f298417a;

    public C27319xdb727f2c(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.m mVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.m) obj;
        this.f298417a = mVar;
        ((ey.j) mVar).f338809a = this;
    }

    /* renamed from: ZIDL_AX */
    private native void m112946x1964d17f(long j17, long j18, byte[] bArr);

    /* renamed from: ZIDL_AV */
    public void m112947x1964d17d(long j17, byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ey.j jVar = (ey.j) this.f298417a;
        jVar.getClass();
        try {
            jVar.a(str.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(str), new ey.i(jVar, j17));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FunctionCallBaseImpl", "parse json error " + e17);
            java.lang.String errorMessage = "parse json error: " + e17.getMessage();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMessage, "errorMessage");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.f77504xbb80cbe3, false);
            jSONObject.put("error_message", errorMessage);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.l lVar = jVar.f338809a;
            if (lVar != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.C27319xdb727f2c) lVar).k1(j17, jSONObject.toString());
            }
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.l
    public void k1(long j17, java.lang.String str) {
        m112946x1964d17f(this.f60633xf042a733, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
