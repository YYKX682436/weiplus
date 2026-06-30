package ld1;

/* loaded from: classes7.dex */
public class f implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f399593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f399594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ld1.h f399595c;

    public f(ld1.h hVar, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, int i17) {
        this.f399595c = hVar;
        this.f399593a = yVar;
        this.f399594b = i17;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.JsApiReportPageData", "reportwxaappexpose cgi failed, message = %s", obj);
        this.f399593a.a(this.f399594b, this.f399595c.o("fail:cgi fail"));
    }
}
