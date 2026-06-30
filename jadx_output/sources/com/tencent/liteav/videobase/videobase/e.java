package com.tencent.liteav.videobase.videobase;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.Map<com.tencent.liteav.videobase.videobase.e.a, java.lang.Integer> f46835a = new java.util.HashMap<com.tencent.liteav.videobase.videobase.e.a, java.lang.Integer>() { // from class: com.tencent.liteav.videobase.videobase.e.1
        {
            put(com.tencent.liteav.videobase.videobase.e.a.ERR_CODE_NONE, 0);
            put(com.tencent.liteav.videobase.videobase.e.a.ERR_VIDEO_CAPTURE_EGL_CORE_CREATE_FAILED, -1301);
            put(com.tencent.liteav.videobase.videobase.e.a.ERR_VIDEO_CAPTURE_OPENGL_ERROR, -1301);
            put(com.tencent.liteav.videobase.videobase.e.a.ERR_VIDEO_CAPTURE_CAMERA_NOT_AUTHORIZED, -1314);
            put(com.tencent.liteav.videobase.videobase.e.a.ERR_VIDEO_CAPTURE_CAMERA_INVALID_DEVICE, -1301);
            put(com.tencent.liteav.videobase.videobase.e.a.ERR_VIDEO_CAPTURE_SCREEN_CAPTURE_START_FAILED, -1308);
            put(com.tencent.liteav.videobase.videobase.e.a.ERR_VIDEO_CAPTURE_SCREEN_UNSUPPORTED, -1309);
            put(com.tencent.liteav.videobase.videobase.e.a.ERR_VIDEO_CAPTURE_SCREEN_UNAUTHORIZED, -1308);
            put(com.tencent.liteav.videobase.videobase.e.a.ERR_VIDEO_ENCODE_FATALERROR, -1303);
            put(com.tencent.liteav.videobase.videobase.e.a.ERR_VIDEO_ENCODE_FAIL, -1303);
            put(com.tencent.liteav.videobase.videobase.e.a.ERR_VIDEO_NO_AVAILABLE_HEVC_DECODERS, -2304);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final java.util.Map<com.tencent.liteav.videobase.videobase.e.c, java.lang.Integer> f46836b = new java.util.HashMap<com.tencent.liteav.videobase.videobase.e.c, java.lang.Integer>() { // from class: com.tencent.liteav.videobase.videobase.e.2
        {
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_ENCODE_EGL_CORE_CREATE_FAILED, 1103);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_ENCODE_START_FAILED_INSUFFICIENT_RESOURCE, 1103);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_ENCODE_START_FAILED, 1103);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_ENCODE_SWAP_BUFFER, 1103);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_RENDER_EGL_CORE_CREATE_FAILED, 2110);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_RENDER_EGL_CORE_DESTROY_FAILED, 2110);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_RENDER_SWAP_BUFFER, 2110);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_DECODE_EGL_CORE_CREATE_FAILED, 2106);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_DECODE_START_FAILED_ILLEGAL_ARGUMENT, 2106);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_DECODE_START_FAILED_ILLEGAL_STATE, 2106);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_DECODE_START_FAILED_INSUFFICIENT_RESOURCE, 2106);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_DECODE_START_FAILED_OUT_OF_MEMORY, 2106);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_DECODE_START_FAILED, 2106);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_DECODE_RESTART_WHEN_DECODE_ERROR, 2101);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_DECODE_ERROR_NOT_SUPPORT_PIXEL_FORMAT_TYPE, 2101);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_VIDEO_DECODE_FATAL_ERROR, 2101);
            put(com.tencent.liteav.videobase.videobase.e.c.WARNING_OUT_OF_MEMORY, 1113);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final java.util.Map<com.tencent.liteav.videobase.videobase.e.b, java.lang.Integer> f46837c = new java.util.HashMap<com.tencent.liteav.videobase.videobase.e.b, java.lang.Integer>() { // from class: com.tencent.liteav.videobase.videobase.e.3
        {
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_DECODE_HW_TO_SW_DECODE_COST_TOO_HIGH, 2108);
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_DECODE_HW_TO_SW_REMOTE_VIDEO_ENABLE_RPS, 2108);
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_DECODE_HW_TO_SW_MEDIACODEC_NOT_WORK, 2108);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final java.util.Map<com.tencent.liteav.videobase.videobase.e.b, java.lang.Integer> f46838d = new java.util.HashMap<com.tencent.liteav.videobase.videobase.e.b, java.lang.Integer>() { // from class: com.tencent.liteav.videobase.videobase.e.4
        {
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_DECODE_FIRST_FRAME_DECODED, 10000);
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_RENDER_FIRST_FRAME_ON_VIEW, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID));
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_EVENT_REQUEST_KEY_FRAME, 10005);
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_RENDER_FIRST_FRAME, 10001);
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_DECODE_TYPE_CHANGE, 10002);
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_RENDER_RESOLUTION_CHANGE, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL));
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_FIRST_FRAME, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL));
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_CAMERA_START_SUCCESS, 30001);
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_START_SUCCESS, 30002);
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_STOP_SUCCESS, 30003);
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_INTERRUPTED, 30004);
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_RESUME, java.lang.Integer.valueOf(com.tencent.mars.cdn.proto.FileType.FILETYPE_X_WEB_RUNTIME_PATCH_VALUE));
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_ENCODE_START_SUCCESS, 40001);
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_CAMERA_STUCK, 50001);
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_HARDWARE_ENCODER_STUCK, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.QUEUEINPUTBUFFER_CRYPTO_EXCEPTION));
            put(com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_HARDWARE_DECODER_STUCK, 50003);
        }
    };

    /* loaded from: classes14.dex */
    public enum a {
        ERR_CODE_NONE(0),
        ERR_VIDEO_CAPTURE_EGL_CORE_CREATE_FAILED(100),
        ERR_VIDEO_CAPTURE_OPENGL_ERROR(101),
        ERR_VIDEO_CAPTURE_CAMERA_INVALID_DEVICE(110),
        ERR_VIDEO_CAPTURE_CAMERA_NOT_AUTHORIZED(111),
        ERR_VIDEO_CAPTURE_SCREEN_CAPTURE_START_FAILED(120),
        ERR_VIDEO_CAPTURE_SCREEN_UNAUTHORIZED(121),
        ERR_VIDEO_CAPTURE_SCREEN_UNSUPPORTED(122),
        ERR_VIDEO_ENCODE_FATALERROR(200),
        ERR_VIDEO_ENCODE_FAIL(201),
        ERR_VIDEO_NO_AVAILABLE_HEVC_DECODERS(300);

        private final int mValue;

        a(int i17) {
            this.mValue = i17;
        }
    }

    /* loaded from: classes14.dex */
    public enum b {
        EVT_CODE_NONE,
        EVT_VIDEO_DECODE_HW_TO_SW_DECODE_COST_TOO_HIGH,
        EVT_VIDEO_DECODE_HW_TO_SW_REMOTE_VIDEO_ENABLE_RPS,
        EVT_VIDEO_DECODE_HW_TO_SW_MEDIACODEC_NOT_WORK,
        EVT_VIDEO_DECODE_FIRST_FRAME_DECODED,
        EVT_VIDEO_RENDER_FIRST_FRAME,
        EVT_VIDEO_DECODE_TYPE_CHANGE,
        EVT_VIDEO_RENDER_RESOLUTION_CHANGE,
        EVT_VIDEO_RENDER_FIRST_FRAME_ON_VIEW,
        EVT_VIDEO_EVENT_REQUEST_KEY_FRAME,
        EVT_VIDEO_CAPTURE_FIRST_FRAME,
        EVT_VIDEO_CAPTURE_CAMERA_START_SUCCESS,
        EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_START_SUCCESS,
        EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_STOP_SUCCESS,
        EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_INTERRUPTED,
        EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_RESUME,
        EVT_VIDEO_ENCODE_START_SUCCESS,
        EVT_VIDEO_CAPTURE_CAMERA_STUCK,
        EVT_VIDEO_HARDWARE_ENCODER_STUCK,
        EVT_VIDEO_HARDWARE_DECODER_STUCK,
        EVT_VIDEO_CAPTURE_VIRTUAL_CAMERA_SIZE_CHANGE_SUCCESS,
        EVT_VIDEO_CAPTURE_VIRTUAL_CAMERA_START_SUCCESS,
        EVT_VIDEO_CAPTURE_VIRTUAL_CAMERA_STOP_SUCCESS,
        EVT_VIDEO_PREPROCESS_FACE_RECOGNIZE_SUCESS,
        EVT_VIDEO_PREPROCESS_FACE_RECOGNIZE_FAILED,
        EVT_VIDEO_PREPROCESS_COSMETIC_FIRST_USE,
        EVT_VIDEO_ENCODE_STOP_SUCCESS,
        EVT_VIDEO_ENCODE_SW_TO_HW_CPU_USAGE,
        EVT_VIDEO_ENCODE_HW_TO_SW_MEDIACODEC_NOT_WORK,
        EVT_VIDEO_CONSUMER_RECEIVE_FIRST_FRAME,
        EVT_VIDEO_DECODE_START_DECODE_FIRST_FRAME,
        EVT_VIDEO_DECODE_START_SUCCESS,
        EVT_VIDEO_DECODE_SW_TO_HW_REMOTE_VIDEO_DISABLE_RPS
    }

    /* loaded from: classes16.dex */
    public enum c {
        WARNING_VIDEO_ENCODE_EGL_CORE_CREATE_FAILED(100),
        WARNING_VIDEO_ENCODE_START_FAILED_INSUFFICIENT_RESOURCE(101),
        WARNING_VIDEO_ENCODE_START_FAILED(102),
        WARNING_VIDEO_ENCODE_SWAP_BUFFER(103),
        WARNING_VIDEO_RENDER_EGL_CORE_CREATE_FAILED(200),
        WARNING_VIDEO_RENDER_EGL_CORE_DESTROY_FAILED(201),
        WARNING_VIDEO_RENDER_SWAP_BUFFER(202),
        WARNING_VIDEO_DECODE_EGL_CORE_CREATE_FAILED(300),
        WARNING_VIDEO_DECODE_START_FAILED_ILLEGAL_ARGUMENT(301),
        WARNING_VIDEO_DECODE_START_FAILED_ILLEGAL_STATE(302),
        WARNING_VIDEO_DECODE_START_FAILED_INSUFFICIENT_RESOURCE(303),
        WARNING_VIDEO_DECODE_START_FAILED_OUT_OF_MEMORY(304),
        WARNING_VIDEO_DECODE_START_FAILED(305),
        WARNING_VIDEO_DECODE_RESTART_WHEN_DECODE_ERROR(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET),
        WARNING_VIDEO_DECODE_ERROR_NOT_SUPPORT_PIXEL_FORMAT_TYPE(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE),
        WARNING_VIDEO_DECODE_FATAL_ERROR(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR),
        WARNING_VIDEO_DECODE_CACHE_EXCEEDED(1000),
        WARNING_VIDEO_DECODE_ABNORMAL(1001),
        WARNING_VIDEO_DECODE_EGL_CORE_DESTROY_FAILED(1002),
        WARNING_VIDEO_DECODE_HARDWARE_ERROR(1003),
        WARNING_OUT_OF_MEMORY(2000);

        public final int mValue;

        c(int i17) {
            this.mValue = i17;
        }
    }

    public static int a(com.tencent.liteav.videobase.videobase.e.a aVar) {
        java.util.Map<com.tencent.liteav.videobase.videobase.e.a, java.lang.Integer> map = f46835a;
        if (map.containsKey(aVar)) {
            return map.get(aVar).intValue();
        }
        return 0;
    }
}
