package rf2;

/* loaded from: classes10.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f476208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f476209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dm4 f476210f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf2.w0 f476211g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(rf2.o1 o1Var, r45.dm4 dm4Var, rf2.w0 w0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476209e = o1Var;
        this.f476210f = dm4Var;
        this.f476211g = w0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf2.c1(this.f476209e, this.f476210f, this.f476211g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f476208d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f476208d = 1;
            obj = this.f476209e.c(this.f476210f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            rf2.w0 w0Var = this.f476211g;
            android.widget.TextView textView = w0Var.f476468m;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.TextView textView2 = w0Var.f476467i;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
