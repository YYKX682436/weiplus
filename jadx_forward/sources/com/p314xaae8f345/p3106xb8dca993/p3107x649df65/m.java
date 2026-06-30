package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public class m implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b {

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f297144a;

    /* renamed from: b, reason: collision with root package name */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 f297145b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f297146c = "";

    /* renamed from: d, reason: collision with root package name */
    private boolean f297147d = false;

    /* renamed from: e, reason: collision with root package name */
    private com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n1 f297148e = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n1();

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f297149f = false;

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        boolean z17;
        android.content.pm.PackageManager packageManager = this.f297144a.getPackageManager();
        boolean z18 = true;
        try {
            packageManager.getPackageInfo("com.hihonor.id", 0);
            android.content.Intent intent = new android.content.Intent("com.hihonor.id.HnOaIdService");
            intent.setPackage("com.hihonor.id");
            z17 = !packageManager.queryIntentServices(intent, 0).isEmpty();
        } catch (java.lang.Exception unused) {
            z17 = false;
        }
        if (z17) {
            if (!g() && !f()) {
                z18 = false;
            }
            if (z18) {
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b("honor get oaid success");
            } else {
                com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.b("honor get oaid failed");
            }
        } else {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.a("honor {com.hihonor.id.HnOaIdService} not exist");
        }
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r8.f297149f != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        r2 = r8.f297148e;
        r3 = r8.f297144a;
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        r3.unbindService(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.a("honor unbind service exceprion:" + r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r8.f297149f != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean f() {
        /*
            r8 = this;
            java.lang.String r0 = "honor unbind service exceprion:"
            r1 = 0
            com.tencent.tmsqmsp.oaid2.n1 r2 = r8.f297148e     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            android.content.Context r3 = r8.f297144a     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            r4.<init>()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            java.lang.String r5 = "com.hihonor.id.HnOaIdService"
            r4.setAction(r5)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            java.lang.String r5 = "com.hihonor.id"
            r4.setPackage(r5)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            android.content.pm.ApplicationInfo r5 = r3.getApplicationInfo()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            int r5 = r5.targetSdkVersion     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            r6 = 34
            r7 = 1
            if (r5 < r6) goto L28
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            if (r5 < r6) goto L28
            r5 = 513(0x201, float:7.19E-43)
            goto L29
        L28:
            r5 = r7
        L29:
            boolean r2 = r3.bindService(r4, r2, r5)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            r8.f297149f = r2     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            com.tencent.tmsqmsp.oaid2.n1 r2 = r8.f297148e     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            java.util.concurrent.CountDownLatch r2 = r2.f297155d     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            r4 = 2
            r2.await(r4, r3)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            com.tencent.tmsqmsp.oaid2.n1 r2 = r8.f297148e     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            com.tencent.tmsqmsp.oaid2.m1 r2 = r2.f297156e     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            java.lang.String r3 = r2.f297150a     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            if (r3 != 0) goto L4c
            boolean r2 = r2.f297151b     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            if (r2 != 0) goto L4c
            r2 = r7
            goto L4d
        L4c:
            r2 = r1
        L4d:
            if (r2 == 0) goto L5d
            com.tencent.tmsqmsp.oaid2.n1 r2 = r8.f297148e     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            com.tencent.tmsqmsp.oaid2.m1 r2 = r2.f297156e     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            java.lang.String r3 = r2.f297150a     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            r8.f297146c = r3     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            boolean r2 = r2.f297151b     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            r2 = r2 ^ r7
            r8.f297147d = r2     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L87
            r1 = r7
        L5d:
            boolean r2 = r8.f297149f
            if (r2 == 0) goto Lab
            goto L8c
        L62:
            r1 = move-exception
            boolean r2 = r8.f297149f
            if (r2 == 0) goto L86
            com.tencent.tmsqmsp.oaid2.n1 r2 = r8.f297148e
            android.content.Context r3 = r8.f297144a
            r2.getClass()
            r3.unbindService(r2)     // Catch: java.lang.Exception -> L72
            goto L86
        L72:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = r2.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.a(r0)
        L86:
            throw r1
        L87:
            boolean r2 = r8.f297149f
            if (r2 != 0) goto L8c
            goto Lab
        L8c:
            com.tencent.tmsqmsp.oaid2.n1 r2 = r8.f297148e
            android.content.Context r3 = r8.f297144a
            r2.getClass()
            r3.unbindService(r2)     // Catch: java.lang.Exception -> L97
            goto Lab
        L97:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = r2.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.a(r0)
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3106xb8dca993.p3107x649df65.m.f():boolean");
    }

    private boolean g() {
        try {
            java.lang.String string = android.provider.Settings.Global.getString(this.f297144a.getContentResolver(), "oaid_limit_state");
            java.lang.String string2 = android.provider.Settings.Global.getString(this.f297144a.getContentResolver(), "oaid");
            if (!android.text.TextUtils.isEmpty(string) && !android.text.TextUtils.isEmpty(string2)) {
                this.f297147d = !java.lang.Boolean.parseBoolean(string);
                this.f297146c = string2;
                return true;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3106xb8dca993.p3107x649df65.t0.a("honor get cache oaid error " + th6.toString());
        }
        return false;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public java.lang.String d() {
        return null;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public boolean e() {
        return this.f297147d;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void j() {
        new java.lang.Thread(new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.o1(this), "query-oaid").start();
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public boolean k() {
        return false;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56 = this.f297145b;
        if (interfaceC26782xfd577a56 != null) {
            interfaceC26782xfd577a56.mo36999x57429edc(this.f297147d, "", this.f297146c);
        }
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public void a(android.content.Context context, com.p314xaae8f345.p3106xb8dca993.p3107x649df65.InterfaceC26782xfd577a56 interfaceC26782xfd577a56) {
        this.f297144a = context;
        this.f297145b = interfaceC26782xfd577a56;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.b
    public java.lang.String a() {
        return this.f297146c;
    }
}
