package af5;

/* loaded from: classes9.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView f4591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f4592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f4593f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        super(1);
        this.f4591d = chattingAskShareMvvmView;
        this.f4592e = imageView;
        this.f4593f = imageView2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView = this.f4591d;
        chattingAskShareMvvmView.post(new af5.k(chattingAskShareMvvmView, (android.graphics.Bitmap) obj, this.f4592e, this.f4593f));
        return jz5.f0.f302826a;
    }
}
