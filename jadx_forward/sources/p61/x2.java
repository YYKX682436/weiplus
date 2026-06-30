package p61;

/* loaded from: classes5.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11367x42f5894c f433942d;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11367x42f5894c activityC11367x42f5894c) {
        this.f433942d = activityC11367x42f5894c;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11367x42f5894c activityC11367x42f5894c = this.f433942d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(activityC11367x42f5894c.f154589n.intValue() - 1);
        activityC11367x42f5894c.f154589n = valueOf;
        if (valueOf.intValue() > 0) {
            activityC11367x42f5894c.f154587i.setText(activityC11367x42f5894c.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571217v, activityC11367x42f5894c.f154589n.intValue(), activityC11367x42f5894c.f154589n));
            return;
        }
        activityC11367x42f5894c.f154587i.setText(activityC11367x42f5894c.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571217v, 0, 0));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = activityC11367x42f5894c.f154591p;
        if (b4Var != null && !b4Var.e()) {
            activityC11367x42f5894c.f154591p.d();
        }
        activityC11367x42f5894c.f154591p = null;
    }
}
