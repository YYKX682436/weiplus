package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public final class g0 implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h0 f237763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j0 f237764e;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j0 j0Var) {
        this.f237763d = h0Var;
        this.f237764e = j0Var;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.h0 h0Var = this.f237763d;
        jz5.l lVar = (jz5.l) h0Var.f237771o.get(i17);
        if (lVar == null) {
            return;
        }
        java.lang.String str = h0Var.f237770n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad abstractC17080x95c906ad = h0Var.f237772p;
        h0Var.f237772p = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad) lVar.f384367e;
        if (abstractC17080x95c906ad != null) {
            abstractC17080x95c906ad.s0();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h0Var.f237772p, abstractC17080x95c906ad)) {
            return;
        }
        java.util.Iterator it = h0Var.f237771o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((jz5.l) obj).f384367e, abstractC17080x95c906ad)) {
                    break;
                }
            }
        }
        jz5.l lVar2 = (jz5.l) obj;
        java.lang.Integer num = lVar2 != null ? (java.lang.Integer) lVar2.f384366d : null;
        java.lang.String str2 = h0Var.f237770n;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPageSelected:");
        java.lang.Object obj2 = lVar.f384366d;
        sb6.append(((java.lang.Number) obj2).intValue());
        sb6.append(" unselected:");
        sb6.append(num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.AbstractC17080x95c906ad abstractC17080x95c906ad2 = h0Var.f237772p;
        if (abstractC17080x95c906ad2 != null) {
            abstractC17080x95c906ad2.t0();
        }
        bundle.putInt("key_page_to_select", i17);
        this.f237764e.j(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.i0.f237777d, bundle);
        h0Var.r(((java.lang.Number) obj2).intValue());
    }
}
