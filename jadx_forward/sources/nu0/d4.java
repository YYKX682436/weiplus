package nu0;

/* loaded from: classes5.dex */
public final class d4 extends du0.p1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // du0.p1
    public void C6() {
        c7().C6();
        nu0.i iVar = (nu0.i) T6(nu0.i.class);
        iVar.V6("edit_bgm", "view_clk", iVar.U6());
    }

    @Override // du0.p1
    public boolean Y6(boolean z17) {
        ev0.c cVar = this.f324947q;
        if (cVar == null) {
            return true;
        }
        ev0.t.c(cVar.f303886c, false, null, 3, null);
        return true;
    }

    @Override // du0.p1
    public yt0.c m7() {
        return (yt0.c) T6(nu0.b4.class);
    }

    @Override // du0.p1, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        super.mo2284x57429eec();
        ev0.c cVar = this.f324947q;
        if (cVar != null) {
            cVar.f303886c.d();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        ev0.c cVar = this.f324947q;
        if (cVar != null) {
            ev0.t.c(cVar.f303886c, false, null, 3, null);
        }
    }

    @Override // du0.p1
    public void p7(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17, boolean z18) {
        ev0.c cVar = this.f324947q;
        if (cVar != null) {
            cVar.f303886c.d();
        }
    }
}
