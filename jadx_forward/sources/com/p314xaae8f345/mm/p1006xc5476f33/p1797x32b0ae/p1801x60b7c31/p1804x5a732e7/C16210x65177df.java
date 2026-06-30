package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.q6$$d */
/* loaded from: classes5.dex */
public final /* synthetic */ class C16210x65177df implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q6 f225280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.function.BiConsumer f225281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f225282c;

    public /* synthetic */ C16210x65177df(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q6 q6Var, java.util.function.BiConsumer biConsumer, java.lang.Runnable runnable) {
        this.f225280a = q6Var;
        this.f225281b = biConsumer;
        this.f225282c = runnable;
    }

    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q6 q6Var = this.f225280a;
        java.lang.String C = q6Var.C(q6Var.f225263g, "[uploadImageToCDN] download http picture error");
        if (bitmap == null || bitmap.isRecycled()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(23449, C);
            this.f225282c.run();
        } else {
            this.f225281b.accept(com.p314xaae8f345.mm.vfs.w6.i(str2, false), bitmap);
        }
    }
}
