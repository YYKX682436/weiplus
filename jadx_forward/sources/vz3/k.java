package vz3;

/* loaded from: classes15.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz3.q f523220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vz3.q qVar) {
        super(1);
        this.f523220d = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        vz3.q qVar = this.f523220d;
        if (booleanValue) {
            vz3.j jVar = new vz3.j(qVar);
            qVar.getClass();
            ((ku5.t0) ku5.t0.f394148d).h(new vz3.m(jVar), "MicroMsg.AffScanGoodsQueue");
        } else {
            vz3.q.n(qVar);
        }
        return jz5.f0.f384359a;
    }
}
