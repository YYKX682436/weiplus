package hq0;

/* loaded from: classes7.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f364608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f364609e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(hq0.b0 b0Var, boolean z17) {
        super(0);
        this.f364608d = b0Var;
        this.f364609e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hq0.b0 b0Var = this.f364608d;
        if (b0Var.f364528g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f364504y, "startImpl but magicBrush null");
            b0Var.Q1();
        }
        b0Var.I = this.f364609e;
        b0Var.H = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
        c16416x87606a7b.f229367x = b0Var;
        c16416x87606a7b.f229354h = z65.c.a();
        c16416x87606a7b.a(b0Var.T);
        java.util.HashSet hashSet = b0Var.f364503x.f375170d;
        if (hashSet != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.y4.a(c16416x87606a7b, hashSet);
        }
        b0Var.I1(c16416x87606a7b);
        b0Var.mo123044x68ac462();
        return jz5.f0.f384359a;
    }
}
