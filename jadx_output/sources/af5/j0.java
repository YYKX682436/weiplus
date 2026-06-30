package af5;

/* loaded from: classes9.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView f4585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView chattingVideoMvvmView) {
        super(0);
        this.f4585d = chattingVideoMvvmView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView chattingVideoMvvmView = this.f4585d;
        chattingVideoMvvmView.getHolder().a().setLayoutConfig(chattingVideoMvvmView.g(chattingVideoMvvmView.getHolder().b().getWidth(), chattingVideoMvvmView.getHolder().b().getHeight()));
        return jz5.f0.f302826a;
    }
}
