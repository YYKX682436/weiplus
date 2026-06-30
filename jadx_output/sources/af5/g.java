package af5;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAppMsgFinderNameCardMvvmView f4576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4577e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAppMsgFinderNameCardMvvmView chattingAppMsgFinderNameCardMvvmView, java.lang.String str) {
        super(1);
        this.f4576d = chattingAppMsgFinderNameCardMvvmView;
        this.f4577e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(imageView, "imageView");
        int h17 = i65.a.h(this.f4576d.getContext(), com.tencent.mm.R.dimen.f479720dd);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = h17;
        layoutParams.height = h17;
        imageView.setLayoutParams(layoutParams);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        a17.c(ya2.l.f460502a.e(this.f4577e, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329962p));
        return jz5.f0.f302826a;
    }
}
