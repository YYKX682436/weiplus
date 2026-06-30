package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f87429a;

    /* renamed from: b, reason: collision with root package name */
    public pd1.c f87430b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f87431c;

    /* renamed from: d, reason: collision with root package name */
    public pd1.b f87432d;

    /* renamed from: e, reason: collision with root package name */
    public final pd1.k f87433e;

    /* renamed from: f, reason: collision with root package name */
    public final pd1.e f87434f;

    /* renamed from: g, reason: collision with root package name */
    public final pd1.j f87435g;

    /* renamed from: h, reason: collision with root package name */
    public final pd1.o f87436h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.pip.j f87437i;

    public c(int i17, pd1.d dVar, pd1.j jVar, pd1.k kVar, pd1.e eVar, com.tencent.mm.plugin.appbrand.pip.j jVar2, pd1.m mVar) {
        this.f87430b = pd1.c.NONE;
        this.f87431c = false;
        this.f87432d = null;
        this.f87429a = i17;
        this.f87435g = jVar;
        this.f87433e = kVar;
        this.f87434f = eVar;
        this.f87437i = jVar2;
        tf.e eVar2 = (tf.e) dVar;
        pd1.c cVar = eVar2.f418797a;
        if (cVar != null) {
            this.f87430b = cVar;
        }
        java.lang.Boolean bool = eVar2.f418798b;
        if (bool != null) {
            this.f87431c = bool.booleanValue();
        }
        pd1.b bVar = eVar2.f418799c;
        if (bVar != null) {
            this.f87432d = bVar;
        }
        pd1.o n17 = jVar.n();
        this.f87436h = n17;
        n17.h(mVar);
    }
}
