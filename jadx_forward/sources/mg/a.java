package mg;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 f407716a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f407717b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e f407718c;

    /* renamed from: d, reason: collision with root package name */
    public final mg.d f407719d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f407720e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae f407721f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f407722g;

    /* renamed from: h, reason: collision with root package name */
    public final mg.c f407723h;

    public a(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 movieSession, android.content.Context context, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e viewSize, og.a handleBoxListener, mg.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(movieSession, "movieSession");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewSize, "viewSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleBoxListener, "handleBoxListener");
        this.f407716a = movieSession;
        this.f407717b = context;
        this.f407718c = viewSize;
        this.f407719d = dVar;
        new java.util.ArrayList();
        movieSession.m33435xaa259df3(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnDidTapSegment() { // from class: mg.a$$a
            @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnDidTapSegment
            /* renamed from: onDidTapSegment */
            public final void mo33479x50d81c50(java.lang.String str, long j17) {
                mg.a this$0 = mg.a.this;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                mg.e.a("MJHandleBoxTouchHelper", "OnDidTapSegment segmentID: " + ((java.lang.Object) str) + ", editOptions: " + j17);
                if (str != null) {
                    this$0.f407720e = str;
                    throw null;
                }
                this$0.f407716a.m33426x81ae825f();
                this$0.f407720e = null;
                throw null;
            }
        });
        movieSession.m33438xb66b66d8(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnWillShowHandleBox() { // from class: mg.a$$b
            @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnWillShowHandleBox
            /* renamed from: onWillShowHandleBox */
            public final void mo33485xd1776935(java.lang.String str, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e scale, float f17) {
                mg.a this$0 = mg.a.this;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                mg.e.a("MJHandleBoxTouchHelper", "OnWillShowHandleBox segmentID: " + ((java.lang.Object) str) + ", position: " + c3974x289f3e + ", scale: " + scale + ", rotation: " + f17);
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae = this$0.f407721f;
                if (c3972x4b2f2ae == null) {
                    return;
                }
                ng.e eVar = (ng.e) ((jz5.n) this$0.f407722g).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(scale, "scale");
                eVar.getClass();
                mg.e.a("MJHandleBoxGestureDetector", "setup rect origin: " + c3972x4b2f2ae.m32426x28f8d21c() + ", size:" + c3972x4b2f2ae.m32427xfb854877() + ", scale:" + scale + ", rotation:" + f17);
                eVar.f418421c = c3972x4b2f2ae;
                eVar.f418424f = scale.f129332x;
                eVar.f418423e = (float) java.lang.Math.toDegrees((double) f17);
                float f18 = eVar.f418424f;
                eVar.f418420b.a(c3972x4b2f2ae, new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(f18, f18), (float) java.lang.Math.toRadians((double) eVar.f418423e));
            }
        });
        movieSession.m33436xa41edb5a(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnHandleBoxSettingsChanged() { // from class: mg.a$$c
            @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnHandleBoxSettingsChanged
            /* renamed from: handleBoxSettingsChanged */
            public final void mo33482x2f975c0e(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4052x7dfcf7a9 c4052x7dfcf7a9) {
                mg.d dVar2;
                mg.a this$0 = mg.a.this;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                mg.e.a("MJHandleBoxTouchHelper", p3321xbce91901.jvm.p3324x21ffc6bd.o.m("handleBoxSettingsChanged handleBoxSettings: ", c4052x7dfcf7a9));
                if (c4052x7dfcf7a9 == null) {
                    return;
                }
                float f17 = c4052x7dfcf7a9.m32997xa86cd69f().f129332x;
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e = this$0.f407718c;
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e2 = new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(f17, c3974x289f3e.f129333y - c4052x7dfcf7a9.m32997xa86cd69f().f129333y);
                float f18 = 2;
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae = new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(c3974x289f3e2.f129332x - (c4052x7dfcf7a9.m32995xc2a3eae4().f129332x / f18), c3974x289f3e2.f129333y - (c4052x7dfcf7a9.m32995xc2a3eae4().f129333y / f18)), c4052x7dfcf7a9.m32995xc2a3eae4());
                mg.e.a("MJHandleBoxTouchHelper", "origin:" + c3974x289f3e2 + ", viewSize: " + c3974x289f3e + ", contentSize: " + c4052x7dfcf7a9.m32995xc2a3eae4() + ", segmentRect.origin:" + c3972x4b2f2ae.m32426x28f8d21c() + ", segmentRect.size: " + c3972x4b2f2ae.m32427xfb854877() + ", handleBoxSettings: " + c4052x7dfcf7a9);
                this$0.f407721f = c3972x4b2f2ae;
                c4052x7dfcf7a9.m32999x7520af94();
                c4052x7dfcf7a9.m32998x79734cf4();
                this$0.getClass();
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae2 = this$0.f407721f;
                java.lang.String str = this$0.f407720e;
                if (c3972x4b2f2ae2 == null || str == null || (dVar2 = this$0.f407719d) == null) {
                    return;
                }
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e scale = c4052x7dfcf7a9.m32999x7520af94();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(scale, "scale");
                dVar2.a(c3972x4b2f2ae2, scale, c4052x7dfcf7a9.m32998x79734cf4());
            }
        }, viewSize);
        movieSession.m33434x93c64f36(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnHandleBoxComplete() { // from class: mg.a$$d
            @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnHandleBoxComplete
            /* renamed from: onHandleBoxComplete */
            public final void mo33481xf9e434bd(java.lang.String it) {
                mg.a this$0 = mg.a.this;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "it");
                throw null;
            }
        });
        this.f407722g = jz5.h.b(new mg.b(this));
        this.f407723h = new mg.c(this);
    }
}
