package j20;

/* loaded from: classes9.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j20.o f378755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j20.g f378756e;

    public f(j20.o oVar, j20.g gVar) {
        this.f378755d = oVar;
        this.f378756e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.l Di = this.f378755d.Di();
        this.f378756e.a(101, ((java.lang.Number) Di.f384366d).floatValue(), ((java.lang.Number) Di.f384367e).floatValue());
    }
}
