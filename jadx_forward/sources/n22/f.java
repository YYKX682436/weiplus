package n22;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final n22.f f415823a = new n22.f();

    public static k22.g d(n22.f fVar, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 info, boolean z17, yz5.a aVar, yz5.a aVar2, java.lang.String str, int i17, long j17, int i18, int i19, long j18, java.lang.String str2, yz5.a aVar3, java.lang.String str3, java.lang.String str4, int i27, java.lang.Object obj) {
        boolean z18 = (i27 & 4) != 0 ? false : z17;
        yz5.a aVar4 = (i27 & 8) != 0 ? null : aVar;
        yz5.a aVar5 = (i27 & 16) != 0 ? null : aVar2;
        int i28 = (i27 & 64) != 0 ? 0 : i17;
        long j19 = (i27 & 128) != 0 ? 0L : j17;
        int i29 = (i27 & 256) != 0 ? 29 : i18;
        int i37 = (i27 & 512) == 0 ? i19 : 0;
        long j27 = (i27 & 1024) == 0 ? j18 : 0L;
        java.lang.String str5 = (i27 & 2048) != 0 ? null : str2;
        yz5.a aVar6 = (i27 & 4096) != 0 ? null : aVar3;
        java.lang.String sdkRequestID = (i27 & 8192) != 0 ? "" : str3;
        java.lang.String str6 = (i27 & 16384) == 0 ? str4 : null;
        fVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkRequestID, "sdkRequestID");
        k22.g gVar = new k22.g(context, info, z18, j27, str5, sdkRequestID, i29);
        gVar.B = i37;
        gVar.A = j19;
        gVar.f385035z = i28;
        gVar.f385032w = aVar4;
        gVar.f385033x = aVar5;
        gVar.f385034y = aVar6;
        gVar.C = str6;
        gVar.f385021i.C();
        return gVar;
    }

    public final android.graphics.drawable.GradientDrawable a(int i17, float f17, float f18, float f19, float f27) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i17);
        gradientDrawable.setCornerRadii(new float[]{f17, f17, f18, f18, f27, f27, f19, f19});
        return gradientDrawable;
    }

    public final android.graphics.drawable.Drawable b(int i17, int i18, float f17, float f18, float f19, float f27) {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, a(i18, f17, f18, f19, f27));
        stateListDrawable.addState(new int[0], a(i17, f17, f18, f19, f27));
        return stateListDrawable;
    }

    public final java.lang.String c(long j17) {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
                float f17 = (float) j17;
                if (f17 < 10000.0f) {
                    return java.lang.String.valueOf(j17);
                }
                if (f17 >= 10000.0f && f17 < 1.0E8f) {
                    float floatValue = new java.math.BigDecimal(j17 / 10000.0f).setScale(1, 4).floatValue();
                    if (floatValue % ((float) 1) == 0.0f) {
                        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.es6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) floatValue)}, 1));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                        return format;
                    }
                    java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573488es0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(floatValue)}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
                    return format2;
                }
                float floatValue2 = new java.math.BigDecimal(j17 / 1.0E8f).setScale(2, 4).floatValue();
                if (floatValue2 % ((float) 1) == 0.0f) {
                    java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.es9);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                    java.lang.String format3 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) floatValue2)}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format3, "format(...)");
                    return format3;
                }
                if ((100 * floatValue2) % 10 > 0.0f) {
                    java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.esd);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                    java.lang.String format4 = java.lang.String.format(string4, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(floatValue2)}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format4, "format(...)");
                    return format4;
                }
                java.lang.String string5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.esc);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
                java.lang.String format5 = java.lang.String.format(string5, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(floatValue2)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format5, "format(...)");
                return format5;
            }
            float f18 = (float) j17;
            if (f18 < 1000.0f) {
                return java.lang.String.valueOf(j17);
            }
            if (f18 >= 1000.0f && f18 < 1000000.0f) {
                float floatValue3 = new java.math.BigDecimal(j17 / 1000.0f).setScale(1, 4).floatValue();
                if (floatValue3 % ((float) 1) == 0.0f) {
                    java.lang.String string6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.es7);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
                    java.lang.String format6 = java.lang.String.format(string6, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) floatValue3)}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format6, "format(...)");
                    return format6;
                }
                java.lang.String string7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573491es3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string7, "getString(...)");
                java.lang.String format7 = java.lang.String.format(string7, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(floatValue3)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format7, "format(...)");
                return format7;
            }
            if (f18 < 1000000.0f || f18 >= 1.0E9f) {
                float floatValue4 = new java.math.BigDecimal(j17 / 1.0E9f).setScale(1, 4).floatValue();
                if (floatValue4 % ((float) 1) == 0.0f) {
                    java.lang.String string8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.esh);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string8, "getString(...)");
                    java.lang.String format8 = java.lang.String.format(string8, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) floatValue4)}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format8, "format(...)");
                    return format8;
                }
                java.lang.String string9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.esg);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string9, "getString(...)");
                java.lang.String format9 = java.lang.String.format(string9, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(floatValue4)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format9, "format(...)");
                return format9;
            }
            float floatValue5 = new java.math.BigDecimal(j17 / 1000000.0f).setScale(1, 4).floatValue();
            if (floatValue5 % ((float) 1) == 0.0f) {
                java.lang.String string10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.es_);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string10, "getString(...)");
                java.lang.String format10 = java.lang.String.format(string10, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) floatValue5)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format10, "format(...)");
                return format10;
            }
            java.lang.String string11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.esa);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string11, "getString(...)");
            java.lang.String format11 = java.lang.String.format(string11, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(floatValue5)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format11, "format(...)");
            return format11;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VersionedParcelParcel", "[formatNumber] errMsg:" + e17.getMessage());
            return "";
        }
    }
}
