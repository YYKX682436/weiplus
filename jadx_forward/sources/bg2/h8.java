package bg2;

/* loaded from: classes2.dex */
public final class h8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f101680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f101682f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(bg2.l8 l8Var, int i17, android.content.Context context) {
        super(1);
        this.f101680d = l8Var;
        this.f101681e = i17;
        this.f101682f = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList it = (java.util.LinkedList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        bg2.l8 l8Var = this.f101680d;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = l8Var.f498674d.f498680g;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new bg2.g8(it, l8Var, this.f101681e, this.f101682f, null), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
