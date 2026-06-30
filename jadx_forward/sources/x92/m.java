package x92;

/* loaded from: classes2.dex */
public abstract class m extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 implements x92.q {

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f f534243v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f f534244w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f534245x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f534245x = true;
    }

    public boolean A7(int i17) {
        return false;
    }

    public com.p314xaae8f345.mm.p2495xc50a8b8b.f B7() {
        return null;
    }

    public void C7(int i17, java.lang.String str) {
        if (A7(i17)) {
            java.util.Set<com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9> x76 = x7();
            if (x76 != null) {
                for (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c9 : x76) {
                    x92.r rVar = abstractC22275x3ce1d8c9 instanceof x92.r ? (x92.r) abstractC22275x3ce1d8c9 : null;
                    if (rVar != null) {
                        rVar.O6(i17, str);
                    }
                }
                return;
            }
            return;
        }
        java.util.Set<com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9> x77 = x7();
        if (x77 != null) {
            for (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c92 : x77) {
                x92.r rVar2 = abstractC22275x3ce1d8c92 instanceof x92.r ? (x92.r) abstractC22275x3ce1d8c92 : null;
                if (rVar2 != null) {
                    rVar2.P6(i17, str);
                }
            }
        }
    }

    public void D7() {
    }

    public void E7(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.util.Set<com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9> x76 = x7();
        if (x76 != null) {
            for (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c9 : x76) {
                x92.r rVar = abstractC22275x3ce1d8c9 instanceof x92.r ? (x92.r) abstractC22275x3ce1d8c9 : null;
                if (rVar != null) {
                    rVar.S6(fVar);
                }
            }
        }
    }

    public void F7(java.lang.String tabName, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabName, "tabName");
    }

    public void G7() {
    }

    public final void H7(boolean z17) {
        int X6 = X6();
        int i17 = 0;
        for (zx2.i iVar : f7()) {
            int i18 = i17 + 1;
            if (iVar instanceof w92.a) {
                if (z17) {
                    w92.a aVar = (w92.a) iVar;
                    boolean z18 = i17 == X6;
                    aVar.f525605k = true;
                    aVar.k(z18);
                } else {
                    w92.a aVar2 = (w92.a) iVar;
                    boolean z19 = i17 == X6;
                    aVar2.f525605k = false;
                    aVar2.k(z19);
                }
            }
            i17 = i18;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57 W6() {
        return new w92.c(w7());
    }

    @Override // x92.q
    public void b2() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f215191g;
        if (c2718xca2902ff != null) {
            c2718xca2902ff.m20368xc75d81ec(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560515ml));
        }
        H7(true);
    }

    public java.lang.String d2() {
        x92.f f183273t;
        java.lang.String a17;
        android.view.LayoutInflater.Factory m158354x19263085 = m158354x19263085();
        t92.a aVar = m158354x19263085 instanceof t92.a ? (t92.a) m158354x19263085 : null;
        return (aVar == null || (f183273t = aVar.getF183273t()) == null || (a17 = f183273t.a()) == null) ? "" : a17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void l7(int i17) {
        if (this.f534245x) {
            this.f534245x = false;
            return;
        }
        if (i17 < 0 || i17 >= f7().size()) {
            return;
        }
        zx2.i iVar = (zx2.i) f7().get(i17);
        if (iVar instanceof w92.a) {
            w92.a aVar = (w92.a) iVar;
            F7(aVar.i(m80379x76847179()).toString(), aVar.f525606l, 1);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f215192h;
        if (c1190x18d3c3fe instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) c1190x18d3c3fe).m62442xecae6946(true);
        }
        z7();
        z5();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        this.f534243v = B7();
        if (y7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabUIC", "[onCreateAfter] hit cache");
            D7();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabUIC", "[onCreateAfter] request");
            G7();
        }
    }

    @Override // x92.q
    /* renamed from: setNormalStyle */
    public void mo55425x60022348() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f215191g;
        if (c2718xca2902ff != null) {
            c2718xca2902ff.m20368xc75d81ec(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        }
        H7(false);
    }

    public abstract int w7();

    public final java.util.Set x7() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m158354x19263085 : null;
        if (abstractActivityC15087xee12defa != null) {
            return abstractActivityC15087xee12defa.mo80395x5316d740();
        }
        return null;
    }

    public boolean y7() {
        return this.f534243v != null;
    }

    public void z7() {
    }
}
