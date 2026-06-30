package af5;

/* loaded from: classes9.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView f4586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f4587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f4588f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f4589g;

    public k(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView, android.graphics.Bitmap bitmap, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        this.f4586d = chattingAskShareMvvmView;
        this.f4587e = bitmap;
        this.f4588f = imageView;
        this.f4589g = imageView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView.f204613i;
        this.f4586d.m(this.f4587e, this.f4588f, this.f4589g);
    }
}
