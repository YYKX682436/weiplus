package zn1;

/* loaded from: classes11.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final zn1.i0 f555980a = new zn1.i0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f555981b = jz5.h.b(zn1.a0.f555953d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f555982c = kz5.c0.i(new zn1.z(null, null, 255, 66, 1), new zn1.z(null, null, 255, 255, 0), new zn1.z(null, null, 6, 1, 1));

    /* renamed from: d, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f555983d = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);

    /* renamed from: e, reason: collision with root package name */
    public static final zn1.h0 f555984e = new zn1.h0();

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8 A[LOOP:1: B:43:0x009d->B:50:0x00c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf A[EDGE_INSN: B:51:0x00cf->B:15:0x00cf BREAK  A[LOOP:1: B:43:0x009d->B:50:0x00c8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zn1.m a(android.hardware.usb.UsbDevice r14, android.hardware.usb.UsbManager r15) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn1.i0.a(android.hardware.usb.UsbDevice, android.hardware.usb.UsbManager):zn1.m");
    }

    public final boolean b(android.hardware.usb.UsbDevice usbDevice) {
        if (c(usbDevice, f555982c) || c(usbDevice, (java.util.List) ((jz5.n) f555981b).mo141623x754a37bb())) {
            return true;
        }
        zn1.b0 b0Var = new zn1.b0(new r26.t("(?<![A-Za-z])(mtp|adb|android)(?![A-Za-z])"));
        if (((java.lang.Boolean) b0Var.mo146xb9724478(usbDevice.getDeviceName())).booleanValue() || ((java.lang.Boolean) b0Var.mo146xb9724478(usbDevice.getProductName())).booleanValue()) {
            return true;
        }
        int configurationCount = usbDevice.getConfigurationCount();
        for (int i17 = 0; i17 < configurationCount; i17++) {
            android.hardware.usb.UsbConfiguration configuration = usbDevice.getConfiguration(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(configuration, "getConfiguration(...)");
            if (((java.lang.Boolean) b0Var.mo146xb9724478(configuration.getName())).booleanValue()) {
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UsbDeviceManager", "[isMtpDevice] Not mtp device. device=" + usbDevice);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2.intValue() != r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (r2.intValue() != r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        if (r2.intValue() != r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        if (r2.intValue() != r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0076, code lost:
    
        if (r0.intValue() != r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:8:0x0011->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.hardware.usb.UsbDevice r6, java.util.List r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto Ld
            goto L7d
        Ld:
            java.util.Iterator r7 = r7.iterator()
        L11:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r7.next()
            zn1.z r0 = (zn1.z) r0
            java.lang.Integer r2 = r0.f556016a
            r3 = 1
            if (r2 == 0) goto L31
            int r4 = r6.getVendorId()
            if (r2 != 0) goto L29
            goto L2f
        L29:
            int r2 = r2.intValue()
            if (r2 == r4) goto L31
        L2f:
            r0 = r1
            goto L7a
        L31:
            java.lang.Integer r2 = r0.f556017b
            if (r2 == 0) goto L43
            int r4 = r6.getProductId()
            if (r2 != 0) goto L3c
            goto L42
        L3c:
            int r2 = r2.intValue()
            if (r2 == r4) goto L43
        L42:
            goto L2f
        L43:
            java.lang.Integer r2 = r0.f556018c
            if (r2 == 0) goto L55
            int r4 = r6.getDeviceClass()
            if (r2 != 0) goto L4e
            goto L54
        L4e:
            int r2 = r2.intValue()
            if (r2 == r4) goto L55
        L54:
            goto L2f
        L55:
            java.lang.Integer r2 = r0.f556019d
            if (r2 == 0) goto L67
            int r4 = r6.getDeviceSubclass()
            if (r2 != 0) goto L60
            goto L66
        L60:
            int r2 = r2.intValue()
            if (r2 == r4) goto L67
        L66:
            goto L2f
        L67:
            java.lang.Integer r0 = r0.f556020e
            if (r0 == 0) goto L79
            int r2 = r6.getDeviceProtocol()
            if (r0 != 0) goto L72
            goto L78
        L72:
            int r0 = r0.intValue()
            if (r0 == r2) goto L79
        L78:
            goto L2f
        L79:
            r0 = r3
        L7a:
            if (r0 == 0) goto L11
            r1 = r3
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zn1.i0.c(android.hardware.usb.UsbDevice, java.util.List):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v12, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.hardware.usb.UsbDevice r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zn1.d0
            if (r0 == 0) goto L13
            r0 = r8
            zn1.d0 r0 = (zn1.d0) r0
            int r1 = r0.f555964i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f555964i = r1
            goto L18
        L13:
            zn1.d0 r0 = new zn1.d0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f555962g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f555964i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 != r4) goto L37
            java.lang.Object r7 = r0.f555961f
            kotlinx.coroutines.sync.d r7 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) r7
            java.lang.Object r1 = r0.f555960e
            android.hardware.usb.UsbManager r1 = (android.hardware.usb.UsbManager) r1
            java.lang.Object r0 = r0.f555959d
            android.hardware.usb.UsbDevice r0 = (android.hardware.usb.UsbDevice) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r2 = r7
            r7 = r0
            goto Lca
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "[processAuthorizedDevice] device@"
            r8.<init>(r2)
            int r2 = r7.hashCode()
            r8.append(r2)
            r2 = 61
            r8.append(r2)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "UsbDeviceManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8)
            boolean r8 = r6.b(r7)
            if (r8 != 0) goto L84
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Not an android device@"
            r8.<init>(r0)
            int r7 = r7.hashCode()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r7)
            zn1.j r7 = new zn1.j
            java.lang.String r8 = "Not an android device"
            r7.<init>(r8)
            return r7
        L84:
            android.content.Context r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r5 = "usb"
            java.lang.Object r8 = r8.getSystemService(r5)
            android.hardware.usb.UsbManager r8 = (android.hardware.usb.UsbManager) r8
            if (r8 != 0) goto Lae
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "[processDevice] Fail to get usb manager, device@"
            r8.<init>(r0)
            int r7 = r7.hashCode()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r7)
            zn1.j r7 = new zn1.j
            java.lang.String r8 = "Fail to get usb manager"
            r7.<init>(r8)
            return r7
        Lae:
            r8.hasPermission(r7)
            yn1.z0 r2 = yn1.z0.f545466a
            r2.e()
            kotlinx.coroutines.sync.d r2 = zn1.i0.f555983d
            r0.f555959d = r7
            r0.f555960e = r8
            r0.f555961f = r2
            r0.f555964i = r4
            kotlinx.coroutines.sync.k r2 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r2
            java.lang.Object r0 = r2.b(r3, r0)
            if (r0 != r1) goto Lc9
            return r1
        Lc9:
            r1 = r8
        Lca:
            zn1.i0 r8 = zn1.i0.f555980a     // Catch: java.lang.Throwable -> Ld6
            zn1.m r7 = r8.a(r7, r1)     // Catch: java.lang.Throwable -> Ld6
            kotlinx.coroutines.sync.k r2 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r2
            r2.d(r3)
            return r7
        Ld6:
            r7 = move-exception
            kotlinx.coroutines.sync.k r2 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r2
            r2.d(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zn1.i0.d(android.hardware.usb.UsbDevice, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean e(android.hardware.usb.UsbDeviceConnection usbDeviceConnection, int i17, java.lang.String str) {
        byte[] m17 = r26.i0.m(str);
        int controlTransfer = usbDeviceConnection.controlTransfer(64, 52, 0, i17, m17, m17.length, 2000);
        if (controlTransfer < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("UsbDeviceManager", "[sendAoaInitString] Fail to do controlTransfer, sendLength=" + controlTransfer + ", index=" + i17 + ", content=" + str);
        }
        return controlTransfer >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0132 -> B:23:0x0135). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn1.i0.f(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
