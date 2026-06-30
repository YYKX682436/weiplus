package qw3;

/* loaded from: classes9.dex */
public class o1 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65 f448719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 f448720b;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 activityC17109x265f5377, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65 c17100xa183cf65) {
        this.f448720b = activityC17109x265f5377;
        this.f448719a = c17100xa183cf65;
    }

    @Override // db5.a1
    /* renamed from: onFinish */
    public boolean mo26039x42fe6352(java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65 c17100xa183cf65 = this.f448719a;
        java.lang.String str = c17100xa183cf65.f238009m;
        if ((str == null && charSequence == null) || (str != null && str.equals(charSequence))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitSelectPayeeUI", "no change: %s, %s", c17100xa183cf65.f238009m, charSequence);
            return true;
        }
        java.lang.String str2 = c17100xa183cf65.f238003d;
        java.lang.String str3 = "" + ((java.lang.Object) charSequence);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377.f238071q;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 activityC17109x265f5377 = this.f448720b;
        activityC17109x265f5377.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitSelectPayeeUI", "do modify remark: %s", str3);
        activityC17109x265f5377.m83099x5406100e(new ow3.h(str2, str3), true);
        return true;
    }
}
