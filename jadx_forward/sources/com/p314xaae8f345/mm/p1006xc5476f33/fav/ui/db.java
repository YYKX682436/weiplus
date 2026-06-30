package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class db implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f182129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182131f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a f182132g;

    public db(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a, android.app.Dialog dialog, java.lang.String str, java.util.List list) {
        this.f182132g = activityC13579xef51058a;
        this.f182129d = dialog;
        this.f182130e = str;
        this.f182131f = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f182129d.dismiss();
        boolean a17 = com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20193x3d8621e2.f273747a.a();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13579xef51058a activityC13579xef51058a = this.f182132g;
        if (!a17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activityC13579xef51058a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, activityC13579xef51058a, null, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteIndexUI", "EnterChattingAfterTrans done config disabled");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.f(activityC13579xef51058a, this.f182130e, this.f182131f, true);
    }
}
