package ix3;

/* loaded from: classes.dex */
public final class o3 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f377049d;

    /* renamed from: e, reason: collision with root package name */
    public rl5.r f377050e;

    /* renamed from: f, reason: collision with root package name */
    public int f377051f;

    /* renamed from: g, reason: collision with root package name */
    public int f377052g;

    /* renamed from: h, reason: collision with root package name */
    public ex3.e f377053h;

    /* renamed from: i, reason: collision with root package name */
    public final ix3.m3 f377054i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f377054i = new ix3.m3(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 == 1 || i17 == 2) {
            ex3.e eVar = this.f377053h;
            if (eVar == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = this.f377049d;
                if (c16718x7059cefe != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.r(c16718x7059cefe, null, 1, null);
                    return;
                }
                return;
            }
            ex3.e eVar2 = (ex3.e) eVar.y0();
            java.lang.String a17 = xw3.b.f539260g.a(eVar.f338742f, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<set-?>");
            eVar2.f338743g = a17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe2 = this.f377049d;
            if (c16718x7059cefe2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.A(c16718x7059cefe2, eVar2, false, 2, null);
            }
            this.f377053h = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new ix3.n3(this));
    }
}
