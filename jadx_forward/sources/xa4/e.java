package xa4;

/* loaded from: classes2.dex */
public final class e implements db5.u4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f534360a;

    public e(android.content.Context context) {
        this.f534360a = context;
    }

    @Override // db5.u4
    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMenuItemViewCustomize", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic$createPostSheetSpringMenuItem$1");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemViewCustomize", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic$createPostSheetSpringMenuItem$1");
            return;
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.obc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        textView.post(new xa4.d(this.f534360a, textView, (android.widget.TextView) findViewById2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemViewCustomize", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic$createPostSheetSpringMenuItem$1");
    }
}
