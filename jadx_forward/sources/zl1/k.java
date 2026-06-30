package zl1;

/* loaded from: classes7.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zl1.t f555129d;

    public k(zl1.t tVar) {
        this.f555129d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zl1.t tVar = this.f555129d;
        tVar.f(tVar.f555149e.indexOfChild(view));
        zl1.s sVar = tVar.f555156o;
        if (sVar != null) {
            int i17 = tVar.f555155n;
            java.lang.String str = ((zl1.r) tVar.f555153i.get(i17)).f555138a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.c2 c2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.c2) sVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var = c2Var.f167992b;
            if (y1Var.m52223xe6eebdcb().v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.SWITCH_TAB)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 m52223xe6eebdcb = y1Var.m52223xe6eebdcb();
                m52223xe6eebdcb.getClass();
                m52223xe6eebdcb.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o4(m52223xe6eebdcb, str, null, null));
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("pagePath", str);
                hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, ((k91.o) c2Var.f167991a.f387222g.get(i17)).f387231b);
                hashMap.put(ya.b.f77479x42930b2, java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = y1Var.mo14682x9dee9c37();
                if (mo14682x9dee9c37 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i2 i2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i2();
                    i2Var.t(hashMap);
                    mo14682x9dee9c37.i(i2Var, null);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMultiplePage", "can not switchTab in current page environment");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
