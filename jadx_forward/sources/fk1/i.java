package fk1;

/* loaded from: classes8.dex */
public final class i implements m33.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 f344808a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6) {
        this.f344808a = activityC12732x6baffca6;
    }

    @Override // m33.i1
    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameRecordShareUI", "hy: share to friend err! " + str);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.U6(this.f344808a, 1, 1, str);
    }

    @Override // m33.i1
    /* renamed from: onCancel */
    public void mo74225x3d6f0539() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameRecordShareUI", "hy: share to friend cancel!");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.U6(this.f344808a, 1, 2, "user cancel");
    }

    @Override // m33.i1
    /* renamed from: onSuccess */
    public void mo74226xe05b4124() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameRecordShareUI", "hy: share to friend done");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.f171713p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6 = this.f344808a;
        activityC12732x6baffca6.getClass();
        activityC12732x6baffca6.runOnUiThread(new fk1.o(1, activityC12732x6baffca6));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.U6(activityC12732x6baffca6, 1, 0, "ok");
    }
}
