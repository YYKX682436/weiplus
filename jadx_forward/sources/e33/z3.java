package e33;

/* loaded from: classes10.dex */
public class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f329096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e33.a4 f329097e;

    public z3(e33.a4 a4Var, java.lang.String str) {
        this.f329097e = a4Var;
        this.f329096d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        e33.a4 a4Var = this.f329097e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = a4Var.f328654c;
        e33.v2 v2Var = activityC15656x6f26b561.f220112e;
        java.util.ArrayList arrayList = activityC15656x6f26b561.f220116g;
        java.util.ArrayList arrayList2 = v2Var.f329034i;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        v2Var.h();
        v2Var.mo8343xced61ae5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b5612 = a4Var.f328654c;
        e33.h5 h5Var = (e33.h5) activityC15656x6f26b5612.f220114f.mo7946xf939df19();
        java.util.ArrayList arrayList3 = activityC15656x6f26b5612.f220116g;
        java.util.ArrayList arrayList4 = h5Var.f328793h;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        h5Var.m8146xced61ae5();
        activityC15656x6f26b5612.f220124m.clear();
        activityC15656x6f26b5612.f220124m.addAll(a4Var.f328652a);
        activityC15656x6f26b5612.Q1.Y0(activityC15656x6f26b5612.e7());
        activityC15656x6f26b5612.f220136w.setText(activityC15656x6f26b5612.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573715fj0));
        if (t21.d3.s() && (((i17 = activityC15656x6f26b5612.L) == 3 || i17 == 16) && activityC15656x6f26b5612.f220130q)) {
            activityC15656x6f26b5612.s7();
        } else {
            activityC15656x6f26b5612.f220137x.setVisibility(8);
        }
        if (activityC15656x6f26b5612.f220124m.contains(j33.d0.g(this.f329096d))) {
            return;
        }
        activityC15656x6f26b5612.D.performClick();
    }
}
