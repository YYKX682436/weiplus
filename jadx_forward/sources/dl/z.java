package dl;

/* loaded from: classes10.dex */
public final class z extends dl.b {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f316695q = "MicroMsg.FilterArtist";

    @Override // dl.b
    public void A(java.lang.String editId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editId, "editId");
    }

    @Override // dl.b
    public void C() {
    }

    @Override // dl.b
    public dl.a m() {
        return dl.a.FILTER;
    }

    @Override // dl.b
    public void t() {
        super.t();
        um.l lVar = (um.l) d();
        if (lVar == null) {
            return;
        }
        lVar.f510222g = ((l45.n) this.f316572a).f397998f;
    }

    @Override // dl.b
    public void v(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        um.l lVar = (um.l) d();
        if (lVar != null) {
            lVar.M(canvas, false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f316695q, "lxl artist onDeadDraw");
    }

    @Override // dl.b
    public void y(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        um.l lVar = (um.l) d();
        if (lVar != null) {
            lVar.M(canvas, false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f316695q, "lxl artist draw");
    }
}
