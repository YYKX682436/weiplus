package bp4;

/* loaded from: classes10.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.c2 f104645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(bp4.c2 c2Var) {
        super(0);
        this.f104645d = c2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bp4.c2 c2Var = this.f104645d;
        y9.i iVar = new y9.i(c2Var.f104651g, 0);
        bp4.c2.z(c2Var).findViewById(com.p314xaae8f345.mm.R.id.gzs).setOnClickListener(new bp4.a2(iVar));
        iVar.setContentView(bp4.c2.z(c2Var));
        return iVar;
    }
}
