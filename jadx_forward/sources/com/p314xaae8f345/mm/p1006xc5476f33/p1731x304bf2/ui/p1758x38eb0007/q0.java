package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class q0 implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.t0 f223151b;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.t0 t0Var, java.lang.String str) {
        this.f223151b = t0Var;
        this.f223150a = str;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        ((jt0.i) this.f223151b.f223175e2).put(this.f223150a, bitmap);
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
