package df2;

/* loaded from: classes3.dex */
public final class g00 implements ie2.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f311716d;

    public g00(df2.m00 m00Var) {
        this.f311716d = m00Var;
    }

    @Override // ie2.h
    public void j() {
        df2.m00 m00Var = this.f311716d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(m00Var, null, null, new df2.f00(m00Var, null), 3, null);
    }

    @Override // ie2.h
    public java.lang.Object q(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        df2.m00 m00Var = this.f311716d;
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(m00Var, null, null, new df2.e00(rVar, m00Var, null), 3, null);
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f440719d ? j17 : jz5.f0.f384359a;
    }

    @Override // ie2.h
    public void s(android.os.Bundle bundle) {
        df2.m00 m00Var = this.f311716d;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c76 = m00Var.c7();
        if (c76 != null) {
            c76.m82582x3ae760af(1.0d);
        }
        android.view.View m124231x4ff8c0f0 = m00Var.m124231x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565285by4);
        if (m124231x4ff8c0f0 != null) {
            m124231x4ff8c0f0.setOnClickListener(new df2.l00(m00Var));
        }
    }
}
