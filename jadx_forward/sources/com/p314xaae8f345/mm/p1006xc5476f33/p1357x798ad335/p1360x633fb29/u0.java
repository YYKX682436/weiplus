package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public abstract class u0 {
    public static boolean a(long j17) {
        return fp.i.c(((float) j17) * 1.3f);
    }

    public static h02.a b(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var) {
        h02.a aVar = new h02.a();
        java.lang.String str = t0Var.f178683a;
        aVar.f68411x238eb002 = str;
        aVar.f68433xf9fba680 = t0Var.f178684b;
        aVar.f68420xf1eb3542 = t0Var.f178685c;
        aVar.f68412xf70f9e3d = str.hashCode();
        aVar.f68418xf1e8cfcc = t0Var.f178686d;
        aVar.f68421xf1ebe47b = t0Var.f178688f;
        aVar.f68426x4b6e68b9 = t0Var.f178687e;
        aVar.f68404x28d45f97 = t0Var.f178689g;
        aVar.f68406x8d834527 = t0Var.f178691i;
        aVar.f68435x73c7b92d = t0Var.f178692j;
        aVar.f68429xa1e9e82c = t0Var.f178690h;
        aVar.f68405x56e99a7c = t0Var.f178693k;
        int i17 = t0Var.f178694l;
        aVar.f68432x29cbf907 = i17;
        boolean z17 = t0Var.f178696n;
        aVar.f68409xc4f9be67 = z17;
        aVar.f68424x9ef535e4 = t0Var.f178697o;
        aVar.f68417x26b3182a = t0Var.f178699q;
        aVar.f68425x9ddfd98b = t0Var.f178698p;
        aVar.f68423x7e6ed12a = t0Var.f178700r;
        aVar.f68431x4651c731 = z17;
        aVar.f68410x4e46f707 = t0Var.f178704v;
        aVar.f68444x136fa406 = t0Var.f178703u;
        aVar.f68427x7c4053b8 = t0Var.f178702t;
        aVar.f68436x2261a7a0 = t0Var.f178701s;
        aVar.f68437x5ab205af = i17;
        aVar.f68415x8a7becfa = t0Var.D;
        java.util.LinkedList linkedList = t0Var.f178705w;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            d02.q qVar = new d02.q();
            qVar.f306889d = linkedList;
            try {
                aVar.f68434x671f82e6 = qVar.mo14344x5f01b1f6();
            } catch (java.io.IOException unused) {
            }
        }
        aVar.f68430x3a1eb979 = t0Var.f178706x;
        aVar.f68428x579b8428 = t0Var.A;
        return aVar;
    }

    public static boolean c(long j17) {
        java.util.LinkedList linkedList;
        if (a(j17)) {
            return true;
        }
        h02.b g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.g();
        if (g17 == null) {
            linkedList = null;
        } else {
            java.lang.String format = java.lang.String.format("select * from %s where %s<%d order by %s desc", "FileDownloadInfo", dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - 604800000), dm.i4.f66874x4c6b1f55);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadInfoStorage", "getUpdateTimeBiggerThanTimeInterval, sql = " + format);
            android.database.Cursor m145256x1d3f4980 = g17.m145256x1d3f4980(format, new java.lang.String[0]);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            if (m145256x1d3f4980 != null) {
                while (m145256x1d3f4980.moveToNext()) {
                    h02.a aVar = new h02.a();
                    aVar.mo9015xbf5d97fd(m145256x1d3f4980);
                    linkedList2.add(aVar);
                }
                m145256x1d3f4980.close();
            }
            linkedList = linkedList2;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            return false;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            h02.a aVar2 = (h02.a) it.next();
            int i17 = aVar2.f68441x10a0fed7;
            if (i17 != 3 && i17 != 6 && i17 != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadUtil", "delete appId : %s, path : %s", aVar2.f68404x28d45f97, aVar2.f68419xf1e9b966);
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.i(aVar2.f68408x32b20428);
                com.p314xaae8f345.mm.vfs.w6.h(aVar2.f68419xf1e9b966);
                m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
                java.lang.String str = aVar2.f68404x28d45f97;
                ((l02.q) sVar).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.e(str);
                if (android.os.Environment.getExternalStorageDirectory().getFreeSpace() >= j17) {
                    return true;
                }
            }
        }
        return false;
    }
}
