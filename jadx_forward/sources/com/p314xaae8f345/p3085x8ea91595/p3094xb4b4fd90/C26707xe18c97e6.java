package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90;

/* renamed from: com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKDataProcessor */
/* loaded from: classes13.dex */
public class C26707xe18c97e6 implements com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26653xae3d077e {
    protected static final java.lang.String TAG = "QQDownloaderOpenSDKDataProcessor";

    /* renamed from: mOpenSDKDataProcessor */
    protected static com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6 f56366xb878f465;

    /* renamed from: openSDKClient */
    protected com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e f56369x203c717b = null;

    /* renamed from: callback */
    protected com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d f56367xf5bc2045 = null;

    /* renamed from: clientKey */
    java.lang.String f56368x8e819a94 = java.util.UUID.randomUUID().toString();

    public C26707xe18c97e6() {
    }

    /* renamed from: QQParam2BasePram */
    private static com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0 m105068x302b32c4(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b) {
        if (c26708x7750f26b == null) {
            return null;
        }
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0 c26724xb2aa7ba0 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0();
        c26724xb2aa7ba0.f56503xd396e254 = c26708x7750f26b.f56370x49183d30;
        c26724xb2aa7ba0.f56504x9200497 = c26708x7750f26b.f56375x9200497;
        c26724xb2aa7ba0.f56505x4225cd2c = c26708x7750f26b.f56376x4225cd2c;
        c26724xb2aa7ba0.f56506x857e2f93 = java.lang.String.valueOf(c26708x7750f26b.f56377x857e2f93);
        c26724xb2aa7ba0.uin = c26708x7750f26b.uin;
        c26724xb2aa7ba0.f56507xe69c0ab4 = c26708x7750f26b.f56378xe69c0ab4;
        c26724xb2aa7ba0.via = c26708x7750f26b.via;
        c26724xb2aa7ba0.f56502x5720517e = c26708x7750f26b.f56372x5720517e;
        return c26724xb2aa7ba0;
    }

