package n3;

/* loaded from: classes14.dex */
public abstract class f3 {
    public static int a(int i17) {
        int statusBars;
        int i18 = 0;
        for (int i19 = 1; i19 <= 256; i19 <<= 1) {
            if ((i17 & i19) != 0) {
                if (i19 == 1) {
                    statusBars = android.view.WindowInsets.Type.statusBars();
                } else if (i19 == 2) {
                    statusBars = android.view.WindowInsets.Type.navigationBars();
                } else if (i19 == 4) {
                    statusBars = android.view.WindowInsets.Type.captionBar();
                } else if (i19 == 8) {
                    statusBars = android.view.WindowInsets.Type.ime();
                } else if (i19 == 16) {
                    statusBars = android.view.WindowInsets.Type.systemGestures();
                } else if (i19 == 32) {
                    statusBars = android.view.WindowInsets.Type.mandatorySystemGestures();
                } else if (i19 == 64) {
                    statusBars = android.view.WindowInsets.Type.tappableElement();
                } else if (i19 == 128) {
                    statusBars = android.view.WindowInsets.Type.displayCutout();
                }
                i18 |= statusBars;
            }
        }
        return i18;
    }
}
