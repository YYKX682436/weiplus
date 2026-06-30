package wj1;

/* loaded from: classes14.dex */
public class j0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 f528133d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5) {
        this.f528133d = activityC12702xc32382a5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5 = this.f528133d;
        r45.lc lcVar = activityC12702xc32382a5.f171072o.f463498w.f454797m;
        if (lcVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "authorize_wording is null");
            return null;
        }
        java.lang.String str = lcVar.f460830f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = lcVar.f460829e;
        java.lang.String str4 = str3 == null ? "" : str3;
        int measuredHeight = activityC12702xc32382a5.f171082y.f309383d.getMeasuredHeight();
        fl1.c0 c0Var = activityC12702xc32382a5.f171081x;
        if (c0Var == null) {
            return null;
        }
        c0Var.c(new db1.u(c0Var, str2, str4, activityC12702xc32382a5.mo55332x76847179(), measuredHeight, measuredHeight, new wj1.d0(activityC12702xc32382a5)));
        return null;
    }
}
