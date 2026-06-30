package po3;

/* loaded from: classes4.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6084xfdf602e4 f438869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po3.o f438870e;

    public m(po3.o oVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6084xfdf602e4 c6084xfdf602e4) {
        this.f438870e = oVar;
        this.f438869d = c6084xfdf602e4;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.d9.b().p().w(589825, java.lang.Boolean.TRUE);
        po3.g gVar = new po3.g();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6084xfdf602e4 c6084xfdf602e4 = this.f438869d;
        gVar.f438861a = c6084xfdf602e4.f136362g.f88809a;
        this.f438870e.q(gVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendSnsFailNotification", "SnsPostFailEventListener receive id:%s", java.lang.String.valueOf(c6084xfdf602e4.f136362g.f88809a));
    }
}
