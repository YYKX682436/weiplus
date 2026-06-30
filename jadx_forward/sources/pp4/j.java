package pp4;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2336x683188c.C18819x10328e97 f439075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f439076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f439077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f439078g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f439079h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f439080i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2336x683188c.C18819x10328e97 c18819x10328e97, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, boolean z17) {
        super(2);
        this.f439075d = c18819x10328e97;
        this.f439076e = c16997xb0aa383a;
        this.f439077f = rect;
        this.f439078g = rect2;
        this.f439079h = rect3;
        this.f439080i = z17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2336x683188c.C18819x10328e97 c18819x10328e97 = this.f439075d;
        if (booleanValue) {
            if (!(str == null || str.length() == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18819x10328e97.C(), "download music success, " + str);
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                h0Var.f391656d = str;
                p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new pp4.i(this.f439076e, h0Var, this.f439075d, str, this.f439077f, this.f439078g, this.f439079h, this.f439080i, null), 2, null);
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c18819x10328e97.C(), "download music failed");
        lp4.d1 d1Var = (lp4.d1) c18819x10328e97.j(lp4.d1.class);
        if (d1Var != null) {
            d1Var.z();
        }
        return jz5.f0.f384359a;
    }
}
