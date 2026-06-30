package f0;

/* loaded from: classes14.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.d2 f339631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0.c f339632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0.d f339633f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d0.d2 d2Var, f0.c cVar, d0.d dVar) {
        super(2);
        this.f339631d = d2Var;
        this.f339632e = cVar;
        this.f339633f = dVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        p2.f fVar = (p2.f) obj;
        long j17 = ((p2.c) obj2).f432910a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "$this$null");
        if (!(p2.c.h(j17) != Integer.MAX_VALUE)) {
            throw new java.lang.IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
        }
        p2.s sVar = p2.s.Ltr;
        d0.d2 d2Var = this.f339631d;
        int h17 = p2.c.h(j17) - fVar.G(d0.a2.e(d2Var, sVar) + d0.a2.d(d2Var, sVar));
        int G = fVar.G(this.f339633f.a());
        f0.b bVar = (f0.b) this.f339632e;
        bVar.getClass();
        int i17 = bVar.f339539a;
        int i18 = h17 - (G * (i17 - 1));
        int i19 = i18 / i17;
        int i27 = i18 % i17;
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        int i28 = 0;
        while (i28 < i17) {
            arrayList.add(java.lang.Integer.valueOf((i28 < i27 ? 1 : 0) + i19));
            i28++;
        }
        java.util.List V0 = kz5.n0.V0(arrayList);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) V0;
        int size = arrayList2.size();
        for (int i29 = 1; i29 < size; i29++) {
            arrayList2.set(i29, java.lang.Integer.valueOf(((java.lang.Number) arrayList2.get(i29)).intValue() + ((java.lang.Number) arrayList2.get(i29 - 1)).intValue()));
        }
        return V0;
    }
}
