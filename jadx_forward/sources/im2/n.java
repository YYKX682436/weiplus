package im2;

/* loaded from: classes3.dex */
public final class n extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public long f373982d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f373983e;

    /* renamed from: f, reason: collision with root package name */
    public r45.li4 f373984f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        r45.ta4 ta4Var;
        r45.ta4 ta4Var2;
        r45.ta4 ta4Var3;
        r45.nw1 nw1Var;
        gk2.e eVar = gk2.e.f354004n;
        boolean z17 = false;
        long j17 = 0;
        long m75942xfb822ef2 = (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
        dk2.x4 a17 = dk2.x4.C.a(m158359x1e885992());
        r45.li4 li4Var = null;
        if (a17 == null && m75942xfb822ef2 != 0) {
            dk2.ef efVar = dk2.ef.f314905a;
            km2.n nVar = dk2.ef.H;
            a17 = nVar != null ? nVar.f390688g : null;
        }
        if (a17 != null && (ta4Var3 = a17.B) != null) {
            j17 = ta4Var3.m75942xfb822ef2(17);
        }
        this.f373982d = j17;
        if (a17 != null && (ta4Var2 = a17.B) != null) {
            z17 = ta4Var2.m75933x41a8a7f2(19);
        }
        this.f373983e = z17;
        if (a17 != null && (ta4Var = a17.B) != null) {
            li4Var = (r45.li4) ta4Var.m75936x14adae67(18);
        }
        this.f373984f = li4Var;
    }
}
