package df;

/* loaded from: classes7.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.w1 f311077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(df.w1 w1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311077d = w1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df.r1(this.f311077d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df.r1 r1Var = (df.r1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        df.w1 w1Var = this.f311077d;
        w1Var.getClass();
        w1Var.y(new df.h1(w1Var));
        df.a0 a0Var = this.f311077d.f311118i;
        if (a0Var != null) {
            a0Var.g();
        }
        android.view.ViewGroup viewGroup = this.f311077d.f311116g;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        df.w1 w1Var2 = this.f311077d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = w1Var2.f311115f;
            if (c25587x226dda3 != null) {
                c25587x226dda3.mo95669x74a7048a(w1Var2.f311113d);
            }
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new df.q1(w1Var2));
        }
        return jz5.f0.f384359a;
    }
}
