package ae2;

/* loaded from: classes4.dex */
public final class t4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.t4 f4186d = new ae2.t4();

    public t4() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        java.lang.String str = c50.l0.f38610a;
        java.lang.String str2 = c50.l0.f38611b;
        java.util.Set stringSet = L.getStringSet(str, new java.util.HashSet());
        if (stringSet != null) {
            stringSet.clear();
        }
        L.putStringSet(str, stringSet);
        L.remove(str2);
        if (activity != null) {
            db5.t7.makeText(activity, "已清除，可重新测试", 0).show();
        }
        return jz5.f0.f302826a;
    }
}
