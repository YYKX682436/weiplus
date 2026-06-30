package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f245909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m1 f245910e;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m1 m1Var, android.graphics.Bitmap bitmap) {
        this.f245910e = m1Var;
        this.f245909d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$12$1");
        android.graphics.Bitmap bitmap = this.f245909d;
        boolean f17 = ca4.z0.f(bitmap);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m1 m1Var = this.f245910e;
        if (f17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.b(m1Var.f246000q, m1Var.f245991e, m1Var.f245992f, false, -1, m1Var.f245993g, bitmap.getWidth(), bitmap.getHeight());
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.b(m1Var.f246000q, m1Var.f245991e, m1Var.f245992f, false, -1, m1Var.f245993g, -1, -1);
        }
        if (ca4.z0.f(bitmap)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.a(m1Var.f246000q).b(m1Var.f245992f, new java.lang.ref.WeakReference(bitmap));
        } else if (m1Var.f245994h) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().e(m1Var.f245995i, m1Var.f245996m ? 8 : 2, null, m1Var.f245997n, m1Var.f245998o);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c2 c2Var = m1Var.f245999p;
        if (c2Var != null) {
            c2Var.a(bitmap);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$12$1");
    }
}
