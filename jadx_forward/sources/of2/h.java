package of2;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of2.m f426619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(of2.m mVar) {
        super(1);
        this.f426619d = mVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        nf2.a mode = (nf2.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        of2.m mVar = this.f426619d;
        mVar.f426624J = mode;
        of2.g gVar = mVar.M;
        if (gVar != null) {
            gVar.m8146xced61ae5();
        }
        ((nf2.g) mVar.I).a(mVar.f426624J, mVar.K);
        return jz5.f0.f384359a;
    }
}
