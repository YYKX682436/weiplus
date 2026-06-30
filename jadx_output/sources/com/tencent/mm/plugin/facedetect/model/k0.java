package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes7.dex */
public abstract class k0 {
    public static int a(int i17) {
        if (i17 < 90000 && i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceJSAPITranslateCenter", "hy: server error. not translate");
            return i17;
        }
        if (i17 > 90099) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceJSAPITranslateCenter", "hy: already translated");
            return i17;
        }
        if (i17 == 0) {
            return 0;
        }
        if (i17 == 90013) {
            return 90102;
        }
        switch (i17) {
            case com.tencent.thumbplayer.tmediacodec.codec.CodecError.FLUSH_CODECEXCEPTION /* 90001 */:
                return 90109;
            case 90002:
            case 90003:
            case 90004:
            case 90005:
            case 90006:
                return 90100;
            default:
                switch (i17) {
                    case 90008:
                    case 90009:
                    case 90010:
                        return 90101;
                    case 90011:
                        return 90102;
                    default:
                        switch (i17) {
                            case 90015:
                                return 90104;
                            case 90016:
                                return 90106;
                            case 90017:
                                return 90107;
                            default:
                                switch (i17) {
                                    case 90019:
                                    case 90020:
                                    case 90021:
                                        return 90103;
                                    case 90022:
                                        return 90105;
                                    case 90023:
                                        return 90108;
                                    case 90024:
                                    case 90025:
                                        return 90100;
                                    default:
                                        return 90199;
                                }
                        }
                }
        }
    }
}
