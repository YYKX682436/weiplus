package ae2;

/* loaded from: classes3.dex */
public final class je extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.je f3956d = new ae2.je();

    public je() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_HAS_SHOW_LIVE_GUIDE_BOOLEAN_SYNC;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        c17.x(u3Var, bool);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_HAS_SHOW_LIVE_REAL_HISTORY_GUIDE_BOOLEAN_SYNC, bool);
        if (activity != null) {
            db5.t7.makeText(activity, "已清除，可重新测试", 0).show();
        }
        return jz5.f0.f302826a;
    }
}
