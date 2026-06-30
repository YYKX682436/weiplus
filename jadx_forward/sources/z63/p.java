package z63;

/* loaded from: classes5.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab f551969d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab) {
        this.f551969d = activityC16081x2d23fdab;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "back_dialot ok");
        x63.p Ai = ((t63.e) i95.n0.c(t63.e.class)).Ai();
        com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab = this.f551969d;
        y63.a aVar = activityC16081x2d23fdab.B;
        int i18 = activityC16081x2d23fdab.H;
        if (i18 == 3 || i18 == 4) {
            i18 = 3;
        }
        Ai.g(aVar, i18, 2, activityC16081x2d23fdab.F);
        activityC16081x2d23fdab.finish();
    }
}
