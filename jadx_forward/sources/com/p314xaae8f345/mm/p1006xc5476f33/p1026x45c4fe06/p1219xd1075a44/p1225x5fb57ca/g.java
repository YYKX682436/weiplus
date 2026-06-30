package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class g extends al5.j2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.i f172987d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.i iVar) {
        this.f172987d = iVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String trim;
        int length;
        int i17;
        if (editable != null && (length = (trim = editable.toString().trim()).length()) > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.i iVar = this.f172987d;
            int selectionEnd = iVar.f173018q.getSelectionEnd();
            boolean z17 = '\b' == iVar.f173018q.m53465xfe6f04ef();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(length);
            int i18 = 0;
            int i19 = -1;
            for (int i27 = 0; i27 < length; i27++) {
                char charAt = trim.charAt(i27);
                if (z17 && selectionEnd - 1 == i27) {
                    if (!java.lang.Character.isDigit(charAt) || 3 != i18 || (i17 = i27 + 1) >= length || !java.lang.Character.isDigit(trim.charAt(i17))) {
                        if (!java.lang.Character.isDigit(charAt) && i18 == 0) {
                            i19 = sb6.length();
                        }
                    }
                } else if (-1 == i19 && selectionEnd == i27) {
                    i19 = sb6.length();
                }
                if (java.lang.Character.isDigit(charAt)) {
                    sb6.append(charAt);
                    i18++;
                    if (4 == i18) {
                        int i28 = i27 + 1;
                        if (i28 < length && java.lang.Character.isDigit(trim.charAt(i28))) {
                            sb6.append(' ');
                        }
                        i18 = 0;
                    }
                } else if (i18 == 0) {
                    sb6.append(charAt);
                }
            }
            java.lang.String sb7 = sb6.toString();
            if (-1 == i19) {
                i19 = sb7.length();
            }
            int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l4.f173071a;
            if (trim.equals(sb7)) {
                return;
            }
            iVar.f173018q.p();
            editable.clear();
            editable.append((java.lang.CharSequence) sb7);
            iVar.f173018q.setSelection(i19);
            iVar.f173018q.t();
        }
    }
}
