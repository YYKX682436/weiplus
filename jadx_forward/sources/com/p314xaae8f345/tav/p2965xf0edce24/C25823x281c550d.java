package com.p314xaae8f345.tav.p2965xf0edce24;

/* renamed from: com.tencent.tav.extractor.ExtractorUtils */
/* loaded from: classes14.dex */
public class C25823x281c550d {

    /* renamed from: MIME_AUDIO */
    public static final java.lang.String f48554xe83b2beb = "audio/";

    /* renamed from: MIME_VIDEO */
    public static final java.lang.String f48555xe95da490 = "video/";

    /* renamed from: applyMirror */
    public static void m97986x85ed10cd(android.graphics.Matrix matrix, int i17, int i18, int i19) {
        if (matrix == null) {
            return;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        if (i17 == 1) {
            matrix2.postScale(-1.0f, 1.0f);
            matrix2.postTranslate(i18, 0.0f);
        } else if (i17 == 2) {
            matrix2.postScale(1.0f, -1.0f);
            matrix2.postTranslate(0.0f, i19);
        } else if (i17 == 3) {
            matrix2.postScale(-1.0f, -1.0f);
            matrix2.postTranslate(i18, i19);
        }
        matrix.postConcat(matrix2);
    }

    /* renamed from: getFrameRate */
    public static int m97987x1fea5d37(android.media.MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return 0;
        }
        try {
            if (mediaFormat.containsKey("frame-rate")) {
                return mediaFormat.getInteger("frame-rate");
            }
            return 0;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return 0;
        }
    }

    /* renamed from: getPreferRotation */
    public static int m97988xbb14e2a4(com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34) {
        try {
            android.media.MediaFormat m97463x85cd3991 = com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97463x85cd3991(c25820xcadb1d34, "video/");
            if (m97463x85cd3991 == null || !m97463x85cd3991.containsKey("rotation-degrees")) {
                return 0;
            }
            return m97463x85cd3991.getInteger("rotation-degrees") / 90;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return 0;
        }
    }

    /* renamed from: getVideoSize */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m97989x4ee02466(com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34) {
        try {
            android.media.MediaFormat m97463x85cd3991 = com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97463x85cd3991(c25820xcadb1d34, "video/");
            com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85();
            if (m97463x85cd3991 != null) {
                if (m97463x85cd3991.containsKey("display-width")) {
                    c25732x76648a85.f47833x6be2dc6 = m97463x85cd3991.getInteger("display-width");
                } else {
                    c25732x76648a85.f47833x6be2dc6 = m97463x85cd3991.getInteger("width");
                }
                if (m97463x85cd3991.containsKey("display-height")) {
                    c25732x76648a85.f47832xb7389127 = m97463x85cd3991.getInteger("display-height");
                } else {
                    c25732x76648a85.f47832xb7389127 = m97463x85cd3991.getInteger("height");
                }
            }
            return c25732x76648a85;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85();
        }
    }

    /* renamed from: isSameExtractor */
    public static boolean m97990xbf249754(com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f, com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f2) {
        java.lang.String str;
        return (c25760x91f3af7f != null && c25760x91f3af7f2 != null) && (str = c25760x91f3af7f.f48008x4e63cb35) != null && str.equals(c25760x91f3af7f2.f48008x4e63cb35);
    }
}
