package te2;

/* loaded from: classes8.dex */
public final class g9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.p8 f499573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f499574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f499575f;

    public g9(bm2.p8 p8Var, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f499573d = p8Var;
        this.f499574e = i17;
        this.f499575f = c1163xf1deaba4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm2.p8 p8Var = this.f499573d;
        if (p8Var.mo1894x7e414b06() != 0) {
            int mo1894x7e414b06 = p8Var.mo1894x7e414b06();
            int i17 = this.f499574e;
            if (i17 >= mo1894x7e414b06) {
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f499575f;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de == null) {
                return;
            }
            if (c1162x665295de.w() <= i17 && i17 <= c1162x665295de.y()) {
                p8Var.x(i17);
                return;
            }
            c1163xf1deaba4.i(new te2.f9(p8Var, i17));
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f499575f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba42, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelPresenter$scrollToPositionAndHighlight$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            c1163xf1deaba42.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba42, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelPresenter$scrollToPositionAndHighlight$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
