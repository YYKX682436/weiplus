package com.tencent.mm.chatroom.plugin.listener;

/* loaded from: classes11.dex */
public class h0 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.event.OnSceneEndProxy f63652d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.event.OnSceneEndProxy f63653e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.event.OnSceneEndProxy f63654f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.event.OnSceneEndProxy f63655g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.event.OnSceneEndProxy f63656h;

    public h0() {
        super(0);
        this.f63652d = new com.tencent.mm.pluginsdk.event.OnSceneEndProxy<com.tencent.mm.autogen.events.NetSceneCollectChatRoomEvent>(this) { // from class: com.tencent.mm.chatroom.plugin.listener.OnSwitcherListener$1
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
                com.tencent.mm.autogen.events.NetSceneCollectChatRoomEvent netSceneCollectChatRoomEvent = (com.tencent.mm.autogen.events.NetSceneCollectChatRoomEvent) iEvent;
                netSceneCollectChatRoomEvent.f54519g.getClass();
                f(netSceneCollectChatRoomEvent);
                return false;
            }

            @Override // com.tencent.mm.pluginsdk.event.OnSceneEndProxy
            public com.tencent.mm.modelbase.m1 d(com.tencent.mm.sdk.event.IEvent iEvent) {
                ((com.tencent.mm.autogen.events.NetSceneCollectChatRoomEvent) iEvent).f54519g.getClass();
                return new kn.n(null);
            }

            @Override // com.tencent.mm.pluginsdk.event.OnSceneEndProxy
            public com.tencent.mm.sdk.event.IEvent e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.sdk.event.IEvent iEvent) {
                return (com.tencent.mm.autogen.events.NetSceneCollectChatRoomEvent) iEvent;
            }

            @Override // com.tencent.mm.pluginsdk.event.OnSceneEndProxy
            public int h() {
                return 181;
            }
        };
        this.f63653e = new com.tencent.mm.pluginsdk.event.OnSceneEndProxy<com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent>(this) { // from class: com.tencent.mm.chatroom.plugin.listener.OnSwitcherListener$2
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
                com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent netSceneGetChatroomMemberDetailEvent = (com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent) iEvent;
                netSceneGetChatroomMemberDetailEvent.f54524g.getClass();
                f(netSceneGetChatroomMemberDetailEvent);
                return false;
            }

            @Override // com.tencent.mm.pluginsdk.event.OnSceneEndProxy
            public com.tencent.mm.modelbase.m1 d(com.tencent.mm.sdk.event.IEvent iEvent) {
                am.vk vkVar = ((com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent) iEvent).f54524g;
                return new kn.w(vkVar.f8199a, vkVar.f8200b);
            }

            @Override // com.tencent.mm.pluginsdk.event.OnSceneEndProxy
            public com.tencent.mm.sdk.event.IEvent e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.sdk.event.IEvent iEvent) {
                return (com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent) iEvent;
            }

            @Override // com.tencent.mm.pluginsdk.event.OnSceneEndProxy
            public int h() {
                return 551;
            }
        };
        this.f63654f = new com.tencent.mm.pluginsdk.event.OnSceneEndProxy<com.tencent.mm.autogen.events.NetSceneDelChatRoomMemberEvent>(this) { // from class: com.tencent.mm.chatroom.plugin.listener.OnSwitcherListener$3
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
                com.tencent.mm.autogen.events.NetSceneDelChatRoomMemberEvent netSceneDelChatRoomMemberEvent = (com.tencent.mm.autogen.events.NetSceneDelChatRoomMemberEvent) iEvent;
                netSceneDelChatRoomMemberEvent.f54522g.getClass();
                f(netSceneDelChatRoomMemberEvent);
                return false;
            }

            @Override // com.tencent.mm.pluginsdk.event.OnSceneEndProxy
            public com.tencent.mm.modelbase.m1 d(com.tencent.mm.sdk.event.IEvent iEvent) {
                com.tencent.mm.autogen.events.NetSceneDelChatRoomMemberEvent netSceneDelChatRoomMemberEvent = (com.tencent.mm.autogen.events.NetSceneDelChatRoomMemberEvent) iEvent;
                netSceneDelChatRoomMemberEvent.f54522g.getClass();
                netSceneDelChatRoomMemberEvent.f54522g.getClass();
                return new kn.p(null, null, 0);
            }

            @Override // com.tencent.mm.pluginsdk.event.OnSceneEndProxy
            public com.tencent.mm.sdk.event.IEvent e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.sdk.event.IEvent iEvent) {
                com.tencent.mm.autogen.events.NetSceneDelChatRoomMemberEvent netSceneDelChatRoomMemberEvent = (com.tencent.mm.autogen.events.NetSceneDelChatRoomMemberEvent) iEvent;
                netSceneDelChatRoomMemberEvent.f54523h.getClass();
                return netSceneDelChatRoomMemberEvent;
            }

            @Override // com.tencent.mm.pluginsdk.event.OnSceneEndProxy
            public int h() {
                return 179;
            }
        };
        this.f63655g = new com.tencent.mm.pluginsdk.event.OnSceneEndProxy<com.tencent.mm.autogen.events.NetSceneRevokeChatRoomQRCodeEvent>(this) { // from class: com.tencent.mm.chatroom.plugin.listener.OnSwitcherListener$4
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
                com.tencent.mm.autogen.events.NetSceneRevokeChatRoomQRCodeEvent netSceneRevokeChatRoomQRCodeEvent = (com.tencent.mm.autogen.events.NetSceneRevokeChatRoomQRCodeEvent) iEvent;
                netSceneRevokeChatRoomQRCodeEvent.f54526g.getClass();
                f(netSceneRevokeChatRoomQRCodeEvent);
                return false;
            }

            @Override // com.tencent.mm.pluginsdk.event.OnSceneEndProxy
            public com.tencent.mm.modelbase.m1 d(com.tencent.mm.sdk.event.IEvent iEvent) {
                com.tencent.mm.autogen.events.NetSceneRevokeChatRoomQRCodeEvent netSceneRevokeChatRoomQRCodeEvent = (com.tencent.mm.autogen.events.NetSceneRevokeChatRoomQRCodeEvent) iEvent;
                netSceneRevokeChatRoomQRCodeEvent.f54526g.getClass();
                netSceneRevokeChatRoomQRCodeEvent.f54526g.getClass();
                return new kn.y(null, null, 0);
            }

            @Override // com.tencent.mm.pluginsdk.event.OnSceneEndProxy
            public com.tencent.mm.sdk.event.IEvent e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.sdk.event.IEvent iEvent) {
                com.tencent.mm.autogen.events.NetSceneRevokeChatRoomQRCodeEvent netSceneRevokeChatRoomQRCodeEvent = (com.tencent.mm.autogen.events.NetSceneRevokeChatRoomQRCodeEvent) iEvent;
                netSceneRevokeChatRoomQRCodeEvent.f54527h.getClass();
                return netSceneRevokeChatRoomQRCodeEvent;
            }

            @Override // com.tencent.mm.pluginsdk.event.OnSceneEndProxy
            public int h() {
                return 700;
            }
        };
        this.f63656h = new com.tencent.mm.pluginsdk.event.OnSceneEndProxy<com.tencent.mm.autogen.events.NetSceneCreateChatRoomEvent>(this) { // from class: com.tencent.mm.chatroom.plugin.listener.OnSwitcherListener$5
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
                com.tencent.mm.autogen.events.NetSceneCreateChatRoomEvent netSceneCreateChatRoomEvent = (com.tencent.mm.autogen.events.NetSceneCreateChatRoomEvent) iEvent;
                netSceneCreateChatRoomEvent.f54520g.getClass();
                f(netSceneCreateChatRoomEvent);
                return false;
            }

            @Override // com.tencent.mm.pluginsdk.event.OnSceneEndProxy
            public com.tencent.mm.modelbase.m1 d(com.tencent.mm.sdk.event.IEvent iEvent) {
                com.tencent.mm.autogen.events.NetSceneCreateChatRoomEvent netSceneCreateChatRoomEvent = (com.tencent.mm.autogen.events.NetSceneCreateChatRoomEvent) iEvent;
                netSceneCreateChatRoomEvent.f54520g.getClass();
                netSceneCreateChatRoomEvent.f54520g.getClass();
                return new kn.o(null, null, null, null);
            }

            @Override // com.tencent.mm.pluginsdk.event.OnSceneEndProxy
            public com.tencent.mm.sdk.event.IEvent e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.sdk.event.IEvent iEvent) {
                com.tencent.mm.autogen.events.NetSceneCreateChatRoomEvent netSceneCreateChatRoomEvent = (com.tencent.mm.autogen.events.NetSceneCreateChatRoomEvent) iEvent;
                am.sk skVar = netSceneCreateChatRoomEvent.f54521h;
                ((kn.o) m1Var).getClass();
                skVar.getClass();
                netSceneCreateChatRoomEvent.f54521h.getClass();
                return netSceneCreateChatRoomEvent;
            }

            @Override // com.tencent.mm.pluginsdk.event.OnSceneEndProxy
            public int h() {
                return 119;
            }
        };
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.SwitcherEvent switcherEvent = (com.tencent.mm.autogen.events.SwitcherEvent) iEvent;
        boolean equals = switcherEvent.f54874g.f6713b.equals(com.tencent.mm.autogen.events.NetSceneCollectChatRoomEvent.class.getName());
        am.fy fyVar = switcherEvent.f54874g;
        if (equals) {
            int i17 = fyVar.f6712a;
            com.tencent.mm.pluginsdk.event.OnSceneEndProxy onSceneEndProxy = this.f63652d;
            if (i17 == 1) {
                onSceneEndProxy.c();
                return false;
            }
            onSceneEndProxy.i();
            return false;
        }
        if (fyVar.f6713b.equals(com.tencent.mm.autogen.events.NetSceneGetChatroomMemberDetailEvent.class.getName())) {
            int i18 = fyVar.f6712a;
            com.tencent.mm.pluginsdk.event.OnSceneEndProxy onSceneEndProxy2 = this.f63653e;
            if (i18 == 1) {
                onSceneEndProxy2.c();
                return false;
            }
            onSceneEndProxy2.i();
            return false;
        }
        if (fyVar.f6713b.equals(com.tencent.mm.autogen.events.NetSceneCreateChatRoomEvent.class.getName())) {
            int i19 = fyVar.f6712a;
            com.tencent.mm.pluginsdk.event.OnSceneEndProxy onSceneEndProxy3 = this.f63656h;
            if (i19 == 1) {
                onSceneEndProxy3.c();
                return false;
            }
            onSceneEndProxy3.i();
            return false;
        }
        if (fyVar.f6713b.equals(com.tencent.mm.autogen.events.NetSceneDelChatRoomMemberEvent.class.getName())) {
            int i27 = fyVar.f6712a;
            com.tencent.mm.pluginsdk.event.OnSceneEndProxy onSceneEndProxy4 = this.f63654f;
            if (i27 == 1) {
                onSceneEndProxy4.c();
                return false;
            }
            onSceneEndProxy4.i();
            return false;
        }
        if (!fyVar.f6713b.equals(com.tencent.mm.autogen.events.NetSceneRevokeChatRoomQRCodeEvent.class.getName())) {
            return false;
        }
        int i28 = fyVar.f6712a;
        com.tencent.mm.pluginsdk.event.OnSceneEndProxy onSceneEndProxy5 = this.f63655g;
        if (i28 == 1) {
            onSceneEndProxy5.c();
            return false;
        }
        onSceneEndProxy5.i();
        return false;
    }
}
