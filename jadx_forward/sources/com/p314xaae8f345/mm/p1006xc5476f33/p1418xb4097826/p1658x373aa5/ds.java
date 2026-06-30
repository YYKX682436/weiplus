package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes12.dex */
public final class ds implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15378x7431170f f213480d;

    public ds(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15378x7431170f c15378x7431170f) {
        this.f213480d = c15378x7431170f;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        android.text.Editable m62469x7df21d69;
        android.text.Editable m62469x7df21d692;
        android.text.Editable m62469x7df21d693;
        if (!(keyEvent != null && keyEvent.getKeyCode() == 66)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15378x7431170f c15378x7431170f = this.f213480d;
        if (c15378x7431170f.getAllowEmptyLine()) {
            return false;
        }
        int selectionEnd = c15378x7431170f.getSelectionEnd();
        m62469x7df21d69 = c15378x7431170f.m62469x7df21d69();
        if (selectionEnd < m62469x7df21d69.length()) {
            if (selectionEnd <= 0) {
                return true;
            }
            return !(c15378x7431170f.getText().charAt(selectionEnd - 1) != '\n' && c15378x7431170f.getText().charAt(selectionEnd) != '\n');
        }
        m62469x7df21d692 = c15378x7431170f.m62469x7df21d69();
        if (selectionEnd != m62469x7df21d692.length()) {
            return false;
        }
        m62469x7df21d693 = c15378x7431170f.m62469x7df21d69();
        return r26.n0.u0((java.lang.String) kz5.n0.i0(r26.n0.Q(m62469x7df21d693))).toString().length() == 0;
    }
}
