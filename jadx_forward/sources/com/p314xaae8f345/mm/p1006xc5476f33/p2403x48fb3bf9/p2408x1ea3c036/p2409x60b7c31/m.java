package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class m implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263927c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f263928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.n f263929e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.n nVar, java.lang.String str, android.content.Context context, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        this.f263929e = nVar;
        this.f263925a = str;
        this.f263926b = context;
        this.f263927c = str2;
        this.f263928d = q5Var;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        java.lang.Object obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddToEmotion", "imageLoaderListener onImageLoadComplete %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f263928d;
        if (bitmap != null && objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof java.lang.String) && str.equals(this.f263925a)) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(objArr[0].toString());
            if (r6Var.m()) {
                java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(r6Var.u());
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5 x5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5.class);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
                java.lang.String g17 = n22.m.g();
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.o0) x5Var).getClass();
                com.p314xaae8f345.mm.vfs.w6.c(r6Var.o(), com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(g17, "", p17));
                this.f263929e.f(this.f263926b, p17, this.f263927c, q5Var);
                return;
            }
        }
        q5Var.a("fail", null);
    }
}
