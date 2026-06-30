package o13;

/* loaded from: classes12.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f423774a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f423775b = {"wxid_", "wx_", "gh_"};

    public static final java.lang.String a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String content = str.trim();
        ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).getClass();
        com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().getClass();
        com.p314xaae8f345.mm.p2614xca6eae71.t1 a17 = com.p314xaae8f345.mm.p2614xca6eae71.t1.a();
        a17.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        int length = content.length();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        a17.f274927k.b(content, 0, length, new com.p314xaae8f345.mm.p2614xca6eae71.r1(sb6, content, f0Var, "\u2000"));
        int i17 = f0Var.f391649d;
        if (i17 < length) {
            sb6.append((java.lang.CharSequence) content, i17, length);
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return o13.s.c(sb7);
    }

    public static int b(int[] iArr, int i17, int i18) {
        if (i17 == i18) {
            return 0;
        }
        return (i17 >= iArr.length ? Integer.MAX_VALUE : iArr[i17]) - (i18 < iArr.length ? iArr[i18] : Integer.MAX_VALUE);
    }

    public static java.util.List c() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218914f != null) {
            p75.n0 n0Var = dm.g3.f318580n;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            linkedList2.add(dm.g3.f318583q);
            p75.m c17 = dm.g3.f318581o.i(131075).c(dm.g3.f318582p.i(38));
            linkedList3.add(dm.g3.f318584r.u());
            p75.i0 g17 = dm.g3.f318580n.g(linkedList2);
            g17.f434190d = c17;
            g17.d(linkedList3);
            g17.b(linkedList4);
            java.util.Iterator it = ((java.util.ArrayList) g17.a().k(((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218914f.l(), dm.g3.class)).iterator();
            while (it.hasNext()) {
                linkedList.add(((dm.g3) it.next()).t0());
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTS.FTSApiLogic", "ftsIndexDB is null, use contactStg instead");
            android.database.Cursor r17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().r();
            while (r17.moveToNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.mo9015xbf5d97fd(r17);
                linkedList.add(z3Var.d1());
            }
            r17.close();
        }
        return linkedList;
    }

    public static java.lang.String d(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null) {
            return str;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0())) {
            return n17.w0();
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.P0())) {
            return n17.f2();
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(n17.d1())) {
            java.lang.String m77950x40021d37 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().m77950x40021d37(str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m77950x40021d37)) {
                return m77950x40021d37;
            }
        }
        return n17.d1();
    }

    public static java.lang.String e(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        return (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) || (n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true)) == null) ? str : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.y0()) ? n17.y0() : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.U0()) ? n17.U0() : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.t0()) ? n17.t0() : str;
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2) {
        if (str2 != null && str2.length() > 0) {
            return str2;
        }
        for (java.lang.String str3 : f423775b) {
            if (str.startsWith(str3)) {
                return null;
            }
        }
        if (str.indexOf(64) >= 0) {
            return null;
        }
        return str;
    }

    public static long g(int i17) {
        return h(i17 + "_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(gm0.j1.b().j()) + "_" + java.lang.System.currentTimeMillis());
    }

    public static long h(java.lang.String str) {
        try {
            char[] charArray = "0123456789ABCDEF".toCharArray();
            byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(str.getBytes());
            char[] cArr = new char[digest.length * 2];
            for (int i17 = 0; i17 < digest.length; i17++) {
                int i18 = digest[i17] & 255;
                int i19 = i17 * 2;
                cArr[i19] = charArray[i18 >>> 4];
                cArr[i19 + 1] = charArray[i18 & 15];
            }
            return new java.math.BigInteger(new java.lang.String(cArr), 16).longValue();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSApiLogic", e17, "getMd5UInt", new java.lang.Object[0]);
            return 0L;
        }
    }

    public static java.lang.String i(java.lang.String str, boolean z17) {
        if (str == null) {
            return null;
        }
        java.lang.String lowerCase = a(str).toLowerCase();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z18 = false;
        for (int i17 = 0; i17 < lowerCase.length(); i17++) {
            char charAt = lowerCase.charAt(i17);
            if (o13.s.a(charAt)) {
                java.lang.String[] strArr = (java.lang.String[]) o13.s.f423799l.get(java.lang.String.valueOf(charAt));
                if (strArr == null || strArr.length <= 0 || strArr[0].length() < 1) {
                    arrayList.add("\u2001");
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (int i18 = 0; i18 < strArr.length; i18++) {
                        java.lang.String substring = z17 ? strArr[i18].substring(0, 1) : strArr[i18];
                        if (!arrayList2.contains(substring)) {
                            arrayList2.add(substring);
                        }
                    }
                    arrayList.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList2, "\u200f"));
                    z18 = true;
                }
            } else {
                arrayList.add("\u2001");
            }
        }
        if (z18) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, "\u200d");
        }
        return null;
    }

    public static java.lang.String j(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String lowerCase = a(str).toLowerCase();
        new java.util.ArrayList();
        java.lang.String str2 = "";
        for (int i17 = 0; i17 < lowerCase.length(); i17++) {
            char charAt = lowerCase.charAt(i17);
            if (o13.s.a(charAt)) {
                java.lang.String[] strArr = (java.lang.String[]) o13.s.f423799l.get(java.lang.String.valueOf(charAt));
                if (strArr != null && strArr.length > 0 && strArr[0].length() >= 1) {
                    str2 = str2 + strArr[0];
                }
            } else {
                str2 = str2 + java.lang.String.valueOf(lowerCase.charAt(i17));
            }
        }
        return str2;
    }

    public static java.lang.String k(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String replace = a(str).replace("\u2000", "\u007f");
        java.lang.String upperCase = replace.toUpperCase();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < upperCase.length() && i17 < replace.length(); i17++) {
            char charAt = upperCase.charAt(i17);
            char charAt2 = replace.charAt(i17);
            boolean z17 = true;
            if (o13.s.a(charAt)) {
                java.lang.String[] strArr = (java.lang.String[]) o13.s.f423799l.get(java.lang.String.valueOf(charAt));
                if (strArr == null || strArr.length <= 0 || strArr[0].length() < 1) {
                    if ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < 'a' || charAt2 > 'z') && (charAt2 < '0' || charAt2 > '9'))) {
                        z17 = false;
                    }
                    if (z17) {
                        arrayList.add(charAt2 + "");
                    } else {
                        arrayList.add("");
                    }
                } else {
                    arrayList.add(strArr[0].toUpperCase());
                }
            } else {
                if ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < 'a' || charAt2 > 'z') && (charAt2 < '0' || charAt2 > '9'))) {
                    z17 = false;
                }
                if (z17) {
                    arrayList.add(charAt2 + "");
                } else {
                    arrayList.add("");
                }
            }
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, "").toUpperCase(java.util.Locale.getDefault());
    }

    public static java.lang.String l(int i17) {
        return o13.p.c(h(i17 + "_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(gm0.j1.b().j()) + "_" + java.lang.System.currentTimeMillis()));
    }

    public static java.lang.String m(int[] iArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(32);
        sb6.append('(');
        for (int i17 : iArr) {
            sb6.append(i17);
            sb6.append(',');
        }
        sb6.setCharAt(sb6.length() - 1, ')');
        return sb6.toString();
    }

    public static boolean n(java.lang.String str) {
        return str != null && str.length() < 20 && str.matches("^[0-9]+$");
    }

    public static boolean o(java.lang.String str) {
        return str != null && str.length() < 20 && str.matches("^[A-Za-z][A-Za-z0-9\\-_]+$");
    }

    public static final java.lang.String p(java.lang.String str) {
        if (str != null) {
            return str.replace('*', ' ').trim();
        }
        return null;
    }

    public static void q(android.content.Context context, java.lang.String str, android.content.Intent intent) {
        if (intent == null) {
            try {
                intent = new android.content.Intent();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSApiLogic", "Class Not Found when startActivity %s", e17);
                return;
            }
        }
        if (str.startsWith(".")) {
            str = "com.tencent.mm.plugin.fts".concat(str);
        }
        intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, str);
        java.lang.Class.forName(str, false, context.getClassLoader());
        if (context instanceof android.app.Activity) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        intent.addFlags(268435456);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
