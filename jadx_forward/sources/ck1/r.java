package ck1;

/* loaded from: classes4.dex */
public final class r implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f123901d;

    public r(ck1.k0 k0Var) {
        this.f123901d = k0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.uf7 uf7Var = (r45.uf7) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#usageInfoObservable");
        if (!ck1.n0.f123887a.e(uf7Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#usageInfoObservable, rawUsageInfo is null or invalid");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uf7Var);
        ck1.p pVar = new ck1.p(uf7Var);
        ck1.k0 k0Var = this.f123901d;
        k0Var.f123872e = pVar;
        k0Var.m8146xced61ae5();
    }
}
