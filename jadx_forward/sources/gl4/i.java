package gl4;

/* loaded from: classes11.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f354390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl4.z f354391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f354392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qk.y8 f354393g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gl4.z zVar, android.content.Context context, qk.y8 y8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f354391e = zVar;
        this.f354392f = context;
        this.f354393g = y8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gl4.i(this.f354391e, this.f354392f, this.f354393g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gl4.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object b17;
        r45.ie mo11484xe92ab0a8;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f354390d;
        gl4.z zVar = this.f354391e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f354390d = 1;
            b17 = zVar.b(null, 2, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b17 = obj;
        }
        bw5.y80 y80Var = (bw5.y80) b17;
        boolean z17 = (y80Var == null || (mo11484xe92ab0a8 = y80Var.mo11484xe92ab0a8()) == null || mo11484xe92ab0a8.f458492d != 0) ? false : true;
        android.content.Context context = this.f354392f;
        qk.y8 y8Var = this.f354393g;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipHelper", "joinMembershipByBindQQMusicVIP success");
            if ((y80Var.f116936h[3] ? y80Var.f116933e : new bw5.r70()) != null) {
                gl4.z zVar2 = this.f354391e;
                android.content.Context context2 = this.f354392f;
                bw5.r70 r70Var = y80Var.f116936h[3] ? y80Var.f116933e : new bw5.r70();
                android.widget.ImageView imageView = new android.widget.ImageView(context);
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78834xa20f9397);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(dimensionPixelSize, dimensionPixelSize);
                marginLayoutParams.topMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
                marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                imageView.setLayoutParams(marginLayoutParams);
                gl4.z.c(zVar2, context2, r70Var, null, imageView, hl4.a.f363635e, 0, new gl4.f(y8Var), new gl4.g(y8Var), null, new gl4.h(y8Var), 292, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingMembershipHelper", "joinMembershipByBindQQMusicVIP success but succHalfPanel invalid");
                gl4.z.a(y8Var);
            }
        } else {
            if (y8Var != null) {
                y8Var.a(new qk.ea(qk.ga.f445669f, null));
            }
            zVar.getClass();
            db5.t7.g(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgg));
        }
        return jz5.f0.f384359a;
    }
}
