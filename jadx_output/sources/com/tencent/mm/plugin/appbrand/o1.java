package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class o1 implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f86156a;

    public o1(com.tencent.mm.ipcinvoker.r rVar) {
        this.f86156a = rVar;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        com.tencent.mm.ipcinvoker.r rVar = this.f86156a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.BindRemoteServiceResult(i17, str));
        }
    }

    @Override // l81.v0
    public void onSuccess() {
        com.tencent.mm.ipcinvoker.r rVar = this.f86156a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.BindRemoteServiceResult(0, null, 2, null));
        }
    }
}
