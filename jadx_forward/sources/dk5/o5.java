package dk5;

/* loaded from: classes9.dex */
public class o5 implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f316310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 f316312c;

    public o5(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str) {
        this.f316312c = activityC22573x19a79d99;
        this.f316310a = c11286x34a5504;
        this.f316311b = str;
    }

    @Override // n13.x
    public void a(boolean z17, java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99 = this.f316312c;
        if (z17) {
            activityC22573x19a79d99.f292569y = bundle.getBoolean("is_group_to_do");
            activityC22573x19a79d99.Y6(this.f316310a, str, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.r(26);
        } else {
            com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.U6(activityC22573x19a79d99);
        }
        java.lang.String str2 = this.f316311b;
        if (str2.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.h(str2);
    }
}
