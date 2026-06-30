package com.tencent.kinda.framework.widget.tools;

/* loaded from: classes9.dex */
public class ResourcesUtils {
    public static final java.lang.String JPG = ".jpg";
    private static final java.lang.String RES_ANIM = "anim";
    private static final java.lang.String RES_COLOR = "color";
    private static final java.lang.String RES_DIMEN = "dimen";
    private static final java.lang.String RES_DRABLE = "drawable";
    private static final java.lang.String RES_ID = "id";
    private static final java.lang.String RES_LAYOUT = "layout";
    private static final java.lang.String RES_MENU = "menu";
    private static final java.lang.String RES_STRING = "string";
    private static final java.lang.String RES_STYLE = "style";

    private static java.lang.String filter(java.lang.String str) {
        return str.endsWith(JPG) ? str.substring(0, str.length() - 4) : str;
    }

    public static int getAnimId(android.content.Context context, java.lang.String str) {
        return getResId(context, filter(str), RES_ANIM);
    }

    public static int getColorId(android.content.Context context, java.lang.String str) {
        return getResId(context, filter(str), RES_COLOR);
    }

    public static int getDimenId(android.content.Context context, java.lang.String str) {
        return getResId(context, filter(str), RES_DIMEN);
    }

    public static int getDrawableId(android.content.Context context, java.lang.String str) {
        return getResId(context, filter(str), RES_DRABLE);
    }

    public static int getId(android.content.Context context, java.lang.String str) {
        return getResId(context, filter(str), "id");
    }

    public static int getLayoutId(android.content.Context context, java.lang.String str) {
        return getResId(context, str, RES_LAYOUT);
    }

    public static int getMenuId(android.content.Context context, java.lang.String str) {
        return getResId(context, filter(str), RES_MENU);
    }

    public static int getResId(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return context.getResources().getIdentifier(filter(str), str2, context.getPackageName());
    }

    public static int getStringId(android.content.Context context, java.lang.String str) {
        return getResId(context, filter(str), RES_STRING);
    }

    public static int getStyleId(android.content.Context context, java.lang.String str) {
        return getResId(context, filter(str), RES_STYLE);
    }
}
