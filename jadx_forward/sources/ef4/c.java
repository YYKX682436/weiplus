package ef4;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f333970a = true;

    public static final void a(ef4.c cVar, java.lang.String str, int i17, int i18) {
        java.util.List<com.p314xaae8f345.mm.vfs.x1> k17;
        java.lang.String str2;
        java.lang.String str3;
        pm0.c cVar2;
        long j17;
        int i19;
        java.lang.Object obj;
        java.lang.String str4;
        long j18;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Object obj2;
        java.lang.String str7;
        java.util.Iterator it;
        ef4.c cVar3 = cVar;
        cVar.getClass();
        pm0.c cVar4 = new pm0.c("dumpCacheDir " + str);
        java.lang.String str8 = ef4.w.f334001t.a() + str;
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(str8, true);
        if (s17 == null || (k17 = com.p314xaae8f345.mm.vfs.e8.k(s17)) == null) {
            return;
        }
        if (k17.size() > 1) {
            kz5.g0.t(k17, new ef4.a());
        }
        long j19 = 0;
        for (com.p314xaae8f345.mm.vfs.x1 x1Var : k17) {
            j19 += x1Var != null ? x1Var.f294766c : 0L;
        }
        long j27 = j19 > ((long) i17) ? (long) (j19 / 2.0d) : 0L;
        int size = k17.size();
        int i27 = size > i18 ? i18 - size : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryMgr", "cleanCacheFiles cache " + str8 + "  sumSize:" + j19 + " targetSize:" + j27 + "  targetCount" + i27);
        java.util.Iterator it6 = k17.iterator();
        int i28 = 0;
        long j28 = 0;
        while (true) {
            str2 = " time: ";
            str3 = " filePath: ";
            cVar2 = cVar4;
            j17 = j19;
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            int i29 = i28 + 1;
            if (i28 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.vfs.x1 x1Var2 = (com.p314xaae8f345.mm.vfs.x1) next;
            if (x1Var2 != null) {
                it = it6;
                if (!cVar3.f333970a) {
                    break;
                }
                java.lang.String name = x1Var2.f294765b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(".nomedia", name)) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    i19 = i27;
                    obj = ".nomedia";
                    long j29 = x1Var2.f294768e;
                    long j37 = currentTimeMillis - j29;
                    ef4.n.f333993a.a();
                    str4 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
                    j18 = j27;
                    if (j37 <= com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c) {
                        break;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cleanCacheFiles1 ");
                    sb6.append(i28);
                    sb6.append(" filePath: ");
                    sb6.append(name);
                    sb6.append(" time: ");
                    sb6.append(j29);
                    sb6.append(" size: ");
                    long j38 = x1Var2.f294766c;
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j38));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryMgr", sb6.toString());
                    j28 += j38;
                    j27 = j18 - j38;
                    i27 = i19 - 1;
                    com.p314xaae8f345.mm.vfs.w6.h(x1Var2.f294764a);
                    it6 = it;
                    i28 = i29;
                    cVar4 = cVar2;
                    j19 = j17;
                }
            } else {
                it = it6;
            }
            i27 = i27;
            j27 = j27;
            it6 = it;
            i28 = i29;
            cVar4 = cVar2;
            j19 = j17;
        }
        i19 = i27;
        obj = ".nomedia";
        str4 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
        j18 = j27;
        if (j18 > 0 || i19 > 0) {
            int i37 = i19;
            long j39 = j18;
            int i38 = 0;
            for (java.lang.Object obj3 : k17) {
                int i39 = i38 + 1;
                if (i38 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.vfs.x1 x1Var3 = (com.p314xaae8f345.mm.vfs.x1) obj3;
                if (x1Var3 == null) {
                    str5 = str2;
                    str6 = str3;
                    obj2 = obj;
                    str7 = str4;
                } else {
                    if (!cVar3.f333970a) {
                        break;
                    }
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("cleanCacheFiles2 ");
                    sb7.append(i38);
                    sb7.append(str3);
                    java.lang.String str9 = x1Var3.f294765b;
                    sb7.append(str9);
                    sb7.append(str2);
                    str5 = str2;
                    str6 = str3;
                    sb7.append(x1Var3.f294768e);
                    sb7.append(" size: ");
                    long j47 = x1Var3.f294766c;
                    sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j47));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryMgr", sb7.toString());
                    str7 = str4;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str9, str7);
                    obj2 = obj;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, str9)) {
                        j28 += j47;
                        j39 -= j47;
                        i37--;
                        com.p314xaae8f345.mm.vfs.w6.h(x1Var3.f294764a);
                        if (j39 <= 0 && i37 <= 0) {
                            break;
                        }
                        cVar3 = cVar;
                        str2 = str5;
                        str3 = str6;
                        str4 = str7;
                        i38 = i39;
                        obj = obj2;
                    }
                }
                cVar3 = cVar;
                str2 = str5;
                str3 = str6;
                str4 = str7;
                i38 = i39;
                obj = obj2;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryMgr", "cleanCacheFiles totalSize " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j17) + " newsize " + (j17 - j28) + " fileSize:" + k17.size() + " cost:" + cVar2);
    }
}
