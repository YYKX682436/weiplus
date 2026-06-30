package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class n3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.x1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f162638a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f162639b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f162640c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f162641d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f162642e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f162643f;

    public n3(java.lang.String appid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        this.f162638a = appid;
        this.f162639b = "MicroMsg.WxaStorageSpaceStatisticsService[mountTest]";
        this.f162640c = new java.util.LinkedHashMap();
        this.f162641d = new java.util.LinkedHashMap();
        this.f162642e = new java.lang.Object();
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.Object obj;
        java.util.Iterator it = ((java.util.LinkedHashMap) this.f162641d).keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (r26.i0.y(str, (java.lang.String) obj, false)) {
                break;
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = k(str2, str) ? str2 : "";
        if (this.f162643f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f162639b, "[findMatchMonitorDir] dirPath:" + str3 + "  filePath:" + str + ' ');
        }
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(com.p314xaae8f345.mm.vfs.r6 r11, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k1 r12) {
        /*
            r10 = this;
            if (r11 != 0) goto L5
            r11 = -1
            return r11
        L5:
            com.tencent.mm.vfs.r6[] r11 = r11.G()
            r0 = 0
            if (r11 != 0) goto Le
            return r0
        Le:
            int r2 = r11.length
            r3 = 0
            r5 = r0
            r4 = r3
        L12:
            if (r4 >= r2) goto L41
            r7 = r11[r4]
            boolean r8 = r7.A()
            if (r8 == 0) goto L39
            if (r12 == 0) goto L2f
            java.lang.String r8 = r7.o()
            java.lang.String r9 = "getAbsolutePath(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r9)
            boolean r8 = r12.mo49679xab27b508(r8)
            if (r8 != 0) goto L2f
            r8 = 1
            goto L30
        L2f:
            r8 = r3
        L30:
            if (r8 != 0) goto L37
            long r7 = r7.C()
            goto L3d
        L37:
            r7 = r0
            goto L3d
        L39:
            long r7 = r10.b(r7, r12)
        L3d:
            long r5 = r5 + r7
            int r4 = r4 + 1
            goto L12
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3.b(com.tencent.mm.vfs.r6, com.tencent.mm.plugin.appbrand.appstorage.k1):long");
    }

    public long c(java.lang.String dirPath, java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dirPath, "dirPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        synchronized (this.f162642e) {
            if (!k(dirPath, filePath)) {
                return -1L;
            }
            return e(dirPath, filePath);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k1 d(java.lang.String str, java.lang.String str2) {
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k1> list = (java.util.List) ((java.util.LinkedHashMap) this.f162641d).get(str);
        if (list == null) {
            return null;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k1 k1Var : list) {
            if (k1Var.mo49679xab27b508(str2)) {
                return k1Var;
            }
        }
        return null;
    }

    public final long e(java.lang.String str, java.lang.String str2) {
        java.lang.String i17 = i(str, d(str, str2));
        java.util.Map map = this.f162640c;
        java.lang.Long l17 = (java.lang.Long) ((java.util.LinkedHashMap) map).get(i17);
        long longValue = l17 != null ? l17.longValue() : -1L;
        if (longValue != Long.MIN_VALUE) {
            return longValue;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long b17 = b(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)), d(str, str2));
        map.put(i17, java.lang.Long.valueOf(b17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f162639b, "[getSpaceSize] invalid storage space, get size recursively.  size[" + b17 + "]  cost[" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ']');
        return b17;
    }

    public void f(java.lang.String dirPath, long j17, java.lang.String op6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dirPath, "dirPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(op6, "op");
        h(a(dirPath), dirPath, j17, op6);
    }

    public void g(java.lang.String filePath, long j17, java.lang.String op6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(op6, "op");
        h(a(filePath), filePath, j17, op6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0068, code lost:
    
        if (r15.longValue() != r17) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(java.lang.String r21, java.lang.String r22, long r23, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3.h(java.lang.String, java.lang.String, long, java.lang.String):void");
    }

    public final java.lang.String i(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k1 k1Var) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        if ((k1Var != null ? k1Var.key() : null) == null) {
            str2 = "";
        } else {
            str2 = "#" + k1Var.key();
        }
        sb6.append(str2);
        return sb6.toString();
    }

    public boolean j(java.lang.String dirPath, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k1 filePattern, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dirPath, "dirPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePattern, "filePattern");
        synchronized (this.f162642e) {
            java.lang.String i17 = i(dirPath, filePattern);
            if (this.f162640c.containsKey(i17)) {
                return false;
            }
            this.f162640c.put(i17, java.lang.Long.valueOf(j17));
            if (((java.util.List) ((java.util.LinkedHashMap) this.f162641d).get(dirPath)) == null) {
                this.f162641d.put(dirPath, new java.util.ArrayList());
            }
            java.util.List list = (java.util.List) ((java.util.LinkedHashMap) this.f162641d).get(dirPath);
            if (list != null) {
                list.add(filePattern);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f162639b, "register id=" + i17 + " currentSize=" + j17);
            return true;
        }
    }

    public final boolean k(java.lang.String str, java.lang.String str2) {
        java.util.Map map = this.f162641d;
        if (!map.containsKey(str)) {
            return false;
        }
        java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(str);
        if ((list != null ? list.size() : 0) == 0) {
            return true;
        }
        java.util.List list2 = (java.util.List) ((java.util.LinkedHashMap) map).get(str);
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k1) it.next()).mo49679xab27b508(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
