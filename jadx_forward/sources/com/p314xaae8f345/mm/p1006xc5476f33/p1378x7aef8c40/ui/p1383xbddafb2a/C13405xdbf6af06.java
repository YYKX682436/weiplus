package com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1383xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.layout.StickerLayoutManager */
/* loaded from: classes4.dex */
public final class C13405xdbf6af06 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {

    /* renamed from: v, reason: collision with root package name */
    public final int f180321v;

    /* renamed from: w, reason: collision with root package name */
    public final int f180322w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13405xdbf6af06(android.content.Context context, int i17) {
        super(context, i17, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f180321v = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561886ve);
        this.f180322w = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
    }

    public final void W() {
        int m8008x3d79f549 = m8008x3d79f549();
        for (int i17 = 0; i17 < m8008x3d79f549; i17++) {
            android.view.View m8007x6a486239 = m8007x6a486239(i17);
            if (m8007x6a486239 != null) {
                int m8032xa86cd69f = m8032xa86cd69f(m8007x6a486239);
                int left = (m8007x6a486239.getLeft() + m8007x6a486239.getRight()) / 2;
                int m8037x755bd410 = m8037x755bd410() / 2;
                int right = m8007x6a486239.getRight() - m8007x6a486239.getLeft();
                if (m8032xa86cd69f == m8020x7e414b06() - 1 || java.lang.Math.abs(left - m8037x755bd410) < right / 2) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(m8007x6a486239, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    m8007x6a486239.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(m8007x6a486239, "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(java.lang.Float.valueOf(0.3f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(m8007x6a486239, arrayList2.toArray(), "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    m8007x6a486239.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(m8007x6a486239, "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "updateChild", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo2418x457c9b08(recycler, state);
        W();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int mo2419x96d40915 = super.mo2419x96d40915(i17, recycler, state);
        W();
        return mo2419x96d40915;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        int m8037x755bd410 = ((m8037x755bd410() - this.f180321v) / 2) - this.f180322w;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(m8037x755bd410));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(this, "com/tencent/mm/plugin/emojicapture/ui/layout/StickerLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        android.content.Context context = recyclerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        e32.a aVar = new e32.a(context);
        aVar.f93582a = i17;
        m8099x6305639d(aVar);
    }
}
