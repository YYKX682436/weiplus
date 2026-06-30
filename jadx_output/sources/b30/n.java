package b30;

/* loaded from: classes.dex */
public final class n implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f17571a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f17572b = new java.util.HashMap();

    public n() {
        com.tencent.mars.xlog.Log.i("EcsGetContactHelper", "init EcsGetContactHelper");
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("EcsGetContactHelper", "getContactCallBack return a empty username");
            return;
        }
        java.util.HashMap hashMap = f17571a;
        java.util.HashMap hashMap2 = f17572b;
        if (z17) {
            yz5.l lVar = (yz5.l) hashMap2.get(str);
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
            hashMap.remove(str);
            return;
        }
        com.tencent.mars.xlog.Log.w("EcsGetContactHelper", "getContactCallBack failed.");
        java.lang.Integer num = (java.lang.Integer) hashMap.get(str);
        if (num == null) {
            num = 0;
        }
        hashMap.put(str, java.lang.Integer.valueOf(num.intValue() + 1));
        yz5.l lVar2 = (yz5.l) hashMap2.get(str);
        if (lVar2 != null) {
            lVar2.invoke(java.lang.Boolean.FALSE);
        }
    }
}
