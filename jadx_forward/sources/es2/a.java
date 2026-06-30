package es2;

/* loaded from: classes2.dex */
public final class a implements cs2.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f337858d;

    /* renamed from: e, reason: collision with root package name */
    public final es2.g f337859e;

    public a(android.content.Context context, es2.g preloadInStream) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadInStream, "preloadInStream");
        this.f337858d = context;
        this.f337859e = preloadInStream;
    }

    @Override // cs2.j
    public void B(java.lang.String mediaId, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        this.f337859e.B(mediaId, z17, i17);
    }

    @Override // cs2.j
    public void C0() {
        this.f337859e.C0();
    }

    @Override // cs2.j
    public void G(vr2.i callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f337859e.G(callback);
    }

    @Override // cs2.j
    public void M(cw2.wa mediaSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        cs2.k a17 = a();
        cs2.j jVar = a17 != null ? a17.f303609d : null;
        if (jVar != null) {
            jVar.M(mediaSource);
        }
        int m17 = jVar != null ? jVar.m() : 0;
        es2.g gVar = this.f337859e;
        if (m17 > 0) {
            gVar.i0(mediaSource);
        } else {
            gVar.M(mediaSource);
        }
    }

    @Override // cs2.j
    public void P(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f337859e.P(source);
    }

    @Override // cs2.j
    public void V(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f337859e.V(context);
    }

    public final cs2.k a() {
        cs2.k kVar;
        android.content.Context context = this.f337858d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
        if (activityC0065xcd7aa112 == null) {
            return null;
        }
        if (activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).m63052x8f02c6c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
            kVar = (cs2.k) pf5.z.f435481a.b(fragment).a(cs2.k.class);
        } else {
            kVar = (cs2.k) pf5.z.f435481a.a(activityC0065xcd7aa112).a(cs2.k.class);
        }
        return kVar;
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa dataList, int i17, int i18, fc2.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f337859e.P0(dataList, i17, i18, cVar);
    }

    @Override // cs2.j
    public void f(java.lang.String mediaId, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        this.f337859e.getClass();
    }

    @Override // cs2.j
    /* renamed from: getCommentScene */
    public int mo122608x8fadefe3() {
        return this.f337859e.f337879g;
    }

    @Override // cs2.j
    public void i0(cw2.wa mediaSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        cs2.k a17 = a();
        cs2.j jVar = a17 != null ? a17.f303609d : null;
        if (jVar != null) {
            jVar.i0(mediaSource);
        }
        this.f337859e.i0(mediaSource);
    }

    @Override // cs2.j
    public int m() {
        return this.f337859e.m();
    }

    @Override // cs2.j
    public void p(java.lang.String invokeSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        this.f337859e.p(invokeSource);
    }

    @Override // cs2.j
    public void p0(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f337859e.p0(source);
    }

    @Override // cs2.j
    public void q(yz5.p pVar) {
        this.f337859e.f337895z = pVar;
    }

    @Override // cs2.j
    public void u0(java.lang.String mediaId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        this.f337859e.u0(mediaId, z17);
    }

    @Override // cs2.j
    public void x0(cw2.wa mediaSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        this.f337859e.x0(mediaSource);
    }

    @Override // cs2.j
    public void z(cw2.wa mediaSource, java.lang.String invokeSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaSource, "mediaSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        this.f337859e.z(mediaSource, invokeSource);
    }
}
