package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes15.dex */
public class c1 implements kx5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 f148661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f148662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.d1 f148663c;

    public c1(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.d1 d1Var, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, long j17) {
        this.f148663c = d1Var;
        this.f148661a = c3712x3ed8a441;
        this.f148662b = j17;
    }

    @Override // kx5.k
    public void a() {
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.d1 d1Var = this.f148663c;
        java.util.Map map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) d1Var.f148678h.f148711p).get(d1Var.f148674d.f442208a);
        if (map != null && map.get(d1Var.f148675e) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppFeatureService", "preloadLiteApp second, ignore! appId:%s page:%s", d1Var.f148674d.f442208a, d1Var.f148675e);
            return;
        }
        int c17 = d1Var.f148674d.f442212e ? kx5.n.h().c() : kx5.n.h().o(true, null);
        java.lang.String str = d1Var.f148674d.f442208a;
        java.lang.String str2 = d1Var.f148675e;
        java.lang.String str3 = d1Var.f148676f;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 = this.f148661a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65420xd9c4f04e(str, str2, str3, c3712x3ed8a441.f14369x346425, c3712x3ed8a441.f14372xa8503287, c17, this.f148662b);
        com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i.Ai(d1Var.f148678h, d1Var.f148674d, c17, this.f148662b, d1Var.f148677g, c3712x3ed8a441.f14369x346425, c3712x3ed8a441.f14372xa8503287, d1Var.f148676f);
    }
}
