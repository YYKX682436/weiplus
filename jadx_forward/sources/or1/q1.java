package or1;

/* loaded from: classes9.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or1.s1 f429088d;

    public q1(or1.s1 s1Var) {
        this.f429088d = s1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        or1.s1 s1Var = this.f429088d;
        android.widget.TextView textView = (android.widget.TextView) s1Var.f429106f.findViewById(com.p314xaae8f345.mm.R.id.f565767dh3);
        if (s1Var.f429106f.f175563e != null && textView != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(s1Var.f429106f.f175564f, true);
            if (n17 == null || !n17.r2()) {
                s1Var.f429106f.f175563e.setVisibility(8);
                textView.setVisibility(0);
            } else if (s1Var.f429106f.f175562d.getCount() <= 0) {
                s1Var.f429106f.f175563e.setVisibility(8);
                textView.setVisibility(0);
            } else {
                s1Var.f429106f.f175563e.setVisibility(0);
                textView.setVisibility(8);
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12982x2657907a activityC12982x2657907a = s1Var.f429106f;
                activityC12982x2657907a.f175563e.setAdapter((android.widget.ListAdapter) activityC12982x2657907a.f175562d);
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12982x2657907a activityC12982x2657907a2 = s1Var.f429106f;
                activityC12982x2657907a2.f175563e.setOnItemClickListener(activityC12982x2657907a2.f175565g);
            }
        }
        s1Var.notifyDataSetChanged();
    }
}
