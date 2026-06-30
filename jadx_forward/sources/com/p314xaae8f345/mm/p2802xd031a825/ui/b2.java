package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public abstract class b2 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v3 {
    public static void b(android.content.Context context, android.view.View view) {
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletProgressDialog", "view is null");
            return;
        }
        float q17 = i65.a.q(context);
        if (q17 > 1.4f) {
            q17 = 1.4f;
        }
        float a17 = i65.a.a(context, 8.0f);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.czu);
        float minimumWidth = view.getMinimumWidth();
        android.text.TextPaint paint = textView.getPaint();
        float measureText = paint.measureText(textView.getText().toString());
        float f17 = j65.f.f379476g;
        float f18 = 2.0f;
        if (((minimumWidth - measureText) * f17) / 2.0f < a17) {
            int i17 = 6;
            float[] fArr = {1.4f, 1.125f, 1.12f, 1.1f, 1.0f, 0.8f};
            float textSize = textView.getTextSize();
            float f19 = q17;
            int i18 = 0;
            while (i18 < i17) {
                float f27 = fArr[i18];
                if (f19 >= f27) {
                    paint.setTextSize((textSize / q17) * f27);
                    float measureText2 = paint.measureText(textView.getText().toString());
                    float f28 = ((minimumWidth - measureText2) * f17) / f18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletProgressDialog", "resetTextSize viewPx:" + minimumWidth + " tvPx:" + measureText2 + " fontScale:" + f27 + " distance:" + f28);
                    f19 = f27;
                    if (f28 >= a17) {
                        break;
                    }
                }
                i18++;
                i17 = 6;
                f18 = 2.0f;
            }
            textView.setTextSize(0, (textSize / q17) * f19);
        }
    }

    public static android.app.Dialog c(android.content.Context context, java.lang.CharSequence charSequence, boolean z17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj), charSequence.toString(), false, z17, onCancelListener);
    }

    public static android.app.Dialog e(android.content.Context context, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvq), z18, z17, onCancelListener);
    }

    public static android.app.Dialog f(android.content.Context context, java.lang.String str, boolean z17, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d7z, null);
        b(context, inflate);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.czu);
        textView.setText(str);
        if (i17 > 0) {
            int b17 = i65.a.b(context, i17);
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof android.widget.LinearLayout.LayoutParams)) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMargins(b17, layoutParams2.topMargin, b17, layoutParams2.bottomMargin);
                textView.setLayoutParams(layoutParams2);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576201t4);
        k2Var.setCancelable(z17);
        k2Var.setContentView(inflate);
        k2Var.setOnCancelListener(onCancelListener);
        k2Var.show();
        return k2Var;
    }

    public static android.app.Dialog h(android.content.Context context, boolean z17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d7z, null);
        b(context, inflate);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576201t4);
        k2Var.setCancelable(z17);
        k2Var.setContentView(inflate);
        k2Var.setOnCancelListener(onCancelListener);
        k2Var.show();
        return k2Var;
    }

    public static android.app.Dialog i(android.content.Context context, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d7z, null);
        b(context, inflate);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576201t4);
        k2Var.setCancelable(z17);
        k2Var.setContentView(inflate);
        k2Var.setCanceledOnTouchOutside(z18);
        k2Var.setOnCancelListener(onCancelListener);
        k2Var.show();
        return k2Var;
    }
}
