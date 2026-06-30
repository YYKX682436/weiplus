package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes.dex */
public class y implements android.text.InputFilter {
    public y(int i17) {
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        int i28;
        if (charSequence == null || charSequence.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextByteLengthInputFilter", "skip delete case");
            return null;
        }
        int i29 = i27 - i19;
        if (spanned != null && spanned.toString().getBytes().length >= 75 && i29 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextByteLengthInputFilter", "ignore exceed case: %s", java.lang.Integer.valueOf(spanned.toString().getBytes().length));
            return "";
        }
        int length = charSequence.toString().getBytes().length;
        int length2 = spanned != null ? spanned.toString().getBytes().length : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextByteLengthInputFilter", "source length: %s, dest length: %s", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(length2));
        if (i29 == 0) {
            i28 = length + length2;
        } else {
            int length3 = spanned.subSequence(i19, i27).toString().getBytes().length;
            i28 = (length + length2) - length3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextByteLengthInputFilter", "replace byte length: %s", java.lang.Integer.valueOf(length3));
        }
        if (i28 <= 75) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextByteLengthInputFilter", "exceed max byte length: %s %s", java.lang.Integer.valueOf(i28), 75);
        return "";
    }
}
