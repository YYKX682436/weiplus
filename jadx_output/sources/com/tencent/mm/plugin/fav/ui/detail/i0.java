package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes5.dex */
public class i0 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f100736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100737b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100738c;

    public i0(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.f100736a = context;
        this.f100737b = str;
        this.f100738c = str2;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        android.content.Context context = this.f100736a;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f491022bm2, q75.c.c(str2)), 1).show();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.fav.ui.detail.h0(this, str2));
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        dp.a.makeText(this.f100736a, this.f100738c, 1).show();
    }
}
