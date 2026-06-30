package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public enum b {
    ;

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(android.widget.EditText editText, pl1.i iVar) {
        if (editText == 0 || iVar == null) {
            return;
        }
        java.lang.Float f17 = iVar.f356597k;
        if (f17 != null && f17.floatValue() != editText.getTextSize()) {
            editText.setTextSize(iVar.f356597k.floatValue());
        }
        java.lang.Integer num = iVar.f356596j;
        if (num != null) {
            editText.setTextColor(num.intValue());
        }
        if (iVar.f356595i == null) {
            editText.setBackground(null);
        } else if (editText.getBackground() == null || !(editText.getBackground() instanceof android.graphics.drawable.ColorDrawable) || ((android.graphics.drawable.ColorDrawable) editText.getBackground()).getColor() != iVar.f356595i.intValue()) {
            editText.setBackground(new android.graphics.drawable.ColorDrawable(iVar.f356595i.intValue()));
        }
        java.lang.String str = iVar.f356601o;
        pl1.d dVar = pl1.d.NORMAL;
        if (str != null) {
            if (android.text.TextUtils.isEmpty(str)) {
                editText.setHint("");
            } else {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(iVar.f356601o);
                int length = iVar.f356601o.length();
                pl1.d dVar2 = (pl1.d) pl1.e.a(iVar.f356602p, pl1.d.class);
                if (dVar2 == null) {
                    dVar2 = dVar;
                }
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(dVar2.f356586d), 0, length, 18);
                if (iVar.f356604r != null) {
                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(iVar.f356604r.intValue()), 0, length, 18);
                }
                if (iVar.f356603q != null) {
                    spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan(iVar.f356603q.intValue(), false), 0, length, 18);
                }
                editText.setHint(spannableStringBuilder);
            }
        }
        java.lang.String str2 = iVar.f356599m;
        if (str2 != null) {
            pl1.d dVar3 = (pl1.d) pl1.e.a(str2, pl1.d.class);
            if (dVar3 != null) {
                dVar = dVar3;
            }
            android.graphics.Typeface create = android.graphics.Typeface.create("sans-serif", dVar.f356586d);
            if (create != null) {
                editText.setTypeface(create);
            }
        }
        pl1.h hVar = (pl1.h) pl1.e.a(iVar.f356594h, pl1.h.class);
        pl1.h hVar2 = pl1.h.LEFT;
        if (hVar == null) {
            hVar = hVar2;
        }
        com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var = (com.tencent.mm.plugin.appbrand.widget.input.t4) editText;
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            ((com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var).j(3);
        } else if (ordinal == 1) {
            ((com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var).j(5);
        } else if (ordinal == 2) {
            ((com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var).j(1);
        }
        editText.setVisibility(com.tencent.mm.plugin.appbrand.widget.input.m5.d(iVar.f356606t) ? 8 : 0);
        ((com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var).setFixed(com.tencent.mm.plugin.appbrand.widget.input.m5.d(iVar.f356610x));
    }

    public static void b(android.widget.EditText editText, int i17, int i18) {
        if (editText == null || editText.getEditableText() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandInputCommStyleHelper", "applySelection, invalid input %s", editText);
            return;
        }
        if (i17 <= -2) {
            i17 = editText.getSelectionStart();
        } else if (i17 == -1 || i17 > editText.getText().length()) {
            i17 = editText.getText().length();
        }
        if (i18 <= -2) {
            i18 = editText.getSelectionEnd();
        } else if (i18 == -1 || i18 > editText.getText().length()) {
            i18 = editText.getText().length();
        }
        if (i17 > i18) {
            i17 = i18;
        }
        android.text.Selection.removeSelection(editText.getEditableText());
        editText.setSelection(i17, i18);
    }

    public static com.tencent.mm.plugin.appbrand.widget.input.b valueOf(java.lang.String str) {
        android.support.v4.media.f.a(java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.widget.input.b.class, str));
        return null;
    }
}
