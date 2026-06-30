package az2;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.j f16132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(az2.j jVar) {
        super(0);
        this.f16132d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        az2.j jVar = this.f16132d;
        cz2.i iVar = new cz2.i(jVar);
        r45.qt2 qt2Var = jVar.f16135n;
        iVar.f225016i = qt2Var != null ? qt2Var.getInteger(7) : 0;
        return iVar;
    }
}
