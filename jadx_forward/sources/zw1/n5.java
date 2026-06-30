package zw1;

/* loaded from: classes15.dex */
public class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Toast f558274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.o90 f558275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558276f;

    public n5(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, android.widget.Toast toast, r45.o90 o90Var) {
        this.f558276f = activityC13149x63b02cb3;
        this.f558274d = toast;
        this.f558275e = o90Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f558274d.cancel();
        r45.o90 o90Var = this.f558275e;
        if (o90Var != null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.Q;
            this.f558276f.L7(o90Var, 0, false, null);
        }
    }
}
