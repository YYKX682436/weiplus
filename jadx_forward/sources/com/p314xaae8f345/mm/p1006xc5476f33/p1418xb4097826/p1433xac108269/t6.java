package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes9.dex */
public final class t6 implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.g9 f184084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f184085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184086f;

    public t6(bw5.g9 g9Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str) {
        this.f184084d = g9Var;
        this.f184085e = h0Var;
        this.f184086f = str;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        bw5.g9 g9Var = this.f184084d;
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "share showWindow " + g9Var.m11973x93d5ac12() + " cancel");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "share showWindow " + g9Var.m11973x93d5ac12() + " to " + stringArrayListExtra);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f184085e;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f391656d;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        java.lang.String str = this.f184086f;
        if (str == null || str.length() == 0) {
            return;
        }
        ((dk5.s5) tg3.t1.a()).Ui((java.lang.String) h0Var.f391656d, str);
    }
}
