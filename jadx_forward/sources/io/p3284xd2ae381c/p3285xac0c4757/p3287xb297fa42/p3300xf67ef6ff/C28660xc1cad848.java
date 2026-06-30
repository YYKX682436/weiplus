package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.MouseCursorChannel */
/* loaded from: classes14.dex */
public class C28660xc1cad848 {
    private static final java.lang.String TAG = "MouseCursorChannel";

    /* renamed from: channel */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f71319x2c0b7d03;

    /* renamed from: mouseCursorMethodHandler */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28660xc1cad848.MouseCursorMethodHandler f71320x5a4b7e8e;

    /* renamed from: parsingMethodCallHandler */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71321x74fe9b;

    /* renamed from: io.flutter.embedding.engine.systemchannels.MouseCursorChannel$MouseCursorMethodHandler */
    /* loaded from: classes14.dex */
    public interface MouseCursorMethodHandler {
        /* renamed from: activateSystemCursor */
        void mo138189xb21726f8(java.lang.String str);
    }

    public C28660xc1cad848(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.MouseCursorChannel.1
            /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[Catch: Exception -> 0x0070, TRY_LEAVE, TryCatch #0 {Exception -> 0x0070, blocks: (B:7:0x0028, B:14:0x0040, B:17:0x0055, B:21:0x005c, B:23:0x0032, B:16:0x004c), top: B:6:0x0028, inners: #1 }] */
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
            /* renamed from: onMethodCall */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff r7, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result r8) {
                /*
                    r6 = this;
                    java.lang.String r0 = "error"
                    java.lang.String r1 = "Error when setting cursors: "
                    io.flutter.embedding.engine.systemchannels.MouseCursorChannel r2 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28660xc1cad848.this
                    io.flutter.embedding.engine.systemchannels.MouseCursorChannel$MouseCursorMethodHandler r2 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28660xc1cad848.m138186xbbd77af0(r2)
                    if (r2 != 0) goto Ld
                    return
                Ld:
                    java.lang.String r2 = r7.f71610xbfc5d0e1
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r4 = "Received '"
                    r3.<init>(r4)
                    r3.append(r2)
                    java.lang.String r4 = "' message."
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    java.lang.String r4 = "MouseCursorChannel"
                    io.p3284xd2ae381c.Log.v(r4, r3)
                    r3 = 0
                    int r4 = r2.hashCode()     // Catch: java.lang.Exception -> L70
                    r5 = -1307105544(0xffffffffb21726f8, float:-8.798217E-9)
                    if (r4 == r5) goto L32
                    goto L3c
                L32:
                    java.lang.String r4 = "activateSystemCursor"
                    boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> L70
                    if (r2 == 0) goto L3c
                    r2 = 0
                    goto L3d
                L3c:
                    r2 = -1
                L3d:
                    if (r2 == 0) goto L40
                    goto L86
                L40:
                    java.lang.Object r7 = r7.f71609x86ac7956     // Catch: java.lang.Exception -> L70
                    java.util.HashMap r7 = (java.util.HashMap) r7     // Catch: java.lang.Exception -> L70
                    java.lang.String r2 = "kind"
                    java.lang.Object r7 = r7.get(r2)     // Catch: java.lang.Exception -> L70
                    java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L70
                    io.flutter.embedding.engine.systemchannels.MouseCursorChannel r2 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28660xc1cad848.this     // Catch: java.lang.Exception -> L5b
                    io.flutter.embedding.engine.systemchannels.MouseCursorChannel$MouseCursorMethodHandler r2 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28660xc1cad848.m138186xbbd77af0(r2)     // Catch: java.lang.Exception -> L5b
                    r2.mo138189xb21726f8(r7)     // Catch: java.lang.Exception -> L5b
                    java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L70
                    r8.mo65720x90b54003(r7)     // Catch: java.lang.Exception -> L70
                    goto L86
                L5b:
                    r7 = move-exception
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L70
                    r2.<init>(r1)     // Catch: java.lang.Exception -> L70
                    java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Exception -> L70
                    r2.append(r7)     // Catch: java.lang.Exception -> L70
                    java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> L70
                    r8.mo65718x5c4d208(r0, r7, r3)     // Catch: java.lang.Exception -> L70
                    goto L86
                L70:
                    r7 = move-exception
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Unhandled error: "
                    r1.<init>(r2)
                    java.lang.String r7 = r7.getMessage()
                    r1.append(r7)
                    java.lang.String r7 = r1.toString()
                    r8.mo65718x5c4d208(r0, r7, r3)
                L86:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28660xc1cad848.AnonymousClass1.mo294x9bfdc61e(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
            }
        };
        this.f71321x74fe9b = methodCallHandler;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28604xeb2eb192, "flutter/mousecursor", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98.f71637x4fbc8495);
        this.f71319x2c0b7d03 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(methodCallHandler);
    }

    /* renamed from: setMethodHandler */
    public void m138187x6b2b1e7(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28660xc1cad848.MouseCursorMethodHandler mouseCursorMethodHandler) {
        this.f71320x5a4b7e8e = mouseCursorMethodHandler;
    }

    /* renamed from: synthesizeMethodCall */
    public void m138188x5cab26a9(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f71321x74fe9b.mo294x9bfdc61e(c28687x4bb242ff, result);
    }
}
