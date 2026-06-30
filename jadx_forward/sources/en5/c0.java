package en5;

/* loaded from: classes14.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq.d f336902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(aq.d dVar) {
        super(3);
        this.f336902d = dVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        e0.g stickyHeader = (e0.g) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stickyHeader, "$this$stickyHeader");
        if ((intValue & 81) == 16) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj4 = n0.e1.f415025a;
        java.lang.String str = this.f336902d.f94382a;
        long z17 = ((p2.f) ((n0.y0) oVar).i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e)).z(i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz)));
        int i17 = aq.o.f94453a ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832 : com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        long b17 = rz0.a.b(i17, context);
        int i18 = z0.t.f550455q1;
        float f17 = 8;
        float f18 = ((float) 0.75d) * f17;
        tz0.x.b(str, d0.a2.j(z0.p.f550454d, ((float) 1.5d) * f17, f18, 0.0f, f18, 4, null), b17, z17, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, oVar, 48, 0, 65520);
        return jz5.f0.f384359a;
    }
}
