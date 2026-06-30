package gr2;

/* loaded from: classes10.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 f356313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 c14572x50388393) {
        super(0);
        this.f356313d = c14572x50388393;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 c14572x50388393 = this.f356313d;
        boolean z18 = c14572x50388393.f203690v;
        java.util.LinkedHashMap linkedHashMap = c14572x50388393.f203679h;
        if (z18) {
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                android.view.View findViewById = ((android.view.View) ((java.util.Map.Entry) it.next()).getValue()).findViewById(com.p314xaae8f345.mm.R.id.rtz);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = findViewById instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502) findViewById : null;
                if (c14246xaa893502 != null) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502.f193250o;
                    c14246xaa893502.e(false);
                }
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
            for (java.util.Map.Entry entry : c14572x50388393.f203677f.entrySet()) {
                int i18 = ((km2.q) entry.getValue()).f390724v;
                android.view.View view = (android.view.View) linkedHashMap.get(entry.getKey());
                android.view.View findViewById2 = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.rtz) : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa8935022 = findViewById2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502) findViewById2 : null;
                if (c14246xaa8935022 != null) {
                    z17 = true;
                    if (pm0.v.z(i18, 1)) {
                        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502.f193250o;
                        c14246xaa8935022.e(false);
                    } else {
                        c14246xaa8935022.m56876x52d2f021(c14572x50388393.f203682n);
                        c14246xaa8935022.d();
                        sb6.append(((java.lang.String) entry.getKey()) + '=' + z17 + ',');
                    }
                }
                z17 = false;
                sb6.append(((java.lang.String) entry.getKey()) + '=' + z17 + ',');
            }
            sb6.append("]");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393.s(c14572x50388393, "updateWaveView: " + ((java.lang.Object) sb6), 0, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
