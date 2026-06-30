package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class x2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272269d;

    public x2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272269d = c19666xfd6e2f33;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272269d;
            int width = c19666xfd6e2f33.f271489a4.getWidth();
            int lineCount = c19666xfd6e2f33.f271494b4.getLineCount();
            int i17 = lineCount - c19666xfd6e2f33.f271541j5;
            int abs = java.lang.Math.abs(width - c19666xfd6e2f33.f271596s5);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b5 b5Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.b5.MODE_TRANS;
            if (abs > 100 && c19666xfd6e2f33.f271501c6 == b5Var && i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatFooter", "afterTextChanged() diffWidth:%s, transWidth:%s, layoutWidth:%s", java.lang.Integer.valueOf(abs), java.lang.Integer.valueOf(c19666xfd6e2f33.f271596s5), java.lang.Integer.valueOf(width));
            }
            if (i17 != 0 && c19666xfd6e2f33.f271501c6 == b5Var) {
                int lineHeight = c19666xfd6e2f33.f271494b4.getLineHeight();
                int selectionStart = c19666xfd6e2f33.f271494b4.getSelectionStart();
                android.text.Layout layout = c19666xfd6e2f33.f271494b4.getLayout();
                if (layout != null) {
                    int lineForOffset = layout.getLineForOffset(selectionStart);
                    int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
                    if (lineBottom > lineHeight) {
                        lineHeight = lineBottom;
                    }
                }
                int round = java.lang.Math.round(com.p314xaae8f345.mm.ui.gk.a(com.p314xaae8f345.mm.ui.zk.a(c19666xfd6e2f33.getContext(), 20)));
                int round2 = java.lang.Math.round(com.p314xaae8f345.mm.ui.gk.a(com.p314xaae8f345.mm.ui.zk.a(c19666xfd6e2f33.getContext(), 42)));
                int i18 = (c19666xfd6e2f33.f271499c4.getVisibility() == 0 || c19666xfd6e2f33.f271517f4.getVisibility() == 0) ? round + round2 : round + round;
                int height = c19666xfd6e2f33.f271489a4.getHeight() + (lineHeight * i17);
                int i19 = lineHeight * lineCount;
                int min = java.lang.Math.min(height, i18 + i19);
                if (i17 >= 0 || lineCount != 1) {
                    i19 = min;
                }
                if (c19666xfd6e2f33.f271543k2) {
                    c19666xfd6e2f33.f271628x5 = java.lang.Math.min(java.lang.Math.max(c19666xfd6e2f33.f271590r5, i19), c19666xfd6e2f33.f271641z5);
                } else {
                    c19666xfd6e2f33.f271628x5 = java.lang.Math.min(java.lang.Math.max(c19666xfd6e2f33.f271590r5, i19), c19666xfd6e2f33.f271635y5);
                    if (c19666xfd6e2f33.f271628x5 == c19666xfd6e2f33.f271635y5 && c19666xfd6e2f33.f271494b4.getPaddingBottom() == 0) {
                        c19666xfd6e2f33.f271494b4.setPadding(round, round, round, round2);
                    }
                }
                int i27 = c19666xfd6e2f33.f271628x5;
                int i28 = c19666xfd6e2f33.f271635y5;
                int i29 = c19666xfd6e2f33.f271541j5;
                c19666xfd6e2f33.A(false);
                c19666xfd6e2f33.f271541j5 = lineCount;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e eVar = c19666xfd6e2f33.N3;
            if (1 == eVar.f256933x) {
                eVar.f256932w = 1;
            }
            if (c19666xfd6e2f33.f271523g4.getVisibility() == 0 && c19666xfd6e2f33.f271531h6) {
                java.lang.String obj = editable.toString();
                c19666xfd6e2f33.f271531h6 = false;
                c19666xfd6e2f33.f271525g6 = obj;
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
