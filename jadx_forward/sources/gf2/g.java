package gf2;

/* loaded from: classes.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f352813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 f352815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f352816g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49, yz5.p pVar) {
        super(1);
        this.f352813d = k0Var;
        this.f352814e = str;
        this.f352815f = c14195x2dafdb49;
        this.f352816g = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        java.lang.String str = (java.lang.String) obj;
        this.f352813d.u();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49.f193104t;
        java.lang.String str2 = this.f352814e;
        if (str2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            bitmap = null;
        } else {
            android.graphics.Bitmap j07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.j0(str2, 140, 140, i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
            int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str2).m43592x7a249f0b();
            if (m43592x7a249f0b < 0) {
                m43592x7a249f0b = 0;
            }
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(j07, m43592x7a249f0b);
        }
        android.graphics.Bitmap bitmap2 = bitmap;
        o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49 = this.f352815f;
        ((r35.k1) q1Var).Ni(c14195x2dafdb49.getContext(), str, bitmap2, c14195x2dafdb49.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), 3, new gf2.f(str, c14195x2dafdb49, str2, this.f352816g)).show();
        return jz5.f0.f384359a;
    }
}
