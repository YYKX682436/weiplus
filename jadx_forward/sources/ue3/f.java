package ue3;

/* loaded from: classes7.dex */
public final class f implements jc3.t {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f508431c = new java.util.LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f508432a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f508433b;

    public f(int i17, java.lang.String bizName, java.lang.String storageFileNamePrefix) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageFileNamePrefix, "storageFileNamePrefix");
        this.f508432a = bizName;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushMMKVStorage", "getMMKV uin:" + i17 + " bizName:" + bizName);
        if (storageFileNamePrefix.length() > 0) {
            M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(storageFileNamePrefix + i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
        } else {
            M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MagicBrushMMKVStorage" + i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
        }
        this.f508433b = M;
        int d17 = d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushMMKVStorage", bizName + " storageTotalSize " + d17);
        ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicStorageFsInitialize", 1, "{\"bizName\":\"" + bizName + "\",\"storageSize\":" + d17 + '}', com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16455x3f8428aa.f37608xae5929.getValue());
    }

    public void a() {
        java.lang.String str = this.f508432a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.String str2 = str + "__";
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f508433b;
        java.lang.String[] b17 = o4Var.b();
        if (b17 == null) {
            b17 = new java.lang.String[0];
        }
        for (java.lang.String str3 : b17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            if (r26.i0.y(str3, str2, false)) {
                o4Var.remove(str3);
            }
        }
        o4Var.putString(ue3.d.a(str, "@@@TOTAL@DATA@SIZE@@@", "++"), java.lang.String.valueOf(0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if ((r4.length() == 0) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object[] b(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.f508432a
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r1 != 0) goto L5f
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6)
            if (r1 == 0) goto Lf
            goto L5f
        Lf:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6)
            java.lang.String r1 = "__"
            java.lang.String r6 = ue3.d.a(r0, r6, r1)
            com.tencent.mm.sdk.platformtools.o4 r0 = r5.f508433b
            java.lang.String r1 = ""
            java.lang.String r6 = r0.getString(r6, r1)
            if (r6 != 0) goto L23
            goto L24
        L23:
            r1 = r6
        L24:
            ue3.e r6 = r5.h(r1)
            java.lang.String r0 = r6.f508428a
            int r1 = r0.length()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L34
            r1 = r2
            goto L35
        L34:
            r1 = r3
        L35:
            java.lang.String r4 = r6.f508430c
            java.lang.String r6 = r6.f508429b
            if (r1 == 0) goto L52
            int r1 = r6.length()
            if (r1 != 0) goto L43
            r1 = r2
            goto L44
        L43:
            r1 = r3
        L44:
            if (r1 == 0) goto L52
            int r1 = r4.length()
            if (r1 != 0) goto L4e
            r1 = r2
            goto L4f
        L4e:
            r1 = r3
        L4f:
            if (r1 == 0) goto L52
            goto L53
        L52:
            r2 = r3
        L53:
            if (r2 != 0) goto L5c
            lc3.z r1 = lc3.x.f399467a
            java.lang.Object[] r6 = new java.lang.Object[]{r1, r0, r6, r4}
            return r6
        L5c:
            java.lang.Object[] r6 = ue3.d.f508427a
            return r6
        L5f:
            lc3.z r6 = lc3.y.f399473b
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ue3.f.b(java.lang.String):java.lang.Object[]");
    }

    public long c() {
        java.lang.Object[] objArr = ue3.d.f508427a;
        java.lang.String bizName = this.f508432a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        if (((java.util.ArrayList) jc3.u0.f380533e).contains(bizName)) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4.class))).wi(bizName).f380498a;
        }
        return 209715200L;
    }

    public int d() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f508433b.getString(ue3.d.a(this.f508432a, "@@@TOTAL@DATA@SIZE@@@", "++"), ""), 0);
    }

    public java.lang.Object[] e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = this.f508432a + "__";
        java.lang.String[] b17 = this.f508433b.b();
        if (b17 == null) {
            b17 = new java.lang.String[0];
        }
        for (java.lang.String str2 : b17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            if (r26.i0.y(str2, str, false)) {
                arrayList.add(r26.i0.t(str2, str, "", false));
            }
        }
        return new java.lang.Object[]{lc3.x.f399467a, arrayList, java.lang.Integer.valueOf(d()), java.lang.Long.valueOf(c())};
    }

    public lc3.z f(java.lang.String str) {
        int i17;
        java.lang.String str2 = this.f508432a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return lc3.y.f399473b;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.lang.String a17 = ue3.d.a(str2, str, "__");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f508433b;
        java.lang.String string = o4Var.getString(a17, "");
        try {
            i17 = java.lang.Integer.parseInt(h(string != null ? string : "").f508430c);
        } catch (java.lang.NumberFormatException unused) {
            i17 = 0;
        }
        o4Var.remove(a17);
        int d17 = d() + (-i17);
        o4Var.putString(ue3.d.a(str2, "@@@TOTAL@DATA@SIZE@@@", "++"), java.lang.String.valueOf(d17 > 0 ? d17 : 0));
        return lc3.x.f399467a;
    }

    public lc3.z g(java.lang.String str, java.lang.String str2, java.lang.String dataType) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataType, "dataType");
        java.lang.Object[] objArr = ue3.d.f508427a;
        int length = (str == null ? "" : str).length() + (str2 == null ? "" : str2).length();
        java.lang.String str3 = this.f508432a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return lc3.y.f399473b;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.lang.String a17 = ue3.d.a(str3, str, "__");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f508433b;
        java.lang.String string = o4Var.getString(a17, "");
        if (string == null) {
            string = "";
        }
        try {
            i17 = java.lang.Integer.parseInt(h(string).f508430c);
        } catch (java.lang.NumberFormatException unused) {
            i17 = 0;
        }
        int i18 = length - i17;
        if (((long) (d() + i18)) >= c()) {
            return lc3.y.f399474c;
        }
        o4Var.putString(a17, "" + dataType + '#' + length + '#' + str2);
        int d17 = d() + i18;
        o4Var.putString(ue3.d.a(str3, "@@@TOTAL@DATA@SIZE@@@", "++"), java.lang.String.valueOf(d17 > 0 ? d17 : 0));
        return lc3.x.f399467a;
    }

    public final ue3.e h(java.lang.String str) {
        java.lang.String[] strArr = (java.lang.String[]) new r26.t("#").g(str, 3).toArray(new java.lang.String[0]);
        return strArr.length == 3 ? new ue3.e(strArr[2], strArr[0], strArr[1]) : new ue3.e("", "", "");
    }
}
