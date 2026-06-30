package sc2;

/* loaded from: classes2.dex */
public final class o0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.b f487643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487645f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f487646g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(so2.b bVar, sc2.h1 h1Var, in5.s0 s0Var, r45.t01 t01Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f487643d = bVar;
        this.f487644e = h1Var;
        this.f487645f = s0Var;
        this.f487646g = t01Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        sc2.o0 o0Var = new sc2.o0(this.f487643d, this.f487644e, this.f487645f, this.f487646g, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        jz5.f0 f0Var = jz5.f0.f384359a;
        o0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        so2.b bVar = this.f487643d;
        if (bVar != null) {
            bVar.f491799e = new java.lang.Long(0L);
        }
        sc2.h1 h1Var = this.f487644e;
        android.widget.TextView textView = h1Var.K;
        in5.s0 s0Var = this.f487645f;
        if (textView != null) {
            textView.setOnClickListener(new sc2.n0(h1Var, s0Var, this.f487646g));
        }
        android.widget.TextView textView2 = h1Var.K;
        if (textView2 != null) {
            textView2.setText(s0Var.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nhz));
        }
        android.widget.TextView textView3 = h1Var.K;
        if (textView3 != null) {
            textView3.setTextColor(s0Var.f374654e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        }
        return jz5.f0.f384359a;
    }
}
