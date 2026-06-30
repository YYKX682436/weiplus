package vz3;

/* loaded from: classes15.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final vz3.r f523241d = new vz3.r();

    public r() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        vz3.t tVar = vz3.t.f523243a;
        zs5.a0 type = (zs5.a0) ((jz5.n) vz3.t.f523244b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            obj = dz3.i.G;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            obj = new vz3.q();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsQueueDispatcher", "ScanGoodsQueueDispatcher.impl: ".concat(obj.getClass().getSimpleName()));
        return obj;
    }
}
