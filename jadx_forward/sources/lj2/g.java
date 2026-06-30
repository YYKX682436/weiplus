package lj2;

/* loaded from: classes10.dex */
public final class g implements ep0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lj2.j f400391a;

    public g(lj2.j jVar) {
        this.f400391a = jVar;
    }

    @Override // ep0.c
    public void a(ip0.a aVar, cp0.n nVar, hp0.e eVar) {
        java.lang.String m145853xb5886c64 = this.f400391a.m145853xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onImageLoadFinish url: ");
        sb6.append(aVar);
        sb6.append(" from ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f364442a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64, sb6.toString());
    }

    @Override // ep0.c
    public void b(ip0.a aVar, cp0.n nVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400391a.m145853xb5886c64(), "onImageLoadStart url: " + aVar);
    }
}
