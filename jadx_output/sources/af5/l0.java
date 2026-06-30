package af5;

/* loaded from: classes9.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView f4594d;

    public l0(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView chattingVideoMvvmView) {
        this.f4594d = chattingVideoMvvmView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingVideoMvvmView", "invoke reset mask wh");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView chattingVideoMvvmView = this.f4594d;
        android.widget.ImageView c17 = chattingVideoMvvmView.getHolder().c();
        android.view.ViewGroup.LayoutParams layoutParams = chattingVideoMvvmView.getHolder().c().getLayoutParams();
        layoutParams.width = chattingVideoMvvmView.getHolder().b().getWidth();
        layoutParams.height = chattingVideoMvvmView.getHolder().b().getHeight();
        c17.setLayoutParams(layoutParams);
    }
}
