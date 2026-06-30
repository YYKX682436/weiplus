package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig$getItemConvertFactory$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.storage.FinderLbsStaggeredConfig$getItemConvertFactory$1 */
/* loaded from: classes2.dex */
public final class C14996xe4fd8980 implements in5.s {

    /* renamed from: $extraMap */
    final /* synthetic */ yz5.l f36214x6dc7fb50;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.s90 f36215xcbdd23aa;

    public C14996xe4fd8980(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.s90 s90Var, yz5.l lVar) {
        this.f36215xcbdd23aa = s90Var;
        this.f36214x6dc7fb50 = lVar;
    }

    @Override // in5.s
    /* renamed from: getItemConvert */
    public in5.r mo43555xf2bb75ea(int type) {
        in5.r rVar;
        if (type == -5) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xh();
        }
        if (type == -3) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ik();
        }
        if (type != 2) {
            if (type != 4 && type != 9) {
                if (type == 2003) {
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f36215xcbdd23aa.f209067a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th(null, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), 2);
                }
                if (type != 3001) {
                    if (type != 3002) {
                        yz5.l lVar = this.f36214x6dc7fb50;
                        if (lVar != null && (rVar = (in5.r) lVar.mo146xb9724478(java.lang.Integer.valueOf(type))) != null) {
                            return rVar;
                        }
                        this.f36215xcbdd23aa.getClass();
                        hc2.l.a("FinderLbsStaggeredConfig", type);
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                    }
                }
            }
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.p90(this.f36215xcbdd23aa);
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.q90(this.f36215xcbdd23aa);
    }
}
