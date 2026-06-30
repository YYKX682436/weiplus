package qi2;

/* loaded from: classes10.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f445056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi2.j1 f445057e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(yz5.l lVar, qi2.j1 j1Var) {
        super(1);
        this.f445056d = lVar;
        this.f445057e = j1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f445056d;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        }
        if (booleanValue) {
            this.f445057e.a();
        }
        return jz5.f0.f384359a;
    }
}
