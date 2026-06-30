package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes6.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.d f81689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.appbrand.jsapi.media.d dVar) {
        super(0);
        this.f81689d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        f25.n0 n0Var = (f25.n0) i95.n0.c(f25.n0.class);
        if (n0Var == null) {
            com.tencent.mars.xlog.Log.e(this.f81689d.f81751g, "audioFocusManager is null");
        }
        return n0Var;
    }
}
