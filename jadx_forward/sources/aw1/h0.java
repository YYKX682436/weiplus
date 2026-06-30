package aw1;

/* loaded from: classes10.dex */
public final class h0 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f96062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot1.h f96063e;

    public h0(long j17, ot1.h hVar) {
        this.f96062d = j17;
        this.f96063e = hVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        aw1.l0 l0Var = aw1.l0.f96101a;
        ot1.h hdVideoIndex = this.f96063e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hdVideoIndex, "$hdVideoIndex");
        return java.lang.Long.valueOf(l0Var.b(this.f96062d, hdVideoIndex, true));
    }
}
