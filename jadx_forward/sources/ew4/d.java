package ew4;

/* loaded from: classes.dex */
public class d extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f338610d = {l75.n0.m145250x3fdc6f77(ew4.a.B, "WebViewData")};

    public d(l75.k0 k0Var) {
        super(k0Var, ew4.a.B, "WebViewData", null);
    }

    public static java.lang.String P0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.d() + "datastore/";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r8 > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        r1.close();
        r1 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r1.hasNext() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r3 = (java.lang.String) r1.next();
        r4 = new ew4.a();
        r4.f67264x62210b48 = r3;
        super.get(r4, new java.lang.String[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4.f67266x52c1c682) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        r3 = com.p314xaae8f345.mm.vfs.z7.a(P0() + r4.f67266x52c1c682);
        r6 = r3.f294812f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        r13 = com.p314xaae8f345.mm.vfs.e8.l(r6, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r6.equals(r13) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        r3 = new com.p314xaae8f345.mm.vfs.z7(r3.f294810d, r3.f294811e, r13, r3.f294813g, r3.f294814h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        r3 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(r3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        if (r3.a() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        if (r3.f294799a.d(r3.f294800b) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDataStorage", "deleteSize(), delete data file:%s, size:%d, ret:%b", r4.f67266x52c1c682, java.lang.Long.valueOf(r4.f67267x22618426), java.lang.Boolean.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDataStorage", "deleteSize(), delete data appIdKey:%s, size:%d, ret:%b", r4.f67264x62210b48, java.lang.Long.valueOf(r4.f67267x22618426), java.lang.Boolean.valueOf(super.mo9951xb06685ab(r4, new java.lang.String[0])));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ef, code lost:
    
        return r18 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r1.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        r6 = r1.getString(1);
        r10 = r1.getLong(6);
        r5.add(r6);
        r8 = r8 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r1.moveToNext() == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long D0(java.lang.String r17, long r18) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = "WebViewData"
            r2 = r17
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "select * from %s where appId='%s' order by weight,timeStamp"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            android.database.Cursor r1 = r0.m145256x1d3f4980(r1, r3)
            r3 = 0
            if (r1 != 0) goto L1d
            return r3
        L1d:
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            boolean r6 = r1.moveToFirst()
            r7 = 1
            r8 = r18
            if (r6 == 0) goto L42
        L2b:
            java.lang.String r6 = r1.getString(r7)
            r10 = 6
            long r10 = r1.getLong(r10)
            r5.add(r6)
            long r8 = r8 - r10
            boolean r6 = r1.moveToNext()
            if (r6 == 0) goto L42
            int r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r6 > 0) goto L2b
        L42:
            r1.close()
            java.util.Iterator r1 = r5.iterator()
        L49:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Led
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            ew4.a r4 = new ew4.a
            r4.<init>()
            r4.f67264x62210b48 = r3
            java.lang.String[] r3 = new java.lang.String[r2]
            super.get(r4, r3)
            java.lang.String r3 = r4.f67266x52c1c682
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            java.lang.String r5 = "MicroMsg.WebViewDataStorage"
            if (r3 != 0) goto Ld0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = P0()
            r3.append(r6)
            java.lang.String r6 = r4.f67266x52c1c682
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.mm.vfs.z7 r3 = com.p314xaae8f345.mm.vfs.z7.a(r3)
            java.lang.String r6 = r3.f294812f
            if (r6 == 0) goto La1
            java.lang.String r13 = com.p314xaae8f345.mm.vfs.e8.l(r6, r2, r2)
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto La1
            com.tencent.mm.vfs.z7 r6 = new com.tencent.mm.vfs.z7
            java.lang.String r11 = r3.f294810d
            java.lang.String r12 = r3.f294811e
            java.lang.String r14 = r3.f294813g
            java.lang.String r15 = r3.f294814h
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15)
            r3 = r6
        La1:
            com.tencent.mm.vfs.b3 r6 = com.p314xaae8f345.mm.vfs.a3.f294314a
            r10 = 0
            com.tencent.mm.vfs.z2 r3 = r6.m(r3, r10)
            boolean r6 = r3.a()
            if (r6 == 0) goto Lba
            com.tencent.mm.vfs.q2 r6 = r3.f294799a
            java.lang.String r3 = r3.f294800b
            boolean r3 = r6.d(r3)
            if (r3 == 0) goto Lba
            r3 = r7
            goto Lbb
        Lba:
            r3 = r2
        Lbb:
            java.lang.String r6 = r4.f67266x52c1c682
            long r10 = r4.f67267x22618426
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r10, r3}
            java.lang.String r6 = "deleteSize(), delete data file:%s, size:%d, ret:%b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r6, r3)
        Ld0:
            java.lang.String[] r3 = new java.lang.String[r2]
            boolean r3 = super.mo9951xb06685ab(r4, r3)
            java.lang.String r6 = r4.f67264x62210b48
            long r10 = r4.f67267x22618426
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r4, r3}
            java.lang.String r4 = "deleteSize(), delete data appIdKey:%s, size:%d, ret:%b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r4, r3)
            goto L49
        Led:
            long r1 = r18 - r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ew4.d.D0(java.lang.String, long):long");
    }

    public final java.lang.String J0(java.lang.String str, java.lang.String str2) {
        return str + "_" + str2;
    }

    public long L0(java.lang.String str) {
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980(java.lang.String.format("select %s from %s where %s=\"%s\"", "size", "WebViewData", "appIdKey", str + "_###@@@@TOTAL@@@###SIZE####"), new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            r1 = m145256x1d3f4980.moveToFirst() ? m145256x1d3f4980.getLong(0) : 0L;
            m145256x1d3f4980.close();
        }
        return r1;
    }

    public void W0(java.lang.String str, long j17) {
        ew4.a aVar = new ew4.a();
        aVar.f67263x28d45f97 = str;
        aVar.f67264x62210b48 = str + "_###@@@@TOTAL@@@###SIZE####";
        aVar.f67265x876650f1 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        aVar.f67267x22618426 = j17;
        mo11260x413cb2b4(aVar);
    }

    public void b1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, java.lang.String str5) {
        ew4.a aVar = new ew4.a();
        aVar.f67263x28d45f97 = str;
        aVar.f67264x62210b48 = J0(str, str2);
        aVar.f67269x29f571ec = str3;
        aVar.f67270x16a4715d = str4;
        aVar.f67265x876650f1 = j17 + (java.lang.System.currentTimeMillis() / 1000);
        aVar.f67267x22618426 = str2.getBytes().length + str3.getBytes().length;
        aVar.f67268x9c2463f1 = java.lang.System.currentTimeMillis() / 1000;
        aVar.f67266x52c1c682 = str5;
        mo11260x413cb2b4(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if (r4.equals(r8) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        r2 = new com.p314xaae8f345.mm.vfs.z7(r2.f294810d, r2.f294811e, r8, r2.f294813g, r2.f294814h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        r2 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        if (r2.a() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        if (r2.f294799a.d(r2.f294800b) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDataStorage", "clearAllData(), delete data file:%s, ret:%b", r1.f67266x52c1c682, java.lang.Boolean.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDataStorage", "clearAllData(), delete data appIdKey:%s, ret:%b", r1.f67264x62210b48, java.lang.Boolean.valueOf(super.mo9951xb06685ab(r1, new java.lang.String[0])));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
    
        if (r12.moveToNext() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r12.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        r1 = new ew4.a();
        r1.mo9015xbf5d97fd(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1.f67266x52c1c682) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        r2 = com.p314xaae8f345.mm.vfs.z7.a(P0() + r1.f67266x52c1c682);
        r4 = r2.f294812f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
    
        if (r4 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        r8 = com.p314xaae8f345.mm.vfs.e8.l(r4, false, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y0(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r0 = "WebViewData"
            java.lang.String r1 = "appId"
            java.lang.Object[] r12 = new java.lang.Object[]{r0, r1, r12}
            java.lang.String r0 = "select * from %s where %s=\"%s\""
            java.lang.String r12 = java.lang.String.format(r0, r12)
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            android.database.Cursor r12 = r11.m145256x1d3f4980(r12, r1)
            if (r12 == 0) goto Lad
            boolean r1 = r12.moveToFirst()
            if (r1 == 0) goto Laa
        L1e:
            ew4.a r1 = new ew4.a
            r1.<init>()
            r1.mo9015xbf5d97fd(r12)
            java.lang.String r2 = r1.f67266x52c1c682
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
            java.lang.String r3 = "MicroMsg.WebViewDataStorage"
            if (r2 != 0) goto L8f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = P0()
            r2.append(r4)
            java.lang.String r4 = r1.f67266x52c1c682
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.mm.vfs.z7 r2 = com.p314xaae8f345.mm.vfs.z7.a(r2)
            java.lang.String r4 = r2.f294812f
            if (r4 == 0) goto L66
            java.lang.String r8 = com.p314xaae8f345.mm.vfs.e8.l(r4, r0, r0)
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L66
            com.tencent.mm.vfs.z7 r4 = new com.tencent.mm.vfs.z7
            java.lang.String r6 = r2.f294810d
            java.lang.String r7 = r2.f294811e
            java.lang.String r9 = r2.f294813g
            java.lang.String r10 = r2.f294814h
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            r2 = r4
        L66:
            com.tencent.mm.vfs.b3 r4 = com.p314xaae8f345.mm.vfs.a3.f294314a
            r5 = 0
            com.tencent.mm.vfs.z2 r2 = r4.m(r2, r5)
            boolean r4 = r2.a()
            if (r4 == 0) goto L7f
            com.tencent.mm.vfs.q2 r4 = r2.f294799a
            java.lang.String r2 = r2.f294800b
            boolean r2 = r4.d(r2)
            if (r2 == 0) goto L7f
            r2 = 1
            goto L80
        L7f:
            r2 = r0
        L80:
            java.lang.String r4 = r1.f67266x52c1c682
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2}
            java.lang.String r4 = "clearAllData(), delete data file:%s, ret:%b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r2)
        L8f:
            java.lang.String[] r2 = new java.lang.String[r0]
            boolean r2 = super.mo9951xb06685ab(r1, r2)
            java.lang.String r1 = r1.f67264x62210b48
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "clearAllData(), delete data appIdKey:%s, ret:%b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2, r1)
            boolean r1 = r12.moveToNext()
            if (r1 != 0) goto L1e
        Laa:
            r12.close()
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ew4.d.y0(java.lang.String):void");
    }

    public void z0(java.lang.String str, org.json.JSONArray jSONArray) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            arrayList.add(J0(str, jSONArray.optString(i17)));
        }
        java.util.Iterator it = arrayList.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            ew4.a aVar = new ew4.a();
            aVar.f67264x62210b48 = str2;
            super.get(aVar, new java.lang.String[0]);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f67266x52c1c682)) {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(P0() + aVar.f67266x52c1c682);
                java.lang.String str3 = a17.f294812f;
                if (str3 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDataStorage", "clearData(), delete data file:%s, ret:%b", aVar.f67266x52c1c682, java.lang.Boolean.valueOf(m17.a() && m17.f294799a.d(m17.f294800b)));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDataStorage", "clearData(), delete data appIdKey:%s, ret:%b", aVar.f67264x62210b48, java.lang.Boolean.valueOf(super.mo9951xb06685ab(aVar, new java.lang.String[0])));
            j17 += aVar.f67267x22618426;
        }
        long L0 = L0(str) - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDataStorage", "clearData(), currSize:%d", java.lang.Long.valueOf(L0));
        W0(str, L0 >= 0 ? L0 : 0L);
    }
}
