package pf4;

/* loaded from: classes4.dex */
public final class e0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf4.f0 f435394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f435395b;

    public e0(pf4.f0 f0Var, java.util.List list) {
        this.f435394a = f0Var;
        this.f435395b = list;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        pf4.f0 f0Var = this.f435394a;
        boolean z17 = ((gf4.a) f0Var.f435399d.get(i17)).f352868f;
        java.util.List list = this.f435395b;
        return z17 == ((gf4.a) list.get(i18)).f352868f && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((gf4.a) f0Var.f435399d.get(i17)).f352864b, ((gf4.a) list.get(i18)).f352864b);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        pf4.f0 f0Var = this.f435394a;
        long j17 = ((gf4.a) f0Var.f435399d.get(i17)).f352866d;
        java.util.List list = this.f435395b;
        return j17 == ((gf4.a) list.get(i18)).f352866d && ((gf4.a) f0Var.f435399d.get(i17)).f352867e == ((gf4.a) list.get(i18)).f352867e;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f435395b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f435394a.f435399d.size();
    }
}
