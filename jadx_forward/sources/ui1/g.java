package ui1;

/* loaded from: classes7.dex */
public class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f509581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509582b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509583c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f509585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ui1.s f509586f;

    public g(ui1.t tVar, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, ui1.s sVar) {
        this.f509581a = i17;
        this.f509582b = str;
        this.f509583c = str2;
        this.f509584d = str3;
        this.f509585e = z17;
        this.f509586f = sVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        if (((r45.f24) obj).f455474d.f459024d == 0 && 1 == this.f509581a) {
            java.lang.String str = this.f509582b;
            java.lang.String str2 = this.f509583c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "setAuth, add allow cache appId = %s, api = %s  scope=%s", str, str2, this.f509584d);
            if (this.f509585e) {
                ui1.t.f509615d.e(str, str2);
            }
        }
        this.f509586f.a();
        return null;
    }
}
