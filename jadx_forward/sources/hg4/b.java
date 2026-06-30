package hg4;

/* loaded from: classes11.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2250x30b64fa4.ActivityC18543xcf2786cd f362924d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2250x30b64fa4.ActivityC18543xcf2786cd activityC18543xcf2786cd) {
        this.f362924d = activityC18543xcf2786cd;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        zf4.l wi6 = zf4.l.wi();
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2250x30b64fa4.ActivityC18543xcf2786cd activityC18543xcf2786cd = this.f362924d;
        if (wi6 != null) {
            wi6.Ni(activityC18543xcf2786cd.f253973d);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.I4(((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145049b)) {
            activityC18543xcf2786cd.finish();
        } else {
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(new android.content.Intent().putExtra("Chat_User", activityC18543xcf2786cd.f253973d), activityC18543xcf2786cd);
            activityC18543xcf2786cd.finish();
        }
    }
}
