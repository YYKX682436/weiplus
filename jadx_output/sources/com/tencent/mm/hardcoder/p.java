package com.tencent.mm.hardcoder;

/* loaded from: classes15.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.hardcoder.o f68277a;

    public static void a(com.tencent.mm.hardcoder.d dVar) {
        int i17;
        int i18;
        java.lang.StringBuilder sb6;
        com.tencent.mm.plugin.hardcoder.a aVar;
        java.lang.String str;
        java.lang.Class cls;
        int i19;
        java.lang.StringBuilder sb7;
        java.lang.StringBuilder sb8;
        java.lang.StringBuilder sb9;
        int i27 = (int) (dVar.f68236a - dVar.f68246k);
        boolean isHcEnable = com.tencent.mm.hardcoder.HardCoderJNI.isHcEnable();
        int isRunning = com.tencent.mm.hardcoder.HardCoderJNI.isRunning();
        int i28 = i27 - dVar.f68237b <= 0 ? 1 : 0;
        int i29 = dVar.f68243h;
        long j17 = dVar.f68244i;
        int i37 = dVar.f68239d;
        int i38 = dVar.f68241f;
        int[] iArr = dVar.f68255t;
        int i39 = (int) (dVar.f68247l - dVar.f68245j);
        int i47 = com.tencent.mm.hardcoder.HardCoderJNI.tickRate;
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
        if (iArr != null) {
            int length = iArr.length;
            i17 = i47;
            int i48 = 0;
            while (i48 < length) {
                int i49 = length;
                sb10.append(iArr[i48] + "#");
                i48++;
                length = i49;
                iArr = iArr;
            }
        } else {
            i17 = i47;
        }
        int[] iArr2 = iArr;
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
        int[] iArr3 = dVar.f68253r;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            i18 = i27;
            int i57 = 0;
            while (i57 < length2) {
                int i58 = length2;
                sb11.append(iArr3[i57] + "#");
                i57++;
                length2 = i58;
                iArr3 = iArr3;
            }
        } else {
            i18 = i27;
        }
        int[] iArr4 = iArr3;
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
        int[] iArr5 = dVar.f68254s;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            sb6 = sb11;
            int i59 = 0;
            while (i59 < length3) {
                int i66 = length3;
                sb12.append(iArr5[i59] + "#");
                i59++;
                length3 = i66;
                iArr5 = iArr5;
            }
        } else {
            sb6 = sb11;
        }
        int[] iArr6 = iArr5;
        com.tencent.mm.hardcoder.n.a("Hardcoder.HardCoderReporter", java.lang.String.format("performanceReport, hash:%s, threadId:%s, enable:%s, engineStatus:%s, cancelInDelay:%s, scene:%s, action:%s, lastCpuLevel:%s, cpuLevel:%s, lastIoLevel:%s, ioLevel:%s, bindCoreIds:%s, executeTime:%s, runtime:%s, phoneHZ:%s, cpuLevelTimeArray:%s, ioLevelTimeArray:%s", java.lang.Integer.valueOf(dVar.hashCode()), dVar.a(), java.lang.Integer.valueOf(isHcEnable ? 1 : 0), java.lang.Integer.valueOf(isRunning), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(dVar.f68250o), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(dVar.f68251p), java.lang.Integer.valueOf(i38), sb10.toString(), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), sb6.toString(), sb12.toString()));
        com.tencent.mm.hardcoder.o oVar = f68277a;
        if (oVar == null) {
            return;
        }
        int[] iArr7 = dVar.f68242g;
        com.tencent.mm.plugin.hardcoder.a aVar2 = (com.tencent.mm.plugin.hardcoder.a) oVar;
        if (com.tencent.mars.xlog.Log.getLogLevel() > 1 && !com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHCKVPerReport()) {
            return;
        }
        boolean isHCEnable = ((com.tencent.mm.hardcoder.WXHardCoderJNI) i95.n0.c(com.tencent.mm.hardcoder.WXHardCoderJNI.class)).isHCEnable();
        if (com.tencent.mm.plugin.hardcoder.a.f142253e != null) {
            aVar = aVar2;
        } else if (com.tencent.mm.sdk.platformtools.x2.n()) {
            gm0.j1.i();
            aVar = aVar2;
            com.tencent.mm.plugin.hardcoder.a.f142253e = (java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HEAVY_USER_FLAG_LONG, 0L);
        } else {
            aVar = aVar2;
            com.tencent.mm.plugin.hardcoder.a.f142253e = 0L;
        }
        if (android.text.TextUtils.isEmpty(com.tencent.mm.plugin.hardcoder.a.f142252d)) {
            com.tencent.mm.plugin.hardcoder.a.f142252d = wo.w0.g(false);
        }
        java.lang.String str2 = com.tencent.mm.plugin.hardcoder.a.f142252d;
        int longValue = (int) com.tencent.mm.plugin.hardcoder.a.f142253e.longValue();
        java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
        if (iArr2 != null) {
            cls = com.tencent.mm.hardcoder.WXHardCoderJNI.class;
            int[] iArr8 = iArr2;
            str = str2;
            int length4 = iArr8.length;
            i19 = i39;
            int i67 = 0;
            while (i67 < length4) {
                int i68 = length4;
                sb13.append(iArr8[i67] + "#");
                i67++;
                length4 = i68;
                iArr8 = iArr8;
            }
        } else {
            str = str2;
            cls = com.tencent.mm.hardcoder.WXHardCoderJNI.class;
            i19 = i39;
        }
        java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
        if (iArr4 != null) {
            int[] iArr9 = iArr4;
            int length5 = iArr9.length;
            sb7 = sb13;
            int i69 = 0;
            while (i69 < length5) {
                int i76 = iArr9[i69];
                int[] iArr10 = iArr9;
                java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
                int i77 = length5;
                sb15.append(i76 < 0 ? 0 : i76);
                sb15.append("#");
                sb14.append(sb15.toString());
                i69++;
                iArr9 = iArr10;
                length5 = i77;
            }
        } else {
            sb7 = sb13;
        }
        java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
        if (iArr6 != null) {
            int[] iArr11 = iArr6;
            int length6 = iArr11.length;
            sb8 = sb14;
            int i78 = 0;
            while (i78 < length6) {
                int i79 = iArr11[i78];
                int[] iArr12 = iArr11;
                java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
                int i86 = length6;
                sb17.append(i79 < 0 ? 0 : i79);
                sb17.append("#");
                sb16.append(sb17.toString());
                i78++;
                iArr11 = iArr12;
                length6 = i86;
            }
        } else {
            sb8 = sb14;
        }
        java.lang.String format = java.lang.String.format("[oneliang]performance report, imei:%s, threadId:%s, enable:%s, heavy:%s, speedUp:%s, engineStatus:%s, cancelInDelay:%s, scene:%s, action:%s, cpuLevel:%s, ioLevel:%s, bindCoreIds:%s, executeTime:%s,runtime:%s, phoneHZ:%s, cpuLevelTimeArray:%s, ioLevelTimeArray:%s", str, java.util.Arrays.toString(iArr7), java.lang.Integer.valueOf(isHcEnable ? 1 : 0), java.lang.Integer.valueOf(longValue), java.lang.Integer.valueOf(isHCEnable ? 1 : 0), java.lang.Integer.valueOf(isRunning), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), sb7.toString(), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), sb8.toString(), sb16.toString());
        java.lang.String format2 = java.lang.String.format("time:%s,imei:%s,threadId:%s,enable:%s,heavy:%s,speedUp:%s,cancelInDelay:%s,sMidascene:%s,action:%s,cpuLevel:%s,ioLevel:%s,bindCoreIds:%s,executeTime:%s,runtime:%s, phoneHZ:%s, cpuLevelTimeArray:%s, ioLevelTimeArray:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, java.util.Arrays.toString(iArr7), java.lang.Integer.valueOf(isHcEnable ? 1 : 0), java.lang.Integer.valueOf(longValue), java.lang.Integer.valueOf(isHCEnable ? 1 : 0), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), sb7.toString(), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), sb8.toString(), sb16.toString());
        if (((com.tencent.mm.hardcoder.WXHardCoderJNI) i95.n0.c(cls)).getDebug()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HardCoderReporterImpl", format);
        }
        java.lang.Object[] objArr = new java.lang.Object[21];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(longValue);
        objArr[2] = java.lang.Integer.valueOf(isHCEnable ? 1 : 0);
        objArr[3] = java.lang.Integer.valueOf(i28);
        objArr[4] = java.lang.Integer.valueOf(i29);
        objArr[5] = java.lang.Long.valueOf(j17);
        objArr[6] = java.lang.Integer.valueOf(i37);
        objArr[7] = java.lang.Integer.valueOf(i38);
        objArr[8] = sb7.toString();
        if (i19 < 0) {
            i19 = 0;
        }
        objArr[9] = java.lang.Integer.valueOf(i19);
        objArr[10] = java.lang.Integer.valueOf(i18);
        objArr[11] = 0;
        objArr[12] = 0;
        objArr[13] = java.lang.Integer.valueOf(i17);
        objArr[14] = 0;
        objArr[15] = sb8.toString();
        objArr[16] = sb16.toString();
        objArr[17] = "";
        objArr[18] = 0;
        objArr[19] = java.lang.Integer.valueOf(isRunning);
        objArr[20] = java.lang.Integer.valueOf(isHcEnable ? 1 : 0);
        aVar.a(14607, objArr);
        if (!com.tencent.mm.plugin.hardcoder.a.f142254f) {
            return;
        }
        java.lang.String str3 = lp0.b.D() + "/hcstat";
        java.lang.String str4 = new java.lang.String[]{str3}[0];
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str4);
        if (!r6Var.m() && (!r6Var.J() || !r6Var.y())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileOperation", "batchMkDirs mkdir error. %s", str4);
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(str3, "data.txt");
        if (!r6Var2.m()) {
            try {
                r6Var2.k();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.HardCoderReporterImpl", "create new file exception:" + e17.getMessage());
            }
        }
        java.io.OutputStream outputStream = null;
        try {
            try {
                outputStream = com.tencent.mm.vfs.w6.I(r6Var2.f213166d, r6Var2.M(), true);
                outputStream.write((format2 + "\n").getBytes(com.tencent.mapsdk.internal.rv.f51270c));
                outputStream.flush();
                try {
                    outputStream.close();
                } catch (java.lang.Exception e18) {
                    e = e18;
                    sb9 = new java.lang.StringBuilder("close exception:");
                    sb9.append(e.getMessage());
                    com.tencent.mars.xlog.Log.i("MicroMsg.HardCoderReporterImpl", sb9.toString());
                }
            } finally {
            }
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HardCoderReporterImpl", "exception:" + e19.getMessage());
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (java.lang.Exception e27) {
                    e = e27;
                    sb9 = new java.lang.StringBuilder("close exception:");
                    sb9.append(e.getMessage());
                    com.tencent.mars.xlog.Log.i("MicroMsg.HardCoderReporterImpl", sb9.toString());
                }
            }
        }
    }
}
