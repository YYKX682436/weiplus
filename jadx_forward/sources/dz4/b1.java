package dz4;

/* loaded from: classes12.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f326702a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f326703b;

    public b1(ih0.p holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f326702a = holder;
        this.f326703b = "MicroMsg.WeNoteFlutterChatTopHelper";
    }

    public final void a(iz4.r rVar) {
        java.lang.String str = this.f326703b;
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "handlePinOnTop: topItem null");
            return;
        }
        ih0.p pVar = this.f326702a;
        java.lang.ref.WeakReference weakReference = ((ez4.u) pVar).f339477c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "handlePinOnTop: activity null");
            return;
        }
        long j17 = ((ez4.u) pVar).f339475a.f326826d;
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
        o72.g4 zj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj();
        if (F == null || !((s72.p0) zj6).T6(F)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "handlePinOnTop failed with localId=%d", java.lang.Long.valueOf(j17));
            return;
        }
        int i17 = F.f67643xc8a07680;
        ((s72.p0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj()).f485662o = true;
        ((s72.p0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj()).Y6(i17, true, new dz4.z0(rVar, activity));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handlePinOnTop send request with favId=%d", java.lang.Integer.valueOf(i17));
    }

    public final boolean b() {
        iz4.r a17 = mz4.b0.c().a();
        dz4.i iVar = ((ez4.u) this.f326702a).f339475a;
        boolean z17 = iVar instanceof dz4.f;
        if (a17 == null || a17.f377672d != z17) {
            return false;
        }
        if (!z17) {
            return a17.f377673e == iVar.f326826d;
        }
        dz4.f fVar = (dz4.f) iVar;
        return a17.f377674f == java.lang.Long.parseLong(fVar.f326765m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17.f377675g, fVar.f326766n);
    }
}
