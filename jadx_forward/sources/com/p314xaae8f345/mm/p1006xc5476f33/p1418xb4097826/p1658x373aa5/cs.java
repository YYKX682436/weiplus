package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes12.dex */
public final class cs implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public int f213395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15378x7431170f f213396e;

    public cs(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15378x7431170f c15378x7431170f) {
        this.f213396e = c15378x7431170f;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f213395d = charSequence != null ? charSequence.length() : 0;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        android.text.Editable m62469x7df21d69;
        java.lang.String str;
        android.text.Editable m62469x7df21d692;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15378x7431170f c15378x7431170f = this.f213396e;
        if (c15378x7431170f.getAllowEmptyLine()) {
            return;
        }
        if ((charSequence != null ? charSequence.length() : 0) < this.f213395d) {
            int selectionEnd = c15378x7431170f.getSelectionEnd() - 1 > 0 ? c15378x7431170f.getSelectionEnd() : 0;
            m62469x7df21d69 = c15378x7431170f.m62469x7df21d69();
            if (selectionEnd < m62469x7df21d69.length()) {
                java.util.Iterator it = r26.n0.Q(m62469x7df21d69).iterator();
                int i27 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    str = (java.lang.String) it.next();
                    if (i27 <= selectionEnd && selectionEnd <= str.length() + i27) {
                        break;
                    } else {
                        i27 += str.length() + 1;
                    }
                }
                if (i27 >= m62469x7df21d69.length()) {
                    return;
                }
                int length = str.length() + i27;
                int length2 = m62469x7df21d69.length() - 1;
                if (length > length2) {
                    length = length2;
                }
                if (r26.n0.u0(str).toString().length() == 0) {
                    m62469x7df21d692 = c15378x7431170f.m62469x7df21d69();
                    c15378x7431170f.setText(r26.n0.X(m62469x7df21d692, i27, length + 1));
                    int i28 = i27 - 1;
                    c15378x7431170f.mo81549xf579a34a(i28 > 0 ? i28 : 0);
                }
            }
        }
    }
}
