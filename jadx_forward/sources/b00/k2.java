package b00;

/* loaded from: classes16.dex */
public final class k2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final b00.k2 f98236d = new b00.k2();

    public k2() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        t00.r0[] r0VarArr = {new t00.x0(), new t00.h1(), new t00.d()};
        int d17 = kz5.b1.d(3);
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (int i17 = 0; i17 < 3; i17++) {
            t00.r0 r0Var = r0VarArr[i17];
            linkedHashMap.put(r0Var.a().f495846a, r0Var);
        }
        return linkedHashMap;
    }
}
