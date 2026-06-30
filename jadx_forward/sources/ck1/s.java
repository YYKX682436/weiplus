package ck1;

/* loaded from: classes4.dex */
public final class s implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f123905d;

    public s(ck1.k0 k0Var) {
        this.f123905d = k0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ck1.l0 l0Var = (ck1.l0) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#pageModeObservable, pageMode: " + l0Var);
        if (l0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#pageModeObservable, pageMode is null");
        } else {
            this.f123905d.m8146xced61ae5();
        }
    }
}
