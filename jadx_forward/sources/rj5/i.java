package rj5;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f477920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rj5.k f477921e;

    public i(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, rj5.k kVar) {
        this.f477920d = h0Var;
        this.f477921e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f477920d;
        java.lang.Object obj = h0Var.f391656d;
        rj5.a aVar = rj5.a.f477904d;
        if (obj != aVar) {
            h0Var.f391656d = aVar;
            rj5.k kVar = this.f477921e;
            kVar.getClass();
            kVar.c(aVar);
        }
    }
}
