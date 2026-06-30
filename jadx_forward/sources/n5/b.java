package n5;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wa.a f416626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p125x37c711.p126x316220.p133x5ae81cb5.C1279x99253872 f416627e;

    public b(p012xc85e97e9.p125x37c711.p126x316220.p133x5ae81cb5.C1279x99253872 c1279x99253872, wa.a aVar) {
        this.f416627e = c1279x99253872;
        this.f416626d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f416627e.f94031m) {
            if (this.f416627e.f94032n) {
                p012xc85e97e9.p125x37c711.p126x316220.p133x5ae81cb5.C1279x99253872 c1279x99253872 = this.f416627e;
                c1279x99253872.f94033o.i(new a5.w());
            } else {
                this.f416627e.f94033o.k(this.f416626d);
            }
        }
    }
}
