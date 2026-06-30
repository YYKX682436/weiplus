package c43;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f119971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f119972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c43.l f119974g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f119975h;

    public j(android.view.View view, boolean z17, java.lang.String str, c43.l lVar, android.widget.ImageView imageView) {
        this.f119971d = view;
        this.f119972e = z17;
        this.f119973f = str;
        this.f119974g = lVar;
        this.f119975h = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        android.view.View view = this.f119971d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH$setBitmapToView$1$onFinish$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH$setBitmapToView$1$onFinish$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z17 = this.f119972e;
        android.widget.ImageView imageView = this.f119975h;
        if (!z17 || (str = this.f119973f) == null) {
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80383x3bc8cb67);
        } else {
            int i17 = c43.l.f119984l1;
            this.f119974g.C(imageView, str);
        }
    }
}
