package az0;

/* loaded from: classes5.dex */
public final class i6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f97114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97115e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(az0.n7 n7Var, java.lang.String str) {
        super(2);
        this.f97114d = n7Var;
        this.f97115e = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress onProgress = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnTaskProgress) obj;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete onComplete = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onProgress, "onProgress");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasMovieSessionManager", "recreateWithBlankTemplate");
        az0.n7 n7Var = this.f97114d;
        return n7Var.f97275a.m33422xb9813319(this.f97115e, n7Var.f97277c, onProgress, onComplete);
    }
}
