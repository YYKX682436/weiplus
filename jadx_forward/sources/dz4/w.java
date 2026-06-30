package dz4;

/* loaded from: classes12.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f326972d;

    public w(dz4.j0 j0Var) {
        this.f326972d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.e eVar;
        ih0.p pVar = this.f326972d.f326842a;
        if (pVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onNoteTriggerStar: holder null");
            return;
        }
        dz4.y1 a17 = ((ez4.u) pVar).a();
        java.lang.ref.WeakReference weakReference = ((ez4.u) a17.f326996a).f339477c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        java.lang.String str = a17.f326997b;
        if (activity == null || (eVar = a17.f326999d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "handleTriggerStar: err");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = eVar.f381610a;
        boolean z17 = !((!((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() || c16601x7ed0e40c == null) ? false : ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ri(c16601x7ed0e40c));
        java.lang.String title = z17 ? a17.f327000e : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleTriggerStar: toSelect " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.e eVar2 = a17.f326999d;
        if (eVar2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
            eVar2.A = title;
            eVar2.j();
            eVar2.B(z17);
        }
    }
}
