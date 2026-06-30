package yx0;

/* loaded from: classes5.dex */
public final class m implements com.p314xaae8f345.p457x3304c6.p461x3a6d265.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f548977a;

    public m(java.lang.ref.WeakReference weakReference) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakReference, "weakReference");
        this.f548977a = weakReference;
    }

    public void a(com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3975xde78a307 c3975xde78a307) {
        yx0.b8 b8Var = (yx0.b8) this.f548977a.get();
        if (b8Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setBeginRequestAIGCFunc: params: ");
            sb6.append(c3975xde78a307 != null ? java.lang.Integer.valueOf(c3975xde78a307.m32440x28ca0534()) : null);
            sb6.append(", ");
            sb6.append(c3975xde78a307 != null ? c3975xde78a307.m32439xe2f5ee86() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", sb6.toString());
            if (c3975xde78a307 == null) {
                return;
            }
            b8Var.f548728v = p3325xe03a0797.p3326xc267989b.l.d(b8Var.L, null, null, new yx0.e(b8Var, c3975xde78a307, this, null), 3, null);
            b8Var.f548729w = p3325xe03a0797.p3326xc267989b.l.d(b8Var.L, null, null, new yx0.g(b8Var, null), 3, null);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = b8Var.f548728v;
            if (r2Var != null) {
                r2Var.p(new yx0.i(b8Var));
            }
        }
    }
}
