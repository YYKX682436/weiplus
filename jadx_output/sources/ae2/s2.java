package ae2;

/* loaded from: classes.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.s2 f4160d = new ae2.s2();

    public s2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COVER_ENHANCE_GUIDE_CNT_INT_SYNC, 0);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_PREVIOUS_COVER_ENHANCE_GUIDE_CNT_INT_SYNC, 0);
        if (activity != null) {
            db5.t7.makeText(activity, "已重置", 0).show();
        }
        return jz5.f0.f302826a;
    }
}
