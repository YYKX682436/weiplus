package com.tencent.mm.app.provider;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/app/provider/ShareableChatRecordsProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "zk/a", "zk/b", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ShareableChatRecordsProvider extends android.content.ContentProvider {

    /* renamed from: e, reason: collision with root package name */
    public static final zk.a f53711e = new zk.a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f53712f = kz5.b1.e(new jz5.l("com.tencent.hunyuan.app.chat", "d8648a1a72ae97f5cc3421174c9125f3e087b55570a74b3afd04ed40027b50a6"));

    /* renamed from: d, reason: collision with root package name */
    public final java.util.WeakHashMap f53713d = new java.util.WeakHashMap();

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0084 -> B:10:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ad -> B:10:0x00b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.tencent.mm.app.provider.ShareableChatRecordsProvider r11, kotlin.coroutines.Continuation r12) {
        /*
            r11.getClass()
            boolean r0 = r12 instanceof zk.d
            if (r0 == 0) goto L16
            r0 = r12
            zk.d r0 = (zk.d) r0
            int r1 = r0.f473365m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f473365m = r1
            goto L1b
        L16:
            zk.d r0 = new zk.d
            r0.<init>(r11, r12)
        L1b:
            java.lang.Object r11 = r0.f473363h
            pz5.a r12 = pz5.a.f359186d
            int r1 = r0.f473365m
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            int r1 = r0.f473360e
            long r3 = r0.f473361f
            int r5 = r0.f473359d
            java.lang.Object r6 = r0.f473362g
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lb0
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.String r11 = "getService"
            r1 = 3
            r3 = 1500(0x5dc, double:7.41E-321)
            r5 = 0
            r6 = r11
            r10 = r5
            r5 = r1
            r1 = r10
        L4a:
            java.lang.String r11 = "[-] "
            java.lang.String r7 = "MicroMsg.ShareableChatRecordsProvider"
            if (r1 >= r5) goto Lb2
            boolean r8 = gm0.j1.a()     // Catch: java.lang.Exception -> L62
            if (r8 == 0) goto L82
            java.lang.Class<ct.q2> r8 = ct.q2.class
            i95.m r8 = i95.n0.c(r8)     // Catch: java.lang.Exception -> L62
            ct.q2 r8 = (ct.q2) r8     // Catch: java.lang.Exception -> L62
            if (r8 == 0) goto L82
            r12 = r8
            goto Ld0
        L62:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r11)
            r9.append(r6)
            java.lang.String r11 = ": unexpected exception on attempt "
            r9.append(r11)
            r9.append(r1)
            java.lang.String r11 = ", "
            r9.append(r11)
            r9.append(r8)
            java.lang.String r11 = r9.toString()
            com.tencent.mars.xlog.Log.e(r7, r11)
        L82:
            int r11 = r5 + (-1)
            if (r1 >= r11) goto Lb0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r8 = "[!] "
            r11.<init>(r8)
            r11.append(r6)
            java.lang.String r8 = ": retrying, attempt="
            r11.append(r8)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            com.tencent.mars.xlog.Log.w(r7, r11)
            r0.f473362g = r6
            r0.f473359d = r5
            r0.f473361f = r3
            r0.f473360e = r1
            r0.f473365m = r2
            java.lang.Object r11 = kotlinx.coroutines.k1.b(r3, r0)
            if (r11 != r12) goto Lb0
            goto Ld0
        Lb0:
            int r1 = r1 + r2
            goto L4a
        Lb2:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            r12.append(r6)
            java.lang.String r11 = ": failed after "
            r12.append(r11)
            r12.append(r5)
            java.lang.String r11 = " attempts"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.mars.xlog.Log.e(r7, r11)
            r11 = 0
            r12 = r11
        Ld0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.provider.ShareableChatRecordsProvider.a(com.tencent.mm.app.provider.ShareableChatRecordsProvider, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a1 -> B:11:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d1 -> B:10:0x00dd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.tencent.mm.app.provider.ShareableChatRecordsProvider r19, long r20, java.lang.String r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.provider.ShareableChatRecordsProvider.b(com.tencent.mm.app.provider.ShareableChatRecordsProvider, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final co.f c(java.lang.String str, boolean z17) {
        co.f fVar;
        java.util.WeakHashMap weakHashMap = this.f53713d;
        java.util.WeakHashMap weakHashMap2 = z17 ? weakHashMap : null;
        if (weakHashMap2 != null && (fVar = (co.f) weakHashMap2.get(str)) != null) {
            return fVar;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!((java.lang.Boolean) kotlinx.coroutines.l.f(null, new zk.c(this, r6Var, null), 1, null)).booleanValue()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareableChatRecordsProvider", "[-] getChatRecordsInfo: file not exists");
            return null;
        }
        try {
            java.lang.String M = com.tencent.mm.vfs.w6.M(r6Var.o());
            if (M == null) {
                M = "";
            }
            try {
                co.f fVar2 = new co.f();
                fVar2.fromJson(M);
                weakHashMap.put(str, fVar2);
                fVar2.j().size();
                return fVar2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ShareableChatRecordsProvider", "[-] getChatRecordsInfo: parse json failed, " + e17);
                return null;
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareableChatRecordsProvider", "[-] getChatRecordsInfo: read file failed, " + e18);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        kotlin.jvm.internal.o.g(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        kotlin.jvm.internal.o.g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        kotlin.jvm.internal.o.g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x0580, code lost:
    
        if (r0 == null) goto L244;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x036a  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.ParcelFileDescriptor openFile(android.net.Uri r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 1588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.provider.ShareableChatRecordsProvider.openFile(android.net.Uri, java.lang.String):android.os.ParcelFileDescriptor");
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        kotlin.jvm.internal.o.g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        kotlin.jvm.internal.o.g(uri, "uri");
        return 0;
    }
}
