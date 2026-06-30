package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.j2 f283361d;

    public i2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.j2 j2Var) {
        this.f283361d = j2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.j2 j2Var = this.f283361d;
        android.graphics.drawable.Drawable drawable = j2Var.f283399c.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b8i);
        drawable.setBounds(0, 0, com.p314xaae8f345.mm.ui.zk.a(j2Var.f283399c.getContext(), 8), com.p314xaae8f345.mm.ui.zk.a(j2Var.f283399c.getContext(), 8));
        al5.w wVar = new al5.w(drawable, 1);
        android.text.SpannableString spannableString = new android.text.SpannableString("@");
        spannableString.setSpan(wVar, 0, 1, 33);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatCustomFooter", "setReddotText：%s", j2Var.f283398b.f449609d);
        android.widget.TextView textView = j2Var.f283397a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = j2Var.f283399c.getContext();
        java.lang.String str = j2Var.f283398b.f449608c;
        ((ke0.e) xVar).getClass();
        sb6.append((java.lang.Object) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
        sb6.append(" ");
        textView.setText(android.text.TextUtils.concat(sb6.toString(), spannableString));
    }
}
