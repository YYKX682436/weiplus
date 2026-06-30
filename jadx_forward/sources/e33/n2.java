package e33;

/* loaded from: classes10.dex */
public class n2 implements q23.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f328913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y51.c f328914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 f328915c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.v2 f328916d;

    public n2(e33.v2 v2Var, int i17, y51.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0) {
        this.f328916d = v2Var;
        this.f328913a = i17;
        this.f328914b = cVar;
        this.f328915c = c15632xfc4fd0d0;
    }

    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "isSelectLive: %b position: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f328913a));
        y51.c cVar = this.f328914b;
        if (!z17) {
            o23.n nVar = o23.m.f423959a;
            nVar.D.a(4);
            nVar.D.a(1);
            ((y51.b) cVar).b();
            return;
        }
        o23.n nVar2 = o23.m.f423959a;
        nVar2.D.a(3);
        nVar2.D.a(2);
        ((y51.b) cVar).c();
        this.f328916d.p(this.f328915c, 2);
    }
}
