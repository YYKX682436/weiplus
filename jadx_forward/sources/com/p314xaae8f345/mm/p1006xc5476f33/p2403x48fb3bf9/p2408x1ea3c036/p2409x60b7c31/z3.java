package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class z3 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f264064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f264065b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264066c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f264068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264069f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f264070g;

    public z3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.w3 w3Var, android.app.ProgressDialog progressDialog, android.content.Context context, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        this.f264064a = progressDialog;
        this.f264065b = context;
        this.f264066c = str;
        this.f264067d = str2;
        this.f264068e = jSONObject;
        this.f264069f = str3;
        this.f264070g = q5Var;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        android.app.ProgressDialog progressDialog = this.f264064a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        uw4.y.a(this.f264065b, this.f264066c, this.f264067d, this.f264068e, this.f264069f);
        this.f264070g.a(null, null);
    }
}
