package gg1;

/* loaded from: classes7.dex */
public final class f0 extends gg1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f353091b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(gg1.c1 c1Var, yz5.l lVar) {
        super(c1Var);
        this.f353090a = c1Var;
        this.f353091b = lVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pause fail");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f84020c) : "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoCast.VideoCastController", sb6.toString());
        this.f353091b.mo146xb9724478(java.lang.Boolean.FALSE);
    }

    @Override // z91.a
    public void b(aa1.e response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastController", "pause success");
        this.f353090a.f353072e.b().f534184e.f534196a = x91.j.Paused;
        this.f353091b.mo146xb9724478(java.lang.Boolean.TRUE);
    }
}
