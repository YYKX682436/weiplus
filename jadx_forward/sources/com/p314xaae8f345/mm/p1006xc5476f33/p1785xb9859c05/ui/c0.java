package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes12.dex */
public class c0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f224302d;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f224300b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(50);

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f224301c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f224299a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i6(5, "IPCallAddressAvatarLoader", 1, android.os.Looper.getMainLooper());

    public c0(android.content.Context context) {
        this.f224302d = context;
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0 c0Var, android.widget.ImageView imageView, java.lang.String str, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            c0Var.getClass();
        } else {
            c0Var.f224300b.put(str, new java.lang.ref.WeakReference(bitmap));
            c0Var.f224301c.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.b0(c0Var, imageView, str, bitmap));
        }
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        return str + "@" + str2 + "@contactId@username";
    }

    public void c(java.lang.String str, android.widget.ImageView imageView) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || imageView == null) {
            return;
        }
        java.lang.String str2 = str + "@contactId";
        imageView.setTag(str2);
        if (e(str + "@contactId", imageView)) {
            return;
        }
        this.f224299a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.z(this, str, imageView, str2));
    }

    public void d(java.lang.String str, java.lang.String str2, android.widget.ImageView imageView) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || imageView == null) {
            return;
        }
        java.lang.String b17 = b(str, str2);
        imageView.setTag(b17);
        if (e(b(str, str2), imageView)) {
            return;
        }
        this.f224299a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.x(this, str, b17, imageView, str2));
    }

    public final boolean e(java.lang.String str, android.widget.ImageView imageView) {
        android.graphics.Bitmap bitmap;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f224300b.get(str);
        if (weakReference == null || (bitmap = (android.graphics.Bitmap) weakReference.get()) == null || imageView.getTag() == null || !imageView.getTag().toString().equals(str)) {
            return false;
        }
        if (bitmap.isRecycled()) {
            return true;
        }
        imageView.setImageBitmap(bitmap);
        return true;
    }

    public void f(java.lang.String str, android.widget.ImageView imageView) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || imageView == null) {
            return;
        }
        java.lang.String str2 = str + "@username";
        imageView.setTag(str2);
        if (e(str + "@username", imageView)) {
            return;
        }
        this.f224299a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a0(this, str, imageView, str2));
    }
}
