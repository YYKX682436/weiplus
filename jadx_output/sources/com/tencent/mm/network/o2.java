package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f72095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f72096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.q2 f72097f;

    public o2(com.tencent.mm.network.q2 q2Var, int i17, int i18) {
        this.f72097f = q2Var;
        this.f72095d = i17;
        this.f72096e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.tencent.paymars.mm.MMStnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.mm.MMStnManager.class)).reportCGIServerError(this.f72095d, this.f72096e);
    }
}
