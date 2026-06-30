package go0;

/* loaded from: classes14.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f355271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lo0.b0 f355272e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(go0.f0 f0Var, lo0.b0 b0Var) {
        super(0);
        this.f355271d = f0Var;
        this.f355272e = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        go0.a aVar;
        go0.f1 f1Var = this.f355271d.f355300p;
        if (f1Var != null) {
            lo0.b0 b0Var = this.f355272e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateFilterConfig filterConfig:");
            sb6.append(b0Var != null ? b0Var.toString() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveTexEditRenderer", sb6.toString());
            if (b0Var != null) {
                f1Var.L = b0Var;
                go0.t1 t1Var = f1Var.I;
                if (t1Var != null && (aVar = t1Var.f355389c) != null) {
                    java.lang.String str = b0Var.f401505f;
                    boolean z17 = b0Var.f401501b && com.p314xaae8f345.mm.vfs.w6.j(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveFilterProcessTex", "updateFilterConfig, needFilter:" + z17 + ", [" + b0Var.f401507h + ", " + str + ']');
                    if (z17) {
                        rh0.d0 d0Var = aVar.f355263f;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d0Var);
                        rh0.d0.a(d0Var, null, 0.0f, 2, null);
                        rh0.d0 d0Var2 = aVar.f355263f;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d0Var2);
                        ((p05.l4) d0Var2).h(str, (float) b0Var.f401507h);
                    } else {
                        rh0.d0 d0Var3 = aVar.f355263f;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d0Var3);
                        rh0.d0.a(d0Var3, null, 0.0f, 2, null);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
