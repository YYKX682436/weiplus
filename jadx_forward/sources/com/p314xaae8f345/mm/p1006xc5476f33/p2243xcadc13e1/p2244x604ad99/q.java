package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99;

@j95.b
/* loaded from: classes8.dex */
public class q extends i95.w implements k35.q {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o f253684d = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f253685e = new java.util.HashMap();

    public q() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("new SubCoreJDBiz this: ");
        sb6.append(hashCode());
        sb6.append(" stack: ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreJdIP6", sb6.toString());
    }

    public static java.lang.String Bi(java.lang.String str, int i17) {
        if (-1 != str.indexOf(35)) {
            return str;
        }
        if (-1 == str.indexOf(63)) {
            return str + "?wc_scene=" + i17;
        }
        return str + "&wc_scene=" + i17;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q Di() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.class);
    }

    public static void cj(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o oVar) {
        gm0.j1.b().c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q Di = Di();
        if (Di.f253684d == null) {
            Di.f253684d = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o.a();
        }
        java.lang.String str = Di.f253684d.f253683s;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = oVar.f253683s;
        if (str2 == null) {
            str2 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreJdIP6", "updatejdMsgContent old: %s new: %s", str, str2);
        if (!oVar.c(Di.f253684d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreJdIP6", "fo zu baoyou! the activityid is same");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f253671g) || oVar.f253670f) {
            c01.d9.b().p().w(327939, "1");
        }
        if (oVar.f253669e) {
            c01.d9.b().p().w(327938, "1");
        } else {
            c01.d9.b().p().w(327938, "");
        }
        Di.f253684d = oVar;
        c01.d9.b().p().w(327942, oVar.f253683s);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.p(Di));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_JD_ENTRANCE_RESET_EXPOSURE_FLAG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }

    public void Ai() {
        c01.d9.b().p().w(327938, "");
    }

    public java.lang.String Ni() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("JDEntranceConfigJumpUrl");
    }

    public java.lang.String Ri() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m() ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("JDEntranceConfigName") : com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n() ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("JDEntranceConfigNameHKTW") : ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("JDEntranceConfigNameEN");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String Ui() {
        /*
            r12 = this;
            com.tencent.mm.plugin.subapp.jdbiz.o r0 = r12.Zi()
            boolean r1 = r12.bj()
            r2 = 1
            java.lang.String r3 = ""
            if (r1 == 0) goto L3d
            boolean r1 = r0.d()
            if (r1 != 0) goto L37
            java.lang.String r1 = "3"
            java.lang.String r4 = r0.f253665a
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L37
            java.lang.String r1 = r0.f253679o
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r1 != 0) goto L37
            java.lang.String r1 = r0.f253679o
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = "MicroMsg.SubCoreJdIP6"
            java.lang.String r4 = "jumpUrl update %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r1)
            java.lang.String r3 = r0.f253679o
            r1 = 6
            goto L3e
        L37:
            boolean r1 = r0.f253670f
            if (r1 == 0) goto L3d
            r1 = 2
            goto L3e
        L3d:
            r1 = r2
        L3e:
            java.lang.String r4 = r0.f253665a
            java.lang.String r5 = "2"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L7b
            java.lang.String r4 = r0.f253679o
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r4 != 0) goto L7b
            long r4 = r0.f253673i
            long r6 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 0
            if (r4 >= 0) goto L60
            r4 = r2
            goto L61
        L60:
            r4 = r5
        L61:
            if (r4 == 0) goto L7b
            long r6 = r0.f253674j
            r10 = 0
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 / r8
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 >= 0) goto L75
            goto L76
        L75:
            r2 = r5
        L76:
            if (r2 != 0) goto L7b
            java.lang.String r3 = r0.f253679o
            r1 = 3
        L7b:
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r0 != 0) goto L86
            java.lang.String r0 = Bi(r3, r1)
            return r0
        L86:
            java.lang.String r0 = r12.Ni()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q.Ui():java.lang.String");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.n Vi() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.n();
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o Zi = Zi();
        if (bj() && !Zi.d() && "3".equals(Zi.f253665a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreJdIP6", "bizType %s, jumpWeapp update user:%s path:%s version:%d", Zi.f253665a, Zi.f253680p, Zi.f253681q, java.lang.Integer.valueOf(Zi.f253682r));
            nVar.f253662a = Zi.f253680p;
            nVar.f253663b = Zi.f253681q;
            nVar.f253664c = Zi.f253682r;
        }
        if ("2".equals(Zi.f253665a)) {
            if (Zi.f253673i < java.lang.System.currentTimeMillis() / 1000) {
                long j17 = Zi.f253674j;
                if (!(j17 != 0 && j17 < java.lang.System.currentTimeMillis() / 1000)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreJdIP6", "bizType %s, jumpWeapp update user:%s path:%s version:%d", Zi.f253665a, Zi.f253680p, Zi.f253681q, java.lang.Integer.valueOf(Zi.f253682r));
                    nVar.f253662a = Zi.f253680p;
                    nVar.f253663b = Zi.f253681q;
                    nVar.f253664c = Zi.f253682r;
                }
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar.f253662a)) {
            return nVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.n nVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.n();
        nVar2.f253662a = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("JDEntranceConfigJumpWeAppUsername");
        nVar2.f253663b = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("JDEntranceConfigJumpWeAppPath");
        nVar2.f253664c = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("JDEntranceConfigJumpWeAppVersion", 0);
        return nVar2;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o Zi() {
        if (this.f253684d == null) {
            this.f253684d = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.o.a();
        }
        return this.f253684d;
    }

    public boolean aj() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ri()) || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ni()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("JDEntranceConfigJumpWeAppUsername")))) ? false : true;
    }

    public boolean bj() {
        return "1".equals((java.lang.String) c01.d9.b().p().l(327939, ""));
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        ((java.util.HashMap) this.f253685e).clear();
    }

    public void wi() {
        c01.d9.b().p().w(327939, "");
    }
}
