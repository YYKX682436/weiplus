package sm2;

/* loaded from: classes3.dex */
public final class u implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f491256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f491257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.l01 f491258g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f491259h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491260i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f491261m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491262n;

    public u(sm2.o4 o4Var, boolean z17, int i17, r45.l01 l01Var, boolean z18, java.lang.String str, int i18, java.lang.String str2) {
        this.f491255d = o4Var;
        this.f491256e = z17;
        this.f491257f = i17;
        this.f491258g = l01Var;
        this.f491259h = z18;
        this.f491260i = str;
        this.f491261m = i18;
        this.f491262n = str2;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f491255d.f491143f, "isReadyPluginCountDownOk collect: " + booleanValue);
        if (booleanValue) {
            pm0.v.X(new sm2.t(this.f491255d, this.f491256e, this.f491257f, this.f491258g, this.f491259h, this.f491260i, this.f491261m, this.f491262n));
        }
        return jz5.f0.f384359a;
    }
}
