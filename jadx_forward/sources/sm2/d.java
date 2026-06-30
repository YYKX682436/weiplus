package sm2;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.f f490953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(sm2.f fVar) {
        super(5);
        this.f490953d = fVar;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        java.lang.String errMsg = (java.lang.String) obj4;
        km2.b bVar = (km2.b) obj5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        sm2.f fVar = this.f490953d;
        pm0.v.X(new sm2.c(booleanValue, bVar, fVar, intValue));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f490981f, "finish live result:" + booleanValue + ',' + bVar);
        return jz5.f0.f384359a;
    }
}
