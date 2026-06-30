package ya2;

/* loaded from: classes2.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ya2.h0 f542019d = new ya2.h0();

    public h0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Activity activity;
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
            activity = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        if (activity != null) {
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            r45.s02 s02Var = new r45.s02();
            s02Var.set(4, java.lang.Long.valueOf(c01.id.a()));
            s02Var.set(3, 9);
            ((b92.d1) zbVar).uj(activity, s02Var);
        }
        return jz5.f0.f384359a;
    }
}
