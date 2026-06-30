package df2;

/* loaded from: classes3.dex */
public final class m8 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f312296d;

    public m8(df2.s8 s8Var) {
        this.f312296d = s8Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        df2.s8 s8Var = this.f312296d;
        if (booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s8Var.f312832m, "[hideViewSelf] liveBubbleShowStatusLiveData");
            df2.pv pvVar = (df2.pv) s8Var.m56789x25fe639c(df2.pv.class);
            if (pvVar != null) {
                pvVar.b7(s8Var);
                return;
            }
            return;
        }
        if (kz5.c0.i(df2.h7.f311839i, df2.h7.f311840m).contains(s8Var.B1)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s8Var.f312832m, "[tryToShow] liveBubbleShowStatusLiveData");
        df2.pv pvVar2 = (df2.pv) s8Var.m56789x25fe639c(df2.pv.class);
        if (pvVar2 != null) {
            pvVar2.d7(s8Var);
        }
    }
}
