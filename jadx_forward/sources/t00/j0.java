package t00;

/* loaded from: classes9.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f495823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f495824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f495825f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495826g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t00.k0 f495827h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(int i17, boolean z17, int i18, c00.n3 n3Var, t00.k0 k0Var) {
        super(1);
        this.f495823d = i17;
        this.f495824e = z17;
        this.f495825f = i18;
        this.f495826g = n3Var;
        this.f495827h = k0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        c00.n3 n3Var = this.f495826g;
        if (intValue == 0) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10528xc51e3780(this.f495823d, this.f495824e, this.f495825f), t00.c0.class, new t00.i0(n3Var));
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("permissionErrType", intValue);
            n3Var.d(jSONObject);
        }
        this.f495827h.f495838a = null;
        return jz5.f0.f384359a;
    }
}
