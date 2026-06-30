package wr3;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f530355a = new java.util.HashSet();

    public final java.lang.String a(int i17, java.lang.Integer num) {
        if (num != null && num.intValue() == 0) {
            return java.lang.String.valueOf(i17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('_');
        sb6.append(num);
        return sb6.toString();
    }
}
