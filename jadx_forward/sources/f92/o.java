package f92;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f341797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f92.t f341798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m92.j f341799f;

    public o(java.util.HashSet hashSet, f92.t tVar, m92.j jVar) {
        this.f341797d = hashSet;
        this.f341798e = tVar;
        this.f341799f = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (m92.b bVar : this.f341797d) {
            for (l92.b bVar2 : this.f341798e.h6().f406517g) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
                ((f92.i) bVar2).c(bVar, this.f341799f.name());
            }
        }
    }
}
