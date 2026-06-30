package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class c0 implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a f223066b;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a, java.lang.String str) {
        this.f223066b = c16016x82ee182a;
        this.f223065a = str;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        ((jt0.i) this.f223066b.f223029i2).put(this.f223065a, bitmap);
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
