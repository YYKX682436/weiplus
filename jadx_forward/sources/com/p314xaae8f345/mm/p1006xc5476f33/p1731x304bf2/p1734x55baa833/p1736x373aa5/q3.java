package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes15.dex */
public final class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15863x539d1b35 f220804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f220805e;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15863x539d1b35 c15863x539d1b35, android.graphics.Bitmap bitmap) {
        this.f220804d = c15863x539d1b35;
        this.f220805e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15863x539d1b35 c15863x539d1b35 = this.f220804d;
        c15863x539d1b35.f220531f.f533176b.getLayoutParams().width = c15863x539d1b35.getWidth();
        c15863x539d1b35.f220531f.f533176b.getLayoutParams().height = c15863x539d1b35.getHeight();
        c15863x539d1b35.f220531f.f533176b.requestLayout();
        android.graphics.Bitmap bitmap = this.f220805e;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        c15863x539d1b35.f220531f.f533176b.setImageBitmap(bitmap);
    }
}
