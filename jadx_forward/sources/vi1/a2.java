package vi1;

/* loaded from: classes7.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.b2 f518803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(vi1.b2 b2Var) {
        super(1);
        this.f518803d = b2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Long valueOf;
        r45.zs6 zs6Var = (r45.zs6) obj;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(zs6Var != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberManagerUI", "update %b", objArr);
        vi1.b2 b2Var = this.f518803d;
        if (zs6Var != null) {
            vi1.l2 l2Var = vi1.l2.f518934a;
            vi1.j2 a17 = l2Var.a(b2Var.f518811b);
            if (a17 != null) {
                vi1.j2 a18 = l2Var.a(b2Var.f518811b);
                valueOf = a18 != null ? java.lang.Long.valueOf(a18.f518906v) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                a17.f518906v = valueOf.longValue() + 1;
            }
        } else {
            vi1.l2 l2Var2 = vi1.l2.f518934a;
            vi1.j2 a19 = l2Var2.a(b2Var.f518811b);
            if (a19 != null) {
                vi1.j2 a27 = l2Var2.a(b2Var.f518811b);
                valueOf = a27 != null ? java.lang.Long.valueOf(a27.f518907w) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                a19.f518907w = valueOf.longValue() + 1;
            }
        }
        return jz5.f0.f384359a;
    }
}
