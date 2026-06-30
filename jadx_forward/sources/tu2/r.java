package tu2;

/* loaded from: classes10.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final tu2.r f503684d = new tu2.r();

    public r() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("短视频录制:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        sb7.append(t70Var.L2());
        sb7.append("\n-----------------\n");
        sb6.append(sb7.toString());
        sb6.append("短视频相册:" + t70Var.K2() + "\n-----------------\n");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("长视频:");
        sb8.append(tu2.s.f503685a.i());
        sb6.append(sb8.toString());
        if (activity != null) {
            lu2.j jVar = lu2.j.f402909a;
            java.lang.String sb9 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
            jVar.a(activity, sb9, "");
        } else {
            db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, sb6.toString(), 1).show();
        }
        return jz5.f0.f384359a;
    }
}
