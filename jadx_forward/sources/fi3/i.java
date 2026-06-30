package fi3;

/* loaded from: classes10.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi3.j f344542d;

    public i(fi3.j jVar) {
        this.f344542d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        fi3.j jVar = this.f344542d;
        if (jVar.f344548f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "delay to stop decoder");
            try {
                jVar.f344548f.y();
                jVar.f344548f.q();
                jVar.f344548f = null;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightRemuxMediaCodecDecoder", e17, "delay to stop decoder error: %s", e17.getMessage());
            }
        }
    }
}
