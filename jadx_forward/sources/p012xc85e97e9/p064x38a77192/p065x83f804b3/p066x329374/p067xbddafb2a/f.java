package p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a;

/* loaded from: classes14.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.l f91931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f91932e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.l lVar, int i17) {
        super(2);
        this.f91931d = lVar;
        this.f91932e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        this.f91931d.d(this.f91932e, oVar, 0);
        return jz5.f0.f384359a;
    }
}
