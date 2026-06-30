package c43;

/* loaded from: classes3.dex */
public final class k implements u33.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c43.l f38447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f38448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f38449c;

    public k(c43.l lVar, android.view.View view, android.widget.ImageView imageView) {
        this.f38447a = lVar;
        this.f38448b = view;
        this.f38449c = imageView;
    }

    @Override // u33.i
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameChatItemImgVH", "percent:" + i17);
    }

    @Override // u33.i
    public void b(boolean z17, int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameChatItemImgVH", "success:" + z17 + ", errCode:" + i17 + ", filePath:" + str2);
        this.f38447a.f38454y0 = false;
        lt0.l lVar = s33.y.f402541a;
        if (!(android.os.Looper.myLooper() == android.os.Looper.getMainLooper())) {
            ((ku5.t0) ku5.t0.f312615d).B(new c43.j(this.f38448b, z17, str2, this.f38447a, this.f38449c));
            return;
        }
        android.view.View view = this.f38448b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH$setBitmapToView$1", "onFinish", "(ZILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH$setBitmapToView$1", "onFinish", "(ZILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17 && str2 != null) {
            this.f38447a.C(this.f38449c, str2);
        } else {
            this.f38449c.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            this.f38449c.setImageResource(com.tencent.mm.R.raw.image_download_fail_icon);
        }
    }
}
