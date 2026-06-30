package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes3.dex */
public final class j6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l6 f187146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f187147e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l6 l6Var, java.lang.StringBuilder sb6) {
        super(0);
        this.f187146d = l6Var;
        this.f187147e = sb6;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l6 l6Var = this.f187146d;
        android.widget.LinearLayout linearLayout = l6Var.f187214g;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        java.lang.String str = l6Var.f187209b;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            android.widget.TextView textView = new android.widget.TextView(linearLayout.getContext());
            java.lang.StringBuilder sb6 = this.f187147e;
            textView.setText(sb6);
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560082aj));
            textView.setTextSize(0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja));
            textView.setBackgroundColor(android.graphics.Color.parseColor("#26000000"));
            textView.setVerticalScrollBarEnabled(true);
            textView.setMaxWidth((int) ((java.lang.Number) ((jz5.n) l6Var.f187215h).mo141623x754a37bb()).floatValue());
            jz5.g gVar = l6Var.f187221n;
            textView.setPadding(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), 0, ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
            textView.setClickable(false);
            textView.setFocusable(false);
            textView.setEnabled(false);
            textView.setImportantForAccessibility(2);
            android.widget.LinearLayout linearLayout2 = l6Var.f187214g;
            if (linearLayout2 != null) {
                linearLayout2.addView(textView);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "update msg=" + ((java.lang.Object) sb6) + '!');
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "update rootLL is null!");
        }
        return f0Var2;
    }
}
