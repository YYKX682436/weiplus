package vo4;

/* loaded from: classes10.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.p f520196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(vo4.p pVar) {
        super(0);
        this.f520196d = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vo4.p pVar = this.f520196d;
        rs0.h hVar = pVar.f520198e;
        if (hVar != null) {
            rs0.i.f480829a.u(hVar);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = pVar.f520200g;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        pVar.f520199f.quitSafely();
        return jz5.f0.f384359a;
    }
}
