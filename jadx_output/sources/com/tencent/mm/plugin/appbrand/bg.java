package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class bg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f77011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f77012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f77013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f77014g;

    public bg(com.tencent.mm.plugin.appbrand.cg cgVar, k91.v5 v5Var, android.content.Context context, int i17, boolean z17) {
        this.f77011d = v5Var;
        this.f77012e = context;
        this.f77013f = i17;
        this.f77014g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int h17 = gm0.j1.b().h();
        k91.v5 v5Var = this.f77011d;
        com.tencent.mm.plugin.appbrand.u9.a(this.f77012e, new com.tencent.mm.plugin.appbrand.t9(h17, new java.lang.String[]{v5Var.field_roundedSquareIconURL, v5Var.field_brandIconURL, v5Var.field_bigHeadURL}, v5Var.field_nickname, v5Var.field_appId, v5Var.field_username), this.f77013f, this.f77014g);
    }
}
