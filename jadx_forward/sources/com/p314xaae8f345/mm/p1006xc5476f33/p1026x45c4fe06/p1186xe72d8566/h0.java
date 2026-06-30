package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes7.dex */
public final class h0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.r0 f170022a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f170023b;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.r0 resolver, java.lang.String defaultEnterPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resolver, "resolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultEnterPath, "defaultEnterPath");
        this.f170022a = resolver;
        this.f170023b = defaultEnterPath;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.r0
    public void a(java.lang.String enterPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterPath, "enterPath");
        this.f170022a.a(enterPath);
    }

    /* renamed from: equals */
    public boolean m52525xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.h0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.screenshot.EnterPathResolverWrapper");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170022a, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.h0) obj).f170022a);
    }

    /* renamed from: hashCode */
    public int m52526x8cdac1b() {
        return this.f170022a.hashCode();
    }
}
