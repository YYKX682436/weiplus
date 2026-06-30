package el2;

/* loaded from: classes3.dex */
public final class t2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.u2 f335449d;

    public t2(el2.u2 u2Var) {
        this.f335449d = u2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        el2.u2 u2Var = this.f335449d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(u2Var.f335456f, "folder visible = " + bool);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        u2Var.f335454d.setVisibility(bool.booleanValue() ? 0 : 8);
    }
}
