package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes5.dex */
public class k implements android.content.DialogInterface.OnCancelListener {
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 activityC19307x65cbeee9) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CreateAvatarUI", "showProgressDlg onCancel exp: %s ", e17.getLocalizedMessage());
        }
    }
}
