package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public class v9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17416xb325f68b f243170d;

    public v9(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17416xb325f68b activityC17416xb325f68b) {
        this.f243170d = activityC17416xb325f68b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17416xb325f68b.f241898m;
        this.f243170d.getClass();
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.b wi6 = f21.r0.wi();
        wi6.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingBgInfoStorage", "getAll() called");
        l75.k0 k0Var = wi6.f340374d;
        android.database.Cursor B = k0Var.B("select chattingbginfo.username,chattingbginfo.bgflag,chattingbginfo.path,chattingbginfo.reserved1,chattingbginfo.reserved2,chattingbginfo.reserved3,chattingbginfo.reserved4 from chattingbginfo  ", null);
        if (B == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsChattingBackgroundUI", "applyToAll : cursor is null");
            return;
        }
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.j0 Bi = f21.r0.Bi();
        if (B.moveToFirst()) {
            while (!B.isAfterLast()) {
                java.lang.String string = B.getString(0);
                B.getInt(1);
                B.getString(2);
                B.getString(3);
                B.getString(4);
                B.getInt(5);
                B.getInt(6);
                com.p314xaae8f345.mm.vfs.w6.h(Bi.s0(string == null ? "" : string, true));
                if (string == null) {
                    string = "";
                }
                com.p314xaae8f345.mm.vfs.w6.h(Bi.s0(string, false));
                B.moveToNext();
            }
        }
        B.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingBgInfoStorage", "deleteAll() called");
        if (k0Var.mo70514xb06685ab("chattingbginfo", null, null) > 0) {
            wi6.m145262xf35bbb4();
        }
    }
}
