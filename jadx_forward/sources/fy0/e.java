package fy0;

/* loaded from: classes5.dex */
public final class e implements fy0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 f348713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bx0.h f348714b;

    public e(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 abstractC11003x25486817, bx0.h hVar) {
        this.f348713a = abstractC11003x25486817;
        this.f348714b = hVar;
    }

    public void a(int i17, int i18, boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de layoutManager = this.f348713a.getLayoutManager();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/widgets/timelineview/BaseTimelineView$init$scrollHelper$1", "scrollToPositionWithOffset", "(IIZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        layoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(layoutManager, "com/tencent/mm/mj_publisher/finder/widgets/timelineview/BaseTimelineView$init$scrollHelper$1", "scrollToPositionWithOffset", "(IIZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }
}
