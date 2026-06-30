package i5;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc f369962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f369963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i5.d f369964f;

    public b(i5.d dVar, p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc abstractC1265x5c5aefcc, java.lang.String str) {
        this.f369964f = dVar;
        this.f369962d = abstractC1265x5c5aefcc;
        this.f369963e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        j5.w i17 = ((j5.g0) this.f369962d.n()).i(this.f369963e);
        if (i17 == null || !i17.b()) {
            return;
        }
        synchronized (this.f369964f.f369968f) {
            ((java.util.HashMap) this.f369964f.f369971i).put(this.f369963e, i17);
            ((java.util.HashSet) this.f369964f.f369972m).add(i17);
            i5.d dVar = this.f369964f;
            dVar.f369973n.b(dVar.f369972m);
        }
    }
}
