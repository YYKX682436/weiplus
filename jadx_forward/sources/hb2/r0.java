package hb2;

/* loaded from: classes2.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f361620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(zy2.gc gcVar) {
        super(1);
        this.f361620d = gcVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.ri2 modUserInfo = (r45.ri2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modUserInfo, "modUserInfo");
        zy2.gc gcVar = this.f361620d;
        if (gcVar != null) {
            r45.ix0 ix0Var = new r45.ix0();
            ix0Var.set(0, 1);
            ix0Var.set(1, -1);
            gcVar.r5(modUserInfo, ix0Var);
        }
        return jz5.f0.f384359a;
    }
}
