package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

@j95.b
/* loaded from: classes6.dex */
public final class z6 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.k4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f229759d = kz5.c1.i(new jz5.l("MagicSclPublicService", com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.w6.f229724d), new jz5.l("MagicEcsPublicService", com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.x6.f229740d), new jz5.l("MagicAdPublicService", com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.y6.f229744d));

    public jc3.a0 wi(java.lang.String serviceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceId, "serviceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushPublicService", "providePublicServiceDelegate for ".concat(serviceId));
        yz5.a aVar = (yz5.a) this.f229759d.get(serviceId);
        jc3.a0 a0Var = aVar != null ? (jc3.a0) aVar.mo152xb9724478() : null;
        if (a0Var != null) {
            return a0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicBrushPublicService", "provide service delegate not found");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.v6();
    }
}
