package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f246013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o1 f246014e;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o1 o1Var, android.graphics.Bitmap bitmap) {
        this.f246014e = o1Var;
        this.f246013d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$13$1");
        android.graphics.Bitmap bitmap = this.f246013d;
        boolean f17 = ca4.z0.f(bitmap);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o1 o1Var = this.f246014e;
        if (f17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.b(o1Var.f246069r, o1Var.f246059e, o1Var.f246060f, false, -1, o1Var.f246061g, bitmap.getWidth(), bitmap.getHeight());
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.b(o1Var.f246069r, o1Var.f246059e, o1Var.f246060f, false, -1, o1Var.f246061g, -1, -1);
        }
        if (ca4.z0.f(bitmap)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.a(o1Var.f246069r).b(o1Var.f246060f, new java.lang.ref.WeakReference(bitmap));
        } else if (o1Var.f246062h) {
            int i17 = o1Var.f246063i;
            if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().e(o1Var.f246064m, 10, null, o1Var.f246065n, o1Var.f246066o);
            } else if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().e(o1Var.f246064m, 11, null, o1Var.f246065n, o1Var.f246066o);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().e(o1Var.f246064m, o1Var.f246067p ? 8 : 2, null, o1Var.f246065n, o1Var.f246066o);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c2 c2Var = o1Var.f246068q;
        if (c2Var != null) {
            c2Var.a(bitmap);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$13$1");
    }
}
