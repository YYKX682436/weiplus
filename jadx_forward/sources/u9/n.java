package u9;

/* loaded from: classes15.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f507309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u9.s f507310e;

    public n(u9.s sVar, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417) {
        this.f507310e = sVar;
        this.f507309d = c1601x7dc4e417;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f507310e.f507324b.s(this.f507309d);
    }
}
