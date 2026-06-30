package oj5;

/* loaded from: classes3.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f427423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f427424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f427425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f427426g;

    public u(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f427423d = c1163xf1deaba4;
        this.f427424e = c0Var;
        this.f427425f = h0Var;
        this.f427426g = n3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f427423d;
        boolean b17 = n3.x0.b(c1163xf1deaba4);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f427424e;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f427425f;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f427426g;
        if (b17) {
            c1163xf1deaba4.addOnAttachStateChangeListener(new oj5.t(c1163xf1deaba4, c0Var, h0Var, n3Var));
            return;
        }
        c0Var.f391645d = true;
        java.lang.Runnable runnable = (java.lang.Runnable) h0Var.f391656d;
        if (runnable != null) {
            n3Var.mo50300x3fa464aa(runnable);
        }
    }
}
