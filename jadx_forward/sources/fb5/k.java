package fb5;

/* loaded from: classes9.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f342425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fb5.m f342426e;

    public k(fb5.m mVar, java.util.List list) {
        this.f342426e = mVar;
        this.f342425d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f342426e.a(this.f342425d);
    }
}
