package ae2;

/* loaded from: classes.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.d2 f3542d = new ae2.d2();

    public d2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_BOX_HINT_INT_SYNC, 0);
        if (activity != null) {
            db5.t7.makeText(activity, "已清除，可重新测试", 0).show();
        }
        return jz5.f0.f302826a;
    }
}
