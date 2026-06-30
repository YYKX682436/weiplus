package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class wc implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.yc f83728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f83729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f83730c;

    public wc(com.tencent.mm.plugin.appbrand.jsapi.yc ycVar, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f83728a = ycVar;
        this.f83729b = d0Var;
        this.f83730c = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.plugin.appbrand.jsapi.yc ycVar = this.f83728a;
        com.tencent.mars.xlog.Log.i(ycVar.f83944g, "sendRedCoverAppMsg errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int i19 = this.f83730c;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f83729b;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e(ycVar.f83944g, "send error");
            d0Var.a(i19, ycVar.o("fail:send error"));
            return;
        }
        if ((oVar != null ? oVar.f70711b.f70700a : null) instanceof r45.pz5) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SendShareCoverMsgResp");
            r45.pz5 pz5Var = (r45.pz5) fVar;
            com.tencent.mars.xlog.Log.i(ycVar.f83944g, "send result: " + pz5Var.f383502d);
            if (pz5Var.f383502d == 0) {
                d0Var.a(i19, ycVar.o("ok"));
            } else {
                d0Var.a(i19, ycVar.o("fail:send fail"));
            }
        }
    }
}
