package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class a0 implements com.p314xaae8f345.mm.p648x55baa833.ui.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f145554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 f145555b;

    public a0(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5, boolean z17) {
        this.f145555b = activityC10332x8a1129f5;
        this.f145554a = z17;
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.b1
    public void a(android.widget.CheckBox checkBox) {
        checkBox.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.z(this));
        checkBox.setChecked(this.f145555b.f145225g);
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.b1
    public void b(android.widget.CheckBox checkBox) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var;
        boolean isChecked = checkBox.isChecked();
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = this.f145555b;
        if (isChecked) {
            if (!activityC10332x8a1129f5.B || (a3Var = activityC10332x8a1129f5.F) == null || a3Var.A0().size() <= 2) {
                activityC10332x8a1129f5.g7(this.f145554a, activityC10332x8a1129f5.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hqk));
                return;
            } else {
                activityC10332x8a1129f5.h7(0, activityC10332x8a1129f5.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hqk));
                return;
            }
        }
        java.lang.String str = activityC10332x8a1129f5.A;
        activityC10332x8a1129f5.r7();
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a f17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(str).f(str, false);
        activityC10332x8a1129f5.U = f17;
        f17.f273781d = new com.p314xaae8f345.mm.p648x55baa833.ui.g0(activityC10332x8a1129f5);
        f17.b();
    }
}
