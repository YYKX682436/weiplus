package androidx.fragment.app;

/* loaded from: classes14.dex */
public class b0 extends androidx.fragment.app.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r.a f11257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f11258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.b f11259c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.result.b f11260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11261e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.fragment.app.Fragment fragment, r.a aVar, java.util.concurrent.atomic.AtomicReference atomicReference, h.b bVar, androidx.activity.result.b bVar2) {
        super(null);
        this.f11261e = fragment;
        this.f11257a = aVar;
        this.f11258b = atomicReference;
        this.f11259c = bVar;
        this.f11260d = bVar2;
    }

    @Override // androidx.fragment.app.f0
    public void a() {
        androidx.fragment.app.Fragment fragment = this.f11261e;
        this.f11258b.set(((androidx.activity.result.h) this.f11257a.apply(null)).d(fragment.generateActivityResultKey(), fragment, this.f11259c, this.f11260d));
    }
}
