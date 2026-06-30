package va;

/* loaded from: classes16.dex */
public final class x extends java.lang.ref.WeakReference implements va.w {

    /* renamed from: a, reason: collision with root package name */
    public final va.h f515739a;

    public x(java.lang.ref.ReferenceQueue referenceQueue, java.lang.Object obj, va.h hVar) {
        super(obj, referenceQueue);
        this.f515739a = hVar;
    }

    @Override // va.w
    public va.w a(java.lang.ref.ReferenceQueue referenceQueue, va.h hVar) {
        return new va.x(referenceQueue, get(), hVar);
    }

    @Override // va.w
    public va.h b() {
        return this.f515739a;
    }
}
