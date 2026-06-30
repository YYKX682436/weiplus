package gq4;

/* loaded from: classes14.dex */
public class u implements java.lang.Runnable {
    public u(gq4.v vVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVoip", "makeCameraCache getCodecCountCache");
        uo.q qVar = uo.q.f511065a;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "initCodecCount start");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.media.MediaCodecList.getCodecCount();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginCamera", "initCodecCount end, duration : " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginCamera", "initCodecCount error");
        }
        uo.q.f511065a.e();
    }
}
