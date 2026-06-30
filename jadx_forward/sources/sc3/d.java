package sc3;

/* loaded from: classes7.dex */
public final class d implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487968d;

    public d(sc3.k1 k1Var) {
        this.f487968d = k1Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        sc3.k1 k1Var = this.f487968d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(k1Var.Q, "binder died, need to exit service");
        tc3.m0 m0Var = k1Var.W;
        if (m0Var == null) {
            return;
        }
        if (m0Var != null) {
            m0Var.f498769f = false;
        }
        k1Var.W = null;
        k1Var.Oc(2);
    }
}
