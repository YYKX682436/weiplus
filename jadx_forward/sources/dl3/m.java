package dl3;

/* loaded from: classes13.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.i f316870d;

    public m(dl3.i iVar) {
        this.f316870d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerMgr", "stopAudioDelayRunnable, run");
        dl3.i iVar = this.f316870d;
        java.util.Iterator it = iVar.f316846f.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (iVar.p(str) == 0) {
                iVar.y(str);
            }
        }
    }
}
