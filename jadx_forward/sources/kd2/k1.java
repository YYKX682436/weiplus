package kd2;

/* loaded from: classes2.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f388302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f388303e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(kd2.p1 p1Var, boolean z17) {
        super(0);
        this.f388302d = p1Var;
        this.f388303e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        vo2.d dVar;
        kd2.p1 p1Var = this.f388302d;
        kd2.q0 q0Var = p1Var.C;
        if ((q0Var != null ? q0Var.f388334b : 0L) > 0 && (dVar = p1Var.f388322z) != null) {
            long j17 = q0Var != null ? q0Var.f388334b : 0L;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = ((vo2.c) dVar).f520092b;
            if (c15188xd8bd4bd != null) {
                c15188xd8bd4bd.f0(j17, true, 3);
            }
        }
        kd2.p1 p1Var2 = this.f388302d;
        if (!this.f388303e) {
            kd2.q0 q0Var2 = p1Var2.C;
            if (!(q0Var2 != null && q0Var2.f388341i)) {
                z17 = false;
                kd2.p1.T0(p1Var2, z17, true, false, 4, null);
                return jz5.f0.f384359a;
            }
        }
        z17 = true;
        kd2.p1.T0(p1Var2, z17, true, false, 4, null);
        return jz5.f0.f384359a;
    }
}
