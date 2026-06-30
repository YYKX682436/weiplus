package f93;

/* loaded from: classes.dex */
public class g4 implements k93.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 f341876a;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868) {
        this.f341876a = activityC16172xa598f868;
    }

    @Override // k93.b0
    public void a(db5.b7 b7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868 = this.f341876a;
        java.lang.String string = activityC16172xa598f868.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9h);
        java.lang.String string2 = this.f341876a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9d);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868.L;
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(activityC16172xa598f868);
        activityC16172xa598f868.f224831f = f5Var;
        f5Var.f291933e = activityC16172xa598f868;
        activityC16172xa598f868.f224831f.f();
        db5.f3 f3Var = new db5.f3(activityC16172xa598f868, false);
        activityC16172xa598f868.f224830e = f3Var;
        f3Var.A(48);
        activityC16172xa598f868.f224830e.l(new f93.h4(activityC16172xa598f868));
        db5.f3 f3Var2 = activityC16172xa598f868.f224830e;
        f3Var2.L.setText(string);
        f3Var2.M.setHint(string2);
        f3Var2.N.setOnClickListener(new db5.c3(f3Var2, new f93.i4(activityC16172xa598f868)));
        activityC16172xa598f868.f224830e.C();
        activityC16172xa598f868.f224830e.M.postDelayed(new f93.j4(activityC16172xa598f868), 100L);
    }
}
