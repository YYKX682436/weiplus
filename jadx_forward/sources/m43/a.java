package m43;

/* loaded from: classes8.dex */
public class a implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m43.b f404986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m43.c f404987f;

    public a(m43.c cVar, java.lang.String str, m43.b bVar) {
        this.f404987f = cVar;
        this.f404985d = str;
        this.f404986e = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f3 A[ADDED_TO_REGION] */
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo322xdd48fb9f() {
        /*
            r6 = this;
            m43.c r0 = r6.f404987f
            java.util.Map r1 = r0.f404989a
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.String r2 = r6.f404985d
            r1.remove(r2)
            r0.getClass()
            java.lang.String r0 = "game_mmkv"
            com.tencent.mm.sdk.platformtools.o4 r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L1e
            java.lang.String r3 = "auto_run_switch"
            java.lang.String r1 = r0.u(r3, r1)
        L1e:
            java.lang.Object[] r0 = new java.lang.Object[]{r1}
            java.lang.String r3 = "autoRunSwitch:%s"
            java.lang.String r4 = "MicroMsg.GameAutoRunController"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r3, r0)
            r0 = 1
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L40
            r3.<init>(r1)     // Catch: org.json.JSONException -> L40
            boolean r1 = r3.has(r2)     // Catch: org.json.JSONException -> L40
            if (r1 == 0) goto L40
            int r1 = r3.getInt(r2)     // Catch: org.json.JSONException -> L40
            if (r1 == 0) goto L3d
            goto Le0
        L3d:
            r1 = 0
            goto Le1
        L40:
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.e()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a
            if (r3 != 0) goto L4f
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.s()
        L4f:
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a
            if (r3 == 0) goto Lce
            m53.n r3 = r3.f36943xe67be12f
            if (r3 != 0) goto L58
            goto Lce
        L58:
            boolean r3 = r3.f405446d
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "md5_check"
            r1.put(r5, r3)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a
            m53.n r3 = r3.f36943xe67be12f
            boolean r3 = r3.f405447e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "download_resume"
            r1.put(r5, r3)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a
            m53.n r3 = r3.f36943xe67be12f
            boolean r3 = r3.f405448f
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "preload_commlib"
            r1.put(r5, r3)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a
            m53.n r3 = r3.f36943xe67be12f
            boolean r3 = r3.f405449g
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "game_silent_download"
            r1.put(r5, r3)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a
            m53.n r3 = r3.f36943xe67be12f
            boolean r3 = r3.f405450h
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "wepkg_download_retry"
            r1.put(r5, r3)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a
            m53.n r3 = r3.f36943xe67be12f
            boolean r3 = r3.f405451i
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "wepkg_expired_clean"
            r1.put(r5, r3)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a
            m53.n r3 = r3.f36943xe67be12f
            boolean r3 = r3.f405452m
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "game_cache_clean"
            r1.put(r5, r3)
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a
            m53.n r3 = r3.f36943xe67be12f
            boolean r3 = r3.f405453n
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r5 = "game_resource_check"
            r1.put(r5, r3)
        Lce:
            boolean r3 = r1.containsKey(r2)
            if (r3 == 0) goto Le0
            java.lang.Object r1 = r1.get(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r0
            goto Le1
        Le0:
            r1 = r0
        Le1:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "taskId:%s, allowInvoke:%b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r3, r2)
            m43.b r2 = r6.f404986e
            if (r2 == 0) goto Lf8
            if (r1 == 0) goto Lf8
            r2.a()
        Lf8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m43.a.mo322xdd48fb9f():boolean");
    }
}
