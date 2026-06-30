package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/view/FinderSnsHeaderView$buildItemCoverts$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderSnsHeaderView$buildItemCoverts$1 */
/* loaded from: classes2.dex */
public final class C15347x74cf32c2 implements in5.s {

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15346x1cf713c4 f36321xcbdd23aa;

    public C15347x74cf32c2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15346x1cf713c4 c15346x1cf713c4) {
        this.f36321xcbdd23aa = c15346x1cf713c4;
    }

    @Override // in5.s
    /* renamed from: getItemConvert */
    public in5.r mo43555xf2bb75ea(int type) {
        if (type == 2004) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ev();
        }
        if (type != 2015) {
            hc2.l.a(this.f36321xcbdd23aa.f212993d, type);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.hx hxVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.hx();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15346x1cf713c4 c15346x1cf713c4 = this.f36321xcbdd23aa;
        hxVar.f185159e = 1;
        float min = (java.lang.Math.min(c15346x1cf713c4.getContext().getResources().getDisplayMetrics().heightPixels, c15346x1cf713c4.getContext().getResources().getDisplayMetrics().widthPixels) - i65.a.b(c15346x1cf713c4.getContext(), 16)) / 3.5f;
        if (min <= 0.0f) {
            min = c15346x1cf713c4.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.by);
        }
        hxVar.f185160f = (int) ((min * 4) / 3);
        return hxVar;
    }
}
