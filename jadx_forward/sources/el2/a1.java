package el2;

/* loaded from: classes3.dex */
public final class a1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f335275d;

    public a1(el2.i1 i1Var) {
        this.f335275d = i1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        int hashCode = num.hashCode();
        el2.i1 i1Var = this.f335275d;
        boolean z17 = hashCode == ((android.view.View) ((jz5.n) i1Var.f335350i).mo141623x754a37bb()).hashCode();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i1Var.f335348g, "view = " + num + ", match = " + z17);
        if (z17) {
            i1Var.f335354p = false;
            i1Var.f335355q = false;
            i1Var.o(true);
        }
    }
}
