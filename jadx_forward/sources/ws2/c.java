package ws2;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.h f530548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ws2.k1 f530549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ws2.h hVar, ws2.k1 k1Var) {
        super(0);
        this.f530548d = hVar;
        this.f530549e = k1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ws2.h hVar = this.f530548d;
        java.lang.String str = hVar.f530577b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("generator process config:");
        zs2.f fVar = hVar.f530576a;
        sb6.append(fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        gk2.e eVar = this.f530549e.f530604c;
        int i17 = fVar.f556789a;
        ws2.u0 u0Var = ws2.k1.f530599r;
        return new ws2.b(eVar, i17, ((java.lang.Boolean) ((jz5.n) ws2.k1.f530601t).mo141623x754a37bb()).booleanValue(), (ws2.d) ((jz5.n) hVar.f530580e).mo141623x754a37bb(), (ws2.f) ((jz5.n) hVar.f530579d).mo141623x754a37bb());
    }
}
