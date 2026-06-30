package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes2.dex */
public final class f90 extends l75.n0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f208289h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.Object f208290i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f208291d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f208292e;

    /* renamed from: f, reason: collision with root package name */
    public final l75.k0 f208293f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f208294g;

    static {
        l75.e0 e0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.getClass();
        e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36174x3164ae;
        f208289h = new java.lang.String[]{l75.n0.m145250x3fdc6f77(e0Var, dm.i4.f66894xc4fe047c)};
        f208290i = new java.lang.Object();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f90(l75.k0 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "_db"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            com.tencent.mm.plugin.finder.storage.h90 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec
            r0.getClass()
            l75.e0 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.m59188xe3b3eb2d()
            java.lang.String[] r1 = dm.i4.f66882x371a9529
            java.lang.String r2 = "FinderFeedItem"
            r8.<init>(r9, r0, r2, r1)
            r8.f208291d = r2
            r8.f208293f = r9
            com.tencent.mm.plugin.finder.storage.kj0 r9 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.lj0.f208676a
            r0 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r1[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1[r2] = r3
            java.util.List r1 = kz5.c0.i(r1)
            java.util.ArrayList r1 = r9.b(r1)
            r8.f208294g = r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r4.intValue()
            r5 = r5 & r2
            if (r5 == 0) goto L3f
            int r5 = r4.intValue()
            r5 = r5 & r0
            if (r5 != 0) goto L3f
            r3.add(r4)
            goto L3f
        L5d:
            java.lang.String r1 = "localFlag"
            java.lang.String r4 = r9.a(r3, r1)
            r8.f208292e = r4
            java.lang.String r5 = "CONDITION_POST "
            java.lang.String r4 = r5.concat(r4)
            java.lang.String r5 = "Finder.FinderFeedStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r4)
            r3.clear()
            java.util.ArrayList r4 = r8.f208294g
            java.util.Iterator r4 = r4.iterator()
        L79:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L97
            java.lang.Object r6 = r4.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r7 = r6.intValue()
            r7 = r7 & r2
            if (r7 != 0) goto L93
            int r7 = r6.intValue()
            r7 = r7 & r0
            if (r7 == 0) goto L79
        L93:
            r3.add(r6)
            goto L79
        L97:
            java.lang.String r9 = r9.a(r3, r1)
            java.lang.String r0 = "FAIL_OR_WAITING "
            java.lang.String r9 = r0.concat(r9)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.f90.<init>(l75.k0):void");
    }

    public final java.util.List D0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f208293f.f("SELECT * FROM FinderFeedItem  WHERE localFlag IN (1, 2);", null, 2);
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079();
            c14994x9b99c079.mo9015xbf5d97fd(f17);
            arrayList.add(c14994x9b99c079);
        }
        f17.close();
        return arrayList;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 J0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        android.database.Cursor f17 = this.f208293f.f("SELECT * FROM FinderFeedItem  WHERE localFlag IN (64);", null, 2);
        while (true) {
            if (!f17.moveToNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079();
            c14994x9b99c0792.mo9015xbf5d97fd(f17);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c14994x9b99c0792.m59213xb1ff73bc(), str)) {
                c14994x9b99c079 = c14994x9b99c0792;
                break;
            }
        }
        f17.close();
        return c14994x9b99c079;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 L0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079();
        android.database.Cursor f17 = this.f208293f.f("SELECT * FROM FinderFeedItem  WHERE " + this.f208292e + " ORDER BY " + this.f208291d + ".localId ASC LIMIT 1", null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        c14994x9b99c079.mo9015xbf5d97fd(f17);
        f17.close();
        return c14994x9b99c079;
    }

    public final long P0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        long cj6 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).cj();
        finderObj.m59392xc56a4324(cj6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedStorage", "new feed rowId " + this.f208293f.l(dm.i4.f66894xc4fe047c, dm.i4.f66867x2a5c95c7, finderObj.mo9763xeb27878e()) + ' ' + pm0.b0.g(finderObj.getFeedObject()) + " localID: " + cj6);
        return cj6;
    }

    public final boolean y0(long j17, boolean z17) {
        r45.y31 y31Var;
        java.util.LinkedList m75941xfb821914;
        if (z17) {
            bu2.d0 d0Var = bu2.e0.f106031a;
            for (java.lang.Integer num : bu2.e0.f106033c) {
                int intValue = num.intValue();
                bu2.d0 d0Var2 = bu2.e0.f106031a;
                d0Var2.l(intValue);
                java.util.LinkedList m75941xfb8219142 = bu2.e0.f106035e.a(intValue).f106026c.m75941xfb821914(0);
                if (m75941xfb8219142 != null && (y31Var = (r45.y31) kz5.n0.a0(m75941xfb8219142, 0)) != null && (m75941xfb821914 = y31Var.m75941xfb821914(0)) != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
                    pm0.v.d0(m75941xfb821914, new bu2.w(j17, c0Var));
                    if (c0Var.f391645d) {
                        d0Var2.b(bu2.e0.f106035e.a(intValue));
                    }
                }
            }
        }
        int mo70514xb06685ab = this.f208293f.mo70514xb06685ab(dm.i4.f66894xc4fe047c, "localId=?", new java.lang.String[]{"" + j17});
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedStorage", "[deleteByLocalId] ret:" + mo70514xb06685ab);
        return mo70514xb06685ab > 0;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 z0(long j17) {
        android.database.Cursor f17 = this.f208293f.f("SELECT * FROM FinderFeedItem  WHERE FinderFeedItem.localId=" + j17, null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079();
        c14994x9b99c079.mo9015xbf5d97fd(f17);
        f17.close();
        return c14994x9b99c079;
    }
}
