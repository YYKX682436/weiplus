package h82;

/* loaded from: classes8.dex */
public class g implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361065b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361066c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h82.h f361067d;

    public g(h82.h hVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f361067d = hVar;
        this.f361064a = str;
        this.f361065b = str2;
        this.f361066c = str3;
    }

    @Override // p11.d
    public void a(boolean z17, java.lang.Object... objArr) {
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        h82.h hVar = this.f361067d;
        java.util.concurrent.CountDownLatch countDownLatch = hVar.f361070f;
        objArr2[0] = countDownLatch == null ? "null" : java.lang.Long.valueOf(countDownLatch.getCount());
        java.lang.String str = this.f361064a;
        objArr2[1] = str;
        objArr2[2] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.offline.FavOfflineService", "replaceImagUrl num:%s url:%s, success:%b", objArr2);
        if (z17) {
            hVar.f361069e.put(str, "./" + this.f361065b + "/" + this.f361066c);
        }
        java.util.concurrent.CountDownLatch countDownLatch2 = hVar.f361070f;
        if (countDownLatch2 != null) {
            countDownLatch2.countDown();
        }
    }
}
