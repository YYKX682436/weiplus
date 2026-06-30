package nu4;

/* loaded from: classes7.dex */
public final class n implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f421793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r f421795c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f421797e;

    public n(nu4.b0 b0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar, java.lang.String str2, yz5.l lVar) {
        this.f421793a = b0Var;
        this.f421794b = str;
        this.f421795c = rVar;
        this.f421796d = str2;
        this.f421797e = lVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.util.HashMap hashMap = this.f421793a.H;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar = this.f421795c;
        hashMap.put(this.f421794b, java.lang.Integer.valueOf(rVar.o()));
        java.lang.String domain = this.f421796d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(domain, "$domain");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.a(domain);
        this.f421797e.mo146xb9724478(rVar);
    }
}
