package qj5;

/* loaded from: classes5.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj5.n f445515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(qj5.n nVar) {
        super(0);
        this.f445515d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qj5.o oVar = this.f445515d.f445516q2;
        if (oVar != null) {
            oVar.dismiss();
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerDialog");
        throw null;
    }
}
