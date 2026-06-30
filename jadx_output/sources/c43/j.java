package c43;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f38438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f38439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c43.l f38441g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f38442h;

    public j(android.view.View view, boolean z17, java.lang.String str, c43.l lVar, android.widget.ImageView imageView) {
        this.f38438d = view;
        this.f38439e = z17;
        this.f38440f = str;
        this.f38441g = lVar;
        this.f38442h = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        android.view.View view = this.f38438d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH$setBitmapToView$1$onFinish$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH$setBitmapToView$1$onFinish$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z17 = this.f38439e;
        android.widget.ImageView imageView = this.f38442h;
        if (!z17 || (str = this.f38440f) == null) {
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            imageView.setImageResource(com.tencent.mm.R.raw.image_download_fail_icon);
        } else {
            int i17 = c43.l.f38451l1;
            this.f38441g.C(imageView, str);
        }
    }
}
