package nn0;

/* loaded from: classes14.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f420122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nn0.m f420123e;

    public k(nn0.m mVar, int i17) {
        this.f420123e = mVar;
        this.f420122d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f420123e.e(this.f420122d);
    }
}
