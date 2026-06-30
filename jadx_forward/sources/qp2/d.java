package qp2;

/* loaded from: classes2.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.g f447301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f447302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qp2.g gVar, r45.qt2 qt2Var) {
        super(0);
        this.f447301d = gVar;
        this.f447302e = qt2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qp2.g gVar = this.f447301d;
        if (!gVar.f447315o) {
            gVar.f447315o = true;
            pm0.v.L("LbsPresenter_requestLbs", true, new qp2.c(gVar, this.f447302e));
        }
        return jz5.f0.f384359a;
    }
}
