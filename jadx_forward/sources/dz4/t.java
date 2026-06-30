package dz4;

/* loaded from: classes12.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f326939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326941f;

    public t(dz4.j0 j0Var, java.lang.String str, java.lang.String str2) {
        this.f326939d = j0Var;
        this.f326940e = str;
        this.f326941f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz4.j0 j0Var = this.f326939d;
        if (j0Var.f326842a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onClickAddFavorite: holder null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", "onClickAddFavorite: chatMsgId " + this.f326940e + ", chatMsgTalker " + this.f326941f);
        dz4.v0 v0Var = (dz4.v0) ((jz5.n) ((ez4.u) j0Var.f326842a).f339494t).mo141623x754a37bb();
        ez4.u uVar = (ez4.u) v0Var.f326967a;
        java.lang.ref.WeakReference weakReference = uVar.f339477c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        java.lang.String str = v0Var.f326968b;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleAddFav: context null");
            return;
        }
        dz4.i iVar = uVar.f339475a;
        if (!(iVar instanceof dz4.f)) {
            if (iVar instanceof dz4.h) {
                hz4.s.a(activity, ((dz4.h) iVar).f326801m);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        long j17 = 0;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            j17 = java.lang.Long.parseLong(((dz4.f) iVar).f326765m);
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        dz4.f fVar = (dz4.f) iVar;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.i(c5303xc75d2f73, j17, fVar.f326766n);
        c5303xc75d2f73.e();
        int i17 = c5303xc75d2f73.f135624h.f87966a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleAddFav: ret " + i17 + ", chat msgId " + j17 + " msgTalker " + fVar.f326766n);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.g(i17, 37, activity, new dz4.u0(v0Var));
    }
}
