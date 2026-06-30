package a6;

/* loaded from: classes14.dex */
public final class q extends a6.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final e6.a f83220a;

    /* renamed from: b, reason: collision with root package name */
    public final s5.c f83221b;

    /* renamed from: c, reason: collision with root package name */
    public final r5.g f83222c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e6.a target, s5.c referenceCounter, r5.g eventListener, h6.k kVar) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referenceCounter, "referenceCounter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventListener, "eventListener");
        this.f83220a = target;
        this.f83221b = referenceCounter;
        this.f83222c = eventListener;
    }

    public static final void f(a6.q qVar, android.graphics.Bitmap bitmap) {
        x.n nVar = h6.d.b(((p135x2eae8f.p139xcb7e7191.C1422x9d6d031) qVar.f83220a).f125447d).f83181h;
        android.graphics.Bitmap bitmap2 = bitmap != null ? (android.graphics.Bitmap) nVar.put(qVar, bitmap) : (android.graphics.Bitmap) nVar.m174754xc84af884(qVar);
        if (bitmap2 == null) {
            return;
        }
        qVar.f83221b.b(bitmap2);
    }

    @Override // a6.b0
    public void a() {
        boolean z17 = this.f83221b instanceof s5.e;
        e6.a aVar = this.f83220a;
        if (z17) {
            ((p135x2eae8f.p139xcb7e7191.C1422x9d6d031) aVar).d(null);
        } else {
            ((p135x2eae8f.p139xcb7e7191.C1422x9d6d031) aVar).d(null);
            f(this, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // a6.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(c6.f r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.q.b(c6.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // a6.b0
    public e6.b c() {
        return this.f83220a;
    }

    @Override // a6.b0
    public void d(android.graphics.drawable.Drawable drawable, android.graphics.Bitmap bitmap) {
        s5.c cVar = this.f83221b;
        boolean z17 = cVar instanceof s5.e;
        e6.a aVar = this.f83220a;
        if (z17) {
            ((p135x2eae8f.p139xcb7e7191.C1422x9d6d031) aVar).d(drawable);
            return;
        }
        if (bitmap != null) {
            cVar.c(bitmap);
        }
        ((p135x2eae8f.p139xcb7e7191.C1422x9d6d031) aVar).d(drawable);
        f(this, bitmap);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // a6.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(c6.q r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.q.e(c6.q, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
