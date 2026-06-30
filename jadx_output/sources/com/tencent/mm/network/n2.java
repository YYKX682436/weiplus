package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f72088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f72089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.q2 f72090f;

    public n2(com.tencent.mm.network.q2 q2Var, int i17, int i18) {
        this.f72090f = q2Var;
        this.f72088d = i17;
        this.f72089e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).reportCGIServerError(this.f72088d, this.f72089e);
    }
}
