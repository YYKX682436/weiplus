package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes.dex */
public class f0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19635xb390e7ca f272365a;

    public f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19635xb390e7ca activityC19635xb390e7ca, com.p314xaae8f345.mm.p2470x93e71c27.ui.c0 c0Var) {
        this.f272365a = activityC19635xb390e7ca;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g0
    public int a() {
        return com.p314xaae8f345.mm.R.C30861xcebc809e.c1t;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g0
    public java.lang.String b() {
        return this.f272365a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aio);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g0
    public java.lang.String c() {
        return this.f272365a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aip);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g0
    public java.lang.String d() {
        return this.f272365a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aim);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g0
    public void e(int i17, int i18, android.content.Intent intent) {
        if (i18 != 2 || intent == null) {
            return;
        }
        this.f272365a.finish();
        java.lang.String stringExtra = intent.getStringExtra("KFaceLoginAuthPwd");
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra));
        objArr[1] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) ? 0 : stringExtra.length());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BioHelperUI", "hy: secondary check onActivityResult, do faceprint auth, authPwd is null:%b, authPwd.len:%d", objArr);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g0
    public void f(android.content.Intent intent) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g0
    public void g(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19635xb390e7ca activityC19635xb390e7ca = this.f272365a;
        intent.putExtra("k_user_name", activityC19635xb390e7ca.f271292e);
        intent.putExtra("k_purpose", 2);
        intent.putExtra("k_need_signature", true);
        intent.putExtra("k_ticket", activityC19635xb390e7ca.f271293f);
        j45.l.n(activityC19635xb390e7ca.mo55332x76847179(), "facedetect", ".ui.FaceDetectUI", intent, 1025);
    }
}
