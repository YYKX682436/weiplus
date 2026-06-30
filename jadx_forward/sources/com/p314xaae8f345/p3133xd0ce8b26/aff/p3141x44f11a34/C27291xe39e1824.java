package com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34;

/* renamed from: com.tencent.wechat.aff.ext_device.ZIDL_J9_A7t6S1B */
/* loaded from: classes11.dex */
class C27291xe39e1824 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.e {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.f f298216a;

    /* renamed from: ZIDL_GX */
    private native void m112611x1964d239(long j17, long j18, boolean z17, long j19, byte[] bArr);

    /* renamed from: ZIDL_HX */
    private native void m112612x1964d258(long j17, long j18, byte[][] bArr);

    /* renamed from: ZIDL_IX */
    private native void m112613x1964d277(long j17, long j18, byte[][] bArr);

    /* renamed from: ZIDL_LX */
    private native void m112614x1964d2d4(long j17, long j18, int i17, byte[] bArr);

    public void Q1(long j17, java.util.ArrayList arrayList) {
        m112612x1964d258(this.f60633xf042a733, j17, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119649x2e14a45c(arrayList));
    }

    public void R1(long j17, java.util.ArrayList arrayList) {
        m112613x1964d277(this.f60633xf042a733, j17, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119649x2e14a45c(arrayList));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.e
    public void W(long j17, int i17, java.lang.String str) {
        m112614x1964d2d4(this.f60633xf042a733, j17, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    /* renamed from: ZIDL_A */
    public boolean m112615x9db8edf9() {
        ((iy4.g) this.f298216a).getClass();
        return (ip.b.v().getInt("notification.status.webonline.push.open", 0) & 8192) != 0;
    }

    /* renamed from: ZIDL_B */
    public void m112616x9db8edfa(boolean z17) {
        ((iy4.g) this.f298216a).getClass();
        int o17 = c01.z1.o();
        int i17 = z17 ? o17 | 8192 : o17 & (-8193);
        ip.l.t(i17);
        c01.d9.b().p().w(40, java.lang.Integer.valueOf(i17));
    }

    /* renamed from: ZIDL_C */
    public void m112617x9db8edfb(int i17, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.f fVar = this.f298216a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((iy4.g) fVar).getClass();
        ((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 4, i17, str);
    }

    /* renamed from: ZIDL_D */
    public void m112618x9db8edfc() {
        ((iy4.g) this.f298216a).getClass();
        gm0.j1.d().g(new ug3.i(c01.d9.b().x()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        return r9.getBytes(java.nio.charset.StandardCharsets.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r3 == null) goto L29;
     */
    /* renamed from: ZIDL_E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] m112619x9db8edfd(int r9) {
        /*
            r8 = this;
            com.tencent.wechat.aff.ext_device.f r0 = r8.f298216a
            iy4.g r0 = (iy4.g) r0
            r0.getClass()
            java.lang.String r0 = "AffExtDeviceNativeUtilImpl"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r3 = 0
            c01.f r4 = c01.d9.b()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            com.tencent.mm.storage.l8 r4 = r4.r()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            l75.e0 r5 = pp.a.f438897e2     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            com.tencent.mm.storage.m4 r4 = (com.p314xaae8f345.mm.p2621x8fb0427b.m4) r4     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            r5 = 1
            android.database.Cursor r3 = r4.A(r5, r3, r3, r5)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            if (r3 == 0) goto L50
            int r4 = r3.getCount()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            if (r4 >= r9) goto L2d
            int r9 = r3.getCount()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
        L2d:
            java.lang.String r4 = "username"
            int r4 = r3.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            r5 = r2
        L35:
            if (r5 >= r9) goto L50
            boolean r6 = r3.moveToPosition(r5)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            if (r6 == 0) goto L4d
            java.lang.String r6 = r3.getString(r4)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            r1.append(r6)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            int r6 = r9 + (-1)
            if (r5 >= r6) goto L4d
            java.lang.String r6 = ","
            r1.append(r6)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
        L4d:
            int r5 = r5 + 1
            goto L35
        L50:
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            java.lang.String r1 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r1)     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L76
            r1.<init>()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L76
            java.lang.String r4 = "get session list: "
            r1.append(r4)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L76
            r1.append(r9)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L76
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L76
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L76
            if (r3 == 0) goto L88
        L70:
            r3.close()
            goto L88
        L74:
            r1 = move-exception
            goto L7e
        L76:
            r9 = move-exception
            goto L8f
        L78:
            r9 = move-exception
            java.lang.String r1 = ""
            r7 = r1
            r1 = r9
            r9 = r7
        L7e:
            java.lang.String r4 = "get session list error."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L76
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r1, r4, r2)     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L88
            goto L70
        L88:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r9 = r9.getBytes(r0)
            return r9
        L8f:
            if (r3 == 0) goto L94
            r3.close()
        L94:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.C27291xe39e1824.m112619x9db8edfd(int):byte[]");
    }

    /* renamed from: ZIDL_F */
    public void m112620x9db8edfe(int i17, boolean z17, int i18, byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.f fVar = this.f298216a;
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((iy4.g) fVar).getClass();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_device_to_device_msg_sync, 1) == 1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5714xc4ebffe7 c5714xc4ebffe7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5714xc4ebffe7();
            am.zj zjVar = c5714xc4ebffe7.f136035g;
            zjVar.f90103a = bArr;
            zjVar.f90104b = i17;
            zjVar.f90105c = !z17;
            zjVar.f90106d = str;
            c5714xc4ebffe7.e();
        }
    }

    /* renamed from: ZIDL_GV */
    public void m112621x1964d237(long j17, byte[] bArr, long j18, long j19, long j27, int i17) {
        ku5.f fVar;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.f fVar2 = this.f298216a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        iy4.g gVar = (iy4.g) fVar2;
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AffExtDeviceNativeUtilImpl", "[+] getChatPackageAsync taskId = " + j17 + ", conversationId = " + str + ", fromTime = " + j18 + ", toTime = " + j19 + ", offset = " + j27 + ", limit = " + i17);
        synchronized (gVar) {
            if (gVar.f377495a == null) {
                gVar.f377495a = ((ku5.t0) ku5.t0.f394148d).o("Ext_Sync-Record-Pool", 4, 4, new java.util.concurrent.LinkedBlockingQueue());
            }
            fVar = gVar.f377495a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        }
        fVar.execute(new iy4.d(str, j17, j18, j19, gVar, j27, i17));
    }

    /* renamed from: ZIDL_HV */
    public void m112622x1964d256(long j17) {
        iy4.g gVar = (iy4.g) this.f298216a;
        gVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(oo1.g.f428676a.c());
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.e eVar = gVar.f377496b;
        if (eVar != null) {
            ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.C27291xe39e1824) eVar).Q1(j17, arrayList);
        }
    }

    /* renamed from: ZIDL_IV */
    public void m112623x1964d275(long j17) {
        iy4.g gVar = (iy4.g) this.f298216a;
        gVar.getClass();
        java.util.List c17 = oo1.g.f428676a.c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : c17) {
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        kz5.n0.O0(arrayList, arrayList2);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.e eVar = gVar.f377496b;
        if (eVar != null) {
            ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.C27291xe39e1824) eVar).R1(j17, arrayList2);
        }
    }

    /* renamed from: ZIDL_J */
    public byte[] m112624x9db8ee02() {
        ((iy4.g) this.f298216a).getClass();
        java.lang.String k17 = gm0.j1.b().k();
        if (k17 == null) {
            k17 = "";
        }
        return k17.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    /* renamed from: ZIDL_K */
    public long m112625x9db8ee03() {
        ((iy4.g) this.f298216a).getClass();
        return c01.id.c();
    }

    /* renamed from: ZIDL_LV */
    public void m112626x1964d2d2(long j17, byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.f fVar = this.f298216a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        iy4.g gVar = (iy4.g) fVar;
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AffExtDeviceNativeUtilImpl", "[notifyToConfirmSync] funcName=" + str + ", args=" + str2);
        java.lang.String k17 = gm0.j1.b().k();
        if (k17 == null) {
            k17 = "";
        }
        r45.yd6 yd6Var = new r45.yd6();
        yd6Var.f472527d = 25;
        yd6Var.f472528e = k17;
        yd6Var.f472529f = k17;
        yd6Var.f472530g = "" + java.lang.System.currentTimeMillis();
        r45.xd6 xd6Var = new r45.xd6();
        xd6Var.f471531d = str;
        xd6Var.f471532e = str2;
        yd6Var.f472533m = xd6Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 251;
        lVar.f152199c = "/cgi-bin/micromsg-bin/statusnotify";
        lVar.f152197a = yd6Var;
        lVar.f152198b = new r45.zd6();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        iVar.l().q(new iy4.f(gVar, j17));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.e
    public void a(long j17, boolean z17, long j18, bw5.w0 w0Var) {
        m112611x1964d239(this.f60633xf042a733, j17, z17, j18, w0Var.m75963xebb06ba0());
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.f fVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.f) obj;
        this.f298216a = fVar;
        ((iy4.g) fVar).f377496b = this;
    }
}
