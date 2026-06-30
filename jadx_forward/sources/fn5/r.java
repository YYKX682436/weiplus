package fn5;

/* loaded from: classes14.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f346288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f346290f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f346291g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f346292h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(yz5.a aVar, java.lang.String str, int i17, java.util.ArrayList arrayList, yz5.l lVar) {
        super(2);
        this.f346288d = aVar;
        this.f346289e = str;
        this.f346290f = i17;
        this.f346291g = arrayList;
        this.f346292h = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj3 = n0.e1.f415025a;
        int i17 = z0.t.f550455q1;
        z0.p pVar = z0.p.f550454d;
        int i18 = aq.o.f94453a ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a : com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        l0.a2.a(a0.b.c(pVar, rz0.a.b(i18, context), null, 2, null), null, 0L, 0L, null, 0.0f, u0.j.b(oVar, -207716989, true, new fn5.q(this.f346288d, this.f346289e, this.f346290f, this.f346291g, this.f346292h)), oVar, 1572864, 62);
        return jz5.f0.f384359a;
    }
}
