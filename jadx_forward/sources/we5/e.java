package we5;

/* loaded from: classes5.dex */
public final class e {
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(yb5.d ui6, android.widget.LinearLayout autoTranslationButton, android.widget.TextView autoTranslationText, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, android.app.Activity context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(autoTranslationButton, "autoTranslationButton");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(autoTranslationText, "autoTranslationText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.i0 i0Var = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) ui6.f542241c.a(sb5.e.class))).f281644m;
        android.view.ViewGroup.LayoutParams layoutParams = autoTranslationButton.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        com.p314xaae8f345.mm.ui.bk.s0(autoTranslationText.getPaint());
        if (i0Var.f272402d) {
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = i65.a.h(ui6.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.afe);
            }
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                autoTranslationButton.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_o);
            } else {
                autoTranslationButton.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_p);
            }
        } else {
            autoTranslationButton.setBackgroundResource(0);
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = i65.a.h(ui6.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.alk);
            }
        }
        autoTranslationButton.setLayoutParams(marginLayoutParams);
        com.p314xaae8f345.mm.p2621x8fb0427b.a9 a9Var = msg.f275460g2;
        if (a9Var instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.un) {
            b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.un) a9Var).f287249e, autoTranslationButton, autoTranslationText, msg, context);
            autoTranslationButton.setOnClickListener(new we5.c(context, msg, a9Var, ui6));
        } else if (a9Var instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xb) {
            b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xb) a9Var).f287512e, autoTranslationButton, autoTranslationText, msg, context);
            autoTranslationButton.setOnClickListener(new we5.d(context, msg, a9Var, ui6));
        }
    }

    public final void b(int i17, android.widget.LinearLayout linearLayout, android.widget.TextView textView, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.app.Activity activity) {
        if (i17 == 1) {
            linearLayout.setVisibility(0);
            textView.setText(i65.a.r(activity, com.p314xaae8f345.mm.R.C30867xcad56011.nff));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemTextFrom", "auto translation tail button at " + f9Var.m124847x74d37ac6() + ": " + ((java.lang.Object) textView.getText()));
            return;
        }
        if (i17 != 2) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        textView.setText(i65.a.r(activity, com.p314xaae8f345.mm.R.C30867xcad56011.ndr));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemTextFrom", "auto translation tail button at " + f9Var.m124847x74d37ac6() + ": " + ((java.lang.Object) textView.getText()));
    }
}
