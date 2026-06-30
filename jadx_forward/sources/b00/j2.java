package b00;

/* loaded from: classes16.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final b00.j2 f98231d = new b00.j2();

    public j2() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        t00.s0[] s0VarArr = {new w00.a(), new w00.b()};
        int d17 = kz5.b1.d(2);
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (int i17 = 0; i17 < 2; i17++) {
            t00.s0 s0Var = s0VarArr[i17];
            linkedHashMap.put(s0Var.a().f495846a, s0Var);
        }
        return linkedHashMap;
    }
}
