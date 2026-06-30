package or1;

/* loaded from: classes9.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12982x2657907a f429108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gb3 f429109e;

    public t1(or1.u1 u1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12982x2657907a activityC12982x2657907a, r45.gb3 gb3Var) {
        this.f429108d = activityC12982x2657907a;
        this.f429109e = gb3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12982x2657907a activityC12982x2657907a = this.f429108d;
        try {
            java.util.LinkedList linkedList = this.f429109e.f456604e.f457768u;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12982x2657907a.f175561m;
            activityC12982x2657907a.T6(linkedList);
            activityC12982x2657907a.f175562d.notifyDataSetChanged();
        } catch (java.lang.Throwable unused) {
        }
    }
}
