package io2;

/* loaded from: classes2.dex */
public final class i implements fs2.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5 f375010d;

    /* renamed from: e, reason: collision with root package name */
    public io2.p f375011e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f375012f;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5 loader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        this.f375010d = loader;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f375012f;
        if (c22848x6ddd90cf != null) {
            return c22848x6ddd90cf;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
        throw null;
    }

    public final io2.p f() {
        io2.p pVar = this.f375011e;
        if (pVar != null) {
            return pVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        this.f375010d.m56401x31d4943c(f().f375030g);
    }
}
