package io4;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io4.f f375056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(io4.f fVar) {
        super(1);
        this.f375056d = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        um5.x it = (um5.x) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String str = this.f375056d.f375057d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report : ");
        sb6.append(it.f510745a);
        sb6.append(", ");
        sb6.append(it.f510746b);
        sb6.append(", ");
        sb6.append(it.f510748d);
        sb6.append(", ");
        int i17 = it.f510751g;
        sb6.append(i17 <= 0 ? 0L : it.f510750f / i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6401x2357b270 c6401x2357b270 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6401x2357b270();
        c6401x2357b270.f137488d = it.f510746b;
        c6401x2357b270.f137489e = it.f510745a;
        c6401x2357b270.f137490f = it.f510748d;
        int i18 = it.f510751g;
        c6401x2357b270.f137491g = i18 > 0 ? it.f510750f / i18 : 0L;
        c6401x2357b270.f137492h = it.f510752h ? 1 : 0;
        c6401x2357b270.f137493i = it.f510753i ? 1 : 0;
        c6401x2357b270.f137494j = it.f510754j ? 1 : 0;
        c6401x2357b270.k();
        return jz5.f0.f384359a;
    }
}
