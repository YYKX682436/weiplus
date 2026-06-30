package db5;

/* loaded from: classes15.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f310008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.s2 f310009e;

    public q2(db5.s2 s2Var, int i17) {
        this.f310009e = s2Var;
        this.f310008d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.s2 s2Var = this.f310009e;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21498xf966a151 c21498xf966a151 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21498xf966a151) s2Var.f310036a.f278931d.getChildAt(r1.getChildCount() - 1);
        int childCount = this.f310008d - (s2Var.f310036a.f278931d.getChildCount() >> 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGridPaper", "move up, old index[%d], new index[%d]", java.lang.Integer.valueOf(s2Var.f310036a.f278931d.getChildCount() - 1), java.lang.Integer.valueOf(childCount));
        s2Var.f310036a.f278931d.removeViewAt(r2.getChildCount() - 1);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21497x5c99c26 c21497x5c99c26 = s2Var.f310036a;
        c21498xf966a151.b(childCount, c21497x5c99c26.f278945u, c21497x5c99c26.f278944t, c21497x5c99c26.f278933f);
        s2Var.f310036a.f278931d.addView(c21498xf966a151, 0);
        s2Var.f310036a.f278931d.a(s2Var.f310036a.f278931d.getChildCount() >> 1);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21497x5c99c26.a(s2Var.f310036a, -1);
    }
}
