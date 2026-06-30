package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class r0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f67260d;

    public r0(com.tencent.mm.feature.lite.i iVar, q80.f0 f0Var) {
        this.f67260d = f0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        boolean z17 = ((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d;
        q80.f0 f0Var = this.f67260d;
        if (z17) {
            f0Var.fail();
        } else {
            f0Var.success();
        }
    }
}
