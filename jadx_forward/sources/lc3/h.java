package lc3;

/* loaded from: classes7.dex */
public final class h implements lc3.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd f399430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc3.o f399431b;

    public h(lc3.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd bootsPkgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bootsPkgInfo, "bootsPkgInfo");
        this.f399431b = oVar;
        this.f399430a = bootsPkgInfo;
    }

    @Override // lc3.f
    public int a() {
        java.lang.String version = this.f399430a.f229399o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(version, "version");
        return java.lang.Integer.parseInt(version);
    }

    @Override // lc3.f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 b() {
        java.lang.String wxapath = this.f399430a.f229400p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wxapath, "wxapath");
        return lc3.o.h(this.f399431b, new lc3.m0(wxapath));
    }

    @Override // lc3.f
    public lc3.g0 c(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.lang.String wxapath = this.f399430a.f229400p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wxapath, "wxapath");
        return new lc3.k0(wxapath, path);
    }

    @Override // lc3.f
    public java.lang.String d() {
        return this.f399430a.f229393f;
    }
}
