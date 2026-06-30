package a6;

/* loaded from: classes14.dex */
public final class q extends a6.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final e6.a f1687a;

    /* renamed from: b, reason: collision with root package name */
    public final s5.c f1688b;

    /* renamed from: c, reason: collision with root package name */
    public final r5.g f1689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e6.a target, s5.c referenceCounter, r5.g eventListener, h6.k kVar) {
        super(null);
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(referenceCounter, "referenceCounter");
        kotlin.jvm.internal.o.g(eventListener, "eventListener");
        this.f1687a = target;
        this.f1688b = referenceCounter;
        this.f1689c = eventListener;
    }

    public static final void f(a6.q qVar, android.graphics.Bitmap bitmap) {
        x.n nVar = h6.d.b(((coil.target.ImageViewTarget) qVar.f1687a).f43914d).f1648h;
        android.graphics.Bitmap bitmap2 = bitmap != null ? (android.graphics.Bitmap) nVar.put(qVar, bitmap) : (android.graphics.Bitmap) nVar.remove(qVar);
        if (bitmap2 == null) {
            return;
        }
        qVar.f1688b.b(bitmap2);
    }

    @Override // a6.b0
    public void a() {
        boolean z17 = this.f1688b instanceof s5.e;
        e6.a aVar = this.f1687a;
        if (z17) {
            ((coil.target.ImageViewTarget) aVar).d(null);
        } else {
            ((coil.target.ImageViewTarget) aVar).d(null);
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
    public java.lang.Object b(c6.f r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.q.b(c6.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // a6.b0
    public e6.b c() {
        return this.f1687a;
    }

    @Override // a6.b0
    public void d(android.graphics.drawable.Drawable drawable, android.graphics.Bitmap bitmap) {
        s5.c cVar = this.f1688b;
        boolean z17 = cVar instanceof s5.e;
        e6.a aVar = this.f1687a;
        if (z17) {
            ((coil.target.ImageViewTarget) aVar).d(drawable);
            return;
        }
        if (bitmap != null) {
            cVar.c(bitmap);
        }
        ((coil.target.ImageViewTarget) aVar).d(drawable);
        f(this, bitmap);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // a6.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(c6.q r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.q.e(c6.q, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
