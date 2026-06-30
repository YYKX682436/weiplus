package ww1;

/* loaded from: classes13.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer[] f531707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f531708e;

    public e1(android.media.MediaPlayer[] mediaPlayerArr, java.lang.Object obj) {
        this.f531707d = mediaPlayerArr;
        this.f531708e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f531707d[0] = new to.g();
        try {
            synchronized (this.f531708e) {
                this.f531708e.notify();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.F2fRcvVoiceListener", e17, "", new java.lang.Object[0]);
        }
    }
}