    /* renamed from: baseParam2QQParam */
    private com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b m105069xdb0ef617(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0 c26724xb2aa7ba0) {
        if (c26724xb2aa7ba0 == null) {
            return null;
        }
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b();
        c26708x7750f26b.f56370x49183d30 = c26724xb2aa7ba0.f56503xd396e254;
        c26708x7750f26b.f56375x9200497 = c26724xb2aa7ba0.f56504x9200497;
        c26708x7750f26b.f56376x4225cd2c = c26724xb2aa7ba0.f56505x4225cd2c;
        try {
            c26708x7750f26b.f56377x857e2f93 = java.lang.Integer.valueOf(c26724xb2aa7ba0.f56506x857e2f93).intValue();
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "baseParam2QQParam Integer.valueOf(baseParam.taskVersion) NumberFormatException occur");
        }
        c26708x7750f26b.uin = c26724xb2aa7ba0.uin;
        c26708x7750f26b.f56378xe69c0ab4 = c26724xb2aa7ba0.f56507xe69c0ab4;
        c26708x7750f26b.via = c26724xb2aa7ba0.via;
        c26708x7750f26b.f56372x5720517e = c26724xb2aa7ba0.f56502x5720517e;
        return c26708x7750f26b;
    }

    /* renamed from: buildBatchActionRequest */
    public static com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26720xd19704d7 m105070xd55f2d6d(int i17, java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> arrayList, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26720xd19704d7 c26720xd19704d7 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26720xd19704d7();
        c26720xd19704d7.f56486xc346fecf = i17;
        if (str != null) {
            c26720xd19704d7.via = str;
        }
        if (str2 != null) {
            c26720xd19704d7.uin = str2;
        }
        if (str3 != null) {
            c26720xd19704d7.f56487xe69c0ab4 = str3;
        }
        c26720xd19704d7.f56485xc5a10e04 = new java.util.ArrayList<>();
        if (arrayList != null) {
            str4 = "appList {appList.size=" + arrayList.size() + "\n";
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0 m105068x302b32c4 = m105068x302b32c4(arrayList.get(i18));
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26726xb4dee249 c26726xb4dee249 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26726xb4dee249();
                c26726xb4dee249.f56533x92dfbc3c = m105068x302b32c4;
                c26720xd19704d7.f56485xc5a10e04.add(c26726xb4dee249);
                str4 = str4 + "element:" + i18 + "IPCDownloadParam {IPCBaseParam {hostAppId:" + c26726xb4dee249.f56533x92dfbc3c.f56503xd396e254 + "|taskAppId:" + c26726xb4dee249.f56533x92dfbc3c.f56504x9200497 + "|taskPackageName:" + c26726xb4dee249.f56533x92dfbc3c.f56505x4225cd2c + "|taskVersion:" + c26726xb4dee249.f56533x92dfbc3c.f56506x857e2f93 + "}|actionFlag:" + c26726xb4dee249.f56532x6e5ae6c2 + "|verifyType:" + c26726xb4dee249.f56536xc26da753 + "}\n";
            }
        } else {
            str4 = "appList {";
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, str4 + "}");
        return c26720xd19704d7;
    }

    /* renamed from: buildSendData */
    public static byte[] m105071x2c0b0be0(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921) {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26729xd2ca3af3 m105136x33decbe1 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.C26719x3a78b751.m105136x33decbe1(abstractC2861x7aec4921);
        if (m105136x33decbe1 == null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "handleUriAction IPCRequest = null");
            return null;
        }
        byte[] m105137xecf88f8 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.C26719x3a78b751.m105137xecf88f8(m105136x33decbe1);
        if (m105137xecf88f8 != null && m105137xecf88f8.length > 0) {
            return m105137xecf88f8;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "handleUriAction sendData = null");
        return null;
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6 m105072x9cf0d20b(android.content.Context context) {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6 c26707xe18c97e6;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.class) {
            if (f56366xb878f465 == null) {
                f56366xb878f465 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6(context);
            }
            c26707xe18c97e6 = f56366xb878f465;
        }
        return c26707xe18c97e6;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2  */
    /* renamed from: getBatchTaskInfos */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300> m105073x94ec4ddc(java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getBatchTaskInfos appList.size:"
            r3.<init>(r4)
            int r4 = r18.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "QQDownloaderOpenSDKDataProcessor"
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(r4, r3)
            r3 = 3
            r5 = r19
            r6 = r20
            r7 = r21
            com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionRequest r0 = m105070xd55f2d6d(r3, r0, r5, r6, r7)
            byte[] r0 = m105071x2c0b0be0(r0)
            r3 = 0
            if (r0 == 0) goto L51
            int r5 = r0.length
            if (r5 <= 0) goto L51
            com.tencent.tmassistantsdk.util.GlobalUtil r5 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b()     // Catch: java.lang.Throwable -> L48
            android.content.Context r5 = r5.m105492x76847179()     // Catch: java.lang.Throwable -> L48
            r1.m105075xdd9c2dc5(r5)     // Catch: java.lang.Throwable -> L48
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient r5 = r1.f56369x203c717b     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L56
            byte[] r0 = r5.m104825x856de48d(r0)     // Catch: java.lang.Throwable -> L48
            goto L57
        L48:
            r0 = move-exception
            java.lang.String r5 = ""
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r0, r5, r3)
            return r2
        L51:
            java.lang.String r0 = "getBatchTaskInfos sendData = null or length = 0"
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(r4, r0)
        L56:
            r0 = r2
        L57:
            com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse r0 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.C26719x3a78b751.m105142xf8cb93b4(r0)
            if (r0 == 0) goto Le2
            com.qq.taf.jce.JceStruct r0 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.C26719x3a78b751.m105141x8786b1e9(r0)
            com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionResponse r0 = (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26721x64714af9) r0
            if (r0 == 0) goto Ldc
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getBatchTaskInfos BatchDownloadActionResponse batchRequestType:"
            r5.<init>(r6)
            int r6 = r0.f56490xc346fecf
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> r6 = r0.f56489xc5a10e04
            if (r6 == 0) goto Lc4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r5 = "response.batchData.size:"
            r2.append(r5)
            java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> r5 = r0.f56489xc5a10e04
            int r5 = r5.size()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L98:
            java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> r6 = r0.f56489xc5a10e04
            int r6 = r6.size()
            if (r3 >= r6) goto Ld7
            java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo> r6 = r0.f56489xc5a10e04
            java.lang.Object r6 = r6.get(r3)
            com.tencent.tmassistantsdk.openSDK.param.jce.IPCQueryDownloadInfo r6 = (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26728x7220b9a2) r6
            int r7 = r6.f56545x68ac491
            int r11 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105481x258bf3d6(r7)
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo r7 = new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo
            java.lang.String r9 = r6.url
            java.lang.String r10 = r6.f56544x84749342
            long r12 = r6.f56543x82a6e874
            long r14 = r6.f56546xcd575831
            java.lang.String r16 = "application/vnd.android.package-archive"
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r14, r16)
            r5.add(r7)
            int r3 = r3 + 1
            goto L98
        Lc4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r3 = "response.batchData = null"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r5 = r2
            r2 = r0
        Ld7:
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(r4, r2)
            r2 = r5
            goto Le7
        Ldc:
            java.lang.String r0 = "getBatchTaskInfos BatchDownloadActionResponse response = null"
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(r4, r0)
            goto Le7
        Le2:
            java.lang.String r0 = "getBatchTaskInfos IPCResponse resp = null"
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(r4, r0)
        Le7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105073x94ec4ddc(java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    /* renamed from: getDownloadTask */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 m105074xa30d80a3(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getDownloadTask param.sngAppid:"
            r0.<init>(r1)
            java.lang.String r1 = r11.f56370x49183d30
            r0.append(r1)
            java.lang.String r1 = "|param.appid:"
            r0.append(r1)
            java.lang.String r1 = r11.f56375x9200497
            r0.append(r1)
            java.lang.String r1 = "| param.taskPackageName:"
            r0.append(r1)
            java.lang.String r1 = r11.f56376x4225cd2c
            r0.append(r1)
            java.lang.String r1 = "|param.taskVersion:"
            r0.append(r1)
            int r1 = r11.f56377x857e2f93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "QQDownloaderOpenSDKDataProcessor"
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(r1, r0)
            com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam r11 = m105068x302b32c4(r11)
            com.tencent.tmassistantsdk.openSDK.param.jce.QueryDownloadTaskRequest r0 = new com.tencent.tmassistantsdk.openSDK.param.jce.QueryDownloadTaskRequest
            r0.<init>()
            r0.f56562x92dfbc3c = r11
            byte[] r11 = m105071x2c0b0be0(r0)
            r0 = 0
            if (r11 == 0) goto L69
            int r2 = r11.length
            if (r2 <= 0) goto L69
            com.tencent.tmassistantsdk.util.GlobalUtil r2 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b()     // Catch: java.lang.Throwable -> L5f
            android.content.Context r2 = r2.m105492x76847179()     // Catch: java.lang.Throwable -> L5f
            r10.m105075xdd9c2dc5(r2)     // Catch: java.lang.Throwable -> L5f
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadOpenSDKClient r2 = r10.f56369x203c717b     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L6e
            byte[] r11 = r2.m104825x856de48d(r11)     // Catch: java.lang.Throwable -> L5f
            goto L6f
        L5f:
            r11 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = ""
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r11, r3, r2)
            return r0
        L69:
            java.lang.String r11 = "getDownloadTask sendData = null"
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(r1, r11)
        L6e:
            r11 = r0
        L6f:
            com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse r11 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.C26719x3a78b751.m105142xf8cb93b4(r11)
            if (r11 == 0) goto La3
            com.qq.taf.jce.JceStruct r11 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.C26719x3a78b751.m105141x8786b1e9(r11)
            com.tencent.tmassistantsdk.openSDK.param.jce.QueryDownloadTaskResponse r11 = (com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26733x54146256) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "QueryDownloadTaskResponse downloadTask:"
            r0.<init>(r2)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(r1, r0)
            int r0 = r11.f56567x68ac491
            int r4 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105481x258bf3d6(r0)
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo r0 = new com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo
            java.lang.String r2 = r11.url
            java.lang.String r3 = r11.f56566x84749342
            long r5 = r11.f56565x82a6e874
            long r7 = r11.f56568xcd575831
            java.lang.String r9 = "application/vnd.android.package-archive"
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r7, r9)
            return r0
        La3:
            java.lang.String r11 = "getDownloadTask IPCResponse = null"
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26707xe18c97e6.m105074xa30d80a3(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam):com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo");
    }

    /* renamed from: getOpenSDKClient */
    public synchronized void m105075xdd9c2dc5(android.content.Context context) {
        if (this.f56369x203c717b == null && context != null) {
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e m104844xe404c81d = com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200.m104843x9cf0d20b(context).m104844xe404c81d(this.f56368x8e819a94);
            this.f56369x203c717b = m104844xe404c81d;
            if (m104844xe404c81d != null) {
                m104844xe404c81d.m104819x83072226(this);
            }
        }
    }

    /* renamed from: handleBatchRequestAction */
    public boolean m105076x6cc84cd3(int i17, java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b> arrayList, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "handleBatchUpdateAction batchRequestType:" + i17 + "|appList:" + arrayList);
        byte[] m105071x2c0b0be0 = m105071x2c0b0be0(m105070xd55f2d6d(i17, arrayList, str, str2, str3));
        if (m105071x2c0b0be0 == null || m105071x2c0b0be0.length <= 0) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "handleBatchUpdateAction sendData = null or length = 0");
            return false;
        }
        try {
            m105075xdd9c2dc5(com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105492x76847179());
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e c26656xb6f7a66e = this.f56369x203c717b;
            if (c26656xb6f7a66e == null) {
                return false;
            }
            c26656xb6f7a66e.m104824xa689119e(m105071x2c0b0be0);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "", new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: handleDownloadTask */
    public boolean m105077x212cb475(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b c26708x7750f26b, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "handleDownloadTask requestType:" + i17 + "  param.sngAppid:" + c26708x7750f26b.f56370x49183d30 + "|param.appid:" + c26708x7750f26b.f56375x9200497 + "| param.taskPackageName:" + c26708x7750f26b.f56376x4225cd2c + "|param.taskVersion:" + c26708x7750f26b.f56377x857e2f93 + "| param.actionFlag:" + str2 + " | verifyType:" + str3);
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26731x84e8039e c26731x84e8039e = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26731x84e8039e();
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26724xb2aa7ba0 m105068x302b32c4 = m105068x302b32c4(c26708x7750f26b);
        c26731x84e8039e.f56559x448d1669 = i17;
        c26731x84e8039e.f56557x92dfbc3c = m105068x302b32c4;
        c26731x84e8039e.f56556x6e5ae6c2 = str2;
        c26731x84e8039e.f56560xc26da753 = str3;
        c26731x84e8039e.f56558xc3b85a1f = str;
        byte[] m105071x2c0b0be0 = m105071x2c0b0be0(c26731x84e8039e);
        if (m105071x2c0b0be0 == null || m105071x2c0b0be0.length <= 0) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "handleDownloadTask sendData = null");
            return false;
        }
        try {
            m105075xdd9c2dc5(com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105492x76847179());
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e c26656xb6f7a66e = this.f56369x203c717b;
            if (c26656xb6f7a66e == null) {
                return false;
            }
            c26656xb6f7a66e.m104824xa689119e(m105071x2c0b0be0);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "", new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: handleUriAction */
    public boolean m105078x69548d7a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        byte[] m105071x2c0b0be0 = m105071x2c0b0be0(new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26736xd9a2258d(str));
        if (m105071x2c0b0be0 == null || m105071x2c0b0be0.length <= 0) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "handleUriAction sendData = null");
            return false;
        }
        try {
            m105075xdd9c2dc5(com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105492x76847179());
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e c26656xb6f7a66e = this.f56369x203c717b;
            if (c26656xb6f7a66e != null) {
                c26656xb6f7a66e.m104824xa689119e(m105071x2c0b0be0);
            }
            return false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26653xae3d077e
    /* renamed from: onActionResult */
    public void mo104812xcc9ebd72(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onActionResult reponseData = null");
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26730x89a4d85d m105142xf8cb93b4 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.C26719x3a78b751.m105142xf8cb93b4(bArr);
        com.qq.taf.jce.AbstractC2861x7aec4921 m105141x8786b1e9 = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.C26719x3a78b751.m105141x8786b1e9(m105142xf8cb93b4);
        int i17 = m105142xf8cb93b4.f56554x30cde0.f56537x5a623f5;
        if (i17 == 2) {
            if (m105141x8786b1e9 != null) {
                m105081xaba1ac62((com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26723x6f7196b4) m105141x8786b1e9);
            }
        } else if (i17 != 3) {
            if (i17 != 8) {
                return;
            }
            m105080x89577542();
        } else if (m105141x8786b1e9 != null) {
            m105079x95ed2be8((com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26722x5083338c) m105141x8786b1e9);
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26653xae3d077e
    /* renamed from: onDownloadSDKServiceInvalid */
    public void mo104813xec7c4795() {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d interfaceC26700x308b266d = this.f56367xf5bc2045;
        if (interfaceC26700x308b266d != null) {
            interfaceC26700x308b266d.mo105045x236c3a63();
        }
        android.content.Context m105492x76847179 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105492x76847179();
        if (m105492x76847179 != null) {
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200.m104843x9cf0d20b(m105492x76847179).m104847x68aabbb6(this.f56368x8e819a94);
        }
        this.f56369x203c717b = null;
    }

    /* renamed from: onProgressChanged */
    public void m105079x95ed2be8(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26722x5083338c c26722x5083338c) {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b m105069xdb0ef617 = m105069xdb0ef617(c26722x5083338c.f56495x4cd2773e);
        if (m105069xdb0ef617 == null || this.f56367xf5bc2045 == null) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "进度回调：GetDownloadProgressResponse response.receivedLen:" + c26722x5083338c.f56494x82a6e874 + ",response.totalLen" + c26722x5083338c.f56496xcd575831);
        this.f56367xf5bc2045.mo105043x87e7c5b(m105069xdb0ef617, c26722x5083338c.f56494x82a6e874, c26722x5083338c.f56496xcd575831);
    }

    /* renamed from: onServiceFreed */
    public void m105080x89577542() {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d interfaceC26700x308b266d = this.f56367xf5bc2045;
        if (interfaceC26700x308b266d != null) {
            interfaceC26700x308b266d.mo105046xd936a742();
        }
    }

    /* renamed from: onStateChanged */
    public void m105081xaba1ac62(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26723x6f7196b4 c26723x6f7196b4) {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26708x7750f26b m105069xdb0ef617 = m105069xdb0ef617(c26723x6f7196b4.f56500x4cd2773e);
        if (m105069xdb0ef617 == null || this.f56367xf5bc2045 == null) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "状态回调：GetDownloadStateResponse param.taskAppId:" + m105069xdb0ef617.f56375x9200497 + ",param.taskPackageName:" + m105069xdb0ef617.f56376x4225cd2c + ",state:" + c26723x6f7196b4.f56501x68ac491 + ",response.errorCode" + c26723x6f7196b4.f56498x139cb015);
        this.f56367xf5bc2045.mo105044xc6f868cf(m105069xdb0ef617, com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105481x258bf3d6(c26723x6f7196b4.f56501x68ac491), com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105480xba38b0d6(c26723x6f7196b4.f56498x139cb015), c26723x6f7196b4.f56499x5336c059);
    }

    /* renamed from: registerIQQDownloaderOpenSDKListener */
    public void m105082x8b9cca69(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.InterfaceC26700x308b266d interfaceC26700x308b266d) {
        this.f56367xf5bc2045 = interfaceC26700x308b266d;
    }

    /* renamed from: releaseIPCClient */
    public void m105083x8668fec0() {
        if (this.f56369x203c717b != null) {
            android.content.Context m105492x76847179 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105492x76847179();
            if (m105492x76847179 != null) {
                com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200.m104843x9cf0d20b(m105492x76847179).m104847x68aabbb6(this.f56368x8e819a94);
            }
            this.f56369x203c717b = null;
        }
    }

    /* renamed from: unregisterIQQDownloaderOpenSDKListener */
    public void m105084x787b4082() {
        this.f56367xf5bc2045 = null;
        android.content.Context m105492x76847179 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105492x76847179();
        if (m105492x76847179 != null) {
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200.m104843x9cf0d20b(m105492x76847179).m104847x68aabbb6(this.f56368x8e819a94);
        }
        this.f56369x203c717b = null;
    }

    private C26707xe18c97e6(android.content.Context context) {
        if (context != null) {
            m105075xdd9c2dc5(context);
        }
    }
}
