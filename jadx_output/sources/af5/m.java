package af5;

/* loaded from: classes9.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView f4595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f4596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f4597f;

    public m(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        this.f4595d = chattingAskShareMvvmView;
        this.f4596e = imageView;
        this.f4597f = imageView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView.f204613i;
        this.f4595d.getClass();
        this.f4596e.setVisibility(8);
        this.f4597f.setVisibility(0);
    }
}
