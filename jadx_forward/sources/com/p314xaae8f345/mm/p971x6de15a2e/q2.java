package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f153661a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.p2[] f153662b;

    public q2() {
        int max = mm.k.E1.h() ? java.lang.Math.max(150, 200) : 150;
        this.f153661a = max;
        this.f153662b = new com.p314xaae8f345.mm.p971x6de15a2e.p2[max];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static int d(int i17, int i18) {
        switch (i17) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 2;
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
                return 1;
            case 7:
                if (-3002 == i18 || -3003 == i18) {
                    return 4;
                }
                return -10001 == i18 ? 6 : 5;
            case 8:
                return 4;
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.MMNativeNetTaskAdapter", "c2JavaErrorType not exits c_errType:%d", java.lang.Integer.valueOf(i17));
                return 0;
        }
    }

    public static java.util.Map r(com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task task, int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "no pay business tag, cgiUrl: %s, cgiId: %d", str, java.lang.Long.valueOf(task.f19630x5a37c60));
            return hashMap;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "marked as pay cgi, cgiUrl: %s, cgiId: %d", str, java.lang.Long.valueOf(task.f19630x5a37c60));
        hashMap.put("business_type", "pay");
        hashMap.put("task_id", java.lang.String.valueOf(task.f19651xcb7ef160));
        return hashMap;
    }

    public static java.util.Map s(com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.Task task, int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "no pay business tag, cgiUrl: %s, cgiId: %d", str, java.lang.Long.valueOf(task.f40334x5a37c60));
            return hashMap;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "marked as pay cgi, cgiUrl: %s, cgiId: %d", str, java.lang.Long.valueOf(task.f40334x5a37c60));
        hashMap.put("business_type", "pay");
        hashMap.put("task_id", java.lang.String.valueOf(task.f40353xcb7ef160));
        return hashMap;
    }

    public int a(int i17, java.lang.Object obj, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this.f153662b) {
            int k17 = k(i17);
            if (-1 == k17) {
                return -1;
            }
            com.p314xaae8f345.mm.p971x6de15a2e.p2 p2Var = this.f153662b[k17];
            int i19 = p2Var.f153646l;
            if (!com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d() || 2 != i19) {
                return b(i17, bArr, iArr, iArr2, iArr3, p2Var, k17, currentTimeMillis);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "buf2RespForPay");
            return c(i17, bArr, iArr, iArr2, iArr3, p2Var, k17, currentTimeMillis);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(int r22, byte[] r23, int[] r24, int[] r25, int[] r26, com.p314xaae8f345.mm.p971x6de15a2e.p2 r27, int r28, long r29) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p971x6de15a2e.q2.b(int, byte[], int[], int[], int[], com.tencent.mm.network.p2, int, long):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(int r22, byte[] r23, int[] r24, int[] r25, int[] r26, com.p314xaae8f345.mm.p971x6de15a2e.p2 r27, int r28, long r29) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p971x6de15a2e.q2.c(int, byte[], int[], int[], int[], com.tencent.mm.network.p2, int, long):int");
    }

    public void e(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "clearTaskAndCallback errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        ((com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.class)).m40457xb43f7172();
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            ((com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.class)).m84589xb43f7172();
        }
        com.p314xaae8f345.mm.p971x6de15a2e.p2[] p2VarArr = new com.p314xaae8f345.mm.p971x6de15a2e.p2[this.f153661a];
        synchronized (this.f153662b) {
            for (int i19 = 0; i19 < this.f153661a; i19++) {
                com.p314xaae8f345.mm.p971x6de15a2e.p2[] p2VarArr2 = this.f153662b;
                p2VarArr[i19] = p2VarArr2[i19];
                p2VarArr2[i19] = null;
            }
        }
        for (int i27 = 0; i27 < this.f153661a; i27++) {
            com.p314xaae8f345.mm.p971x6de15a2e.p2 p2Var = p2VarArr[i27];
            if (p2Var != null) {
                try {
                    o45.kg mo48050x7f35c2d1 = p2Var.f153641g.mo48050x7f35c2d1();
                    int mo48052xfb85f7b0 = p2VarArr[i27].f153641g.mo48052xfb85f7b0();
                    int n86 = mo48050x7f35c2d1.n8();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "mmcgi clearTaskAndCallback outQueue: netId:%d hash:%d type:%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(mo48052xfb85f7b0), java.lang.Integer.valueOf(p2VarArr[i27].f153641g.o2()));
                    com.p314xaae8f345.mm.p971x6de15a2e.p2 p2Var2 = p2VarArr[i27];
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    p2Var2.f153655u = java.lang.System.currentTimeMillis();
                    p2VarArr[i27].f153641g.wa(f(p2Var2));
                    com.p314xaae8f345.mm.p971x6de15a2e.p2 p2Var3 = p2VarArr[i27];
                    p2Var3.f153642h.j4(i27, i17, i18, str, p2Var3.f153641g, null, mo48052xfb85f7b0, n86);
                } catch (java.lang.Exception e17) {
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
            }
        }
    }

    public final java.util.Map f(com.p314xaae8f345.mm.p971x6de15a2e.p2 p2Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("startTaskBegin", java.lang.String.valueOf(p2Var.f153647m));
        hashMap.put("marsStartTaskBegin", java.lang.String.valueOf(p2Var.f153648n));
        hashMap.put("startTaskEnd", java.lang.String.valueOf(p2Var.f153649o));
        hashMap.put("req2BufBegin", java.lang.String.valueOf(p2Var.f153650p));
        hashMap.put("req2BufEnd", java.lang.String.valueOf(p2Var.f153651q));
        hashMap.put("buf2RespBegin", java.lang.String.valueOf(p2Var.f153652r));
        hashMap.put("buf2RespEnd", java.lang.String.valueOf(p2Var.f153653s));
        hashMap.put("onTaskEndBegin", java.lang.String.valueOf(p2Var.f153654t));
        hashMap.put("onTaskEndEnd", java.lang.String.valueOf(p2Var.f153655u));
        return hashMap;
    }

    /* renamed from: finalize */
    public void m48354xd764dc1e() {
        o();
        super.finalize();
    }

    public int g(int i17) {
        synchronized (this.f153662b) {
            int k17 = k(i17);
            if (-1 == k17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNativeNetTaskAdapter", "-1 == index");
                return 0;
            }
            try {
                return this.f153662b[k17].f153639e;
            } catch (java.lang.Exception e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                return 0;
            }
        }
    }

    public final boolean h() {
        int mo48052xfb85f7b0;
        synchronized (this.f153662b) {
            for (int i17 = 0; i17 < this.f153661a; i17++) {
                try {
                    com.p314xaae8f345.mm.p971x6de15a2e.p2 p2Var = this.f153662b[i17];
                    if (p2Var != null && (252 == (mo48052xfb85f7b0 = p2Var.f153641g.mo48052xfb85f7b0()) || 701 == mo48052xfb85f7b0 || 702 == mo48052xfb85f7b0 || 763 == mo48052xfb85f7b0 || 3941 == mo48052xfb85f7b0)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMNativeNetTaskAdapter", "hasAuthCmd Auth inQueue: netid=" + i17 + " type=" + mo48052xfb85f7b0);
                        return true;
                    }
                } catch (android.os.RemoteException e17) {
                    this.f153662b[i17] = null;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s, remove index:%d", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17), java.lang.Integer.valueOf(i17));
                }
            }
            return false;
        }
    }

    public final boolean i(com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task task) {
        int parseInt;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        if (L.getBoolean(com.p314xaae8f345.p542x3306d5.p549x364492.ActivityC4597x7d257bef.f19704xbb9d746, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "mmpack wxpkg test all switch is on");
            return true;
        }
        if (L.getBoolean(com.p314xaae8f345.p542x3306d5.p549x364492.ActivityC4597x7d257bef.f19706xd75307e2, false)) {
            java.lang.String u17 = L.u(com.p314xaae8f345.p542x3306d5.p549x364492.ActivityC4597x7d257bef.f19705x4a63acaa, "");
            if (!android.text.TextUtils.isEmpty(u17)) {
                for (java.lang.String str : u17.split(",")) {
                    try {
                        parseInt = java.lang.Integer.parseInt(str.trim());
                    } catch (java.lang.NumberFormatException unused) {
                    }
                    if (parseInt == task.f19630x5a37c60) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "mmpack taskid:%d wxpkg test cgi_id match: %d", java.lang.Integer.valueOf(task.f19651xcb7ef160), java.lang.Integer.valueOf(parseInt));
                        return true;
                    }
                    continue;
                }
            }
        }
        return j62.e.g().l("clicfg_pack_wxpkg", false, true, true);
    }

    public final boolean j(int i17) {
        return i17 == 10 || i17 == 268369922 || i17 == 100017;
    }

    public final int k(int i17) {
        int i18;
        com.p314xaae8f345.mm.p971x6de15a2e.p2 p2Var;
        int i19 = 0;
        while (true) {
            i18 = this.f153661a;
            if (i19 >= i18 || ((p2Var = this.f153662b[i19]) != null && i17 == p2Var.f153645k)) {
                break;
            }
            i19++;
        }
        if (i18 <= i19) {
            return -1;
        }
        return i19;
    }

    public void l(r45.xw xwVar, com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.CgiProfile cgiProfile) {
        xwVar.f472080q = cgiProfile.f19612xf3a4da4a;
        xwVar.f472085v = cgiProfile.f19611xef215744;
        xwVar.f472086w = cgiProfile.f19610x916e51c6;
        xwVar.f472087x = cgiProfile.f19598x8bec92bd;
        xwVar.f472070d = cgiProfile.f19604x1dff6d15;
        xwVar.f472071e = cgiProfile.f19595x3c5af811;
        xwVar.f472072f = cgiProfile.f19607xaadb8a22;
        xwVar.f472073g = cgiProfile.f19599xdec0205e;
        xwVar.f472074h = cgiProfile.f19609x7cbbae1f;
        xwVar.f472075i = cgiProfile.f19603xa27ccaf;
        xwVar.f472076m = cgiProfile.f19608x36d87ead;
        xwVar.f472077n = cgiProfile.f19602xc06a2f3d;
        xwVar.f472078o = cgiProfile.f19605x321f085;
        xwVar.f472079p = cgiProfile.f19596x974b0195;
        xwVar.f472081r = cgiProfile.rtt;
        xwVar.f472082s = cgiProfile.f19594x105746dd;
        xwVar.f472083t = cgiProfile.f19601x99985f2;
        xwVar.f472084u = cgiProfile.f19600x6dd19677;
    }

    public void m(r45.xw xwVar, com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.CgiProfile cgiProfile) {
        xwVar.f472080q = cgiProfile.f40316xf3a4da4a;
        xwVar.f472085v = cgiProfile.f40315xef215744;
        xwVar.f472086w = cgiProfile.f40314x916e51c6;
        xwVar.f472087x = cgiProfile.f40302x8bec92bd;
        xwVar.f472070d = cgiProfile.f40308x1dff6d15;
        xwVar.f472071e = cgiProfile.f40299x3c5af811;
        xwVar.f472072f = cgiProfile.f40311xaadb8a22;
        xwVar.f472073g = cgiProfile.f40303xdec0205e;
        xwVar.f472074h = cgiProfile.f40313x7cbbae1f;
        xwVar.f472075i = cgiProfile.f40307xa27ccaf;
        xwVar.f472076m = cgiProfile.f40312x36d87ead;
        xwVar.f472077n = cgiProfile.f40306xc06a2f3d;
        xwVar.f472078o = cgiProfile.f40309x321f085;
        xwVar.f472079p = cgiProfile.f40300x974b0195;
        xwVar.f472081r = cgiProfile.rtt;
        xwVar.f472082s = cgiProfile.f40298x105746dd;
        xwVar.f472083t = cgiProfile.f40305x99985f2;
        xwVar.f472084u = cgiProfile.f40304x6dd19677;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:9|10|(3:11|12|(3:14|15|(10:17|18|(2:305|306)|20|(6:289|290|291|292|293|(2:(1:296)|297))(1:22)|(1:24)(1:288)|(4:26|(1:28)(1:234)|(1:30)(1:233)|31)(7:235|236|(3:247|248|249)|250|(16:254|255|256|257|(1:259)(1:284)|260|261|262|263|264|265|266|267|268|269|249)|248|249)|(1:232)(1:35)|36|37)))|(1:39)(2:217|(3:219|(1:221)(1:223)|222)(37:224|41|(10:(2:44|45)(1:215)|46|47|48|49|50|51|52|53|54)(1:216)|55|56|(2:63|64)|81|(8:83|84|85|86|87|88|89|90)(1:187)|91|92|93|94|95|96|(1:98)(1:142)|99|100|101|102|103|104|105|106|107|108|109|110|111|(1:113)(1:119)|114|(1:116)(1:118)|117|71|72|73|74|75))|40|41|(0)(0)|55|56|(3:58|63|64)|81|(0)(0)|91|92|93|94|95|96|(0)(0)|99|100|101|102|103|104|105|106|107|108|109|110|111|(0)(0)|114|(0)(0)|117|71|72|73|74|75) */
    /* JADX WARN: Can't wrap try/catch for region: R(43:9|10|11|12|(3:14|15|(10:17|18|(2:305|306)|20|(6:289|290|291|292|293|(2:(1:296)|297))(1:22)|(1:24)(1:288)|(4:26|(1:28)(1:234)|(1:30)(1:233)|31)(7:235|236|(3:247|248|249)|250|(16:254|255|256|257|(1:259)(1:284)|260|261|262|263|264|265|266|267|268|269|249)|248|249)|(1:232)(1:35)|36|37))|(1:39)(2:217|(3:219|(1:221)(1:223)|222)(37:224|41|(10:(2:44|45)(1:215)|46|47|48|49|50|51|52|53|54)(1:216)|55|56|(2:63|64)|81|(8:83|84|85|86|87|88|89|90)(1:187)|91|92|93|94|95|96|(1:98)(1:142)|99|100|101|102|103|104|105|106|107|108|109|110|111|(1:113)(1:119)|114|(1:116)(1:118)|117|71|72|73|74|75))|40|41|(0)(0)|55|56|(3:58|63|64)|81|(0)(0)|91|92|93|94|95|96|(0)(0)|99|100|101|102|103|104|105|106|107|108|109|110|111|(0)(0)|114|(0)(0)|117|71|72|73|74|75) */
    /* JADX WARN: Can't wrap try/catch for region: R(45:9|10|11|12|14|15|(10:17|18|(2:305|306)|20|(6:289|290|291|292|293|(2:(1:296)|297))(1:22)|(1:24)(1:288)|(4:26|(1:28)(1:234)|(1:30)(1:233)|31)(7:235|236|(3:247|248|249)|250|(16:254|255|256|257|(1:259)(1:284)|260|261|262|263|264|265|266|267|268|269|249)|248|249)|(1:232)(1:35)|36|37)|(1:39)(2:217|(3:219|(1:221)(1:223)|222)(37:224|41|(10:(2:44|45)(1:215)|46|47|48|49|50|51|52|53|54)(1:216)|55|56|(2:63|64)|81|(8:83|84|85|86|87|88|89|90)(1:187)|91|92|93|94|95|96|(1:98)(1:142)|99|100|101|102|103|104|105|106|107|108|109|110|111|(1:113)(1:119)|114|(1:116)(1:118)|117|71|72|73|74|75))|40|41|(0)(0)|55|56|(3:58|63|64)|81|(0)(0)|91|92|93|94|95|96|(0)(0)|99|100|101|102|103|104|105|106|107|108|109|110|111|(0)(0)|114|(0)(0)|117|71|72|73|74|75) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0483, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0487, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x048b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x048e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0491, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x049d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0499, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0495, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04b0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04ab, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04a6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04cc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04cd, code lost:
    
        r1 = r7;
        r31 = r14;
        r7 = r17;
        r35 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04c1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04c2, code lost:
    
        r1 = r7;
        r9 = r13;
        r31 = r14;
        r7 = r17;
        r35 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04b5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04b6, code lost:
    
        r1 = r7;
        r31 = r14;
        r10 = r16;
        r7 = r17;
        r35 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04e1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04e2, code lost:
    
        r9 = r13;
        r31 = r14;
        r35 = r20;
        r1 = 1;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x04d6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x04d7, code lost:
    
        r31 = r14;
        r10 = r16;
        r35 = r20;
        r1 = 1;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x05ff, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0601, code lost:
    
        r1 = new java.lang.Object[r1];
        r1[r7] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M1(r0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNativeNetTaskAdapter", "iDataPackageReporter Exception:%s", r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0452 A[Catch: Exception -> 0x0483, IOException -> 0x0487, RemoteException -> 0x0491, all -> 0x061a, TryCatch #10 {IOException -> 0x0487, blocks: (B:108:0x0429, B:111:0x0434, B:113:0x0452, B:114:0x0455, B:116:0x0462, B:118:0x0468), top: B:107:0x0429 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0462 A[Catch: Exception -> 0x0483, IOException -> 0x0487, RemoteException -> 0x0491, all -> 0x061a, TryCatch #10 {IOException -> 0x0487, blocks: (B:108:0x0429, B:111:0x0434, B:113:0x0452, B:114:0x0455, B:116:0x0462, B:118:0x0468), top: B:107:0x0429 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0468 A[Catch: Exception -> 0x0483, IOException -> 0x0487, RemoteException -> 0x0491, all -> 0x061a, TRY_LEAVE, TryCatch #10 {IOException -> 0x0487, blocks: (B:108:0x0429, B:111:0x0434, B:113:0x0452, B:114:0x0455, B:116:0x0462, B:118:0x0468), top: B:107:0x0429 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03f8  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n(int r40, java.lang.Object r41, java.io.ByteArrayOutputStream r42, int[] r43, int r44, java.lang.String r45, int r46) {
        /*
            Method dump skipped, instructions count: 1577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p971x6de15a2e.q2.n(int, java.lang.Object, java.io.ByteArrayOutputStream, int[], int, java.lang.String, int):boolean");
    }

    public void o() {
        com.p314xaae8f345.mm.p642xad8b531f.s sVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "reset");
        ((com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.class)).m40467xf88c8574(com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37506xc91b5326(), "default");
        if (z65.c.a() && (sVar = ((km0.c) gm0.j1.p().a()).f390525f) != null) {
            sVar.f(sVar.f145100f);
        }
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            ((com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.stn.C23042x9a94e8e0.class)).m84599xf88c8574(com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84218xc91b5326(), "default");
        }
        synchronized (this.f153662b) {
            for (int i17 = 0; i17 < this.f153661a; i17++) {
                if (this.f153662b[i17] != null) {
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "mmcgi reset outQueue: netId:%d hash:%d type:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f153662b[i17].f153641g.mo48052xfb85f7b0()), java.lang.Integer.valueOf(this.f153662b[i17].f153641g.o2()));
                        this.f153662b[i17] = null;
                    } catch (android.os.RemoteException e17) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01b0 A[Catch: RemoteException -> 0x027b, all -> 0x0315, TryCatch #3 {, blocks: (B:5:0x001e, B:8:0x0022, B:219:0x002a, B:12:0x0037, B:15:0x0042, B:20:0x0050, B:25:0x005a, B:28:0x0078, B:33:0x0082, B:35:0x008e, B:38:0x009e, B:41:0x00a2, B:43:0x00d7, B:44:0x00f8, B:47:0x0100, B:59:0x0135, B:60:0x0137, B:100:0x0193, B:108:0x01a7, B:110:0x01b0, B:113:0x01b6, B:115:0x01bc, B:116:0x01c2, B:118:0x01c6, B:119:0x01cc, B:121:0x01d3, B:124:0x01df, B:128:0x01ec, B:132:0x01f9, B:136:0x0201, B:140:0x0209, B:143:0x020f, B:145:0x0214, B:147:0x0225, B:148:0x0227, B:149:0x022a, B:152:0x0272, B:156:0x02e1, B:172:0x02c3, B:174:0x02d4, B:177:0x01a4, B:178:0x0190, B:179:0x017a, B:180:0x011a, B:188:0x012a, B:189:0x012d), top: B:4:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c6 A[Catch: RemoteException -> 0x027b, all -> 0x0315, TryCatch #3 {, blocks: (B:5:0x001e, B:8:0x0022, B:219:0x002a, B:12:0x0037, B:15:0x0042, B:20:0x0050, B:25:0x005a, B:28:0x0078, B:33:0x0082, B:35:0x008e, B:38:0x009e, B:41:0x00a2, B:43:0x00d7, B:44:0x00f8, B:47:0x0100, B:59:0x0135, B:60:0x0137, B:100:0x0193, B:108:0x01a7, B:110:0x01b0, B:113:0x01b6, B:115:0x01bc, B:116:0x01c2, B:118:0x01c6, B:119:0x01cc, B:121:0x01d3, B:124:0x01df, B:128:0x01ec, B:132:0x01f9, B:136:0x0201, B:140:0x0209, B:143:0x020f, B:145:0x0214, B:147:0x0225, B:148:0x0227, B:149:0x022a, B:152:0x0272, B:156:0x02e1, B:172:0x02c3, B:174:0x02d4, B:177:0x01a4, B:178:0x0190, B:179:0x017a, B:180:0x011a, B:188:0x012a, B:189:0x012d), top: B:4:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d3 A[Catch: RemoteException -> 0x027b, all -> 0x0315, TryCatch #3 {, blocks: (B:5:0x001e, B:8:0x0022, B:219:0x002a, B:12:0x0037, B:15:0x0042, B:20:0x0050, B:25:0x005a, B:28:0x0078, B:33:0x0082, B:35:0x008e, B:38:0x009e, B:41:0x00a2, B:43:0x00d7, B:44:0x00f8, B:47:0x0100, B:59:0x0135, B:60:0x0137, B:100:0x0193, B:108:0x01a7, B:110:0x01b0, B:113:0x01b6, B:115:0x01bc, B:116:0x01c2, B:118:0x01c6, B:119:0x01cc, B:121:0x01d3, B:124:0x01df, B:128:0x01ec, B:132:0x01f9, B:136:0x0201, B:140:0x0209, B:143:0x020f, B:145:0x0214, B:147:0x0225, B:148:0x0227, B:149:0x022a, B:152:0x0272, B:156:0x02e1, B:172:0x02c3, B:174:0x02d4, B:177:0x01a4, B:178:0x0190, B:179:0x017a, B:180:0x011a, B:188:0x012a, B:189:0x012d), top: B:4:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01df A[Catch: RemoteException -> 0x027b, all -> 0x0315, TryCatch #3 {, blocks: (B:5:0x001e, B:8:0x0022, B:219:0x002a, B:12:0x0037, B:15:0x0042, B:20:0x0050, B:25:0x005a, B:28:0x0078, B:33:0x0082, B:35:0x008e, B:38:0x009e, B:41:0x00a2, B:43:0x00d7, B:44:0x00f8, B:47:0x0100, B:59:0x0135, B:60:0x0137, B:100:0x0193, B:108:0x01a7, B:110:0x01b0, B:113:0x01b6, B:115:0x01bc, B:116:0x01c2, B:118:0x01c6, B:119:0x01cc, B:121:0x01d3, B:124:0x01df, B:128:0x01ec, B:132:0x01f9, B:136:0x0201, B:140:0x0209, B:143:0x020f, B:145:0x0214, B:147:0x0225, B:148:0x0227, B:149:0x022a, B:152:0x0272, B:156:0x02e1, B:172:0x02c3, B:174:0x02d4, B:177:0x01a4, B:178:0x0190, B:179:0x017a, B:180:0x011a, B:188:0x012a, B:189:0x012d), top: B:4:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0207 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020f A[Catch: RemoteException -> 0x027b, all -> 0x0315, TryCatch #3 {, blocks: (B:5:0x001e, B:8:0x0022, B:219:0x002a, B:12:0x0037, B:15:0x0042, B:20:0x0050, B:25:0x005a, B:28:0x0078, B:33:0x0082, B:35:0x008e, B:38:0x009e, B:41:0x00a2, B:43:0x00d7, B:44:0x00f8, B:47:0x0100, B:59:0x0135, B:60:0x0137, B:100:0x0193, B:108:0x01a7, B:110:0x01b0, B:113:0x01b6, B:115:0x01bc, B:116:0x01c2, B:118:0x01c6, B:119:0x01cc, B:121:0x01d3, B:124:0x01df, B:128:0x01ec, B:132:0x01f9, B:136:0x0201, B:140:0x0209, B:143:0x020f, B:145:0x0214, B:147:0x0225, B:148:0x0227, B:149:0x022a, B:152:0x0272, B:156:0x02e1, B:172:0x02c3, B:174:0x02d4, B:177:0x01a4, B:178:0x0190, B:179:0x017a, B:180:0x011a, B:188:0x012a, B:189:0x012d), top: B:4:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0214 A[Catch: RemoteException -> 0x027b, all -> 0x0315, TryCatch #3 {, blocks: (B:5:0x001e, B:8:0x0022, B:219:0x002a, B:12:0x0037, B:15:0x0042, B:20:0x0050, B:25:0x005a, B:28:0x0078, B:33:0x0082, B:35:0x008e, B:38:0x009e, B:41:0x00a2, B:43:0x00d7, B:44:0x00f8, B:47:0x0100, B:59:0x0135, B:60:0x0137, B:100:0x0193, B:108:0x01a7, B:110:0x01b0, B:113:0x01b6, B:115:0x01bc, B:116:0x01c2, B:118:0x01c6, B:119:0x01cc, B:121:0x01d3, B:124:0x01df, B:128:0x01ec, B:132:0x01f9, B:136:0x0201, B:140:0x0209, B:143:0x020f, B:145:0x0214, B:147:0x0225, B:148:0x0227, B:149:0x022a, B:152:0x0272, B:156:0x02e1, B:172:0x02c3, B:174:0x02d4, B:177:0x01a4, B:178:0x0190, B:179:0x017a, B:180:0x011a, B:188:0x012a, B:189:0x012d), top: B:4:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int p(com.p314xaae8f345.mm.p971x6de15a2e.z0 r27, com.p314xaae8f345.mm.p971x6de15a2e.o0 r28, com.p314xaae8f345.mm.p971x6de15a2e.o r29, int r30, com.p314xaae8f345.mm.p971x6de15a2e.C11181xa473aa4c r31) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p971x6de15a2e.q2.p(com.tencent.mm.network.z0, com.tencent.mm.network.o0, com.tencent.mm.network.o, int, com.tencent.mm.network.ReqInfo):int");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:(3:232|233|234)|25|26|27|(1:29)(1:228)|30|31|(1:33)(1:227)|(22:34|35|(1:37)(1:223)|38|(1:40)(1:222)|41|42|(1:44)(1:221)|45|46|48|49|(2:213|214)|51|(1:53)(1:212)|54|(2:204|(2:210|211)(1:(1:209)))|62|(2:64|65)|66|67|(1:203))|(9:(37:102|103|(33:110|111|(1:113)|(1:118)|119|(1:121)|129|130|131|132|(3:134|135|136)|140|(1:142)|143|(1:197)(1:146)|147|(1:150)|151|(1:154)|155|(1:158)|159|(1:161)|(3:163|(1:165)|166)|167|168|169|170|171|172|173|175|176)|201|111|(0)|(2:116|118)|119|(0)|129|130|131|132|(0)|140|(0)|143|(0)|197|147|(1:150)|151|(1:154)|155|(1:158)|159|(0)|(0)|167|168|169|170|171|172|173|175|176)|(36:105|107|110|111|(0)|(0)|119|(0)|129|130|131|132|(0)|140|(0)|143|(0)|197|147|(0)|151|(0)|155|(0)|159|(0)|(0)|167|168|169|170|171|172|173|175|176)|169|170|171|172|173|175|176)|202|103|201|111|(0)|(0)|119|(0)|129|130|131|132|(0)|140|(0)|143|(0)|197|147|(0)|151|(0)|155|(0)|159|(0)|(0)|167|168) */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02f8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02fd, code lost:
    
        r6 = r25;
        r8 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0205 A[Catch: RemoteException -> 0x0150, all -> 0x037e, TRY_ENTER, TryCatch #0 {RemoteException -> 0x0150, blocks: (B:214:0x012e, B:65:0x018e, B:113:0x0205, B:116:0x020b, B:118:0x0211, B:121:0x021b, B:209:0x0183), top: B:213:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0209 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021b A[Catch: RemoteException -> 0x0150, all -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x0150, blocks: (B:214:0x012e, B:65:0x018e, B:113:0x0205, B:116:0x020b, B:118:0x0211, B:121:0x021b, B:209:0x0183), top: B:213:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0236 A[Catch: RemoteException -> 0x023e, all -> 0x037e, TryCatch #3 {RemoteException -> 0x023e, blocks: (B:136:0x022d, B:142:0x0236, B:146:0x0246, B:150:0x0253, B:154:0x025b, B:158:0x0263, B:161:0x0269, B:163:0x026e, B:165:0x027f, B:166:0x0281), top: B:135:0x022d }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0244 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0251 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0259 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0269 A[Catch: RemoteException -> 0x023e, all -> 0x037e, TryCatch #3 {RemoteException -> 0x023e, blocks: (B:136:0x022d, B:142:0x0236, B:146:0x0246, B:150:0x0253, B:154:0x025b, B:158:0x0263, B:161:0x0269, B:163:0x026e, B:165:0x027f, B:166:0x0281), top: B:135:0x022d }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026e A[Catch: RemoteException -> 0x023e, all -> 0x037e, TryCatch #3 {RemoteException -> 0x023e, blocks: (B:136:0x022d, B:142:0x0236, B:146:0x0246, B:150:0x0253, B:154:0x025b, B:158:0x0263, B:161:0x0269, B:163:0x026e, B:165:0x027f, B:166:0x0281), top: B:135:0x022d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int q(com.p314xaae8f345.mm.p971x6de15a2e.z0 r29, com.p314xaae8f345.mm.p971x6de15a2e.o0 r30, com.p314xaae8f345.mm.p971x6de15a2e.o r31, int r32, com.p314xaae8f345.mm.p971x6de15a2e.C11181xa473aa4c r33) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p971x6de15a2e.q2.q(com.tencent.mm.network.z0, com.tencent.mm.network.o0, com.tencent.mm.network.o, int, com.tencent.mm.network.ReqInfo):int");
    }

    public final void t(com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, com.p314xaae8f345.mm.p971x6de15a2e.o oVar, com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task task) {
        try {
            java.util.Map<java.lang.String, java.lang.String> map = task.f19635xf0e1e4de;
            boolean z17 = true;
            boolean z18 = map != null && map.size() > 0;
            boolean l17 = j62.e.g().l("clicfg_start_task_with_buf", false, true, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNativeNetTaskAdapter", "mmpack isStartTaskWithBuf:%b isPayCgi:%b", java.lang.Boolean.valueOf(l17), java.lang.Boolean.valueOf(z18));
            if (l17 && !z18) {
                z0Var.mo48049x2d63726f().b3();
                task.f19653xddf4515c = true;
                r45.ir5 ir5Var = new r45.ir5();
                ir5Var.f458817e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(z0Var.mo48049x2d63726f().y4());
                if (z0Var.mo48049x2d63726f().b3()) {
                    o45.ag.m();
                    byte[] m37555xda899955 = ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37555xda899955();
                    byte[] o17 = oVar.o();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(m37555xda899955));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(o17));
                    ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37565x7e862e61(o17);
                    byte[] y07 = oVar.y0();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(y07)) {
                        ((com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.class)).m37578x8da162c6(y07);
                    }
                    r45.hg0 hg0Var = new r45.hg0();
                    hg0Var.f457661d = o45.ag.a();
                    hg0Var.f457662e = o45.ag.f424427c;
                    hg0Var.f457663f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(o45.ag.e());
                    hg0Var.f457664g = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(o45.ag.f());
                    boolean z19 = o45.ag.f424425a;
                    o45.ag.a();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(o45.ag.e()));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(o45.ag.f()));
                    long j17 = task.f19630x5a37c60;
                    if (j17 == 763) {
                        r45.oc ocVar = new r45.oc();
                        ocVar.mo11468x92b714fd(z0Var.mo48049x2d63726f().y4());
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = ocVar.f463674d.f464468d.f453374f;
                        if (gVar == null) {
                            gVar = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(new byte[0]);
                        }
                        hg0Var.f457665h = gVar;
                    } else if (j17 == 3941) {
                        r45.oc ocVar2 = new r45.oc();
                        ocVar2.mo11468x92b714fd(z0Var.mo48049x2d63726f().y4());
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = ocVar2.f463674d.f464468d.f453374f;
                        if (gVar2 == null) {
                            gVar2 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(new byte[0]);
                        }
                        hg0Var.f457665h = gVar2;
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = ocVar2.f463674d.f464468d.f453374f;
                        if (gVar3 != null) {
                            int length = gVar3.f273689a.length;
                        }
                    } else if (z0Var.mo48049x2d63726f().K6() != null) {
                        hg0Var.f457665h = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(z0Var.mo48049x2d63726f().K6());
                    } else {
                        hg0Var.f457665h = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(new byte[0]);
                    }
                    ir5Var.f458825p = hg0Var;
                    ir5Var.f458823n = true;
                    new java.lang.String(z0Var.mo48049x2d63726f().K6(), java.nio.charset.StandardCharsets.UTF_8);
                    if (z0Var.mo48049x2d63726f().K6() != null) {
                        int length2 = z0Var.mo48049x2d63726f().K6().length;
                    }
                } else if (z0Var.mo48049x2d63726f().mo48042xd46d5c49()) {
                    r45.tc tcVar = new r45.tc();
                    tcVar.mo11468x92b714fd(z0Var.mo48049x2d63726f().sa());
                    r45.xc xcVar = new r45.xc();
                    xcVar.f471497d = tcVar.f467816d;
                    xcVar.f471498e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(z0Var.mo48049x2d63726f().p9());
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = tcVar.f467817e.f453374f;
                    if (gVar4 == null) {
                        gVar4 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(new byte[0]);
                    }
                    xcVar.f471499f = gVar4;
                    ir5Var.f458826q = xcVar;
                    ir5Var.f458824o = true;
                }
                ir5Var.f458816d = z0Var.mo48049x2d63726f().mo48040xb5887524() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                ir5Var.f458818f = z0Var.mo48048xb6805570();
                ir5Var.f458821i = z0Var.mo48049x2d63726f().mo48039x966afe1();
                if (oVar.mo9864xf7b3660d()) {
                    z17 = false;
                }
                ir5Var.f458819g = z17;
                ir5Var.f458828s = z0Var.mo48049x2d63726f().mo48043x182b0f68();
                ir5Var.f458827r = i(task);
                task.f19645xc84c20f5 = ir5Var.mo14344x5f01b1f6();
                int length3 = task.f19645xc84c20f5.length;
                if (z0Var.mo48049x2d63726f().sa() != null) {
                    int length4 = z0Var.mo48049x2d63726f().sa().length;
                }
                if (z0Var.mo48049x2d63726f().y4() != null) {
                    int length5 = z0Var.mo48049x2d63726f().y4().length;
                }
                z0Var.mo48049x2d63726f().mo48039x966afe1();
                z0Var.mo48049x2d63726f().mo48043x182b0f68();
            }
        } catch (java.lang.Exception e17) {
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMNativeNetTaskAdapter", "mmpack exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            task.f19653xddf4515c = false;
        }
    }
}
