package yf0;

/* loaded from: classes12.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf0.f f543044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f543045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p25.e f543046f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yf0.f fVar, boolean z17, p25.e eVar) {
        super(1);
        this.f543044d = fVar;
        this.f543045e = z17;
        this.f543046f = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f543044d.d());
        sb6.append(' ');
        sb6.append(this.f543045e ? ya.b.f77495x8b74a326 : "");
        sb6.append(" invokeOnCancellation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.VideoCGISendApi", sb6.toString());
        ((z25.d) this.f543046f).f();
        return jz5.f0.f384359a;
    }
}
