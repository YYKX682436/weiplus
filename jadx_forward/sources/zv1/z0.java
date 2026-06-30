package zv1;

/* loaded from: classes14.dex */
public final class z0 {
    public z0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(zv1.r rVar, java.util.List list, long j17, int i17, long j18) {
        int i18;
        java.lang.String str;
        java.lang.Object obj;
        java.lang.Object obj2;
        int min = java.lang.Math.min(i17, list.size());
        java.lang.String str2 = "dumpTopNFiles TOP ";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", "dumpTopNFiles TOP " + min + " largest files of " + list.size() + " files:");
        int i19 = 0;
        while (true) {
            java.lang.String str3 = "DIR";
            if (i19 >= min) {
                break;
            }
            zv1.a1 a1Var = (zv1.a1) list.get(i19);
            float f17 = ((float) a1Var.f557794b) / 1000000;
            if (!a1Var.f557796d) {
                str3 = "FILE";
            }
            i19++;
            java.lang.String format = java.lang.String.format("[%2d] %s %s - %.2f MB - EXEMPTED(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i19), str3, a1Var.f557793a, java.lang.Float.valueOf(f17), a1Var.f557797e}, 5));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", format);
        }
        int i27 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
        if (i27 > 0) {
            float f18 = 1000000;
            float f19 = ((float) j17) / f18;
            java.util.Iterator it = list.subList(0, min).iterator();
            obj = "DIR";
            obj2 = "FILE";
            long j19 = 0;
            while (it.hasNext()) {
                j19 += ((zv1.a1) it.next()).f557794b;
                str2 = str2;
                i27 = i27;
            }
            i18 = i27;
            str = str2;
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = java.lang.Integer.valueOf(list.size());
            objArr[1] = java.lang.Float.valueOf(f19);
            objArr[2] = java.lang.Integer.valueOf(min);
            objArr[3] = java.lang.Float.valueOf(((float) j19) / f18);
            double d17 = j17 * 100.0d;
            java.util.Iterator it6 = list.iterator();
            long j27 = 0;
            while (it6.hasNext()) {
                j27 += ((zv1.a1) it6.next()).f557794b;
            }
            objArr[4] = java.lang.Double.valueOf(d17 / j27);
            java.lang.String format2 = java.lang.String.format("dumpTopNFiles Total files: %d, Total size: %.2f MB, TOP %d size: %.2f MB (%.1f%%)\n", java.util.Arrays.copyOf(objArr, 5));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", format2);
        } else {
            i18 = i27;
            str = "dumpTopNFiles TOP ";
            obj = "DIR";
            obj2 = "FILE";
        }
        if (j18 > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : list) {
                if (((zv1.a1) obj3).f557795c > j18) {
                    arrayList.add(obj3);
                }
            }
            int min2 = java.lang.Math.min(i17, arrayList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", str + min2 + " largest newer files of " + arrayList.size() + " files: beforeTime=" + zv1.i0.a().format(new java.util.Date(j18)));
            if (!arrayList.isEmpty()) {
                int i28 = 0;
                while (i28 < min2) {
                    zv1.a1 a1Var2 = (zv1.a1) arrayList.get(i28);
                    i28++;
                    java.lang.String format3 = java.lang.String.format("[%2d] %s %s - %.2f MB - Time(%s) - EXEMPTED(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i28), a1Var2.f557796d ? obj : obj2, a1Var2.f557793a, java.lang.Float.valueOf(((float) a1Var2.f557794b) / 1000000), zv1.i0.a().format(new java.util.Date(a1Var2.f557795c)), a1Var2.f557797e}, 6));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format3, "format(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", format3);
                }
                if (i18 > 0) {
                    java.util.Iterator it7 = arrayList.iterator();
                    long j28 = 0;
                    while (it7.hasNext()) {
                        j28 += ((zv1.a1) it7.next()).f557794b;
                    }
                    float f27 = (float) j28;
                    float f28 = 1000000;
                    float f29 = f27 / f28;
                    java.util.Iterator it8 = arrayList.subList(0, min2).iterator();
                    long j29 = 0;
                    while (it8.hasNext()) {
                        j29 += ((zv1.a1) it8.next()).f557794b;
                    }
                    float f37 = ((float) j29) / f28;
                    java.lang.Object[] objArr2 = new java.lang.Object[5];
                    objArr2[0] = java.lang.Integer.valueOf(arrayList.size());
                    objArr2[1] = java.lang.Float.valueOf(f29);
                    objArr2[2] = java.lang.Integer.valueOf(min2);
                    objArr2[3] = java.lang.Float.valueOf(f37);
                    double d18 = j17 * 100.0d;
                    java.util.Iterator it9 = arrayList.iterator();
                    long j37 = 0;
                    while (it9.hasNext()) {
                        j37 += ((zv1.a1) it9.next()).f557794b;
                    }
                    objArr2[4] = java.lang.Double.valueOf(d18 / j37);
                    java.lang.String format4 = java.lang.String.format("dumpTopNFiles Total newer files: %d, Total size: %.2f MB, TOP %d size: %.2f MB (%.1f%%)\n", java.util.Arrays.copyOf(objArr2, 5));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format4, "format(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", format4);
                }
            }
        }
    }

    public final void b(zv1.r continuation, java.util.List fileInfoList, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continuation, "continuation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileInfoList, "fileInfoList");
        if (fileInfoList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCache.Utils", "dumpTopNFiles skip: empty");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : fileInfoList) {
            if (!((zv1.a1) obj).f557796d) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        long j18 = 0;
        while (it.hasNext()) {
            j18 += ((zv1.a1) it.next()).f557794b;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : fileInfoList) {
            if (((zv1.a1) obj2).f557796d) {
                arrayList2.add(obj2);
            }
        }
        a(continuation, kz5.n0.F0(arrayList2, new zv1.x0()), 0L, 10, j17);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : fileInfoList) {
            if (!((zv1.a1) obj3).f557796d) {
                arrayList3.add(obj3);
            }
        }
        a(continuation, kz5.n0.F0(arrayList3, new zv1.y0()), j18, 20, j17);
    }
}
