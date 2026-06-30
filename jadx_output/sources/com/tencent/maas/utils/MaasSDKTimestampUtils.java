package com.tencent.maas.utils;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\n\u001a\u00060\bj\u0002`\t*\u00060\bj\u0002`\tH\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0014\u0010\u000f\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\bj\u0002`\tH\u0002J\u001a\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0002J \u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/tencent/maas/utils/MaasSDKTimestampUtils;", "", "", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_DATE, "parseDateNumber2Capital", "", "number", "convertToSimplifiedChinese", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "trim0", "", "longitude", "latitude", "getLocationString", "convertToSimplifiedChineseForYear", "tag", "msg", "Ljz5/f0;", "log", "", "timestampMs", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, "localeStr", "formatTimestamp", "TAG", "Ljava/lang/String;", "<init>", "()V", "MaasSDK_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes12.dex */
public final class MaasSDKTimestampUtils {
    public static final com.tencent.maas.utils.MaasSDKTimestampUtils INSTANCE = new com.tencent.maas.utils.MaasSDKTimestampUtils();
    private static final java.lang.String TAG = "MaasSDKTimestamp";

    private MaasSDKTimestampUtils() {
    }

    private final java.lang.String convertToSimplifiedChinese(int number) {
        java.lang.String[] strArr = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        java.lang.String[] strArr2 = {"", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千", "兆"};
        java.lang.String valueOf = java.lang.String.valueOf(number);
        if (valueOf == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        char[] charArray = valueOf.toCharArray();
        kotlin.jvm.internal.o.f(charArray, "(this as java.lang.String).toCharArray()");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int length = charArray.length - 1;
        if (length >= 0) {
            int i17 = 0;
            while (true) {
                int i18 = i17 + 1;
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(java.lang.String.valueOf(charArray[i17]));
                kotlin.jvm.internal.o.f(valueOf2, "valueOf(digits[i].toString())");
                int intValue = valueOf2.intValue();
                java.lang.String str = strArr[intValue];
                int length2 = (charArray.length - i17) - 1;
                java.lang.String str2 = strArr2[length2];
                if (intValue == 0 && length2 % 4 == 0) {
                    stringBuffer.append(str2);
                } else if (intValue == 0) {
                    stringBuffer.append(str);
                } else if (intValue == 1 && length2 % 4 == 1) {
                    stringBuffer.append(str2);
                } else {
                    stringBuffer.append(str);
                    stringBuffer.append(str2);
                }
                if (i18 > length) {
                    break;
                }
                i17 = i18;
            }
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    private final java.lang.String convertToSimplifiedChineseForYear(java.lang.StringBuilder number) {
        java.util.Map k17 = kz5.c1.k(new jz5.l('0', (char) 38646), new jz5.l('1', (char) 19968), new jz5.l('2', (char) 20108), new jz5.l('3', (char) 19977), new jz5.l('4', (char) 22235), new jz5.l('5', (char) 20116), new jz5.l('6', (char) 20845), new jz5.l('7', (char) 19971), new jz5.l('8', (char) 20843), new jz5.l('9', (char) 20061));
        int i17 = 0;
        int i18 = 0;
        while (i17 < number.length()) {
            char charAt = number.charAt(i17);
            int i19 = i18 + 1;
            if ('0' <= charAt && charAt <= '9') {
                java.lang.Character ch6 = (java.lang.Character) k17.get(java.lang.Character.valueOf(charAt));
                if (ch6 == null) {
                    throw new java.lang.IllegalStateException("ignored".toString());
                }
                number.setCharAt(i18, ch6.charValue());
            }
            i17++;
            i18 = i19;
        }
        java.lang.String sb6 = number.toString();
        kotlin.jvm.internal.o.f(sb6, "number.toString()");
        return sb6;
    }

    private final java.lang.String getLocationString(double longitude, double latitude) {
        java.lang.String str = latitude > 0.0d ? "N" : androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH;
        java.lang.String str2 = longitude > 0.0d ? androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST : androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST;
        int i17 = (int) latitude;
        double d17 = 60;
        int i18 = (int) longitude;
        return i17 + (char) 176 + (java.lang.Math.abs(latitude - i17) * d17) + '\'' + str + ' ' + i18 + (char) 176 + (java.lang.Math.abs(longitude - i18) * d17) + '\'' + str2;
    }

    private final void log(java.lang.String str, java.lang.String str2) {
    }

    private final java.lang.String parseDateNumber2Capital(java.lang.String date) {
        java.lang.Integer num;
        if (date == null || date.length() == 0) {
            return "";
        }
        if (date.charAt(r26.n0.H(date)) != 26085 && date.charAt(r26.n0.H(date)) != 22825) {
            return date;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(date);
        int i17 = 0;
        int i18 = 0;
        while (i17 < sb6.length()) {
            char charAt = sb6.charAt(i17);
            int i19 = i18 + 1;
            com.tencent.maas.utils.MaasSDKTimestampUtils maasSDKTimestampUtils = INSTANCE;
            maasSDKTimestampUtils.log(TAG, kotlin.jvm.internal.o.m("parse date, char: ", java.lang.Character.valueOf(charAt)));
            if ((charAt == 26085 || charAt == 22825) || charAt == 26376) {
                int i27 = i18 - 1;
                java.lang.String str = "";
                while (true) {
                    if (i27 >= -1) {
                        java.lang.Integer num2 = null;
                        try {
                            num = java.lang.Integer.valueOf(java.lang.Integer.parseInt(java.lang.String.valueOf(sb6.charAt(i27))));
                        } catch (java.lang.Exception unused) {
                            num = null;
                        }
                        if (num == null) {
                            try {
                                num2 = java.lang.Integer.valueOf(java.lang.Integer.parseInt(str));
                            } catch (java.lang.Exception unused2) {
                            }
                            if (num2 != null) {
                                kotlin.jvm.internal.o.f(sb6.replace(i27 + 1, i18, INSTANCE.convertToSimplifiedChinese(num2.intValue())), "this.replace(startIndex, endIndex, value)");
                            }
                        } else {
                            str = num + str;
                            i27--;
                        }
                    }
                }
            } else if (charAt == 24180 && i18 >= 4) {
                int i28 = i18 - 1;
                char charAt2 = sb6.charAt(i28);
                if ('0' <= charAt2 && charAt2 <= '9') {
                    int i29 = i18 - 2;
                    char charAt3 = sb6.charAt(i29);
                    if ('0' <= charAt3 && charAt3 <= '9') {
                        int i37 = i18 - 3;
                        char charAt4 = sb6.charAt(i37);
                        if ('0' <= charAt4 && charAt4 <= '9') {
                            int i38 = i18 - 4;
                            char charAt5 = sb6.charAt(i38);
                            if ('0' <= charAt5 && charAt5 <= '9') {
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                sb7.append(sb6.charAt(i38));
                                sb7.append(sb6.charAt(i37));
                                sb7.append(sb6.charAt(i29));
                                sb7.append(sb6.charAt(i28));
                                kotlin.jvm.internal.o.f(sb6.replace(i38, i18, maasSDKTimestampUtils.convertToSimplifiedChineseForYear(maasSDKTimestampUtils.trim0(sb7))), "this.replace(startIndex, endIndex, value)");
                            }
                        }
                    }
                }
            }
            i17++;
            i18 = i19;
        }
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.f(sb8, "realResultDate.toString()");
        return sb8;
    }

    private final java.lang.StringBuilder trim0(java.lang.StringBuilder sb6) {
        if (!r26.n0.i0(sb6, '0', false, 2, null)) {
            return sb6;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < sb6.length(); i18++) {
            if (sb6.charAt(i18) == '0') {
                i17++;
            }
        }
        return i17 == sb6.length() ? new java.lang.StringBuilder("0") : new java.lang.StringBuilder(r26.n0.X(sb6, 0, i17));
    }

    public final java.lang.String formatTimestamp(long timestampMs, java.lang.String format, java.lang.String localeStr) {
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(localeStr, "localeStr");
        java.util.Date date = new java.util.Date(timestampMs);
        try {
            java.util.Locale locale = kotlin.jvm.internal.o.b(localeStr, "zh_CN") ? java.util.Locale.CHINA : kotlin.jvm.internal.o.b(localeStr, "en_US") ? java.util.Locale.US : null;
            java.lang.String format2 = new java.text.SimpleDateFormat(format, locale == null ? java.util.Locale.CHINA : locale).format(date);
            if (!kotlin.jvm.internal.o.b(locale, java.util.Locale.CHINA)) {
                INSTANCE.log(TAG, kotlin.jvm.internal.o.m("result: ", format2));
                return format2;
            }
            java.lang.String parseDateNumber2Capital = parseDateNumber2Capital(format2);
            INSTANCE.log(TAG, kotlin.jvm.internal.o.m("result: ", parseDateNumber2Capital));
            return parseDateNumber2Capital;
        } catch (java.lang.Exception e17) {
            log("ParseDateFormat error", e17.getMessage());
            return null;
        }
    }
}
