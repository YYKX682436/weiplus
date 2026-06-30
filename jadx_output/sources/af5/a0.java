package af5;

/* loaded from: classes12.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingImgMvvmView f4549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingImgMvvmView chattingImgMvvmView) {
        super(0);
        this.f4549d = chattingImgMvvmView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingImgMvvmView chattingImgMvvmView = this.f4549d;
        chattingImgMvvmView.getHolder().a().setLayoutConfig(chattingImgMvvmView.g(chattingImgMvvmView.getHolder().b().getWidth(), chattingImgMvvmView.getHolder().b().getHeight()));
        return jz5.f0.f302826a;
    }
}
