package af5;

/* loaded from: classes9.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView f4644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f4645e;

    public u(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView, android.widget.ImageView imageView) {
        this.f4644d = chattingAskShareMvvmView;
        this.f4645e = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4644d.setFailImage(this.f4645e);
    }
}
