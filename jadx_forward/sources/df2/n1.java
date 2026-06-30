package df2;

/* loaded from: classes3.dex */
public final class n1 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.v94 f312361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.p1 f312362b;

    public n1(r45.v94 v94Var, df2.p1 p1Var) {
        this.f312361a = v94Var;
        this.f312362b = p1Var;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorLiveReplaySettingController", "modifyLiveReplaySetting failed, errCode: " + i18 + ", errMsg: " + str);
        boolean z17 = str == null || str.length() == 0;
        df2.p1 p1Var = this.f312362b;
        if (z17) {
            pm0.v.X(new df2.l1(p1Var));
            return;
        }
        android.content.Context O6 = p1Var.O6();
        int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O6);
        e4Var.f293309c = str;
        e4Var.c();
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modifyLiveReplaySetting success, new setting:[");
        r45.v94 v94Var = this.f312361a;
        sb6.append(v94Var.m75933x41a8a7f2(0));
        sb6.append(',');
        sb6.append(v94Var.m75933x41a8a7f2(1));
        sb6.append(',');
        sb6.append(v94Var.m75933x41a8a7f2(2));
        sb6.append(',');
        sb6.append(v94Var.m75933x41a8a7f2(3));
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorLiveReplaySettingController", sb6.toString());
        pm0.v.X(new df2.m1(this.f312362b, v94Var));
    }
}
