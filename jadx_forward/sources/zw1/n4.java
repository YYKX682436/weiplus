package zw1;

/* loaded from: classes15.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f558271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f558272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f558273f;

    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, ww1.b3 b3Var, ww1.a3 a3Var, int i17) {
        this.f558271d = b3Var;
        this.f558272e = a3Var;
        this.f558273f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ww1.x2 x2Var = this.f558271d.N;
        x2Var.f531880f.add((ww1.b0) ((java.util.LinkedList) this.f558272e.f531646w).get(this.f558273f));
    }
}
