package d83;

/* loaded from: classes5.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d83.t0 f308518e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(java.lang.String str, d83.t0 t0Var) {
        super(0);
        this.f308517d = str;
        this.f308518e = t0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkStreamController", "destroy stream: " + this.f308517d);
        d83.t0 t0Var = this.f308518e;
        java.lang.String str = this.f308517d;
        if (t0Var.f308555b == null) {
            synchronized (t0Var) {
                if (t0Var.f308555b == null) {
                    t0Var.f308555b = com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.p.f298827b.d(t0Var.f308554a);
                    t0Var.f308560g.set(false);
                }
            }
        }
        d83.t0.a(t0Var);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.o oVar = t0Var.f308555b;
        if (oVar != null) {
            oVar.c(str);
        }
        return jz5.f0.f384359a;
    }
}
