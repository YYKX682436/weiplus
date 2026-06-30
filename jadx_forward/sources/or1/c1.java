package or1;

/* loaded from: classes9.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or1.f1 f429002d;

    public c1(or1.f1 f1Var) {
        this.f429002d = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        or1.f1 f1Var = this.f429002d;
        f1Var.q();
        android.widget.TextView textView = (android.widget.TextView) f1Var.f429025q.findViewById(com.p314xaae8f345.mm.R.id.f565767dh3);
        if (f1Var.f429025q.f175556e != null && textView != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f1Var.f429025q.f175558g, true);
            if (n17 == null || !n17.r2()) {
                f1Var.f429025q.f175556e.setVisibility(8);
                textView.setVisibility(0);
            } else if (f1Var.f429025q.f175555d.getCount() <= 0) {
                f1Var.f429025q.f175556e.setVisibility(8);
                textView.setVisibility(0);
            } else {
                f1Var.f429025q.f175556e.setVisibility(0);
                textView.setVisibility(8);
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12981xe277674e activityC12981xe277674e = f1Var.f429025q;
                activityC12981xe277674e.f175556e.setAdapter((android.widget.ListAdapter) activityC12981xe277674e.f175555d);
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12981xe277674e activityC12981xe277674e2 = f1Var.f429025q;
                activityC12981xe277674e2.f175556e.setOnItemClickListener(activityC12981xe277674e2.f175560i);
            }
        }
        f1Var.notifyDataSetChanged();
    }
}
