package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/ui/chat_tab/GameRoomListFragment;", "Lcom/tencent/mm/plugin/game/ui/chat_tab/AbsGameRoomFragment;", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameRoomListFragment */
/* loaded from: classes8.dex */
public final class C16006x4c6b7dbb extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.AbstractC15992x49ab61cf {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f222676d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f222677e;

    /* renamed from: f, reason: collision with root package name */
    public o43.c f222678f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f222679g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.f0(this));

    public C16006x4c6b7dbb(java.lang.String str, boolean z17) {
        this.f222676d = str;
        this.f222677e = z17;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bhi, viewGroup, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 c15850x99d4a1f6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566671gp1);
        if (c15850x99d4a1f6 == null) {
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(com.p314xaae8f345.mm.R.id.f566671gp1)));
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
        this.f222678f = new o43.c(frameLayout, c15850x99d4a1f6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameLayout, "getRoot(...)");
        return frameLayout;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        super.mo7399xa6664a60();
        this.f222678f = null;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C15999x9db057c5) ((jz5.n) this.f222679g).mo141623x754a37bb()).f222644d.l1();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0097  */
    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo7518x594b1124(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            super.mo7518x594b1124(r7, r8)
            o43.c r7 = r6.f222678f
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7)
            jz5.g r8 = r6.f222679g
            jz5.n r8 = (jz5.n) r8
            java.lang.Object r8 = r8.mo141623x754a37bb()
            com.tencent.mm.plugin.game.ui.chat_tab.ChatTabTopArea r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C15999x9db057c5) r8
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r7 = r7.f424382b
            r7.m53684x77114253(r8)
            o43.c r7 = r6.f222678f
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7)
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r7 = r7.f424382b
            r7.getClass()
            com.tencent.mm.autogen.events.GamePBCacheEvent r8 = new com.tencent.mm.autogen.events.GamePBCacheEvent
            r8.<init>()
            am.we r0 = r8.f135902g
            r1 = 1
            r0.f89811a = r1
            java.lang.String r2 = "cache_chatroom_recommend"
            r0.f89812b = r2
            r8.e()
            byte[] r8 = r0.f89813c
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(r8)
            r2 = 0
            r3 = 0
            java.lang.String r4 = "MicroMsg.ChatRoomListView"
            if (r0 != 0) goto L5c
            com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse r0 = new com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse     // Catch: java.io.IOException -> L4e
            r0.<init>()     // Catch: java.io.IOException -> L4e
            r0.mo11468x92b714fd(r8)     // Catch: java.io.IOException -> L4f
            r8 = r1
            goto L50
        L4e:
            r0 = r2
        L4f:
            r8 = r3
        L50:
            if (r0 == 0) goto L5c
            if (r8 == 0) goto L5c
            java.lang.String r8 = "recommend chatroom, user cache"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r8)
            r7.l1(r0, r1)
        L5c:
            com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom r8 = d43.b.f307946f
            if (r8 == 0) goto L68
            java.lang.String r0 = "use prefetch my chatroom data"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
            r3 = r1
            goto L95
        L68:
            com.tencent.mm.autogen.events.GamePBCacheEvent r8 = new com.tencent.mm.autogen.events.GamePBCacheEvent
            r8.<init>()
            am.we r0 = r8.f135902g
            r0.f89811a = r1
            java.lang.String r5 = "cache_my_chatroom"
            r0.f89812b = r5
            r8.e()
            byte[] r8 = r0.f89813c
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(r8)
            if (r0 != 0) goto L8e
            com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom r0 = new com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom     // Catch: java.io.IOException -> L8b
            r0.<init>()     // Catch: java.io.IOException -> L8b
            r0.mo11468x92b714fd(r8)     // Catch: java.io.IOException -> L8c
            r8 = r0
            r3 = r1
            goto L90
        L8b:
            r0 = r2
        L8c:
            r8 = r0
            goto L90
        L8e:
            r3 = r1
            r8 = r2
        L90:
            java.lang.String r0 = "local my chatroom, user cache"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
        L95:
            if (r8 == 0) goto La8
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> r0 = r8.f36757xcf9821f6
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(r0)
            if (r0 != 0) goto La8
            if (r3 == 0) goto La8
            com.tencent.mm.plugin.game.chatroom.view.j0 r7 = r7.f220435g2
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> r8 = r8.f36757xcf9821f6
            r7.z(r8)
        La8:
            d43.b r7 = d43.b.f307944d
            b43.d r8 = d43.b.f307945e
            r8.f99343o = r1
            java.lang.String r8 = r6.f222676d
            r7.a(r8)
            v33.i r7 = new v33.i
            r7.<init>(r2)
            com.tencent.mm.modelbase.r1 r8 = gm0.j1.d()
            r8.g(r7)
            boolean r7 = r6.f222677e
            if (r7 == 0) goto Lcd
            o43.c r7 = r6.f222678f
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r7)
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r7 = r7.f424382b
            r7.m1()
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16006x4c6b7dbb.mo7518x594b1124(android.view.View, android.os.Bundle):void");
    }
}
