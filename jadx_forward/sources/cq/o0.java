package cq;

/* loaded from: classes.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f302785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f302786e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(yz5.l lVar, yz5.l lVar2) {
        super(1);
        this.f302785d = lVar;
        this.f302786e = lVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar != null) {
            if (fVar.b()) {
                yz5.l lVar = this.f302785d;
                if (lVar != null) {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
                    lVar.mo146xb9724478(resp);
                }
            } else {
                yz5.l lVar2 = this.f302786e;
                if (lVar2 != null) {
                    lVar2.mo146xb9724478(fVar);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
