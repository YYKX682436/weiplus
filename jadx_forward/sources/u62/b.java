package u62;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v25.b f506476d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba c13499x920707ba, v25.b bVar) {
        this.f506476d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (gm0.j1.a()) {
                c01.d9.e().g(new c01.ra(new u62.a(this), null));
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtContentProviderBase", "exception in NetSceneLocalProxy");
            this.f506476d.a();
        }
    }
}
