package af5;

/* loaded from: classes9.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingPhotoAccountNameCardMvvmView f4578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingPhotoAccountNameCardMvvmView chattingPhotoAccountNameCardMvvmView) {
        super(1);
        this.f4578d = chattingPhotoAccountNameCardMvvmView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String username;
        java.lang.String username2;
        java.lang.String username3;
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(imageView, "imageView");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingPhotoAccountNameCardMvvmView chattingPhotoAccountNameCardMvvmView = this.f4578d;
        int h17 = i65.a.h(chattingPhotoAccountNameCardMvvmView.getContext(), chattingPhotoAccountNameCardMvvmView.h() ? com.tencent.mm.R.dimen.f479720dd : com.tencent.mm.R.dimen.f479718db);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = h17;
        layoutParams.height = h17;
        imageView.setLayoutParams(layoutParams);
        username = chattingPhotoAccountNameCardMvvmView.getUsername();
        if (r26.n0.N(username)) {
            imageView.setImageResource(chattingPhotoAccountNameCardMvvmView.h() ? com.tencent.mm.R.drawable.bgo : com.tencent.mm.R.drawable.bhm);
        } else if (chattingPhotoAccountNameCardMvvmView.h()) {
            kv.b0 b0Var = (kv.b0) i95.n0.c(kv.b0.class);
            username3 = chattingPhotoAccountNameCardMvvmView.getUsername();
            hn1.s sVar = (hn1.s) b0Var;
            sVar.getClass();
            sVar.Bi(imageView, username3, null, 0.5f);
        } else {
            kv.b0 b0Var2 = (kv.b0) i95.n0.c(kv.b0.class);
            username2 = chattingPhotoAccountNameCardMvvmView.getUsername();
            ((hn1.s) b0Var2).Ai(imageView, username2);
        }
        return jz5.f0.f302826a;
    }
}
