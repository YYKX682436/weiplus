package fn4;

/* loaded from: classes15.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm4.j f346125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn4.p f346126e;

    public o(fn4.p pVar, sm4.j jVar) {
        this.f346126e = pVar;
        this.f346125d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.e t07 = this.f346126e.f346128d.t0();
        sm4.j jVar = this.f346125d;
        fn4.m E = t07.E(jVar.f491488g);
        if (E != null) {
            if (E instanceof hn4.d0) {
                E.p();
            } else if (E instanceof gn4.d0) {
                ((gn4.c0) E.i().mo129842x143e7d6c()).B(jVar.f491488g);
            }
        }
    }
}
