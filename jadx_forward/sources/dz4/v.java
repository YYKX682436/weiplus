package dz4;

/* loaded from: classes12.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f326966d;

    public v(dz4.j0 j0Var) {
        this.f326966d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ih0.p pVar = this.f326966d.f326842a;
        if (pVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onNoteTriggerFloatWindow: holder null");
            return;
        }
        dz4.y1 a17 = ((ez4.u) pVar).a();
        a17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a17.f326997b, "handleTriggerFloatWindow: enter=true");
        cz4.f fVar = a17.f326998c;
        if (fVar != null) {
            fVar.A(true, 2);
        }
    }
}
