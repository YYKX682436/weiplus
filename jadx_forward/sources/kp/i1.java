package kp;

@j95.b
/* loaded from: classes13.dex */
public final class i1 extends i95.w implements gz.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f392296d;

    /* renamed from: e, reason: collision with root package name */
    public final android.net.wifi.p2p.WifiP2pManager f392297e;

    /* renamed from: f, reason: collision with root package name */
    public android.net.wifi.p2p.WifiP2pManager.Channel f392298f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.BroadcastReceiver f392299g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f392300h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f392301i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f392302m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f392303n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f392304o;

    /* renamed from: p, reason: collision with root package name */
    public volatile java.lang.String f392305p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f392306q;

    public i1() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f392296d = context;
        java.lang.Object systemService = context.getSystemService("wifip2p");
        this.f392297e = systemService instanceof android.net.wifi.p2p.WifiP2pManager ? (android.net.wifi.p2p.WifiP2pManager) systemService : null;
        this.f392300h = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        this.f392301i = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(java.lang.Boolean.FALSE);
        this.f392306q = android.os.Build.VERSION.SDK_INT >= 33 ? "android.permission.NEARBY_WIFI_DEVICES" : "android.permission.ACCESS_FINE_LOCATION";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Di(kp.i1 r4, long r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            boolean r0 = r7 instanceof kp.d0
            if (r0 == 0) goto L13
            r0 = r7
            kp.d0 r0 = (kp.d0) r0
            int r1 = r0.f392257e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f392257e = r1
            goto L18
        L13:
            kp.d0 r0 = new kp.d0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f392256d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f392257e
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            kp.g0 r7 = new kp.g0
            r2 = 0
            r7.<init>(r4, r2)
            r0.f392257e = r3
            java.lang.Object r7 = p3325xe03a0797.p3326xc267989b.a4.c(r5, r7, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r7, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.i1.Di(kp.i1, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.String wi(kp.i1 i1Var, int i17) {
        i1Var.getClass();
        e06.k kVar = new e06.k(1, i17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(kVar, 10));
        java.util.Iterator it = kVar.iterator();
        while (((e06.j) it).hasNext()) {
            ((kz5.x0) it).b();
            c06.d random = c06.e.f119249d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(random, "random");
            if ("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".length() == 0) {
                throw new java.util.NoSuchElementException("Char sequence is empty.");
            }
            arrayList.add(java.lang.Character.valueOf("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.d("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".length()))));
        }
        return kz5.n0.g0(arrayList, "", null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Ai(java.lang.String r18, java.lang.String r19, long r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r22) {
        /*
            r17 = this;
            r6 = r17
            r0 = r22
            boolean r1 = r0 instanceof kp.v
            if (r1 == 0) goto L17
            r1 = r0
            kp.v r1 = (kp.v) r1
            int r2 = r1.f392379f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f392379f = r2
            goto L1c
        L17:
            kp.v r1 = new kp.v
            r1.<init>(r6, r0)
        L1c:
            r7 = r1
            java.lang.Object r0 = r7.f392377d
            pz5.a r8 = pz5.a.f440719d
            int r1 = r7.f392379f
            r9 = 1
            if (r1 == 0) goto L35
            if (r1 != r9) goto L2d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            goto Lb9
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            android.content.Context r0 = r6.f392296d
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "wifi"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.net.wifi.WifiManager"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r1)
            r2 = r0
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\""
            r0.<init>(r1)
            r1 = r18
            r0.append(r1)
            r1 = 34
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            java.lang.String r11 = "com/tencent/mm/connection/near/WiFiDirectService"
            java.lang.String r12 = "connectLegacyWifi"
            java.lang.String r13 = "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r14 = "android/net/wifi/WifiManager"
            java.lang.String r15 = "getConnectionInfo"
            java.lang.String r16 = "()Landroid/net/wifi/WifiInfo;"
            r10 = r2
            java.lang.Object r0 = yj0.a.j(r10, r11, r12, r13, r14, r15, r16)
            android.net.wifi.WifiInfo r0 = (android.net.wifi.WifiInfo) r0
            if (r0 == 0) goto L7d
            java.lang.String r0 = r0.getSSID()
            goto L7e
        L7d:
            r0 = 0
        L7e:
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r3)
            if (r0 == 0) goto La3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "connectToGroup: already connected to "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "WiFiDirectService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            gz.a r0 = new gz.a
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            return r0
        La3:
            kp.y r10 = new kp.y
            r5 = 0
            r0 = r10
            r1 = r17
            r4 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r7.f392379f = r9
            r0 = r20
            java.lang.Object r0 = p3325xe03a0797.p3326xc267989b.a4.c(r0, r10, r7)
            if (r0 != r8) goto Lb9
            return r8
        Lb9:
            gz.a r0 = (gz.a) r0
            if (r0 != 0) goto Lc7
            gz.a r0 = new gz.a
            bw5.xf0 r1 = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CONNECT_TO_GROUP_TIMEOUT
            java.lang.String r2 = "connect to wifi timeout"
            r3 = 0
            r0.<init>(r3, r1, r2)
        Lc7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.i1.Ai(java.lang.String, java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0228 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Bi(java.lang.String r22, java.lang.String r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.i1.Bi(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad A[Catch: Exception -> 0x002b, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:10:0x0026, B:11:0x00a9, B:13:0x00ad, B:24:0x0073), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Ni(java.lang.String r7, java.lang.String r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof kp.h0
            if (r0 == 0) goto L13
            r0 = r9
            kp.h0 r0 = (kp.h0) r0
            int r1 = r0.f392285f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f392285f = r1
            goto L18
        L13:
            kp.h0 r0 = new kp.h0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f392283d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f392285f
            r3 = 1
            java.lang.String r4 = "WiFiDirectService"
            r5 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: java.lang.Exception -> L2b
            goto La9
        L2b:
            r7 = move-exception
            goto Lb7
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "connecting to group: "
            r9.<init>(r2)
            r9.append(r7)
            java.lang.String r2 = " ("
            r9.append(r2)
            r9.append(r8)
            r2 = 41
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r9)
            kotlinx.coroutines.flow.j2 r9 = r6.f392301i
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            kotlinx.coroutines.flow.h3 r9 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r9
            r9.k(r2)
            android.net.wifi.p2p.WifiP2pManager r9 = r6.f392297e
            if (r9 != 0) goto L73
            java.lang.String r7 = "WiFiP2pManager is null, cannot connect to group"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r7)
            gz.a r7 = new gz.a
            bw5.xf0 r8 = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_DEVICE_NOT_SUPPORT
            java.lang.String r9 = "connectToGroup: WiFiP2pManager is null"
            r7.<init>(r5, r8, r9)
            return r7
        L73:
            android.net.wifi.p2p.WifiP2pConfig$Builder r9 = new android.net.wifi.p2p.WifiP2pConfig$Builder     // Catch: java.lang.Exception -> L2b
            r9.<init>()     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = "02:00:00:00:00:00"
            android.net.MacAddress r2 = android.net.MacAddress.fromString(r2)     // Catch: java.lang.Exception -> L2b
            android.net.wifi.p2p.WifiP2pConfig$Builder r9 = r9.setDeviceAddress(r2)     // Catch: java.lang.Exception -> L2b
            android.net.wifi.p2p.WifiP2pConfig$Builder r9 = r9.setNetworkName(r7)     // Catch: java.lang.Exception -> L2b
            android.net.wifi.p2p.WifiP2pConfig$Builder r8 = r9.setPassphrase(r8)     // Catch: java.lang.Exception -> L2b
            android.net.wifi.p2p.WifiP2pConfig r8 = r8.build()     // Catch: java.lang.Exception -> L2b
            java.lang.String r9 = "build(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r9)     // Catch: java.lang.Exception -> L2b
            android.net.wifi.WpsInfo r9 = r8.wps     // Catch: java.lang.Exception -> L2b
            r2 = 2
            r9.setup = r2     // Catch: java.lang.Exception -> L2b
            kp.j0 r9 = new kp.j0     // Catch: java.lang.Exception -> L2b
            r2 = 0
            r9.<init>(r6, r8, r7, r2)     // Catch: java.lang.Exception -> L2b
            r0.f392285f = r3     // Catch: java.lang.Exception -> L2b
            r7 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.a4.c(r7, r9, r0)     // Catch: java.lang.Exception -> L2b
            if (r9 != r1) goto La9
            return r1
        La9:
            gz.a r9 = (gz.a) r9     // Catch: java.lang.Exception -> L2b
            if (r9 != 0) goto Le3
            gz.a r9 = new gz.a     // Catch: java.lang.Exception -> L2b
            bw5.xf0 r7 = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CONNECT_TO_GROUP_TIMEOUT     // Catch: java.lang.Exception -> L2b
            java.lang.String r8 = "connectToGroup: connectToGroupImpl timeout"
            r9.<init>(r5, r7, r8)     // Catch: java.lang.Exception -> L2b
            goto Le3
        Lb7:
            java.lang.String r8 = "connectToGroupImpl"
            java.lang.Object[] r9 = new java.lang.Object[r5]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r7, r8, r9)
            gz.a r9 = new gz.a
            bw5.xf0 r8 = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CONNECT_TO_GROUP_ERROR
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "connectToGroup: "
            r0.<init>(r1)
            java.lang.String r1 = r7.getMessage()
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            java.lang.String r7 = android.util.Log.getStackTraceString(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r9.<init>(r5, r8, r7)
        Le3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.i1.Ni(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Ri(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.i1.Ri(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Ui(android.net.wifi.p2p.WifiP2pManager.Channel r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof kp.o0
            if (r0 == 0) goto L13
            r0 = r14
            kp.o0 r0 = (kp.o0) r0
            int r1 = r0.f392342h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f392342h = r1
            goto L18
        L13:
            kp.o0 r0 = new kp.o0
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f392340f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f392342h
            java.lang.String r3 = "WiFiDirectService"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L45
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r13 = r0.f392338d
            kp.i1 r13 = (kp.i1) r13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L8f
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            java.lang.Object r13 = r0.f392339e
            android.net.wifi.p2p.WifiP2pManager$Channel r13 = (android.net.wifi.p2p.WifiP2pManager.Channel) r13
            java.lang.Object r2 = r0.f392338d
            kp.i1 r2 = (kp.i1) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L76
        L45:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            android.net.wifi.p2p.WifiP2pManager r14 = r12.f392297e
            if (r14 != 0) goto L62
            java.lang.String r13 = "WiFiP2pManager is null, cannot create group"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r13)
            gz.b r13 = new gz.b
            r5 = 0
            bw5.xf0 r6 = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_DEVICE_NOT_SUPPORT
            java.lang.String r7 = "createGroup: WiFiP2pManager is null"
            r8 = 0
            r9 = 0
            r10 = 24
            r11 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r13
        L62:
            int r14 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r14 < r2) goto L79
            r0.f392338d = r12
            r0.f392339e = r13
            r0.f392342h = r5
            java.lang.Object r14 = r12.Zi(r0)
            if (r14 != r1) goto L75
            return r1
        L75:
            r2 = r12
        L76:
            java.lang.String r14 = (java.lang.String) r14
            goto L7b
        L79:
            r2 = r12
            r14 = r6
        L7b:
            kp.q0 r5 = new kp.q0
            r5.<init>(r14, r2, r13, r6)
            r0.f392338d = r2
            r0.f392339e = r6
            r0.f392342h = r4
            r13 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r14 = p3325xe03a0797.p3326xc267989b.a4.c(r13, r5, r0)
            if (r14 != r1) goto L8f
            return r1
        L8f:
            gz.b r14 = (gz.b) r14
            if (r14 != 0) goto La8
            java.lang.String r13 = "createGroupImpl timeout"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r13)
            gz.b r14 = new gz.b
            r5 = 0
            bw5.xf0 r6 = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CREATE_GROUP_TIMEOUT
            java.lang.String r7 = "createGroup: createGroupImpl timeout"
            r8 = 0
            r9 = 0
            r10 = 24
            r11 = 0
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
        La8:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.i1.Ui(android.net.wifi.p2p.WifiP2pManager$Channel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00bf -> B:11:0x00c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ca -> B:12:0x00ce). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Vi(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.i1.Vi(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Zi(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kp.s0
            if (r0 == 0) goto L13
            r0 = r5
            kp.s0 r0 = (kp.s0) r0
            int r1 = r0.f392368g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f392368g = r1
            goto L18
        L13:
            kp.s0 r0 = new kp.s0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f392366e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f392368g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f392365d
            kp.i1 r0 = (kp.i1) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L52
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            java.lang.String r5 = r4.f392305p
            if (r5 == 0) goto L46
            boolean r2 = r26.n0.N(r5)
            r2 = r2 ^ r3
            if (r2 == 0) goto L42
            goto L43
        L42:
            r5 = 0
        L43:
            if (r5 == 0) goto L46
            return r5
        L46:
            r0.f392365d = r4
            r0.f392368g = r3
            java.lang.Object r5 = r4.Vi(r0)
            if (r5 != r1) goto L51
            return r1
        L51:
            r0 = r4
        L52:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L57
            return r5
        L57:
            java.lang.String r5 = "Android"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L70
            r2 = 25
            if (r1 < r2) goto L7b
            android.content.Context r0 = r0.f392296d     // Catch: java.lang.Exception -> L70
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L70
            java.lang.String r1 = "device_name"
            java.lang.String r0 = android.provider.Settings.Global.getString(r0, r1)     // Catch: java.lang.Exception -> L70
            if (r0 != 0) goto L6e
            goto L7b
        L6e:
            r5 = r0
            goto L7b
        L70:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "WiFiDirectService"
            java.lang.String r3 = "[getDeviceName] error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r0, r3, r1)
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.i1.Zi(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean aj(java.lang.String permission) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        try {
            return b3.l.m9698x3fed0563(this.f392296d, permission) == 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WiFiDirectService", "[hasPermission] error=" + e17);
            return false;
        }
    }

    public boolean bj() {
        java.lang.Object systemService = this.f392296d.getSystemService("wifi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) systemService;
        try {
            java.lang.Object invoke = wifiManager.getClass().getMethod("getWifiApState", new java.lang.Class[0]).invoke(wifiManager, new java.lang.Object[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type kotlin.Int");
            return ((java.lang.Integer) invoke).intValue() == 13;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WiFiDirectService", e17, "[isWiFiAPEnable] error", new java.lang.Object[0]);
            return false;
        }
    }

    public boolean cj() {
        try {
            java.lang.Object systemService = this.f392296d.getSystemService("wifi");
            android.net.wifi.WifiManager wifiManager = systemService instanceof android.net.wifi.WifiManager ? (android.net.wifi.WifiManager) systemService : null;
            if (wifiManager != null) {
                return wifiManager.isWifiEnabled();
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WiFiDirectService", "[isWiFiEnable] error=" + e17);
            return false;
        }
    }

    public final void fj() {
        android.net.wifi.p2p.WifiP2pManager wifiP2pManager;
        android.net.wifi.p2p.WifiP2pManager.Channel channel;
        if (android.os.Build.VERSION.SDK_INT < 29 || (wifiP2pManager = this.f392297e) == null || (channel = this.f392298f) == null) {
            return;
        }
        if (!aj(this.f392306q)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WiFiDirectService", "skip prefetchLocalP2pDeviceName: no permission");
            return;
        }
        try {
            wifiP2pManager.requestDeviceInfo(channel, new kp.t0(this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WiFiDirectService", e17, "prefetchLocalP2pDeviceName error", new java.lang.Object[0]);
        }
    }

    public void hj() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "registerReceiver");
        if (this.f392299g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WiFiDirectService", "BroadcastReceiver is already registered");
            return;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.p2p.THIS_DEVICE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
        com.p314xaae8f345.mm.p667xd1c47ede.p668x338828.C10403x53a001d2 c10403x53a001d2 = new com.p314xaae8f345.mm.p667xd1c47ede.p668x338828.C10403x53a001d2(this);
        this.f392299g = c10403x53a001d2;
        this.f392296d.registerReceiver(c10403x53a001d2, intentFilter);
        fj();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object ij(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kp.u0
            if (r0 == 0) goto L13
            r0 = r6
            kp.u0 r0 = (kp.u0) r0
            int r1 = r0.f392376f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f392376f = r1
            goto L18
        L13:
            kp.u0 r0 = new kp.u0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f392374d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f392376f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L4e
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            android.net.wifi.p2p.WifiP2pManager r6 = r5.f392297e
            if (r6 != 0) goto L41
            java.lang.String r6 = "WiFiDirectService"
            java.lang.String r0 = "WiFiP2pManager is null, cannot remove group"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r0)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L41:
            android.net.wifi.p2p.WifiP2pManager$Channel r6 = r5.f392298f
            if (r6 == 0) goto L57
            r0.f392376f = r4
            java.lang.Object r6 = r5.nj(r6, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L57
            r3 = r4
        L57:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.i1.ij(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void mj() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "start removeGroupAsync");
        if (!aj(this.f392306q)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WiFiDirectService", "No permission to remove group");
            return;
        }
        android.net.wifi.p2p.WifiP2pManager wifiP2pManager = this.f392297e;
        if (wifiP2pManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WiFiDirectService", "WiFiP2pManager is null, cannot remove group");
            return;
        }
        this.f392304o = false;
        android.net.wifi.p2p.WifiP2pManager.Channel channel = this.f392298f;
        if (channel != null) {
            wifiP2pManager.removeGroup(channel, new kp.v0());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object nj(android.net.wifi.p2p.WifiP2pManager.Channel r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kp.w0
            if (r0 == 0) goto L13
            r0 = r8
            kp.w0 r0 = (kp.w0) r0
            int r1 = r0.f392386f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f392386f = r1
            goto L18
        L13:
            kp.w0 r0 = new kp.w0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f392384d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f392386f
            r3 = 1
            r4 = 0
            java.lang.String r5 = "WiFiDirectService"
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L63
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            android.net.wifi.p2p.WifiP2pManager r8 = r6.f392297e
            if (r8 != 0) goto L41
            java.lang.String r7 = "WiFiP2pManager is null, cannot remove group"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L41:
            java.lang.String r8 = "start removeGroup"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r8)
            r6.f392304o = r4
            com.tencent.mm.sdk.platformtools.o4 r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L()
            java.lang.String r2 = "group_created"
            r8.G(r2, r4)
            kp.y0 r8 = new kp.y0
            r2 = 0
            r8.<init>(r6, r7, r2)
            r0.f392386f = r3
            r2 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.a4.c(r2, r8, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L6c
            boolean r4 = r8.booleanValue()
            goto L72
        L6c:
            java.lang.String r7 = "removeGroup timeout"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r5, r7)
        L72:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.i1.nj(android.net.wifi.p2p.WifiP2pManager$Channel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object oj(android.net.wifi.p2p.WifiP2pManager r6, android.net.wifi.p2p.WifiP2pManager.Channel r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kp.d1
            if (r0 == 0) goto L13
            r0 = r8
            kp.d1 r0 = (kp.d1) r0
            int r1 = r0.f392261g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f392261g = r1
            goto L18
        L13:
            kp.d1 r0 = new kp.d1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f392259e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f392261g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r6 = r0.f392258d
            kp.i1 r6 = (kp.i1) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L49
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            kp.f1 r8 = new kp.f1
            r8.<init>(r6, r7, r5, r3)
            r0.f392258d = r5
            r0.f392261g = r4
            r6 = 300(0x12c, double:1.48E-321)
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.a4.c(r6, r8, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L55
            java.lang.String r6 = "WiFiDirectService"
            java.lang.String r7 = "fetch local p2p deviceName timeout"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r6, r7)
            goto L56
        L55:
            r3 = r8
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.i1.oj(android.net.wifi.p2p.WifiP2pManager, android.net.wifi.p2p.WifiP2pManager$Channel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        android.net.wifi.p2p.WifiP2pManager wifiP2pManager = this.f392297e;
        this.f392298f = wifiP2pManager != null ? wifiP2pManager.initialize(context, context.getMainLooper(), null) : null;
        fj();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("group_created", false)) {
            mj();
        }
    }

    public void pj() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "unregisterReceiver");
        try {
            android.content.BroadcastReceiver broadcastReceiver = this.f392299g;
            if (broadcastReceiver != null) {
                this.f392296d.unregisterReceiver(broadcastReceiver);
            }
            this.f392299g = null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WiFiDirectService", e17, "Fail to unregisterReceiver", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object qj(java.lang.String r6, long r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof kp.g1
            if (r0 == 0) goto L13
            r0 = r9
            kp.g1 r0 = (kp.g1) r0
            int r1 = r0.f392280f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f392280f = r1
            goto L18
        L13:
            kp.g1 r0 = new kp.g1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f392278d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f392280f
            java.lang.String r3 = "WiFiDirectService"
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L55
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "start waiting for p2p ip， interface: "
            r9.<init>(r2)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r9)
            kp.h1 r9 = new kp.h1
            r2 = 0
            r9.<init>(r6, r2)
            r0.f392280f = r4
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.a4.c(r7, r9, r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L5e
            boolean r6 = r9.booleanValue()
            goto L65
        L5e:
            java.lang.String r6 = "p2p ip not assigned before timeout"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r6)
            r6 = 0
        L65:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kp.i1.qj(java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
