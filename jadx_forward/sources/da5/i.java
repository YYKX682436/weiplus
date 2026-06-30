package da5;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ da5.k f309339d;

    public i(da5.k kVar) {
        this.f309339d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f309339d.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRAffCheckerListener", "call doUpdateUDR");
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.a.f299062b.m();
        } catch (java.io.EOFException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UDRAffCheckerListener", e17, "", new java.lang.Object[0]);
        }
    }
}
