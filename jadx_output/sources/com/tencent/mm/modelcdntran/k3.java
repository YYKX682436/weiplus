package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f71032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f71033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f71034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.l3 f71035g;

    public k3(com.tencent.mm.modelcdntran.l3 l3Var, java.lang.String str, int i17, int i18) {
        this.f71035g = l3Var;
        this.f71032d = str;
        this.f71033e = i17;
        this.f71034f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap = (java.util.HashMap) this.f71035g.f71063f;
        java.lang.String str = this.f71032d;
        dn.o oVar = (dn.o) hashMap.get(str);
        if (oVar != null) {
            dn.n nVar = oVar.f241815c2;
            int i17 = this.f71034f;
            int i18 = this.f71033e;
            if (nVar != null) {
                nVar.onDataAvailable(this.f71032d, i18, i17);
            }
            com.tencent.mm.autogen.events.OnlineVideoEvent onlineVideoEvent = new com.tencent.mm.autogen.events.OnlineVideoEvent();
            am.hn hnVar = onlineVideoEvent.f54588g;
            hnVar.f6844a = 2;
            hnVar.f6845b = 0;
            hnVar.f6846c = str;
            hnVar.f6847d = i18;
            hnVar.f6848e = i17;
            onlineVideoEvent.e();
        }
    }
}
