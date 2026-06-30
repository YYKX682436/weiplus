package c43;

/* loaded from: classes3.dex */
public final class k implements u33.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c43.l f119980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f119981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f119982c;

    public k(c43.l lVar, android.view.View view, android.widget.ImageView imageView) {
        this.f119980a = lVar;
        this.f119981b = view;
        this.f119982c = imageView;
    }

    @Override // u33.i
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameChatItemImgVH", "percent:" + i17);
    }

    @Override // u33.i
    public void b(boolean z17, int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameChatItemImgVH", "success:" + z17 + ", errCode:" + i17 + ", filePath:" + str2);
        this.f119980a.f119987y0 = false;
        lt0.l lVar = s33.y.f484074a;
        if (!(android.os.Looper.myLooper() == android.os.Looper.getMainLooper())) {
            ((ku5.t0) ku5.t0.f394148d).B(new c43.j(this.f119981b, z17, str2, this.f119980a, this.f119982c));
            return;
        }
        android.view.View view = this.f119981b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH$setBitmapToView$1", "onFinish", "(ZILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH$setBitmapToView$1", "onFinish", "(ZILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17 && str2 != null) {
            this.f119980a.C(this.f119982c, str2);
        } else {
            this.f119982c.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            this.f119982c.setImageResource(com.p314xaae8f345.mm.R.raw.f80383x3bc8cb67);
        }
    }
}
