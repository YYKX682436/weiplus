package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1665x5c28046;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/emoji/FinderEmojiLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.emoji.FinderEmojiLayoutManager */
/* loaded from: classes10.dex */
public final class C15397x72e15563 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d {
    public final android.graphics.Rect D;

    public C15397x72e15563(android.content.Context context, int i17) {
        super(context, i17);
        this.D = new android.graphics.Rect();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        return false;
    }

    public final void e0() {
        android.graphics.Rect rect = this.D;
        if (rect.isEmpty()) {
            return;
        }
        android.graphics.Rect rect2 = new android.graphics.Rect();
        int m8008x3d79f549 = m8008x3d79f549();
        for (int i17 = 0; i17 < m8008x3d79f549; i17++) {
            android.view.View m8007x6a486239 = m8007x6a486239(i17);
            if (m8007x6a486239 != null) {
                float f17 = 1.0f;
                if (m8021xcdaf1228(m8007x6a486239) != 1) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(m8007x6a486239, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/emoji/FinderEmojiLayoutManager", "updateChildren", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    m8007x6a486239.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(m8007x6a486239, "com/tencent/mm/plugin/finder/view/emoji/FinderEmojiLayoutManager", "updateChildren", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    m8007x6a486239.setEnabled(true);
                } else {
                    m8011x8b74aca9(m8007x6a486239, rect2);
                    int m8015x62a22a5b = m8015x62a22a5b(m8007x6a486239);
                    int m8010xd6b039cc = m8010xd6b039cc(m8007x6a486239);
                    if (m8015x62a22a5b > rect.left && m8010xd6b039cc > rect.top) {
                        f17 = 1.0f - ((m8010xd6b039cc - rect.top) / ((m8010xd6b039cc - m8016xfbd72d54(m8007x6a486239)) * 0.4f));
                    }
                    float f18 = f17;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(java.lang.Float.valueOf(f18));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(m8007x6a486239, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/emoji/FinderEmojiLayoutManager", "updateChildren", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    m8007x6a486239.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(m8007x6a486239, "com/tencent/mm/plugin/finder/view/emoji/FinderEmojiLayoutManager", "updateChildren", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    m8007x6a486239.setEnabled(((double) f18) > 0.7d);
                }
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo2418x457c9b08(z2Var, h3Var);
        e0();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int mo2419x96d40915 = super.mo2419x96d40915(i17, z2Var, h3Var);
        e0();
        return mo2419x96d40915;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int mo7922xd8d712a7 = super.mo7922xd8d712a7(i17, z2Var, h3Var);
        e0();
        return mo7922xd8d712a7;
    }
}
