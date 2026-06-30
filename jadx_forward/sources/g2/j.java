package g2;

/* loaded from: classes14.dex */
public abstract class j {
    public static final void a(java.lang.String str, char[] cArr, int i17, int i18, int i19) {
        for (int i27 = i18; i27 < i19; i27++) {
            cArr[(i17 + i27) - i18] = str.charAt(i27);
        }
    }
}
