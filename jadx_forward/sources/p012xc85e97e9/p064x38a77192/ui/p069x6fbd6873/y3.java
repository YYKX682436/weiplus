package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class y3 implements u1.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final int f92354d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f92355e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Float f92356f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Float f92357g;

    /* renamed from: h, reason: collision with root package name */
    public y1.j f92358h;

    /* renamed from: i, reason: collision with root package name */
    public y1.j f92359i;

    public y3(int i17, java.util.List allScopes, java.lang.Float f17, java.lang.Float f18, y1.j jVar, y1.j jVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allScopes, "allScopes");
        this.f92354d = i17;
        this.f92355e = allScopes;
        this.f92356f = f17;
        this.f92357g = f18;
        this.f92358h = jVar;
        this.f92359i = jVar2;
    }

    @Override // u1.s1
    /* renamed from: isValid */
    public boolean mo7155x7b953cf2() {
        return this.f92355e.contains(this);
    }
}
