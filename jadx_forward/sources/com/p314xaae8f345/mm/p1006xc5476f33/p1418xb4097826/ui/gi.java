package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class gi implements com.p314xaae8f345.mm.ui.p2740x696c9db.b9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractC15091x20e3bca0 f210835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingsUI f210836e;

    public gi(com.tencent.mm.plugin.finder.ui.FinderSettingsUI finderSettingsUI) {
        this.f210836e = finderSettingsUI;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String searchText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchText, "searchText");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractC15091x20e3bca0 abstractC15091x20e3bca0 = this.f210835d;
        if (abstractC15091x20e3bca0 == null) {
            return;
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.b(abstractC15091x20e3bca0).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15099x5c64104d.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15099x5c64104d c15099x5c64104d = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15099x5c64104d) a17;
        java.util.ArrayList arrayList = abstractC15091x20e3bca0.f210354t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (r26.n0.B(((lb2.j) obj).f399282d, searchText, true)) {
                arrayList2.add(obj);
            }
        }
        c15099x5c64104d.O6(arrayList2);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
        com.tencent.mm.plugin.finder.ui.FinderSettingsUI finderSettingsUI = this.f210836e;
        this.f210835d = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractC15091x20e3bca0) finderSettingsUI.f.get(finderSettingsUI.e);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void Z2() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractC15091x20e3bca0 abstractC15091x20e3bca0 = this.f210835d;
        if (abstractC15091x20e3bca0 == null) {
            return;
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.b(abstractC15091x20e3bca0).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15099x5c64104d.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15099x5c64104d) a17).O6(abstractC15091x20e3bca0.f210354t);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
    }
}
