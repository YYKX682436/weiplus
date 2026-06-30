package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationFragment */
/* loaded from: classes2.dex */
public final class C13953x94bb063b extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 {
    public C13953x94bb063b() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        int ordinal = y0().ordinal();
        if (ordinal == 0) {
            return com.p314xaae8f345.mm.R.C30864xbddafb2a.aiz;
        }
        if (ordinal == 1) {
            return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570613ee1;
        }
        throw new jz5.j();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0 */
    public java.util.Set getF204828n() {
        int ordinal = y0().ordinal();
        if (ordinal == 0) {
            return kz5.o1.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lh.class);
        }
        if (ordinal == 1) {
            return kz5.o1.c(dv2.j1.class);
        }
        throw new jz5.j();
    }

    public final dv2.i y0() {
        java.lang.String string;
        java.lang.Object m143895xf1229813;
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        if (m7436x8619eaa0 != null && (string = m7436x8619eaa0.getString("key_aggregation_tab")) != null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(dv2.i.m126287xdce0328(string));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                m143895xf1229813 = null;
            }
            dv2.i iVar = (dv2.i) m143895xf1229813;
            if (iVar != null) {
                return iVar;
            }
        }
        return dv2.i.f325398e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13953x94bb063b(dv2.i aggregationTab) {
        this();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aggregationTab, "aggregationTab");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_aggregation_tab", aggregationTab.name());
        mo7562xe26dab14(bundle);
    }
}
