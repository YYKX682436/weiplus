package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes7.dex */
public class e0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f68428a;

    public e0(com.tencent.mm.ipcinvoker.wx_extension.f0 f0Var, com.tencent.mm.ipcinvoker.r rVar) {
        this.f68428a = rVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper iPCRunCgiRespWrapper = new com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper();
        iPCRunCgiRespWrapper.f68455d = i17;
        iPCRunCgiRespWrapper.f68456e = i18;
        iPCRunCgiRespWrapper.f68457f = str;
        iPCRunCgiRespWrapper.f68458g = oVar;
        this.f68428a.a(iPCRunCgiRespWrapper);
    }
}
