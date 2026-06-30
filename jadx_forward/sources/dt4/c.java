package dt4;

/* loaded from: classes9.dex */
public class c extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f324763f = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19092x6dc28480.f261121v3, "WalletBankcardScene")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f324764d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f324765e;

    public c(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19092x6dc28480.f261121v3, "WalletBankcardScene", dm.zb.E1);
        this.f324765e = new java.util.LinkedList();
        this.f324764d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: delete */
    public boolean mo9951xb06685ab(l75.f0 f0Var, java.lang.String[] strArr) {
        if (!super.mo9951xb06685ab((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19092x6dc28480) f0Var, strArr)) {
            return false;
        }
        java.util.Iterator it = this.f324765e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        throw null;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: update */
    public boolean mo9952xce0038c9(l75.f0 f0Var, java.lang.String[] strArr) {
        if (!super.mo9952xce0038c9((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19092x6dc28480) f0Var, strArr)) {
            return false;
        }
        java.util.Iterator it = this.f324765e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        throw null;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19092x6dc28480 c19092x6dc28480) {
        if (!super.mo880xb970c2b9(c19092x6dc28480)) {
            return false;
        }
        java.util.Iterator it = this.f324765e.iterator();
        if (!it.hasNext()) {
            return true;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
        throw null;
    }

    public boolean z0(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            super.mo880xb970c2b9((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19092x6dc28480) it.next());
        }
        java.util.Iterator it6 = this.f324765e.iterator();
        if (!it6.hasNext()) {
            return true;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it6.next());
        throw null;
    }
}
