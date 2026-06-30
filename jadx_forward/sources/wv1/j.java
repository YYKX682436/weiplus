package wv1;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wv1.r f531477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wv1.k f531478e;

    public j(wv1.k kVar, wv1.r rVar) {
        this.f531478e = kVar;
        this.f531477d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f531478e.q(this.f531477d);
    }
}
