package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference */
/* loaded from: classes9.dex */
public class C19708x15855336 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final y35.b0 L;

    public C19708x15855336(android.content.Context context) {
        super(context);
        this.L = new y35.b0();
    }

    public void M(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        y35.b0 b0Var = this.L;
        b0Var.f540721b = str;
        b0Var.f540720a = str2;
        b0Var.f540722c = str3;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 q0Var = this.f279304e;
        if (q0Var == null) {
            return;
        }
        q0Var.a(this, null);
    }

    public void N(int i17) {
        this.L.f540723d = i17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 q0Var = this.f279304e;
        if (q0Var == null) {
            return;
        }
        q0Var.a(this, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568633ni2);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.h0h);
        android.widget.TextView textView4 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dy6);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.lal);
        textView4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ce_);
        y35.b0 b0Var = this.L;
        if (imageView != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, b0Var.f540721b, null);
        }
        if (textView != null) {
            int i17 = b0Var.f540723d;
            android.content.Context context = this.f279303d;
            if (i17 != 0) {
                if (i17 == 1) {
                    textView.setVisibility(0);
                    iz5.a.g(null, context != null);
                    textView.setTextColor(new com.p314xaae8f345.mm.ui.p2740x696c9db.gd(context).f291981a[0]);
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.iwo);
                } else if (i17 == 2) {
                    textView.setVisibility(8);
                }
            } else {
                textView.setVisibility(0);
                textView.setTextColor(com.p314xaae8f345.mm.ui.p2740x696c9db.gd.a(context));
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.iwu);
            }
        }
        if (textView2 != null) {
            textView2.setText(b0Var.f540720a);
        }
        if (textView3 != null) {
            textView3.setText(b0Var.f540722c);
        }
        super.t(view);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new y35.a0(this, findViewById));
    }

    public C19708x15855336(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = new y35.b0();
    }

    public C19708x15855336(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = new y35.b0();
    }
}
