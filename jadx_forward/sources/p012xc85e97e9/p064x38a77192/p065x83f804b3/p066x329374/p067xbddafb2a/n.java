package p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a;

/* loaded from: classes14.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.k f91950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f91951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.k kVar, yz5.p pVar) {
        super(2);
        this.f91950d = kVar;
        this.f91951e = pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        s1.l2 l2Var = (s1.l2) obj;
        long j17 = ((p2.c) obj2).f432910a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l2Var, "$this$null");
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.k kVar = this.f91950d;
        kVar.getClass();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l2Var, kVar.f91946d) || !p2.c.b(j17, kVar.f91947e)) {
            kVar.f91946d = l2Var;
            kVar.f91947e = j17;
            ((java.util.LinkedHashMap) kVar.f91945c).clear();
        }
        return (s1.u0) this.f91951e.mo149xb9724478(new p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.s(kVar, l2Var), new p2.c(j17));
    }
}
