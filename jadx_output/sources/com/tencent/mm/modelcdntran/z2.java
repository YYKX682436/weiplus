package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f71186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f71187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f71188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.l3 f71189g;

    public z2(com.tencent.mm.modelcdntran.l3 l3Var, java.lang.String str, int i17, int i18) {
        this.f71189g = l3Var;
        this.f71186d = str;
        this.f71187e = i17;
        this.f71188f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelcdntran.l3 l3Var = this.f71189g;
        java.util.HashMap hashMap = (java.util.HashMap) l3Var.f71063f;
        java.lang.String str = this.f71186d;
        dn.o oVar = (dn.o) hashMap.get(str);
        if (oVar != null) {
            com.tencent.mm.autogen.events.OnlineVideoEvent onlineVideoEvent = new com.tencent.mm.autogen.events.OnlineVideoEvent();
            am.hn hnVar = onlineVideoEvent.f54588g;
            hnVar.f6844a = 3;
            hnVar.f6845b = 0;
            hnVar.f6846c = str;
            int i17 = this.f71187e;
            hnVar.f6847d = i17;
            int i18 = this.f71188f;
            hnVar.f6848e = i18;
            onlineVideoEvent.e();
            if (i17 != 0 || i18 < oVar.G1) {
                return;
            }
            l3Var.l(t21.d3.i(oVar.E1, oVar.f241814b2, oVar.X1), oVar.G1, oVar.F1, oVar);
        }
    }
}
