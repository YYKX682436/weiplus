package zo1;

/* loaded from: classes5.dex */
public final class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 f556154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f556155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f556156f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f556157g;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8, java.lang.String str, android.content.Intent intent, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f556154d = activityC12872x8baa24f8;
        this.f556155e = str;
        this.f556156f = intent;
        this.f556157g = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8.f174379x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8 = this.f556154d;
        java.lang.String str = this.f556155e;
        wo1.v vVar = null;
        try {
            java.lang.Object newInstance = java.lang.Class.forName(str).newInstance();
            wo1.v vVar2 = newInstance instanceof wo1.v ? (wo1.v) newInstance : null;
            if (vVar2 != null) {
                vVar2.m174239xa1b041f(activityC12872x8baa24f8, this.f556156f);
                vVar = vVar2;
            }
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SelectContactUI", e17, "", new java.lang.Object[0]);
        }
        pm0.v.X(new zo1.f3(vVar, activityC12872x8baa24f8, this.f556157g, str));
    }
}
