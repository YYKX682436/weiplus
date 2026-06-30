package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes12.dex */
public class g3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a f156084d;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a) {
        this.f156084d = activityC11497x3bc191a;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a = this.f156084d;
        s71.b bVar = activityC11497x3bc191a.f156024g;
        if (bVar != null) {
            activityC11497x3bc191a.setResult(0, t71.a.a(bVar));
        } else {
            activityC11497x3bc191a.setResult(0);
        }
        activityC11497x3bc191a.finish();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSelectAddrUI", "[setResult] Cancel, Back");
        return true;
    }
}
