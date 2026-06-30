package j03;

/* loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f378560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j03.d f378561f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f378562g;

    public c(java.lang.String str, yz5.l lVar, j03.d dVar, long j17) {
        this.f378559d = str;
        this.f378560e = lVar;
        this.f378561f = dVar;
        this.f378562g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f378559d;
        j03.d dVar = this.f378561f;
        yz5.l lVar = this.f378560e;
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str);
            if (r6Var.m() && r6Var.h()) {
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var.r(), r6Var.m82467xfb82e301() + ".zip");
                kk.x.a(r6Var, false, r6Var2.o());
                if (r6Var2.m() && r6Var2.h()) {
                    com.p314xaae8f345.mm.app.i3.c(r6Var2.o(), (int) this.f378562g, gm0.j1.b().h(), null, null, new j03.b(dVar, r6Var2, lVar));
                    return;
                }
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("Archived file not exists: " + r6Var2.o())))));
                j03.d.a(dVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterUploadPlugin", "Archived file not exists");
                return;
            }
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("Target file not exists: " + str)))));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6))));
            j03.d.a(dVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FlutterUploadPlugin", th6, "Failure.", new java.lang.Object[0]);
        }
    }
}
