package aw1;

/* loaded from: classes10.dex */
public final class h0 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f14529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot1.h f14530e;

    public h0(long j17, ot1.h hVar) {
        this.f14529d = j17;
        this.f14530e = hVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        aw1.l0 l0Var = aw1.l0.f14568a;
        ot1.h hdVideoIndex = this.f14530e;
        kotlin.jvm.internal.o.f(hdVideoIndex, "$hdVideoIndex");
        return java.lang.Long.valueOf(l0Var.b(this.f14529d, hdVideoIndex, true));
    }
}
