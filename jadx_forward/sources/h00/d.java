package h00;

/* loaded from: classes8.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final h00.d f359348d = new h00.d();

    public d() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        h00.w[] wVarArr = {new h00.j(), new h00.i(), new h00.l(), new h00.k()};
        int d17 = kz5.b1.d(4);
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (int i17 = 0; i17 < 4; i17++) {
            h00.w wVar = wVarArr[i17];
            linkedHashMap.put(java.lang.Integer.valueOf(wVar.a().ordinal()), wVar);
        }
        return linkedHashMap;
    }
}
