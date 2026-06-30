package bq;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bq.e f23480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(bq.e eVar) {
        super(0);
        this.f23480d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bq.e eVar = this.f23480d;
        cz2.i iVar = new cz2.i(eVar);
        r45.qt2 qt2Var = eVar.f23483m;
        iVar.f225016i = qt2Var != null ? qt2Var.getInteger(7) : 0;
        return iVar;
    }
}
