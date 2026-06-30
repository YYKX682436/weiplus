package h53;

/* loaded from: classes8.dex */
public class d implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h53.j f360575d;

    public d(h53.j jVar) {
        this.f360575d = jVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        h53.j jVar = this.f360575d;
        if (jVar.f360591h == h53.i.stopped) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameJsCore", "destroy");
            jVar.f360591h = h53.i.destroyed;
            jVar.f360589f.a(new h53.f(jVar, "onDestroy"));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new h53.e(jVar), false);
            jVar.f360592i = b4Var;
            b4Var.c(60000L, 60000L);
        }
        return false;
    }
}
