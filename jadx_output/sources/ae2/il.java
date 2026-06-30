package ae2;

/* loaded from: classes.dex */
public final class il extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.il f3685d = new ae2.il();

    public il() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FIRST_SHOW_NEARBY_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        if (activity != null) {
            db5.t7.makeText(activity, "已清除，可重新测试", 0).show();
        }
        return jz5.f0.f302826a;
    }
}
