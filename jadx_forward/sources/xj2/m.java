package xj2;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xj2.n f536382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f536383e;

    public m(xj2.n nVar, float f17) {
        this.f536382d = nVar;
        this.f536383e = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xj2.n nVar = this.f536382d;
        float b17 = i65.a.b(nVar.getContext(), 24);
        float f17 = this.f536383e;
        nVar.v((int) (b17 * f17), 14 * f17);
    }
}
