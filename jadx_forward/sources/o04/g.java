package o04;

/* loaded from: classes4.dex */
public class g implements o04.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f423441a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f423442b = jz5.h.b(o04.f.f423440d);

    public g(int i17) {
        this.f423441a = i17;
    }

    public void a(java.lang.String fromKey, java.lang.String toKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromKey, "fromKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toKey, "toKey");
        jz5.g gVar = this.f423442b;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) ((java.util.HashMap) ((jz5.n) gVar).mo141623x754a37bb()).get(fromKey);
        if (fVar != null) {
            ((java.util.HashMap) ((jz5.n) gVar).mo141623x754a37bb()).put(toKey, fVar);
        }
    }

    public void b(java.lang.String key, com.p314xaae8f345.mm.p2495xc50a8b8b.f value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        ((java.util.HashMap) ((jz5.n) this.f423442b).mo141623x754a37bb()).put(key, value);
    }
}
