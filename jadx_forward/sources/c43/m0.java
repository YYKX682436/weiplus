package c43;

/* loaded from: classes8.dex */
public class m0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f119994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c43.x f119995b;

    public m0(c43.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f119995b = xVar;
        this.f119994a = c15780xf49d6a1c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0085 A[Catch: JSONException -> 0x008a, TRY_LEAVE, TryCatch #2 {JSONException -> 0x008a, blocks: (B:5:0x0021, B:21:0x004e, B:24:0x0053, B:9:0x005c, B:11:0x0062, B:12:0x0069, B:14:0x0085), top: B:4:0x0021 }] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r6, boolean r7) {
        /*
            r5 = this;
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r0 = r5.f119994a
            java.lang.String r1 = "username="
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r2, r7}
            java.lang.String r2 = "GameChatRoom.GameChatItemVH"
            java.lang.String r3 = "checkPreload,  hasPreload:[%b], result[%b]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3, r7)
            c43.x r7 = r5.f119995b
            if (r6 == 0) goto La6
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r3 = "user_name"
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r4 = r7.f120028m     // Catch: org.json.JSONException -> L8a
            java.lang.String r4 = r4.f36570xfd4da1cb     // Catch: org.json.JSONException -> L8a
            r6.put(r3, r4)     // Catch: org.json.JSONException -> L8a
            java.lang.String r3 = r0.f36743xf0cd21de     // Catch: org.json.JSONException -> L8a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L8a
            r4.<init>(r1)     // Catch: org.json.JSONException -> L8a
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r1 = r7.f120028m     // Catch: org.json.JSONException -> L8a
            java.lang.String r1 = r1.f36570xfd4da1cb     // Catch: org.json.JSONException -> L8a
            r4.append(r1)     // Catch: org.json.JSONException -> L8a
            java.lang.String r1 = r4.toString()     // Catch: org.json.JSONException -> L8a
            java.lang.String r1 = s33.y.b(r3, r1)     // Catch: org.json.JSONException -> L8a
            r0.f36743xf0cd21de = r1     // Catch: org.json.JSONException -> L8a
            java.lang.String r1 = "user_data"
            u33.h r3 = r7.M     // Catch: org.json.JSONException -> L8a
            y33.e r3 = (y33.e) r3     // Catch: org.json.JSONException -> L8a
            byte[] r4 = r3.f66961x227839ff     // Catch: org.json.JSONException -> L8a
            if (r4 == 0) goto L59
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData r4 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData     // Catch: java.io.IOException -> L59 org.json.JSONException -> L8a
            r4.<init>()     // Catch: java.io.IOException -> L59 org.json.JSONException -> L8a
            byte[] r3 = r3.f66961x227839ff     // Catch: java.io.IOException -> L5a org.json.JSONException -> L8a
            r4.mo11468x92b714fd(r3)     // Catch: java.io.IOException -> L5a org.json.JSONException -> L8a
            goto L5a
        L59:
            r4 = 0
        L5a:
            if (r4 == 0) goto L67
            org.json.JSONObject r3 = pm0.b0.g(r4)     // Catch: org.json.JSONException -> L8a
            if (r3 == 0) goto L67
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> L8a
            goto L69
        L67:
            java.lang.String r3 = ""
        L69:
            r6.put(r1, r3)     // Catch: org.json.JSONException -> L8a
            java.lang.String r1 = "raw_url"
            u33.h r3 = r7.M     // Catch: org.json.JSONException -> L8a
            y33.e r3 = (y33.e) r3     // Catch: org.json.JSONException -> L8a
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r3 = r3.f66958xe860fa1     // Catch: org.json.JSONException -> L8a
            java.lang.String r3 = r3.f36743xf0cd21de     // Catch: org.json.JSONException -> L8a
            r6.put(r1, r3)     // Catch: org.json.JSONException -> L8a
            java.lang.String r1 = "source_id"
            r3 = 1304(0x518, double:6.443E-321)
            r6.put(r1, r3)     // Catch: org.json.JSONException -> L8a
            java.lang.String r1 = r7.V     // Catch: org.json.JSONException -> L8a
            if (r1 == 0) goto L8a
            java.lang.String r3 = "premade_info"
            r6.put(r3, r1)     // Catch: org.json.JSONException -> L8a
        L8a:
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = fp.s0.a(r6)
            android.content.Context r7 = r7.f120025g
            r1 = 12
            s33.y.i(r7, r0, r1, r6)
            java.lang.String r6 = r0.f36743xf0cd21de
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "use preload personal profile url: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r7, r6)
            goto Lca
        La6:
            android.content.Context r6 = r7.f120025g
            u33.h r0 = r7.M
            y33.e r0 = (y33.e) r0
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r0 = r0.f66958xe860fa1
            s33.y.h(r6, r0)
            u33.h r6 = r7.M
            r7 = r6
            y33.e r7 = (y33.e) r7
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r7 = r7.f66958xe860fa1
            if (r7 == 0) goto Lca
            y33.e r6 = (y33.e) r6
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r6 = r6.f66958xe860fa1
            java.lang.String r6 = r6.f36743xf0cd21de
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "user userdata url: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r7, r6)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c43.m0.a(boolean, boolean):void");
    }
}
