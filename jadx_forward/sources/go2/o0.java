package go2;

/* loaded from: classes5.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f355567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f355568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f355569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355570g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f355571h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f355572i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f355573m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f355574n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355575o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355576p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f355577q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(boolean z17, go2.a1 a1Var, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, int i17, android.widget.Button button, android.view.View view, android.view.View view2, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f355568e = z17;
        this.f355569f = a1Var;
        this.f355570g = str;
        this.f355571h = num;
        this.f355572i = num2;
        this.f355573m = i17;
        this.f355574n = button;
        this.f355575o = view;
        this.f355576p = view2;
        this.f355577q = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new go2.o0(this.f355568e, this.f355569f, this.f355570g, this.f355571h, this.f355572i, this.f355573m, this.f355574n, this.f355575o, this.f355576p, this.f355577q, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((go2.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f355567d;
        java.lang.String str = this.f355570g;
        boolean z17 = this.f355568e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberPayUIC", "doPay subscribe: " + z17);
            go2.a1 a1Var = this.f355569f;
            a1Var.f355481e = false;
            a1Var.f355482f = str;
            android.app.Activity m80379x76847179 = a1Var.m80379x76847179();
            java.lang.String str2 = this.f355570g;
            int intValue = this.f355571h.intValue();
            java.lang.Integer num = this.f355572i;
            boolean z18 = this.f355568e;
            int i18 = this.f355573m;
            this.f355567d = 1;
            obj = a1Var.Q6(m80379x76847179, str2, intValue, num, z18, i18, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        go2.d0 d0Var = (go2.d0) obj;
        go2.a1 a1Var2 = this.f355569f;
        a1Var2.f355483g = false;
        this.f355574n.setClickable(true);
        this.f355575o.setClickable(true);
        this.f355576p.setClickable(true);
        if (z17) {
            a1Var2.f355481e = d0Var.f355493a;
        } else {
            go2.a1.O6(a1Var2, a1Var2.m80379x76847179());
            if (d0Var.f355493a) {
                a1Var2.P6(a1Var2.m80379x76847179(), str, false, false);
            }
        }
        yz5.l lVar = this.f355577q;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(d0Var.f355493a));
        }
        return jz5.f0.f384359a;
    }
}
