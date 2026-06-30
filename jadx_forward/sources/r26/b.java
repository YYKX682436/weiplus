package r26;

/* loaded from: classes12.dex */
public abstract class b extends r26.a {
    public static final boolean c(char c17, char c18, boolean z17) {
        if (c17 == c18) {
            return true;
        }
        if (!z17) {
            return false;
        }
        char upperCase = java.lang.Character.toUpperCase(c17);
        char upperCase2 = java.lang.Character.toUpperCase(c18);
        return upperCase == upperCase2 || java.lang.Character.toLowerCase(upperCase) == java.lang.Character.toLowerCase(upperCase2);
    }
}
