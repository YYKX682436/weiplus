package dz4;

/* loaded from: classes12.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f326963a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f326964b;

    /* renamed from: c, reason: collision with root package name */
    public final dz4.r3 f326965c;

    public u3(ih0.p holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f326963a = holder;
        this.f326964b = java.util.Collections.synchronizedSet(new fz4.p());
        this.f326965c = new dz4.r3(this);
    }

    public final void a() {
        java.util.List S0;
        java.lang.ref.WeakReference weakReference;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.l lVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.l();
        lVar.f299231e = (int) hz4.b0.a().f367917c;
        lVar.f299233g[2] = true;
        hz4.b0 a17 = hz4.b0.a();
        lVar.f299230d = com.p314xaae8f345.mm.vfs.w6.j(a17.f367925k) ? a17.f367925k : "";
        boolean[] zArr = lVar.f299233g;
        zArr[1] = true;
        lVar.f299232f = "speex";
        zArr[3] = true;
        java.util.Set callbackSet = this.f326964b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackSet, "callbackSet");
        synchronized (callbackSet) {
            java.util.Set callbackSet2 = this.f326964b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackSet2, "callbackSet");
            S0 = kz5.n0.S0(callbackSet2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterRecordHelper", "stopRecordingAndSave: send callback " + S0.size());
        java.util.Iterator it = S0.iterator();
        while (true) {
            r4 = null;
            android.app.Activity activity = null;
            if (!it.hasNext()) {
                break;
            }
            dz4.g0 g0Var = (dz4.g0) ((dz4.p0) it.next());
            g0Var.getClass();
            ih0.p pVar = g0Var.f326784a.f326842a;
            if (pVar != null && (weakReference = ((ez4.u) pVar).f339477c) != null) {
                activity = (android.app.Activity) weakReference.get();
            }
            if (activity == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onRecordingEndEvent: activity null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", "onRecordingEndEvent: ready");
                ((ku5.t0) ku5.t0.f394148d).g(new dz4.e0(lVar, g0Var.f326784a));
            }
        }
        java.lang.ref.WeakReference weakReference2 = ((ez4.u) this.f326963a).f339477c;
        android.content.Context context = weakReference2 != null ? (android.app.Activity) weakReference2.get() : null;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = context instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) context : null;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.m81176xbd5f726b(true);
        }
    }
}
