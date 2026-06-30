package ns4;

/* loaded from: classes8.dex */
public final class x1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de f421209d;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de) {
        this.f421209d = activityC19067xb53aa1de;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de = this.f421209d;
        activityC19067xb53aa1de.getClass();
        if (bool == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = null;
        if (bool.booleanValue()) {
            u3Var = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC19067xb53aa1de.mo55332x76847179(), activityC19067xb53aa1de.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), false, 3, null);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = activityC19067xb53aa1de.f260710t;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        activityC19067xb53aa1de.f260710t = u3Var;
    }
}
