package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class x4 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI f64646d;

    public x4(com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI) {
        this.f64646d = modRemarkRoomNameUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI = this.f64646d;
        android.widget.Button button = modRemarkRoomNameUI.f63821h;
        java.lang.String trim = modRemarkRoomNameUI.f63817d.getText().toString().trim();
        boolean z17 = false;
        if (trim.equals(modRemarkRoomNameUI.f63827q)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemarkRoomNameUI", "new name equals old name");
        } else {
            java.lang.String f17 = ip.c.f();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
                if (trim.matches(".*[" + f17 + "].*")) {
                    java.lang.String string = modRemarkRoomNameUI.getString(com.tencent.mm.R.string.g1m, f17);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        modRemarkRoomNameUI.f63822i.setVisibility(8);
                    } else {
                        modRemarkRoomNameUI.f63822i.setVisibility(0);
                        modRemarkRoomNameUI.f63822i.setText(string);
                    }
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0("")) {
                modRemarkRoomNameUI.f63822i.setVisibility(8);
            } else {
                modRemarkRoomNameUI.f63822i.setVisibility(0);
                modRemarkRoomNameUI.f63822i.setText("");
            }
            z17 = true;
        }
        button.setEnabled(z17);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        int length = charSequence.length();
        com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI = this.f64646d;
        if (length > 0) {
            modRemarkRoomNameUI.f63817d.setEllipsize(null);
        } else {
            modRemarkRoomNameUI.f63817d.setEllipsize(android.text.TextUtils.TruncateAt.END);
        }
        boolean z17 = charSequence.length() > 0;
        int i27 = com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI.f63816r;
        modRemarkRoomNameUI.T6(z17);
    }
}
