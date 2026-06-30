package p81;

/* loaded from: classes7.dex */
public class a implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f434244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f434245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ km5.b f434246c;

    public a(p81.e eVar, boolean z17, int i17, km5.b bVar) {
        this.f434244a = z17;
        this.f434245b = i17;
        this.f434246c = bVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        boolean z17 = this.f434244a;
        r81.f.INSTANCE.b(this.f434245b, booleanValue ? z17 ? 52 : 47 : z17 ? 53 : 48);
        this.f434246c.c(bool);
        return null;
    }
}
