package z72;

/* loaded from: classes12.dex */
public class a extends l75.s0 implements o72.y3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b f552080d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae f552081e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f552082f = new java.util.concurrent.CopyOnWriteArrayList();

    public a(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b) {
        this.f552080d = c26918x6e83759b;
        this.f552081e = c26918x6e83759b.m106824x752de218("FavCdnInfo", up5.b.f511425b);
    }

    public static java.util.List m0(java.util.List list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(n0((up5.p) it.next()));
        }
        return arrayList;
    }

    public static o72.e2 n0(up5.p pVar) {
        if (pVar == null) {
            return null;
        }
        o72.e2 e2Var = new o72.e2();
        e2Var.f67085xf604e54a = pVar.f511562a;
        e2Var.f67088x958756b0 = pVar.f511563b;
        e2Var.f67095x2262335f = pVar.f511564c;
        e2Var.f67084xf47770e7 = pVar.f511565d;
        e2Var.f67083xf47749d7 = pVar.f511566e;
        e2Var.f67094xeb1a61d6 = pVar.f511567f;
        e2Var.f67090x90a9378 = pVar.f511568g;
        e2Var.f67093x10a0fed7 = pVar.f511569h;
        e2Var.f67091x2260084a = pVar.f511570i;
        e2Var.f67086x886617a9 = pVar.f511571j;
        e2Var.f67089x15b870c = pVar.f511572k;
        e2Var.f67087x26b1b2e8 = pVar.f511573l;
        e2Var.f67082x3ec1f6a2 = pVar.f511574m;
        e2Var.f67092x5e9a8090 = pVar.f511575n;
        return e2Var;
    }

    public static up5.p s0(o72.e2 e2Var) {
        if (e2Var == null) {
            return null;
        }
        up5.p pVar = new up5.p();
        pVar.f511562a = e2Var.f67085xf604e54a;
        pVar.f511563b = e2Var.f67088x958756b0;
        pVar.f511564c = e2Var.f67095x2262335f;
        pVar.f511565d = e2Var.f67084xf47770e7;
        pVar.f511566e = e2Var.f67083xf47749d7;
        pVar.f511567f = e2Var.f67094xeb1a61d6;
        pVar.f511568g = e2Var.f67090x90a9378;
        pVar.f511569h = e2Var.f67093x10a0fed7;
        pVar.f511570i = e2Var.f67091x2260084a;
        pVar.f511571j = e2Var.f67086x886617a9;
        pVar.f511572k = e2Var.f67089x15b870c;
        pVar.f511573l = e2Var.f67087x26b1b2e8;
        pVar.f511574m = e2Var.f67082x3ec1f6a2;
        pVar.f511575n = e2Var.f67092x5e9a8090;
        return pVar;
    }

    @Override // o72.y3
    /* renamed from: A5 */
    public boolean mo9952xce0038c9(o72.e2 e2Var, java.lang.String... strArr) {
        try {
            tp5.a.i(s0(e2Var), this.f552081e, strArr);
            mo142179xf35bbb4(e2Var.f67085xf604e54a, 3, e2Var);
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f552082f).iterator();
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
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    @Override // o72.y3
    public void Ia(o72.x3 x3Var) {
        if (x3Var != null) {
            java.util.List list = this.f552082f;
            if (((java.util.concurrent.CopyOnWriteArrayList) list).contains(x3Var)) {
                return;
            }
            ((java.util.concurrent.CopyOnWriteArrayList) list).add(x3Var);
        }
    }

    @Override // o72.y3
    public void Ke(o72.r2 r2Var) {
        up5.p pVar = new up5.p();
        pVar.f511569h = 1;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        pVar.f511572k = java.lang.System.currentTimeMillis();
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c26924x4cd4bae = this.f552081e;
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.b.f511433j;
            c26924x4cd4bae.m107179xc0204d68((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) pVar, (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae>[]) new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]{c26981x40bb0da, up5.b.f511436m}, up5.b.f511427d.eq(r2Var.f67645x88be67a1).and(up5.b.f511428e.eq(0)).and(c26981x40bb0da.m108325x6424adf(3)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
        }
    }

    @Override // o72.y3
    public int Nd(long j17, int i17) {
        try {
            java.util.List<java.lang.Integer> m107242x9be5b69 = this.f552081e.m107242x9be5b69(up5.b.f511433j, up5.b.f511427d.eq(j17).and(up5.b.f511428e.eq(i17)));
            if (m107242x9be5b69.isEmpty()) {
                return 3;
            }
            java.util.Iterator<java.lang.Integer> it = m107242x9be5b69.iterator();
            boolean z17 = true;
            boolean z18 = true;
            boolean z19 = true;
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (intValue == 1) {
                    return 1;
                }
                if (intValue != 4) {
                    z18 = false;
                }
                if (intValue != 2) {
                    z17 = false;
                }
                if (intValue != 3) {
                    z19 = false;
                }
            }
            if (z17) {
                return 2;
            }
            if (z18) {
                return 4;
            }
            return z19 ? 3 : 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return 3;
        }
    }

    @Override // o72.y3
    /* renamed from: R0 */
    public boolean mo9951xb06685ab(o72.e2 e2Var, java.lang.String... strArr) {
        try {
            tp5.a.b(s0(e2Var), this.f552081e, strArr);
            mo142179xf35bbb4(e2Var.f67085xf604e54a, 5, e2Var);
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f552082f).iterator();
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
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o72.y3
    public o72.e2 Xf(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavCdnNewStorage", "md5 null");
            return null;
        }
        try {
            return n0((up5.p) this.f552081e.m107127x946de4d9(up5.b.f511426c.eq(str)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return null;
        }
    }

    @Override // o72.y3
    public void Y(o72.x3 x3Var) {
        if (x3Var != null) {
            ((java.util.concurrent.CopyOnWriteArrayList) this.f552082f).remove(x3Var);
        }
    }

    @Override // o72.y3
    public java.util.List d3(long j17) {
        try {
            return m0(this.f552081e.m107094xde3eb429(up5.b.f511427d.eq(j17)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.y3
    public void fb(long j17) {
        try {
            this.f552081e.m107088x90df30e9(up5.b.f511427d.eq(j17).and(up5.b.f511428e.eq(0)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
        }
    }

    @Override // o72.y3
    public boolean fg(long j17) {
        try {
            this.f552081e.m107088x90df30e9(up5.b.f511427d.eq(j17));
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    @Override // o72.y3
    public java.util.List ng(long j17) {
        try {
            return m0(this.f552081e.m107094xde3eb429(up5.b.f511427d.eq(j17).and(up5.b.f511428e.eq(0)).and(up5.b.f511433j.eq(3))));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.y3
    /* renamed from: rg */
    public boolean mo880xb970c2b9(o72.e2 e2Var) {
        if (e2Var == null) {
            return false;
        }
        try {
            this.f552081e.m107150x251da358(s0(e2Var));
            mo142179xf35bbb4(e2Var.f67085xf604e54a, 2, e2Var);
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f552082f).iterator();
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
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavCdnNewStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }
}
