package f14;

/* loaded from: classes5.dex */
public abstract class e {
    public static float a(android.content.Context context) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).contains("current_text_size_scale_key")) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getFloat("current_text_size_scale_key", 1.0f);
        }
        if (context == null) {
            return 1.0f;
        }
        float f17 = context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getFloat("current_text_size_scale_key", 1.0f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putFloat("current_text_size_scale_key", f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FontSizeService", "CURRENT_TEXT_SIZE_KEY put result:%s, currentFont:%s", java.lang.Boolean.TRUE, java.lang.Float.valueOf(f17));
        return f17;
    }

    public static int b(android.content.Context context) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).contains("current_text_size_index_key")) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getInt("current_text_size_index_key", 1);
        }
        if (context == null) {
            return 1;
        }
        int i17 = context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getInt("current_text_size_index_key", 1);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putInt("current_text_size_index_key", i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FontSizeService", "CURRENT_TEXT_INDEX_KEY put result:%s, currentFont:%s", java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i17));
        return i17;
    }

    public static int c(int i17) {
        switch (i17) {
            case 0:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.v.f33752x366c91de;
            case 1:
            default:
                return 400;
            case 2:
            case 3:
                return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
            case 4:
            case 5:
            case 6:
            case 7:
                return 340;
        }
    }

    public static void d(android.content.Context context, float f17, int i17) {
        i65.a.F(context, f17);
        e(context, f17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putInt("current_text_size_index_key", i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FontSizeService", "set CURRENT_TEXT_INDEX_KEY result: true");
        ((yg0.g4) ((zg0.h3) i95.n0.c(zg0.h3.class))).getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("WebViewFontUtil", 2, null).putBoolean("webview_key_font_use_system", true);
    }

    public static void e(android.content.Context context, float f17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putFloat("current_text_size_scale_key", f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FontSizeService", "CURRENT_TEXT_SIZE_KEY put result:%s, currentFont:%s", java.lang.Boolean.TRUE, java.lang.Float.valueOf(f17));
    }
}
