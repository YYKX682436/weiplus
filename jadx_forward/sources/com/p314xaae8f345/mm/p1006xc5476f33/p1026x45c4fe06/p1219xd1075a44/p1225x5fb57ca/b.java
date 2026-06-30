package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public enum b {
    ;

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(android.widget.EditText editText, pl1.i iVar) {
        if (editText == 0 || iVar == null) {
            return;
        }
        java.lang.Float f17 = iVar.f438130k;
        if (f17 != null && f17.floatValue() != editText.getTextSize()) {
            editText.setTextSize(iVar.f438130k.floatValue());
        }
        java.lang.Integer num = iVar.f438129j;
        if (num != null) {
            editText.setTextColor(num.intValue());
        }
        if (iVar.f438128i == null) {
            editText.setBackground(null);
        } else if (editText.getBackground() == null || !(editText.getBackground() instanceof android.graphics.drawable.ColorDrawable) || ((android.graphics.drawable.ColorDrawable) editText.getBackground()).getColor() != iVar.f438128i.intValue()) {
            editText.setBackground(new android.graphics.drawable.ColorDrawable(iVar.f438128i.intValue()));
        }
        java.lang.String str = iVar.f438134o;
        pl1.d dVar = pl1.d.NORMAL;
        if (str != null) {
            if (android.text.TextUtils.isEmpty(str)) {
                editText.setHint("");
            } else {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(iVar.f438134o);
                int length = iVar.f438134o.length();
                pl1.d dVar2 = (pl1.d) pl1.e.a(iVar.f438135p, pl1.d.class);
                if (dVar2 == null) {
                    dVar2 = dVar;
                }
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(dVar2.f438119d), 0, length, 18);
                if (iVar.f438137r != null) {
                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(iVar.f438137r.intValue()), 0, length, 18);
                }
                if (iVar.f438136q != null) {
                    spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan(iVar.f438136q.intValue(), false), 0, length, 18);
                }
                editText.setHint(spannableStringBuilder);
            }
        }
        java.lang.String str2 = iVar.f438132m;
        if (str2 != null) {
            pl1.d dVar3 = (pl1.d) pl1.e.a(str2, pl1.d.class);
            if (dVar3 != null) {
                dVar = dVar3;
            }
            android.graphics.Typeface create = android.graphics.Typeface.create("sans-serif", dVar.f438119d);
            if (create != null) {
                editText.setTypeface(create);
            }
        }
        pl1.h hVar = (pl1.h) pl1.e.a(iVar.f438127h, pl1.h.class);
        pl1.h hVar2 = pl1.h.LEFT;
        if (hVar == null) {
            hVar = hVar2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4 t4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4) editText;
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) t4Var).j(3);
        } else if (ordinal == 1) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) t4Var).j(5);
        } else if (ordinal == 2) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) t4Var).j(1);
        }
        editText.setVisibility(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.d(iVar.f438139t) ? 8 : 0);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) t4Var).m53467x52faa832(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.d(iVar.f438143x));
    }

    public static void b(android.widget.EditText editText, int i17, int i18) {
        if (editText == null || editText.getEditableText() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandInputCommStyleHelper", "applySelection, invalid input %s", editText);
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

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b m53445xdce0328(java.lang.String str) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(java.lang.Enum.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b.class, str));
        return null;
    }
}
