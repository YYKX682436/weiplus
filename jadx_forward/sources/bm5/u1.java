package bm5;

/* loaded from: classes7.dex */
public abstract class u1 {
    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        new bm5.t1();
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str) {
        java.lang.String packageName = context.getPackageName();
        return str.startsWith(packageName) ? str.substring(packageName.length()) : str;
    }
}
