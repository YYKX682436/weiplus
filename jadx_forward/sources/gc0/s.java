package gc0;

/* loaded from: classes.dex */
public final class s extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f351797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f351799g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.ref.WeakReference weakReference, java.lang.String str, long j17) {
        super(1, null);
        this.f351797e = weakReference;
        this.f351798f = str;
        this.f351799g = j17;
    }

    @Override // tg3.a
    public void a(android.view.View widget) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.content.Context context = (android.content.Context) this.f351797e.get();
        if (context != null) {
            pt0.e0 e0Var = pt0.f0.f439742b1;
            java.lang.String str = this.f351798f;
            long j17 = this.f351799g;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(str, j17);
            if (j17 != 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.setClassName(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI");
                intent.putExtra("img_gallery_talker", n17.Q0());
                intent.putExtra("img_gallery_enter_from_chatting_ui", true);
                intent.putExtra("img_gallery_chatroom_name", n17.Q0());
                intent.putExtra("img_preview_only", true);
                intent.putExtra("img_gallery_msg_id", n17.m124847x74d37ac6());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/profile/remark/HandleRecommendRemarkSendTipClickImageListener$handleTemplate$span$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/feature/profile/remark/HandleRecommendRemarkSendTipClickImageListener$handleTemplate$span$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }
}
