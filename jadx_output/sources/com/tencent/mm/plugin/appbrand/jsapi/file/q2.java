package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes8.dex */
public class q2 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a f81117d;

    public q2(com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a aVar) {
        this.f81117d = aVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ui.MMActivity activityContext;
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) obj;
        if (iPCInteger == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.OpenFileRequest", "fav ipc callback data null");
            return;
        }
        int i17 = iPCInteger.f68404d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenFileRequest", "fav result:%d", java.lang.Integer.valueOf(i17));
        activityContext = this.f81117d.getActivityContext();
        if (i17 == 0) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.file.p2(this, activityContext));
        }
    }
}
