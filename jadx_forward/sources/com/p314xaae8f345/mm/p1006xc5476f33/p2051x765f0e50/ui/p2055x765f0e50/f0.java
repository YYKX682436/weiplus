package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f242548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 f242550f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f242551g;

    public f0(android.graphics.Bitmap bitmap, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 i0Var, yz5.a aVar) {
        this.f242548d = bitmap;
        this.f242549e = str;
        this.f242550f = i0Var;
        this.f242551g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        android.graphics.Bitmap bitmap = this.f242548d;
        if (bitmap != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
            h0Var.f391656d = byteArrayOutputStream.toByteArray();
        }
        java.lang.Object obj = h0Var.f391656d;
        if (obj == null || ((byte[]) obj).length <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0 i0Var = this.f242550f;
        yz5.a aVar = this.f242551g;
        java.lang.String str = this.f242549e;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.o0(str, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e0(h0Var, str, i0Var, aVar));
    }
}
