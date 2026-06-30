package c43;

/* loaded from: classes12.dex */
public final class e extends c43.x {
    public android.view.View Z;

    /* renamed from: l1, reason: collision with root package name */
    public final c43.e f38415l1;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.plugin.game.chatroom.view.GameChatEmojiView f38416p0;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f38417x0;

    /* renamed from: y0, reason: collision with root package name */
    public com.tencent.mm.api.IEmojiInfo f38418y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.view.View itemView, int i17) {
        super(itemView, i17);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f38415l1 = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r1 == false) goto L22;
     */
    @Override // c43.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r7) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c43.e.k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack):void");
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        if (this.Z == null) {
            android.view.View inflate = android.view.LayoutInflater.from(this.f38492g).inflate(com.tencent.mm.R.layout.beo, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            this.Z = inflate;
            this.f38416p0 = (com.tencent.mm.plugin.game.chatroom.view.GameChatEmojiView) inflate.findViewById(com.tencent.mm.R.id.f485099gj2);
        }
        android.view.View view = this.Z;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("bodyView");
        throw null;
    }

    @Override // c43.x
    public void w(android.view.View view) {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo;
        java.lang.String str = this.f38417x0;
        boolean z17 = false;
        if ((str == null || str.length() == 0) || (iEmojiInfo = this.f38418y0) == null) {
            return;
        }
        if (iEmojiInfo != null && ((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo).k()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        android.content.Context context = this.f38492g;
        if (isTeenMode) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            return;
        }
        java.lang.String str2 = this.f38417x0;
        if (str2 == null) {
            str2 = "";
        }
        qk.u uVar = new qk.u(str2, this.f38418y0);
        uVar.f364156b = true;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("GameChatRoom.GameChatItemEmojiVH", "unable to get emoticon liteapp feature service");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(context, uVar);
        }
    }
}
