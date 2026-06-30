package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class z0 implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.c1 f223200b;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.c1 c1Var, java.lang.String str) {
        this.f223200b = c1Var;
        this.f223199a = str;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        ((jt0.i) this.f223200b.f223070e2).put(this.f223199a, bitmap);
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
