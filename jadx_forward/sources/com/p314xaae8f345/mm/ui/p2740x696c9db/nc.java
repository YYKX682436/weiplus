package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class nc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 f292141d;

    public nc(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72) {
        this.f292141d = activityC22543x95896a72;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = this.f292141d;
        activityC22543x95896a72.H = false;
        boolean z17 = activityC22543x95896a72.F;
        if (z17) {
            if (z17) {
                android.view.View findViewById = activityC22543x95896a72.findViewById(com.p314xaae8f345.mm.R.id.ght);
                android.view.View findViewById2 = activityC22543x95896a72.findViewById(com.p314xaae8f345.mm.R.id.v5i);
                findViewById2.setBackgroundColor(activityC22543x95896a72.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
                android.widget.RelativeLayout relativeLayout = activityC22543x95896a72.f291751J;
                if (relativeLayout != null) {
                    oa5.b.b(activityC22543x95896a72.f291751J).k(new com.p314xaae8f345.mm.ui.p2740x696c9db.hc(activityC22543x95896a72, relativeLayout.getHeight(), findViewById)).o(new com.p314xaae8f345.mm.ui.p2740x696c9db.gc(activityC22543x95896a72, findViewById, findViewById2)).g(150L).l();
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee c19739x911a23ee = activityC22543x95896a72.B;
                if (c19739x911a23ee != null) {
                    c19739x911a23ee.setVisibility(8);
                    activityC22543x95896a72.T6();
                }
            }
            activityC22543x95896a72.Y6(false);
            return;
        }
        if (!z17) {
            android.view.View findViewById3 = activityC22543x95896a72.findViewById(com.p314xaae8f345.mm.R.id.ght);
            activityC22543x95896a72.mo78578x8b18f126(activityC22543x95896a72.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            activityC22543x95896a72.findViewById(com.p314xaae8f345.mm.R.id.v5i).setBackgroundColor(activityC22543x95896a72.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
            android.widget.RelativeLayout relativeLayout2 = activityC22543x95896a72.f291751J;
            if (relativeLayout2 != null) {
                oa5.b.b(activityC22543x95896a72.f291751J).k(new com.p314xaae8f345.mm.ui.p2740x696c9db.ec(activityC22543x95896a72, relativeLayout2.getHeight(), findViewById3)).o(new com.p314xaae8f345.mm.ui.p2740x696c9db.dc(activityC22543x95896a72, findViewById3)).g(150L).l();
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee c19739x911a23ee2 = activityC22543x95896a72.B;
            if (c19739x911a23ee2 != null) {
                c19739x911a23ee2.setVisibility(0);
                activityC22543x95896a72.T6();
            }
        }
        activityC22543x95896a72.Y6(true);
    }
}
