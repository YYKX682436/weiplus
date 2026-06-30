package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes8.dex */
public class f1 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f291919a;

    /* renamed from: b, reason: collision with root package name */
    public android.app.ProgressDialog f291920b;

    /* renamed from: c, reason: collision with root package name */
    public android.net.Uri f291921c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f291922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f291923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f291924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291925g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.h1 f291926h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f291927i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f291928j;

    public f1(android.content.Intent intent, android.app.Activity activity, java.lang.String str, com.p314xaae8f345.mm.ui.p2740x696c9db.h1 h1Var, android.content.Intent intent2, int i17) {
        this.f291923e = intent;
        this.f291924f = activity;
        this.f291925g = str;
        this.f291926h = h1Var;
        this.f291927i = intent2;
        this.f291928j = i17;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        try {
            android.net.Uri uri = this.f291921c;
            if (uri == null) {
                return null;
            }
            this.f291919a = com.p314xaae8f345.mm.ui.p2740x696c9db.i1.c(this.f291925g, com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f0(0, null, null, uri, false, 0.0f, 0, 0));
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AsyncObtainImage", e17, "doInBackground", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        if (this.f291922d || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f291919a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AsyncObtainImage", "onPostExecute error, filePath:%s", this.f291919a);
        } else {
            android.content.Intent intent = this.f291927i;
            com.p314xaae8f345.mm.ui.p2740x696c9db.h1 h1Var = this.f291926h;
            if (h1Var != null) {
                intent.putExtra("CropImage_OutputPath", h1Var.a(this.f291919a));
            }
            intent.putExtra("CropImage_ImgPath", this.f291919a);
            android.app.Activity activity = this.f291924f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(this.f291928j));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/ui/tools/AsyncObtainImage$2", "onPostExecute", "(Ljava/lang/Integer;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        this.f291920b.dismiss();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        try {
            this.f291921c = this.f291923e.getData();
            this.f291922d = false;
            android.app.Activity activity = this.f291924f;
            this.f291920b = db5.e1.Q(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f291924f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571984vf), true, true, new com.p314xaae8f345.mm.ui.p2740x696c9db.e1(this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AsyncObtainImage", e17, "onPreExecute", new java.lang.Object[0]);
        }
    }
}
