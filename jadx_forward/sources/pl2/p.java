package pl2;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl2.s f438176d;

    public p(pl2.s sVar) {
        this.f438176d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pl2.s sVar = this.f438176d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c17 = sVar.c();
        int i17 = sVar.f438190l;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$mount$3", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        c17.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c17, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$mount$3", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
