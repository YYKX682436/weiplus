package hb2;

/* loaded from: classes2.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f361611d;

    public p(com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00) {
        this.f361611d = c22801x87cbdc00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f361611d;
        android.view.View f294968x = c22801x87cbdc00.getF294968x();
        if (f294968x != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f294968x, arrayList.toArray(), "com/tencent/mm/plugin/finder/cgi/oplog/FinderModPersonalizedSetting$openPersonalizedSettingLoadMore$1$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f294968x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f294968x, "com/tencent/mm/plugin/finder/cgi/oplog/FinderModPersonalizedSetting$openPersonalizedSettingLoadMore$1$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c22801x87cbdc00.setTranslationY(0.0f - (c22801x87cbdc00.getRefreshHeader() != null ? r1.getMeasuredHeight() : 0));
        c22801x87cbdc00.x();
        c22801x87cbdc00.J(false);
    }
}
