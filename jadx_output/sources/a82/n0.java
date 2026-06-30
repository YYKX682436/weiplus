package a82;

/* loaded from: classes12.dex */
public final class n0 extends jm0.g {

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f2084m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f2085n;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f2086f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f2087g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f2088h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2089i;

    static {
        f2084m = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigFavCheckCdnNewCgiSwitch()) == 1;
        f2085n = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigFavCheckCdnCountSwitch());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f2086f = jz5.h.b(a82.l0.f2071d);
        this.f2087g = jz5.h.b(a82.f0.f1993d);
        this.f2088h = jz5.h.b(new a82.g0(service));
        this.f2089i = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigFavCheckCdnFixSwitch()) == 1;
    }

    public final boolean T6(java.lang.String str, java.lang.String str2, r45.gp0 gp0Var, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavCheckCdnFSC", "copyDownloadData " + str3);
        boolean x17 = com.tencent.mm.vfs.w6.x(str, str2, true);
        if (x17) {
            long k17 = com.tencent.mm.vfs.w6.k(str2);
            gp0Var.q0(k17);
            java.lang.String p17 = com.tencent.mm.vfs.w6.p(str2);
            java.lang.String f17 = kk.k.f(str2, 0, 256);
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavCheckCdnFSC", str3 + "  fullSize:" + k17 + ", dataMd5:" + p17 + ", dataShortMd5:" + f17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(p17) || com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavCheckCdnFSC", "dataMd5 or dataShortMd5 is null");
            } else {
                gp0Var.p0(p17);
                gp0Var.r0(f17);
            }
        }
        return x17;
    }

    public final boolean U6(java.lang.String str, java.lang.String str2, r45.gp0 gp0Var, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavCheckCdnFSC", "copyDownloadThumb " + str3);
        boolean z17 = true;
        boolean x17 = com.tencent.mm.vfs.w6.x(str, str2, true);
        if (x17) {
            long k17 = com.tencent.mm.vfs.w6.k(str2);
            gp0Var.L0(k17);
            java.lang.String p17 = com.tencent.mm.vfs.w6.p(str2);
            java.lang.String f17 = kk.k.f(str2, 0, 256);
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavCheckCdnFSC", str3 + "  thumbFullSize:" + k17 + ", thumbMd5:" + p17 + ", thumbShortMd5:" + f17);
            if (!(p17 == null || p17.length() == 0)) {
                if (f17 != null && f17.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    gp0Var.N0(p17);
                    gp0Var.M0(f17);
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavCheckCdnFSC", "thumbMd5 or thumbShortMd5 is null");
        }
        return x17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
    
        if (((r15 == null || r15.length() == 0) ? r6 : r7) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f8, code lost:
    
        if ((r0 == null || r0.length() == 0) != false) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(java.util.List r18, java.util.Map r19, r45.bq0 r20, int r21) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.n0.V6(java.util.List, java.util.Map, r45.bq0, int):void");
    }

    public final void W6(java.util.Map map, java.util.Map map2, o72.r2 r2Var, java.util.List list, java.util.Map map3, java.util.List list2, java.util.List list3, java.util.List list4) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            int intValue = ((java.lang.Number) entry.getValue()).intValue();
            r45.gp0 gp0Var = (r45.gp0) map2.get(str);
            if (gp0Var != null) {
                a82.x0 a17 = a82.y0.f2235a.a(r2Var, gp0Var);
                a17.f2217c = 1;
                a17.f2218d = intValue;
                list.add(a17);
            }
        }
        java.util.Iterator it = map3.entrySet().iterator();
        while (true) {
            java.lang.Object obj4 = null;
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            java.lang.String str2 = (java.lang.String) entry2.getKey();
            int intValue2 = ((java.lang.Number) entry2.getValue()).intValue();
            r45.gp0 gp0Var2 = (r45.gp0) map2.get(str2);
            if (gp0Var2 != null) {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    if (kotlin.jvm.internal.o.b(((a82.x0) next).f2215a, str2)) {
                        obj4 = next;
                        break;
                    }
                }
                a82.x0 x0Var = (a82.x0) obj4;
                if (x0Var == null) {
                    x0Var = a82.y0.f2235a.a(r2Var, gp0Var2);
                    list.add(x0Var);
                }
                x0Var.f2223i = 1;
                x0Var.f2224j = intValue2;
            }
        }
        int i17 = 0;
        int i18 = 0;
        for (java.lang.Object obj5 : list2) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.gp0 gp0Var3 = (r45.gp0) obj5;
            java.lang.String X = o72.x1.X(gp0Var3);
            boolean j17 = com.tencent.mm.vfs.w6.j(X);
            java.util.Iterator it7 = list.iterator();
            while (true) {
                if (it7.hasNext()) {
                    obj3 = it7.next();
                    if (kotlin.jvm.internal.o.b(((a82.x0) obj3).f2215a, gp0Var3.T)) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            a82.x0 x0Var2 = (a82.x0) obj3;
            if (x0Var2 != null) {
                x0Var2.f2228n = X;
            }
            if (x0Var2 != null) {
                x0Var2.f2227m = j17 ? 1 : 0;
            }
            if (!j17 && x0Var2 != null) {
                list3.add(x0Var2);
            }
            i18 = i19;
        }
        for (java.lang.Object obj6 : list4) {
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.gp0 gp0Var4 = (r45.gp0) obj6;
            java.lang.String x17 = o72.x1.x(gp0Var4);
            boolean j18 = com.tencent.mm.vfs.w6.j(x17);
            java.util.Iterator it8 = list.iterator();
            while (true) {
                if (it8.hasNext()) {
                    obj = it8.next();
                    if (kotlin.jvm.internal.o.b(((a82.x0) obj).f2215a, gp0Var4.T)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            a82.x0 x0Var3 = (a82.x0) obj;
            if (x0Var3 != null) {
                x0Var3.f2222h = x17;
            }
            if (x0Var3 != null) {
                x0Var3.f2221g = j18 ? 1 : 0;
            }
            if (!j18 && x0Var3 != null) {
                java.util.Iterator it9 = list3.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        obj2 = it9.next();
                        if (kotlin.jvm.internal.o.b(((a82.x0) obj2).f2215a, x0Var3.f2215a)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if (obj2 == null) {
                    list3.add(x0Var3);
                }
            }
            i17 = i27;
        }
    }

    public final void X6(java.lang.String tag, java.lang.String msg) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.length() <= 2000) {
            com.tencent.mars.xlog.Log.i(tag, msg);
            return;
        }
        int i17 = 0;
        int i18 = 1;
        while (i17 < msg.length()) {
            int min = java.lang.Math.min(i17 + 2000, msg.length());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[LogLong Part ");
            sb6.append(i18);
            sb6.append("] ");
            java.lang.String substring = msg.substring(i17, min);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            sb6.append(substring);
            com.tencent.mars.xlog.Log.i(tag, sb6.toString());
            i18++;
            i17 = min;
        }
    }

    public final void Y6(o72.r2 r2Var, int i17) {
        r45.bq0 bq0Var;
        java.util.LinkedList<r45.gp0> linkedList;
        if (!((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi() || i17 == 6 || (bq0Var = r2Var.field_favProto) == null || (linkedList = bq0Var.f370964f) == null) {
            return;
        }
        for (r45.gp0 gp0Var : linkedList) {
            boolean z17 = true;
            if (gp0Var.I != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavCheckCdnFSC", "[#FavPost#] dataItem: htmlId=" + gp0Var.P1 + ", dataId=" + gp0Var.T + ", notCheckData=" + gp0Var.B1 + ", fullMd5=" + gp0Var.M + ", fullSize=" + gp0Var.R);
                if (gp0Var.I == 20) {
                    java.lang.String str = gp0Var.M;
                    if (str != null && str.length() != 0) {
                        z17 = false;
                    }
                    gp0Var.x0(z17);
                }
            }
        }
    }

    public final void Z6(r45.bq0 bq0Var) {
        java.util.LinkedList linkedList;
        if (bq0Var == null || (linkedList = bq0Var.f370964f) == null) {
            return;
        }
        int i17 = 0;
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.gp0 gp0Var = (r45.gp0) obj;
            if (o72.x1.h0(gp0Var.I)) {
                Z6(gp0Var.f375451y2);
                o72.t4 t4Var = (o72.t4) i95.n0.c(o72.t4.class);
                r45.bq0 bq0Var2 = gp0Var.f375451y2;
                java.lang.String str = bq0Var2 != null ? bq0Var2.f370972q : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = bq0Var2 != null ? bq0Var2.f370974s : null;
                java.lang.String str3 = str2 != null ? str2 : "";
                if (bq0Var2 == null) {
                    bq0Var2 = new r45.bq0();
                }
                gp0Var.C0(((com.tencent.mm.pluginsdk.model.v1) t4Var).wi(str, str3, bq0Var2, gp0Var.I));
                X6("MicroMsg.Fav.FavCheckCdnFSC", "RecordInfo update, refreshRecordInfoXml, dataId:" + gp0Var.T + ", dataItem.recordInfo:" + gp0Var.Z1);
            }
            i17 = i18;
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r6v41 java.util.LinkedHashMap), method size: 10858
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:247:0x1fc7 -> B:172:0x1fe8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x2383 -> B:12:0x23a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x2549 -> B:18:0x257f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:733:0x0f56 -> B:476:0x0f85). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:850:0x1033 -> B:325:0x1072). Please report as a decompilation issue!!! */
    public final java.lang.Object a7(o72.r2 r98, kotlin.coroutines.Continuation r99) {
        /*
            Method dump skipped, instructions count: 10858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.n0.a7(o72.r2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b7(java.lang.String r23, r45.gp0 r24, java.lang.String r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.n0.b7(java.lang.String, r45.gp0, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
