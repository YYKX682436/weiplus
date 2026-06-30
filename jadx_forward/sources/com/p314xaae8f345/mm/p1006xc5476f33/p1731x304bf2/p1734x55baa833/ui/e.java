package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui;

/* loaded from: classes12.dex */
public class e implements u33.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15845x2a5edf3 f220372a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15845x2a5edf3 activityC15845x2a5edf3) {
        this.f220372a = activityC15845x2a5edf3;
    }

    @Override // u33.i
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameImagePreviewUI", "percent:%d", java.lang.Integer.valueOf(i17));
    }

    @Override // u33.i
    public void b(boolean z17, int i17, java.lang.String str, final java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameImagePreviewUI", "success:%b, errCode:%d, filePath:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), str2);
        this.f220372a.f220358m = false;
        if (z17 && com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.chatroom.ui.e$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.e.this;
                    eVar.getClass();
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15845x2a5edf3.f220351q;
                    eVar.f220372a.U6(str2, false);
                }
            });
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.f(this));
        }
    }
}
