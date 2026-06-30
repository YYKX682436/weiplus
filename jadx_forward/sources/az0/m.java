package az0;

/* loaded from: classes5.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f97213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97214e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(az0.a0 a0Var, java.lang.String str) {
        super(2);
        this.f97213d = a0Var;
        this.f97214e = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnTaskProgress onProgress = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnTaskProgress) obj;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete onComplete = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onProgress, "onProgress");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        az0.a0 a0Var = this.f97213d;
        java.lang.String str = a0Var.f96844c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startWithClipBundleId ");
        java.lang.String str2 = this.f97214e;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        return a0Var.f96842a.m33241x635bfa42(str2, onProgress, new az0.l(a0Var, onComplete));
    }
}
