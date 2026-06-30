package pk2;

/* loaded from: classes3.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f437711d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f437712e;

    /* renamed from: f, reason: collision with root package name */
    public int f437713f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f437714g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.r1 f437715h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437716i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc f437717m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f437718n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437719o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(pk2.r1 r1Var, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc c15371xf336b8cc, boolean z17, pk2.o9 o9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437715h = r1Var;
        this.f437716i = view;
        this.f437717m = c15371xf336b8cc;
        this.f437718n = z17;
        this.f437719o = o9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pk2.q1 q1Var = new pk2.q1(this.f437715h, this.f437716i, this.f437717m, this.f437718n, this.f437719o, interfaceC29045xdcb5ca57);
        q1Var.f437714g = ((java.lang.Boolean) obj).booleanValue();
        return q1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.q1) mo148xaf65a0fc(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f437713f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean z17 = this.f437714g;
            android.view.View view = this.f437716i;
            java.lang.String obj2 = ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567086i31)).getText().toString();
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.hx7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc c15371xf336b8cc = this.f437717m;
            pk2.r1 r1Var = this.f437715h;
            r1Var.v(obj2, findViewById, c15371xf336b8cc);
            qk2.f.f(r1Var, false, 1, null);
            pk2.o9 o9Var = this.f437719o;
            this.f437711d = o9Var;
            this.f437712e = r1Var;
            this.f437714g = z17;
            this.f437713f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            if (this.f437718n) {
                db5.t7.b(o9Var.f437611d, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lum));
                nVar.a(java.lang.Boolean.FALSE);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "enable/disable link mic. curEnableLinkMic:" + ((mm2.o4) o9Var.c(mm2.o4.class)).k7());
                o9Var.i(64, z17, r1Var.n(), new pk2.p1(z17, o9Var, r1Var, nVar));
            }
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
