package w24;

/* loaded from: classes8.dex */
public final class k extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f524156d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f524157e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f524158f;

    /* renamed from: g, reason: collision with root package name */
    public xm3.t0 f524159g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f524156d = jz5.h.b(new w24.j(this));
        this.f524157e = new java.util.ArrayList();
    }

    public final w24.l T6(java.lang.String key) {
        java.lang.Iterable iterable;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = this.f524158f;
        if (c16718x7059cefe == null || (iterable = c16718x7059cefe.f233598o) == null) {
            iterable = this.f524157e;
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            w24.l p17 = ((w24.d) it.next()).p(key);
            if (p17 != null) {
                return p17;
            }
        }
        return null;
    }

    public final void U6(java.lang.String key, boolean z17) {
        java.lang.Iterable<w24.d> iterable;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = this.f524158f;
        if (c16718x7059cefe == null || (iterable = c16718x7059cefe.f233598o) == null) {
            iterable = this.f524157e;
        }
        for (w24.d dVar : iterable) {
            w24.l p17 = dVar.p(key);
            if (p17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, dVar + ' ' + key + " hideItem");
                p17.f524163d = z17;
                V6(dVar);
            }
        }
    }

    public final void V6(w24.d group) {
        java.lang.Iterable iterable;
        xm3.t0 t0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(group, "group");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = this.f524158f;
        if (c16718x7059cefe == null || (iterable = c16718x7059cefe.f233598o) == null) {
            iterable = this.f524157e;
        }
        int i17 = 0;
        for (java.lang.Object obj : iterable) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((w24.d) obj).f524146d, group.f524146d) && (t0Var = this.f524159g) != null) {
                t0Var.m8147xed6e4d18(i17);
            }
            i17 = i18;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = new com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe(new w24.g(this.f524157e), new xm3.n0(), m158354x19263085(), null, this.f524157e, 8, null);
        this.f524158f = c16718x7059cefe;
        java.util.ArrayList arrayList = c16718x7059cefe.f233598o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
        this.f524157e = kz5.n0.V0(arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe2 = this.f524158f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16718x7059cefe2);
        this.f524159g = new xm3.t0(c16718x7059cefe2, new com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16719xcd1e3852(w24.e.class), false);
        jz5.g gVar = this.f524156d;
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb()).mo7960x6cab2c8d(this.f524159g);
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb()).mo7967x900dcbe1(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(m80379x76847179()));
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb()).m7957x4145728().e(0, 0);
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb()).m7964x8d4ad49c(null);
        java.util.Iterator it = ((java.util.ArrayList) this.f524157e).iterator();
        while (it.hasNext()) {
            ((w24.d) it.next()).o(new w24.i(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe3 = this.f524158f;
        if (c16718x7059cefe3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.r(c16718x7059cefe3, null, 1, null);
        }
    }
}
