package zw1;

/* loaded from: classes5.dex */
public class t4 implements ww1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ov f558337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f558338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558339c;

    public t4(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, r45.ov ovVar, ww1.a3 a3Var) {
        this.f558339c = activityC13149x63b02cb3;
        this.f558337a = ovVar;
        this.f558338b = a3Var;
    }

    @Override // ww1.w
    public void a(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558339c;
        android.view.View view2 = activityC13149x63b02cb3.F;
        if (view2 != null) {
            ((android.widget.LinearLayout) activityC13149x63b02cb3.F.findViewById(com.p314xaae8f345.mm.R.id.c3j)).setVisibility(4);
            ((android.widget.LinearLayout) activityC13149x63b02cb3.F.findViewById(com.p314xaae8f345.mm.R.id.c3h)).setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdy, ((android.widget.TextView) activityC13149x63b02cb3.F.findViewById(com.p314xaae8f345.mm.R.id.c3m)).getText()));
        }
        ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.c3j)).setVisibility(0);
        r45.ov ovVar = this.f558337a;
        if (i17 == ovVar.f464068f.size()) {
            activityC13149x63b02cb3.L = true;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.c3l);
            linearLayout.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 c22695xac2d47d6 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.c3k);
            c22695xac2d47d6.postDelayed(new zw1.r4(this, c22695xac2d47d6), 50L);
            activityC13149x63b02cb3.E.b(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c22695xac2d47d6.getText().toString()));
            if (!activityC13149x63b02cb3.K) {
                activityC13149x63b02cb3.f177967J = activityC13149x63b02cb3.E.f293591g.getMeasuredHeight();
            }
        } else {
            activityC13149x63b02cb3.L = false;
            android.view.View view3 = activityC13149x63b02cb3.F;
            ww1.a3 a3Var = this.f558338b;
            if (view3 != null) {
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view3.findViewById(com.p314xaae8f345.mm.R.id.c3l);
                if (linearLayout2.getVisibility() == 0) {
                    linearLayout2.setVisibility(8);
                    linearLayout2.clearFocus();
                    linearLayout2.postDelayed(new zw1.s4(this), 200L);
                }
                ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.c3h)).setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdz, a3Var.P));
            }
            activityC13149x63b02cb3.E.b(true);
            a3Var.P = ((r45.hg5) ovVar.f464068f.get(i17)).f457672d;
            if (!activityC13149x63b02cb3.K) {
                activityC13149x63b02cb3.I = activityC13149x63b02cb3.E.f293591g.getMeasuredHeight();
            }
        }
        activityC13149x63b02cb3.F = view;
    }
}
