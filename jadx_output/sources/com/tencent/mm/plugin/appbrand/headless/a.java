package com.tencent.mm.plugin.appbrand.headless;

/* loaded from: classes7.dex */
public final class a implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f78282a;

    public a(com.tencent.mm.ipcinvoker.r rVar) {
        this.f78282a = rVar;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        com.tencent.mm.ipcinvoker.r rVar = this.f78282a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceResult(i17, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l81.v0
    public void onSuccess() {
        com.tencent.mm.ipcinvoker.r rVar = this.f78282a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceResult(0, null, 2, 0 == true ? 1 : 0));
        }
    }
}
