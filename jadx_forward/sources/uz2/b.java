package uz2;

/* loaded from: classes.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1699xe125c5cf.ActivityC15538x252a13b6 f513689d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1699xe125c5cf.ActivityC15538x252a13b6 activityC15538x252a13b6) {
        this.f513689d = activityC15538x252a13b6;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "[%s]Dialog audio click cancel", java.lang.Integer.valueOf(hashCode()));
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1699xe125c5cf.ActivityC15538x252a13b6.f218776i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1699xe125c5cf.ActivityC15538x252a13b6 activityC15538x252a13b6 = this.f513689d;
        activityC15538x252a13b6.setResult(1, activityC15538x252a13b6.V6(4, 90008, "fail"));
        activityC15538x252a13b6.finish();
    }
}
