package ws2;

/* loaded from: classes3.dex */
public final class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 f530671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f530672e;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14931xe48fc583 c14931xe48fc583, int i17) {
        this.f530671d = c14931xe48fc583;
        this.f530672e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14343x44b0b6f6 c14343x44b0b6f6 = this.f530671d.f206415h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f530672e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c14343x44b0b6f6, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$onLoadMoreResult$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        c14343x44b0b6f6.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c14343x44b0b6f6, "com/tencent/mm/plugin/finder/replay/FinderLiveReplayViewCallback$onLoadMoreResult$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
