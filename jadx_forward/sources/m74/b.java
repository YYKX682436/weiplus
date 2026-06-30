package m74;

/* loaded from: classes4.dex */
public class b extends android.widget.PopupWindow implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.PopupWindow.OnDismissListener f406048d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f406049e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f406050f;

    public b(android.content.Context context) {
        super(context);
        super.setOnDismissListener(this);
        this.f406050f = context;
    }

    public void a(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dimBehind", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
        try {
            android.view.View rootView = getContentView().getRootView();
            android.view.WindowManager windowManager = (android.view.WindowManager) this.f406050f.getSystemService("window");
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) rootView.getLayoutParams();
            layoutParams.flags |= 2;
            layoutParams.dimAmount = f17;
            windowManager.updateViewLayout(rootView, layoutParams);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FeedbackPopupWindow", "the window dim account is set failed!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dimBehind", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        android.widget.PopupWindow.OnDismissListener onDismissListener;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
        try {
            super.dismiss();
        } catch (java.lang.Throwable unused) {
            if (!this.f406049e && (onDismissListener = this.f406048d) != null) {
                onDismissListener.onDismiss();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
        try {
            this.f406049e = true;
            android.widget.PopupWindow.OnDismissListener onDismissListener = this.f406048d;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
    }

    @Override // android.widget.PopupWindow
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnDismissListener", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
        this.f406048d = onDismissListener;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnDismissListener", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
    }
}
