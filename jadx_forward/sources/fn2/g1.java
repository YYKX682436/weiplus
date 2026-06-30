package fn2;

/* loaded from: classes8.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.h1 f345795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f345796e;

    public g1(fn2.h1 h1Var, int i17) {
        this.f345795d = h1Var;
        this.f345796e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fn2.h1 h1Var = this.f345795d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = h1Var.m129816x2fa4312f().getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            return;
        }
        int w17 = c1162x665295de.w();
        int y17 = c1162x665295de.y();
        int i17 = this.f345796e;
        if (w17 <= i17 && i17 <= y17) {
            h1Var.m129816x2fa4312f().post(new fn2.d1(h1Var, i17));
            return;
        }
        h1Var.m129816x2fa4312f().i(new fn2.f1(h1Var, i17));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m129816x2fa4312f = h1Var.m129816x2fa4312f();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m129816x2fa4312f, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestedSongPlayListTabView$scrollToPositionAndHighlight$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        m129816x2fa4312f.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m129816x2fa4312f, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestedSongPlayListTabView$scrollToPositionAndHighlight$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
