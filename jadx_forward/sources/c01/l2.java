package c01;

/* loaded from: classes7.dex */
public class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f118838a = new c01.k2(null);

    public boolean a(java.lang.String str) {
        return ((java.util.concurrent.ConcurrentHashMap) this.f118838a).containsKey(str);
    }

    public java.lang.Object b(java.lang.String str) {
        return ((c01.k2) this.f118838a).get(str);
    }

    public java.lang.Object c(java.lang.String str, java.lang.Object obj) {
        java.lang.Object b17 = b(str);
        return b17 != null ? b17 : obj;
    }

    public boolean d(java.lang.String str, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return z17;
        }
        java.lang.Object obj = ((c01.k2) this.f118838a).get(str);
        return obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() : z17;
    }

    public int e(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return i17;
        }
        java.lang.Object obj = ((c01.k2) this.f118838a).get(str);
        return obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : i17;
    }

    public java.lang.String f(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str2;
        }
        java.lang.Object obj = ((c01.k2) this.f118838a).get(str);
        return obj instanceof java.lang.String ? (java.lang.String) obj : str2;
    }

    public boolean g(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            java.lang.Object obj = ((c01.k2) this.f118838a).get(str);
            if (obj instanceof java.lang.Boolean) {
                return ((java.lang.Boolean) obj).booleanValue();
            }
        }
        return false;
    }

    public void h() {
        ((java.util.concurrent.ConcurrentHashMap) this.f118838a).clear();
    }

    public c01.l2 i(java.lang.String str, java.lang.Object obj) {
        if (!android.text.TextUtils.isEmpty(str)) {
            ((c01.k2) this.f118838a).put(str, obj);
        }
        return this;
    }

    public c01.l2 j(java.lang.String str, boolean z17) {
        if (!android.text.TextUtils.isEmpty(str)) {
            ((c01.k2) this.f118838a).put(str, java.lang.Boolean.valueOf(z17));
        }
        return this;
    }

    public c01.l2 k(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str)) {
            ((c01.k2) this.f118838a).put(str, str2);
        }
        return this;
    }
}
