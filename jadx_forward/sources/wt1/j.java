package wt1;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f530828a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe f530829b;

    public j() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f530828a = hashMap;
        this.f530829b = null;
        hashMap.clear();
    }

    public java.lang.Object a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.Map map = this.f530828a;
        if (((java.util.HashMap) map).containsKey(str)) {
            return ((java.util.HashMap) map).get(str);
        }
        return null;
    }

    public void b(java.lang.String str, java.lang.Object obj) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        ((java.util.HashMap) this.f530828a).put(str, obj);
    }
}
