package zw1;

/* loaded from: classes5.dex */
public class q4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558298a;

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3) {
        this.f558298a = activityC13149x63b02cb3;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiApplyQRcode，cgiBack.errType：%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar2.f152148a), java.lang.Integer.valueOf(fVar2.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558298a;
        if (activityC13149x63b02cb3.isFinishing() || activityC13149x63b02cb3.isDestroyed() || (fVar = fVar2.f152151d) == null) {
            return null;
        }
        if (fVar2.f152148a == 0 && fVar2.f152149b == 0) {
            r45.ov ovVar = (r45.ov) fVar;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = activityC13149x63b02cb3.E;
            if ((z2Var == null || !z2Var.h()) && activityC13149x63b02cb3.f177968d != 2) {
                ww1.a3 l76 = activityC13149x63b02cb3.l7(1);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC13149x63b02cb3, 1, 3, false);
                activityC13149x63b02cb3.E = z2Var2;
                z2Var2.f293591g.setFocusable(false);
                activityC13149x63b02cb3.E.m(ovVar.f464069g.f470668d, ovVar.f464070h.f470668d);
                android.widget.TextView textView = new android.widget.TextView(activityC13149x63b02cb3);
                textView.setPadding(i65.a.b(activityC13149x63b02cb3, 24), i65.a.b(activityC13149x63b02cb3, 40), i65.a.b(activityC13149x63b02cb3, 24), i65.a.b(activityC13149x63b02cb3, 24));
                textView.setTextSize(1, i65.a.q(activityC13149x63b02cb3.mo55332x76847179()) * 17.0f);
                textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
                textView.setTextColor(activityC13149x63b02cb3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                textView.setText(ovVar.f464066d);
                activityC13149x63b02cb3.E.t(textView);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4(activityC13149x63b02cb3, null);
                ww1.y yVar = new ww1.y(activityC13149x63b02cb3, ovVar.f464068f);
                yVar.f531888e = ovVar.f464067e;
                yVar.f531891h = activityC13149x63b02cb3;
                c1163xf1deaba4.setFocusable(false);
                c1163xf1deaba4.mo7960x6cab2c8d(yVar);
                c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(activityC13149x63b02cb3));
                c1163xf1deaba4.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
                activityC13149x63b02cb3.E.j(c1163xf1deaba4);
                yVar.f531890g = new zw1.t4(activityC13149x63b02cb3, ovVar, l76);
                zw1.v4 v4Var = new zw1.v4(activityC13149x63b02cb3, ovVar);
                zw1.x4 x4Var = new zw1.x4(activityC13149x63b02cb3, ovVar);
                activityC13149x63b02cb3.E.b(false);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var3 = activityC13149x63b02cb3.E;
                z2Var3.D = v4Var;
                z2Var3.E = x4Var;
                z2Var3.C();
                activityC13149x63b02cb3.I = activityC13149x63b02cb3.E.f293591g.getMeasuredHeight();
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
