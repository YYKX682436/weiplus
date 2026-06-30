package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes5.dex */
public final class o9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI f289480d;

    public o9(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f289480d = openImKefuServiceConversationFmUI;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f289480d;
        if (itemId == 1) {
            java.lang.String str = openImKefuServiceConversationFmUI.f288936h;
            openImKefuServiceConversationFmUI.getClass();
            if (str == null || str.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenImKefuServiceConversationUI", "closeConversation talker invalid");
                return;
            }
            com.p314xaae8f345.mm.ui.p2731xc84c5534.k0.b(3, str, openImKefuServiceConversationFmUI.f288937i);
            android.app.Activity mo7438x76847179 = openImKefuServiceConversationFmUI.mo7438x76847179();
            android.app.Activity mo7438x768471792 = openImKefuServiceConversationFmUI.mo7438x76847179();
            java.lang.String string = mo7438x768471792 != null ? mo7438x768471792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.heo) : null;
            android.app.Activity mo7438x768471793 = openImKefuServiceConversationFmUI.mo7438x76847179();
            java.lang.String string2 = mo7438x768471793 != null ? mo7438x768471793.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hem) : null;
            android.app.Activity mo7438x768471794 = openImKefuServiceConversationFmUI.mo7438x76847179();
            db5.e1.B(mo7438x76847179, string, "", string2, mo7438x768471794 != null ? mo7438x768471794.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg) : null, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.c9(str, openImKefuServiceConversationFmUI), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
            return;
        }
        if (itemId != 2) {
            return;
        }
        java.lang.String str2 = openImKefuServiceConversationFmUI.f288936h;
        openImKefuServiceConversationFmUI.getClass();
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenImKefuServiceConversationUI", "deleteConversationAndMsg talker invalid");
            return;
        }
        com.p314xaae8f345.mm.ui.p2731xc84c5534.k0.b(1, str2, openImKefuServiceConversationFmUI.f288937i);
        android.app.Activity mo7438x768471795 = openImKefuServiceConversationFmUI.mo7438x76847179();
        android.app.Activity mo7438x768471796 = openImKefuServiceConversationFmUI.mo7438x76847179();
        java.lang.String string3 = mo7438x768471796 != null ? mo7438x768471796.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fc_) : null;
        android.app.Activity mo7438x768471797 = openImKefuServiceConversationFmUI.mo7438x76847179();
        java.lang.String string4 = mo7438x768471797 != null ? mo7438x768471797.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0) : null;
        android.app.Activity mo7438x768471798 = openImKefuServiceConversationFmUI.mo7438x76847179();
        db5.e1.B(mo7438x768471795, string3, "", string4, mo7438x768471798 != null ? mo7438x768471798.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg) : null, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e9(str2, openImKefuServiceConversationFmUI), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
    }
}
