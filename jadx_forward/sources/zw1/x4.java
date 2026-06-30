package zw1;

/* loaded from: classes5.dex */
public class x4 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ov f558380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558381b;

    public x4(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, r45.ov ovVar) {
        this.f558381b = activityC13149x63b02cb3;
        this.f558380a = ovVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public void a() {
        new android.os.Handler().postDelayed(new zw1.w4(this), 200L);
        r45.wf5 wf5Var = this.f558380a.f464070h;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558381b;
        activityC13149x63b02cb3.U6(wf5Var, null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = activityC13149x63b02cb3.E;
        if (z2Var == null || !z2Var.h()) {
            return;
        }
        activityC13149x63b02cb3.E.B();
        activityC13149x63b02cb3.E = null;
    }
}
