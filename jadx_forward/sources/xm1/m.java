package xm1;

/* loaded from: classes14.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f536714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xm1.n f536715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, xm1.n nVar) {
        super(0);
        this.f536714d = f0Var;
        this.f536715e = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f536714d.f391649d;
        xm1.n nVar = this.f536715e;
        if (i17 != nVar.f()) {
            int i18 = nVar.f536705d;
            if (i18 == 0) {
                nVar.f536705d = 2;
            } else if (i18 == 1) {
                nVar.f536705d = 3;
            }
        }
        return jz5.f0.f384359a;
    }
}
