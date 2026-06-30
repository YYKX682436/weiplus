package tl;

/* loaded from: classes12.dex */
public class m0 implements java.lang.Runnable {
    public m0(tl.p0 p0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoice.Recorder", "start record timeout");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(357L, 51L, 1L, true);
        if (!tl.p0.f501600x) {
            if (o45.wf.f424566k) {
                g0Var.i("Record", "start record timeout", null);
            }
            g0Var.mo68477x336bdfd8(357L, 52L, 1L, true);
        }
        tl.p0.f501600x = true;
    }
}
