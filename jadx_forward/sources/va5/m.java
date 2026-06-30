package va5;

/* loaded from: classes11.dex */
public final class m implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ va5.p f515950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f515951b;

    public m(va5.p pVar, int i17) {
        this.f515950a = pVar;
        this.f515951b = i17;
    }

    @Override // oa5.a
    public final void a(float f17) {
        va5.p pVar = this.f515950a;
        if (pVar.B == null) {
            return;
        }
        pVar.c(((int) (this.f515951b + (((pVar.f515959h.m171393xc082385a() + pVar.f515970v) - r1) * f17))) * pVar.f515955d);
    }
}
