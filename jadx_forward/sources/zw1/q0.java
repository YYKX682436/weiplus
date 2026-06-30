package zw1;

/* loaded from: classes5.dex */
public class q0 implements ww1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 f558296a;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7) {
        this.f558296a = activityC13144xce1cfbb7;
    }

    @Override // ww1.w
    public void a(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7 = this.f558296a;
        android.view.View view2 = activityC13144xce1cfbb7.Q1;
        if (view2 != null) {
            ((android.widget.LinearLayout) activityC13144xce1cfbb7.Q1.findViewById(com.p314xaae8f345.mm.R.id.c3j)).setVisibility(4);
            ((android.widget.LinearLayout) activityC13144xce1cfbb7.Q1.findViewById(com.p314xaae8f345.mm.R.id.c3h)).setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdy, ((android.widget.TextView) activityC13144xce1cfbb7.Q1.findViewById(com.p314xaae8f345.mm.R.id.c3m)).getText()));
        }
        ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.c3j)).setVisibility(0);
        if (i17 == activityC13144xce1cfbb7.S1.f464068f.size()) {
            activityC13144xce1cfbb7.f177923b2 = true;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.c3l);
            linearLayout.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 c22695xac2d47d6 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.c3k);
            c22695xac2d47d6.postDelayed(new zw1.o0(this, c22695xac2d47d6), 50L);
            activityC13144xce1cfbb7.P1.b(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c22695xac2d47d6.getText().toString()));
            if (!activityC13144xce1cfbb7.f177922a2) {
                activityC13144xce1cfbb7.Z1 = activityC13144xce1cfbb7.P1.f293591g.getMeasuredHeight();
            }
        } else {
            activityC13144xce1cfbb7.f177923b2 = false;
            android.view.View view3 = activityC13144xce1cfbb7.Q1;
            if (view3 != null) {
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view3.findViewById(com.p314xaae8f345.mm.R.id.c3l);
                if (linearLayout2.getVisibility() == 0) {
                    linearLayout2.setVisibility(8);
                    linearLayout2.clearFocus();
                    linearLayout2.postDelayed(new zw1.p0(this), 200L);
                }
                ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.c3h)).setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdz, activityC13144xce1cfbb7.U1));
            }
            activityC13144xce1cfbb7.P1.b(true);
            activityC13144xce1cfbb7.U1 = ((r45.hg5) activityC13144xce1cfbb7.S1.f464068f.get(i17)).f457672d;
            if (!activityC13144xce1cfbb7.f177922a2) {
                activityC13144xce1cfbb7.Y1 = activityC13144xce1cfbb7.P1.f293591g.getMeasuredHeight();
            }
        }
        activityC13144xce1cfbb7.Q1 = view;
    }
}
