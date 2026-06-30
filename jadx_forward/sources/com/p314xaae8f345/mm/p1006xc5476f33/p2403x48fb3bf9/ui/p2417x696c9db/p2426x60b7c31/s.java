package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f266917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f266918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Intent intent, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f266917d = intent;
        this.f266918e = kVar;
        this.f266919f = y2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r9, "1") != false) goto L25;
     */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r13 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.Intent r1 = r13.f266917d
            java.lang.String r2 = "key_pick_local_pic_callback_local_ids"
            java.lang.String r2 = r1.getStringExtra(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r2}
            java.lang.String r4 = "MicroMsg.JsApiChoosePassport"
            java.lang.String r5 = "localIds = %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5, r3)
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
            r5 = 0
            java.lang.String r6 = "choosePassport:fail"
            nw4.k r7 = r13.f266918e
            nw4.y2 r8 = r13.f266919f
            if (r3 == 0) goto L2e
            nw4.g r0 = r7.f422396d
            java.lang.String r1 = r8.f422546c
            r0.e(r1, r6, r5)
            goto Ld1
        L2e:
            r3 = 0
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lc2
            r9.<init>(r2)     // Catch: java.lang.Exception -> Lc2
            int r2 = r9.length()     // Catch: java.lang.Exception -> Lc2
            if (r2 <= 0) goto Lba
            java.lang.Object r2 = r9.get(r3)     // Catch: java.lang.Exception -> Lc2
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lc2
            java.lang.String r9 = "localId"
            r0.put(r9, r2)     // Catch: java.lang.Exception -> Lc2
            java.lang.String r9 = "key_pick_local_pic_source_type"
            java.lang.String r1 = r1.getStringExtra(r9)     // Catch: java.lang.Exception -> Lc2
            if (r1 == 0) goto L57
            java.lang.String r1 = "sourceType"
            java.lang.String r9 = "album"
            r0.put(r1, r9)     // Catch: java.lang.Exception -> Lc2
        L57:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.b0 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0.f266472d     // Catch: java.lang.Exception -> Lc2
            java.util.Map r9 = r8.f422323a     // Catch: java.lang.Exception -> Lc2
            java.lang.String r10 = "needSaveOriginalImage"
            java.lang.Object r9 = r9.get(r10)     // Catch: java.lang.Exception -> Lc2
            boolean r10 = r9 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> Lc2
            r11 = 1
            if (r10 == 0) goto L6d
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> Lc2
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Exception -> Lc2
            goto L95
        L6d:
            boolean r10 = r9 instanceof java.lang.Number     // Catch: java.lang.Exception -> Lc2
            if (r10 == 0) goto L7a
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Exception -> Lc2
            int r9 = r9.intValue()     // Catch: java.lang.Exception -> Lc2
            if (r9 == 0) goto L94
            goto L92
        L7a:
            boolean r10 = r9 instanceof java.lang.String     // Catch: java.lang.Exception -> Lc2
            if (r10 == 0) goto L94
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> Lc2
            java.lang.String r12 = "true"
            boolean r10 = r26.i0.p(r10, r12, r11)     // Catch: java.lang.Exception -> Lc2
            if (r10 != 0) goto L92
            java.lang.String r10 = "1"
            boolean r9 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r9, r10)     // Catch: java.lang.Exception -> Lc2
            if (r9 == 0) goto L94
        L92:
            r9 = r11
            goto L95
        L94:
            r9 = r3
        L95:
            if (r9 == 0) goto L9b
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0.g(r1, r7, r8, r0, r2)     // Catch: java.lang.Exception -> Lc2
            goto Ld1
        L9b:
            java.lang.String r1 = "choosePassport callback localId:%s hasOriginal:%b originalCount:%d"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> Lc2
            r9[r3] = r2     // Catch: java.lang.Exception -> Lc2
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> Lc2
            r9[r11] = r2     // Catch: java.lang.Exception -> Lc2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Lc2
            r10 = 2
            r9[r10] = r2     // Catch: java.lang.Exception -> Lc2
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r1, r9)     // Catch: java.lang.Exception -> Lc2
            nw4.g r1 = r7.f422396d     // Catch: java.lang.Exception -> Lc2
            java.lang.String r2 = r8.f422546c     // Catch: java.lang.Exception -> Lc2
            java.lang.String r9 = "choosePassport:ok"
            r1.e(r2, r9, r0)     // Catch: java.lang.Exception -> Lc2
            goto Ld1
        Lba:
            nw4.g r0 = r7.f422396d     // Catch: java.lang.Exception -> Lc2
            java.lang.String r1 = r8.f422546c     // Catch: java.lang.Exception -> Lc2
            r0.e(r1, r6, r5)     // Catch: java.lang.Exception -> Lc2
            goto Ld1
        Lc2:
            r0 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r0, r1, r2)
            nw4.g r0 = r7.f422396d
            java.lang.String r1 = r8.f422546c
            r0.e(r1, r6, r5)
        Ld1:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.s.mo152xb9724478():java.lang.Object");
    }
}
