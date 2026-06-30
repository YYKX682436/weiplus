package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f285610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i4 f285612f;

    public h4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i4 i4Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f285612f = i4Var;
        this.f285610d = bitmap;
        this.f285611e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f285610d;
        if (bitmap != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i4 i4Var = this.f285612f;
            if (this.f285611e.equals(i4Var.f285696c.f285760f.getTag(com.p314xaae8f345.mm.R.id.nvv))) {
                i4Var.f285696c.f285760f.setImageBitmap(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p4.f(bitmap, i4Var.f285694a, i4Var.f285695b, !i4Var.f285696c.f285763i));
            }
        }
    }
}
