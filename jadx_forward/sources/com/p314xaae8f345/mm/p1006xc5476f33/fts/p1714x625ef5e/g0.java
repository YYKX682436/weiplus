package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class g0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f219077n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f219078o = new java.util.HashSet();

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219079p;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, java.lang.String str) {
        this.f219079p = lVar;
        this.f219077n = str;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "MarkLabelDirtyByUsernameTask";
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f219079p;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p) lVar.f219122h;
        pVar.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str = this.f219077n;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = Bi.L(str);
        if (L == null) {
            L = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            android.database.Cursor e17 = pVar.e("SELECT contactLabelIds FROM rcontact WHERE username = ? AND deleteFlag=0 AND (type & 0x1) > 0;", new java.lang.String[]{str}, 2);
            if (e17.moveToNext()) {
                L.r1(e17.getString(0));
            }
            e17.close();
        }
        java.lang.String D0 = L.D0();
        if (D0 != null && D0.endsWith("\u0000")) {
            D0 = D0.substring(0, D0.length() - 1);
        }
        java.util.regex.Pattern pattern = o13.c.f423747g;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (D0 == null) {
            D0 = "";
        }
        java.lang.String[] split = pattern.split(D0);
        java.util.List u17 = lVar.u(str, split);
        java.util.HashSet hashSet = this.f219078o;
        if (u17 != null) {
            java.util.Iterator it = u17.iterator();
            while (it.hasNext()) {
                long longValue = ((java.lang.Long) it.next()).longValue();
                if (longValue != 0) {
                    hashSet.add(java.lang.Long.valueOf(longValue));
                }
            }
        }
        for (java.lang.String str2 : split) {
            long F1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F1(str2, 0L);
            if (F1 != 0) {
                hashSet.add(java.lang.Long.valueOf(F1));
            }
        }
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            long longValue2 = ((java.lang.Long) it6.next()).longValue();
            if (longValue2 != 0 && !lVar.f219127p.containsKey(java.lang.Long.valueOf(longValue2))) {
                lVar.f219127p.put(java.lang.Long.valueOf(longValue2), lVar.f219121g.w(o13.d.f423759l, java.lang.String.valueOf(longValue2), 1));
            }
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "markLabelDirty: " + this.f219078o.toString();
    }
}
