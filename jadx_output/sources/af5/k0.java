package af5;

/* loaded from: classes9.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView f4590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView chattingVideoMvvmView) {
        super(0);
        this.f4590d = chattingVideoMvvmView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (!com.tencent.mm.ui.bk.d0() || j62.e.g().i("clicfg_disable_tablet_media_opt", 0, true, true) == 0) {
            com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView chattingVideoMvvmView = this.f4590d;
            android.widget.ImageView b17 = chattingVideoMvvmView.getHolder().b();
            kotlin.jvm.internal.o.f(b17, "getChattingContentIv(...)");
            com.tencent.mm.accessibility.base.MapExpandKt.postIfNeed(b17, new af5.j0(chattingVideoMvvmView));
        }
        return jz5.f0.f302826a;
    }
}
