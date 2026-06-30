package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes5.dex */
public class h1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19078xd7766fa3 f260919d;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19078xd7766fa3 activityC19078xd7766fa3) {
        this.f260919d = activityC19078xd7766fa3;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19078xd7766fa3 activityC19078xd7766fa3 = this.f260919d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "[onMenuItemClick] mIsKeyBoardShow：%s", java.lang.Boolean.valueOf(activityC19078xd7766fa3.f260790r));
        if (activityC19078xd7766fa3.f260790r) {
            activityC19078xd7766fa3.mo48674x36654fab();
            activityC19078xd7766fa3.f260790r = false;
        } else {
            activityC19078xd7766fa3.setResult(0);
            activityC19078xd7766fa3.finish();
        }
        return false;
    }
}
