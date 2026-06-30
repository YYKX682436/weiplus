package aq5;

/* loaded from: classes7.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final aq5.g f13238d = new aq5.g();

    public g() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.vd0 vd0Var = (bw5.vd0) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{ip: \"");
        sb6.append(vd0Var.f34340g[1] ? vd0Var.f34337d : "");
        sb6.append("\", port: ");
        sb6.append(vd0Var.f34338e);
        sb6.append(", type: ");
        sb6.append(vd0Var.f34340g[3] ? vd0Var.f34339f : bw5.u.ADDR_TYPE_WIFI);
        sb6.append('}');
        return sb6.toString();
    }
}
