package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

/* loaded from: classes9.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f260181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e f260182e;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e activityC19024x28e2705e, android.os.Bundle bundle) {
        this.f260182e = activityC19024x28e2705e;
        this.f260181d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = this.f260181d;
        bundle.putInt("key_bind_scene", 15);
        bundle.putBoolean("key_bind_show_change_card", true);
        boolean b17 = com.p314xaae8f345.mm.p2802xd031a825.b.a().b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e activityC19024x28e2705e = this.f260182e;
        if (!b17) {
            com.p314xaae8f345.mm.p2802xd031a825.a.j(activityC19024x28e2705e, qs4.j.class, bundle, null);
            return;
        }
        activityC19024x28e2705e.f260099x.mo48813x58998cd();
        activityC19024x28e2705e.getClass();
        if (bundle != null) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, bundle.getInt("key_bind_scene"));
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(bundle.getInt("key_bind_scene"));
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, 0);
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(0);
        }
        ((h45.q) i95.n0.c(h45.q.class)).mo24800xa4a1f2e8(activityC19024x28e2705e, bundle);
    }
}
