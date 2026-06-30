package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes8.dex */
public class d1 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f291871a;

    /* renamed from: b, reason: collision with root package name */
    public android.app.ProgressDialog f291872b;

    /* renamed from: c, reason: collision with root package name */
    public android.net.Uri f291873c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f291874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f291875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 f291876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291877g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.h1 f291878h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f291879i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f291880j;

    public d1(android.content.Intent intent, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010, java.lang.String str, com.p314xaae8f345.mm.ui.p2740x696c9db.h1 h1Var, android.content.Intent intent2, int i17) {
        this.f291875e = intent;
        this.f291876f = abstractViewOnAttachStateChangeListenerC21400xb429b010;
        this.f291877g = str;
        this.f291878h = h1Var;
        this.f291879i = intent2;
        this.f291880j = i17;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        try {
            android.net.Uri uri = this.f291873c;
            if (uri == null) {
                return null;
            }
            this.f291871a = com.p314xaae8f345.mm.ui.p2740x696c9db.i1.c(this.f291877g, com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f0(0, null, null, uri, false, 0.0f, 0, 0));
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AsyncObtainImage", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        if (!this.f291874d && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f291871a)) {
            android.content.Intent intent = this.f291879i;
            com.p314xaae8f345.mm.ui.p2740x696c9db.h1 h1Var = this.f291878h;
            if (h1Var != null) {
                intent.putExtra("CropImage_OutputPath", h1Var.a(this.f291871a));
            }
            intent.putExtra("CropImage_ImgPath", this.f291871a);
            this.f291876f.m7587x5dc77fb5(intent, this.f291880j);
        }
        this.f291872b.dismiss();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f291876f;
        try {
            this.f291873c = this.f291875e.getData();
            this.f291874d = false;
            this.f291872b = db5.e1.Q(abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7438x76847179(), abstractViewOnAttachStateChangeListenerC21400xb429b010.m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), abstractViewOnAttachStateChangeListenerC21400xb429b010.m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571984vf), true, true, new com.p314xaae8f345.mm.ui.p2740x696c9db.c1(this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AsyncObtainImage", e17, "", new java.lang.Object[0]);
        }
    }
}
