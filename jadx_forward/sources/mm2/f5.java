package mm2;

/* loaded from: classes3.dex */
public final class f5 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f410557f;

    /* renamed from: g, reason: collision with root package name */
    public r45.xn1 f410558g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f410559h;

    /* renamed from: i, reason: collision with root package name */
    public int f410560i;

    /* renamed from: m, reason: collision with root package name */
    public int f410561m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f410562n;

    /* renamed from: o, reason: collision with root package name */
    public int f410563o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f410557f = new java.util.ArrayList();
        this.f410559h = new java.util.ArrayList();
        this.f410562n = "";
    }

    public final boolean N6() {
        ae2.in inVar = ae2.in.f85221a;
        jz5.g gVar = ae2.in.Z2;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() != -1 ? ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() != 0 : this.f410563o > 0;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        this.f410557f.clear();
        this.f410558g = null;
        this.f410559h.clear();
        this.f410560i = 0;
        this.f410561m = 0;
        this.f410563o = 0;
    }
}
