package az0;

/* loaded from: classes5.dex */
public final class kc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f97181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 f97183g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(java.lang.String str, long j17, yz5.l lVar, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 c4067xeeae5bd2) {
        super(1);
        this.f97180d = str;
        this.f97181e = j17;
        this.f97182f = lVar;
        this.f97183g = c4067xeeae5bd2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bz0.b bVar = bz0.b.f118257a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f97181e;
        int i17 = bz0.a.f118256b;
        java.lang.String funName = this.f97180d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funName, "funName");
        bVar.e(100, funName, "cancel", currentTimeMillis, i17);
        yz5.l lVar = this.f97182f;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f97183g);
        }
        return jz5.f0.f384359a;
    }
}
