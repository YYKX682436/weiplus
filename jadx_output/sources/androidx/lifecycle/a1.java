package androidx.lifecycle;

/* loaded from: classes5.dex */
public final class a1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.i0 f11600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r.a f11601e;

    public a1(androidx.lifecycle.i0 i0Var, r.a aVar) {
        this.f11600d = i0Var;
        this.f11601e = aVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        this.f11600d.setValue(this.f11601e.apply(obj));
    }
}
