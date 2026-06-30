package df2;

/* loaded from: classes3.dex */
public final class gu extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.ju f311786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f311788g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu(df2.ju juVar, java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311786e = juVar;
        this.f311787f = str;
        this.f311788g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.gu(this.f311786e, this.f311787f, this.f311788g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.gu) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311785d;
        df2.ju juVar = this.f311786e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.widget.TextView b76 = df2.ju.b7(juVar);
            if (b76 != null) {
                b76.setText(this.f311787f);
            }
            android.widget.TextView b77 = df2.ju.b7(juVar);
            if (b77 != null) {
                b77.setMaxWidth((juVar.U6() ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(juVar.O6(), 88) : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(juVar.O6(), 108)) * 2);
            }
            if2.d0 d0Var = juVar.f312032m;
            if (d0Var != null) {
                d0Var.d(4);
            }
            this.f311785d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(10L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                juVar.d7();
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.view.View a76 = df2.ju.a7(juVar);
        if (a76 != null) {
            a76.post(new df2.du(juVar));
        }
        android.widget.TextView b78 = df2.ju.b7(juVar);
        if (b78 != null) {
            b78.setOnClickListener(new df2.eu(juVar));
        }
        android.view.ViewGroup c76 = juVar.c7();
        if (c76 != null) {
            c76.setOnClickListener(new df2.fu(juVar));
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Lk(1, 1);
        this.f311785d = 2;
        if (p3325xe03a0797.p3326xc267989b.k1.b(this.f311788g, this) == aVar) {
            return aVar;
        }
        juVar.d7();
        return jz5.f0.f384359a;
    }
}
