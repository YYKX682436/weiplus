package zw1;

/* loaded from: classes5.dex */
public class v1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 f558358a;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7) {
        this.f558358a = activityC13144xce1cfbb7;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7 = this.f558358a;
        if (activityC13144xce1cfbb7.isFinishing() || activityC13144xce1cfbb7.isDestroyed()) {
            return null;
        }
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            activityC13144xce1cfbb7.S1 = (r45.ov) fVar.f152151d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = activityC13144xce1cfbb7.P1;
            if (z2Var == null || !z2Var.h()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC13144xce1cfbb7, 1, 3, false);
                activityC13144xce1cfbb7.P1 = z2Var2;
                z2Var2.f293591g.setFocusable(false);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var3 = activityC13144xce1cfbb7.P1;
                r45.ov ovVar = activityC13144xce1cfbb7.S1;
                z2Var3.m(ovVar.f464069g.f470668d, ovVar.f464070h.f470668d);
                android.widget.TextView textView = new android.widget.TextView(activityC13144xce1cfbb7);
                textView.setPadding(i65.a.b(activityC13144xce1cfbb7, 24), i65.a.b(activityC13144xce1cfbb7, 40), i65.a.b(activityC13144xce1cfbb7, 24), i65.a.b(activityC13144xce1cfbb7, 24));
                textView.setTextSize(1, i65.a.q(activityC13144xce1cfbb7.mo55332x76847179()) * 17.0f);
                textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
                textView.setTextColor(activityC13144xce1cfbb7.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                textView.setText(activityC13144xce1cfbb7.S1.f464066d);
                activityC13144xce1cfbb7.P1.t(textView);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4(activityC13144xce1cfbb7, null);
                if (activityC13144xce1cfbb7.R1 == null) {
                    ww1.y yVar = new ww1.y(activityC13144xce1cfbb7, activityC13144xce1cfbb7.S1.f464068f);
                    activityC13144xce1cfbb7.R1 = yVar;
                    yVar.f531888e = activityC13144xce1cfbb7.S1.f464067e;
                    yVar.f531891h = activityC13144xce1cfbb7;
                }
                c1163xf1deaba4.setFocusable(false);
                c1163xf1deaba4.mo7960x6cab2c8d(activityC13144xce1cfbb7.R1);
                c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(activityC13144xce1cfbb7));
                c1163xf1deaba4.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
                activityC13144xce1cfbb7.P1.j(c1163xf1deaba4);
                activityC13144xce1cfbb7.R1.f531890g = new zw1.q0(activityC13144xce1cfbb7);
                zw1.s0 s0Var = new zw1.s0(activityC13144xce1cfbb7);
                zw1.u0 u0Var = new zw1.u0(activityC13144xce1cfbb7);
                activityC13144xce1cfbb7.P1.b(false);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var4 = activityC13144xce1cfbb7.P1;
                z2Var4.D = s0Var;
                z2Var4.E = u0Var;
                z2Var4.C();
                activityC13144xce1cfbb7.Y1 = activityC13144xce1cfbb7.P1.f293591g.getMeasuredHeight();
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
