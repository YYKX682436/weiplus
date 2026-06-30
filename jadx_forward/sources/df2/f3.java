package df2;

/* loaded from: classes3.dex */
public final class f3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.g3 f311635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f311636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f311637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f311638g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(df2.g3 g3Var, int i17, boolean z17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311635d = g3Var;
        this.f311636e = i17;
        this.f311637f = z17;
        this.f311638g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.f3(this.f311635d, this.f311636e, this.f311637f, this.f311638g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.f3 f3Var = (df2.f3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        f3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        df2.e3 e3Var = new df2.e3(this.f311638g);
        df2.g3 g3Var = this.f311635d;
        int i17 = (int) ((mm2.c1) g3Var.m56788xbba4bfc0(mm2.c1.class)).f410399q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commonAnchorFlagClick anchorStatusFlag: ");
        int i18 = this.f311636e;
        sb6.append(i18);
        sb6.append(" lastAnchorStateFlag:");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicSettingModeController", sb6.toString());
        ((mm2.c1) g3Var.m56788xbba4bfc0(mm2.c1.class)).p8(i18);
        ((mm2.g5) g3Var.m56788xbba4bfc0(mm2.g5.class)).N6();
        if (this.f311637f) {
            df2.c3 c3Var = new df2.c3(g3Var, i18, e3Var, i17);
            dk2.xf P6 = g3Var.P6();
            if (P6 != null) {
                dk2.xf.e(P6, ((mm2.e1) g3Var.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) g3Var.m56788xbba4bfc0(mm2.e1.class)).f410516m, ((mm2.c1) g3Var.m56788xbba4bfc0(mm2.c1.class)).f410399q, 0, false, c3Var, 24, null);
            }
        } else {
            e3Var.mo149xb9724478(java.lang.Boolean.TRUE, null);
        }
        return jz5.f0.f384359a;
    }
}
