package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class u6 implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f184128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184129b;

    public u6(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str) {
        this.f184128a = h0Var;
        this.f184129b = str;
    }

    @Override // q80.x
    /* renamed from: onActivityResult */
    public final void mo55562x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1 && i17 == 1015) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f184128a;
            java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f391656d;
            if (charSequence == null || charSequence.length() == 0) {
                return;
            }
            java.lang.String str = this.f184129b;
            if (str == null || str.length() == 0) {
                return;
            }
            ((dk5.s5) tg3.t1.a()).Ui((java.lang.String) h0Var.f391656d, str);
        }
    }
}
