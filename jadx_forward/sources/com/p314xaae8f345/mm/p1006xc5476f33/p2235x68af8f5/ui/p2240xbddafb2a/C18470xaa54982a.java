package com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2240xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.story.ui.layout.AvatarLayoutManager */
/* loaded from: classes4.dex */
public final class C18470xaa54982a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {

    /* renamed from: v, reason: collision with root package name */
    public final int f253407v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18470xaa54982a(android.content.Context context, int i17) {
        super(context, i17, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f253407v = i65.a.b(context, 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public void P(int i17, int i18) {
        super.P(i17, i18);
        W();
    }

    public final void W() {
        int m8008x3d79f549 = m8008x3d79f549();
        for (int i17 = 0; i17 < m8008x3d79f549; i17++) {
            android.view.View m8007x6a486239 = m8007x6a486239(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m8007x6a486239);
            int top = (m8007x6a486239.getTop() + m8007x6a486239.getBottom()) / 2;
            int m8018x1c4fb41d = m8018x1c4fb41d() / 2;
            boolean z17 = true;
            if (m8007x6a486239.getMeasuredHeight() - java.lang.Math.abs(top - m8018x1c4fb41d) > this.f253407v) {
                float min = java.lang.Math.min(1 - (java.lang.Math.abs(r3) / (r5 - r6)), 1.0f);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(min));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m8007x6a486239, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                m8007x6a486239.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(m8007x6a486239, "com/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(m8007x6a486239, arrayList2.toArray(), "com/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                m8007x6a486239.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(m8007x6a486239, "com/tencent/mm/plugin/story/ui/layout/AvatarLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (1.0f - m8007x6a486239.getAlpha() >= 0.1f) {
                z17 = false;
            }
            m8007x6a486239.setSelected(z17);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo2418x457c9b08(z2Var, h3Var);
        W();
    }
}
