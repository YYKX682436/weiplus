package zw1;

/* loaded from: classes15.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f558282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f558283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558284f;

    public o4(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, ww1.b3 b3Var, int i17) {
        this.f558284f = activityC13149x63b02cb3;
        this.f558282d = b3Var;
        this.f558283e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ww1.x2 x2Var = this.f558282d.N;
        int i17 = this.f558283e;
        x2Var.a(i17);
        this.f558284f.y7(i17);
    }
}
