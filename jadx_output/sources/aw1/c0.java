package aw1;

/* loaded from: classes5.dex */
public abstract class c0 {
    public static final int a(int i17, boolean z17) {
        if ((65536 & i17) != 0) {
            return 0;
        }
        if (z17 && (1073741824 & i17) != 0) {
            return 0;
        }
        if ((i17 & 4096) != 0) {
            return 2;
        }
        int i18 = i17 & 4095;
        return (i18 == 1 || i18 == 12 || i18 == 13) ? 0 : 1;
    }
}
