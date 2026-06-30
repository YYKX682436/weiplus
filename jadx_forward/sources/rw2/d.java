package rw2;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw2.j f482124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f482125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rw2.j jVar, java.lang.Object obj) {
        super(1);
        this.f482124d = jVar;
        this.f482125e = obj;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.Surface it = (android.view.Surface) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f482124d.f482140c, "thumbRenderer setup finished");
        kk4.v vVar = this.f482124d.f482144g;
        if (vVar != null) {
            vVar.J(it, true);
        }
        kk4.v vVar2 = this.f482124d.f482144g;
        if (vVar2 != null) {
            vVar2.O();
        }
        java.lang.Object obj2 = this.f482125e;
        rw2.j jVar = this.f482124d;
        synchronized (obj2) {
            try {
                obj2.notifyAll();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(jVar.f482140c, e17, "notify init thumb fetcher error", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f384359a;
    }
}
