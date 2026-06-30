package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public final class j1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6 f173525g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6 delegate) {
        super(delegate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f173525g = delegate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6
    public java.util.List Ca(int i17, int i18) {
        return this.f173525g.Ca(i17, i18);
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var) {
        if (q0Var != null) {
            b(q0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d
    public void c(l75.q0 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6) this.f173493d).add(listener);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d
    public void f(java.lang.String str, l75.w0 eventData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventData, "eventData");
        fs.g.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e6.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.i1(str, eventData));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6
    /* renamed from: getCount */
    public int mo49730x7444f759() {
        return this.f173525g.mo49730x7444f759();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.d
    public java.lang.Object k(java.lang.Object[] args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        java.util.Iterator a17 = p3321xbce91901.jvm.p3324x21ffc6bd.c.a(args);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6 b6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6) this.f173493d;
        java.lang.Object next = ((p3321xbce91901.jvm.p3324x21ffc6bd.b) a17).next();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(next, "null cannot be cast to non-null type kotlin.Int");
        java.util.List t07 = b6Var.t0(((java.lang.Integer) next).intValue());
        if (t07 == null) {
            t07 = kz5.p0.f395529d;
        }
        int i17 = 0;
        for (java.lang.Object obj : t07) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) obj;
            if (i17 < 8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUsageStorageWithCache.AppBrandUsageStorageWithCache", "ccf-log [queryByDelegate] name=%s iconUrl=%s", c11714x918fd2e4.f157898h, c11714x918fd2e4.f157901n);
            }
            i17 = i18;
        }
        return t07;
    }

    @Override // l75.l0
    /* renamed from: remove */
    public void mo49775xc84af884(l75.q0 q0Var) {
        if (q0Var != null) {
            l(q0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6
    public java.util.List t0(int i17) {
        return (java.util.List) i(java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6
    public boolean x0(java.lang.String str, int i17) {
        return this.f173525g.x0(str, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b6
    public java.util.List ze(long j17, int i17) {
        return this.f173525g.ze(j17, i17);
    }
}
