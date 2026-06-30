package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/nearby/video/NearbyVideoStaggeredConfig$getItemConvertFactory$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoStaggeredConfig$getItemConvertFactory$1 */
/* loaded from: classes2.dex */
public final class C14593xef64c5b implements in5.s {

    /* renamed from: $extraMap */
    final /* synthetic */ yz5.l f36106x6dc7fb50;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.r f36107xcbdd23aa;

    public C14593xef64c5b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.r rVar, yz5.l lVar) {
        this.f36107xcbdd23aa = rVar;
        this.f36106x6dc7fb50 = lVar;
    }

    @Override // in5.s
    /* renamed from: getItemConvert */
    public in5.r mo43555xf2bb75ea(int type) {
        in5.r rVar;
        if (type != 2) {
            if (type != 4) {
                if (type == 9) {
                    return new ep2.l(this.f36107xcbdd23aa.f203748a);
                }
                if (type != 3001) {
                    if (type != 3002) {
                        yz5.l lVar = this.f36106x6dc7fb50;
                        if (lVar != null && (rVar = (in5.r) lVar.mo146xb9724478(java.lang.Integer.valueOf(type))) != null) {
                            return rVar;
                        }
                        this.f36107xcbdd23aa.getClass();
                        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("FinderGridLayoutConfig", "type invalid", new java.lang.Object[0]);
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                    }
                }
            }
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.o(this.f36107xcbdd23aa);
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.p(this.f36107xcbdd23aa);
    }
}
