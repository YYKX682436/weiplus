package e1;

/* loaded from: classes13.dex */
public abstract class a {
    public static final android.graphics.BlendMode a(int i17) {
        if (i17 == 0) {
            return android.graphics.BlendMode.CLEAR;
        }
        if (i17 == 1) {
            return android.graphics.BlendMode.SRC;
        }
        if (i17 == 2) {
            return android.graphics.BlendMode.DST;
        }
        if (i17 == 3) {
            return android.graphics.BlendMode.SRC_OVER;
        }
        if (i17 == 4) {
            return android.graphics.BlendMode.DST_OVER;
        }
        if (i17 == 5) {
            return android.graphics.BlendMode.SRC_IN;
        }
        if (i17 == 6) {
            return android.graphics.BlendMode.DST_IN;
        }
        if (i17 == 7) {
            return android.graphics.BlendMode.SRC_OUT;
        }
        if (i17 == 8) {
            return android.graphics.BlendMode.DST_OUT;
        }
        if (i17 == 9) {
            return android.graphics.BlendMode.SRC_ATOP;
        }
        if (i17 == 10) {
            return android.graphics.BlendMode.DST_ATOP;
        }
        if (i17 == 11) {
            return android.graphics.BlendMode.XOR;
        }
        if (i17 == 12) {
            return android.graphics.BlendMode.PLUS;
        }
        if (i17 == 13) {
            return android.graphics.BlendMode.MODULATE;
        }
        if (i17 == 14) {
            return android.graphics.BlendMode.SCREEN;
        }
        if (i17 == 15) {
            return android.graphics.BlendMode.OVERLAY;
        }
        if (i17 == 16) {
            return android.graphics.BlendMode.DARKEN;
        }
        if (i17 == 17) {
            return android.graphics.BlendMode.LIGHTEN;
        }
        if (i17 == 18) {
            return android.graphics.BlendMode.COLOR_DODGE;
        }
        if (i17 == 19) {
            return android.graphics.BlendMode.COLOR_BURN;
        }
        if (i17 == 20) {
            return android.graphics.BlendMode.HARD_LIGHT;
        }
        if (i17 == 21) {
            return android.graphics.BlendMode.SOFT_LIGHT;
        }
        if (i17 == 22) {
            return android.graphics.BlendMode.DIFFERENCE;
        }
        if (i17 == 23) {
            return android.graphics.BlendMode.EXCLUSION;
        }
        if (i17 == 24) {
            return android.graphics.BlendMode.MULTIPLY;
        }
        if (i17 == 25) {
            return android.graphics.BlendMode.HUE;
        }
        if (i17 == 26) {
            return android.graphics.BlendMode.SATURATION;
        }
        if (i17 == 27) {
            return android.graphics.BlendMode.COLOR;
        }
        return i17 == 28 ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    public static final android.graphics.PorterDuff.Mode b(int i17) {
        if (i17 == 0) {
            return android.graphics.PorterDuff.Mode.CLEAR;
        }
        if (i17 == 1) {
            return android.graphics.PorterDuff.Mode.SRC;
        }
        if (i17 == 2) {
            return android.graphics.PorterDuff.Mode.DST;
        }
        if (i17 == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i17 == 4) {
            return android.graphics.PorterDuff.Mode.DST_OVER;
        }
        if (i17 == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i17 == 6) {
            return android.graphics.PorterDuff.Mode.DST_IN;
        }
        if (i17 == 7) {
            return android.graphics.PorterDuff.Mode.SRC_OUT;
        }
        if (i17 == 8) {
            return android.graphics.PorterDuff.Mode.DST_OUT;
        }
        if (i17 == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        if (i17 == 10) {
            return android.graphics.PorterDuff.Mode.DST_ATOP;
        }
        if (i17 == 11) {
            return android.graphics.PorterDuff.Mode.XOR;
        }
        if (i17 == 12) {
            return android.graphics.PorterDuff.Mode.ADD;
        }
        if (i17 == 14) {
            return android.graphics.PorterDuff.Mode.SCREEN;
        }
        if (i17 == 15) {
            return android.graphics.PorterDuff.Mode.OVERLAY;
        }
        if (i17 == 16) {
            return android.graphics.PorterDuff.Mode.DARKEN;
        }
        if (i17 == 17) {
            return android.graphics.PorterDuff.Mode.LIGHTEN;
        }
        return i17 == 13 ? android.graphics.PorterDuff.Mode.MULTIPLY : android.graphics.PorterDuff.Mode.SRC_OVER;
    }
}
