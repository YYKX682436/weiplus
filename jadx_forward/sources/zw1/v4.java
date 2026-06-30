package zw1;

/* loaded from: classes5.dex */
public class v4 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ov f558361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558362b;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, r45.ov ovVar) {
        this.f558362b = activityC13149x63b02cb3;
        this.f558361a = ovVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public void a() {
        r45.wf5 wf5Var = this.f558361a.f464069g;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558362b;
        activityC13149x63b02cb3.U6(wf5Var, null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = activityC13149x63b02cb3.E;
        if (z2Var != null && z2Var.h()) {
            activityC13149x63b02cb3.E.B();
            activityC13149x63b02cb3.E = null;
        }
        new android.os.Handler().postDelayed(new zw1.u4(this), 200L);
    }
}
