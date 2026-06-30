package sc3;

/* loaded from: classes7.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487972d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sc3.k1 k1Var) {
        super(0);
        this.f487972d = k1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.k7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.r4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.r4.class))).wi(this.f487972d.D, "magicbrush");
        int d17 = kz5.b1.d(kz5.d0.q(wi6, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj : wi6) {
            linkedHashMap.put((java.lang.String) obj, obj);
        }
        return linkedHashMap;
    }
}
