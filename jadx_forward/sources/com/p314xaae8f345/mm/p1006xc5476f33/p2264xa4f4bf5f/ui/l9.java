package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class l9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f255585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj4.h f255586e;

    public l9(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078, mj4.h hVar) {
        this.f255585d = activityC18639xf6f98078;
        this.f255586e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f255585d;
        if (activityC18639xf6f98078.e7().f436507f != 1 || com.p314xaae8f345.mm.vfs.w6.j(activityC18639xf6f98078.d7().f255433b)) {
            activityC18639xf6f98078.t7(activityC18639xf6f98078.d7().f255433b, activityC18639xf6f98078.d7().f255435d);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "mediaFilePath not exist,rerun download");
        mj4.h hVar = this.f255586e;
        activityC18639xf6f98078.v7(hVar != null ? ((mj4.k) hVar).j() : null, null);
    }
}
