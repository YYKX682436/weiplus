package com.tencent.kinda.framework.widget.tools;

/* loaded from: classes9.dex */
public class ColorUtil {

    /* renamed from: com.tencent.kinda.framework.widget.tools.ColorUtil$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$framework$widget$tools$ColorUtil$MMViewType;

        static {
            int[] iArr = new int[com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType.values().length];
            $SwitchMap$com$tencent$kinda$framework$widget$tools$ColorUtil$MMViewType = iArr;
            try {
                iArr[com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType.MMKButtonText.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$kinda$framework$widget$tools$ColorUtil$MMViewType[com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType.MMKRichLabelView.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$kinda$framework$widget$tools$ColorUtil$MMViewType[com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType.MMKLabelViewText.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public enum MMViewType {
        NONE,
        MMKButtonText,
        MMKEditText,
        MMKImageView,
        MMKLabelViewText,
        MMKRichLabelView
    }

    public static long MergeColors(long j17, long j18) {
        long absColor = j17 < 0 ? absColor(j17) : j17;
        long absColor2 = j18 < 0 ? absColor(j18) : j18;
        long alpha = getAlpha(absColor);
        if (alpha == 0) {
            alpha = 255;
        }
        long red = getRed(absColor);
        long green = getGreen(absColor);
        long blue = getBlue(absColor);
        long alpha2 = getAlpha(absColor2);
        double d17 = ((float) alpha2) / 255.0f;
        double d18 = 1.0d - d17;
        return (((long) ((getRed(absColor2) * d17) + (red * d18))) << 16) | (((long) (alpha2 + (alpha * d18))) << 24) | (((long) ((getGreen(absColor2) * d17) + (green * d18))) << 8) | ((long) ((getBlue(absColor2) * d17) + (d18 * blue)));
    }

    public static long absColor(long j17) {
        long j18 = 0;
        if (j17 >= 0) {
            return j17;
        }
        long abs = java.lang.Math.abs(j17 + 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (abs > 16) {
            long j19 = abs >> 4;
            arrayList.add(java.lang.Integer.valueOf((int) (abs - (j19 << 4))));
            abs = j19;
        }
        arrayList.add(java.lang.Integer.valueOf((int) abs));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(15 - ((java.lang.Integer) it.next()).intValue()));
        }
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            j18 = (j18 * 16) + ((java.lang.Integer) arrayList2.get(size)).intValue();
        }
        return j18;
    }

    public static com.tencent.kinda.gen.DynamicColor compatKindaDarkMode(com.tencent.kinda.gen.DynamicColor dynamicColor, com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType mMViewType) {
        if (dynamicColor == null || dynamicColor.getNormalColor() == dynamicColor.getDarkmodeColor()) {
            return dynamicColor;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_kinda_dark_mode_sw, 1) == 1) {
            int i17 = com.tencent.kinda.framework.widget.tools.ColorUtil.AnonymousClass1.$SwitchMap$com$tencent$kinda$framework$widget$tools$ColorUtil$MMViewType[mMViewType.ordinal()];
            android.util.Pair<java.lang.Boolean, java.lang.Long> pair = i17 != 1 ? i17 != 2 ? i17 != 3 ? new android.util.Pair<>(java.lang.Boolean.FALSE, 0L) : com.tencent.kinda.framework.widget.tools.ColorCompatUtil.getDarkModeColorMMKLabelViewText(dynamicColor.getNormalColor()) : com.tencent.kinda.framework.widget.tools.ColorCompatUtil.getDarkModeColorMMKRichLabelView(dynamicColor.getNormalColor()) : com.tencent.kinda.framework.widget.tools.ColorCompatUtil.getDarkModeColorMMKButtonText(dynamicColor.getNormalColor());
            if (((java.lang.Boolean) pair.first).booleanValue()) {
                dynamicColor.mDarkmodeColor = ((java.lang.Long) pair.second).longValue();
            } else if (dynamicColor.getDarkmodeColor() == -1 || dynamicColor.getNormalColor() == dynamicColor.getDarkmodeColor()) {
                dynamicColor.mDarkmodeColor = com.tencent.kinda.framework.widget.tools.ColorCompatUtil.getDarkModeColor(dynamicColor.getNormalColor(), dynamicColor.getDarkmodeColor());
            } else if (dynamicColor.getNormalColor() == -1 && dynamicColor.getDarkmodeColor() == 0) {
                dynamicColor.mDarkmodeColor = java.lang.Long.parseLong("ffFFFFFF", 16);
            }
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return dynamicColor;
    }

    private static boolean compatKindaDarkModeDefaultColorSw() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_kinda_dark_mode_default_color_sw, 1) == 1;
    }

    private static long getAlpha(long j17) {
        return j17 >> 24;
    }

    private static long getBlue(long j17) {
        return j17 - ((j17 >> 8) << 8);
    }

    public static long getColorByMode(java.lang.String str) {
        com.tencent.kinda.gen.DynamicColor dynamicColor = new com.tencent.kinda.gen.DynamicColor();
        dynamicColor.mNormalColor = java.lang.Long.parseLong(str, 16);
        dynamicColor.mDarkmodeColor = java.lang.Long.parseLong(str, 16);
        return getColorByMode(dynamicColor);
    }

    public static long getColorByModeNoCompat(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        if (dynamicColor != null) {
            return com.tencent.mm.ui.bk.C() ? dynamicColor.getDarkmodeColor() : dynamicColor.getNormalColor();
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return 0L;
    }

    private static long getGreen(long j17) {
        return (j17 >> 8) - ((j17 >> 16) << 8);
    }

    private static long getRed(long j17) {
        return (j17 >> 16) - ((j17 >> 24) << 8);
    }

    public static boolean ifCompatKindaDarkModeDefaultColor() {
        return com.tencent.mm.ui.bk.C() && compatKindaDarkModeDefaultColorSw();
    }

    public static long getColorByMode(com.tencent.kinda.gen.DynamicColor dynamicColor, boolean z17) {
        long colorByMode = getColorByMode(dynamicColor, com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType.NONE);
        return (z17 && colorByMode == -1 && com.tencent.mm.ui.bk.C()) ? com.tencent.mm.ui.bk.d((int) dynamicColor.mNormalColor) : colorByMode;
    }

    public static long getColorByMode(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        return getColorByMode(dynamicColor, true);
    }

    public static long getColorByMode(com.tencent.kinda.gen.DynamicColor dynamicColor, com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType mMViewType) {
        if (dynamicColor == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return 0L;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mm.ui.bk.C()) {
            return compatKindaDarkMode(dynamicColor, mMViewType).getDarkmodeColor();
        }
        return dynamicColor.mNormalColor;
    }
}
