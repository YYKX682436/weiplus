package com.p314xaae8f345.mm.p788xd6f12a1a;

/* loaded from: classes15.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p788xd6f12a1a.o f149810a;

    public static void a(com.p314xaae8f345.mm.p788xd6f12a1a.d dVar) {
        int i17;
        int i18;
        java.lang.StringBuilder sb6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a aVar;
        java.lang.String str;
        java.lang.Class cls;
        int i19;
        java.lang.StringBuilder sb7;
        java.lang.StringBuilder sb8;
        java.lang.StringBuilder sb9;
        int i27 = (int) (dVar.f149769a - dVar.f149779k);
        boolean m45776xf534dda8 = com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45776xf534dda8();
        int m45777x39e05d35 = com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45777x39e05d35();
        int i28 = i27 - dVar.f149770b <= 0 ? 1 : 0;
        int i29 = dVar.f149776h;
        long j17 = dVar.f149777i;
        int i37 = dVar.f149772d;
        int i38 = dVar.f149774f;
        int[] iArr = dVar.f149788t;
        int i39 = (int) (dVar.f149780l - dVar.f149778j);
        int i47 = com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.f29072x7370fc1d;
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
        int[] iArr3 = dVar.f149786r;
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
        int[] iArr5 = dVar.f149787s;
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
        com.p314xaae8f345.mm.p788xd6f12a1a.n.a("Hardcoder.HardCoderReporter", java.lang.String.format("performanceReport, hash:%s, threadId:%s, enable:%s, engineStatus:%s, cancelInDelay:%s, scene:%s, action:%s, lastCpuLevel:%s, cpuLevel:%s, lastIoLevel:%s, ioLevel:%s, bindCoreIds:%s, executeTime:%s, runtime:%s, phoneHZ:%s, cpuLevelTimeArray:%s, ioLevelTimeArray:%s", java.lang.Integer.valueOf(dVar.hashCode()), dVar.a(), java.lang.Integer.valueOf(m45776xf534dda8 ? 1 : 0), java.lang.Integer.valueOf(m45777x39e05d35), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(dVar.f149783o), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(dVar.f149784p), java.lang.Integer.valueOf(i38), sb10.toString(), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), sb6.toString(), sb12.toString()));
        com.p314xaae8f345.mm.p788xd6f12a1a.o oVar = f149810a;
        if (oVar == null) {
            return;
        }
        int[] iArr7 = dVar.f149775g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a aVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a) oVar;
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() > 1 && !com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45815xc7361015()) {
            return;
        }
        boolean mo45968x586d7588 = ((com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc) i95.n0.c(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.class)).mo45968x586d7588();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223786e != null) {
            aVar = aVar2;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            gm0.j1.i();
            aVar = aVar2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223786e = (java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_FLAG_LONG, 0L);
        } else {
            aVar = aVar2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223786e = 0L;
        }
        if (android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223785d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223785d = wo.w0.g(false);
        }
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223785d;
        int longValue = (int) com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223786e.longValue();
        java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
        if (iArr2 != null) {
            cls = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.class;
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
            cls = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.class;
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
        java.lang.String format = java.lang.String.format("[oneliang]performance report, imei:%s, threadId:%s, enable:%s, heavy:%s, speedUp:%s, engineStatus:%s, cancelInDelay:%s, scene:%s, action:%s, cpuLevel:%s, ioLevel:%s, bindCoreIds:%s, executeTime:%s,runtime:%s, phoneHZ:%s, cpuLevelTimeArray:%s, ioLevelTimeArray:%s", str, java.util.Arrays.toString(iArr7), java.lang.Integer.valueOf(m45776xf534dda8 ? 1 : 0), java.lang.Integer.valueOf(longValue), java.lang.Integer.valueOf(mo45968x586d7588 ? 1 : 0), java.lang.Integer.valueOf(m45777x39e05d35), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), sb7.toString(), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), sb8.toString(), sb16.toString());
        java.lang.String format2 = java.lang.String.format("time:%s,imei:%s,threadId:%s,enable:%s,heavy:%s,speedUp:%s,cancelInDelay:%s,sMidascene:%s,action:%s,cpuLevel:%s,ioLevel:%s,bindCoreIds:%s,executeTime:%s,runtime:%s, phoneHZ:%s, cpuLevelTimeArray:%s, ioLevelTimeArray:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, java.util.Arrays.toString(iArr7), java.lang.Integer.valueOf(m45776xf534dda8 ? 1 : 0), java.lang.Integer.valueOf(longValue), java.lang.Integer.valueOf(mo45968x586d7588 ? 1 : 0), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), sb7.toString(), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), sb8.toString(), sb16.toString());
        if (((com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc) i95.n0.c(cls)).mo45813x744e3c9d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HardCoderReporterImpl", format);
        }
        java.lang.Object[] objArr = new java.lang.Object[21];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(longValue);
        objArr[2] = java.lang.Integer.valueOf(mo45968x586d7588 ? 1 : 0);
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
        objArr[19] = java.lang.Integer.valueOf(m45777x39e05d35);
        objArr[20] = java.lang.Integer.valueOf(m45776xf534dda8 ? 1 : 0);
        aVar.a(14607, objArr);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223787f) {
            return;
        }
        java.lang.String str3 = lp0.b.D() + "/hcstat";
        java.lang.String str4 = new java.lang.String[]{str3}[0];
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str4);
        if (!r6Var.m() && (!r6Var.J() || !r6Var.y())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileOperation", "batchMkDirs mkdir error. %s", str4);
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(str3, "data.txt");
        if (!r6Var2.m()) {
            try {
                r6Var2.k();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HardCoderReporterImpl", "create new file exception:" + e17.getMessage());
            }
        }
        java.io.OutputStream outputStream = null;
        try {
            try {
                outputStream = com.p314xaae8f345.mm.vfs.w6.I(r6Var2.f294699d, r6Var2.M(), true);
                outputStream.write((format2 + "\n").getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                outputStream.flush();
                try {
                    outputStream.close();
                } catch (java.lang.Exception e18) {
                    e = e18;
                    sb9 = new java.lang.StringBuilder("close exception:");
                    sb9.append(e.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HardCoderReporterImpl", sb9.toString());
                }
            } finally {
            }
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HardCoderReporterImpl", "exception:" + e19.getMessage());
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (java.lang.Exception e27) {
                    e = e27;
                    sb9 = new java.lang.StringBuilder("close exception:");
                    sb9.append(e.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HardCoderReporterImpl", sb9.toString());
                }
            }
        }
    }
}
