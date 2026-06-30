package wo2;

/* loaded from: classes3.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f529613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f529614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529615f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f529616g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.ViewGroup viewGroup, r45.nw1 nw1Var, java.lang.String str, long j17) {
        super(1);
        this.f529613d = viewGroup;
        this.f529614e = nw1Var;
        this.f529615f = str;
        this.f529616g = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        rp2.a config = (rp2.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "$this$config");
        android.view.ViewGroup viewGroup = this.f529613d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        config.f480100a = viewGroup;
        r45.nw1 nw1Var = this.f529614e;
        config.f480104e = nw1Var;
        java.lang.String m75945x2fec8307 = nw1Var != null ? nw1Var.m75945x2fec8307(3) : null;
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        config.f480101b = m75945x2fec8307;
        java.lang.String str = this.f529615f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        config.f480102c = str;
        config.f480103d = this.f529616g;
        return jz5.f0.f384359a;
    }
}
