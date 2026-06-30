package qs2;

/* loaded from: classes4.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs2.q f447848d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(qs2.q qVar) {
        super(0);
        this.f447848d = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        final qs2.q qVar = this.f447848d;
        return new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6085x679e6f54>(a0Var) { // from class: com.tencent.mm.plugin.finder.publish.FinderPublishFeatureService$snsPostListener$2$1
            {
                this.f39173x3fe91575 = 1901115748;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6085x679e6f54 c6085x679e6f54) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6085x679e6f54 event = c6085x679e6f54;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.X(new qs2.n(qs2.q.this, event));
                return true;
            }
        };
    }
}
