package bm5;

/* loaded from: classes7.dex */
public abstract class u1 {
    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        new bm5.t1();
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str) {
        java.lang.String packageName = context.getPackageName();
        return str.startsWith(packageName) ? str.substring(packageName.length()) : str;
    }
}
