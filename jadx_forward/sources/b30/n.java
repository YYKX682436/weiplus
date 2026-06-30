package b30;

/* loaded from: classes.dex */
public final class n implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f99104a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f99105b = new java.util.HashMap();

    public n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsGetContactHelper", "init EcsGetContactHelper");
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsGetContactHelper", "getContactCallBack return a empty username");
            return;
        }
        java.util.HashMap hashMap = f99104a;
        java.util.HashMap hashMap2 = f99105b;
        if (z17) {
            yz5.l lVar = (yz5.l) hashMap2.get(str);
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
            hashMap.remove(str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EcsGetContactHelper", "getContactCallBack failed.");
        java.lang.Integer num = (java.lang.Integer) hashMap.get(str);
        if (num == null) {
            num = 0;
        }
        hashMap.put(str, java.lang.Integer.valueOf(num.intValue() + 1));
        yz5.l lVar2 = (yz5.l) hashMap2.get(str);
        if (lVar2 != null) {
            lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }
}
