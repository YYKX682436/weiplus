package t23;

/* loaded from: classes10.dex */
public class h extends t23.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f496691d;

    /* renamed from: e, reason: collision with root package name */
    public final int f496692e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f496693f;

    /* renamed from: g, reason: collision with root package name */
    public final long f496694g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f496695h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f496696i;

    /* renamed from: m, reason: collision with root package name */
    public final long f496697m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t23.j f496698n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t23.j jVar, java.lang.String str, int i17, java.lang.String str2, long j17, int i18, long j18) {
        super(jVar);
        this.f496698n = jVar;
        this.f496691d = str;
        this.f496692e = i17;
        this.f496693f = str2;
        this.f496694g = j17;
        this.f496697m = j18;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        if (this.f496695h) {
            return false;
        }
        android.graphics.Bitmap b17 = this.f496698n.f496719a.b(this.f496691d, this.f496693f, this.f496694g, null, this.f496697m);
        this.f496696i = b17;
        if (b17 != null && !b17.isRecycled()) {
            return true;
        }
        if (this.f496695h) {
            return false;
        }
        android.graphics.Bitmap f17 = t23.t1.f(this.f496694g, this.f496692e, this.f496691d, this.f496693f, 12288);
        this.f496696i = f17;
        if (f17 == null || f17.isRecycled()) {
            return false;
        }
        this.f496698n.f496719a.c(this.f496691d, this.f496693f, this.f496694g, this.f496696i, null, this.f496697m);
        return true;
    }
}
