package b82;

/* loaded from: classes12.dex */
public class a extends l75.n0 implements o72.y3 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f99837d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f99838e;

    public a(l75.k0 k0Var) {
        super(k0Var, o72.e2.U, "FavCdnInfo", null);
        this.f99838e = new java.util.concurrent.CopyOnWriteArrayList();
        this.f99837d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: A5, reason: merged with bridge method [inline-methods] */
    public boolean mo9952xce0038c9(o72.e2 e2Var, java.lang.String... strArr) {
        if (!super.mo9952xce0038c9(e2Var, strArr)) {
            return false;
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f99838e).iterator();
        while (it.hasNext()) {
            o72.x3 x3Var = (o72.x3) it.next();
            if (x3Var != null) {
                x3Var.R4(e2Var);
            }
        }
        java.util.Iterator it6 = ((fs.c) fs.g.f(o72.g5.class)).all().iterator();
        while (it6.hasNext()) {
            ((bz4.n0) ((o72.g5) ((fs.q) it6.next()).get())).c(e2Var);
        }
        return true;
    }

    @Override // o72.y3
    public void Ia(o72.x3 x3Var) {
        if (x3Var != null) {
            java.util.List list = this.f99838e;
            if (((java.util.concurrent.CopyOnWriteArrayList) list).contains(x3Var)) {
                return;
            }
            ((java.util.concurrent.CopyOnWriteArrayList) list).add(x3Var);
        }
    }

    @Override // o72.y3
    public void Ke(o72.r2 r2Var) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f99837d.A("FavCdnInfo", "update FavCdnInfo set status = 1,modifyTime = " + java.lang.System.currentTimeMillis() + " where favLocalId = " + r2Var.f67645x88be67a1 + " and type = 0 and status <> 3");
    }

    @Override // o72.y3
    public int Nd(long j17, int i17) {
        android.database.Cursor f17 = this.f99837d.f("select status from FavCdnInfo where favLocalId = " + j17 + " and type = " + i17, null, 2);
        if (f17 == null) {
            return 3;
        }
        if (!f17.moveToFirst()) {
            f17.close();
            return 3;
        }
        boolean z17 = true;
        boolean z18 = true;
        boolean z19 = true;
        do {
            int i18 = f17.getInt(0);
            if (i18 == 1) {
                f17.close();
                return 1;
            }
            if (i18 != 4) {
                z18 = false;
            }
            if (i18 != 2) {
                z17 = false;
            }
            if (i18 != 3) {
                z19 = false;
            }
        } while (f17.moveToNext());
        f17.close();
        if (z17) {
            return 2;
        }
        if (z18) {
            return 4;
        }
        return z19 ? 3 : 0;
    }

    @Override // l75.n0
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public boolean mo9951xb06685ab(o72.e2 e2Var, java.lang.String... strArr) {
        if (!super.mo9951xb06685ab(e2Var, strArr)) {
            return false;
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f99838e).iterator();
        while (it.hasNext()) {
            o72.x3 x3Var = (o72.x3) it.next();
            if (x3Var != null) {
                x3Var.R4(e2Var);
            }
        }
        java.util.Iterator it6 = ((fs.c) fs.g.f(o72.g5.class)).all().iterator();
        while (it6.hasNext()) {
            ((bz4.n0) ((o72.g5) ((fs.q) it6.next()).get())).c(e2Var);
        }
        return true;
    }

    @Override // o72.y3
    public o72.e2 Xf(java.lang.String str) {
        o72.e2 e2Var = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavCdnStorage", "md5 null");
            return null;
        }
        android.database.Cursor f17 = this.f99837d.f("select * from FavCdnInfo where dataId = '" + str + "'", null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            e2Var = new o72.e2();
            e2Var.mo9015xbf5d97fd(f17);
        }
        f17.close();
        return e2Var;
    }

    @Override // o72.y3
    public void Y(o72.x3 x3Var) {
        if (x3Var != null) {
            ((java.util.concurrent.CopyOnWriteArrayList) this.f99838e).remove(x3Var);
        }
    }

    @Override // o72.y3
    public java.util.List d3(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f99837d.f("select * from FavCdnInfo where favLocalId = " + j17, null, 2);
        if (f17 != null) {
            while (f17.moveToNext()) {
                o72.e2 e2Var = new o72.e2();
                e2Var.mo9015xbf5d97fd(f17);
                arrayList.add(e2Var);
            }
            f17.close();
        }
        arrayList.size();
        return arrayList;
    }

    @Override // o72.y3
    public void fb(long j17) {
        this.f99837d.A("FavCdnInfo", java.lang.String.format("delete from %s where %s = %d and %s = %d", "FavCdnInfo", "favLocalId", java.lang.Long.valueOf(j17), "type", 0));
    }

    @Override // o72.y3
    public boolean fg(long j17) {
        o72.e2 e2Var = new o72.e2();
        e2Var.f67088x958756b0 = j17;
        return mo9951xb06685ab(e2Var, "favLocalId");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r4.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        r5 = new o72.e2();
        r5.mo9015xbf5d97fd(r4);
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (r4.moveToNext() != false) goto L13;
     */
    @Override // o72.y3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List ng(long r4) {
        /*
            r3 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "select * from FavCdnInfo where favLocalId = "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " and type = 0 and status = 3"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r5 = 0
            r1 = 2
            l75.k0 r2 = r3.f99837d
            android.database.Cursor r4 = r2.f(r4, r5, r1)
            if (r4 == 0) goto L3a
            boolean r5 = r4.moveToFirst()
            if (r5 == 0) goto L3a
        L29:
            o72.e2 r5 = new o72.e2
            r5.<init>()
            r5.mo9015xbf5d97fd(r4)
            r0.add(r5)
            boolean r5 = r4.moveToNext()
            if (r5 != 0) goto L29
        L3a:
            if (r4 == 0) goto L3f
            r4.close()
        L3f:
            r0.size()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b82.a.ng(long):java.util.List");
    }

    @Override // l75.n0, l75.g0
    /* renamed from: rg, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(o72.e2 e2Var) {
        if (e2Var == null || !super.mo880xb970c2b9(e2Var)) {
            return false;
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f99838e).iterator();
        while (it.hasNext()) {
            o72.x3 x3Var = (o72.x3) it.next();
            if (x3Var != null) {
                x3Var.R4(e2Var);
            }
        }
        java.util.Iterator it6 = ((fs.c) fs.g.f(o72.g5.class)).all().iterator();
        while (it6.hasNext()) {
            ((bz4.n0) ((o72.g5) ((fs.q) it6.next()).get())).c(e2Var);
        }
        return true;
    }
}
