package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class v2 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w2 f96118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.x2 f96120c;

    public v2(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.x2 x2Var, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w2 w2Var, java.lang.String str) {
        this.f96120c = x2Var;
        this.f96118a = w2Var;
        this.f96119b = str;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        if (i17 != 0 || i18 != 0 || (fVar = oVar.f70711b.f70700a) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceSessionMgr", "hy: get sessionkey fail,errType:" + i17 + ",errCode:" + i18);
            this.f96120c.a(i17, i18, str, null, false, this.f96118a);
            return;
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t2 t2Var = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t2();
        t2Var.f96097a = ((r45.hd3) fVar).f376064d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        t2Var.f96099c = android.os.SystemClock.elapsedRealtime();
        t2Var.f96098b = r12.f376066f;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceSessionMgr", "hy: getSession sessionKey: %s", t2Var);
        ((java.util.concurrent.ConcurrentHashMap) this.f96120c.f96130a).put(this.f96119b, t2Var);
        this.f96120c.a(0, 0, "", t2Var, true, this.f96118a);
    }
}
