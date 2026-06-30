package df2;

/* loaded from: classes3.dex */
public final class np implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.sp f312403d;

    public np(df2.sp spVar) {
        this.f312403d = spVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        df2.ip ipVar;
        r45.o35 o35Var = (r45.o35) obj;
        df2.sp spVar = this.f312403d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(spVar.f312886m, "expiredGiftRecommend receive info = " + o35Var);
        if (o35Var == null) {
            spVar.c7("expiredGiftRecommend", true);
        } else {
            if (!df2.sp.Z6(spVar, o35Var) || (ipVar = (df2.ip) spVar.m56789x25fe639c(df2.ip.class)) == null) {
                return;
            }
            ipVar.f311956r = java.lang.Long.valueOf(o35Var.m75942xfb822ef2(0));
        }
    }
}
