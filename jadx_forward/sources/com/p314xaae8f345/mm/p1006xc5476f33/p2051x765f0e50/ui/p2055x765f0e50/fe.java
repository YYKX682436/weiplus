package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class fe implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17427x695175aa f242567d;

    public fe(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17427x695175aa activityC17427x695175aa) {
        this.f242567d = activityC17427x695175aa;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17427x695175aa activityC17427x695175aa = this.f242567d;
        if (activityC17427x695175aa.isFinishing() || activityC17427x695175aa.isDestroyed()) {
            return true;
        }
        java.lang.Object obj = msg.obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (java.lang.System.currentTimeMillis() - activityC17427x695175aa.f241986w < 3000) {
            return true;
        }
        android.widget.TextView textView = activityC17427x695175aa.f241972f;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
            throw null;
        }
        textView.setVisibility(0);
        if (activityC17427x695175aa.f241987x == -1) {
            activityC17427x695175aa.f241987x = java.lang.System.currentTimeMillis();
        }
        java.lang.System.currentTimeMillis();
        long j17 = activityC17427x695175aa.f241987x;
        if (booleanValue) {
            android.widget.TextView textView2 = activityC17427x695175aa.f241972f;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
                throw null;
            }
            textView2.setText(activityC17427x695175aa.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o67));
            android.widget.TextView textView3 = activityC17427x695175aa.f241972f;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
                throw null;
            }
            textView3.setTextColor(activityC17427x695175aa.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
            com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d = activityC17427x695175aa.f241973g;
            if (c21330xc127fb4d == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newVoice2txtTxtReactWave");
                throw null;
            }
            c21330xc127fb4d.m78274xb63fd1a8(activityC17427x695175aa.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
            if (java.lang.System.currentTimeMillis() - activityC17427x695175aa.f241987x > 1700 && !activityC17427x695175aa.f241979p) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17427x695175aa.T6(activityC17427x695175aa);
            }
        } else {
            android.widget.TextView textView4 = activityC17427x695175aa.f241972f;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
                throw null;
            }
            textView4.setText(activityC17427x695175aa.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o66));
            android.widget.TextView textView5 = activityC17427x695175aa.f241972f;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
                throw null;
            }
            textView5.setTextColor(activityC17427x695175aa.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77922x54cad3c6));
            com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d2 = activityC17427x695175aa.f241973g;
            if (c21330xc127fb4d2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newVoice2txtTxtReactWave");
                throw null;
            }
            c21330xc127fb4d2.m78274xb63fd1a8(activityC17427x695175aa.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77922x54cad3c6));
            activityC17427x695175aa.f241987x = -1L;
        }
        return true;
    }
}
