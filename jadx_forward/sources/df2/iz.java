package df2;

/* loaded from: classes3.dex */
public final class iz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lz f311968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f311970f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym5.w1 f311971g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz(df2.lz lzVar, java.lang.String str, int i17, ym5.w1 w1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311968d = lzVar;
        this.f311969e = str;
        this.f311970f = i17;
        this.f311971g = w1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.iz(this.f311968d, this.f311969e, this.f311970f, this.f311971g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.iz izVar = (df2.iz) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        izVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        df2.lz lzVar = this.f311968d;
        android.widget.ImageView imageView = (android.widget.ImageView) lzVar.m124230x4ff8c0f0(com.p314xaae8f345.mm.R.id.r5s);
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b a76 = lzVar.a7();
        if (a76 != null) {
            a76.setVisibility(0);
            rj.j a17 = nn2.d.f420204a.a();
            java.lang.String str = this.f311969e;
            if (str == null) {
                str = "";
            }
            rj.j.b(a17, str, a76, lzVar.f312263m, null, 8, null);
            a76.d();
            a76.m82583xcde73672(this.f311970f);
            a76.m82582x3ae760af(0.0d);
            ym5.w1 w1Var = this.f311971g;
            if (w1Var != null) {
                a76.a(w1Var);
            }
            a76.g();
        }
        return jz5.f0.f384359a;
    }
}
