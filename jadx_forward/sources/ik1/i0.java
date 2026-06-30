package ik1;

/* loaded from: classes7.dex */
public abstract class i0 {
    public static java.lang.String a(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Token@");
        sb6.append(obj != null ? java.lang.Integer.valueOf(obj.hashCode()) : "null");
        return sb6.toString();
    }
}
