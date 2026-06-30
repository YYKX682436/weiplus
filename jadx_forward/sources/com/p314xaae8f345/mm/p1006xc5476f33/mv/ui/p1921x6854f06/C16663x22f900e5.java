package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.shake.MusicShakeLyricLayoutManager */
/* loaded from: classes4.dex */
public final class C16663x22f900e5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {

    /* renamed from: v, reason: collision with root package name */
    public final int f232455v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C16663x22f900e5(android.content.Context r1, int r2, boolean r3, int r4, p3321xbce91901.jvm.p3324x21ffc6bd.i r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 1
        L5:
            r4 = r4 & 4
            r5 = 0
            if (r4 == 0) goto Lb
            r3 = r5
        Lb:
            java.lang.String r4 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r4)
            r0.<init>(r1, r2, r3)
            int r1 = i65.a.b(r1, r5)
            r0.f232455v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.C16663x22f900e5.<init>(android.content.Context, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    public final void W() {
        int m8008x3d79f549 = m8008x3d79f549();
        for (int i17 = 0; i17 < m8008x3d79f549; i17++) {
            android.view.View m8007x6a486239 = m8007x6a486239(i17);
            if (m8007x6a486239 != null) {
                int top = (m8007x6a486239.getTop() + m8007x6a486239.getBottom()) / 2;
                int m8018x1c4fb41d = m8018x1c4fb41d() / 2;
                int measuredHeight = m8007x6a486239.getMeasuredHeight();
                android.view.View findViewById = m8007x6a486239.findViewById(com.p314xaae8f345.mm.R.id.j7m);
                android.widget.TextView textView = findViewById instanceof android.widget.TextView ? (android.widget.TextView) findViewById : null;
                if ((textView != null ? textView.getLineCount() : 0) > 1) {
                    measuredHeight /= 2;
                    top = (top + m8007x6a486239.getBottom()) / 2;
                }
                if (measuredHeight - java.lang.Math.abs(top - m8018x1c4fb41d) > this.f232455v) {
                    float min = java.lang.Math.min(1 - (java.lang.Math.abs(r3) / (measuredHeight - r6)), 1.0f);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(min));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(m8007x6a486239, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    m8007x6a486239.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(m8007x6a486239, "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(m8007x6a486239, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    m8007x6a486239.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(m8007x6a486239, "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutCompleted */
    public void mo7921x1c165a62(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7921x1c165a62(h3Var);
        W();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int mo7922xd8d712a7 = super.mo7922xd8d712a7(i17, z2Var, h3Var);
        W();
        return mo7922xd8d712a7;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.u(recyclerView.getContext());
        uVar.f93582a = i17;
        m8099x6305639d(uVar);
    }
}
