package dt4;

/* loaded from: classes9.dex */
public class d extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f324766f = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c.A3, "WalletBankcard")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f324767d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f324768e;

    public d(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c.A3, "WalletBankcard", null);
        this.f324768e = new java.util.LinkedList();
        this.f324767d = k0Var;
    }

    public boolean D0(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            super.mo880xb970c2b9((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) it.next());
        }
        java.util.Iterator it6 = this.f324768e.iterator();
        if (!it6.hasNext()) {
            return true;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it6.next());
        throw null;
    }

    @Override // l75.n0
    /* renamed from: delete */
    public boolean mo9951xb06685ab(l75.f0 f0Var, java.lang.String[] strArr) {
        if (!super.mo9951xb06685ab((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) f0Var, strArr)) {
            return false;
        }
        java.util.Iterator it = this.f324768e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        throw null;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: update */
    public boolean mo9952xce0038c9(l75.f0 f0Var, java.lang.String[] strArr) {
        if (!super.mo9952xce0038c9((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) f0Var, strArr)) {
            return false;
        }
        java.util.Iterator it = this.f324768e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        throw null;
    }

    public java.util.ArrayList y0() {
        l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c.A3;
        java.util.ArrayList arrayList = null;
        android.database.Cursor f17 = this.f324767d.f("select * from WalletBankcard where cardType <= 7 OR cardType & 128 != 0", null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            do {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c();
                c19091x9511676c.mo9015xbf5d97fd(f17);
                arrayList2.add(c19091x9511676c);
            } while (f17.moveToNext());
            arrayList = arrayList2;
        }
        f17.close();
        return arrayList;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        if (!super.mo880xb970c2b9(c19091x9511676c)) {
            return false;
        }
        java.util.Iterator it = this.f324768e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        throw null;
    }
}
