package km4;

/* loaded from: classes11.dex */
public final class s extends rk4.y3 {

    /* renamed from: f, reason: collision with root package name */
    public static final km4.r f390851f = new km4.r(null);

    public s() {
        super(null, 1, null);
    }

    public final void a(java.util.Map map) {
        java.util.Map map2;
        if (map == null || (map2 = this.f478631e) == null) {
            return;
        }
        map2.putAll(map);
    }

    public final void d(bw5.f20 bizType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizType, "bizType");
        bw5.j20 j20Var = this.f524991d;
        j20Var.f110305e = bizType;
        j20Var.f110308h[2] = true;
    }

    public final void e(java.lang.String routerName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(routerName, "routerName");
        bw5.j20 j20Var = this.f524991d;
        j20Var.f110306f = routerName;
        j20Var.f110308h[3] = true;
    }
}
