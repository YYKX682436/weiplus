package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/profile/FinderProfileLayoutConfig$getItemConvertFactory$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.profile.FinderProfileLayoutConfig$getItemConvertFactory$1 */
/* loaded from: classes2.dex */
public final class C14867x938213d8 implements in5.s {

    /* renamed from: $extraMap */
    final /* synthetic */ yz5.l f36117x6dc7fb50;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.h f36118xcbdd23aa;

    public C14867x938213d8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.h hVar, yz5.l lVar) {
        this.f36118xcbdd23aa = hVar;
        this.f36117x6dc7fb50 = lVar;
    }

    @Override // in5.s
    /* renamed from: getItemConvert */
    public in5.r mo43555xf2bb75ea(int type) {
        in5.r rVar;
        boolean z17 = true;
        if (type != 4 && type != 9 && type != 2) {
            z17 = false;
        }
        if (!z17) {
            if (type == so2.c5.class.hashCode()) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xt();
            }
            yz5.l lVar = this.f36117x6dc7fb50;
            if (lVar != null && (rVar = (in5.r) lVar.mo146xb9724478(java.lang.Integer.valueOf(type))) != null) {
                return rVar;
            }
            this.f36118xcbdd23aa.getClass();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("FinderGridLayoutConfig", "type invalid", new java.lang.Object[0]);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.h hVar = this.f36118xcbdd23aa;
        if (!hVar.f204920f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.mt mtVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.mt();
            mtVar.A = java.lang.Boolean.valueOf(this.f36118xcbdd23aa.f204916b);
            return mtVar;
        }
        if (hVar.f204917c == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ft ftVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ft();
            ftVar.f184955q = java.lang.Boolean.valueOf(hVar.f204916b);
            return ftVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dt dtVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dt(hVar.f204918d, null, hVar.f204919e, hVar.f204921g, 2, null);
        dtVar.G = java.lang.Boolean.valueOf(hVar.f204916b);
        return dtVar;
    }
}
