package ns4;

/* loaded from: classes8.dex */
public final class m0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.p0 f421123d;

    public m0(ns4.p0 p0Var) {
        this.f421123d = p0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
        java.lang.String obj = s17.toString();
        ns4.p0 p0Var = this.f421123d;
        p0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinCustomAmountInputDialog", "update tips: %s", obj);
        long j07 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j0(obj + "", "100");
        long j08 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j0(obj + "", com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0);
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab c22904x897710ab = p0Var.f421145e;
        if (c22904x897710ab == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coinAmount");
            throw null;
        }
        c22904x897710ab.setText(java.lang.String.valueOf(j08));
        if (j07 == 0) {
            android.widget.Button button = p0Var.f421144d;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmButton");
                throw null;
            }
            button.setEnabled(false);
            android.widget.TextView textView = p0Var.f421147g;
            if (textView != null) {
                textView.setVisibility(4);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputTips");
                throw null;
            }
        }
        ns4.r0 r0Var = p0Var.f421142b;
        if (j07 <= r0Var.f421163a) {
            android.widget.Button button2 = p0Var.f421144d;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmButton");
                throw null;
            }
            button2.setEnabled(true);
            android.widget.TextView textView2 = p0Var.f421147g;
            if (textView2 != null) {
                textView2.setVisibility(4);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputTips");
                throw null;
            }
        }
        android.widget.Button button3 = p0Var.f421144d;
        if (button3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmButton");
            throw null;
        }
        button3.setEnabled(false);
        android.widget.TextView textView3 = p0Var.f421147g;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputTips");
            throw null;
        }
        textView3.setVisibility(0);
        long j17 = r0Var.f421163a / 100;
        android.widget.TextView textView4 = p0Var.f421147g;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputTips");
            throw null;
        }
        textView4.setText(p0Var.f421141a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l9c, java.lang.String.valueOf(j17)));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
    }
}
