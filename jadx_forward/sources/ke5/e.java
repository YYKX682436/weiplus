package ke5;

/* loaded from: classes9.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f388610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f388611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f388612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f388613g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 f388614h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 f388615i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f388616m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ke5.a f388617n;

    public e(ke5.a aVar, int i17, boolean z17, int i18, boolean z18, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, android.os.Bundle bundle) {
        this.f388617n = aVar;
        this.f388610d = i17;
        this.f388611e = z17;
        this.f388612f = i18;
        this.f388613g = z18;
        this.f388614h = c21897x17252689;
        this.f388615i = c16564xb55e1d5;
        this.f388616m = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        ke5.a aVar = this.f388617n;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 C0 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b) aVar.f388574b.f542251m).C0();
        int i17 = this.f388610d;
        int x17 = C0.x(0, i17);
        aVar.g(i17, this.f388611e, this.f388612f, this.f388613g);
        this.f388614h.o(x17, this.f388615i, this.f388616m);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_POSITION_AT_CHATRECORD_FIRST_IN_BOOLEAN, java.lang.Boolean.FALSE);
    }
}
