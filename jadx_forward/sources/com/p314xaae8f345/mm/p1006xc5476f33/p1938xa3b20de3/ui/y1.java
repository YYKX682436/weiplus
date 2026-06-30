package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class y1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 f234297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38) {
        super(false);
        this.f234297d = activityC16764xd1ab6b38;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e;
        if (view.getId() == com.p314xaae8f345.mm.R.id.peu || view.getId() == com.p314xaae8f345.mm.R.id.pau || view.getId() == com.p314xaae8f345.mm.R.id.paw) {
            int id6 = view.getId();
            com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = this.f234297d;
            if (id6 == com.p314xaae8f345.mm.R.id.peu && (c16759xaa786f9e = activityC16764xd1ab6b38.R1) != null && c16759xaa786f9e.e()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "offlineAlertView is showing");
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e2 = activityC16764xd1ab6b38.R1;
            if ((c16759xaa786f9e2 == null || !c16759xaa786f9e2.e()) && currentTimeMillis - activityC16764xd1ab6b38.f234035d >= 400 && yo3.m.k()) {
                int i17 = activityC16764xd1ab6b38.f234037e;
                if (i17 == 2 || i17 == 1 || i17 == 7) {
                    return;
                }
                if (view.getId() == com.p314xaae8f345.mm.R.id.peu) {
                    activityC16764xd1ab6b38.f234077x1 = false;
                } else if (view.getId() == com.p314xaae8f345.mm.R.id.pau || view.getId() == com.p314xaae8f345.mm.R.id.paw) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13958, 4);
                    activityC16764xd1ab6b38.f234077x1 = true;
                }
                com.p314xaae8f345.mm.p2802xd031a825.ui.w wVar = activityC16764xd1ab6b38.O1;
                if (wVar != null) {
                    if (wVar != null) {
                        wVar.f295782e = activityC16764xd1ab6b38.f234059p1;
                        wVar.f295779b = activityC16764xd1ab6b38.f234045i;
                        wVar.f295780c = activityC16764xd1ab6b38.f234051m;
                        db5.d5 d5Var = wVar.f295785h;
                        if (d5Var != null && d5Var.isShowing()) {
                            wVar.d();
                        }
                    }
                    activityC16764xd1ab6b38.O1.c(view, activityC16764xd1ab6b38.f234077x1);
                }
                activityC16764xd1ab6b38.f234035d = currentTimeMillis;
            }
        }
    }
}
