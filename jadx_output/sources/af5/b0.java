package af5;

/* loaded from: classes12.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingImgMvvmView f4554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingImgMvvmView chattingImgMvvmView) {
        super(0);
        this.f4554d = chattingImgMvvmView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (!com.tencent.mm.ui.bk.d0() || j62.e.g().i("clicfg_disable_tablet_media_opt", 0, true, true) == 0) {
            com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingImgMvvmView chattingImgMvvmView = this.f4554d;
            android.widget.ImageView b17 = chattingImgMvvmView.getHolder().b();
            kotlin.jvm.internal.o.f(b17, "getChattingContentIv(...)");
            com.tencent.mm.accessibility.base.MapExpandKt.postIfNeed(b17, new af5.a0(chattingImgMvvmView));
        }
        return jz5.f0.f302826a;
    }
}
