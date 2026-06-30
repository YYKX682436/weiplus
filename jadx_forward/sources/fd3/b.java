package fd3;

/* loaded from: classes.dex */
public final class b extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Class f342814f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f342815g;

    public b(java.lang.Class taskClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskClass, "taskClass");
        this.f342814f = taskClass;
    }

    @Override // lc3.c0
    public java.lang.String f() {
        if (this.f342815g == null) {
            fd3.a aVar = (fd3.a) this.f342814f.getAnnotation(fd3.a.class);
            java.lang.String m129354x337a8b = aVar != null ? aVar.m129354x337a8b() : null;
            this.f342815g = m129354x337a8b;
            boolean z17 = false;
            if (m129354x337a8b != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m129354x337a8b);
                if (m129354x337a8b.length() > 0) {
                    z17 = true;
                }
            }
            iz5.a.g(null, z17);
        }
        java.lang.String str = this.f342815g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return str;
    }

    @Override // lc3.b0
    public lc3.b0 r() {
        java.lang.Object newInstance = fd3.b.class.getConstructor(java.lang.Class.class).newInstance(this.f342814f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newInstance, "newInstance(...)");
        return (lc3.b0) newInstance;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.d) this.f342814f.newInstance();
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.C16437xa7f6be49 c16437xa7f6be49 = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.C16437xa7f6be49(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(f()), new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(data.toString()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        uk0.a.b(c16437xa7f6be49, dVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.c(this));
    }
}
