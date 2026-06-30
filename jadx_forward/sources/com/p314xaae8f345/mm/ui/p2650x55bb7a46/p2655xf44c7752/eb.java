package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class eb {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.eb f282435a = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.eb();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f282436b = new java.util.HashMap();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            c01.n2 r0 = c01.n2.d()
            r1 = 1
            c01.l2 r6 = r0.c(r6, r1)
            java.lang.String r0 = "PlayUrl"
            java.lang.String r1 = ""
            java.lang.String r0 = r6.f(r0, r1)
            java.lang.String r1 = "SaveTime"
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L31
            java.util.Map r6 = r6.f118838a
            c01.k2 r6 = (c01.k2) r6
            java.lang.Object r6 = r6.get(r1)
            boolean r1 = r6 instanceof java.lang.Long
            if (r1 == 0) goto L31
            java.lang.Long r6 = (java.lang.Long) r6
            long r1 = r6.longValue()
            goto L33
        L31:
            r1 = 0
        L33:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            long r1 = java.lang.Math.abs(r3)
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L45
            r6 = 0
            return r6
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.eb.a(java.lang.String):java.lang.String");
    }

    public final r45.kq4 b(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("MpShareVideoPlayInfo");
        r45.kq4 kq4Var = new r45.kq4();
        kq4Var.f460438g = R.o(key.concat("VideoSize"), 0);
        kq4Var.f460436e = R.o(key.concat("block"), 0);
        kq4Var.f460437f = R.u(key.concat("errMsg"), "");
        return kq4Var;
    }
}
