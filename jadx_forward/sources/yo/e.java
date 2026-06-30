package yo;

/* loaded from: classes12.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {
    public e(yo.f fVar, long j17, java.lang.String str) {
        super(j17, str);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        while (true) {
            java.lang.String W = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.os.Process.myPid());
            if (W != null) {
                return W;
            }
            try {
                java.lang.Thread.sleep(100L);
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ProfileFactoryImpl", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
