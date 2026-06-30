package p61;

/* loaded from: classes5.dex */
public class k1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 f433834d;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 activityC11360x90d2d970) {
        this.f433834d = activityC11360x90d2d970;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 activityC11360x90d2d970 = this.f433834d;
        java.lang.String str = activityC11360x90d2d970.f154502o;
        if (str == null || str.equals("")) {
            return;
        }
        gm0.j1.d().g(new r61.f1(2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 activityC11360x90d2d9702 = this.f433834d;
        activityC11360x90d2d9702.f154503p = db5.e1.Q(activityC11360x90d2d9702, activityC11360x90d2d9702.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC11360x90d2d970.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), true, true, new p61.j1(this));
    }
}
