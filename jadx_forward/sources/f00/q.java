package f00;

/* loaded from: classes.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f339857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f339858e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        super(0);
        this.f339857d = bitmap;
        this.f339858e = imageView;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f339857d;
        if (bitmap != null) {
            android.widget.ImageView imageView = this.f339858e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/feature/ecs/card/view/EcsShopWindowViewNew$updateWithShareObject$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(imageView, "com/tencent/mm/feature/ecs/card/view/EcsShopWindowViewNew$updateWithShareObject$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f339858e.setImageBitmap(bitmap);
        } else {
            android.widget.ImageView imageView2 = this.f339858e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(imageView2, arrayList2.toArray(), "com/tencent/mm/feature/ecs/card/view/EcsShopWindowViewNew$updateWithShareObject$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(imageView2, "com/tencent/mm/feature/ecs/card/view/EcsShopWindowViewNew$updateWithShareObject$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
