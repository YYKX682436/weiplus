package df2;

/* loaded from: classes3.dex */
public final class zc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f313486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.ad f313487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313488f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f313489g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(df2.ad adVar, java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313487e = adVar;
        this.f313488f = str;
        this.f313489g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.zc(this.f313487e, this.f313488f, this.f313489g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.zc) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f313486d;
        df2.ad adVar = this.f313487e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.view.ViewGroup Z6 = adVar.Z6();
            android.view.View view = null;
            android.widget.TextView textView = Z6 != null ? (android.widget.TextView) Z6.findViewById(com.p314xaae8f345.mm.R.id.f566339fl2) : null;
            if (textView != null) {
                textView.setText(r26.i0.v(this.f313488f, "，", "，\n", false, 4, null));
            }
            android.view.View S6 = adVar.S6(com.p314xaae8f345.mm.R.id.eqg);
            if (S6 != null && S6.isShown()) {
                view = S6;
            }
            android.view.ViewGroup Z62 = adVar.Z6();
            if (Z62 != null) {
                Z62.postDelayed(new df2.yc(view, adVar), 1000L);
            }
            this.f313486d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(this.f313489g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if2.d0 d0Var = adVar.f311240m;
        if (d0Var != null) {
            d0Var.d(8);
        }
        return jz5.f0.f384359a;
    }
}
