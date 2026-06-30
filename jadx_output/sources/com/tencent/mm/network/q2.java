package com.tencent.mm.network;

/* loaded from: classes12.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f72128a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.network.p2[] f72129b;

    public q2() {
        int max = mm.k.E1.h() ? java.lang.Math.max(150, 200) : 150;
        this.f72128a = max;
        this.f72129b = new com.tencent.mm.network.p2[max];
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
                com.tencent.mars.xlog.Log.f("MicroMsg.MMNativeNetTaskAdapter", "c2JavaErrorType not exits c_errType:%d", java.lang.Integer.valueOf(i17));
                return 0;
        }
    }

    public static java.util.Map r(com.tencent.mars.stn.StnManager.Task task, int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (i17 != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "no pay business tag, cgiUrl: %s, cgiId: %d", str, java.lang.Long.valueOf(task.cgiID));
            return hashMap;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "marked as pay cgi, cgiUrl: %s, cgiId: %d", str, java.lang.Long.valueOf(task.cgiID));
        hashMap.put("business_type", "pay");
        hashMap.put("task_id", java.lang.String.valueOf(task.taskID));
        return hashMap;
    }

    public static java.util.Map s(com.tencent.paymars.stn.StnManager.Task task, int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (i17 != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "no pay business tag, cgiUrl: %s, cgiId: %d", str, java.lang.Long.valueOf(task.cgiID));
            return hashMap;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "marked as pay cgi, cgiUrl: %s, cgiId: %d", str, java.lang.Long.valueOf(task.cgiID));
        hashMap.put("business_type", "pay");
        hashMap.put("task_id", java.lang.String.valueOf(task.taskID));
        return hashMap;
    }

    public int a(int i17, java.lang.Object obj, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this.f72129b) {
            int k17 = k(i17);
            if (-1 == k17) {
                return -1;
            }
            com.tencent.mm.network.p2 p2Var = this.f72129b[k17];
            int i19 = p2Var.f72113l;
            if (!com.tencent.paymars.WeChatMars.isEnable() || 2 != i19) {
                return b(i17, bArr, iArr, iArr2, iArr3, p2Var, k17, currentTimeMillis);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "buf2RespForPay");
            return c(i17, bArr, iArr, iArr2, iArr3, p2Var, k17, currentTimeMillis);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(int r22, byte[] r23, int[] r24, int[] r25, int[] r26, com.tencent.mm.network.p2 r27, int r28, long r29) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.network.q2.b(int, byte[], int[], int[], int[], com.tencent.mm.network.p2, int, long):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(int r22, byte[] r23, int[] r24, int[] r25, int[] r26, com.tencent.mm.network.p2 r27, int r28, long r29) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.network.q2.c(int, byte[], int[], int[], int[], com.tencent.mm.network.p2, int, long):int");
    }

    public void e(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "clearTaskAndCallback errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        ((com.tencent.mars.stn.StnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.stn.StnManager.class)).clearTask();
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            ((com.tencent.paymars.stn.StnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.stn.StnManager.class)).clearTask();
        }
        com.tencent.mm.network.p2[] p2VarArr = new com.tencent.mm.network.p2[this.f72128a];
        synchronized (this.f72129b) {
            for (int i19 = 0; i19 < this.f72128a; i19++) {
                com.tencent.mm.network.p2[] p2VarArr2 = this.f72129b;
                p2VarArr[i19] = p2VarArr2[i19];
                p2VarArr2[i19] = null;
            }
        }
        for (int i27 = 0; i27 < this.f72128a; i27++) {
            com.tencent.mm.network.p2 p2Var = p2VarArr[i27];
            if (p2Var != null) {
                try {
                    o45.kg respObj = p2Var.f72108g.getRespObj();
                    int type = p2VarArr[i27].f72108g.getType();
                    int n86 = respObj.n8();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "mmcgi clearTaskAndCallback outQueue: netId:%d hash:%d type:%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(type), java.lang.Integer.valueOf(p2VarArr[i27].f72108g.o2()));
                    com.tencent.mm.network.p2 p2Var2 = p2VarArr[i27];
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    p2Var2.f72122u = java.lang.System.currentTimeMillis();
                    p2VarArr[i27].f72108g.wa(f(p2Var2));
                    com.tencent.mm.network.p2 p2Var3 = p2VarArr[i27];
                    p2Var3.f72109h.j4(i27, i17, i18, str, p2Var3.f72108g, null, type, n86);
                } catch (java.lang.Exception e17) {
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            }
        }
    }

    public final java.util.Map f(com.tencent.mm.network.p2 p2Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("startTaskBegin", java.lang.String.valueOf(p2Var.f72114m));
        hashMap.put("marsStartTaskBegin", java.lang.String.valueOf(p2Var.f72115n));
        hashMap.put("startTaskEnd", java.lang.String.valueOf(p2Var.f72116o));
        hashMap.put("req2BufBegin", java.lang.String.valueOf(p2Var.f72117p));
        hashMap.put("req2BufEnd", java.lang.String.valueOf(p2Var.f72118q));
        hashMap.put("buf2RespBegin", java.lang.String.valueOf(p2Var.f72119r));
        hashMap.put("buf2RespEnd", java.lang.String.valueOf(p2Var.f72120s));
        hashMap.put("onTaskEndBegin", java.lang.String.valueOf(p2Var.f72121t));
        hashMap.put("onTaskEndEnd", java.lang.String.valueOf(p2Var.f72122u));
        return hashMap;
    }

    public void finalize() {
        o();
        super.finalize();
    }

    public int g(int i17) {
        synchronized (this.f72129b) {
            int k17 = k(i17);
            if (-1 == k17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMNativeNetTaskAdapter", "-1 == index");
                return 0;
            }
            try {
                return this.f72129b[k17].f72106e;
            } catch (java.lang.Exception e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                return 0;
            }
        }
    }

    public final boolean h() {
        int type;
        synchronized (this.f72129b) {
            for (int i17 = 0; i17 < this.f72128a; i17++) {
                try {
                    com.tencent.mm.network.p2 p2Var = this.f72129b[i17];
                    if (p2Var != null && (252 == (type = p2Var.f72108g.getType()) || 701 == type || 702 == type || 763 == type || 3941 == type)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MMNativeNetTaskAdapter", "hasAuthCmd Auth inQueue: netid=" + i17 + " type=" + type);
                        return true;
                    }
                } catch (android.os.RemoteException e17) {
                    this.f72129b[i17] = null;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s, remove index:%d", com.tencent.mm.sdk.platformtools.z3.c(e17), java.lang.Integer.valueOf(i17));
                }
            }
            return false;
        }
    }

    public final boolean i(com.tencent.mars.stn.StnManager.Task task) {
        int parseInt;
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        if (L.getBoolean(com.tencent.mars.test.NetworkWxPkgTest.KEY_WXPKG_ALL_SWITCH, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "mmpack wxpkg test all switch is on");
            return true;
        }
        if (L.getBoolean(com.tencent.mars.test.NetworkWxPkgTest.KEY_WXPKG_CGI_SWITCH, false)) {
            java.lang.String u17 = L.u(com.tencent.mars.test.NetworkWxPkgTest.KEY_WXPKG_CGI_IDS, "");
            if (!android.text.TextUtils.isEmpty(u17)) {
                for (java.lang.String str : u17.split(",")) {
                    try {
                        parseInt = java.lang.Integer.parseInt(str.trim());
                    } catch (java.lang.NumberFormatException unused) {
                    }
                    if (parseInt == task.cgiID) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "mmpack taskid:%d wxpkg test cgi_id match: %d", java.lang.Integer.valueOf(task.taskID), java.lang.Integer.valueOf(parseInt));
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
        com.tencent.mm.network.p2 p2Var;
        int i19 = 0;
        while (true) {
            i18 = this.f72128a;
            if (i19 >= i18 || ((p2Var = this.f72129b[i19]) != null && i17 == p2Var.f72112k)) {
                break;
            }
            i19++;
        }
        if (i18 <= i19) {
            return -1;
        }
        return i19;
    }

    public void l(r45.xw xwVar, com.tencent.mars.stn.StnManager.CgiProfile cgiProfile) {
        xwVar.f390547q = cgiProfile.taskStartTime;
        xwVar.f390552v = cgiProfile.startTaskTick;
        xwVar.f390553w = cgiProfile.startTaskTS;
        xwVar.f390554x = cgiProfile.endTaskTick;
        xwVar.f390537d = cgiProfile.startConnectTime;
        xwVar.f390538e = cgiProfile.connectSuccessfulTime;
        xwVar.f390539f = cgiProfile.startHandshakeTime;
        xwVar.f390540g = cgiProfile.handshakeSuccessfulTime;
        xwVar.f390541h = cgiProfile.startSendPacketTime;
        xwVar.f390542i = cgiProfile.sendPacketFinishedTime;
        xwVar.f390543m = cgiProfile.startReadPacketTime;
        xwVar.f390544n = cgiProfile.readPacketFinishedTime;
        xwVar.f390545o = cgiProfile.startDecodePacketTime;
        xwVar.f390546p = cgiProfile.decodePacketFinishedTime;
        xwVar.f390548r = cgiProfile.rtt;
        xwVar.f390549s = cgiProfile.channelType;
        xwVar.f390550t = cgiProfile.protocolType;
        xwVar.f390551u = cgiProfile.netType;
    }

    public void m(r45.xw xwVar, com.tencent.paymars.stn.StnManager.CgiProfile cgiProfile) {
        xwVar.f390547q = cgiProfile.taskStartTime;
        xwVar.f390552v = cgiProfile.startTaskTick;
        xwVar.f390553w = cgiProfile.startTaskTS;
        xwVar.f390554x = cgiProfile.endTaskTick;
        xwVar.f390537d = cgiProfile.startConnectTime;
        xwVar.f390538e = cgiProfile.connectSuccessfulTime;
        xwVar.f390539f = cgiProfile.startHandshakeTime;
        xwVar.f390540g = cgiProfile.handshakeSuccessfulTime;
        xwVar.f390541h = cgiProfile.startSendPacketTime;
        xwVar.f390542i = cgiProfile.sendPacketFinishedTime;
        xwVar.f390543m = cgiProfile.startReadPacketTime;
        xwVar.f390544n = cgiProfile.readPacketFinishedTime;
        xwVar.f390545o = cgiProfile.startDecodePacketTime;
        xwVar.f390546p = cgiProfile.decodePacketFinishedTime;
        xwVar.f390548r = cgiProfile.rtt;
        xwVar.f390549s = cgiProfile.channelType;
        xwVar.f390550t = cgiProfile.protocolType;
        xwVar.f390551u = cgiProfile.netType;
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
        r1[r7] = com.tencent.mm.sdk.platformtools.t8.M1(r0);
        com.tencent.mars.xlog.Log.e("MicroMsg.MMNativeNetTaskAdapter", "iDataPackageReporter Exception:%s", r1);
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.network.q2.n(int, java.lang.Object, java.io.ByteArrayOutputStream, int[], int, java.lang.String, int):boolean");
    }

    public void o() {
        com.tencent.mm.booter.s sVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "reset");
        ((com.tencent.mars.stn.StnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.stn.StnManager.class)).resetAndInitEncoderVersion(com.tencent.mars.WeChatMars.currentCertVer(), "default");
        if (z65.c.a() && (sVar = ((km0.c) gm0.j1.p().a()).f308992f) != null) {
            sVar.f(sVar.f63567f);
        }
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            ((com.tencent.paymars.stn.StnManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.stn.StnManager.class)).resetAndInitEncoderVersion(com.tencent.paymars.WeChatMars.currentCertVer(), "default");
        }
        synchronized (this.f72129b) {
            for (int i17 = 0; i17 < this.f72128a; i17++) {
                if (this.f72129b[i17] != null) {
                    try {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "mmcgi reset outQueue: netId:%d hash:%d type:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f72129b[i17].f72108g.getType()), java.lang.Integer.valueOf(this.f72129b[i17].f72108g.o2()));
                        this.f72129b[i17] = null;
                    } catch (android.os.RemoteException e17) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.MMNativeNetTaskAdapter", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
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
    public final int p(com.tencent.mm.network.z0 r27, com.tencent.mm.network.o0 r28, com.tencent.mm.network.o r29, int r30, com.tencent.mm.network.ReqInfo r31) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.network.q2.p(com.tencent.mm.network.z0, com.tencent.mm.network.o0, com.tencent.mm.network.o, int, com.tencent.mm.network.ReqInfo):int");
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
    public int q(com.tencent.mm.network.z0 r29, com.tencent.mm.network.o0 r30, com.tencent.mm.network.o r31, int r32, com.tencent.mm.network.ReqInfo r33) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.network.q2.q(com.tencent.mm.network.z0, com.tencent.mm.network.o0, com.tencent.mm.network.o, int, com.tencent.mm.network.ReqInfo):int");
    }

    public final void t(com.tencent.mm.network.z0 z0Var, com.tencent.mm.network.o oVar, com.tencent.mars.stn.StnManager.Task task) {
        try {
            java.util.Map<java.lang.String, java.lang.String> map = task.extraInfo;
            boolean z17 = true;
            boolean z18 = map != null && map.size() > 0;
            boolean l17 = j62.e.g().l("clicfg_start_task_with_buf", false, true, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMNativeNetTaskAdapter", "mmpack isStartTaskWithBuf:%b isPayCgi:%b", java.lang.Boolean.valueOf(l17), java.lang.Boolean.valueOf(z18));
            if (l17 && !z18) {
                z0Var.getReqObj().b3();
                task.useReqBuf = true;
                r45.ir5 ir5Var = new r45.ir5();
                ir5Var.f377284e = com.tencent.mm.protobuf.g.b(z0Var.getReqObj().y4());
                if (z0Var.getReqObj().b3()) {
                    o45.ag.m();
                    byte[] mainHostServerId = ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).getMainHostServerId();
                    byte[] o17 = oVar.o();
                    com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(mainHostServerId));
                    com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(o17));
                    ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).setMainHostServerId(o17);
                    byte[] y07 = oVar.y0();
                    if (!com.tencent.mm.sdk.platformtools.t8.M0(y07)) {
                        ((com.tencent.mars.account.AccountManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.account.AccountManager.class)).updateServerIndex(y07);
                    }
                    r45.hg0 hg0Var = new r45.hg0();
                    hg0Var.f376128d = o45.ag.a();
                    hg0Var.f376129e = o45.ag.f342894c;
                    hg0Var.f376130f = com.tencent.mm.protobuf.g.b(o45.ag.e());
                    hg0Var.f376131g = com.tencent.mm.protobuf.g.b(o45.ag.f());
                    boolean z19 = o45.ag.f342892a;
                    o45.ag.a();
                    com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(o45.ag.e()));
                    com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.j(o45.ag.f()));
                    long j17 = task.cgiID;
                    if (j17 == 763) {
                        r45.oc ocVar = new r45.oc();
                        ocVar.parseFrom(z0Var.getReqObj().y4());
                        com.tencent.mm.protobuf.g gVar = ocVar.f382141d.f382935d.f371841f;
                        if (gVar == null) {
                            gVar = com.tencent.mm.protobuf.g.b(new byte[0]);
                        }
                        hg0Var.f376132h = gVar;
                    } else if (j17 == 3941) {
                        r45.oc ocVar2 = new r45.oc();
                        ocVar2.parseFrom(z0Var.getReqObj().y4());
                        com.tencent.mm.protobuf.g gVar2 = ocVar2.f382141d.f382935d.f371841f;
                        if (gVar2 == null) {
                            gVar2 = com.tencent.mm.protobuf.g.b(new byte[0]);
                        }
                        hg0Var.f376132h = gVar2;
                        com.tencent.mm.protobuf.g gVar3 = ocVar2.f382141d.f382935d.f371841f;
                        if (gVar3 != null) {
                            int length = gVar3.f192156a.length;
                        }
                    } else if (z0Var.getReqObj().K6() != null) {
                        hg0Var.f376132h = com.tencent.mm.protobuf.g.b(z0Var.getReqObj().K6());
                    } else {
                        hg0Var.f376132h = com.tencent.mm.protobuf.g.b(new byte[0]);
                    }
                    ir5Var.f377292p = hg0Var;
                    ir5Var.f377290n = true;
                    new java.lang.String(z0Var.getReqObj().K6(), java.nio.charset.StandardCharsets.UTF_8);
                    if (z0Var.getReqObj().K6() != null) {
                        int length2 = z0Var.getReqObj().K6().length;
                    }
                } else if (z0Var.getReqObj().isAxAuth()) {
                    r45.tc tcVar = new r45.tc();
                    tcVar.parseFrom(z0Var.getReqObj().sa());
                    r45.xc xcVar = new r45.xc();
                    xcVar.f389964d = tcVar.f386283d;
                    xcVar.f389965e = com.tencent.mm.protobuf.g.b(z0Var.getReqObj().p9());
                    com.tencent.mm.protobuf.g gVar4 = tcVar.f386284e.f371841f;
                    if (gVar4 == null) {
                        gVar4 = com.tencent.mm.protobuf.g.b(new byte[0]);
                    }
                    xcVar.f389966f = gVar4;
                    ir5Var.f377293q = xcVar;
                    ir5Var.f377291o = true;
                }
                ir5Var.f377283d = z0Var.getReqObj().getUin() & io.flutter.embedding.android.KeyboardMap.kValueMask;
                ir5Var.f377285f = z0Var.getNewExtFlags();
                ir5Var.f377288i = z0Var.getReqObj().getRouteInfo();
                if (oVar.isForeground()) {
                    z17 = false;
                }
                ir5Var.f377286g = z17;
                ir5Var.f377295s = z0Var.getReqObj().isRawData();
                ir5Var.f377294r = i(task);
                task.reqBuf = ir5Var.toByteArray();
                int length3 = task.reqBuf.length;
                if (z0Var.getReqObj().sa() != null) {
                    int length4 = z0Var.getReqObj().sa().length;
                }
                if (z0Var.getReqObj().y4() != null) {
                    int length5 = z0Var.getReqObj().y4().length;
                }
                z0Var.getReqObj().getRouteInfo();
                z0Var.getReqObj().isRawData();
            }
        } catch (java.lang.Exception e17) {
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMNativeNetTaskAdapter", "mmpack exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            task.useReqBuf = false;
        }
    }
}
