package ej4;

/* loaded from: classes11.dex */
public final class p implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ej4.p f334906d = new ej4.p();

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public final void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        boolean z17 = true;
        if (w0Var != null && w0Var.f398507b == 2) {
            ej4.c0 c0Var = ej4.c0.f334868a;
            java.lang.String a17 = en1.a.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "username(...)");
            ej4.c0.d(c0Var, a17, null, false, 6, null);
        }
        java.lang.Object obj = w0Var != null ? w0Var.f398509d : null;
        mj4.w wVar = obj instanceof mj4.w ? (mj4.w) obj : null;
        java.lang.String str2 = wVar != null ? wVar.f76642xbed8694c : null;
        if (str2 != null && !r26.n0.N(str2)) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        ej4.c0.d(ej4.c0.f334868a, str2, null, false, 6, null);
    }
}
