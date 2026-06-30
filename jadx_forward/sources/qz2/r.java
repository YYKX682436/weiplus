package qz2;

/* loaded from: classes9.dex */
public class r implements pz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a f449438d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a activityC15523xe4f09a5a) {
        this.f449438d = activityC15523xe4f09a5a;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a activityC15523xe4f09a5a = this.f449438d;
        activityC15523xe4f09a5a.a7(false);
        if (i17 != 0) {
            activityC15523xe4f09a5a.b7(-1, str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "cert ready and do openFP");
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a.W6(activityC15523xe4f09a5a);
        activityC15523xe4f09a5a.Z6();
    }
}
