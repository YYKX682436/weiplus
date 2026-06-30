package rf2;

/* loaded from: classes10.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f476298d;

    /* renamed from: e, reason: collision with root package name */
    public int f476299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f476300f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476301g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f476302h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476303i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r45.f02 f02Var, rf2.v0 v0Var, android.widget.TextView textView, android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476300f = f02Var;
        this.f476301g = v0Var;
        this.f476302h = textView;
        this.f476303i = view;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf2.i0(this.f476300f, this.f476301g, this.f476302h, this.f476303i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.i0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object f17;
        r45.pl4 pl4Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f476299e;
        r45.f02 f02Var = this.f476300f;
        rf2.v0 v0Var = this.f476301g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.sl4 sl4Var = f02Var.f455415h;
            r45.pl4 pl4Var2 = sl4Var != null ? sl4Var.f467369i : null;
            this.f476298d = pl4Var2;
            this.f476299e = 1;
            f17 = v0Var.f(pl4Var2, this);
            if (f17 == aVar) {
                return aVar;
            }
            pl4Var = pl4Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r45.pl4 pl4Var3 = (r45.pl4) this.f476298d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            f17 = obj;
            pl4Var = pl4Var3;
        }
        boolean booleanValue = ((java.lang.Boolean) f17).booleanValue();
        android.widget.TextView textView = this.f476302h;
        if (booleanValue) {
            if (textView != null) {
                textView.setText(v0Var.f476447a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d66));
            }
        } else if (textView != null) {
            textView.setText(v0Var.f476447a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5j));
        }
        rf2.t tVar = rf2.t.f476423a;
        java.lang.String str = f02Var.f455411d;
        if (str == null) {
            str = "";
        }
        tVar.e(str, 26, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        if (textView != null) {
            textView.setOnClickListener(new rf2.h0(this.f476300f, this.f476301g, booleanValue, pl4Var, this.f476303i));
        }
        return jz5.f0.f384359a;
    }
}
