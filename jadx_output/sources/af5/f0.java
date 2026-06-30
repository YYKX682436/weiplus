package af5;

/* loaded from: classes9.dex */
public final class f0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f4573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingLocationCardMvvmView f4574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f4575f;

    public f0(android.view.View view, com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingLocationCardMvvmView chattingLocationCardMvvmView, com.tencent.mm.storage.f9 f9Var) {
        this.f4573d = view;
        this.f4574e = chattingLocationCardMvvmView;
        this.f4575f = f9Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f4573d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingLocationCardMvvmView chattingLocationCardMvvmView = this.f4574e;
        af5.c0 c0Var = chattingLocationCardMvvmView.f204628f;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        int width = ((af5.d0) c0Var).b().getWidth();
        af5.c0 c0Var2 = chattingLocationCardMvvmView.f204628f;
        if (c0Var2 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        int height = ((af5.d0) c0Var2).b().getHeight();
        com.tencent.mm.autogen.events.GetStaticMapEvent getStaticMapEvent = new com.tencent.mm.autogen.events.GetStaticMapEvent();
        am.tg tgVar = getStaticMapEvent.f54418g;
        tgVar.f8004a = this.f4575f;
        tgVar.f8008e = width;
        tgVar.f8009f = height;
        af5.c0 c0Var3 = chattingLocationCardMvvmView.f204628f;
        if (c0Var3 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        tgVar.f8005b = ((af5.d0) c0Var3).b();
        af5.c0 c0Var4 = chattingLocationCardMvvmView.f204628f;
        if (c0Var4 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        em.r rVar = ((af5.d0) c0Var4).f4562a;
        if (rVar.f254737e == null) {
            rVar.f254737e = (android.widget.ProgressBar) rVar.f254733a.findViewById(com.tencent.mm.R.id.ucs);
        }
        android.widget.ProgressBar progressBar = rVar.f254737e;
        kotlin.jvm.internal.o.f(progressBar, "getLocationMapProgressBar(...)");
        tgVar.f8007d = progressBar;
        af5.c0 c0Var5 = chattingLocationCardMvvmView.f204628f;
        if (c0Var5 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        em.r rVar2 = ((af5.d0) c0Var5).f4562a;
        if (rVar2.f254736d == null) {
            rVar2.f254736d = (android.widget.ImageView) rVar2.f254733a.findViewById(com.tencent.mm.R.id.ucr);
        }
        android.widget.ImageView imageView = rVar2.f254736d;
        kotlin.jvm.internal.o.f(imageView, "getLocationMapPinMark(...)");
        tgVar.f8006c = imageView;
        getStaticMapEvent.e();
        return true;
    }
}
