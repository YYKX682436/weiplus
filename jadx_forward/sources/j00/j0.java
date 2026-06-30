package j00;

/* loaded from: classes9.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378336d;

    public j0(java.lang.String str) {
        this.f378336d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            long p17 = c01.w9.p();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "clearEcsGiftRedLabel, currentTime:" + p17);
            w20.g wi6 = ((w20.d) ((c00.b3) i95.n0.c(c00.b3.class))).wi();
            java.lang.String str = this.f378336d;
            int i17 = h20.c.f359796a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "clearEcsGiftRedLabel, ret:" + wi6.z0(str, 0, 0, p17));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EcsGiftMsgService", e17, "clearEcsGiftRedLabel db error", new java.lang.Object[0]);
        }
    }
}
