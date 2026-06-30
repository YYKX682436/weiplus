package df2;

/* loaded from: classes3.dex */
public final class l8 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f312183d;

    public l8(df2.s8 s8Var) {
        this.f312183d = s8Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        int hashCode = num.hashCode();
        df2.s8 s8Var = this.f312183d;
        android.view.View f76 = s8Var.f7();
        boolean z17 = hashCode == (f76 != null ? f76.hashCode() : 0);
        java.lang.String str = s8Var.f312832m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "view = " + num + ", match = " + z17);
        if (s8Var.B1 == df2.h7.f311835e && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "sendBtn unregister by other");
            s8Var.m7(df2.h7.f311834d);
        }
    }
}
