package oy3;

/* loaded from: classes13.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f431547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 f431548e;

    public c0(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4) {
        this.f431547d = i17;
        this.f431548e = activityC17256xc70b42d4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        int i17 = this.f431547d;
        g0Var.A(1904, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4 = this.f431548e;
        activityC17256xc70b42d4.A = false;
        activityC17256xc70b42d4.Z6();
        if (i17 == 3) {
            android.widget.TextView textView = activityC17256xc70b42d4.f240127i;
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l3c);
            }
        } else if (i17 == 4) {
            android.widget.TextView textView2 = activityC17256xc70b42d4.f240127i;
            if (textView2 != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l3b);
            }
        } else if (i17 == 5) {
            android.widget.TextView textView3 = activityC17256xc70b42d4.f240127i;
            if (textView3 != null) {
                textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l3c);
            }
        } else if (i17 == 9) {
            android.widget.TextView textView4 = activityC17256xc70b42d4.f240127i;
            if (textView4 != null) {
                textView4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l3l);
            }
        } else if (i17 == 11) {
            android.widget.TextView textView5 = activityC17256xc70b42d4.f240127i;
            if (textView5 != null) {
                textView5.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l3h);
            }
        } else if (i17 == 13) {
            android.widget.TextView textView6 = activityC17256xc70b42d4.f240127i;
            if (textView6 != null) {
                textView6.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l38);
            }
        } else if (i17 != 15) {
            android.widget.TextView textView7 = activityC17256xc70b42d4.f240127i;
            if (textView7 != null) {
                textView7.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l3g);
            }
        } else {
            android.widget.TextView textView8 = activityC17256xc70b42d4.f240127i;
            if (textView8 != null) {
                textView8.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l3_);
            }
        }
        android.widget.TextView textView9 = activityC17256xc70b42d4.f240127i;
        if (textView9 == null) {
            return;
        }
        textView9.setVisibility(0);
    }
}
