package eg2;

/* loaded from: classes3.dex */
public final class o implements eg2.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eg2.p f334137a;

    public o(eg2.p pVar) {
        this.f334137a = pVar;
    }

    public void a(java.lang.Exception exc) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HD task failed: ");
        sb6.append(exc != null ? exc.getMessage() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderCoverHDTaskPlugin", sb6.toString());
        eg2.p pVar = this.f334137a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = pVar.f334143n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        pVar.getClass();
    }

    public void b(java.lang.String localPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localPath, "localPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "HD task success: ".concat(localPath));
        eg2.p pVar = this.f334137a;
        pVar.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = pVar.f334143n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        te2.m3.f499757a.a(te2.j3.f499665e, pVar.f334141i == 2 ? te2.l3.f499734e : te2.l3.f499733d, pVar.f334146q > 0 ? java.lang.System.currentTimeMillis() - pVar.f334146q : 0L);
        yz5.l lVar = pVar.f334144o;
        if (lVar != null) {
            lVar.mo146xb9724478(localPath);
        }
    }
}
