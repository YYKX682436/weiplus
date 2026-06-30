package ju1;

/* loaded from: classes9.dex */
public final class u implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 f383329d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 activityC13076xc17cada1) {
        this.f383329d = activityC13076xc17cada1;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1.f176947s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 activityC13076xc17cada1 = this.f383329d;
        activityC13076xc17cada1.getClass();
        if (bool == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = null;
        if (bool.booleanValue()) {
            u3Var = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC13076xc17cada1.mo55332x76847179(), activityC13076xc17cada1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 3, null);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = activityC13076xc17cada1.f176954r;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        activityC13076xc17cada1.f176954r = u3Var;
    }
}
