package lp4;

/* loaded from: classes10.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp4.d1 f401866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f401867e;

    public c1(lp4.d1 d1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f401866d = d1Var;
        this.f401867e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lp4.d1 d1Var = this.f401866d;
        d1Var.f401872h = db5.e1.Q(d1Var.f401870f, "", (java.lang.String) this.f401867e.f391656d, true, false, null);
    }
}
