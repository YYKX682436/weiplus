package h71;

/* loaded from: classes15.dex */
public final class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11391x705f5af4 f360926d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11391x705f5af4 activityC11391x705f5af4) {
        this.f360926d = activityC11391x705f5af4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11391x705f5af4 activityC11391x705f5af4 = this.f360926d;
        ((cy1.a) rVar).Cj("view_clk", dialogInterface, kz5.c1.k(new jz5.l("view_id", "delete_device_confirm_alert_cancel_btn"), new jz5.l("is_login", java.lang.Integer.valueOf(activityC11391x705f5af4.f154733h ? 1 : 0)), new jz5.l("is_main_device", java.lang.Integer.valueOf(activityC11391x705f5af4.W6() ? 1 : 0))), 28198);
    }
}
