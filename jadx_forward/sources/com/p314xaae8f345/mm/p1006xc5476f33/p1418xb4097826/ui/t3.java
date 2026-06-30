package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class t3 implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f211390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f211391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 f211392f;

    public t3(android.widget.TextView textView, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 activityC15025x361cfff2) {
        this.f211390d = textView;
        this.f211391e = i17;
        this.f211392f = activityC15025x361cfff2;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
        java.lang.String valueOf = java.lang.String.valueOf(this.f211391e);
        android.widget.TextView textView = this.f211390d;
        textView.setText(valueOf);
        textView.setTextColor(this.f211392f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        int i17 = this.f211391e;
        int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(i17, str);
        java.lang.String valueOf = java.lang.String.valueOf(b17);
        android.widget.TextView textView = this.f211390d;
        textView.setText(valueOf);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 activityC15025x361cfff2 = this.f211392f;
        textView.setTextColor(activityC15025x361cfff2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        int i18 = (int) (i17 * 0.1f);
        if (i18 < 1) {
            i18 = 1;
        }
        if (b17 <= i18) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.a3 a3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.H1;
        activityC15025x361cfff2.d7();
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        java.lang.String valueOf = java.lang.String.valueOf(com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(this.f211391e, str));
        android.widget.TextView textView = this.f211390d;
        textView.setText(valueOf);
        textView.setVisibility(0);
        textView.setTextColor(this.f211392f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 activityC15025x361cfff2 = this.f211392f;
        java.lang.String string = activityC15025x361cfff2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.er8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.m7(activityC15025x361cfff2, string, null, null, 6, null);
    }
}
