package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class e4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.e4 f105493d = new com.tencent.mm.plugin.finder.extension.reddot.e4();

    public e4() {
        super(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x0067, Exception -> 0x0069, TryCatch #2 {Exception -> 0x0069, blocks: (B:4:0x0012, B:6:0x0018, B:8:0x001d, B:10:0x0025, B:12:0x002d, B:14:0x0033, B:19:0x003f, B:21:0x0042, B:26:0x0046), top: B:3:0x0012, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[SYNTHETIC] */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r10 = this;
            com.tencent.mm.plugin.finder.extension.reddot.g4 r0 = com.tencent.mm.plugin.finder.extension.reddot.l5.H
            e42.c0 r1 = e42.c0.clicfg_finder_reddot_freq_ctrl_find_tab_path_config
            r2 = 0
            r3 = 2
            org.json.JSONObject r0 = com.tencent.mm.plugin.finder.extension.reddot.g4.f(r0, r1, r2, r3, r2)
            java.lang.String r1 = "FindEntrance"
            java.lang.String r3 = "Finder.RedDotFreqControlHandler"
            if (r0 != 0) goto L12
            goto L82
        L12:
            org.json.JSONArray r0 = r0.optJSONArray(r1)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L82
            if (r0 == 0) goto L45
            java.util.LinkedList r4 = new java.util.LinkedList     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L82
            r4.<init>()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L82
            int r5 = r0.length()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r6 = 0
            r7 = r6
        L23:
            if (r7 >= r5) goto L46
            java.lang.Object r8 = r0.get(r7)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            boolean r9 = r8 instanceof java.lang.String     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            if (r9 == 0) goto L30
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            goto L31
        L30:
            r8 = r2
        L31:
            if (r8 == 0) goto L3c
            int r9 = r8.length()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            if (r9 != 0) goto L3a
            goto L3c
        L3a:
            r9 = r6
            goto L3d
        L3c:
            r9 = 1
        L3d:
            if (r9 != 0) goto L42
            r4.add(r8)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
        L42:
            int r7 = r7 + 1
            goto L23
        L45:
            r4 = r2
        L46:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.String r5 = "get "
            r0.append(r5)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r0.append(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.String r1 = " find tab redDot path list="
            r0.append(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r0.append(r4)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r1 = 33
            r0.append(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            com.tencent.mars.xlog.Log.i(r3, r0)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
        L67:
            r2 = r4
            goto L82
        L69:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r1.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = "getFindTabRedDotPathList "
            r1.append(r4)     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L82
            r1.append(r0)     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L82
            com.tencent.mars.xlog.Log.e(r3, r0)     // Catch: java.lang.Throwable -> L82
        L82:
            if (r2 != 0) goto L98
            java.lang.String r3 = "FinderEntrance"
            java.lang.String r4 = "FinderLiveEntrance"
            java.lang.String r5 = "Listen.Entrance"
            java.lang.String r6 = "NewLife.Entrance"
            java.lang.String r7 = "Search.Entrance"
            java.lang.String r8 = "Game.Entrance"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8}
            java.util.List r2 = kz5.c0.i(r0)
        L98:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.e4.invoke():java.lang.Object");
    }
}
