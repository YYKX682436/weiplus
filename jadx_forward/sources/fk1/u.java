package fk1;

/* loaded from: classes8.dex */
public final class u implements m33.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 f344825a;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6) {
        this.f344825a = activityC12732x6baffca6;
    }

    @Override // m33.i1
    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAGameRecordShareUI", "stash error");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6 = this.f344825a;
        activityC12732x6baffca6.runOnUiThread(new fk1.s(activityC12732x6baffca6, str));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.U6(activityC12732x6baffca6, 3, 1, str);
    }

    @Override // m33.i1
    /* renamed from: onCancel */
    public void mo74225x3d6f0539() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameRecordShareUI", "stash cancel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.U6(this.f344825a, 3, 2, "user cancel");
    }

    @Override // m33.i1
    /* renamed from: onSuccess */
    public void mo74226xe05b4124() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameRecordShareUI", "stash success");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6 = this.f344825a;
        activityC12732x6baffca6.runOnUiThread(new fk1.t(activityC12732x6baffca6));
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.f171713p;
        activityC12732x6baffca6.runOnUiThread(new fk1.o(3, activityC12732x6baffca6));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.U6(activityC12732x6baffca6, 3, 0, "ok");
    }
}
