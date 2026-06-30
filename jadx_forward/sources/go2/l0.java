package go2;

/* loaded from: classes5.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f355534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f355535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f355537g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f355538h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f355539i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355540m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f355541n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(go2.a1 a1Var, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, int i17, android.view.View view, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f355535e = a1Var;
        this.f355536f = str;
        this.f355537g = num;
        this.f355538h = num2;
        this.f355539i = i17;
        this.f355540m = view;
        this.f355541n = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new go2.l0(this.f355535e, this.f355536f, this.f355537g, this.f355538h, this.f355539i, this.f355540m, this.f355541n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((go2.l0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f355534d;
        java.lang.String str = this.f355536f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberPayUIC", "doPay disableSubscribe");
            go2.a1 a1Var = this.f355535e;
            a1Var.f355481e = false;
            a1Var.f355482f = str;
            android.app.Activity m80379x76847179 = a1Var.m80379x76847179();
            java.lang.String str2 = this.f355536f;
            int intValue = this.f355537g.intValue();
            java.lang.Integer num = this.f355538h;
            int i18 = this.f355539i;
            this.f355534d = 1;
            obj = a1Var.Q6(m80379x76847179, str2, intValue, num, false, i18, this);
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
        android.view.View view = this.f355540m;
        if (view != null) {
            view.setClickable(true);
        }
        go2.a1 a1Var2 = this.f355535e;
        go2.a1.O6(a1Var2, a1Var2.m80379x76847179());
        if (d0Var.f355493a) {
            yz5.l lVar = this.f355541n;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
            a1Var2.P6(a1Var2.m80379x76847179(), str, false, false);
        }
        return jz5.f0.f384359a;
    }
}
