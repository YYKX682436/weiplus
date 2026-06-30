package qr3;

/* loaded from: classes9.dex */
public class b0 implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f447611a;

    public b0(android.app.Activity activity) {
        this.f447611a = new java.lang.ref.WeakReference(activity);
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 activityC16884xbfaa2323;
        java.lang.ref.WeakReference weakReference = this.f447611a;
        if (weakReference.get() == null || (activityC16884xbfaa2323 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323) weakReference.get()) == null || activityC16884xbfaa2323.isFinishing() || activityC16884xbfaa2323.isDestroyed()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewBizInfoSettingUI", "initSubscribeMsgEntry getSubscribeMsgList onError errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC16884xbfaa2323.f235707d).m("contact_info_subscribe_msg", true);
    }

    @Override // e31.l
    public void e(java.lang.String str, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 activityC16884xbfaa2323;
        java.lang.ref.WeakReference weakReference = this.f447611a;
        if (weakReference.get() == null || (activityC16884xbfaa2323 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323) weakReference.get()) == null || activityC16884xbfaa2323.isFinishing() || activityC16884xbfaa2323.isDestroyed()) {
            return;
        }
        boolean z17 = c11158xe7d16ed5.f153324q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewBizInfoSettingUI", "initSubscribeMsgEntry getSubscribeMsgList onSuccess size: %d, showEntry: %b", java.lang.Integer.valueOf(c11158xe7d16ed5.f153318h.size()), java.lang.Boolean.valueOf(c11158xe7d16ed5.f153323p));
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC16884xbfaa2323.f235707d).m("contact_info_subscribe_msg", !z17);
        activityC16884xbfaa2323.f235720t = c11158xe7d16ed5;
    }
}
