package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* loaded from: classes.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13354x79b4d90b f179903d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13354x79b4d90b activityC13354x79b4d90b) {
        this.f179903d = activityC13354x79b4d90b;
    }

    @Override // java.lang.Runnable
    public void run() {
        tg0.p1 p1Var = (tg0.p1) i95.n0.c(tg0.p1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13354x79b4d90b activityC13354x79b4d90b = this.f179903d;
        boolean wi6 = ((sg0.e2) p1Var).wi(activityC13354x79b4d90b.f179872o, 384);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).wi(a17, activityC13354x79b4d90b.f179872o, false, 384);
        a17.putExtra("ftsneedkeyboard", !wi6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2UI", "reportEntranceScene = %s", java.lang.Integer.valueOf(activityC13354x79b4d90b.f179872o));
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsInitToSearch", true);
        a17.putExtra("ftsNeedShowCamera", false);
        j45.l.y(activityC13354x79b4d90b.mo55332x76847179(), a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13054, java.lang.Integer.valueOf(activityC13354x79b4d90b.f179868h == 0 ? 0 : 1), 0, "");
    }
}
