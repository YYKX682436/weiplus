package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes13.dex */
public final class m implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnIndoorStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 f226380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 f226381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.g f226382c;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 c16293xe2a3baf2, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7, com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.g gVar) {
        this.f226380a = c16293xe2a3baf2;
        this.f226381b = interfaceC25945x718093f7;
        this.f226382c = gVar;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnIndoorStateChangeListener
    /* renamed from: onIndoorBuildingDeactivated */
    public boolean mo65975xf3e3a8aa() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CustomIndoorPicker", "onIndoorBuildingDeactivated, lat, lng(%s)", this.f226381b.mo98964x19b45a1b());
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 c16293xe2a3baf2 = this.f226380a;
        c16293xe2a3baf2.f226229m2 = 0;
        c16293xe2a3baf2.f226230n2 = null;
        c16293xe2a3baf2.f226231o2 = null;
        c16293xe2a3baf2.setVisibility(8);
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnIndoorStateChangeListener
    /* renamed from: onIndoorBuildingFocused */
    public boolean mo65976xa4a722b1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CustomIndoorPicker", "onIndoorBuildingFocused");
        this.f226380a.f226229m2 = 1;
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnIndoorStateChangeListener
    /* renamed from: onIndoorLevelActivated */
    public boolean mo65977xc2ec745f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4401x15ff5647 building) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(building, "building");
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4403x18de38d1> m37177x2328f865 = building.m37177x2328f865();
        java.lang.String m37175x3935e1d5 = building.m37175x3935e1d5();
        final com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 c16293xe2a3baf2 = this.f226380a;
        boolean equals = m37175x3935e1d5.equals(c16293xe2a3baf2.f226230n2);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7 = this.f226381b;
        if (!equals) {
            c16293xe2a3baf2.f226230n2 = building.m37175x3935e1d5();
            c16293xe2a3baf2.getClass();
            java.util.List<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4403x18de38d1> m37177x2328f8652 = building.m37177x2328f865();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m37177x2328f8652);
            for (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4403x18de38d1 c4403x18de38d1 : m37177x2328f8652) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4403x18de38d1);
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.i(c16293xe2a3baf2, c4403x18de38d1));
            }
            c16293xe2a3baf2.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.j(arrayList, new in5.s() { // from class: com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker$buildItemConverts$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.h(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2.this);
                }
            }));
            if (c16293xe2a3baf2.f226232p2 <= 20.0f) {
                c16293xe2a3baf2.setVisibility(0);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c16293xe2a3baf2.mo7946xf939df19();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker.IndoorLevelItem>");
            ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19).B = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.k(interfaceC25945x718093f7, c16293xe2a3baf2);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c16293xe2a3baf2.f226230n2, c16293xe2a3baf2.f226227k2) && c16293xe2a3baf2.f226231o2 == null && (str = c16293xe2a3baf2.f226228l2) != null) {
            c16293xe2a3baf2.f226231o2 = str;
            interfaceC25945x718093f7.mo98996x255ed3b7(c16293xe2a3baf2.f226230n2, str);
        } else if (!m37177x2328f865.isEmpty() && building.m37174xd84262ca() < m37177x2328f865.size()) {
            c16293xe2a3baf2.f226231o2 = m37177x2328f865.get(building.m37174xd84262ca()).m37182xfb82e301();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.g gVar = this.f226382c;
        if (gVar != null) {
            gVar.mo65971x3dcbea6f();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c16293xe2a3baf2.mo7946xf939df19();
        if (mo7946xf939df192 != null) {
            mo7946xf939df192.m8146xced61ae5();
        }
        c16293xe2a3baf2.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.l(c16293xe2a3baf2, building, m37177x2328f865), 200L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CustomIndoorPicker", "onIndoorLevelActivated: %s, poiFloor:%s, lat,lng:(%s)", building, c16293xe2a3baf2.f226231o2, interfaceC25945x718093f7.mo98964x19b45a1b());
        return false;
    }
}
