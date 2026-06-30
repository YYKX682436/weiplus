package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a f171312d;

    public i8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a) {
        this.f171312d = activityC12666xc288131a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a = this.f171312d;
        activityC12666xc288131a.f170952w = new android.content.res.Configuration(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a.p7(activityC12666xc288131a));
        activityC12666xc288131a.f170953x = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.b1 b1Var = activityC12666xc288131a.W;
        activityC12666xc288131a.f35293x1829ba16 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb(b1Var);
        c11529x5d7a34bb = activityC12666xc288131a.f35293x1829ba16;
        android.view.View view = activityC12666xc288131a.f171851h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.f172995u.pollFirst();
        if (h1Var != null) {
            h1Var.f172997e = view;
            android.app.Activity a17 = q75.a.a(activityC12666xc288131a);
            if (a17 == null) {
                a17 = activityC12666xc288131a;
            }
            if (h1Var.getContext() instanceof android.content.MutableContextWrapper) {
                android.content.MutableContextWrapper mutableContextWrapper = (android.content.MutableContextWrapper) h1Var.getContext();
                if (mutableContextWrapper.getBaseContext() != a17) {
                    mutableContextWrapper.setBaseContext(a17);
                    if (a17 instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) {
                        h1Var.f173003n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5(a17);
                    } else {
                        h1Var.f173003n = null;
                    }
                }
            }
        } else {
            h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1(activityC12666xc288131a, view);
        }
        android.widget.FrameLayout frameLayout = c11529x5d7a34bb.f156371q;
        frameLayout.removeView(h1Var);
        frameLayout.addView(h1Var, frameLayout.getChildCount(), new android.view.ViewGroup.LayoutParams(-1, -1));
        c11529x5d7a34bb.f156378x = h1Var;
        frameLayout.requestChildFocus(h1Var, h1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b8 b8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b8) b1Var;
        b8Var.getClass();
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) b8Var.f171112a.f171851h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a aVar = activityC12666xc288131a.f170945p;
        android.app.Activity activity = aVar.f172808a;
        if (activity != null && activity.getWindow() != null && frameLayout2 != null && frameLayout2.getParent() != null && (frameLayout2.getParent() instanceof android.view.ViewGroup)) {
            aVar.f172809b = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h8 h8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h8(this, activityC12666xc288131a);
        activityC12666xc288131a.f170948s = h8Var;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        try {
            boolean a18 = fp.h.a(33);
            android.content.BroadcastReceiver broadcastReceiver = h8Var.f506969a;
            if (a18) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(broadcastReceiver, intentFilter);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(broadcastReceiver, intentFilter, 4);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseAppBrandUIHomePressReceiver", "register screen off receiver e = " + e17);
        }
    }
}
