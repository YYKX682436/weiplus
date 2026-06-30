package fi5;

/* loaded from: classes3.dex */
public final class k implements mf3.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f344616a;

    /* renamed from: b, reason: collision with root package name */
    public final sf3.g f344617b;

    public k(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f344616a = path;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f488937f;
        linkedHashMap.put(mVar, path);
        this.f344617b = new sf3.g(linkedHashMap, path, null, null, null, null, 60, null).a(mVar);
    }

    @Override // mf3.k
    public gg3.c a() {
        return null;
    }

    @Override // mf3.k
    public eg3.i c() {
        return new eg3.i(this.f344616a, null, null, 6, null);
    }

    @Override // mf3.k
    public sf3.g e() {
        return this.f344617b;
    }

    @Override // mf3.k
    public java.lang.String g() {
        return this.f344616a;
    }

    @Override // mf3.k
    /* renamed from: getId */
    public java.lang.String mo2110x5db1b11() {
        return this.f344616a;
    }

    @Override // mf3.k
    /* renamed from: getType */
    public mf3.u mo2109xfb85f7b0() {
        return mf3.u.f407656e;
    }
}
