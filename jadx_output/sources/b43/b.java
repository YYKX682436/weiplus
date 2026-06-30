package b43;

/* loaded from: classes4.dex */
public class b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public u33.e f17796d;

    /* renamed from: e, reason: collision with root package name */
    public v33.g f17797e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17798f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17799g = false;

    public b(s33.i iVar, u33.e eVar) {
        this.f17796d = eVar;
    }

    public final synchronized void a(java.lang.String str, java.lang.String str2) {
        boolean z17 = this.f17799g;
        if (!z17 && this.f17798f) {
            this.f17799g = true;
            this.f17797e = new v33.g(str, str2, hashCode());
            gm0.j1.d().g(this.f17797e);
            return;
        }
        com.tencent.mars.xlog.Log.i("GameChatRoom.GetChatRoomRealtimeInfoKeepAliveService", "mIsRunning：%b, mIsAlive: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f17798f));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r5, int r6, java.lang.String r7, com.tencent.mm.modelbase.m1 r8) {
        /*
            r4 = this;
            int r0 = r8.getType()
            r1 = 4316(0x10dc, float:6.048E-42)
            if (r0 != r1) goto L77
            v33.g r8 = (v33.g) r8
            int r0 = r8.f433113f
            int r1 = r4.hashCode()
            java.lang.String r2 = "GameChatRoom.GetChatRoomRealtimeInfoKeepAliveService"
            if (r0 == r1) goto L1a
            java.lang.String r5 = "instanceId is diff"
            com.tencent.mars.xlog.Log.i(r2, r5)
            return
        L1a:
            com.tencent.mm.modelbase.o r8 = r8.f433112e
            com.tencent.mm.modelbase.m r0 = r8.f70710a
            com.tencent.mm.protobuf.f r0 = r0.f70684a
            com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoRequest r0 = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoRequest) r0
            com.tencent.mm.modelbase.n r8 = r8.f70711b
            com.tencent.mm.protobuf.f r8 = r8.f70700a
            com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse r8 = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse) r8
            if (r5 != 0) goto L4d
            if (r6 != 0) goto L4d
            if (r8 == 0) goto L4d
            java.lang.String r1 = r0.version
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.f192989a
            if (r1 != 0) goto L36
            java.lang.String r1 = ""
        L36:
            java.lang.String r3 = r8.next_version
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4d
            java.lang.String r1 = r8.next_version
            r0.version = r1
            u33.e r1 = r4.f17796d
            if (r1 == 0) goto L4b
            s33.i r3 = s33.i.KEEP_ALIVE_TYPE_GET_CHATROOM_REALTIME_INFO
            r1.w3(r3, r8)
        L4b:
            r8 = 0
            goto L4e
        L4d:
            r8 = 1
        L4e:
            java.lang.String r1 = r0.chatroom_name
            java.lang.String r3 = r0.version
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r5 = new java.lang.Object[]{r1, r3, r5, r6, r7}
            java.lang.String r6 = "taskCallback, chatroom:%s, newVersion:%s, errType = %d, errCode = %d, errMsg = %s"
            com.tencent.mars.xlog.Log.i(r2, r6, r5)
            ku5.u0 r5 = ku5.t0.f312615d
            b43.a r6 = new b43.a
            r6.<init>(r4, r0)
            if (r8 == 0) goto L70
            r7 = 2000(0x7d0, double:9.88E-321)
            goto L72
        L70:
            r7 = 0
        L72:
            ku5.t0 r5 = (ku5.t0) r5
            r5.k(r6, r7)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b43.b.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
