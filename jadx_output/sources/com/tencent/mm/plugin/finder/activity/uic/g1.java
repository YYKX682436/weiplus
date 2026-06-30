package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class g1 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.h1 f101875b;

    public g1(java.lang.String str, com.tencent.mm.plugin.finder.activity.uic.h1 h1Var) {
        this.f101874a = str;
        this.f101875b = h1Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.activity.uic.f1(this.f101875b));
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "[handleActivityProfileCover] [" + bitmap.getWidth() + ':' + bitmap.getHeight() + "] allocationByteCount=" + com.tencent.mm.sdk.platformtools.t8.f0(bitmap.getAllocationByteCount()) + " coverUrl=" + this.f101874a);
        }
    }
}
