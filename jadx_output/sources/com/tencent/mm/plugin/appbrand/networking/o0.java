package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes7.dex */
public class o0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f86118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.networking.p0 f86119b;

    public o0(com.tencent.mm.plugin.appbrand.networking.p0 p0Var, km5.b bVar) {
        this.f86119b = p0Var;
        this.f86118a = bVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.plugin.appbrand.networking.p pVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCgiServiceWC", "syncPipeline cgi[%s] errType[%d] errCode[%d] errMsg[%s]", this.f86119b.f86125b, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        boolean z17 = fVar instanceof r45.ny3;
        km5.b bVar = this.f86118a;
        if (!z17) {
            bVar.a(new java.lang.Exception(java.lang.String.format(java.util.Locale.ENGLISH, "Invalid ResponseProtoBuf, %d %d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str)));
            return;
        }
        boolean a17 = th1.a.a(i17, i18, fVar);
        com.tencent.mm.modelbase.n nVar = oVar.f70711b;
        if (a17) {
            bVar.c(nVar.f70700a);
            return;
        }
        switch (i17) {
            case 0:
            case 4:
                pVar = new com.tencent.mm.plugin.appbrand.networking.p(com.tencent.mm.plugin.appbrand.networking.o.SERVER, i18, str, nVar.f70700a);
                break;
            case 1:
            case 2:
            case 7:
            case 8:
                pVar = new com.tencent.mm.plugin.appbrand.networking.p(com.tencent.mm.plugin.appbrand.networking.o.NETWORK, i18, str, null);
                break;
            case 3:
            default:
                pVar = new com.tencent.mm.plugin.appbrand.networking.p(com.tencent.mm.plugin.appbrand.networking.o.SEND, i18, str, null);
                break;
            case 5:
                pVar = new com.tencent.mm.plugin.appbrand.networking.p(com.tencent.mm.plugin.appbrand.networking.o.DECODE, i18, str, null);
                break;
            case 6:
                pVar = new com.tencent.mm.plugin.appbrand.networking.p(com.tencent.mm.plugin.appbrand.networking.o.ENCODE, i18, str, null);
                break;
        }
        bVar.a(pVar);
    }
}
