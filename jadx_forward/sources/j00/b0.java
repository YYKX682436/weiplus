package j00;

/* loaded from: classes9.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.ecs.C23684xcd1f2e7a f378247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j00.d0 f378248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f378249f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.p314xaae8f345.p2845xc516c4b6.ecs.C23684xcd1f2e7a c23684xcd1f2e7a, j00.d0 d0Var, yz5.l lVar) {
        super(1);
        this.f378247d = c23684xcd1f2e7a;
        this.f378248e = d0Var;
        this.f378249f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.n8 n8Var = (bw5.n8) obj;
        int i17 = 1 ^ ((n8Var == null || n8Var.f112072f != 0) ? 0 : 1);
        java.lang.Long m87728xfb85f7b0 = this.f378247d.m87728xfb85f7b0();
        i00.a[] aVarArr = i00.a.f368028d;
        if (m87728xfb85f7b0 != null && m87728xfb85f7b0.longValue() == 7) {
            j00.d0 d0Var = this.f378248e;
            long j17 = i17;
            java.lang.String m12558x17ec12d2 = n8Var != null ? n8Var.m12558x17ec12d2() : null;
            if (m12558x17ec12d2 == null) {
                m12558x17ec12d2 = "";
            }
            java.lang.String str = n8Var != null ? n8Var.f112077n[5] ? n8Var.f112074h : "" : null;
            d0Var.a(j17, m12558x17ec12d2, str == null ? "" : str, this.f378249f);
        }
        return jz5.f0.f384359a;
    }
}
