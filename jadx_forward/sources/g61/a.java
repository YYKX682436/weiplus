package g61;

/* loaded from: classes4.dex */
public class a implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h61.s f350572a;

    public a(g61.c cVar, h61.s sVar) {
        this.f350572a = sVar;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, obj.toString(), 0).show();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CloseAAEventIListener", "close aa failed: %s", obj);
            dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.b9b, 1).show();
        }
        h61.p pVar = this.f350572a.f360700a;
        pVar.getClass();
        gm0.j1.i();
        gm0.j1.n().f354821b.q(1530, pVar);
    }
}
