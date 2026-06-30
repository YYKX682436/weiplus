package yw3;

/* loaded from: classes4.dex */
public final class z3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yw3.z3 f548476d = new yw3.z3();

    public z3() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        yw3.p pVar = new yw3.p();
        pVar.z0("test_" + c01.id.c());
        pVar.A0("这是一条测试消息");
        pVar.I0(c01.id.c());
        c06.d dVar = c06.e.f119249d;
        pVar.D0(dVar.c());
        pVar.G0((short) 1);
        pVar.F0(dVar.f());
        pVar.y0(dVar.i());
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(yw3.d.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(yw3.d.class);
        }
        com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.U6(((yw3.d) a17).P6(yw3.k.class), pVar, false, false, false, 14, null);
        return jz5.f0.f384359a;
    }
}
