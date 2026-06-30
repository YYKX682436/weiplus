package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public final class f0 implements kg1.f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f165683a = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.ENGLISH);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f165684b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f165685c;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c() {
        /*
            java.lang.String r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.f0.f165685c
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.f0.f165685c
            return r0
        Lb:
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()
            r1 = 0
            if (r0 == 0) goto L29
            boolean r0 = gm0.j1.a()
            if (r0 != 0) goto L20
            java.lang.String r0 = "MicroMsg.DefaultKeyStepLogger"
            java.lang.String r2 = "doGetAccPath not accHasReady"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r2)
            goto L3a
        L20:
            gm0.b0 r0 = gm0.j1.u()
            java.lang.String r0 = r0.h()
            goto L3e
        L29:
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b
            com.tencent.mm.ipcinvoker.type.IPCVoid r2 = new com.tencent.mm.ipcinvoker.type.IPCVoid
            r2.<init>()
            java.lang.Class<com.tencent.mm.plugin.appbrand.keylogger.e0> r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.e0.class
            java.lang.Object r0 = com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(r0, r2, r3)
            com.tencent.mm.ipcinvoker.type.IPCString r0 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) r0
            if (r0 != 0) goto L3c
        L3a:
            r0 = r1
            goto L3e
        L3c:
            java.lang.String r0 = r0.f149939d
        L3e:
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r2 == 0) goto L45
            return r1
        L45:
            java.lang.String r1 = "/"
            boolean r2 = r0.endsWith(r1)
            if (r2 != 0) goto L51
            java.lang.String r0 = r0.concat(r1)
        L51:
            java.lang.String r1 = "%skeystep/"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = java.lang.String.format(r1, r0)
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.f0.f165685c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.f0.c():java.lang.String");
    }

    public static long e(java.lang.String str) {
        if (str == null) {
            return 0L;
        }
        java.lang.String[] split = str.split("-", -1);
        if (split == null || split.length != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DefaultKeyStepLogger", "getTimeFromDateFormatStr invalid date:%s", str);
            return 0L;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        try {
            calendar.set(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[0], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[2], 0));
            return calendar.getTimeInMillis();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DefaultKeyStepLogger", "getTimeFromDateFormatStr exp:%s", e17);
            return 0L;
        }
    }

    @Override // kg1.f
    public java.util.List a(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.vfs.r6[] G;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String d17 = d(j17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            return arrayList;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(d17);
        if (!r6Var.y() || (G = r6Var.G()) == null) {
            return arrayList;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DefaultKeyStepLogger", "collectLogPathsByProcessAndDate : %s", str);
        for (int i17 = 0; i17 < G.length; i17++) {
            if (G[i17].m82467xfb82e301().startsWith(str)) {
                arrayList.add(G[i17].o());
            }
        }
        return arrayList;
    }

    @Override // kg1.f
    public void b(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.c0(this, str2, objArr, str), "MMTempKeyStepLogger");
    }

    public final java.lang.String d(long j17) {
        java.util.Map map = f165684b;
        if (((java.util.HashMap) map).containsKey(java.lang.Long.valueOf(j17))) {
            return (java.lang.String) ((java.util.HashMap) map).get(java.lang.Long.valueOf(j17));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c())) {
            return null;
        }
        java.lang.String format = java.lang.String.format("%s%s/", c(), f165683a.format(java.lang.Long.valueOf(j17)));
        com.p314xaae8f345.mm.vfs.w6.u(format);
        ((java.util.HashMap) map).put(java.lang.Long.valueOf(j17), format);
        return format;
    }
}
