package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class p8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f255705d;

    public p8(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078) {
        this.f255705d = activityC18639xf6f98078;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.g8 d76 = this.f255705d.d7();
        int i17 = this.f255705d.d7().f255435d;
        str = "";
        if (i17 == 1) {
            oj4.l lVar = oj4.l.f427351a;
            java.lang.String str2 = this.f255705d.d7().f255433b;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = "thumb_" + com.p314xaae8f345.mm.vfs.w6.p(str);
            com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
            str = lVar.b(str, new com.p314xaae8f345.mm.vfs.r6(lp0.b.h0("textstatus_publish"), str3), 60);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.UploadPackHelper", "[getSendThumbnail] compress path=" + str);
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f255705d;
            java.lang.String str4 = activityC18639xf6f98078.d7().f255433b;
            str = activityC18639xf6f98078.b7(str4 != null ? str4 : "");
        }
        d76.f255434c = str;
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.o8(this.f255705d));
    }
}
