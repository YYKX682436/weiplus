package qm;

/* loaded from: classes9.dex */
public class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.ref.WeakReference f446150d;

    /* renamed from: e, reason: collision with root package name */
    public static int f446151e;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f446152a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f446153b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f446154c = "";

    public static void a(int i17, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f) {
        java.lang.String str;
        if (c19772x1c2cd081.f38869x6ac9171.length() == 32 && (i17 == 47 || i17 == 1048625)) {
            return;
        }
        if (c19772x1c2cd081.f38869x6ac9171.length() >= 200) {
            boolean z17 = com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d;
            int h17 = com.p314xaae8f345.mm.p2614xca6eae71.l0.f274840a.h(c19772x1c2cd081.f38869x6ac9171, 0, 200);
            java.lang.String str2 = c19772x1c2cd081.f38869x6ac9171;
            while (true) {
                if (h17 >= str2.length()) {
                    h17 = str2.length();
                    break;
                } else if (str2.charAt(h17) != '%') {
                    break;
                } else {
                    h17++;
                }
            }
            c19772x1c2cd081.f38869x6ac9171 = str2.substring(0, h17);
        }
        java.lang.ref.WeakReference weakReference = f446150d;
        android.text.TextPaint textPaint = weakReference == null ? null : (android.text.TextPaint) weakReference.get();
        if (c19772x1c2cd081.f38869x6ac9171.replace("%%", "").contains("%s") || textPaint == null) {
            c19767x257d7f.f38864x6ac9171 = 0;
            return;
        }
        try {
            str = java.lang.String.format(c19772x1c2cd081.f38869x6ac9171, c19772x1c2cd0812.f38869x6ac9171);
        } catch (java.lang.Exception unused) {
            str = c19772x1c2cd081.f38869x6ac9171;
        }
        android.text.SpannableString cj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).cj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, false);
        int i18 = f446151e;
        if (i18 <= 0) {
            i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 200.0f);
        }
        c19772x1c2cd081.f38869x6ac9171 = android.text.TextUtils.ellipsize(cj6, textPaint, i18, android.text.TextUtils.TruncateAt.END).toString();
        c19767x257d7f.f38864x6ac9171 = 1;
    }

    public static boolean b(int i17, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081, java.lang.String str, java.lang.String str2) {
        if (c19772x1c2cd081.f38869x6ac9171.length() != 32 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c19772x1c2cd081.f38869x6ac9171, str2)) {
            return false;
        }
        if (i17 != 47 && i17 != 1048625) {
            return false;
        }
        c19772x1c2cd081.f38869x6ac9171 = str;
        return true;
    }

    public static java.lang.String d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, boolean z17) {
        java.lang.String e27 = f9Var.O2() ? f9Var.e2() : f9Var.j();
        java.lang.String e17 = f9Var.t2() ? com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.e(m(f9Var.z0(), f9Var.A0(), f9Var.Q0(), e27, f9Var.mo78013xfb85f7b0(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c19772x1c2cd081, c19772x1c2cd0812, c19767x257d7f, true, z17, f9Var.R1(), f9Var.P1(), false)) : m(f9Var.z0(), f9Var.A0(), f9Var.Q0(), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.e(e27), f9Var.mo78013xfb85f7b0(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c19772x1c2cd081, c19772x1c2cd0812, c19767x257d7f, true, z17, f9Var.R1(), f9Var.P1(), false);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return e17 == null ? "" : e17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(android.content.Context r6, int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 r11, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.a0.e(android.content.Context, int, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PString):java.lang.String");
    }

    public static java.lang.String g(android.content.Context context) {
        boolean z17 = (c01.z1.n() & 128) == 0;
        long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) c01.d9.b().p().l(65793, null), 0L);
        return !z17 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iwl) : k17 == 0 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdl) : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(k17) * 1000 > 1209600000 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdk, java.lang.Long.valueOf((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(k17) * 1000) / 86400000)) : "";
    }

    public static boolean j(java.lang.String str) {
        java.lang.String str2;
        try {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
            if (d17 != null && (str2 = (java.lang.String) d17.get(".msg.appmsg.mmreadershare.itemshowtype")) != null) {
                if (str2.equals("16")) {
                    return true;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return false;
    }

    public static boolean k(java.lang.String str) {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.f4(str) && !c01.z1.F()) {
            return true;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.u4(str)) {
            if (!((c01.z1.p() & 64) != 0)) {
                return true;
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.v4(str)) {
            if (!((c01.z1.n() & 128) == 0)) {
                return true;
            }
        }
        return false;
    }

    public static java.lang.String l(int i17, java.lang.String str, java.lang.String str2, int i18, android.content.Context context) {
        java.lang.String m17 = m(null, i17, str, str2, i18, context, new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081(), new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081(), new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(), false, false, "", 0, false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return m17 == null ? "" : m17;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:193:0x175a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:194:0x175d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:196:0x1762. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:197:0x1765. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:198:0x1768. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:199:0x176b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x01e7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:83:0x0200. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x0203. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:86:0x0208. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:88:0x0218. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x24cd  */
    /* JADX WARN: Removed duplicated region for block: B:1273:0x1052  */
    /* JADX WARN: Removed duplicated region for block: B:1283:0x1093  */
    /* JADX WARN: Removed duplicated region for block: B:1300:0x10ee  */
    /* JADX WARN: Removed duplicated region for block: B:1310:0x112f  */
    /* JADX WARN: Removed duplicated region for block: B:1327:0x118a  */
    /* JADX WARN: Removed duplicated region for block: B:1337:0x11c8  */
    /* JADX WARN: Removed duplicated region for block: B:1640:0x2425  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x1732  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x1736  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x1ef3  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x1f10  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x1f2c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x1f2e  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x1f15  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x1ef6  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x1a09  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x1e15  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x1e31  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x1e33  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x1e1a  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x1acd  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x1af7  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x1ae0  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x1c27 A[PHI: r2
  0x1c27: PHI (r2v123 java.lang.String) = (r2v119 java.lang.String), (r2v125 java.lang.String), (r2v125 java.lang.String) binds: [B:554:0x1926, B:196:0x1762, B:197:0x1765] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x1c45  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x1c4a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x170e  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x171a  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x171c  */
    /* JADX WARN: Removed duplicated region for block: B:746:0x1713  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x14cc  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x14e8  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x14eb  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x14d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x2455  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x245d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m(java.lang.String r34, int r35, java.lang.String r36, java.lang.String r37, int r38, android.content.Context r39, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 r40, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 r41, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f r42, boolean r43, boolean r44, java.lang.String r45, int r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 10258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.a0.m(java.lang.String, int, java.lang.String, java.lang.String, int, android.content.Context, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PInt, boolean, boolean, java.lang.String, int, boolean):java.lang.String");
    }

    public static java.lang.String n(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int indexOf;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || (indexOf = str.indexOf(str2)) < 0) {
            return str;
        }
        return str.substring(0, indexOf) + str3 + str.substring(indexOf + str2.length());
    }

    public static void o(android.text.TextPaint textPaint) {
        java.lang.ref.WeakReference weakReference = f446150d;
        if (weakReference == null || weakReference.get() == null) {
            f446150d = new java.lang.ref.WeakReference(textPaint);
        }
    }

    public final java.lang.String c(java.lang.String str, int i17) {
        if (str == null) {
            return "";
        }
        if (str.length() < i17) {
            return str;
        }
        return str.substring(0, i17) + "...";
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0107, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0169, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L115;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(android.content.Context r10, java.lang.String r11, java.lang.String r12, int r13, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r14) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.a0.f(android.content.Context, java.lang.String, java.lang.String, int, com.tencent.mm.storage.f9):java.lang.String");
    }

    public void h(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, int i17, int i18, int i19, boolean z17, boolean z18) {
        java.lang.String quantityString;
        if (z18) {
            int[] iArr = {java.lang.Math.max(1, i17 >= 0 ? i17 : ip.l.c()), java.lang.Math.max(1, i19 >= 0 ? i19 : ip.l.b())};
            quantityString = context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571222t, iArr[0], f(context, null, str, 0, null), java.lang.Integer.valueOf(iArr[1]));
        } else {
            int[] iArr2 = {java.lang.Math.max(1, i17 >= 0 ? i17 : ip.l.c()), java.lang.Math.max(1, i18 >= 0 ? i18 : ip.l.b())};
            android.content.res.Resources resources = context.getResources();
            int i27 = iArr2[0];
            quantityString = resources.getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571221z, i27, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(iArr2[1]));
        }
        if (f9Var != null ? f9Var.s2(c01.z1.r()) : false) {
            quantityString = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573995gq2) + quantityString;
        } else {
            int a17 = ip.l.a(f9Var != null ? f9Var.Q0() : null);
            if (f9Var != null && f9Var.r2()) {
                int i28 = a17 % com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb;
                if (i28 >= 4096 || i28 <= 0) {
                    quantityString = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573994gq1) + quantityString;
                } else {
                    quantityString = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573995gq2) + quantityString;
                }
            } else if (a17 > 0) {
                quantityString = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573995gq2) + quantityString;
            }
        }
        this.f446152a = quantityString;
        this.f446153b = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g1j);
        this.f446154c = z17 ? null : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbp);
    }

    public final boolean i(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var != null && f9Var.t0() != -1) {
            ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
            if (r01.z.g(str)) {
                return true;
            }
        }
        return false;
    }
}
