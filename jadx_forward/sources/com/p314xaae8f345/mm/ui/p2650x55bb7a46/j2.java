package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class j2 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.pd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f283397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r01.g0 f283398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 f283399c;

    public j2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 viewOnClickListenerC21613xfaa83484, android.widget.TextView textView, r01.g0 g0Var) {
        this.f283399c = viewOnClickListenerC21613xfaa83484;
        this.f283397a = textView;
        this.f283398b = g0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.pd
    public void a(boolean z17, java.lang.String str) {
        android.widget.TextView textView = this.f283397a;
        if (textView == null) {
            return;
        }
        if (z17) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.i2(this), 500L);
            return;
        }
        r01.g0 g0Var = this.f283398b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatCustomFooter", "dont setReddotText:%s", g0Var.f449609d);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f283399c.getContext();
        java.lang.String str2 = g0Var.f449608c;
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2));
    }
}
