package z;

/* loaded from: classes13.dex */
public final class d1 implements z.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final z.c1 f550160a;

    public d1(z.c1 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f550160a = config;
    }

    /* renamed from: equals */
    public boolean m178148xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof z.d1) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f550160a, ((z.d1) obj).f550160a)) {
                return true;
            }
        }
        return false;
    }

    @Override // z.g0, z.p
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public z.c4 a(z.w2 converter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(converter, "converter");
        z.c1 c1Var = this.f550160a;
        java.util.Map map = c1Var.f550148b;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(map.size()));
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
            java.lang.Object key = entry.getKey();
            z.b1 b1Var = (z.b1) entry.getValue();
            b1Var.getClass();
            yz5.l convertToVector = ((z.x2) converter).f550406a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertToVector, "convertToVector");
            linkedHashMap.put(key, new jz5.l(convertToVector.mo146xb9724478(b1Var.f550126a), b1Var.f550127b));
        }
        int i17 = c1Var.f550147a;
        c1Var.getClass();
        return new z.c4(linkedHashMap, i17, 0);
    }

    /* renamed from: hashCode */
    public int m178149x8cdac1b() {
        return this.f550160a.m178146x8cdac1b();
    }
}
