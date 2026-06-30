package sp;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp.b f492471d;

    public a(sp.b bVar) {
        this.f492471d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SafeDismissDialog", "run on hijack runnable");
            this.f492471d.f492472d.run();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SafeDismissDialog", "protect : " + e17.getMessage());
        }
    }
}
