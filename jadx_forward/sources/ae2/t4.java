package ae2;

/* loaded from: classes4.dex */
public final class t4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.t4 f85719d = new ae2.t4();

    public t4() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        java.lang.String str = c50.l0.f120143a;
        java.lang.String str2 = c50.l0.f120144b;
        java.util.Set stringSet = L.getStringSet(str, new java.util.HashSet());
        if (stringSet != null) {
            stringSet.clear();
        }
        L.putStringSet(str, stringSet);
        L.remove(str2);
        if (activity != null) {
            db5.t7.m123883x26a183b(activity, "已清除，可重新测试", 0).show();
        }
        return jz5.f0.f384359a;
    }
}
