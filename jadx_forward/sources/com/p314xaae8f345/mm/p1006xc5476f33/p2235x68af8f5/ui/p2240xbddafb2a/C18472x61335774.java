package com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2240xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/layout/IndicatorLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.story.ui.layout.IndicatorLayoutManager */
/* loaded from: classes4.dex */
public final class C18472x61335774 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18472x61335774(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo2418x457c9b08(recycler, state);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IndicatorLayoutManager", "onLayoutChildren: " + m8020x7e414b06() + ' ' + m8008x3d79f549());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int mo2419x96d40915 = super.mo2419x96d40915(i17, z2Var, h3Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IndicatorLayoutManager", "scrollHorizontallyBy: " + m8020x7e414b06() + ' ' + m8008x3d79f549());
        return mo2419x96d40915;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        int t17 = t();
        int x17 = x();
        if (i17 - t17 < 2) {
            super.mo2420xc593c771(i17 - 2);
        } else if (x17 - i17 < 2) {
            super.mo2420xc593c771(i17 + 2);
        }
    }
}
