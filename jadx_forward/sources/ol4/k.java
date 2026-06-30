package ol4;

/* loaded from: classes14.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f427696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ol4.q qVar) {
        super(1);
        this.f427696d = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String errorMsg = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        ol4.q qVar = this.f427696d;
        qVar.r(true);
        ll4.a aVar = qVar.f427715d;
        if (aVar != null) {
            ((kl4.n) aVar).b(12, errorMsg);
        }
        return jz5.f0.f384359a;
    }
}
