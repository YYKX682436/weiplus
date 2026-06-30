package nn0;

/* loaded from: classes14.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f420120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nn0.m f420121e;

    public j(nn0.m mVar, int i17) {
        this.f420121e = mVar;
        this.f420120d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f420121e.c(this.f420120d);
    }
}
