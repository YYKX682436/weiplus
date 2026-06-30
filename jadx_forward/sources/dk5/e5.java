package dk5;

/* loaded from: classes9.dex */
public class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f316141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f316142f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 f316143g;

    public e5(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99, java.lang.String str, java.util.LinkedList linkedList, int i17) {
        this.f316143g = activityC22573x19a79d99;
        this.f316140d = str;
        this.f316141e = linkedList;
        this.f316142f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99 = this.f316143g;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC22573x19a79d99.f292557m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        activityC22573x19a79d99.b7(this.f316140d, this.f316141e, this.f316142f);
    }
}
