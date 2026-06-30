package df2;

/* loaded from: classes3.dex */
public final class nd extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.od f312383b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(df2.od odVar, java.lang.Class cls) {
        super(cls);
        this.f312383b = odVar;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.lang.Object obj;
        r45.pb2 result = (r45.pb2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        df2.od odVar = this.f312383b;
        java.lang.String str = odVar.f312486m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recevie  result = ");
        sb6.append(pm0.b0.g(result));
        sb6.append(", lastResult = ");
        r45.ug1 ug1Var = odVar.f312489p;
        if (ug1Var == null || (obj = pm0.b0.g(ug1Var)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        df2.od odVar2 = this.f312383b;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(odVar2, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new df2.md(odVar2, result, null), 2, null);
    }
}
