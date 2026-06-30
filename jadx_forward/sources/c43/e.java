package c43;

/* loaded from: classes12.dex */
public final class e extends c43.x {
    public android.view.View Z;

    /* renamed from: l1, reason: collision with root package name */
    public final c43.e f119948l1;

    /* renamed from: p0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15858xbaab08a1 f119949p0;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f119950x0;

    /* renamed from: y0, reason: collision with root package name */
    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f119951y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.view.View itemView, int i17) {
        super(itemView, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f119948l1 = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r1 == false) goto L22;
     */
    @Override // c43.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 r7) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c43.e.k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack):void");
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        if (this.Z == null) {
            android.view.View inflate = android.view.LayoutInflater.from(this.f120025g).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.beo, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            this.Z = inflate;
            this.f119949p0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15858xbaab08a1) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566632gj2);
        }
        android.view.View view = this.Z;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bodyView");
        throw null;
    }

    @Override // c43.x
    public void w(android.view.View view) {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb;
        java.lang.String str = this.f119950x0;
        boolean z17 = false;
        if ((str == null || str.length() == 0) || (interfaceC4987x84e327cb = this.f119951y0) == null) {
            return;
        }
        if (interfaceC4987x84e327cb != null && ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb).k()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        android.content.Context context = this.f120025g;
        if (mo168058x74219ae7) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            return;
        }
        java.lang.String str2 = this.f119950x0;
        if (str2 == null) {
            str2 = "";
        }
        qk.u uVar = new qk.u(str2, this.f119951y0);
        uVar.f445689b = true;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
        if (p6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameChatRoom.GameChatItemEmojiVH", "unable to get emoticon liteapp feature service");
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(context, uVar);
        }
    }
}
