package p36;

/* loaded from: classes16.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f433254a = 0;

    static {
        x36.n nVar = x36.o.f533229h;
        nVar.a("\"\\");
        nVar.a("\t ,=");
    }

    public static long a(l36.a1 a1Var) {
        java.lang.String c17 = a1Var.f396993i.c("Content-Length");
        if (c17 != null) {
            try {
                return java.lang.Long.parseLong(c17);
            } catch (java.lang.NumberFormatException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    public static boolean b(l36.a1 a1Var) {
        if (a1Var.f396988d.f397215b.equals("HEAD")) {
            return false;
        }
        int i17 = a1Var.f396990f;
        return (((i17 >= 100 && i17 < 200) || i17 == 204 || i17 == 304) && a(a1Var) == -1 && !"chunked".equalsIgnoreCase(a1Var.b("Transfer-Encoding"))) ? false : true;
    }

    public static int c(java.lang.String str, int i17) {
        try {
            long parseLong = java.lang.Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (java.lang.NumberFormatException unused) {
            return i17;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01f6, code lost:
    
        if (r11 != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x030c, code lost:
    
        if (r0 != null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0207, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0205, code lost:
    
        if (r11 == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01c3, code lost:
    
        if ((r0.equals(r14) || (r0.endsWith(r14) && r0.charAt((r0.length() - r14.length()) - 1) == '.' && !m36.e.f404926h.matcher(r0).matches())) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e8, code lost:
    
        if (r20 <= 0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0362 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(l36.y r33, l36.k0 r34, l36.i0 r35) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p36.g.d(l36.y, l36.k0, l36.i0):void");
    }

    public static int e(java.lang.String str, int i17, java.lang.String str2) {
        while (i17 < str.length() && str2.indexOf(str.charAt(i17)) == -1) {
            i17++;
        }
        return i17;
    }

    public static java.util.Set f(l36.i0 i0Var) {
        java.util.Set emptySet = java.util.Collections.emptySet();
        int length = i0Var.f397048a.length / 2;
        for (int i17 = 0; i17 < length; i17++) {
            if ("Vary".equalsIgnoreCase(i0Var.d(i17))) {
                java.lang.String f17 = i0Var.f(i17);
                if (emptySet.isEmpty()) {
                    emptySet = new java.util.TreeSet(java.lang.String.CASE_INSENSITIVE_ORDER);
                }
                for (java.lang.String str : f17.split(",")) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }
}
