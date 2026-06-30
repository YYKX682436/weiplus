package us2;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f512013a;

    /* renamed from: b, reason: collision with root package name */
    public final vt3.n f512014b;

    public f(int i17, vt3.n followContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(followContext, "followContext");
        this.f512013a = i17;
        this.f512014b = followContext;
    }

    /* renamed from: equals */
    public boolean m170486xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(us2.f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.record.improve.cgi.ShootComposingTemplateManager.TabListCacheKey");
        us2.f fVar = (us2.f) obj;
        return this.f512013a == fVar.f512013a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f512014b, fVar.f512014b);
    }

    /* renamed from: hashCode */
    public int m170487x8cdac1b() {
        return (this.f512013a * 31) + this.f512014b.m172618x8cdac1b();
    }
}
