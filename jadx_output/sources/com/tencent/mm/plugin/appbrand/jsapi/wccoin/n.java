package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* loaded from: classes.dex */
public final class n implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.wccoin.o f83773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f83774b;

    public n(com.tencent.mm.plugin.appbrand.jsapi.wccoin.o oVar, com.tencent.mm.ipcinvoker.r rVar) {
        this.f83773a = oVar;
        this.f83774b = rVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f83773a.f83775d, "[WeCoin] getWeCoinBalance onFailed,errorType:" + i17 + ",errorCode:" + i18 + ",msg:" + str);
        this.f83774b.a(new com.tencent.mm.ipcinvoker.type.IPCLong(-1L));
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        r45.fs3 data = (r45.fs3) obj;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i(this.f83773a.f83775d, "[WeCoin] getWeCoinBalance onSuccess,data:" + data);
        this.f83774b.a(new com.tencent.mm.ipcinvoker.type.IPCLong(data.f374585d));
    }
}
