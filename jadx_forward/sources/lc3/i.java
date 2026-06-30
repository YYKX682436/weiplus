package lc3;

/* loaded from: classes7.dex */
public final class i implements lc3.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x f399432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc3.o f399433b;

    public i(lc3.o oVar, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x udrInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udrInfo, "udrInfo");
        this.f399433b = oVar;
        this.f399432a = udrInfo;
    }

    @Override // lc3.f
    public int a() {
        return (int) this.f399432a.f299123e;
    }

    @Override // lc3.f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 b() {
        java.lang.String m117639xfb83cc9b = this.f399432a.m117639xfb83cc9b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m117639xfb83cc9b, "getPath(...)");
        return lc3.o.h(this.f399433b, new lc3.m0(m117639xfb83cc9b));
    }

    @Override // lc3.f
    public lc3.g0 c(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.lang.String m117639xfb83cc9b = this.f399432a.m117639xfb83cc9b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m117639xfb83cc9b, "getPath(...)");
        return new lc3.k0(m117639xfb83cc9b, path);
    }

    @Override // lc3.f
    public java.lang.String d() {
        return this.f399432a.m117637xb5885648();
    }
}
