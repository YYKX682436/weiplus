package ox1;

/* loaded from: classes12.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f431138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ox1.s f431139e;

    public k(ox1.s sVar, boolean z17) {
        this.f431139e = sVar;
        this.f431138d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f431139e.z(this.f431138d);
    }
}
