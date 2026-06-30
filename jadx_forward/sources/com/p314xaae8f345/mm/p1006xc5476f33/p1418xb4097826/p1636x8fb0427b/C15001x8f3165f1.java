package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/storage/FinderStaggeredConfig$getItemConvertFactory$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.storage.FinderStaggeredConfig$getItemConvertFactory$1 */
/* loaded from: classes2.dex */
public final class C15001x8f3165f1 implements in5.s {

    /* renamed from: $extraMap */
    final /* synthetic */ yz5.l f36222x6dc7fb50;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0 f36223xcbdd23aa;

    public C15001x8f3165f1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0 jj0Var, yz5.l lVar) {
        this.f36223xcbdd23aa = jj0Var;
        this.f36222x6dc7fb50 = lVar;
    }

    @Override // in5.s
    /* renamed from: getItemConvert */
    public in5.r mo43555xf2bb75ea(int type) {
        in5.r rVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0 jj0Var = this.f36223xcbdd23aa;
        yz5.l lVar = this.f36222x6dc7fb50;
        jj0Var.getClass();
        if (!(type == 3002 || type == 4) && type != 9) {
            if (type == 3001 || type == 2) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eh(jj0Var.f208549a, jj0Var.f208550b, null, null, 12, null);
            }
            if (type == -3) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ik();
            }
            if (type == -5) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xh();
            }
            if (type == -7) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zh();
            }
            if (type == -21) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x7();
            }
            if (type == -22) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e0(null, 1, null);
            }
            if (type == -23) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.v(jj0Var.f208549a, jj0Var.f208550b, null, null, 12, null);
            }
            if (type == 10002) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uo(jj0Var.f208549a, jj0Var.f208550b, null, null, 12, null);
            }
            if (type == 1) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
            if (type == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1.class.getName().hashCode()) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.y1(false, false, false, false, 15, null);
            }
            if (lVar != null && (rVar = (in5.r) lVar.mo146xb9724478(java.lang.Integer.valueOf(type))) != null) {
                return rVar;
            }
            hc2.l.a("FinderStaggeredConfig", type);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zk(jj0Var.f208549a, jj0Var.f208550b, null, null, 12, null);
    }
}
