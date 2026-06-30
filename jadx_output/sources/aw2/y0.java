package aw2;

/* loaded from: classes10.dex */
public final class y0 implements ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f14820d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Bundle f14821e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderChooseNewsView f14822f;

    /* renamed from: g, reason: collision with root package name */
    public int f14823g;

    public y0(com.tencent.mm.ui.MMActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f14820d = activity;
        android.view.View findViewById = activity.findViewById(com.tencent.mm.R.id.buf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f14822f = (com.tencent.mm.plugin.finder.view.FinderChooseNewsView) findViewById;
    }

    public final void a() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f14820d;
        android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.bue);
        g92.b bVar = g92.b.f269769e;
        m92.b j37 = g92.a.j3(bVar, xy2.c.e(mMActivity), false, 2, null);
        boolean z17 = ((((j37 != null ? j37.field_extFlag : 0) & 8192) != 0) || ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126409h).getValue()).r()).intValue() == 1) && this.f14823g == 0;
        int i17 = z17 ? 0 : 8;
        com.tencent.mm.plugin.finder.view.FinderChooseNewsView finderChooseNewsView = this.f14822f;
        finderChooseNewsView.setVisibility(i17);
        int i18 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderSetNewsFeedWidget", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/upload/postui/postwidget/FinderSetNewsFeedWidget", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m92.b j38 = g92.a.j3(bVar, xy2.c.e(mMActivity), false, 2, null);
        if ((((j38 != null ? j38.field_extFlag : 0) & 8192) != 0) && finderChooseNewsView.a()) {
            android.os.Bundle bundle = this.f14821e;
            if (bundle != null) {
                bundle.putInt("KEY_POST_OBJECT_TYPE", 1);
                return;
            }
            return;
        }
        android.os.Bundle bundle2 = this.f14821e;
        if (bundle2 != null) {
            bundle2.putInt("KEY_POST_OBJECT_TYPE", 0);
        }
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        kotlin.jvm.internal.o.g(account, "account");
        a();
    }
}
