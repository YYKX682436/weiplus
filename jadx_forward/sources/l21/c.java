package l21;

/* loaded from: classes4.dex */
public abstract class c {
    public static java.lang.String a(java.lang.String str, long j17) {
        if (j17 == 0) {
            return java.lang.String.format(str + "&enc%d", 314159265L);
        }
        return java.lang.String.format(str + "&enc%d", java.lang.Long.valueOf(j17));
    }
}
