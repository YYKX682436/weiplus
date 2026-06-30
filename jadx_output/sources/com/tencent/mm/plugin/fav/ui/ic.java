package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class ic implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.jc f101186d;

    public ic(com.tencent.mm.plugin.fav.ui.jc jcVar) {
        this.f101186d = jcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.d().n() == 6 || gm0.j1.d().n() == 4) {
            return;
        }
        com.tencent.mm.plugin.fav.ui.jc jcVar = this.f101186d;
        com.tencent.mm.plugin.fav.ui.nc ncVar = jcVar.f101210d;
        if (ncVar.f101302d == 1) {
            com.tencent.mm.ui.MMActivity mMActivity = ncVar.f101304f;
            db5.e1.s(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490500wu), "");
            jcVar.f101210d.b();
        }
    }
}
