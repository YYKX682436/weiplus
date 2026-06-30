package com.p314xaae8f345.mm.p2776x373aa5.p2781xdc9f1143;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/view/layoutmanager/Flip3DLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.layoutmanager.Flip3DLayoutManager */
/* loaded from: classes4.dex */
public final class C22827x44b5d205 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {

    /* renamed from: v, reason: collision with root package name */
    public final boolean f295137v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f295138w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22827x44b5d205(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f295137v = true;
        this.f295138w = true;
    }

    public final void W() {
        int m8008x3d79f549 = m8008x3d79f549();
        for (int i17 = 0; i17 < m8008x3d79f549; i17++) {
            android.view.View m8007x6a486239 = m8007x6a486239(i17);
            if (m8007x6a486239 != null) {
                float m8037x755bd410 = m8037x755bd410() / 2.0f;
                float left = ((((m8007x6a486239.getLeft() + m8007x6a486239.getRight()) / 2) - m8037x755bd410) / m8037x755bd410()) * 45.0f;
                m8007x6a486239.setPivotX(m8037x755bd410);
                m8007x6a486239.setPivotY(m8018x1c4fb41d() / 2.0f);
                if (left < 0.0f) {
                    m8007x6a486239.setPivotX(m8037x755bd410());
                } else {
                    m8007x6a486239.setPivotX(0.0f);
                }
                m8007x6a486239.setRotationY(left);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF180019n() {
        return super.getF180019n() && this.f295138w;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        return super.getF204840r() && this.f295137v;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutCompleted */
    public void mo7921x1c165a62(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7921x1c165a62(h3Var);
        W();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Flip3DLayoutManager", "onLayoutCompleted childCount:" + m8008x3d79f549());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int mo2419x96d40915 = super.mo2419x96d40915(i17, recycler, state);
        W();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Flip3DLayoutManager", "scrollHorizontallyBy childCount:" + m8008x3d79f549() + ", dx:" + i17);
        return mo2419x96d40915;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        super.mo2420xc593c771(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Flip3DLayoutManager", "scrollToPosition childCount:" + m8008x3d79f549() + ", position:" + i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        super.mo7942xd1b4653f(c1163xf1deaba4, h3Var, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Flip3DLayoutManager", "smoothScrollToPosition childCount:" + m8008x3d79f549() + ", position:" + i17);
    }
}
