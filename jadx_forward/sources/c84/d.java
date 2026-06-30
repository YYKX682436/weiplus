package c84;

/* loaded from: classes4.dex */
public class d extends bh5.l {

    /* renamed from: e, reason: collision with root package name */
    public boolean f121238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, int i17) {
        super(context, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // bh5.l, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ad.widget.MMAdFullScreenDialog");
        super.onCreate(bundle);
        if (this.f121238e) {
            android.view.Window window = getWindow();
            android.view.WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
            if (attributes != null) {
                attributes.windowAnimations = 0;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ad.widget.MMAdFullScreenDialog");
    }
}
