package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class xm implements com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b f192276a;

    public xm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b activityC14103x2367d69b) {
        this.f192276a = activityC14103x2367d69b;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e
    public void a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b activityC14103x2367d69b = this.f192276a;
        activityC14103x2367d69b.getClass();
        float abs = (java.lang.Math.abs(i17) * 1.0f) / view.m19973xa8f0dc02();
        if (abs == activityC14103x2367d69b.H) {
            return;
        }
        activityC14103x2367d69b.H = abs;
        if (abs < 0.5f) {
            activityC14103x2367d69b.f7();
            activityC14103x2367d69b.g7();
            return;
        }
        int color = activityC14103x2367d69b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        int i18 = (int) (((abs - 0.5f) / 0.5f) * 255);
        android.widget.RelativeLayout relativeLayout = activityC14103x2367d69b.A;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(com.p314xaae8f345.mm.ui.uk.a(color, i18));
        }
        activityC14103x2367d69b.mo78514x143f1b92().G0(com.p314xaae8f345.mm.ui.uk.a(color, i18));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = activityC14103x2367d69b.C;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(activityC14103x2367d69b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = activityC14103x2367d69b.B;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.m82040x7541828(activityC14103x2367d69b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        }
        android.widget.TextView textView = activityC14103x2367d69b.D;
        if (textView != null) {
            textView.setTextColor(activityC14103x2367d69b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        }
    }
}
