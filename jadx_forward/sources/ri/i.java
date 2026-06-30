package ri;

/* loaded from: classes12.dex */
public abstract class i {
    public static java.lang.String a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return java.lang.Character.toTitleCase(str.charAt(0)) + str.substring(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0157, code lost:
    
        if (r15.contains(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29) == false) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0226  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m3.d b(rh.o2 r15) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.i.b(rh.o2):m3.d");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static java.lang.String c(rh.c1 c1Var) {
        char c17;
        java.lang.String str = c1Var.f476870s;
        switch (str.hashCode()) {
            case -1462962565:
                if (str.equals("alertBatt")) {
                    c17 = 4;
                    break;
                }
                c17 = 65535;
                break;
            case -1367725928:
                if (str.equals("canary")) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            case -1068784020:
                if (str.equals("module")) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case 97555:
                if (str.equals("biz")) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case 1192142491:
                if (str.equals("alertThermal")) {
                    c17 = 3;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        if (c17 == 0) {
            return a(((gi.w0) c1Var).z());
        }
        if (c17 != 1) {
            return a(str);
        }
        return a(str) + a(((gi.w0) c1Var).z());
    }

    public static int d() {
        int d17 = wh.m.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.app.w.INSTANCE.f135422n);
        if (d17 == 2 && com.p314xaae8f345.mm.app.q5.b().d()) {
            return 4;
        }
        return d17;
    }

    public static int e() {
        return wh.m.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    public static java.lang.String f() {
        java.lang.String a17 = bm5.f1.a();
        return android.text.TextUtils.isEmpty(a17) ? "" : g(a17);
    }

    public static java.lang.String g(java.lang.String str) {
        return !str.contains(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b) ? str : str.contains(":") ? str.substring(str.lastIndexOf(":") + 1) : com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
    }

    public static m3.d h(qh.b bVar) {
        java.lang.String str = bVar.f444849i;
        int i17 = bVar.f444850j;
        if ("background".equals(str)) {
            if (android.text.TextUtils.isEmpty(bVar.f444851k)) {
                java.lang.String str2 = gi.p.f353609b;
                if (!com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a.equals(str2)) {
                    i17 = -1;
                    str = str2;
                }
            } else {
                str = bVar.f444851k;
                i17 = bVar.f444852l;
            }
        }
        return new m3.d(str, java.lang.Integer.valueOf(i17));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String i(java.lang.String r4, int r5) {
        /*
            java.lang.String r0 = "name"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            r0 = 0
            if (r5 <= 0) goto L1f
            boolean r1 = pj.e.f(r4, r5)
            if (r1 == 0) goto L1f
            java.lang.String r5 = "_fake"
            boolean r0 = r26.i0.n(r4, r5, r0)
            if (r0 == 0) goto L19
            goto Ld4
        L19:
            java.lang.String r4 = r4.concat(r5)
            goto Ld4
        L1f:
            java.lang.String r1 = "Thread-"
            if (r5 <= 0) goto L45
            boolean r2 = r26.i0.y(r4, r1, r0)
            if (r2 == 0) goto L45
            jz5.g r2 = gi.c.f353524a
            java.lang.Object r2 = r2.mo141623x754a37bb()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L45
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)
            goto L46
        L45:
            r2 = r4
        L46:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto Lbb
            java.lang.String r3 = "[GT]ColdPool#"
            boolean r3 = r26.n0.B(r2, r3, r0)
            if (r3 == 0) goto L58
            java.lang.String r4 = "[GT]ColdPool"
            goto Ld4
        L58:
            java.lang.String r3 = "[GT]HotPool#"
            boolean r3 = r26.n0.B(r2, r3, r0)
            if (r3 == 0) goto L64
            java.lang.String r4 = "[GT]HotPool"
            goto Ld4
        L64:
            java.lang.String r3 = "TPDecoder#"
            boolean r3 = r26.i0.y(r2, r3, r0)
            if (r3 == 0) goto L70
            java.lang.String r4 = "TPDecoder"
            goto Ld4
        L70:
            java.lang.String r3 = "mars::"
            boolean r3 = r26.n0.B(r2, r3, r0)
            if (r3 == 0) goto L7b
            java.lang.String r4 = "mars::xxx"
            goto Ld4
        L7b:
            boolean r1 = r26.i0.y(r2, r1, r0)
            if (r1 == 0) goto L84
            java.lang.String r4 = "Thread-xxx"
            goto Ld4
        L84:
            java.lang.String r1 = "Binder:"
            boolean r1 = r26.i0.y(r2, r1, r0)
            if (r1 == 0) goto L8f
            java.lang.String r4 = "Binder:xxx"
            goto Ld4
        L8f:
            java.lang.String r1 = "wc_srvinit_"
            boolean r1 = r26.i0.y(r2, r1, r0)
            if (r1 == 0) goto L9c
            java.lang.String r4 = "wc_srvinit_xxx"
            goto Ld4
        L9c:
            java.lang.String r1 = "JSAdBrandSer#"
            boolean r3 = r26.i0.y(r2, r1, r0)
            if (r3 == 0) goto La6
        La4:
            r4 = r1
            goto Ld4
        La6:
            java.lang.String r1 = "JSBrandServi#"
            boolean r3 = r26.i0.y(r2, r1, r0)
            if (r3 == 0) goto Laf
            goto La4
        Laf:
            java.lang.String r1 = ".raster"
            boolean r1 = r26.i0.n(r2, r1, r0)
            if (r1 == 0) goto Lbb
            java.lang.String r4 = "xxx.raster"
            goto Ld4
        Lbb:
            kh.q3 r1 = kh.q3.f389430a
            java.lang.String r4 = r1.b(r4, r5)
            if (r4 == 0) goto Ld0
            int r5 = r4.length()
            r1 = 1
            if (r5 <= 0) goto Lcc
            r5 = r1
            goto Lcd
        Lcc:
            r5 = r0
        Lcd:
            if (r5 != r1) goto Ld0
            r0 = r1
        Ld0:
            if (r0 == 0) goto Ld3
            goto Ld4
        Ld3:
            r4 = r2
        Ld4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.i.i(java.lang.String, int):java.lang.String");
    }
}
