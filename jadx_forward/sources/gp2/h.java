package gp2;

/* loaded from: classes10.dex */
public final class h implements fz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355757d;

    public h(gp2.l0 l0Var) {
        this.f355757d = l0Var;
    }

    @Override // fz2.b
    public void M7(boolean z17) {
        gp2.l0 l0Var = this.f355757d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "onHeadsetStateChange on:" + z17);
        l0Var.B = z17;
        if (z17) {
            return;
        }
        java.lang.String t17 = l0Var.t();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("muteCurrentView set:");
        java.util.HashSet hashSet = l0Var.f355800z;
        sb6.append(hashSet.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t17, sb6.toString());
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            pm0.v.V(0L, new gp2.c0((gp2.f) it.next()));
        }
    }
}
