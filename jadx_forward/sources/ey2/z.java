package ey2;

/* loaded from: classes2.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.b0 f339120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ey2.b0 b0Var) {
        super(0);
        this.f339120d = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ey2.b0 b0Var = this.f339120d;
        b0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_START_HALF_ACTIVITY_PREFERENCE", "settings_finder_switch");
        java.lang.Long l17 = b0Var.f338857d ? com.p314xaae8f345.mm.ui.t2.f291404e : com.p314xaae8f345.mm.ui.t2.f291402c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
        intent.putExtra("KEY_ENTER_SCENE", l17.longValue());
        i95.m c17 = i95.n0.c(wd0.z1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((vd0.o3) ((wd0.z1) c17)).Zi(b0Var.m80379x76847179(), intent);
        return java.lang.Boolean.FALSE;
    }
}
