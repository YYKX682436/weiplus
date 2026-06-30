package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f80439d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f80440e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f80441f;

    /* renamed from: g, reason: collision with root package name */
    public int f80442g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f80443h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f80444i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.r0 f80445m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f80446n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.service.c0 c0Var, com.tencent.mm.plugin.appbrand.jsapi.chattool.r0 r0Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f80443h = jSONObject;
        this.f80444i = c0Var;
        this.f80445m = r0Var;
        this.f80446n = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.chattool.q0(this.f80443h, this.f80444i, this.f80445m, this.f80446n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.chattool.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(1:2)|(1:(3:5|6|7)(2:28|29))(2:30|(2:32|(4:34|(13:39|(4:41|(1:43)(1:49)|(2:45|46)(1:48)|47)|50|9|(1:11)(1:27)|(1:13)(1:26)|14|15|16|17|18|19|20)|51|(1:53)(1:54))(2:55|56))(2:57|58))|8|9|(0)(0)|(0)(0)|14|15|16|17|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ee, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f0, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.chattool.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
