package zw1;

/* loaded from: classes15.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Toast f558346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vf5 f558347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.o90 f558348f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 f558349g;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7, android.widget.Toast toast, r45.vf5 vf5Var, r45.o90 o90Var) {
        this.f558349g = activityC13144xce1cfbb7;
        this.f558346d = toast;
        this.f558347e = vf5Var;
        this.f558348f = o90Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f558346d.cancel();
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7 = this.f558349g;
        r45.vf5 vf5Var = this.f558347e;
        if (vf5Var != null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7.f177918e2;
            activityC13144xce1cfbb7.r7(vf5Var);
        }
        r45.o90 o90Var = this.f558348f;
        if (o90Var != null) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7.f177918e2;
            activityC13144xce1cfbb7.s7(o90Var);
        }
    }
}
