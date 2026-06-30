package ae2;

/* loaded from: classes.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.o2 f4064d = new ae2.o2();

    public o2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LYRICS_GESTURE_EDU_SHOWN_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        if (activity != null) {
            db5.t7.makeText(activity, "已重置，请重新进入直播间测试", 0).show();
        }
        return jz5.f0.f302826a;
    }
}
