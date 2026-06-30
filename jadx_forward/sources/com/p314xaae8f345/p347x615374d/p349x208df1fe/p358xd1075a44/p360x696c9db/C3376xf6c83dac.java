package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db;

/* renamed from: com.tencent.kinda.framework.widget.tools.ResourcesUtils */
/* loaded from: classes9.dex */
public class C3376xf6c83dac {
    public static final java.lang.String JPG = ".jpg";

    /* renamed from: RES_ANIM */
    private static final java.lang.String f13413x1b2a0670 = "anim";

    /* renamed from: RES_COLOR */
    private static final java.lang.String f13414x4a3376c4 = "color";

    /* renamed from: RES_DIMEN */
    private static final java.lang.String f13415x4a3ed692 = "dimen";

    /* renamed from: RES_DRABLE */
    private static final java.lang.String f13416xfe154f87 = "drawable";

    /* renamed from: RES_ID */
    private static final java.lang.String f13417x8fe0e13a = "id";

    /* renamed from: RES_LAYOUT */
    private static final java.lang.String f13418xad79fc9 = "layout";

    /* renamed from: RES_MENU */
    private static final java.lang.String f13419x1b2f59be = "menu";

    /* renamed from: RES_STRING */
    private static final java.lang.String f13420x17d204b0 = "string";

    /* renamed from: RES_STYLE */
    private static final java.lang.String f13421x4b176512 = "style";

    /* renamed from: filter */
    private static java.lang.String m27362xb408cb78(java.lang.String str) {
        return str.endsWith(JPG) ? str.substring(0, str.length() - 4) : str;
    }

    /* renamed from: getAnimId */
    public static int m27363x10dcae02(android.content.Context context, java.lang.String str) {
        return m27370x7513c025(context, m27362xb408cb78(str), f13413x1b2a0670);
    }

    /* renamed from: getColorId */
    public static int m27364x766627a8(android.content.Context context, java.lang.String str) {
        return m27370x7513c025(context, m27362xb408cb78(str), f13414x4a3376c4);
    }

    /* renamed from: getDimenId */
    public static int m27365xa118cbf6(android.content.Context context, java.lang.String str) {
        return m27370x7513c025(context, m27362xb408cb78(str), f13415x4a3ed692);
    }

    /* renamed from: getDrawableId */
    public static int m27366xffdf924f(android.content.Context context, java.lang.String str) {
        return m27370x7513c025(context, m27362xb408cb78(str), f13416xfe154f87);
    }

    /* renamed from: getId */
    public static int m27367x5db1b11(android.content.Context context, java.lang.String str) {
        return m27370x7513c025(context, m27362xb408cb78(str), "id");
    }

    /* renamed from: getLayoutId */
    public static int m27368x2ee31f5b(android.content.Context context, java.lang.String str) {
        return m27370x7513c025(context, str, f13418xad79fc9);
    }

    /* renamed from: getMenuId */
    public static int m27369x24da65d0(android.content.Context context, java.lang.String str) {
        return m27370x7513c025(context, m27362xb408cb78(str), f13419x1b2f59be);
    }

    /* renamed from: getResId */
    public static int m27370x7513c025(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return context.getResources().getIdentifier(m27362xb408cb78(str), str2, context.getPackageName());
    }

    /* renamed from: getStringId */
    public static int m27371xe6d7e682(android.content.Context context, java.lang.String str) {
        return m27370x7513c025(context, m27362xb408cb78(str), f13420x17d204b0);
    }

    /* renamed from: getStyleId */
    public static int m27372xce07ba76(android.content.Context context, java.lang.String str) {
        return m27370x7513c025(context, m27362xb408cb78(str), f13421x4b176512);
    }
}
