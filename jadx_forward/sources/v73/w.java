package v73;

/* loaded from: classes9.dex */
public class w implements qp5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6 f515283a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6 activityC16100x8f3665d6) {
        this.f515283a = activityC16100x8f3665d6;
    }

    @Override // qp5.t
    /* renamed from: onInputValidChange */
    public void mo26603x194c4a1(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6 activityC16100x8f3665d6 = this.f515283a;
            int i17 = activityC16100x8f3665d6.f223846q;
            if (i17 == 1) {
                activityC16100x8f3665d6.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayCheckPwdUI", "do get create token sign");
                activityC16100x8f3665d6.m83138x296ea477();
                r73.d dVar = new r73.d(activityC16100x8f3665d6.f223842m, activityC16100x8f3665d6.f223845p);
                dVar.K(activityC16100x8f3665d6);
                activityC16100x8f3665d6.m83099x5406100e(dVar, false);
            } else if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6.V6(activityC16100x8f3665d6);
            } else if (i17 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6.V6(activityC16100x8f3665d6);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HoneyPayCheckPwdUI", "unknown scene: %s", java.lang.Integer.valueOf(i17));
            }
            activityC16100x8f3665d6.mo48632xd46dd964();
        }
    }
}
