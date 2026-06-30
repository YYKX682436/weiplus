package te2;

/* loaded from: classes14.dex */
public final class f2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.l2 f499528d;

    public f2(te2.l2 l2Var) {
        this.f499528d = l2Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = it.what;
        te2.l2 l2Var = this.f499528d;
        if (i17 != l2Var.f499726f) {
            return true;
        }
        x91.h hVar = ((je2.i) l2Var.f499724d.a(je2.i.class)).f380768f;
        if (hVar != null) {
            hVar.f534184e.f534196a = x91.j.Stopped;
        }
        x91.h hVar2 = ((je2.i) l2Var.f499724d.a(je2.i.class)).f380768f;
        if (hVar2 != null) {
            hVar2.h();
        }
        x91.h hVar3 = ((je2.i) l2Var.f499724d.a(je2.i.class)).f380768f;
        if (hVar3 != null) {
            hVar3.i();
        }
        x91.h hVar4 = ((je2.i) l2Var.f499724d.a(je2.i.class)).f380768f;
        if (hVar4 != null) {
            hVar4.f534187h = null;
        }
        te2.c2 c2Var = l2Var.f499729i;
        if (c2Var == null) {
            return true;
        }
        te2.a3 a3Var = (te2.a3) c2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a3Var.f499393h, "onLinkError errCode:" + it.arg1);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f409261m, a3Var.a());
        return true;
    }
}
