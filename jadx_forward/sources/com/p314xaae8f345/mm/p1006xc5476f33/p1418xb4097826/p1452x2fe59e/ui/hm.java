package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class hm implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14098x3560a005 f191660d;

    public hm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14098x3560a005 activityC14098x3560a005) {
        this.f191660d = activityC14098x3560a005;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14098x3560a005.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14098x3560a005 activityC14098x3560a005 = this.f191660d;
        java.lang.String obj = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) ((jz5.n) activityC14098x3560a005.f191094u).mo141623x754a37bb()).getText().toString();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (obj == null) {
            obj = "";
        }
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(obj);
        ((android.widget.TextView) ((jz5.n) activityC14098x3560a005.f191095v).mo141623x754a37bb()).setText(((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Zi(E1));
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) activityC14098x3560a005.f191096w).mo141623x754a37bb();
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.f((int) E1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "formatLiveCardNumberMillion(...)");
        textView.setText(f17);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
