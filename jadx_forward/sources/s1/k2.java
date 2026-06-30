package s1;

/* loaded from: classes14.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final s1.n2 f483559a;

    /* renamed from: b, reason: collision with root package name */
    public s1.q0 f483560b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f483561c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f483562d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f483563e;

    public k2(s1.n2 slotReusePolicy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotReusePolicy, "slotReusePolicy");
        this.f483559a = slotReusePolicy;
        this.f483561c = new s1.j2(this);
        this.f483562d = new s1.h2(this);
        this.f483563e = new s1.i2(this);
    }

    public final s1.q0 a() {
        s1.q0 q0Var = this.f483560b;
        if (q0Var != null) {
            return q0Var;
        }
        throw new java.lang.IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final s1.g2 b(java.lang.Object obj, yz5.p content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        s1.q0 a17 = a();
        a17.b();
        if (!a17.f483599f.containsKey(obj)) {
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) a17.f483601h;
            java.lang.Object obj2 = linkedHashMap.get(obj);
            if (obj2 == null) {
                obj2 = a17.d(obj);
                u1.w wVar = a17.f483594a;
                if (obj2 != null) {
                    int indexOf = ((o0.f) wVar.o()).indexOf(obj2);
                    int i17 = ((o0.f) wVar.o()).f423377d.f423385f;
                    wVar.f505226q = true;
                    wVar.B(indexOf, i17, 1);
                    wVar.f505226q = false;
                    a17.f483604k++;
                } else {
                    int i18 = ((o0.f) wVar.o()).f423377d.f423385f;
                    u1.w wVar2 = new u1.w(true);
                    wVar.f505226q = true;
                    wVar.t(i18, wVar2);
                    wVar.f505226q = false;
                    a17.f483604k++;
                    obj2 = wVar2;
                }
                linkedHashMap.put(obj, obj2);
            }
            a17.c((u1.w) obj2, obj, content);
        }
        return new s1.o0(a17, obj);
    }
}
