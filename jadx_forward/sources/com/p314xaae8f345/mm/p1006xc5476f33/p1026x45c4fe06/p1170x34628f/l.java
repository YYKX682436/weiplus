package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ya {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a f168374a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a aVar, android.content.Context context) {
        super(context);
        this.f168374a = aVar;
    }

    public final float a() {
        xi1.g gVar;
        if (this.f168374a.J() != null) {
            gVar = this.f168374a.J().mo48803xee5260a9();
        } else if (this.f168374a.F() != null) {
            gVar = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) this.f168374a.F()).mo50261xee5260a9();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.AbstractMPPageViewRenderer", "__DeviceInfo.widthFromMetricsInDP() null window");
            gVar = null;
        }
        return (float) java.lang.Math.ceil((gVar != null ? gVar.mo48807xad90d981().widthPixels : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics().widthPixels) / m52252xebd2e91b());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ya
    @android.webkit.JavascriptInterface
    /* renamed from: getWidth */
    public float mo52193x755bd410() {
        try {
            float a17 = a();
            float ceil = (float) java.lang.Math.ceil(this.f168374a.f167904f.getWidth() / super.m52252xebd2e91b());
            if (ceil > 0.0f && ceil != a17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.AbstractMPPageViewRenderer", "__deviceInfo.getWidth(), resources[%f] != view[%f], may in pad env", java.lang.Float.valueOf(a17), java.lang.Float.valueOf(ceil));
            }
            return a17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.AbstractMPPageViewRenderer", th6, "__DeviceInfo.getWidth()", new java.lang.Object[0]);
            throw th6;
        }
    }
}
