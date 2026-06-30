package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class pb implements db5.d8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 f292175a;

    public pb(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752) {
        this.f292175a = activityC22534xec824752;
    }

    @Override // db5.d8
    public void a() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752 = this.f292175a;
        boolean z17 = activityC22534xec824752.f291733p;
        if (z17) {
            if (z17) {
                android.view.View findViewById = activityC22534xec824752.findViewById(com.p314xaae8f345.mm.R.id.ght);
                android.view.View findViewById2 = activityC22534xec824752.findViewById(com.p314xaae8f345.mm.R.id.v5i);
                findViewById2.setBackgroundColor(activityC22534xec824752.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
                android.widget.RelativeLayout relativeLayout = activityC22534xec824752.f291735r;
                if (relativeLayout != null) {
                    oa5.b.b(relativeLayout).k(new com.p314xaae8f345.mm.ui.p2740x696c9db.ra(activityC22534xec824752, findViewById)).o(new com.p314xaae8f345.mm.ui.p2740x696c9db.qa(activityC22534xec824752, findViewById, findViewById2)).g(150L).l();
                }
            }
            activityC22534xec824752.a7(false);
            return;
        }
        if (!z17) {
            android.view.View findViewById3 = activityC22534xec824752.findViewById(com.p314xaae8f345.mm.R.id.ght);
            activityC22534xec824752.mo78578x8b18f126(activityC22534xec824752.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            android.view.View findViewById4 = activityC22534xec824752.findViewById(com.p314xaae8f345.mm.R.id.v5i);
            findViewById4.setBackgroundColor(activityC22534xec824752.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            android.widget.RelativeLayout relativeLayout2 = activityC22534xec824752.f291735r;
            if (relativeLayout2 != null) {
                oa5.b.b(relativeLayout2).k(new com.p314xaae8f345.mm.ui.p2740x696c9db.ta(activityC22534xec824752, findViewById3)).o(new com.p314xaae8f345.mm.ui.p2740x696c9db.sa(activityC22534xec824752, findViewById3, findViewById4)).g(150L).l();
            }
        }
        activityC22534xec824752.a7(true);
    }

    @Override // db5.d8
    public void b() {
    }
}
