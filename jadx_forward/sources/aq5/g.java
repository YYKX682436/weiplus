package aq5;

/* loaded from: classes7.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final aq5.g f94771d = new aq5.g();

    public g() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.vd0 vd0Var = (bw5.vd0) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{ip: \"");
        sb6.append(vd0Var.f115873g[1] ? vd0Var.f115870d : "");
        sb6.append("\", port: ");
        sb6.append(vd0Var.f115871e);
        sb6.append(", type: ");
        sb6.append(vd0Var.f115873g[3] ? vd0Var.f115872f : bw5.u.ADDR_TYPE_WIFI);
        sb6.append('}');
        return sb6.toString();
    }
}
