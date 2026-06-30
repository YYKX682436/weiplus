package rf4;

/* loaded from: classes4.dex */
public final class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef f476632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f476633e;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef, java.util.List list) {
        this.f476632d = c18485x239212ef;
        this.f476633e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f476632d.f253534d.getLayoutManager();
        if (layoutManager != null) {
            int size = this.f476633e.size() - 1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(size));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryMsgListView$updateMsgList$2$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            layoutManager.mo2420xc593c771(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(layoutManager, "com/tencent/mm/plugin/story/ui/view/StoryMsgListView$updateMsgList$2$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
    }
}
