package us2;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f512009a;

    /* renamed from: b, reason: collision with root package name */
    public final vt3.n f512010b;

    public d(long j17, vt3.n followContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(followContext, "followContext");
        this.f512009a = j17;
        this.f512010b = followContext;
    }

    /* renamed from: equals */
    public boolean m170483xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(us2.d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.record.improve.cgi.ShootComposingTemplateManager.TabCacheKey");
        us2.d dVar = (us2.d) obj;
        return this.f512009a == dVar.f512009a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f512010b, dVar.f512010b);
    }

    /* renamed from: hashCode */
    public int m170484x8cdac1b() {
        return (java.lang.Long.hashCode(this.f512009a) * 31) + this.f512010b.m172618x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m170485x9616526c() {
        return "TabCacheKey(tabId=" + this.f512009a + ", followContext=" + this.f512010b + ')';
    }
}
