package zr2;

/* loaded from: classes2.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr2.k f556718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f556719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f556720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f556721g;

    public g(zr2.k kVar, java.util.LinkedList linkedList, int i17, int i18) {
        this.f556718d = kVar;
        this.f556719e = linkedList;
        this.f556720f = i17;
        this.f556721g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zr2.k.a(this.f556718d, this.f556719e, this.f556720f, this.f556721g);
    }
}
