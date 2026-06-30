package af5;

/* loaded from: classes9.dex */
public final class m0 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView f4598d;

    public m0(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView chattingVideoMvvmView) {
        this.f4598d = chattingVideoMvvmView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView chattingVideoMvvmView = this.f4598d;
        if (chattingVideoMvvmView.getHolder().c().getWidth() == chattingVideoMvvmView.getHolder().b().getWidth() && chattingVideoMvvmView.getHolder().c().getHeight() == chattingVideoMvvmView.getHolder().b().getHeight()) {
            return;
        }
        chattingVideoMvvmView.post(new af5.l0(chattingVideoMvvmView));
    }
}
