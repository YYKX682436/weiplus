package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes5.dex */
public class w3 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f101509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101510b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101511c;

    public w3(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.f101509a = context;
        this.f101510b = str;
        this.f101511c = str2;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        android.content.Context context = this.f101509a;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f491022bm2, q75.c.c(str2)), 1).show();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.fav.ui.v3(this, str2));
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        dp.a.makeText(this.f101509a, this.f101511c, 1).show();
    }
}
