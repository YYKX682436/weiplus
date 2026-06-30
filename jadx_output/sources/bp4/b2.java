package bp4;

/* loaded from: classes10.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.c2 f23112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(bp4.c2 c2Var) {
        super(0);
        this.f23112d = c2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bp4.c2 c2Var = this.f23112d;
        y9.i iVar = new y9.i(c2Var.f23118g, 0);
        bp4.c2.z(c2Var).findViewById(com.tencent.mm.R.id.gzs).setOnClickListener(new bp4.a2(iVar));
        iVar.setContentView(bp4.c2.z(c2Var));
        return iVar;
    }
}
