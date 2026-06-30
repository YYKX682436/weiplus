package zw1;

/* loaded from: classes15.dex */
public class t3 implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f558335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558336b;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, int i17) {
        this.f558336b = activityC13149x63b02cb3;
        this.f558335a = i17;
    }

    @Override // h45.i
    /* renamed from: onKindaBusinessCallback */
    public void mo24858x44dbb8f3(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("key_error_msg");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra);
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558336b;
        if (K0 || !stringExtra.equals("ok")) {
            activityC13149x63b02cb3.N = 2;
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.Q;
        activityC13149x63b02cb3.G7(intent);
        activityC13149x63b02cb3.B7(this.f558335a);
    }
}
