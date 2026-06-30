package xn5;

/* loaded from: classes13.dex */
public final class p0 {
    public p0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final void a(xn5.p0 p0Var) {
        p0Var.getClass();
        int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.x2c.C20833x3aa21623());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X2C", "updateX2COpenFlag exptFlag:true repairerFlag:" + h17);
        if (h17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X2C", "openX2C");
            xn5.q0.f537240f = true;
            yz5.a aVar = xn5.q0.f537242h;
            if (aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        if (h17 != 1) {
            if (h17 != 2) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X2C", "closeX2C");
            xn5.q0.f537240f = false;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X2C", "openX2C");
        xn5.q0.f537240f = true;
        yz5.a aVar2 = xn5.q0.f537242h;
        if (aVar2 != null) {
            aVar2.mo152xb9724478();
        }
    }

    public final xn5.f0 b() {
        xn5.f0 f0Var = xn5.q0.f537237c;
        return f0Var == null ? xn5.q0.f537239e : f0Var;
    }
}
