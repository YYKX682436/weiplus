package p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final w0.h f91943a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f91944b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f91945c;

    /* renamed from: d, reason: collision with root package name */
    public p2.f f91946d;

    /* renamed from: e, reason: collision with root package name */
    public long f91947e;

    public k(w0.h saveableStateHolder, yz5.a itemProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(saveableStateHolder, "saveableStateHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemProvider, "itemProvider");
        this.f91943a = saveableStateHolder;
        this.f91944b = itemProvider;
        this.f91945c = new java.util.LinkedHashMap();
        this.f91946d = new p2.g(0.0f, 0.0f);
        this.f91947e = p2.d.b(0, 0, 0, 0, 15, null);
    }

    public final yz5.p a(int i17, java.lang.Object key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.Map map = this.f91945c;
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.j jVar = (p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.j) ((java.util.LinkedHashMap) map).get(key);
        java.lang.Object a17 = ((p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.l) this.f91944b.mo152xb9724478()).a(i17);
        if (jVar != null && ((java.lang.Number) ((n0.q4) jVar.f91940c).mo128745x754a37bb()).intValue() == i17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jVar.f91939b, a17)) {
            yz5.p pVar = jVar.f91941d;
            if (pVar != null) {
                return pVar;
            }
            u0.a c17 = u0.j.c(1403994769, true, new p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.i(jVar.f91942e, jVar));
            jVar.f91941d = c17;
            return c17;
        }
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.j jVar2 = new p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.j(this, i17, key, a17);
        map.put(key, jVar2);
        yz5.p pVar2 = jVar2.f91941d;
        if (pVar2 != null) {
            return pVar2;
        }
        u0.a c18 = u0.j.c(1403994769, true, new p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.i(jVar2.f91942e, jVar2));
        jVar2.f91941d = c18;
        return c18;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.j jVar = (p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.j) ((java.util.LinkedHashMap) this.f91945c).get(obj);
        if (jVar != null) {
            return jVar.f91939b;
        }
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.l lVar = (p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.l) this.f91944b.mo152xb9724478();
        java.lang.Integer num = (java.lang.Integer) lVar.b().get(obj);
        if (num != null) {
            return lVar.a(num.intValue());
        }
        return null;
    }
}
