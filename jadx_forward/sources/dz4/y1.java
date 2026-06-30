package dz4;

/* loaded from: classes12.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f326996a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f326997b;

    /* renamed from: c, reason: collision with root package name */
    public cz4.f f326998c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.e f326999d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f327000e;

    public y1(ih0.p holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f326996a = holder;
        this.f326997b = "MicroMsg.WeNoteFlutterFloatWindowHelper";
        this.f327000e = "";
    }

    public final boolean a(boolean z17) {
        java.lang.ref.WeakReference weakReference = ((ez4.u) this.f326996a).f339477c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        java.lang.String str = this.f326997b;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onActivityCreate: activity null");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.e eVar = this.f326999d;
        if (eVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
            if (eVar.c0(z17 ? 2 : 1, this.f327000e, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkInterceptFlutterNotePageExit: star");
                return true;
            }
        }
        cz4.f fVar = this.f326998c;
        if (fVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
            if (fVar.m0(z17 ? 2 : 1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkInterceptFlutterNotePageExit: float window");
                return true;
            }
        }
        return false;
    }
}
