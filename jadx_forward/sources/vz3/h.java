package vz3;

/* loaded from: classes11.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f523215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz3.q f523216e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yz5.l lVar, vz3.q qVar) {
        super(1);
        this.f523215d = lVar;
        this.f523216e = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            this.f523215d.mo146xb9724478(java.lang.Boolean.FALSE);
        } else {
            pm0.v.X(new vz3.g(this.f523216e));
        }
        return jz5.f0.f384359a;
    }
}
