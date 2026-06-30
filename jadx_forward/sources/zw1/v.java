package zw1;

/* loaded from: classes9.dex */
public class v implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0 f558356a;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0 activityC13142x725f2ac0) {
        this.f558356a = activityC13142x725f2ac0;
    }

    @Override // db5.a1
    /* renamed from: onFinish */
    public boolean mo26039x42fe6352(java.lang.CharSequence charSequence) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0 activityC13142x725f2ac0 = this.f558356a;
        if (K0) {
            activityC13142x725f2ac0.f177913g = "";
            activityC13142x725f2ac0.W6();
        } else {
            activityC13142x725f2ac0.f177913g = charSequence.toString();
            activityC13142x725f2ac0.W6();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new zw1.u(this), 200L);
        return true;
    }
}
