package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes15.dex */
public class e7 implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12168x62e4d433 f163322d;

    public e7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12168x62e4d433 c12168x62e4d433) {
        this.f163322d = c12168x62e4d433;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12168x62e4d433 c12168x62e4d433 = this.f163322d;
        java.lang.String string = (android.text.TextUtils.isEmpty(c12168x62e4d433.f163215s) || !c12168x62e4d433.f163215s.contains("video")) ? c12168x62e4d433.f163217u.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a2g) : c12168x62e4d433.f163217u.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a2m);
        android.app.Activity activity = c12168x62e4d433.f163217u;
        db5.e1.K(activity, true, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a2h, string), "", c12168x62e4d433.f163217u.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a2j), c12168x62e4d433.f163217u.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a2k), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c7(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d7(this));
        return true;
    }
}
