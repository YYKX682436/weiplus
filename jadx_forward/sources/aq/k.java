package aq;

/* loaded from: classes14.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq.n f94423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f94424e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(aq.n nVar, boolean z17) {
        super(0);
        this.f94423d = nVar;
        this.f94424e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        aq.n nVar = this.f94423d;
        int i17 = nVar.f94441c + 1;
        nVar.f94441c = i17;
        boolean z17 = this.f94424e;
        if (i17 == 2 || !z17) {
            int i18 = nVar.f94442d + 2;
            nVar.f94442d = i18;
            nVar.f94441c = 0;
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new aq.j(nVar, i18, !z17, null), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
