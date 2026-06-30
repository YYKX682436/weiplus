package rk2;

/* loaded from: classes3.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk2.q f478001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rk2.q qVar) {
        super(2);
        this.f478001d = qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz zzVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz) this.f478001d.f478003a;
        zzVar.getClass();
        if (!((mm2.c1) zzVar.P0(mm2.c1.class)).N1 && !((mm2.c1) zzVar.P0(mm2.c1.class)).T) {
            if (!(((mm2.n0) zzVar.P0(mm2.n0.class)).f410806r)) {
                df2.bh bhVar = (df2.bh) zzVar.U0(df2.bh.class);
                if (bhVar != null) {
                    bhVar.Z6(intValue, intValue2);
                }
                return jz5.f0.f384359a;
            }
        }
        zzVar.x1(0);
        return jz5.f0.f384359a;
    }
}
