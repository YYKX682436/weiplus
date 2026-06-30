package zw1;

/* loaded from: classes9.dex */
public class w2 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5 f558369a;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5 activityC13148x64d0f1c5) {
        this.f558369a = activityC13148x64d0f1c5;
    }

    @Override // db5.a1
    /* renamed from: onFinish */
    public boolean mo26039x42fe6352(java.lang.CharSequence charSequence) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5 activityC13148x64d0f1c5 = this.f558369a;
        if (K0) {
            activityC13148x64d0f1c5.f177963g = "";
            activityC13148x64d0f1c5.X6();
        } else {
            activityC13148x64d0f1c5.f177963g = charSequence.toString();
            activityC13148x64d0f1c5.X6();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new zw1.v2(this), 200L);
        return true;
    }
}
