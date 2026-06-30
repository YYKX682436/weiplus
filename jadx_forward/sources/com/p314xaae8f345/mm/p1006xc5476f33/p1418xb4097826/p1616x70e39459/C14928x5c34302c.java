package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1616x70e39459;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/redpacket/FinderRedPacketScaleLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.redpacket.FinderRedPacketScaleLayoutManager */
/* loaded from: classes4.dex */
public final class C14928x5c34302c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {
    public final void W() {
        float m8037x755bd410 = m8037x755bd410() / 2.0f;
        int m8008x3d79f549 = m8008x3d79f549();
        for (int i17 = 0; i17 < m8008x3d79f549; i17++) {
            android.view.View m8007x6a486239 = m8007x6a486239(i17);
            if (m8007x6a486239 != null) {
                float abs = 1 - ((java.lang.Math.abs(m8037x755bd410 - ((m8012x7f0ab3e8(m8007x6a486239) + m8015x62a22a5b(m8007x6a486239)) / 2.0f)) * 0.12f) / m8037x755bd410);
                m8007x6a486239.setScaleX(abs);
                m8007x6a486239.setScaleY(abs);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo2418x457c9b08(z2Var, h3Var);
        W();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int mo2419x96d40915 = super.mo2419x96d40915(i17, z2Var, h3Var);
        W();
        return mo2419x96d40915;
    }
}
