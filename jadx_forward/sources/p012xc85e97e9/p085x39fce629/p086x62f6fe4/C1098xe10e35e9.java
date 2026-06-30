package p012xc85e97e9.p085x39fce629.p086x62f6fe4;

/* renamed from: androidx.exifinterface.media.ExifInterface */
/* loaded from: classes13.dex */
public class C1098xe10e35e9 {

    /* renamed from: ALTITUDE_ABOVE_SEA_LEVEL */
    public static final short f2900xde9ce175 = 0;

    /* renamed from: ALTITUDE_BELOW_SEA_LEVEL */
    public static final short f2901x54c1a109 = 1;

    /* renamed from: ASCII */
    private static final java.nio.charset.Charset f2902x3bab731;

    /* renamed from: BYTE_ALIGN_II */
    static final short f2906x77eaaa11 = 18761;

    /* renamed from: BYTE_ALIGN_MM */
    static final short f2907x77eaaa91 = 19789;

    /* renamed from: COLOR_SPACE_S_RGB */
    public static final int f2908xb5426b2c = 1;

    /* renamed from: COLOR_SPACE_UNCALIBRATED */
    public static final int f2909x30f2f30b = 65535;

    /* renamed from: CONTRAST_HARD */
    public static final short f2910xeb550008 = 2;

    /* renamed from: CONTRAST_NORMAL */
    public static final short f2911x7517a4c4 = 0;

    /* renamed from: CONTRAST_SOFT */
    public static final short f2912xeb5a3347 = 1;

    /* renamed from: DATA_DEFLATE_ZIP */
    public static final int f2913xa4bbbb8 = 8;

    /* renamed from: DATA_HUFFMAN_COMPRESSED */
    public static final int f2914x91d0fa28 = 2;

    /* renamed from: DATA_JPEG */
    public static final int f2915x922de3dd = 6;

    /* renamed from: DATA_JPEG_COMPRESSED */
    public static final int f2916xb174e923 = 7;

    /* renamed from: DATA_LOSSY_JPEG */
    public static final int f2917x685f5926 = 34892;

    /* renamed from: DATA_PACK_BITS_COMPRESSED */
    public static final int f2918x464a6ba9 = 32773;

    /* renamed from: DATA_UNCOMPRESSED */
    public static final int f2919xfda5b94f = 1;

    /* renamed from: DATETIME_PRIMARY_FORMAT_PATTERN */
    private static final java.util.regex.Pattern f2920xeff3069;

    /* renamed from: DATETIME_SECONDARY_FORMAT_PATTERN */
    private static final java.util.regex.Pattern f2921x677bf5b7;

    /* renamed from: DATETIME_VALUE_STRING_LENGTH */
    private static final int f2922xa48449a2 = 19;

    /* renamed from: EXIF_POINTER_TAGS */
    private static final p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] f2925x45e4d7ca;

    /* renamed from: EXIF_TAGS */
    static final p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[][] f2926x3e555de8;

    /* renamed from: EXPOSURE_MODE_AUTO */
    public static final short f2927xc988f593 = 0;

    /* renamed from: EXPOSURE_MODE_AUTO_BRACKET */
    public static final short f2928x229b91dc = 2;

    /* renamed from: EXPOSURE_MODE_MANUAL */
    public static final short f2929x9e7f92aa = 1;

    /* renamed from: EXPOSURE_PROGRAM_ACTION */
    public static final short f2930x74427ea9 = 6;

    /* renamed from: EXPOSURE_PROGRAM_APERTURE_PRIORITY */
    public static final short f2931xa98d0f20 = 3;

    /* renamed from: EXPOSURE_PROGRAM_CREATIVE */
    public static final short f2932x3cd61b62 = 5;

    /* renamed from: EXPOSURE_PROGRAM_LANDSCAPE_MODE */
    public static final short f2933x38633a3a = 8;

    /* renamed from: EXPOSURE_PROGRAM_MANUAL */
    public static final short f2934x889de839 = 1;

    /* renamed from: EXPOSURE_PROGRAM_NORMAL */
    public static final short f2935x8b19bd5a = 2;

    /* renamed from: EXPOSURE_PROGRAM_NOT_DEFINED */
    public static final short f2936xa7241fca = 0;

    /* renamed from: EXPOSURE_PROGRAM_PORTRAIT_MODE */
    public static final short f2937xd154e3f4 = 7;

    /* renamed from: EXPOSURE_PROGRAM_SHUTTER_PRIORITY */
    public static final short f2938x3c488689 = 4;

    /* renamed from: FILE_SOURCE_DSC */
    public static final short f2939xf7a17213 = 3;

    /* renamed from: FILE_SOURCE_OTHER */
    public static final short f2940x95a8cbaf = 0;

    /* renamed from: FILE_SOURCE_REFLEX_SCANNER */
    public static final short f2941xea170f6c = 2;

    /* renamed from: FILE_SOURCE_TRANSPARENT_SCANNER */
    public static final short f2942x83a45250 = 1;

    /* renamed from: FLAG_FLASH_FIRED */
    public static final short f2943xcc2bab4c = 1;

    /* renamed from: FLAG_FLASH_MODE_AUTO */
    public static final short f2944xc6b74e49 = 24;

    /* renamed from: FLAG_FLASH_MODE_COMPULSORY_FIRING */
    public static final short f2945xb66cef8f = 8;

    /* renamed from: FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION */
    public static final short f2946xbdeae077 = 16;

    /* renamed from: FLAG_FLASH_NO_FLASH_FUNCTION */
    public static final short f2947x6200f723 = 32;

    /* renamed from: FLAG_FLASH_RED_EYE_SUPPORTED */
    public static final short f2948x89334610 = 64;

    /* renamed from: FLAG_FLASH_RETURN_LIGHT_DETECTED */
    public static final short f2949x878dfd18 = 6;

    /* renamed from: FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED */
    public static final short f2950x7c969e24 = 4;

    /* renamed from: FORMAT_CHUNKY */
    public static final short f2952x96241cf4 = 1;

    /* renamed from: FORMAT_PLANAR */
    public static final short f2953xac826262 = 2;

    /* renamed from: GAIN_CONTROL_HIGH_GAIN_DOWN */
    public static final short f2954x574ef07 = 4;

    /* renamed from: GAIN_CONTROL_HIGH_GAIN_UP */
    public static final short f2955x34c03240 = 2;

    /* renamed from: GAIN_CONTROL_LOW_GAIN_DOWN */
    public static final short f2956xe74c39d5 = 3;

    /* renamed from: GAIN_CONTROL_LOW_GAIN_UP */
    public static final short f2957xc1e7d88e = 1;

    /* renamed from: GAIN_CONTROL_NONE */
    public static final short f2958xc40cb9ba = 0;

    /* renamed from: GPS_DIRECTION_MAGNETIC */
    public static final java.lang.String f2959x7d71a0b9 = "M";

    /* renamed from: GPS_DIRECTION_TRUE */
    public static final java.lang.String f2960xe17f46c3 = "T";

    /* renamed from: GPS_DISTANCE_KILOMETERS */
    public static final java.lang.String f2961x6e975800 = "K";

    /* renamed from: GPS_DISTANCE_MILES */
    public static final java.lang.String f2962xdc242e69 = "M";

    /* renamed from: GPS_DISTANCE_NAUTICAL_MILES */
    public static final java.lang.String f2963x5b463ecb = "N";

    /* renamed from: GPS_MEASUREMENT_2D */
    public static final java.lang.String f2964xa4f9fa2a = "2";

    /* renamed from: GPS_MEASUREMENT_3D */
    public static final java.lang.String f2965xa4f9fa49 = "3";

    /* renamed from: GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED */
    public static final short f2966x72d51e7d = 1;

    /* renamed from: GPS_MEASUREMENT_INTERRUPTED */
    public static final java.lang.String f2967xc3bba14a = "V";

    /* renamed from: GPS_MEASUREMENT_IN_PROGRESS */
    public static final java.lang.String f2968x9376332f = "A";

    /* renamed from: GPS_MEASUREMENT_NO_DIFFERENTIAL */
    public static final short f2969xeae92461 = 0;

    /* renamed from: GPS_SPEED_KILOMETERS_PER_HOUR */
    public static final java.lang.String f2970x756f996d = "K";

    /* renamed from: GPS_SPEED_KNOTS */
    public static final java.lang.String f2971xf756f07e = "N";

    /* renamed from: GPS_SPEED_MILES_PER_HOUR */
    public static final java.lang.String f2972x9968ffd4 = "M";

    /* renamed from: GPS_TIMESTAMP_PATTERN */
    private static final java.util.regex.Pattern f2973x33ffb0b2;

    /* renamed from: IDENTIFIER_EXIF_APP1 */
    static final byte[] f2979x509c8809;

    /* renamed from: IDENTIFIER_XMP_APP1 */
    private static final byte[] f2980x355db2ea;

    /* renamed from: IFD_EXIF_TAGS */
    private static final p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] f2981x9045e670;

    /* renamed from: IFD_FORMAT_BYTE */
    private static final int f2982x70ef8ed8 = 1;

    /* renamed from: IFD_FORMAT_DOUBLE */
    private static final int f2984xf62471a1 = 12;

    /* renamed from: IFD_FORMAT_IFD */
    private static final int f2985x1c6aeaf7 = 13;

    /* renamed from: IFD_FORMAT_SBYTE */
    private static final int f2987xade77c0b = 6;

    /* renamed from: IFD_FORMAT_SINGLE */
    private static final int f2988xf657a18 = 11;

    /* renamed from: IFD_FORMAT_SLONG */
    private static final int f2989xadebe17f = 9;

    /* renamed from: IFD_FORMAT_SRATIONAL */
    private static final int f2990xbf3f32b1 = 10;

    /* renamed from: IFD_FORMAT_SSHORT */
    private static final int f2991xfefc9b9 = 8;

    /* renamed from: IFD_FORMAT_STRING */
    private static final int f2992x100255e1 = 2;

    /* renamed from: IFD_FORMAT_ULONG */
    private static final int f2993xae081081 = 4;

    /* renamed from: IFD_FORMAT_UNDEFINED */
    private static final int f2994xcd305d60 = 7;

    /* renamed from: IFD_FORMAT_URATIONAL */
    private static final int f2995xe7c810b3 = 5;

    /* renamed from: IFD_FORMAT_USHORT */
    private static final int f2996x13597af7 = 3;

    /* renamed from: IFD_GPS_TAGS */
    private static final p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] f2997xbb825d26;

    /* renamed from: IFD_INTEROPERABILITY_TAGS */
    private static final p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] f2998x473a44c0;

    /* renamed from: IFD_OFFSET */
    private static final int f2999xf7b1dd0b = 8;

    /* renamed from: IFD_THUMBNAIL_TAGS */
    private static final p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] f3000xc4bb024;

    /* renamed from: IFD_TIFF_TAGS */
    private static final p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] f3001x8b6414ab;

    /* renamed from: IFD_TYPE_EXIF */
    private static final int f3002x18b9df7d = 1;

    /* renamed from: IFD_TYPE_GPS */
    private static final int f3003xd781e47d = 2;

    /* renamed from: IFD_TYPE_INTEROPERABILITY */
    private static final int f3004xdd487ad = 3;

    /* renamed from: IFD_TYPE_ORF_CAMERA_SETTINGS */
    private static final int f3005xe49f8c74 = 7;

    /* renamed from: IFD_TYPE_ORF_IMAGE_PROCESSING */
    private static final int f3006x12549f00 = 8;

    /* renamed from: IFD_TYPE_ORF_MAKER_NOTE */
    private static final int f3007x417cbc56 = 6;

    /* renamed from: IFD_TYPE_PEF */
    private static final int f3008xd78204e4 = 9;

    /* renamed from: IFD_TYPE_PREVIEW */
    private static final int f3009xa1b60e1b = 5;

    /* renamed from: IFD_TYPE_PRIMARY */
    private static final int f3010xa1ea3855 = 0;

    /* renamed from: IFD_TYPE_THUMBNAIL */
    private static final int f3011x8d5a2e7f = 4;

    /* renamed from: IMAGE_TYPE_AVIF */
    private static final int f3012xd07d1bf3 = 15;

    /* renamed from: IMAGE_TYPE_DNG */
    private static final int f3013x48ca44fc = 3;

    /* renamed from: IMAGE_TYPE_HEIC */
    private static final int f3014xd0800ab8 = 12;

    /* renamed from: IMAGE_TYPE_JPEG */
    private static final int f3015xd0811c49 = 4;

    /* renamed from: IMAGE_TYPE_ORF */
    private static final int f3016x48ca6ec2 = 7;

    /* renamed from: IMAGE_TYPE_PEF */
    private static final int f3017x48ca70f0 = 8;

    /* renamed from: IMAGE_TYPE_PNG */
    private static final int f3018x48ca7208 = 13;

    /* renamed from: IMAGE_TYPE_RAF */
    private static final int f3019x48ca77f6 = 9;

    /* renamed from: IMAGE_TYPE_RW2 */
    private static final int f3020x48ca7a8c = 10;

    /* renamed from: IMAGE_TYPE_UNKNOWN */
    private static final int f3021x238e5ca9 = 0;

    /* renamed from: IMAGE_TYPE_WEBP */
    private static final int f3022xd086db7d = 14;

    /* renamed from: LATITUDE_NORTH */
    public static final java.lang.String f3024x7bda4f52 = "N";

    /* renamed from: LATITUDE_SOUTH */
    public static final java.lang.String f3025x7c20d01a = "S";

    /* renamed from: LIGHT_SOURCE_CLOUDY_WEATHER */
    public static final short f3026x9614dd94 = 10;

    /* renamed from: LIGHT_SOURCE_COOL_WHITE_FLUORESCENT */
    public static final short f3027xea9834b7 = 14;

    /* renamed from: LIGHT_SOURCE_D50 */
    public static final short f3028xf2228ea4 = 23;

    /* renamed from: LIGHT_SOURCE_D55 */
    public static final short f3029xf2228ea9 = 20;

    /* renamed from: LIGHT_SOURCE_D65 */
    public static final short f3030xf2228ec8 = 21;

    /* renamed from: LIGHT_SOURCE_D75 */
    public static final short f3031xf2228ee7 = 22;

    /* renamed from: LIGHT_SOURCE_DAYLIGHT */
    public static final short f3032x4033ad55 = 1;

    /* renamed from: LIGHT_SOURCE_DAYLIGHT_FLUORESCENT */
    public static final short f3033x15405c5e = 12;

    /* renamed from: LIGHT_SOURCE_DAY_WHITE_FLUORESCENT */
    public static final short f3034x1c146094 = 13;

    /* renamed from: LIGHT_SOURCE_FINE_WEATHER */
    public static final short f3035xd87f832a = 9;

    /* renamed from: LIGHT_SOURCE_FLASH */
    public static final short f3036xf3e06355 = 4;

    /* renamed from: LIGHT_SOURCE_FLUORESCENT */
    public static final short f3037xa67d9c0d = 2;

    /* renamed from: LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN */
    public static final short f3038x639714f8 = 24;

    /* renamed from: LIGHT_SOURCE_OTHER */
    public static final short f3039xf462f275 = 255;

    /* renamed from: LIGHT_SOURCE_SHADE */
    public static final short f3040xf495c192 = 11;

    /* renamed from: LIGHT_SOURCE_STANDARD_LIGHT_A */
    public static final short f3041xce482b11 = 17;

    /* renamed from: LIGHT_SOURCE_STANDARD_LIGHT_B */
    public static final short f3042xce482b12 = 18;

    /* renamed from: LIGHT_SOURCE_STANDARD_LIGHT_C */
    public static final short f3043xce482b13 = 19;

    /* renamed from: LIGHT_SOURCE_TUNGSTEN */
    public static final short f3044xcd3c141f = 3;

    /* renamed from: LIGHT_SOURCE_UNKNOWN */
    public static final short f3045x9ac6d66f = 0;

    /* renamed from: LIGHT_SOURCE_WARM_WHITE_FLUORESCENT */
    public static final short f3046x413d40f3 = 16;

    /* renamed from: LIGHT_SOURCE_WHITE_FLUORESCENT */
    public static final short f3047x87bc6117 = 15;

    /* renamed from: LONGITUDE_EAST */
    public static final java.lang.String f3048xa13f9cad = "E";

    /* renamed from: LONGITUDE_WEST */
    public static final java.lang.String f3049xa147da5f = "W";

    /* renamed from: MARKER_APP1 */
    static final byte f3051x8fa80735 = -31;

    /* renamed from: MARKER_COM */
    private static final byte f3052x5f790fdc = -2;

    /* renamed from: MARKER_EOI */
    private static final byte f3053x5f79175a = -39;

    /* renamed from: MARKER_SOF0 */
    private static final byte f3054x8fb030eb = -64;

    /* renamed from: MARKER_SOF1 */
    private static final byte f3055x8fb030ec = -63;

    /* renamed from: MARKER_SOF10 */
    private static final byte f3056x6655ecc4 = -54;

    /* renamed from: MARKER_SOF11 */
    private static final byte f3057x6655ecc5 = -53;

    /* renamed from: MARKER_SOF13 */
    private static final byte f3058x6655ecc7 = -51;

    /* renamed from: MARKER_SOF14 */
    private static final byte f3059x6655ecc8 = -50;

    /* renamed from: MARKER_SOF15 */
    private static final byte f3060x6655ecc9 = -49;

    /* renamed from: MARKER_SOF2 */
    private static final byte f3061x8fb030ed = -62;

    /* renamed from: MARKER_SOF3 */
    private static final byte f3062x8fb030ee = -61;

    /* renamed from: MARKER_SOF5 */
    private static final byte f3063x8fb030f0 = -59;

    /* renamed from: MARKER_SOF6 */
    private static final byte f3064x8fb030f1 = -58;

    /* renamed from: MARKER_SOF7 */
    private static final byte f3065x8fb030f2 = -57;

    /* renamed from: MARKER_SOF9 */
    private static final byte f3066x8fb030f4 = -55;

    /* renamed from: MARKER_SOS */
    private static final byte f3068x5f794bf2 = -38;

    /* renamed from: MAX_THUMBNAIL_SIZE */
    private static final int f3069x2aa6e3ef = 512;

    /* renamed from: METERING_MODE_AVERAGE */
    public static final short f3070xf86aa27 = 1;

    /* renamed from: METERING_MODE_CENTER_WEIGHT_AVERAGE */
    public static final short f3071xd765570a = 2;

    /* renamed from: METERING_MODE_MULTI_SPOT */
    public static final short f3072xf734ebfe = 4;

    /* renamed from: METERING_MODE_OTHER */
    public static final short f3073x16e4c99a = 255;

    /* renamed from: METERING_MODE_PARTIAL */
    public static final short f3074x5e6958b = 6;

    /* renamed from: METERING_MODE_PATTERN */
    public static final short f3075x602b79a = 5;

    /* renamed from: METERING_MODE_SPOT */
    public static final short f3076xf03ab118 = 3;

    /* renamed from: METERING_MODE_UNKNOWN */
    public static final short f3077x242f7854 = 0;

    /* renamed from: NON_ZERO_TIME_PATTERN */
    private static final java.util.regex.Pattern f3078x8387723;

    /* renamed from: ORF_CAMERA_SETTINGS_TAGS */
    private static final p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] f3079x2d354b17;

    /* renamed from: ORF_IMAGE_PROCESSING_TAGS */
    private static final p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] f3080xda989e45;

    /* renamed from: ORF_MAKER_NOTE_HEADER_1_SIZE */
    private static final int f3082x17d76dab = 8;

    /* renamed from: ORF_MAKER_NOTE_HEADER_2_SIZE */
    private static final int f3084x198c464a = 12;

    /* renamed from: ORF_MAKER_NOTE_TAGS */
    private static final p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] f3085xeffae46f;

    /* renamed from: ORF_SIGNATURE_1 */
    private static final short f3086xddce72ce = 20306;

    /* renamed from: ORF_SIGNATURE_2 */
    private static final short f3087xddce72cf = 21330;

    /* renamed from: ORIENTATION_FLIP_HORIZONTAL */
    public static final int f3088x2b73bea7 = 2;

    /* renamed from: ORIENTATION_FLIP_VERTICAL */
    public static final int f3089x568c62b9 = 4;

    /* renamed from: ORIENTATION_NORMAL */
    public static final int f3090x2995de56 = 1;

    /* renamed from: ORIENTATION_ROTATE_180 */
    public static final int f3091xda8577f4 = 3;

    /* renamed from: ORIENTATION_ROTATE_270 */
    public static final int f3092xda857b96 = 8;

    /* renamed from: ORIENTATION_ROTATE_90 */
    public static final int f3093xfeca80ac = 6;

    /* renamed from: ORIENTATION_TRANSPOSE */
    public static final int f3094x88062f4a = 5;

    /* renamed from: ORIENTATION_TRANSVERSE */
    public static final int f3095x790fb97c = 7;

    /* renamed from: ORIENTATION_UNDEFINED */
    public static final int f3096xb629961 = 0;

    /* renamed from: ORIGINAL_RESOLUTION_IMAGE */
    public static final int f3097xf190ec96 = 0;

    /* renamed from: PEF_MAKER_NOTE_SKIP_SIZE */
    private static final int f3098xe6b11ebd = 6;

    /* renamed from: PEF_SIGNATURE */
    private static final java.lang.String f3099xdfb31eca = "PENTAX";

    /* renamed from: PEF_TAGS */
    private static final p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] f3100x35411ea7;

    /* renamed from: PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO */
    public static final int f3101x5b8c5b23 = 1;

    /* renamed from: PHOTOMETRIC_INTERPRETATION_RGB */
    public static final int f3102x9081f13 = 2;

    /* renamed from: PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO */
    public static final int f3103x33f0cd4d = 0;

    /* renamed from: PHOTOMETRIC_INTERPRETATION_YCBCR */
    public static final int f3104xe7dd81cd = 6;

    /* renamed from: PNG_CHUNK_CRC_BYTE_LENGTH */
    private static final int f3105xcfce304a = 4;

    /* renamed from: PNG_CHUNK_TYPE_EXIF */
    private static final int f3106xdf69194d = 1700284774;

    /* renamed from: PNG_CHUNK_TYPE_IEND */
    private static final int f3107xdf6aa40f = 1229278788;

    /* renamed from: PNG_CHUNK_TYPE_IHDR */
    private static final int f3108xdf6aae2a = 1229472850;

    /* renamed from: PNG_CHUNK_TYPE_ITXT */
    private static final int f3109xdf6adda4 = 1767135348;

    /* renamed from: RAF_OFFSET_TO_JPEG_IMAGE_OFFSET */
    private static final int f3112x47c09dae = 84;

    /* renamed from: RAF_SIGNATURE */
    private static final java.lang.String f3113x9df29650 = "FUJIFILMCCD-RAW";

    /* renamed from: RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY */
    private static final java.util.Set<java.lang.String> f3114xef53f2d2;

    /* renamed from: REDUCED_RESOLUTION_IMAGE */
    public static final int f3115x1fa35669 = 1;

    /* renamed from: RENDERED_PROCESS_CUSTOM */
    public static final short f3116xcdab882b = 1;

    /* renamed from: RENDERED_PROCESS_NORMAL */
    public static final short f3117xe01bb9a1 = 0;

    /* renamed from: RESOLUTION_UNIT_CENTIMETERS */
    public static final short f3118x230ae5e3 = 3;

    /* renamed from: RESOLUTION_UNIT_INCHES */
    public static final short f3119x6cacca80 = 2;

    /* renamed from: RW2_SIGNATURE */
    private static final short f3121xa558d566 = 85;

    /* renamed from: SATURATION_HIGH */
    public static final short f3122x2781b9ef = 0;

    /* renamed from: SATURATION_LOW */
    public static final short f3123x5c1d0547 = 0;

    /* renamed from: SATURATION_NORMAL */
    public static final short f3124x5891b5f4 = 0;

    /* renamed from: SCENE_CAPTURE_TYPE_LANDSCAPE */
    public static final short f3125x91cf342 = 1;

    /* renamed from: SCENE_CAPTURE_TYPE_NIGHT */
    public static final short f3126xab14c81f = 3;

    /* renamed from: SCENE_CAPTURE_TYPE_PORTRAIT */
    public static final short f3127x7fa8a14 = 2;

    /* renamed from: SCENE_CAPTURE_TYPE_STANDARD */
    public static final short f3128x2abfed36 = 0;

    /* renamed from: SCENE_TYPE_DIRECTLY_PHOTOGRAPHED */
    public static final short f3129x814362d2 = 1;

    /* renamed from: SENSITIVITY_TYPE_ISO_SPEED */
    public static final short f3130x2558b6c8 = 3;

    /* renamed from: SENSITIVITY_TYPE_REI */
    public static final short f3131xf0cea3b1 = 2;

    /* renamed from: SENSITIVITY_TYPE_REI_AND_ISO */
    public static final short f3132xdcd59f4f = 6;

    /* renamed from: SENSITIVITY_TYPE_SOS */
    public static final short f3133xf0cea8b2 = 1;

    /* renamed from: SENSITIVITY_TYPE_SOS_AND_ISO */
    public static final short f3134xc7451350 = 5;

    /* renamed from: SENSITIVITY_TYPE_SOS_AND_REI */
    public static final short f3135xc7453361 = 4;

    /* renamed from: SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO */
    public static final short f3136x6597eff = 7;

    /* renamed from: SENSITIVITY_TYPE_UNKNOWN */
    public static final short f3137x8ad289e5 = 0;

    /* renamed from: SENSOR_TYPE_COLOR_SEQUENTIAL */
    public static final short f3138x769deb1b = 5;

    /* renamed from: SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR */
    public static final short f3139x1efcf0c9 = 8;

    /* renamed from: SENSOR_TYPE_NOT_DEFINED */
    public static final short f3140x127b80bd = 1;

    /* renamed from: SENSOR_TYPE_ONE_CHIP */
    public static final short f3141xc5a8c645 = 2;

    /* renamed from: SENSOR_TYPE_THREE_CHIP */
    public static final short f3142x361d260d = 4;

    /* renamed from: SENSOR_TYPE_TRILINEAR */
    public static final short f3143x27cef0d0 = 7;

    /* renamed from: SENSOR_TYPE_TWO_CHIP */
    public static final short f3144xba37321f = 3;

    /* renamed from: SHARPNESS_HARD */
    public static final short f3145x32409949 = 2;

    /* renamed from: SHARPNESS_NORMAL */
    public static final short f3146xaf81f1c5 = 0;

    /* renamed from: SHARPNESS_SOFT */
    public static final short f3147x3245cc88 = 1;

    /* renamed from: SIGNATURE_CHECK_SIZE */
    private static final int f3148x517152ff = 5000;

    /* renamed from: SKIP_BUFFER_SIZE */
    private static final int f3149x86ae25e0 = 8192;

    /* renamed from: STREAM_TYPE_EXIF_DATA_ONLY */
    public static final int f3151xc4181718 = 1;

    /* renamed from: STREAM_TYPE_FULL_IMAGE_DATA */
    public static final int f3152x81b20838 = 0;

    /* renamed from: SUBJECT_DISTANCE_RANGE_CLOSE_VIEW */
    public static final short f3153xf29c0ea5 = 2;

    /* renamed from: SUBJECT_DISTANCE_RANGE_DISTANT_VIEW */
    public static final short f3154x4545f97c = 3;

    /* renamed from: SUBJECT_DISTANCE_RANGE_MACRO */
    public static final short f3155xd83b6a13 = 1;

    /* renamed from: SUBJECT_DISTANCE_RANGE_UNKNOWN */
    public static final short f3156x74d900d1 = 0;

    /* renamed from: TAG_APERTURE_VALUE */
    public static final java.lang.String f3157x1b3ce347 = "ApertureValue";

    /* renamed from: TAG_ARTIST */
    public static final java.lang.String f3158xb1f28fac = "Artist";

    /* renamed from: TAG_BITS_PER_SAMPLE */
    public static final java.lang.String f3159xd4c56940 = "BitsPerSample";

    /* renamed from: TAG_BODY_SERIAL_NUMBER */
    public static final java.lang.String f3160xdb554cfc = "BodySerialNumber";

    /* renamed from: TAG_BRIGHTNESS_VALUE */
    public static final java.lang.String f3161x10c61608 = "BrightnessValue";

    /* renamed from: TAG_CAMARA_OWNER_NAME */
    @java.lang.Deprecated
    public static final java.lang.String f3162x8c4cd610 = "CameraOwnerName";

    /* renamed from: TAG_CAMERA_OWNER_NAME */
    public static final java.lang.String f3163x13c3fc8c = "CameraOwnerName";

    /* renamed from: TAG_CFA_PATTERN */
    public static final java.lang.String f3164xc8163f2a = "CFAPattern";

    /* renamed from: TAG_COLOR_SPACE */
    public static final java.lang.String f3165xdc770fa5 = "ColorSpace";

    /* renamed from: TAG_COMPONENTS_CONFIGURATION */
    public static final java.lang.String f3166x3b48fc92 = "ComponentsConfiguration";

    /* renamed from: TAG_COMPRESSED_BITS_PER_PIXEL */
    public static final java.lang.String f3167x8210a8a4 = "CompressedBitsPerPixel";

    /* renamed from: TAG_COMPRESSION */
    public static final java.lang.String f3168xac402801 = "Compression";

    /* renamed from: TAG_CONTRAST */
    public static final java.lang.String f3169x26fa3a27 = "Contrast";

    /* renamed from: TAG_COPYRIGHT */
    public static final java.lang.String f3170x2aa53122 = "Copyright";

    /* renamed from: TAG_CUSTOM_RENDERED */
    public static final java.lang.String f3171x5a3d16fe = "CustomRendered";

    /* renamed from: TAG_DATETIME */
    public static final java.lang.String f3172xb3aee2a0 = "DateTime";

    /* renamed from: TAG_DATETIME_DIGITIZED */
    public static final java.lang.String f3173x3cbed13e = "DateTimeDigitized";

    /* renamed from: TAG_DATETIME_ORIGINAL */
    public static final java.lang.String f3174x9a13bc90 = "DateTimeOriginal";

    /* renamed from: TAG_DEFAULT_CROP_SIZE */
    public static final java.lang.String f3175x4efe22d = "DefaultCropSize";

    /* renamed from: TAG_DEVICE_SETTING_DESCRIPTION */
    public static final java.lang.String f3176xf4cbf8c9 = "DeviceSettingDescription";

    /* renamed from: TAG_DIGITAL_ZOOM_RATIO */
    public static final java.lang.String f3177xc41c2a0b = "DigitalZoomRatio";

    /* renamed from: TAG_DNG_VERSION */
    public static final java.lang.String f3178xbcfd4631 = "DNGVersion";

    /* renamed from: TAG_EXIF_IFD_POINTER */
    private static final java.lang.String f3179x1a8c0e1b = "ExifIFDPointer";

    /* renamed from: TAG_EXIF_VERSION */
    public static final java.lang.String f3180x3d2c0d2e = "ExifVersion";

    /* renamed from: TAG_EXPOSURE_BIAS_VALUE */
    public static final java.lang.String f3181x109b063e = "ExposureBiasValue";

    /* renamed from: TAG_EXPOSURE_INDEX */
    public static final java.lang.String f3182xb7c566df = "ExposureIndex";

    /* renamed from: TAG_EXPOSURE_MODE */
    public static final java.lang.String f3183x504201d6 = "ExposureMode";

    /* renamed from: TAG_EXPOSURE_PROGRAM */
    public static final java.lang.String f3184x55c20951 = "ExposureProgram";

    /* renamed from: TAG_EXPOSURE_TIME */
    public static final java.lang.String f3185x50451b00 = "ExposureTime";

    /* renamed from: TAG_FILE_SOURCE */
    public static final java.lang.String f3186x6da1c2f9 = "FileSource";

    /* renamed from: TAG_FLASH */
    public static final java.lang.String f3187x58959acb = "Flash";

    /* renamed from: TAG_FLASHPIX_VERSION */
    public static final java.lang.String f3188xd3e3de4d = "FlashpixVersion";

    /* renamed from: TAG_FLASH_ENERGY */
    public static final java.lang.String f3189xb5f1de7c = "FlashEnergy";

    /* renamed from: TAG_FOCAL_LENGTH */
    public static final java.lang.String f3190x9b5ec6c5 = "FocalLength";

    /* renamed from: TAG_FOCAL_LENGTH_IN_35MM_FILM */
    public static final java.lang.String f3191xdd772cc1 = "FocalLengthIn35mmFilm";

    /* renamed from: TAG_FOCAL_PLANE_RESOLUTION_UNIT */
    public static final java.lang.String f3192xb4e13f75 = "FocalPlaneResolutionUnit";

    /* renamed from: TAG_FOCAL_PLANE_X_RESOLUTION */
    public static final java.lang.String f3193x7cff5d75 = "FocalPlaneXResolution";

    /* renamed from: TAG_FOCAL_PLANE_Y_RESOLUTION */
    public static final java.lang.String f3194x84b102d4 = "FocalPlaneYResolution";

    /* renamed from: TAG_F_NUMBER */
    public static final java.lang.String f3195xad0d4887 = "FNumber";

    /* renamed from: TAG_GAIN_CONTROL */
    public static final java.lang.String f3196xb1e90922 = "GainControl";

    /* renamed from: TAG_GAMMA */
    public static final java.lang.String f3197x589ede82 = "Gamma";

    /* renamed from: TAG_GPS_ALTITUDE */
    public static final java.lang.String f3198x86afef5c = "GPSAltitude";

    /* renamed from: TAG_GPS_ALTITUDE_REF */
    public static final java.lang.String f3199xc45d4d10 = "GPSAltitudeRef";

    /* renamed from: TAG_GPS_AREA_INFORMATION */
    public static final java.lang.String f3200xff5f1f14 = "GPSAreaInformation";

    /* renamed from: TAG_GPS_DATESTAMP */
    public static final java.lang.String f3201x8e8c633b = "GPSDateStamp";

    /* renamed from: TAG_GPS_DEST_BEARING */
    public static final java.lang.String f3202xbee5a6ab = "GPSDestBearing";

    /* renamed from: TAG_GPS_DEST_BEARING_REF */
    public static final java.lang.String f3203xf138c4df = "GPSDestBearingRef";

    /* renamed from: TAG_GPS_DEST_DISTANCE */
    public static final java.lang.String f3204xdffa3c78 = "GPSDestDistance";

    /* renamed from: TAG_GPS_DEST_DISTANCE_REF */
    public static final java.lang.String f3205xa743ac2c = "GPSDestDistanceRef";

    /* renamed from: TAG_GPS_DEST_LATITUDE */
    public static final java.lang.String f3206x78f45cef = "GPSDestLatitude";

    /* renamed from: TAG_GPS_DEST_LATITUDE_REF */
    public static final java.lang.String f3207xfcbab923 = "GPSDestLatitudeRef";

    /* renamed from: TAG_GPS_DEST_LONGITUDE */
    public static final java.lang.String f3208x127d696c = "GPSDestLongitude";

    /* renamed from: TAG_GPS_DEST_LONGITUDE_REF */
    public static final java.lang.String f3209x59bf3f20 = "GPSDestLongitudeRef";

    /* renamed from: TAG_GPS_DIFFERENTIAL */
    public static final java.lang.String f3210x513cdf35 = "GPSDifferential";

    /* renamed from: TAG_GPS_DOP */
    public static final java.lang.String f3211xc656c82b = "GPSDOP";

    /* renamed from: TAG_GPS_H_POSITIONING_ERROR */
    public static final java.lang.String f3212x581f0ef1 = "GPSHPositioningError";

    /* renamed from: TAG_GPS_IMG_DIRECTION */
    public static final java.lang.String f3213x72016d49 = "GPSImgDirection";

    /* renamed from: TAG_GPS_IMG_DIRECTION_REF */
    public static final java.lang.String f3214x8db40c7d = "GPSImgDirectionRef";

    /* renamed from: TAG_GPS_INFO_IFD_POINTER */
    private static final java.lang.String f3215xded2554e = "GPSInfoIFDPointer";

    /* renamed from: TAG_GPS_LATITUDE */
    public static final java.lang.String f3216xb7785126 = "GPSLatitude";

    /* renamed from: TAG_GPS_LATITUDE_REF */
    public static final java.lang.String f3217xb32bb9da = "GPSLatitudeRef";

    /* renamed from: TAG_GPS_LONGITUDE */
    public static final java.lang.String f3218xa477fc15 = "GPSLongitude";

    /* renamed from: TAG_GPS_LONGITUDE_REF */
    public static final java.lang.String f3219x716e5549 = "GPSLongitudeRef";

    /* renamed from: TAG_GPS_MAP_DATUM */
    public static final java.lang.String f3220x1cdda212 = "GPSMapDatum";

    /* renamed from: TAG_GPS_MEASURE_MODE */
    public static final java.lang.String f3221x83f297be = "GPSMeasureMode";

    /* renamed from: TAG_GPS_PROCESSING_METHOD */
    public static final java.lang.String f3222x86a69813 = "GPSProcessingMethod";

    /* renamed from: TAG_GPS_SATELLITES */
    public static final java.lang.String f3223x86eeb8d2 = "GPSSatellites";

    /* renamed from: TAG_GPS_SPEED */
    public static final java.lang.String f3224x8c991dad = "GPSSpeed";

    /* renamed from: TAG_GPS_SPEED_REF */
    public static final java.lang.String f3225x3a74eae1 = "GPSSpeedRef";

    /* renamed from: TAG_GPS_STATUS */
    public static final java.lang.String f3226x6c15f2c = "GPSStatus";

    /* renamed from: TAG_GPS_TIMESTAMP */
    public static final java.lang.String f3227x9f911b7c = "GPSTimeStamp";

    /* renamed from: TAG_GPS_TRACK */
    public static final java.lang.String f3228x8ca80eb1 = "GPSTrack";

    /* renamed from: TAG_GPS_TRACK_REF */
    public static final java.lang.String f3229xc7dbb9e5 = "GPSTrackRef";

    /* renamed from: TAG_GPS_VERSION_ID */
    public static final java.lang.String f3230xc4bfd83c = "GPSVersionID";

    /* renamed from: TAG_IMAGE_DESCRIPTION */
    public static final java.lang.String f3231x7afb2953 = "ImageDescription";

    /* renamed from: TAG_IMAGE_LENGTH */
    public static final java.lang.String f3232x4289cf0f = "ImageLength";

    /* renamed from: TAG_IMAGE_UNIQUE_ID */
    public static final java.lang.String f3233x8e89380 = "ImageUniqueID";

    /* renamed from: TAG_IMAGE_WIDTH */
    public static final java.lang.String f3234x23ca6c5d = "ImageWidth";

    /* renamed from: TAG_INTEROPERABILITY_IFD_POINTER */
    private static final java.lang.String f3235xc426da4b = "InteroperabilityIFDPointer";

    /* renamed from: TAG_INTEROPERABILITY_INDEX */
    public static final java.lang.String f3236x12e2ead8 = "InteroperabilityIndex";

    /* renamed from: TAG_ISO_SPEED */
    public static final java.lang.String f3237x192c9548 = "ISOSpeed";

    /* renamed from: TAG_ISO_SPEED_LATITUDE_YYY */
    public static final java.lang.String f3238xf26fb87d = "ISOSpeedLatitudeyyy";

    /* renamed from: TAG_ISO_SPEED_LATITUDE_ZZZ */
    public static final java.lang.String f3239xf26fbc5e = "ISOSpeedLatitudezzz";

    /* renamed from: TAG_ISO_SPEED_RATINGS */
    @java.lang.Deprecated
    public static final java.lang.String f3240xa702825f = "ISOSpeedRatings";

    /* renamed from: TAG_JPEG_INTERCHANGE_FORMAT */
    public static final java.lang.String f3241x2b607f9c = "JPEGInterchangeFormat";

    /* renamed from: TAG_JPEG_INTERCHANGE_FORMAT_LENGTH */
    public static final java.lang.String f3242x722b24e9 = "JPEGInterchangeFormatLength";

    /* renamed from: TAG_LENS_MAKE */
    public static final java.lang.String f3243xdef0ba0a = "LensMake";

    /* renamed from: TAG_LENS_MODEL */
    public static final java.lang.String f3244xff2cca6d = "LensModel";

    /* renamed from: TAG_LENS_SERIAL_NUMBER */
    public static final java.lang.String f3245x16f3a358 = "LensSerialNumber";

    /* renamed from: TAG_LENS_SPECIFICATION */
    public static final java.lang.String f3246xb5777c47 = "LensSpecification";

    /* renamed from: TAG_LIGHT_SOURCE */
    public static final java.lang.String f3247x76bcd829 = "LightSource";

    /* renamed from: TAG_MAKE */
    public static final java.lang.String f3248x2de8f93 = "Make";

    /* renamed from: TAG_MAKER_NOTE */
    public static final java.lang.String f3249x70f81912 = "MakerNote";

    /* renamed from: TAG_MAX_APERTURE_VALUE */
    public static final java.lang.String f3250x9cc3bd22 = "MaxApertureValue";

    /* renamed from: TAG_METERING_MODE */
    public static final java.lang.String f3251xb7dd8a64 = "MeteringMode";

    /* renamed from: TAG_MODEL */
    public static final java.lang.String f3252x58f9a604 = "Model";

    /* renamed from: TAG_NEW_SUBFILE_TYPE */
    public static final java.lang.String f3253x274df081 = "NewSubfileType";

    /* renamed from: TAG_OECF */
    public static final java.lang.String f3254x2df865e = "OECF";

    /* renamed from: TAG_OFFSET_TIME */
    public static final java.lang.String f3255xa4b949b4 = "OffsetTime";

    /* renamed from: TAG_OFFSET_TIME_DIGITIZED */
    public static final java.lang.String f3256x8f126f52 = "OffsetTimeDigitized";

    /* renamed from: TAG_OFFSET_TIME_ORIGINAL */
    public static final java.lang.String f3257xd68a0bfc = "OffsetTimeOriginal";

    /* renamed from: TAG_ORF_ASPECT_FRAME */
    public static final java.lang.String f3258xfa9c8c7 = "AspectFrame";

    /* renamed from: TAG_ORF_CAMERA_SETTINGS_IFD_POINTER */
    private static final java.lang.String f3259x13bf0b22 = "CameraSettingsIFDPointer";

    /* renamed from: TAG_ORF_IMAGE_PROCESSING_IFD_POINTER */
    private static final java.lang.String f3260xb7311e = "ImageProcessingIFDPointer";

    /* renamed from: TAG_ORF_PREVIEW_IMAGE_LENGTH */
    public static final java.lang.String f3261x8f28fac2 = "PreviewImageLength";

    /* renamed from: TAG_ORF_PREVIEW_IMAGE_START */
    public static final java.lang.String f3262x4f5a14e6 = "PreviewImageStart";

    /* renamed from: TAG_ORF_THUMBNAIL_IMAGE */
    public static final java.lang.String f3263x1a729e47 = "ThumbnailImage";

    /* renamed from: TAG_ORIENTATION */
    public static final java.lang.String f3264x118c46b = "Orientation";

    /* renamed from: TAG_PHOTOGRAPHIC_SENSITIVITY */
    public static final java.lang.String f3265x7309bd5b = "PhotographicSensitivity";

    /* renamed from: TAG_PHOTOMETRIC_INTERPRETATION */
    public static final java.lang.String f3266xa014a58a = "PhotometricInterpretation";

    /* renamed from: TAG_PIXEL_X_DIMENSION */
    public static final java.lang.String f3267x1f11bc41 = "PixelXDimension";

    /* renamed from: TAG_PIXEL_Y_DIMENSION */
    public static final java.lang.String f3268xb3f66f02 = "PixelYDimension";

    /* renamed from: TAG_PLANAR_CONFIGURATION */
    public static final java.lang.String f3269x7d797616 = "PlanarConfiguration";

    /* renamed from: TAG_PRIMARY_CHROMATICITIES */
    public static final java.lang.String f3270x750f24d6 = "PrimaryChromaticities";

    /* renamed from: TAG_RAF_IMAGE_SIZE */
    private static final p012xc85e97e9.p085x39fce629.p086x62f6fe4.d f3271xef4ebd32;

    /* renamed from: TAG_RECOMMENDED_EXPOSURE_INDEX */
    public static final java.lang.String f3272x3cb455e3 = "RecommendedExposureIndex";

    /* renamed from: TAG_REFERENCE_BLACK_WHITE */
    public static final java.lang.String f3273xb491bd90 = "ReferenceBlackWhite";

    /* renamed from: TAG_RELATED_SOUND_FILE */
    public static final java.lang.String f3274x1fbda865 = "RelatedSoundFile";

    /* renamed from: TAG_RESOLUTION_UNIT */
    public static final java.lang.String f3275x4a079672 = "ResolutionUnit";

    /* renamed from: TAG_ROWS_PER_STRIP */
    public static final java.lang.String f3276x4ec871b5 = "RowsPerStrip";

    /* renamed from: TAG_RW2_ISO */
    public static final java.lang.String f3277x165c4bee = "ISO";

    /* renamed from: TAG_RW2_JPG_FROM_RAW */
    public static final java.lang.String f3278x82360b48 = "JpgFromRaw";

    /* renamed from: TAG_RW2_SENSOR_BOTTOM_BORDER */
    public static final java.lang.String f3279xc6446092 = "SensorBottomBorder";

    /* renamed from: TAG_RW2_SENSOR_LEFT_BORDER */
    public static final java.lang.String f3280x93e993b6 = "SensorLeftBorder";

    /* renamed from: TAG_RW2_SENSOR_RIGHT_BORDER */
    public static final java.lang.String f3281xdd2ea5bd = "SensorRightBorder";

    /* renamed from: TAG_RW2_SENSOR_TOP_BORDER */
    public static final java.lang.String f3282x11886be4 = "SensorTopBorder";

    /* renamed from: TAG_SAMPLES_PER_PIXEL */
    public static final java.lang.String f3283xb4bdba49 = "SamplesPerPixel";

    /* renamed from: TAG_SATURATION */
    public static final java.lang.String f3284x1e5ae9b7 = "Saturation";

    /* renamed from: TAG_SCENE_CAPTURE_TYPE */
    public static final java.lang.String f3285x8c29a8b = "SceneCaptureType";

    /* renamed from: TAG_SCENE_TYPE */
    public static final java.lang.String f3286xa9de8512 = "SceneType";

    /* renamed from: TAG_SENSING_METHOD */
    public static final java.lang.String f3287xd367463a = "SensingMethod";

    /* renamed from: TAG_SENSITIVITY_TYPE */
    public static final java.lang.String f3288x49fd871f = "SensitivityType";

    /* renamed from: TAG_SHARPNESS */
    public static final java.lang.String f3289x723a929c = "Sharpness";

    /* renamed from: TAG_SHUTTER_SPEED_VALUE */
    public static final java.lang.String f3290x9c43d182 = "ShutterSpeedValue";

    /* renamed from: TAG_SOFTWARE */
    public static final java.lang.String f3291x976888cc = "Software";

    /* renamed from: TAG_SPATIAL_FREQUENCY_RESPONSE */
    public static final java.lang.String f3292x1dbc6704 = "SpatialFrequencyResponse";

    /* renamed from: TAG_SPECTRAL_SENSITIVITY */
    public static final java.lang.String f3293x6ab1c7c9 = "SpectralSensitivity";

    /* renamed from: TAG_STANDARD_OUTPUT_SENSITIVITY */
    public static final java.lang.String f3294x6bfec5be = "StandardOutputSensitivity";

    /* renamed from: TAG_STRIP_BYTE_COUNTS */
    public static final java.lang.String f3295xbcea680f = "StripByteCounts";

    /* renamed from: TAG_STRIP_OFFSETS */
    public static final java.lang.String f3296x60596bd4 = "StripOffsets";

    /* renamed from: TAG_SUBFILE_TYPE */
    public static final java.lang.String f3297x3e929ea2 = "SubfileType";

    /* renamed from: TAG_SUBJECT_AREA */
    public static final java.lang.String f3298x2d978485 = "SubjectArea";

    /* renamed from: TAG_SUBJECT_DISTANCE */
    public static final java.lang.String f3299x4a217bed = "SubjectDistance";

    /* renamed from: TAG_SUBJECT_DISTANCE_RANGE */
    public static final java.lang.String f3300xabbcba4b = "SubjectDistanceRange";

    /* renamed from: TAG_SUBJECT_LOCATION */
    public static final java.lang.String f3301xaa3f8fad = "SubjectLocation";

    /* renamed from: TAG_SUBSEC_TIME */
    public static final java.lang.String f3302xda8596f6 = "SubSecTime";

    /* renamed from: TAG_SUBSEC_TIME_DIGITIZED */
    public static final java.lang.String f3303x22989214 = "SubSecTimeDigitized";

    /* renamed from: TAG_SUBSEC_TIME_ORIGINAL */
    public static final java.lang.String f3304x783388fa = "SubSecTimeOriginal";

    /* renamed from: TAG_SUB_IFD_POINTER */
    private static final java.lang.String f3305x359faa41 = "SubIFDPointer";

    /* renamed from: TAG_THUMBNAIL_IMAGE_LENGTH */
    public static final java.lang.String f3306xa8fb962 = "ThumbnailImageLength";

    /* renamed from: TAG_THUMBNAIL_IMAGE_WIDTH */
    public static final java.lang.String f3307x43046baa = "ThumbnailImageWidth";

    /* renamed from: TAG_THUMBNAIL_ORIENTATION */
    public static final java.lang.String f3308x2052c3b8 = "ThumbnailOrientation";

    /* renamed from: TAG_TRANSFER_FUNCTION */
    public static final java.lang.String f3309x9ffea827 = "TransferFunction";

    /* renamed from: TAG_USER_COMMENT */
    public static final java.lang.String f3310x158f2670 = "UserComment";

    /* renamed from: TAG_WHITE_BALANCE */
    public static final java.lang.String f3311xea51d481 = "WhiteBalance";

    /* renamed from: TAG_WHITE_POINT */
    public static final java.lang.String f3312x6b0fe475 = "WhitePoint";

    /* renamed from: TAG_XMP */
    public static final java.lang.String f3313xce8b79b6 = "Xmp";

    /* renamed from: TAG_X_RESOLUTION */
    public static final java.lang.String f3314x9f2faf98 = "XResolution";

    /* renamed from: TAG_Y_CB_CR_COEFFICIENTS */
    public static final java.lang.String f3315xfbea6919 = "YCbCrCoefficients";

    /* renamed from: TAG_Y_CB_CR_POSITIONING */
    public static final java.lang.String f3316xd8a3bf5e = "YCbCrPositioning";

    /* renamed from: TAG_Y_CB_CR_SUB_SAMPLING */
    public static final java.lang.String f3317x42e71661 = "YCbCrSubSampling";

    /* renamed from: TAG_Y_RESOLUTION */
    public static final java.lang.String f3318xa6e154f7 = "YResolution";

    /* renamed from: WEBP_CHUNK_SIZE_BYTE_LENGTH */
    private static final int f3319x9bb14a74 = 4;

    /* renamed from: WEBP_CHUNK_TYPE_BYTE_LENGTH */
    private static final int f3322x484fec2d = 4;

    /* renamed from: WEBP_CHUNK_TYPE_VP8X_DEFAULT_LENGTH */
    private static final int f3327x7b90b879 = 10;

    /* renamed from: WEBP_FILE_SIZE_BYTE_LENGTH */
    private static final int f3328x3917eebf = 4;

    /* renamed from: WEBP_VP8L_SIGNATURE */
    private static final byte f3331x5b91cfea = 47;

    /* renamed from: WHITEBALANCE_AUTO */
    @java.lang.Deprecated
    public static final int f3333xcf69f7db = 0;

    /* renamed from: WHITEBALANCE_MANUAL */
    @java.lang.Deprecated
    public static final int f3334xb02922f2 = 1;

    /* renamed from: WHITE_BALANCE_AUTO */
    public static final short f3335x9e5915c8 = 0;

    /* renamed from: WHITE_BALANCE_MANUAL */
    public static final short f3336x7fc8799f = 1;

    /* renamed from: XMP_HANDLING_PREFER_SEPARATE */
    private static final int f3337xca2a6cdc = 2;

    /* renamed from: XMP_HANDLING_PREFER_TIFF_700_IF_PRESENT */
    private static final int f3338x71906c72 = 3;

    /* renamed from: XMP_HANDLING_TIFF_700_ONLY */
    private static final int f3339x4efb2868 = 1;

    /* renamed from: Y_CB_CR_POSITIONING_CENTERED */
    public static final short f3340x2addb0d0 = 1;

    /* renamed from: Y_CB_CR_POSITIONING_CO_SITED */
    public static final short f3341x58d22566 = 2;

    /* renamed from: sExifPointerTagMap */
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> f3342xd7a05c9c;

    /* renamed from: sExifTagMapsForReading */
    private static final java.util.HashMap<java.lang.Integer, p012xc85e97e9.p085x39fce629.p086x62f6fe4.d>[] f3343xb6ea8bd1;

    /* renamed from: sExifTagMapsForWriting */
    private static final java.util.HashMap<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.d>[] f3344xd610b621;

    /* renamed from: sFormatterPrimary */
    private static final java.text.SimpleDateFormat f3345x27d55c6b;

    /* renamed from: sFormatterSecondary */
    private static final java.text.SimpleDateFormat f3346xc502c99d;

    /* renamed from: _hellAccFlag_ */
    private byte f3347x7f11beae;

    /* renamed from: mAreThumbnailStripsConsecutive */
    private boolean f3348x4df34cca;

    /* renamed from: mAssetInputStream */
    private android.content.res.AssetManager.AssetInputStream f3349x59ec6567;

    /* renamed from: mAttributes */
    private final java.util.HashMap<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute>[] f3350xf45fa1a4;

    /* renamed from: mAttributesOffsets */
    private java.util.Set<java.lang.Integer> f3351x6327c3fc;

    /* renamed from: mExifByteOrder */
    private java.nio.ByteOrder f3352x73633c89;

    /* renamed from: mFileOnDiskContainsSeparateXmpMarker */
    private boolean f3353x8fca3a6e;

    /* renamed from: mFilename */
    private java.lang.String f3354xf931f994;

    /* renamed from: mHasThumbnail */
    private boolean f3355xa626447f;

    /* renamed from: mHasThumbnailStrips */
    private boolean f3356xebd4f5ba;

    /* renamed from: mIsExifDataOnly */
    private boolean f3357x617aa7bd;

    /* renamed from: mMimeType */
    private int f3358xd203951b;

    /* renamed from: mModified */
    private boolean f3359x4daa56;

    /* renamed from: mOffsetToExifData */
    private int f3360x5c018bf5;

    /* renamed from: mOrfMakerNoteOffset */
    private int f3361xdf943473;

    /* renamed from: mOrfThumbnailLength */
    private int f3362x25ea78dc;

    /* renamed from: mOrfThumbnailOffset */
    private int f3363x2b13a289;

    /* renamed from: mSeekableFileDescriptor */
    private java.io.FileDescriptor f3364x5d11034a;

    /* renamed from: mThumbnailBytes */
    private byte[] f3365x32693cac;

    /* renamed from: mThumbnailCompression */
    private int f3366x710de0e7;

    /* renamed from: mThumbnailLength */
    private int f3367x2ab246c5;

    /* renamed from: mThumbnailOffset */
    private int f3368x2fdb7072;

    /* renamed from: mXmpFromSeparateMarker */
    private p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute f3369x7f97b095;
    private static final java.lang.String TAG = "ExifInterface";

    /* renamed from: DEBUG */
    private static final boolean f2923x3de9e33 = android.util.Log.isLoggable(TAG, 3);

    /* renamed from: ROTATION_ORDER */
    private static final java.util.List<java.lang.Integer> f3120x8ab0db2d = java.util.Arrays.asList(1, 6, 3, 8);

    /* renamed from: FLIPPED_ROTATION_ORDER */
    private static final java.util.List<java.lang.Integer> f2951xd19a4faa = java.util.Arrays.asList(2, 7, 4, 5);

    /* renamed from: BITS_PER_SAMPLE_RGB */
    public static final int[] f2905xc1e5e573 = {8, 8, 8};

    /* renamed from: BITS_PER_SAMPLE_GREYSCALE_1 */
    public static final int[] f2903x6f0a5163 = {4};

    /* renamed from: BITS_PER_SAMPLE_GREYSCALE_2 */
    public static final int[] f2904x6f0a5164 = {8};

    /* renamed from: MARKER */
    private static final byte f3050x871f883a = -1;

    /* renamed from: MARKER_SOI */
    private static final byte f3067x5f794be8 = -40;

    /* renamed from: JPEG_SIGNATURE */
    static final byte[] f3023xbeb41981 = {f3050x871f883a, f3067x5f794be8, f3050x871f883a};

    /* renamed from: HEIF_TYPE_FTYP */
    private static final byte[] f2978x25ed3725 = {102, 116, 121, 112};

    /* renamed from: HEIF_BRAND_MIF1 */
    private static final byte[] f2977xf5e12ba4 = {109, 105, 102, 49};

    /* renamed from: HEIF_BRAND_HEIC */
    private static final byte[] f2976xf5ded734 = {104, 101, 105, 99};

    /* renamed from: HEIF_BRAND_AVIF */
    private static final byte[] f2974xf5dbe86f = {97, 118, 105, 102};

    /* renamed from: HEIF_BRAND_AVIS */
    private static final byte[] f2975xf5dbe87c = {97, 118, 105, 115};

    /* renamed from: ORF_MAKER_NOTE_HEADER_1 */
    private static final byte[] f3081xe0201055 = {79, 76, 89, 77, 80, 0};

    /* renamed from: ORF_MAKER_NOTE_HEADER_2 */
    private static final byte[] f3083xe0201056 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: PNG_SIGNATURE */
    private static final byte[] f3111xb9d6a1e2 = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: PNG_ITXT_XMP_KEYWORD */
    static final byte[] f3110x95a24a23 = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(java.nio.charset.StandardCharsets.UTF_8);

    /* renamed from: WEBP_SIGNATURE_1 */
    private static final byte[] f3329x37105a27 = {82, 73, 70, 70};

    /* renamed from: WEBP_SIGNATURE_2 */
    private static final byte[] f3330x37105a28 = {87, 69, 66, 80};

    /* renamed from: WEBP_CHUNK_TYPE_EXIF */
    private static final byte[] f3323x6038f4e0 = {69, 88, 73, 70};

    /* renamed from: START_CODE */
    static final byte f3150xc0e0ebca = 42;

    /* renamed from: WEBP_VP8_SIGNATURE */
    private static final byte[] f3332x3fbc82f4 = {-99, 1, f3150xc0e0ebca};

    /* renamed from: WEBP_CHUNK_TYPE_VP8X */
    private static final byte[] f3326x60408f2a = "VP8X".getBytes(java.nio.charset.Charset.defaultCharset());

    /* renamed from: WEBP_CHUNK_TYPE_VP8L */
    private static final byte[] f3325x60408f1e = "VP8L".getBytes(java.nio.charset.Charset.defaultCharset());

    /* renamed from: WEBP_CHUNK_TYPE_VP8 */
    private static final byte[] f3324x3ce94eee = "VP8 ".getBytes(java.nio.charset.Charset.defaultCharset());

    /* renamed from: WEBP_CHUNK_TYPE_ANIM */
    private static final byte[] f3320x6036fde1 = "ANIM".getBytes(java.nio.charset.Charset.defaultCharset());

    /* renamed from: WEBP_CHUNK_TYPE_ANMF */
    private static final byte[] f3321x6036fe56 = "ANMF".getBytes(java.nio.charset.Charset.defaultCharset());

    /* renamed from: IFD_FORMAT_NAMES */
    private static final java.lang.String[] f2986xada06358 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: IFD_FORMAT_BYTES_PER_FORMAT */
    private static final int[] f2983xdef78bbd = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: EXIF_ASCII_PREFIX */
    private static final byte[] f2924x6b8d962f = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: androidx.exifinterface.media.ExifInterface$ExifAttribute */
    /* loaded from: classes13.dex */
    public static class ExifAttribute {

        /* renamed from: BYTES_OFFSET_UNKNOWN */
        public static final long f3370x60f29af2 = -1;

        /* renamed from: bytes */
        public final byte[] f3371x59dc06b;

        /* renamed from: bytesOffset */
        public final long f3372xf124d4de;

        /* renamed from: format */
        public final int f3373xb45ff7f7;

        /* renamed from: numberOfComponents */
        public final int f3374x275cd636;

        public ExifAttribute(int i17, int i18, byte[] bArr) {
            this(i17, i18, -1L, bArr);
        }

        /* renamed from: createByte */
        public static p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7368x51949824(java.lang.String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2902x3bab731);
            return new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute(1, bytes.length, bytes);
        }

        /* renamed from: createDouble */
        public static p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7369x41ac5bed(double[] dArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2983xdef78bbd[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d17 : dArr) {
                wrap.putDouble(d17);
            }
            return new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute(12, dArr.length, wrap.array());
        }

        /* renamed from: createSLong */
        public static p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7370xe1d975f3(int[] iArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2983xdef78bbd[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i17 : iArr) {
                wrap.putInt(i17);
            }
            return new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute(9, iArr.length, wrap.array());
        }

        /* renamed from: createSRational */
        public static p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7371x60b47525(p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[] eVarArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2983xdef78bbd[10] * eVarArr.length]);
            wrap.order(byteOrder);
            for (p012xc85e97e9.p085x39fce629.p086x62f6fe4.e eVar : eVarArr) {
                wrap.putInt((int) eVar.f92721a);
                wrap.putInt((int) eVar.f92722b);
            }
            return new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute(10, eVarArr.length, wrap.array());
        }

        /* renamed from: createString */
        public static p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7372x5b8a402d(java.lang.String str) {
            byte[] bytes = (str + (char) 0).getBytes(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2902x3bab731);
            return new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute(2, bytes.length, bytes);
        }

        /* renamed from: createULong */
        public static p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7374xe1f5a4f5(long[] jArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2983xdef78bbd[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j17 : jArr) {
                wrap.putInt((int) j17);
            }
            return new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute(4, jArr.length, wrap.array());
        }

        /* renamed from: createURational */
        public static p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7376x893d5327(p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[] eVarArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2983xdef78bbd[5] * eVarArr.length]);
            wrap.order(byteOrder);
            for (p012xc85e97e9.p085x39fce629.p086x62f6fe4.e eVar : eVarArr) {
                wrap.putInt((int) eVar.f92721a);
                wrap.putInt((int) eVar.f92722b);
            }
            return new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute(5, eVarArr.length, wrap.array());
        }

        /* renamed from: createUShort */
        public static p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7378x5d1e7523(int[] iArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2983xdef78bbd[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i17 : iArr) {
                wrap.putShort((short) i17);
            }
            return new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute(3, iArr.length, wrap.array());
        }

        /* renamed from: getDoubleValue */
        public double m7379x78e226ea(java.nio.ByteOrder byteOrder) {
            java.lang.Object m7382x754a37bb = m7382x754a37bb(byteOrder);
            if (m7382x754a37bb == null) {
                throw new java.lang.NumberFormatException("NULL can't be converted to a double value");
            }
            if (m7382x754a37bb instanceof java.lang.String) {
                return java.lang.Double.parseDouble((java.lang.String) m7382x754a37bb);
            }
            if (m7382x754a37bb instanceof long[]) {
                if (((long[]) m7382x754a37bb).length == 1) {
                    return r5[0];
                }
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            if (m7382x754a37bb instanceof int[]) {
                if (((int[]) m7382x754a37bb).length == 1) {
                    return r5[0];
                }
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            if (m7382x754a37bb instanceof double[]) {
                double[] dArr = (double[]) m7382x754a37bb;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            if (!(m7382x754a37bb instanceof p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[])) {
                throw new java.lang.NumberFormatException("Couldn't find a double value");
            }
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[] eVarArr = (p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[]) m7382x754a37bb;
            if (eVarArr.length != 1) {
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.e eVar = eVarArr[0];
            return eVar.f92721a / eVar.f92722b;
        }

        /* renamed from: getIntValue */
        public int m7380x9cfee438(java.nio.ByteOrder byteOrder) {
            java.lang.Object m7382x754a37bb = m7382x754a37bb(byteOrder);
            if (m7382x754a37bb == null) {
                throw new java.lang.NumberFormatException("NULL can't be converted to a integer value");
            }
            if (m7382x754a37bb instanceof java.lang.String) {
                return java.lang.Integer.parseInt((java.lang.String) m7382x754a37bb);
            }
            if (m7382x754a37bb instanceof long[]) {
                long[] jArr = (long[]) m7382x754a37bb;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            if (!(m7382x754a37bb instanceof int[])) {
                throw new java.lang.NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) m7382x754a37bb;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }

        /* renamed from: getStringValue */
        public java.lang.String m7381x7f48eaaa(java.nio.ByteOrder byteOrder) {
            java.lang.Object m7382x754a37bb = m7382x754a37bb(byteOrder);
            if (m7382x754a37bb == null) {
                return null;
            }
            if (m7382x754a37bb instanceof java.lang.String) {
                return (java.lang.String) m7382x754a37bb;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = 0;
            if (m7382x754a37bb instanceof long[]) {
                long[] jArr = (long[]) m7382x754a37bb;
                while (i17 < jArr.length) {
                    sb6.append(jArr[i17]);
                    i17++;
                    if (i17 != jArr.length) {
                        sb6.append(",");
                    }
                }
                return sb6.toString();
            }
            if (m7382x754a37bb instanceof int[]) {
                int[] iArr = (int[]) m7382x754a37bb;
                while (i17 < iArr.length) {
                    sb6.append(iArr[i17]);
                    i17++;
                    if (i17 != iArr.length) {
                        sb6.append(",");
                    }
                }
                return sb6.toString();
            }
            if (m7382x754a37bb instanceof double[]) {
                double[] dArr = (double[]) m7382x754a37bb;
                while (i17 < dArr.length) {
                    sb6.append(dArr[i17]);
                    i17++;
                    if (i17 != dArr.length) {
                        sb6.append(",");
                    }
                }
                return sb6.toString();
            }
            if (!(m7382x754a37bb instanceof p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[])) {
                return null;
            }
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[] eVarArr = (p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[]) m7382x754a37bb;
            while (i17 < eVarArr.length) {
                sb6.append(eVarArr[i17].f92721a);
                sb6.append('/');
                sb6.append(eVarArr[i17].f92722b);
                i17++;
                if (i17 != eVarArr.length) {
                    sb6.append(",");
                }
            }
            return sb6.toString();
        }

        /* renamed from: getValue */
        public java.lang.Object m7382x754a37bb(java.nio.ByteOrder byteOrder) {
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar;
            byte b17;
            byte b18;
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar2 = null;
            try {
                bVar = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.b(this.f3371x59dc06b);
            } catch (java.io.IOException unused) {
                bVar = null;
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
            try {
                bVar.f92712f = byteOrder;
                boolean z17 = true;
                int i17 = 0;
                switch (this.f3373xb45ff7f7) {
                    case 1:
                    case 6:
                        byte[] bArr = this.f3371x59dc06b;
                        if (bArr.length != 1 || (b17 = bArr[0]) < 0 || b17 > 1) {
                            java.lang.String str = new java.lang.String(bArr, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2902x3bab731);
                            try {
                                bVar.close();
                            } catch (java.io.IOException unused2) {
                            }
                            return str;
                        }
                        java.lang.String str2 = new java.lang.String(new char[]{(char) (b17 + 48)});
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused3) {
                        }
                        return str2;
                    case 2:
                    case 7:
                        if (this.f3374x275cd636 >= p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2924x6b8d962f.length) {
                            int i18 = 0;
                            while (true) {
                                if (i18 < p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2924x6b8d962f.length) {
                                    if (this.f3371x59dc06b[i18] != p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2924x6b8d962f[i18]) {
                                        z17 = false;
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                            if (z17) {
                                i17 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2924x6b8d962f.length;
                            }
                        }
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        while (i17 < this.f3374x275cd636 && (b18 = this.f3371x59dc06b[i17]) != 0) {
                            if (b18 >= 32) {
                                sb6.append((char) b18);
                            } else {
                                sb6.append('?');
                            }
                            i17++;
                        }
                        java.lang.String sb7 = sb6.toString();
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused4) {
                        }
                        return sb7;
                    case 3:
                        int[] iArr = new int[this.f3374x275cd636];
                        while (i17 < this.f3374x275cd636) {
                            iArr[i17] = bVar.readUnsignedShort();
                            i17++;
                        }
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused5) {
                        }
                        return iArr;
                    case 4:
                        long[] jArr = new long[this.f3374x275cd636];
                        while (i17 < this.f3374x275cd636) {
                            jArr[i17] = bVar.readInt() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                            i17++;
                        }
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused6) {
                        }
                        return jArr;
                    case 5:
                        p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[] eVarArr = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[this.f3374x275cd636];
                        while (i17 < this.f3374x275cd636) {
                            eVarArr[i17] = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.e(bVar.readInt() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2, bVar.readInt() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
                            i17++;
                        }
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused7) {
                        }
                        return eVarArr;
                    case 8:
                        int[] iArr2 = new int[this.f3374x275cd636];
                        while (i17 < this.f3374x275cd636) {
                            iArr2[i17] = bVar.readShort();
                            i17++;
                        }
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused8) {
                        }
                        return iArr2;
                    case 9:
                        int[] iArr3 = new int[this.f3374x275cd636];
                        while (i17 < this.f3374x275cd636) {
                            iArr3[i17] = bVar.readInt();
                            i17++;
                        }
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused9) {
                        }
                        return iArr3;
                    case 10:
                        p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[] eVarArr2 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[this.f3374x275cd636];
                        while (i17 < this.f3374x275cd636) {
                            eVarArr2[i17] = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.e(bVar.readInt(), bVar.readInt());
                            i17++;
                        }
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused10) {
                        }
                        return eVarArr2;
                    case 11:
                        double[] dArr = new double[this.f3374x275cd636];
                        while (i17 < this.f3374x275cd636) {
                            dArr[i17] = bVar.readFloat();
                            i17++;
                        }
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused11) {
                        }
                        return dArr;
                    case 12:
                        double[] dArr2 = new double[this.f3374x275cd636];
                        while (i17 < this.f3374x275cd636) {
                            dArr2[i17] = bVar.readDouble();
                            i17++;
                        }
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused12) {
                        }
                        return dArr2;
                    default:
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused13) {
                        }
                        return null;
                }
            } catch (java.io.IOException unused14) {
                if (bVar != null) {
                    try {
                        bVar.close();
                    } catch (java.io.IOException unused15) {
                    }
                }
                return null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                bVar2 = bVar;
                if (bVar2 != null) {
                    try {
                        bVar2.close();
                    } catch (java.io.IOException unused16) {
                    }
                }
                throw th;
            }
        }

        /* renamed from: size */
        public int m7383x35e001() {
            return p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2983xdef78bbd[this.f3373xb45ff7f7] * this.f3374x275cd636;
        }

        /* renamed from: toString */
        public java.lang.String m7384x9616526c() {
            return "(" + p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2986xada06358[this.f3373xb45ff7f7] + ", data length:" + this.f3371x59dc06b.length + ")";
        }

        public ExifAttribute(int i17, int i18, long j17, byte[] bArr) {
            this.f3373xb45ff7f7 = i17;
            this.f3374x275cd636 = i18;
            this.f3372xf124d4de = j17;
            this.f3371x59dc06b = bArr;
        }

        /* renamed from: createULong */
        public static p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7373xe1f5a4f5(long j17, java.nio.ByteOrder byteOrder) {
            return m7374xe1f5a4f5(new long[]{j17}, byteOrder);
        }

        /* renamed from: createUShort */
        public static p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7377x5d1e7523(int i17, java.nio.ByteOrder byteOrder) {
            return m7378x5d1e7523(new int[]{i17}, byteOrder);
        }

        /* renamed from: createURational */
        public static p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7375x893d5327(p012xc85e97e9.p085x39fce629.p086x62f6fe4.e eVar, java.nio.ByteOrder byteOrder) {
            return m7376x893d5327(new p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[]{eVar}, byteOrder);
        }
    }

    static {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] dVarArr = {new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3253x274df081, 254, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3297x3e929ea2, 255, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3234x23ca6c5d, 256, 3, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3232x4289cf0f, 257, 3, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3159xd4c56940, 258, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3168xac402801, com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3266xa014a58a, 262, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3231x7afb2953, 270, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3248x2de8f93, zc1.b.f77555x366c91de, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3252x58f9a604, 272, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3296x60596bd4, bd1.f.f4202x366c91de, 3, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3264x118c46b, 274, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3283xb4bdba49, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.k.f33927x366c91de, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3276x4ec871b5, 278, 3, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3295xbcea680f, 279, 3, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3314x9f2faf98, 282, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3318xa6e154f7, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pe.f34670x366c91de, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3269x7d797616, nd1.f2.f72925x366c91de, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3275x4a079672, 296, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3309x9ffea827, 301, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3291x976888cc, 305, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3172xb3aee2a0, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54461xcc044630, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3158xb1f28fac, qf1.n.f76483x366c91de, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3312x6b0fe475, qf1.f.f76475x366c91de, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3270x750f24d6, 319, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3305x359faa41, 330, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3241x2b607f9c, 513, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3242x722b24e9, 514, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3315xfbea6919, yc1.z.f77533x366c91de, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3317x42e71661, 530, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3316xd8a3bf5e, 531, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3273xb491bd90, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c4.f34473x366c91de, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3170x2aa53122, 33432, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3179x1a8c0e1b, 34665, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3215xded2554e, 34853, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3282x11886be4, 4, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3280x93e993b6, 5, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3279xc6446092, 6, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3281xdd2ea5bd, 7, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3277x165c4bee, 23, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3278x82360b48, 46, 7), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3313xce8b79b6, 700, 1)};
        f3001x8b6414ab = dVarArr;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] dVarArr2 = {new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3185x50451b00, 33434, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3195xad0d4887, 33437, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3184x55c20951, 34850, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3293x6ab1c7c9, 34852, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3265x7309bd5b, 34855, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3254x2df865e, 34856, 7), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3288x49fd871f, 34864, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3294x6bfec5be, 34865, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3272x3cb455e3, 34866, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3237x192c9548, 34867, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3238xf26fb87d, 34868, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3239xf26fbc5e, 34869, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3180x3d2c0d2e, 36864, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3174x9a13bc90, 36867, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3173x3cbed13e, 36868, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3255xa4b949b4, 36880, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3257xd68a0bfc, 36881, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3256x8f126f52, 36882, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3166x3b48fc92, 37121, 7), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3167x8210a8a4, 37122, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3290x9c43d182, 37377, 10), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3157x1b3ce347, 37378, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3161x10c61608, 37379, 10), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3181x109b063e, 37380, 10), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3250x9cc3bd22, 37381, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3299x4a217bed, 37382, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3251xb7dd8a64, 37383, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3247x76bcd829, 37384, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3187x58959acb, 37385, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3190x9b5ec6c5, 37386, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3298x2d978485, 37396, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3249x70f81912, 37500, 7), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3310x158f2670, 37510, 7), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3302xda8596f6, 37520, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3304x783388fa, 37521, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3303x22989214, 37522, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3188xd3e3de4d, 40960, 7), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3165xdc770fa5, 40961, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3267x1f11bc41, 40962, 3, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3268xb3f66f02, 40963, 3, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3274x1fbda865, 40964, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3235xc426da4b, 40965, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3189xb5f1de7c, 41483, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3292x1dbc6704, 41484, 7), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3193x7cff5d75, 41486, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3194x84b102d4, 41487, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3192xb4e13f75, 41488, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3301xaa3f8fad, 41492, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3182xb7c566df, 41493, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3287xd367463a, 41495, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3186x6da1c2f9, 41728, 7), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3286xa9de8512, 41729, 7), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3164xc8163f2a, 41730, 7), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3171x5a3d16fe, 41985, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3183x504201d6, 41986, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3311xea51d481, 41987, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3177xc41c2a0b, 41988, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3191xdd772cc1, 41989, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3285x8c29a8b, 41990, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3196xb1e90922, 41991, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3169x26fa3a27, 41992, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3284x1e5ae9b7, 41993, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3289x723a929c, 41994, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3176xf4cbf8c9, 41995, 7), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3300xabbcba4b, 41996, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3233x8e89380, 42016, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d("CameraOwnerName", 42032, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3160xdb554cfc, 42033, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3246xb5777c47, 42034, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3243xdef0ba0a, 42035, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3244xff2cca6d, 42036, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3197x589ede82, 42240, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3178xbcfd4631, 50706, 1), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3175x4efe22d, 50720, 3, 4)};
        f2981x9045e670 = dVarArr2;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] dVarArr3 = {new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3230xc4bfd83c, 0, 1), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3217xb32bb9da, 1, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3216xb7785126, 2, 5, 10), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3219x716e5549, 3, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3218xa477fc15, 4, 5, 10), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3199xc45d4d10, 5, 1), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3198x86afef5c, 6, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3227x9f911b7c, 7, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3223x86eeb8d2, 8, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3226x6c15f2c, 9, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3221x83f297be, 10, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3211xc656c82b, 11, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3225x3a74eae1, 12, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3224x8c991dad, 13, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3229xc7dbb9e5, 14, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3228x8ca80eb1, 15, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3214x8db40c7d, 16, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3213x72016d49, 17, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3220x1cdda212, 18, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3207xfcbab923, 19, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3206x78f45cef, 20, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3209x59bf3f20, 21, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3208x127d696c, 22, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3203xf138c4df, 23, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3202xbee5a6ab, 24, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3205xa743ac2c, 25, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3204xdffa3c78, 26, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3222x86a69813, 27, 7), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3200xff5f1f14, 28, 7), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3201x8e8c633b, 29, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3210x513cdf35, 30, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3212x581f0ef1, 31, 5)};
        f2997xbb825d26 = dVarArr3;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] dVarArr4 = {new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3236x12e2ead8, 1, 2)};
        f2998x473a44c0 = dVarArr4;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] dVarArr5 = {new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3253x274df081, 254, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3297x3e929ea2, 255, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3307x43046baa, 256, 3, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3306xa8fb962, 257, 3, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3159xd4c56940, 258, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3168xac402801, com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3266xa014a58a, 262, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3231x7afb2953, 270, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3248x2de8f93, zc1.b.f77555x366c91de, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3252x58f9a604, 272, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3296x60596bd4, bd1.f.f4202x366c91de, 3, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d("ThumbnailOrientation", 274, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3283xb4bdba49, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.k.f33927x366c91de, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3276x4ec871b5, 278, 3, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3295xbcea680f, 279, 3, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3314x9f2faf98, 282, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3318xa6e154f7, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pe.f34670x366c91de, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3269x7d797616, nd1.f2.f72925x366c91de, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3275x4a079672, 296, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3309x9ffea827, 301, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3291x976888cc, 305, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3172xb3aee2a0, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54461xcc044630, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3158xb1f28fac, qf1.n.f76483x366c91de, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3312x6b0fe475, qf1.f.f76475x366c91de, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3270x750f24d6, 319, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3305x359faa41, 330, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3241x2b607f9c, 513, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3242x722b24e9, 514, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3315xfbea6919, yc1.z.f77533x366c91de, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3317x42e71661, 530, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3316xd8a3bf5e, 531, 3), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3273xb491bd90, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c4.f34473x366c91de, 5), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3170x2aa53122, 33432, 2), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3179x1a8c0e1b, 34665, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3215xded2554e, 34853, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3178xbcfd4631, 50706, 1), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3175x4efe22d, 50720, 3, 4)};
        f3000xc4bb024 = dVarArr5;
        f3271xef4ebd32 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3296x60596bd4, bd1.f.f4202x366c91de, 3);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] dVarArr6 = {new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3263x1a729e47, 256, 7), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3259x13bf0b22, 8224, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3260xb7311e, 8256, 4)};
        f3085xeffae46f = dVarArr6;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] dVarArr7 = {new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3262x4f5a14e6, 257, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3261x8f28fac2, 258, 4)};
        f3079x2d354b17 = dVarArr7;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] dVarArr8 = {new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3258xfa9c8c7, 4371, 3)};
        f3080xda989e45 = dVarArr8;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] dVarArr9 = {new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3165xdc770fa5, 55, 3)};
        f3100x35411ea7 = dVarArr9;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f2926x3e555de8 = dVarArr10;
        f2925x45e4d7ca = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[]{new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3305x359faa41, 330, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3179x1a8c0e1b, 34665, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3215xded2554e, 34853, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3235xc426da4b, 40965, 4), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3259x13bf0b22, 8224, 1), new p012xc85e97e9.p085x39fce629.p086x62f6fe4.d(f3260xb7311e, 8256, 1)};
        f3343xb6ea8bd1 = new java.util.HashMap[dVarArr10.length];
        f3344xd610b621 = new java.util.HashMap[dVarArr10.length];
        f3114xef53f2d2 = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(f3195xad0d4887, f3177xc41c2a0b, f3185x50451b00, f3299x4a217bed)));
        f3342xd7a05c9c = new java.util.HashMap<>();
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("US-ASCII");
        f2902x3bab731 = forName;
        f2979x509c8809 = "Exif\u0000\u0000".getBytes(forName);
        f2980x355db2ea = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        java.util.Locale locale = java.util.Locale.US;
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f3345x27d55c6b = simpleDateFormat;
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        java.text.SimpleDateFormat simpleDateFormat2 = new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, locale);
        f3346xc502c99d = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        int i17 = 0;
        while (true) {
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[][] dVarArr11 = f2926x3e555de8;
            if (i17 >= dVarArr11.length) {
                java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap = f3342xd7a05c9c;
                p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[] dVarArr12 = f2925x45e4d7ca;
                hashMap.put(java.lang.Integer.valueOf(dVarArr12[0].f92717a), 5);
                hashMap.put(java.lang.Integer.valueOf(dVarArr12[1].f92717a), 1);
                hashMap.put(java.lang.Integer.valueOf(dVarArr12[2].f92717a), 2);
                hashMap.put(java.lang.Integer.valueOf(dVarArr12[3].f92717a), 3);
                hashMap.put(java.lang.Integer.valueOf(dVarArr12[4].f92717a), 7);
                hashMap.put(java.lang.Integer.valueOf(dVarArr12[5].f92717a), 8);
                f3078x8387723 = java.util.regex.Pattern.compile(".*[1-9].*");
                f2973x33ffb0b2 = java.util.regex.Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f2920xeff3069 = java.util.regex.Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f2921x677bf5b7 = java.util.regex.Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f3343xb6ea8bd1[i17] = new java.util.HashMap<>();
            f3344xd610b621[i17] = new java.util.HashMap<>();
            for (p012xc85e97e9.p085x39fce629.p086x62f6fe4.d dVar : dVarArr11[i17]) {
                f3343xb6ea8bd1[i17].put(java.lang.Integer.valueOf(dVar.f92717a), dVar);
                f3344xd610b621[i17].put(dVar.f92718b, dVar);
            }
            i17++;
        }
    }

    public C1098xe10e35e9(java.io.File file) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[][] dVarArr = f2926x3e555de8;
        this.f3350xf45fa1a4 = new java.util.HashMap[dVarArr.length];
        this.f3351x6327c3fc = new java.util.HashSet(dVarArr.length);
        this.f3352x73633c89 = java.nio.ByteOrder.BIG_ENDIAN;
        if (file != null) {
            m7302xb970e2c0(file.getAbsolutePath());
            return;
        }
        throw new java.lang.NullPointerException("file cannot be null");
    }

    /* renamed from: addDefaultValuesForCompatibility */
    private void m7282x3f4e66e9() {
        java.lang.String m7340x351be6 = m7340x351be6(f3174x9a13bc90);
        if (m7340x351be6 != null && m7340x351be6(f3172xb3aee2a0) == null) {
            this.f3350xf45fa1a4[0].put(f3172xb3aee2a0, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7372x5b8a402d(m7340x351be6));
        }
        if (m7340x351be6(f3234x23ca6c5d) == null) {
            this.f3350xf45fa1a4[0].put(f3234x23ca6c5d, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7373xe1f5a4f5(0L, this.f3352x73633c89));
        }
        if (m7340x351be6(f3232x4289cf0f) == null) {
            this.f3350xf45fa1a4[0].put(f3232x4289cf0f, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7373xe1f5a4f5(0L, this.f3352x73633c89));
        }
        if (m7340x351be6(f3264x118c46b) == null) {
            this.f3350xf45fa1a4[0].put(f3264x118c46b, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7373xe1f5a4f5(0L, this.f3352x73633c89));
        }
        if (m7340x351be6(f3247x76bcd829) == null) {
            this.f3350xf45fa1a4[1].put(f3247x76bcd829, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7373xe1f5a4f5(0L, this.f3352x73633c89));
        }
    }

    /* renamed from: convertDecimalDegree */
    private java.lang.String m7283x33071a8a(double d17) {
        long j17 = (long) d17;
        double d18 = d17 - j17;
        long j18 = (long) (d18 * 60.0d);
        return j17 + "/1," + j18 + "/1," + java.lang.Math.round((d18 - (j18 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    /* renamed from: convertRationalLatLonToDouble */
    private static double m7284x8f0cc5d9(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.String[] split = str.split(",", -1);
            java.lang.String[] split2 = split[0].split("/", -1);
            double parseDouble = java.lang.Double.parseDouble(split2[0].trim()) / java.lang.Double.parseDouble(split2[1].trim());
            java.lang.String[] split3 = split[1].split("/", -1);
            double parseDouble2 = java.lang.Double.parseDouble(split3[0].trim()) / java.lang.Double.parseDouble(split3[1].trim());
            java.lang.String[] split4 = split[2].split("/", -1);
            double parseDouble3 = parseDouble + (parseDouble2 / 60.0d) + ((java.lang.Double.parseDouble(split4[0].trim()) / java.lang.Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals(f3025x7c20d01a) && !str2.equals(f3049xa147da5f)) {
                if (!str2.equals("N") && !str2.equals(f3048xa13f9cad)) {
                    throw new java.lang.IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.NumberFormatException e17) {
            throw new java.lang.IllegalArgumentException(e17);
        }
    }

    /* renamed from: copyChunksUpToGivenChunkType */
    private void m7285xa9841f3b(p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar, p012xc85e97e9.p085x39fce629.p086x62f6fe4.c cVar, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            m7286x5916e45c(bVar, cVar, bArr3);
            if (java.util.Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && java.util.Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* renamed from: copyWebPChunk */
    private void m7286x5916e45c(p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar, p012xc85e97e9.p085x39fce629.p086x62f6fe4.c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.b(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.d(bVar, cVar, readInt);
    }

    /* renamed from: getExifAttribute */
    private p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7287x51a0ffb6(java.lang.String str) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute2;
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        if (f3240xa702825f.equals(str)) {
            str = f3265x7309bd5b;
        }
        if (f3313xce8b79b6.equals(str) && m7298x2b518276(this.f3358xd203951b) == 2 && (exifAttribute2 = this.f3369x7f97b095) != null) {
            return exifAttribute2;
        }
        for (int i17 = 0; i17 < f2926x3e555de8.length; i17++) {
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute3 = this.f3350xf45fa1a4[i17].get(str);
            if (exifAttribute3 != null) {
                return exifAttribute3;
            }
        }
        if (!f3313xce8b79b6.equals(str) || (exifAttribute = this.f3369x7f97b095) == null) {
            return null;
        }
        return exifAttribute;
    }

    /* renamed from: getHeifAttributes */
    private void m7288xd45ed8c7(p012xc85e97e9.p085x39fce629.p086x62f6fe4.f fVar, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 < 28) {
            throw new java.lang.UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i17 == 15 && i18 < 31) {
            throw new java.lang.UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new p012xc85e97e9.p085x39fce629.p086x62f6fe4.a(this, fVar));
                java.lang.String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                java.lang.String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                java.lang.String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                java.lang.String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str3 = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (str != null) {
                    this.f3350xf45fa1a4[0].put(f3234x23ca6c5d, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7377x5d1e7523(java.lang.Integer.parseInt(str), this.f3352x73633c89));
                }
                if (str3 != null) {
                    this.f3350xf45fa1a4[0].put(f3232x4289cf0f, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7377x5d1e7523(java.lang.Integer.parseInt(str3), this.f3352x73633c89));
                }
                if (str2 != null) {
                    int parseInt = java.lang.Integer.parseInt(str2);
                    this.f3350xf45fa1a4[0].put(f3264x118c46b, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7377x5d1e7523(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f3352x73633c89));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = java.lang.Integer.parseInt(extractMetadata);
                    int parseInt3 = java.lang.Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new java.io.IOException("Invalid exif length");
                    }
                    fVar.b(parseInt2);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i19 = parseInt2 + 6;
                    int i27 = parseInt3 - 6;
                    if (!java.util.Arrays.equals(bArr, f2979x509c8809)) {
                        throw new java.io.IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i27];
                    fVar.readFully(bArr2);
                    this.f3360x5c018bf5 = i19;
                    m7320x31f7c08d(bArr2, 0);
                }
                java.lang.String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                java.lang.String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = java.lang.Integer.parseInt(extractMetadata5);
                    int parseInt5 = java.lang.Integer.parseInt(extractMetadata6);
                    long j17 = parseInt4;
                    fVar.b(j17);
                    byte[] bArr3 = new byte[parseInt5];
                    fVar.readFully(bArr3);
                    this.f3369x7f97b095 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute(1, parseInt5, j17, bArr3);
                    this.f3353x8fca3a6e = true;
                }
                boolean z17 = f2923x3de9e33;
                try {
                    mediaMetadataRetriever.release();
                } catch (java.io.IOException unused) {
                }
            } catch (java.lang.RuntimeException e17) {
                throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e17);
            }
        } catch (java.lang.Throwable th6) {
            try {
                mediaMetadataRetriever.release();
            } catch (java.io.IOException unused2) {
            }
            throw th6;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x005d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0060. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0063. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f A[LOOP:0: B:9:0x0024->B:32:0x010f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b A[FALL_THROUGH] */
    /* renamed from: getJpegAttributes */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m7289x4dd9d0d5(p012xc85e97e9.p085x39fce629.p086x62f6fe4.b r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.m7289x4dd9d0d5(androidx.exifinterface.media.b, int, int):void");
    }

    /* renamed from: getMimeType */
    private int m7290x28e02b04(java.io.BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m7304x4801d349(bArr)) {
            return 4;
        }
        if (m7307x3a8930e4(bArr)) {
            return 9;
        }
        int m7303xda156ead = m7303xda156ead(bArr);
        if (m7303xda156ead != 0) {
            return m7303xda156ead;
        }
        if (m7305x63afdeb0(bArr)) {
            return 7;
        }
        if (m7308x691f02da(bArr)) {
            return 10;
        }
        if (m7306x8d55d576(bArr)) {
            return 13;
        }
        return m7314xf5405b7d(bArr) ? 14 : 0;
    }

    /* renamed from: getOrfAttributes */
    private void m7291x7769f0e4(p012xc85e97e9.p085x39fce629.p086x62f6fe4.f fVar) {
        int i17;
        int i18;
        m7294xa356e7e9(fVar);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute = this.f3350xf45fa1a4[1].get(f3249x70f81912);
        if (exifAttribute != null) {
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.f fVar2 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.f(exifAttribute.f3371x59dc06b);
            fVar2.f92712f = this.f3352x73633c89;
            byte[] bArr = f3081xe0201055;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.b(0L);
            byte[] bArr3 = f3083xe0201056;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (java.util.Arrays.equals(bArr2, bArr)) {
                fVar2.b(8L);
            } else if (java.util.Arrays.equals(bArr4, bArr3)) {
                fVar2.b(12L);
            }
            m7321xebf8a2ec(fVar2, 6);
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute2 = this.f3350xf45fa1a4[7].get(f3262x4f5a14e6);
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute3 = this.f3350xf45fa1a4[7].get(f3261x8f28fac2);
            if (exifAttribute2 != null && exifAttribute3 != null) {
                this.f3350xf45fa1a4[5].put(f3241x2b607f9c, exifAttribute2);
                this.f3350xf45fa1a4[5].put(f3242x722b24e9, exifAttribute3);
            }
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute4 = this.f3350xf45fa1a4[8].get(f3258xfa9c8c7);
            if (exifAttribute4 != null) {
                int[] iArr = (int[]) exifAttribute4.m7382x754a37bb(this.f3352x73633c89);
                if (iArr == null || iArr.length != 4) {
                    java.util.Arrays.toString(iArr);
                    return;
                }
                int i19 = iArr[2];
                int i27 = iArr[0];
                if (i19 <= i27 || (i17 = iArr[3]) <= (i18 = iArr[1])) {
                    return;
                }
                int i28 = (i19 - i27) + 1;
                int i29 = (i17 - i18) + 1;
                if (i28 < i29) {
                    int i37 = i28 + i29;
                    i29 = i37 - i29;
                    i28 = i37 - i29;
                }
                p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7377x5d1e7523 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7377x5d1e7523(i28, this.f3352x73633c89);
                p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7377x5d1e75232 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7377x5d1e7523(i29, this.f3352x73633c89);
                this.f3350xf45fa1a4[0].put(f3234x23ca6c5d, m7377x5d1e7523);
                this.f3350xf45fa1a4[0].put(f3232x4289cf0f, m7377x5d1e75232);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        r18.f3353x8fca3a6e = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        return;
     */
    /* renamed from: getPngAttributes */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m7292xdc0b14aa(p012xc85e97e9.p085x39fce629.p086x62f6fe4.b r19) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.m7292xdc0b14aa(androidx.exifinterface.media.b):void");
    }

    /* renamed from: getRafAttributes */
    private void m7293xc0270918(p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar) {
        if (f2923x3de9e33) {
            java.util.Objects.toString(bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i17 = java.nio.ByteBuffer.wrap(bArr).getInt();
        int i18 = java.nio.ByteBuffer.wrap(bArr2).getInt();
        int i19 = java.nio.ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i18];
        bVar.a(i17 - bVar.f92711e);
        bVar.readFully(bArr4);
        m7289x4dd9d0d5(new p012xc85e97e9.p085x39fce629.p086x62f6fe4.b(bArr4), i17, 5);
        bVar.a(i19 - bVar.f92711e);
        bVar.f92712f = java.nio.ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        for (int i27 = 0; i27 < readInt; i27++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f3271xef4ebd32.f92717a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7377x5d1e7523 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7377x5d1e7523(readShort, this.f3352x73633c89);
                p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7377x5d1e75232 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7377x5d1e7523(readShort2, this.f3352x73633c89);
                this.f3350xf45fa1a4[0].put(f3232x4289cf0f, m7377x5d1e7523);
                this.f3350xf45fa1a4[0].put(f3234x23ca6c5d, m7377x5d1e75232);
                return;
            }
            bVar.a(readUnsignedShort2);
        }
    }

    /* renamed from: getRawAttributes */
    private void m7294xa356e7e9(p012xc85e97e9.p085x39fce629.p086x62f6fe4.f fVar) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute;
        m7317x9570771e(fVar);
        m7321xebf8a2ec(fVar, 0);
        m7332x73ba2835(fVar, 0);
        m7332x73ba2835(fVar, 5);
        m7332x73ba2835(fVar, 4);
        m7333xdadadf2e();
        if (this.f3358xd203951b != 8 || (exifAttribute = this.f3350xf45fa1a4[1].get(f3249x70f81912)) == null) {
            return;
        }
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.f fVar2 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.f(exifAttribute.f3371x59dc06b);
        fVar2.f92712f = this.f3352x73633c89;
        fVar2.a(6);
        m7321xebf8a2ec(fVar2, 9);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute2 = this.f3350xf45fa1a4[9].get(f3165xdc770fa5);
        if (exifAttribute2 != null) {
            this.f3350xf45fa1a4[1].put(f3165xdc770fa5, exifAttribute2);
        }
    }

    /* renamed from: getRw2Attributes */
    private void m7295x2af6f00e(p012xc85e97e9.p085x39fce629.p086x62f6fe4.f fVar) {
        if (f2923x3de9e33) {
            java.util.Objects.toString(fVar);
        }
        m7294xa356e7e9(fVar);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute = this.f3350xf45fa1a4[0].get(f3278x82360b48);
        if (exifAttribute != null) {
            m7289x4dd9d0d5(new p012xc85e97e9.p085x39fce629.p086x62f6fe4.b(exifAttribute.f3371x59dc06b), (int) exifAttribute.f3372xf124d4de, 5);
        }
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute2 = this.f3350xf45fa1a4[0].get(f3277x165c4bee);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute3 = this.f3350xf45fa1a4[1].get(f3265x7309bd5b);
        if (exifAttribute2 == null || exifAttribute3 != null) {
            return;
        }
        this.f3350xf45fa1a4[1].put(f3265x7309bd5b, exifAttribute2);
    }

    /* renamed from: getStandaloneAttributes */
    private boolean m7296x8a054ff2(p012xc85e97e9.p085x39fce629.p086x62f6fe4.f fVar) {
        byte[] bArr = f2979x509c8809;
        byte[] bArr2 = new byte[bArr.length];
        fVar.readFully(bArr2);
        if (!java.util.Arrays.equals(bArr2, bArr)) {
            return false;
        }
        byte[] bArr3 = new byte[1024];
        int i17 = 0;
        while (true) {
            if (i17 == bArr3.length) {
                bArr3 = java.util.Arrays.copyOf(bArr3, bArr3.length * 2);
            }
            int read = fVar.f92710d.read(bArr3, i17, bArr3.length - i17);
            if (read == -1) {
                byte[] copyOf = java.util.Arrays.copyOf(bArr3, i17);
                this.f3360x5c018bf5 = f2979x509c8809.length;
                m7320x31f7c08d(copyOf, 0);
                return true;
            }
            i17 += read;
            fVar.f92711e += read;
        }
    }

    /* renamed from: getWebpAttributes */
    private void m7297xab711f09(p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar) {
        if (f2923x3de9e33) {
            java.util.Objects.toString(bVar);
        }
        bVar.f92712f = java.nio.ByteOrder.LITTLE_ENDIAN;
        bVar.a(f3329x37105a27.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f3330x37105a28;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i17 = length + 4 + 4;
                if (java.util.Arrays.equals(f3323x6038f4e0, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    byte[] bArr4 = f2979x509c8809;
                    if (p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.e(bArr3, bArr4)) {
                        bArr3 = java.util.Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.f3360x5c018bf5 = i17;
                    m7320x31f7c08d(bArr3, 0);
                    m7328xbcfa8174(new p012xc85e97e9.p085x39fce629.p086x62f6fe4.b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i17 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new java.io.IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(readInt2);
            } catch (java.io.EOFException e17) {
                throw new java.io.IOException("Encountered corrupt WebP file.", e17);
            }
        }
    }

    /* renamed from: getXmpHandlingForImageType */
    private static int m7298x2b518276(int i17) {
        if (i17 != 4) {
            return (i17 == 9 || i17 == 15 || i17 == 12 || i17 == 13) ? 2 : 1;
        }
        return 3;
    }

    /* renamed from: guessDataFormat */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> m7299x7f59d578(java.lang.String str) {
        if (str.contains(",")) {
            java.lang.String[] split = str.split(",", -1);
            android.util.Pair<java.lang.Integer, java.lang.Integer> m7299x7f59d578 = m7299x7f59d578(split[0]);
            if (((java.lang.Integer) m7299x7f59d578.first).intValue() == 2) {
                return m7299x7f59d578;
            }
            for (int i17 = 1; i17 < split.length; i17++) {
                android.util.Pair<java.lang.Integer, java.lang.Integer> m7299x7f59d5782 = m7299x7f59d578(split[i17]);
                int intValue = (((java.lang.Integer) m7299x7f59d5782.first).equals(m7299x7f59d578.first) || ((java.lang.Integer) m7299x7f59d5782.second).equals(m7299x7f59d578.first)) ? ((java.lang.Integer) m7299x7f59d578.first).intValue() : -1;
                int intValue2 = (((java.lang.Integer) m7299x7f59d578.second).intValue() == -1 || !(((java.lang.Integer) m7299x7f59d5782.first).equals(m7299x7f59d578.second) || ((java.lang.Integer) m7299x7f59d5782.second).equals(m7299x7f59d578.second))) ? -1 : ((java.lang.Integer) m7299x7f59d578.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new android.util.Pair<>(2, -1);
                }
                if (intValue == -1) {
                    m7299x7f59d578 = new android.util.Pair<>(java.lang.Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    m7299x7f59d578 = new android.util.Pair<>(java.lang.Integer.valueOf(intValue), -1);
                }
            }
            return m7299x7f59d578;
        }
        if (!str.contains("/")) {
            try {
                try {
                    java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Long.parseLong(str));
                    return (valueOf.longValue() < 0 || valueOf.longValue() > 65535) ? valueOf.longValue() < 0 ? new android.util.Pair<>(9, -1) : new android.util.Pair<>(4, -1) : new android.util.Pair<>(3, 4);
                } catch (java.lang.NumberFormatException unused) {
                    return new android.util.Pair<>(2, -1);
                }
            } catch (java.lang.NumberFormatException unused2) {
                java.lang.Double.parseDouble(str);
                return new android.util.Pair<>(12, -1);
            }
        }
        java.lang.String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) java.lang.Double.parseDouble(split2[0]);
                long parseDouble2 = (long) java.lang.Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new android.util.Pair<>(10, 5);
                    }
                    return new android.util.Pair<>(5, -1);
                }
                return new android.util.Pair<>(10, -1);
            } catch (java.lang.NumberFormatException unused3) {
            }
        }
        return new android.util.Pair<>(2, -1);
    }

    /* renamed from: handleThumbnailFromJfif */
    private void m7300x2ab151e7(p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar, java.util.HashMap<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute> hashMap) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute = hashMap.get(f3241x2b607f9c);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute2 = hashMap.get(f3242x722b24e9);
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        int m7380x9cfee438 = exifAttribute.m7380x9cfee438(this.f3352x73633c89);
        int m7380x9cfee4382 = exifAttribute2.m7380x9cfee438(this.f3352x73633c89);
        if (this.f3358xd203951b == 7) {
            m7380x9cfee438 += this.f3361xdf943473;
        }
        if (m7380x9cfee438 <= 0 || m7380x9cfee4382 <= 0) {
            return;
        }
        this.f3355xa626447f = true;
        if (this.f3354xf931f994 == null && this.f3349x59ec6567 == null && this.f3364x5d11034a == null) {
            byte[] bArr = new byte[m7380x9cfee4382];
            bVar.a(m7380x9cfee438);
            bVar.readFully(bArr);
            this.f3365x32693cac = bArr;
        }
        this.f3368x2fdb7072 = m7380x9cfee438;
        this.f3367x2ab246c5 = m7380x9cfee4382;
    }

    /* renamed from: handleThumbnailFromStrips */
    private void m7301x53c98b69(p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar, java.util.HashMap<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute> hashMap) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute = hashMap.get(f3296x60596bd4);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute2 = hashMap.get(f3295xbcea680f);
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        long[] b17 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.b(exifAttribute.m7382x754a37bb(this.f3352x73633c89));
        long[] b18 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.b(exifAttribute2.m7382x754a37bb(this.f3352x73633c89));
        if (b17 == null || b17.length == 0 || b18 == null || b18.length == 0 || b17.length != b18.length) {
            return;
        }
        long j17 = 0;
        for (long j18 : b18) {
            j17 += j18;
        }
        int i17 = (int) j17;
        byte[] bArr = new byte[i17];
        this.f3348x4df34cca = true;
        this.f3356xebd4f5ba = true;
        this.f3355xa626447f = true;
        int i18 = 0;
        int i19 = 0;
        for (int i27 = 0; i27 < b17.length; i27++) {
            int i28 = (int) b17[i27];
            int i29 = (int) b18[i27];
            if (i27 < b17.length - 1 && i28 + i29 != b17[i27 + 1]) {
                this.f3348x4df34cca = false;
            }
            int i37 = i28 - i18;
            if (i37 < 0) {
                return;
            }
            try {
                bVar.a(i37);
                int i38 = i18 + i37;
                byte[] bArr2 = new byte[i29];
                bVar.readFully(bArr2);
                i18 = i38 + i29;
                java.lang.System.arraycopy(bArr2, 0, bArr, i19, i29);
                i19 += i29;
            } catch (java.io.EOFException unused) {
                return;
            }
        }
        this.f3365x32693cac = bArr;
        if (this.f3348x4df34cca) {
            this.f3368x2fdb7072 = (int) b17[0];
            this.f3367x2ab246c5 = i17;
        }
    }

    /* renamed from: initForFilename */
    private void m7302xb970e2c0(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("filename cannot be null");
        }
        java.io.FileInputStream fileInputStream = null;
        this.f3349x59ec6567 = null;
        this.f3354xf931f994 = str;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(str);
            try {
                if (m7309x8097c0da(fileInputStream2.getFD())) {
                    this.f3364x5d11034a = fileInputStream2.getFD();
                } else {
                    this.f3364x5d11034a = null;
                }
                m7315x5705e2dd(fileInputStream2);
                p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.a(fileInputStream2);
            } catch (java.lang.Throwable th6) {
                th = th6;
                fileInputStream = fileInputStream2;
                p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.a(fileInputStream);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: isHeicOrAvifFormat */
    private int m7303xda156ead(byte[] bArr) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar;
        long readInt;
        byte[] bArr2;
        long j17;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar2 = null;
        try {
            try {
                bVar = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.b(bArr);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.readFully(bArr2);
        } catch (java.lang.Exception unused2) {
            bVar2 = bVar;
            boolean z17 = f2923x3de9e33;
            if (bVar2 != null) {
                bVar2.close();
            }
            return 0;
        } catch (java.lang.Throwable th7) {
            th = th7;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!java.util.Arrays.equals(bArr2, f2978x25ed3725)) {
            bVar.close();
            return 0;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j17 = 16;
            if (readInt < 16) {
                bVar.close();
                return 0;
            }
        } else {
            j17 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j18 = readInt - j17;
        if (j18 < 8) {
            bVar.close();
            return 0;
        }
        byte[] bArr3 = new byte[4];
        bVar2 = null;
        boolean z18 = false;
        boolean z19 = false;
        for (long j19 = 0; j19 < j18 / 4; j19++) {
            try {
                bVar.readFully(bArr3);
                if (j19 != 1) {
                    if (java.util.Arrays.equals(bArr3, f2977xf5e12ba4)) {
                        bVar2 = 1;
                    } else if (java.util.Arrays.equals(bArr3, f2976xf5ded734)) {
                        z18 = true;
                    } else if (java.util.Arrays.equals(bArr3, f2974xf5dbe86f) || java.util.Arrays.equals(bArr3, f2975xf5dbe87c)) {
                        z19 = true;
                    }
                    if (bVar2 == null) {
                        continue;
                    } else {
                        if (z18) {
                            bVar.close();
                            return 12;
                        }
                        if (z19) {
                            bVar.close();
                            return 15;
                        }
                    }
                }
            } catch (java.io.EOFException unused3) {
                bVar.close();
                return 0;
            }
        }
        bVar.close();
        return 0;
    }

    /* renamed from: isJpegFormat */
    private static boolean m7304x4801d349(byte[] bArr) {
        int i17 = 0;
        while (true) {
            byte[] bArr2 = f3023xbeb41981;
            if (i17 >= bArr2.length) {
                return true;
            }
            if (bArr[i17] != bArr2[i17]) {
                return false;
            }
            i17++;
        }
    }

    /* renamed from: isOrfFormat */
    private boolean m7305x63afdeb0(byte[] bArr) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar = null;
        try {
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar2 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.b(bArr);
            try {
                java.nio.ByteOrder m7319x1314ca30 = m7319x1314ca30(bVar2);
                this.f3352x73633c89 = m7319x1314ca30;
                bVar2.f92712f = m7319x1314ca30;
                short readShort = bVar2.readShort();
                boolean z17 = readShort == 20306 || readShort == 21330;
                bVar2.close();
                return z17;
            } catch (java.lang.Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (java.lang.Throwable th6) {
                th = th6;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (java.lang.Exception unused2) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: isPngFormat */
    private boolean m7306x8d55d576(byte[] bArr) {
        int i17 = 0;
        while (true) {
            byte[] bArr2 = f3111xb9d6a1e2;
            if (i17 >= bArr2.length) {
                return true;
            }
            if (bArr[i17] != bArr2[i17]) {
                return false;
            }
            i17++;
        }
    }

    /* renamed from: isRafFormat */
    private boolean m7307x3a8930e4(byte[] bArr) {
        byte[] bytes = f3113x9df29650.getBytes(java.nio.charset.Charset.defaultCharset());
        for (int i17 = 0; i17 < bytes.length; i17++) {
            if (bArr[i17] != bytes[i17]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: isRw2Format */
    private boolean m7308x691f02da(byte[] bArr) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar = null;
        try {
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar2 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.b(bArr);
            try {
                java.nio.ByteOrder m7319x1314ca30 = m7319x1314ca30(bVar2);
                this.f3352x73633c89 = m7319x1314ca30;
                bVar2.f92712f = m7319x1314ca30;
                boolean z17 = bVar2.readShort() == 85;
                bVar2.close();
                return z17;
            } catch (java.lang.Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (java.lang.Throwable th6) {
                th = th6;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (java.lang.Exception unused2) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: isSeekableFD */
    private static boolean m7309x8097c0da(java.io.FileDescriptor fileDescriptor) {
        try {
            android.system.Os.lseek(fileDescriptor, 0L, android.system.OsConstants.SEEK_CUR);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: isSupportedDataType */
    private boolean m7310x11eda4c8(java.util.HashMap<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute> hashMap) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute2 = hashMap.get(f3159xd4c56940);
        if (exifAttribute2 == null) {
            return false;
        }
        int[] iArr = (int[]) exifAttribute2.m7382x754a37bb(this.f3352x73633c89);
        int[] iArr2 = f2905xc1e5e573;
        if (java.util.Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f3358xd203951b != 3 || (exifAttribute = hashMap.get(f3266xa014a58a)) == null) {
            return false;
        }
        int m7380x9cfee438 = exifAttribute.m7380x9cfee438(this.f3352x73633c89);
        return (m7380x9cfee438 == 1 && java.util.Arrays.equals(iArr, f2904x6f0a5164)) || (m7380x9cfee438 == 6 && java.util.Arrays.equals(iArr, iArr2));
    }

    /* renamed from: isSupportedFormatForSavingAttributes */
    private static boolean m7311xd39db71f(int i17) {
        return i17 == 4 || i17 == 13 || i17 == 14;
    }

    /* renamed from: isSupportedMimeType */
    public static boolean m7312x54508452(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("mimeType shouldn't be null");
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        lowerCase.getClass();
        char c17 = 65535;
        switch (lowerCase.hashCode()) {
            case -1875291391:
                if (lowerCase.equals("image/x-fuji-raf")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1635437028:
                if (lowerCase.equals("image/x-samsung-srw")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1594371159:
                if (lowerCase.equals("image/x-sony-arw")) {
                    c17 = 2;
                    break;
                }
                break;
            case -1487464693:
                if (lowerCase.equals("image/heic")) {
                    c17 = 3;
                    break;
                }
                break;
            case -1487464690:
                if (lowerCase.equals("image/heif")) {
                    c17 = 4;
                    break;
                }
                break;
            case -1487394660:
                if (lowerCase.equals("image/jpeg")) {
                    c17 = 5;
                    break;
                }
                break;
            case -1487018032:
                if (lowerCase.equals("image/webp")) {
                    c17 = 6;
                    break;
                }
                break;
            case -1423313290:
                if (lowerCase.equals("image/x-adobe-dng")) {
                    c17 = 7;
                    break;
                }
                break;
            case -985160897:
                if (lowerCase.equals("image/x-panasonic-rw2")) {
                    c17 = '\b';
                    break;
                }
                break;
            case -879258763:
                if (lowerCase.equals("image/png")) {
                    c17 = '\t';
                    break;
                }
                break;
            case -332763809:
                if (lowerCase.equals("image/x-pentax-pef")) {
                    c17 = '\n';
                    break;
                }
                break;
            case 1378106698:
                if (lowerCase.equals("image/x-olympus-orf")) {
                    c17 = 11;
                    break;
                }
                break;
            case 2099152104:
                if (lowerCase.equals("image/x-nikon-nef")) {
                    c17 = '\f';
                    break;
                }
                break;
            case 2099152524:
                if (lowerCase.equals("image/x-nikon-nrw")) {
                    c17 = '\r';
                    break;
                }
                break;
            case 2111234748:
                if (lowerCase.equals("image/x-canon-cr2")) {
                    c17 = 14;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: isThumbnail */
    private boolean m7313x958b92e2(java.util.HashMap<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute> hashMap) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute = hashMap.get(f3232x4289cf0f);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute2 = hashMap.get(f3234x23ca6c5d);
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.m7380x9cfee438(this.f3352x73633c89) <= 512 && exifAttribute2.m7380x9cfee438(this.f3352x73633c89) <= 512;
    }

    /* renamed from: isWebpFormat */
    private boolean m7314xf5405b7d(byte[] bArr) {
        int i17 = 0;
        while (true) {
            byte[] bArr2 = f3329x37105a27;
            if (i17 >= bArr2.length) {
                int i18 = 0;
                while (true) {
                    byte[] bArr3 = f3330x37105a28;
                    if (i18 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f3329x37105a27.length + i18 + 4] != bArr3[i18]) {
                        return false;
                    }
                    i18++;
                }
            } else {
                if (bArr[i17] != bArr2[i17]) {
                    return false;
                }
                i17++;
            }
        }
    }

    /* renamed from: loadAttributes */
    private void m7315x5705e2dd(java.io.InputStream inputStream) {
        boolean z17;
        for (int i17 = 0; i17 < f2926x3e555de8.length; i17++) {
            try {
                try {
                    this.f3350xf45fa1a4[i17] = new java.util.HashMap<>();
                } catch (java.io.IOException | java.lang.UnsupportedOperationException unused) {
                    boolean z18 = f2923x3de9e33;
                    m7282x3f4e66e9();
                    if (!z18) {
                        return;
                    }
                }
            } finally {
                m7282x3f4e66e9();
                if (f2923x3de9e33) {
                    m7318xd7583e4();
                }
            }
        }
        if (!this.f3357x617aa7bd) {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream, 5000);
            this.f3358xd203951b = m7290x28e02b04(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (m7329xa5cd5734(this.f3358xd203951b)) {
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.f fVar = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.f(inputStream);
            if (!this.f3357x617aa7bd) {
                int i18 = this.f3358xd203951b;
                if (i18 != 12 && i18 != 15) {
                    if (i18 == 7) {
                        m7291x7769f0e4(fVar);
                    } else if (i18 == 10) {
                        m7295x2af6f00e(fVar);
                    } else {
                        m7294xa356e7e9(fVar);
                    }
                }
                m7288xd45ed8c7(fVar, i18);
            } else if (!m7296x8a054ff2(fVar)) {
                if (z17) {
                    return;
                } else {
                    return;
                }
            }
            fVar.b(this.f3360x5c018bf5);
            m7328xbcfa8174(fVar);
        } else {
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.b(inputStream);
            int i19 = this.f3358xd203951b;
            if (i19 == 4) {
                m7289x4dd9d0d5(bVar, 0, 0);
            } else if (i19 == 13) {
                m7292xdc0b14aa(bVar);
            } else if (i19 == 9) {
                m7293xc0270918(bVar);
            } else if (i19 == 14) {
                m7297xab711f09(bVar);
            }
        }
        m7282x3f4e66e9();
        if (!f2923x3de9e33) {
            return;
        }
        m7318xd7583e4();
    }

    /* renamed from: parseDateTime */
    private static java.lang.Long m7316x3c2d4b6e(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        long j17;
        if (str != null && f3078x8387723.matcher(str).matches()) {
            java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
            try {
                java.util.Date parse = f3345x27d55c6b.parse(str, parsePosition);
                if (parse == null && (parse = f3346xc502c99d.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = parse.getTime();
                if (str3 != null) {
                    java.lang.String substring = str3.substring(0, 1);
                    int parseInt = java.lang.Integer.parseInt(str3.substring(1, 3));
                    int parseInt2 = java.lang.Integer.parseInt(str3.substring(4, 6));
                    if (("+".equals(substring) || "-".equals(substring)) && ":".equals(str3.substring(3, 4)) && parseInt <= 14) {
                        time += ((parseInt * 60) + parseInt2) * 60 * 1000 * ("-".equals(substring) ? 1 : -1);
                    }
                }
                if (str2 != null) {
                    try {
                        int min = java.lang.Math.min(str2.length(), 3);
                        j17 = java.lang.Long.parseLong(str2.substring(0, min));
                        while (min < 3) {
                            j17 *= 10;
                            min++;
                        }
                    } catch (java.lang.NumberFormatException unused) {
                        j17 = 0;
                    }
                    time += j17;
                }
                return java.lang.Long.valueOf(time);
            } catch (java.lang.IllegalArgumentException unused2) {
            }
        }
        return null;
    }

    /* renamed from: parseTiffHeaders */
    private void m7317x9570771e(p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar) {
        java.nio.ByteOrder m7319x1314ca30 = m7319x1314ca30(bVar);
        this.f3352x73633c89 = m7319x1314ca30;
        bVar.f92712f = m7319x1314ca30;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i17 = this.f3358xd203951b;
        if (i17 != 7 && i17 != 10 && readUnsignedShort != 42) {
            throw new java.io.IOException("Invalid start code: " + java.lang.Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new java.io.IOException("Invalid first Ifd offset: " + readInt);
        }
        int i18 = readInt - 8;
        if (i18 > 0) {
            bVar.a(i18);
        }
    }

    /* renamed from: printAttributes */
    private void m7318xd7583e4() {
        int i17 = 0;
        while (true) {
            java.util.HashMap<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute>[] hashMapArr = this.f3350xf45fa1a4;
            if (i17 >= hashMapArr.length) {
                return;
            }
            hashMapArr[i17].size();
            for (java.util.Map.Entry<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute> entry : this.f3350xf45fa1a4[i17].entrySet()) {
                p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute value = entry.getValue();
                entry.getKey();
                value.m7384x9616526c();
                value.m7381x7f48eaaa(this.f3352x73633c89);
            }
            i17++;
        }
    }

    /* renamed from: readByteOrder */
    private java.nio.ByteOrder m7319x1314ca30(p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            return java.nio.ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return java.nio.ByteOrder.BIG_ENDIAN;
        }
        throw new java.io.IOException("Invalid byte order: " + java.lang.Integer.toHexString(readShort));
    }

    /* renamed from: readExifSegment */
    private void m7320x31f7c08d(byte[] bArr, int i17) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.f fVar = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.f(bArr);
        m7317x9570771e(fVar);
        m7321xebf8a2ec(fVar, i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019a  */
    /* renamed from: readImageFileDirectory */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m7321xebf8a2ec(p012xc85e97e9.p085x39fce629.p086x62f6fe4.f r27, int r28) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.m7321xebf8a2ec(androidx.exifinterface.media.f, int):void");
    }

    /* renamed from: removeAttribute */
    private void m7322x7ea42678(java.lang.String str) {
        for (int i17 = 0; i17 < f2926x3e555de8.length; i17++) {
            this.f3350xf45fa1a4[i17].remove(str);
        }
    }

    /* renamed from: replaceInvalidTags */
    private void m7323xf9c1c35c(int i17, java.lang.String str, java.lang.String str2) {
        if (this.f3350xf45fa1a4[i17].isEmpty() || this.f3350xf45fa1a4[i17].get(str) == null) {
            return;
        }
        java.util.HashMap<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute> hashMap = this.f3350xf45fa1a4[i17];
        hashMap.put(str2, hashMap.get(str));
        this.f3350xf45fa1a4[i17].remove(str);
    }

    /* renamed from: retrieveJpegImageSize */
    private void m7324xef773d98(p012xc85e97e9.p085x39fce629.p086x62f6fe4.f fVar, int i17) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute = this.f3350xf45fa1a4[i17].get(f3232x4289cf0f);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute2 = this.f3350xf45fa1a4[i17].get(f3234x23ca6c5d);
        if (exifAttribute == null || exifAttribute2 == null) {
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute3 = this.f3350xf45fa1a4[i17].get(f3241x2b607f9c);
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute4 = this.f3350xf45fa1a4[i17].get(f3242x722b24e9);
            if (exifAttribute3 == null || exifAttribute4 == null) {
                return;
            }
            int m7380x9cfee438 = exifAttribute3.m7380x9cfee438(this.f3352x73633c89);
            int m7380x9cfee4382 = exifAttribute3.m7380x9cfee438(this.f3352x73633c89);
            fVar.b(m7380x9cfee438);
            byte[] bArr = new byte[m7380x9cfee4382];
            fVar.readFully(bArr);
            m7289x4dd9d0d5(new p012xc85e97e9.p085x39fce629.p086x62f6fe4.b(bArr), m7380x9cfee438, i17);
        }
    }

    /* renamed from: saveJpegAttributes */
    private void m7325x6e3bb2bc(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        byte[] bArr;
        if (f2923x3de9e33) {
            java.util.Objects.toString(inputStream);
            java.util.Objects.toString(outputStream);
        }
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.b(inputStream);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.c cVar = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.c(outputStream, java.nio.ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new java.io.IOException("Invalid marker");
        }
        cVar.a(-1);
        if (bVar.readByte() != -40) {
            throw new java.io.IOException("Invalid marker");
        }
        cVar.a(-40);
        cVar.a(-1);
        cVar.a(-31);
        this.f3360x5c018bf5 = m7334x4fa82aa4(cVar);
        if (this.f3369x7f97b095 != null) {
            cVar.write(-1);
            cVar.a(-31);
            byte[] bArr2 = f2980x355db2ea;
            cVar.i(bArr2.length + 2 + this.f3369x7f97b095.f3371x59dc06b.length);
            cVar.write(bArr2);
            cVar.write(this.f3369x7f97b095.f3371x59dc06b);
            this.f3353x8fca3a6e = true;
        }
        byte[] bArr3 = new byte[4096];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.a(-1);
                cVar.a(readByte);
                p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.c(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.a(-1);
                cVar.a(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.i(readUnsignedShort);
                int i17 = readUnsignedShort - 2;
                if (i17 < 0) {
                    throw new java.io.IOException("Invalid length");
                }
                while (i17 > 0) {
                    int read = bVar.read(bArr3, 0, java.lang.Math.min(i17, 4096));
                    if (read >= 0) {
                        cVar.write(bArr3, 0, read);
                        i17 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort() - 2;
                if (readUnsignedShort2 < 0) {
                    throw new java.io.IOException("Invalid length");
                }
                byte[] bArr4 = f2980x355db2ea;
                if (readUnsignedShort2 >= bArr4.length) {
                    bArr = new byte[bArr4.length];
                } else {
                    byte[] bArr5 = f2979x509c8809;
                    bArr = readUnsignedShort2 >= bArr5.length ? new byte[bArr5.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.e(bArr, f2979x509c8809) || p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.e(bArr, bArr4)) {
                        bVar.a(readUnsignedShort2 - bArr.length);
                    }
                }
                cVar.a(-1);
                cVar.a(readByte);
                cVar.i(readUnsignedShort2 + 2);
                if (bArr != null) {
                    readUnsignedShort2 -= bArr.length;
                    cVar.write(bArr);
                }
                while (readUnsignedShort2 > 0) {
                    int read2 = bVar.read(bArr3, 0, java.lang.Math.min(readUnsignedShort2, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr3, 0, read2);
                        readUnsignedShort2 -= read2;
                    }
                }
            }
        }
        throw new java.io.IOException("Invalid marker");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x005b -> B:9:0x0027). Please report as a decompilation issue!!! */
    /* renamed from: savePngAttributes */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m7326x8a81d9e3(java.io.InputStream r9, java.io.OutputStream r10) {
        /*
            r8 = this;
            boolean r0 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2923x3de9e33
            if (r0 == 0) goto La
            java.util.Objects.toString(r9)
            java.util.Objects.toString(r10)
        La:
            androidx.exifinterface.media.b r0 = new androidx.exifinterface.media.b
            r0.<init>(r9)
            androidx.exifinterface.media.c r9 = new androidx.exifinterface.media.c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3111xb9d6a1e2
            int r10 = r10.length
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.d(r0, r9, r10)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = r8.f3369x7f97b095
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L26
            boolean r10 = r8.f3353x8fca3a6e
            if (r10 == 0) goto L5b
        L26:
            r10 = r1
        L27:
            if (r1 != 0) goto L30
            if (r10 == 0) goto L2c
            goto L30
        L2c:
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.c(r0, r9)
            return
        L30:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L5d
            r9.b(r3)
            r9.b(r4)
            int r3 = r3 + 4
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.d(r0, r9, r3)
            int r3 = r8.f3360x5c018bf5
            if (r3 != 0) goto L50
            r8.m7335xf6cc4493(r9)
            r1 = r2
        L50:
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = r8.f3369x7f97b095
            if (r3 == 0) goto L27
            boolean r3 = r8.f3353x8fca3a6e
            if (r3 != 0) goto L27
            r8.m7336x5fe81255(r9)
        L5b:
            r10 = r2
            goto L27
        L5d:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L6e
            if (r1 == 0) goto L6e
            r8.m7335xf6cc4493(r9)
            int r3 = r3 + 4
            r0.a(r3)
            r1 = r2
            goto L27
        L6e:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto La0
            byte[] r5 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3110x95a24a23
            int r6 = r5.length
            if (r3 < r6) goto La0
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto L93
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = r8.f3369x7f97b095
            if (r10 == 0) goto L8f
            r8.m7336x5fe81255(r9)
        L8f:
            r0.a(r6)
            goto L5b
        L93:
            r9.b(r3)
            r9.b(r4)
            r9.write(r7)
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.d(r0, r9, r6)
            goto L27
        La0:
            r9.b(r3)
            r9.b(r4)
            int r3 = r3 + 4
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.d(r0, r9, r3)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.m7326x8a81d9e3(java.io.InputStream, java.io.OutputStream):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01e5 A[Catch: all -> 0x01f8, Exception -> 0x01fb, TryCatch #5 {Exception -> 0x01fb, all -> 0x01f8, blocks: (B:9:0x0032, B:11:0x003e, B:13:0x0053, B:14:0x0055, B:16:0x01cb, B:18:0x01e5, B:19:0x01ee, B:23:0x0061, B:25:0x0070, B:27:0x0078, B:28:0x007c, B:31:0x008c, B:33:0x0097, B:34:0x009c, B:36:0x009e, B:41:0x00ac, B:39:0x00b1, B:44:0x00b5, B:46:0x00c1, B:48:0x00c9, B:52:0x00d8, B:54:0x00e0, B:55:0x00e4, B:57:0x00ef, B:59:0x00ff, B:61:0x0151, B:63:0x015d, B:64:0x0166, B:66:0x01a6, B:67:0x01c2, B:68:0x01b2, B:70:0x01ba, B:71:0x010c, B:72:0x0113, B:73:0x0114, B:75:0x011c, B:77:0x0122, B:80:0x013a, B:82:0x0144, B:83:0x014b), top: B:8:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015d A[Catch: all -> 0x01f8, Exception -> 0x01fb, TryCatch #5 {Exception -> 0x01fb, all -> 0x01f8, blocks: (B:9:0x0032, B:11:0x003e, B:13:0x0053, B:14:0x0055, B:16:0x01cb, B:18:0x01e5, B:19:0x01ee, B:23:0x0061, B:25:0x0070, B:27:0x0078, B:28:0x007c, B:31:0x008c, B:33:0x0097, B:34:0x009c, B:36:0x009e, B:41:0x00ac, B:39:0x00b1, B:44:0x00b5, B:46:0x00c1, B:48:0x00c9, B:52:0x00d8, B:54:0x00e0, B:55:0x00e4, B:57:0x00ef, B:59:0x00ff, B:61:0x0151, B:63:0x015d, B:64:0x0166, B:66:0x01a6, B:67:0x01c2, B:68:0x01b2, B:70:0x01ba, B:71:0x010c, B:72:0x0113, B:73:0x0114, B:75:0x011c, B:77:0x0122, B:80:0x013a, B:82:0x0144, B:83:0x014b), top: B:8:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a6 A[Catch: all -> 0x01f8, Exception -> 0x01fb, TryCatch #5 {Exception -> 0x01fb, all -> 0x01f8, blocks: (B:9:0x0032, B:11:0x003e, B:13:0x0053, B:14:0x0055, B:16:0x01cb, B:18:0x01e5, B:19:0x01ee, B:23:0x0061, B:25:0x0070, B:27:0x0078, B:28:0x007c, B:31:0x008c, B:33:0x0097, B:34:0x009c, B:36:0x009e, B:41:0x00ac, B:39:0x00b1, B:44:0x00b5, B:46:0x00c1, B:48:0x00c9, B:52:0x00d8, B:54:0x00e0, B:55:0x00e4, B:57:0x00ef, B:59:0x00ff, B:61:0x0151, B:63:0x015d, B:64:0x0166, B:66:0x01a6, B:67:0x01c2, B:68:0x01b2, B:70:0x01ba, B:71:0x010c, B:72:0x0113, B:73:0x0114, B:75:0x011c, B:77:0x0122, B:80:0x013a, B:82:0x0144, B:83:0x014b), top: B:8:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b2 A[Catch: all -> 0x01f8, Exception -> 0x01fb, TryCatch #5 {Exception -> 0x01fb, all -> 0x01f8, blocks: (B:9:0x0032, B:11:0x003e, B:13:0x0053, B:14:0x0055, B:16:0x01cb, B:18:0x01e5, B:19:0x01ee, B:23:0x0061, B:25:0x0070, B:27:0x0078, B:28:0x007c, B:31:0x008c, B:33:0x0097, B:34:0x009c, B:36:0x009e, B:41:0x00ac, B:39:0x00b1, B:44:0x00b5, B:46:0x00c1, B:48:0x00c9, B:52:0x00d8, B:54:0x00e0, B:55:0x00e4, B:57:0x00ef, B:59:0x00ff, B:61:0x0151, B:63:0x015d, B:64:0x0166, B:66:0x01a6, B:67:0x01c2, B:68:0x01b2, B:70:0x01ba, B:71:0x010c, B:72:0x0113, B:73:0x0114, B:75:0x011c, B:77:0x0122, B:80:0x013a, B:82:0x0144, B:83:0x014b), top: B:8:0x0032 }] */
    /* renamed from: saveWebpAttributes */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m7327xcbd300f0(java.io.InputStream r22, java.io.OutputStream r23) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.m7327xcbd300f0(java.io.InputStream, java.io.OutputStream):void");
    }

    /* renamed from: setThumbnailData */
    private void m7328xbcfa8174(p012xc85e97e9.p085x39fce629.p086x62f6fe4.b bVar) {
        java.util.HashMap<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute> hashMap = this.f3350xf45fa1a4[4];
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute = hashMap.get(f3168xac402801);
        if (exifAttribute == null) {
            this.f3366x710de0e7 = 6;
            m7300x2ab151e7(bVar, hashMap);
            return;
        }
        int m7380x9cfee438 = exifAttribute.m7380x9cfee438(this.f3352x73633c89);
        this.f3366x710de0e7 = m7380x9cfee438;
        if (m7380x9cfee438 != 1) {
            if (m7380x9cfee438 == 6) {
                m7300x2ab151e7(bVar, hashMap);
                return;
            } else if (m7380x9cfee438 != 7) {
                return;
            }
        }
        if (m7310x11eda4c8(hashMap)) {
            m7301x53c98b69(bVar, hashMap);
        }
    }

    /* renamed from: shouldSupportSeek */
    private static boolean m7329xa5cd5734(int i17) {
        return (i17 == 4 || i17 == 9 || i17 == 13 || i17 == 14) ? false : true;
    }

    /* renamed from: swapBasedOnImageSize */
    private void m7330x60307add(int i17, int i18) {
        if (this.f3350xf45fa1a4[i17].isEmpty() || this.f3350xf45fa1a4[i18].isEmpty()) {
            return;
        }
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute = this.f3350xf45fa1a4[i17].get(f3232x4289cf0f);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute2 = this.f3350xf45fa1a4[i17].get(f3234x23ca6c5d);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute3 = this.f3350xf45fa1a4[i18].get(f3232x4289cf0f);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute4 = this.f3350xf45fa1a4[i18].get(f3234x23ca6c5d);
        if (exifAttribute == null || exifAttribute2 == null || exifAttribute3 == null || exifAttribute4 == null) {
            return;
        }
        int m7380x9cfee438 = exifAttribute.m7380x9cfee438(this.f3352x73633c89);
        int m7380x9cfee4382 = exifAttribute2.m7380x9cfee438(this.f3352x73633c89);
        int m7380x9cfee4383 = exifAttribute3.m7380x9cfee438(this.f3352x73633c89);
        int m7380x9cfee4384 = exifAttribute4.m7380x9cfee438(this.f3352x73633c89);
        if (m7380x9cfee438 >= m7380x9cfee4383 || m7380x9cfee4382 >= m7380x9cfee4384) {
            return;
        }
        java.util.HashMap<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute>[] hashMapArr = this.f3350xf45fa1a4;
        java.util.HashMap<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute> hashMap = hashMapArr[i17];
        hashMapArr[i17] = hashMapArr[i18];
        hashMapArr[i18] = hashMap;
    }

    /* renamed from: updateCrcWithInt */
    private static void m7331x126efe7e(java.util.zip.CRC32 crc32, int i17) {
        crc32.update(i17 >>> 24);
        crc32.update(i17 >>> 16);
        crc32.update(i17 >>> 8);
        crc32.update(i17);
    }

    /* renamed from: updateImageSizeValues */
    private void m7332x73ba2835(p012xc85e97e9.p085x39fce629.p086x62f6fe4.f fVar, int i17) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7377x5d1e7523;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7377x5d1e75232;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute = this.f3350xf45fa1a4[i17].get(f3175x4efe22d);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute2 = this.f3350xf45fa1a4[i17].get(f3282x11886be4);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute3 = this.f3350xf45fa1a4[i17].get(f3280x93e993b6);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute4 = this.f3350xf45fa1a4[i17].get(f3279xc6446092);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute5 = this.f3350xf45fa1a4[i17].get(f3281xdd2ea5bd);
        if (exifAttribute != null) {
            if (exifAttribute.f3373xb45ff7f7 == 5) {
                p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[] eVarArr = (p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[]) exifAttribute.m7382x754a37bb(this.f3352x73633c89);
                if (eVarArr == null || eVarArr.length != 2) {
                    java.util.Arrays.toString(eVarArr);
                    return;
                } else {
                    m7377x5d1e7523 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7375x893d5327(eVarArr[0], this.f3352x73633c89);
                    m7377x5d1e75232 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7375x893d5327(eVarArr[1], this.f3352x73633c89);
                }
            } else {
                int[] iArr = (int[]) exifAttribute.m7382x754a37bb(this.f3352x73633c89);
                if (iArr == null || iArr.length != 2) {
                    java.util.Arrays.toString(iArr);
                    return;
                } else {
                    m7377x5d1e7523 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7377x5d1e7523(iArr[0], this.f3352x73633c89);
                    m7377x5d1e75232 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7377x5d1e7523(iArr[1], this.f3352x73633c89);
                }
            }
            this.f3350xf45fa1a4[i17].put(f3234x23ca6c5d, m7377x5d1e7523);
            this.f3350xf45fa1a4[i17].put(f3232x4289cf0f, m7377x5d1e75232);
            return;
        }
        if (exifAttribute2 == null || exifAttribute3 == null || exifAttribute4 == null || exifAttribute5 == null) {
            m7324xef773d98(fVar, i17);
            return;
        }
        int m7380x9cfee438 = exifAttribute2.m7380x9cfee438(this.f3352x73633c89);
        int m7380x9cfee4382 = exifAttribute4.m7380x9cfee438(this.f3352x73633c89);
        int m7380x9cfee4383 = exifAttribute5.m7380x9cfee438(this.f3352x73633c89);
        int m7380x9cfee4384 = exifAttribute3.m7380x9cfee438(this.f3352x73633c89);
        if (m7380x9cfee4382 <= m7380x9cfee438 || m7380x9cfee4383 <= m7380x9cfee4384) {
            return;
        }
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7377x5d1e75233 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7377x5d1e7523(m7380x9cfee4382 - m7380x9cfee438, this.f3352x73633c89);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7377x5d1e75234 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7377x5d1e7523(m7380x9cfee4383 - m7380x9cfee4384, this.f3352x73633c89);
        this.f3350xf45fa1a4[i17].put(f3232x4289cf0f, m7377x5d1e75233);
        this.f3350xf45fa1a4[i17].put(f3234x23ca6c5d, m7377x5d1e75234);
    }

    /* renamed from: validateImages */
    private void m7333xdadadf2e() {
        m7330x60307add(0, 5);
        m7330x60307add(0, 4);
        m7330x60307add(5, 4);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute = this.f3350xf45fa1a4[1].get(f3267x1f11bc41);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute2 = this.f3350xf45fa1a4[1].get(f3268xb3f66f02);
        if (exifAttribute != null && exifAttribute2 != null) {
            this.f3350xf45fa1a4[0].put(f3234x23ca6c5d, exifAttribute);
            this.f3350xf45fa1a4[0].put(f3232x4289cf0f, exifAttribute2);
        }
        if (this.f3350xf45fa1a4[4].isEmpty() && m7313x958b92e2(this.f3350xf45fa1a4[5])) {
            java.util.HashMap<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute>[] hashMapArr = this.f3350xf45fa1a4;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new java.util.HashMap<>();
        }
        m7313x958b92e2(this.f3350xf45fa1a4[4]);
        m7323xf9c1c35c(0, "ThumbnailOrientation", f3264x118c46b);
        m7323xf9c1c35c(0, f3306xa8fb962, f3232x4289cf0f);
        m7323xf9c1c35c(0, f3307x43046baa, f3234x23ca6c5d);
        m7323xf9c1c35c(5, "ThumbnailOrientation", f3264x118c46b);
        m7323xf9c1c35c(5, f3306xa8fb962, f3232x4289cf0f);
        m7323xf9c1c35c(5, f3307x43046baa, f3234x23ca6c5d);
        m7323xf9c1c35c(4, f3264x118c46b, "ThumbnailOrientation");
        m7323xf9c1c35c(4, f3232x4289cf0f, f3306xa8fb962);
        m7323xf9c1c35c(4, f3234x23ca6c5d, f3307x43046baa);
    }

    /* renamed from: writeExifSegment */
    private int m7334x4fa82aa4(p012xc85e97e9.p085x39fce629.p086x62f6fe4.c cVar) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[][] dVarArr = f2926x3e555de8;
        int[] iArr = new int[dVarArr.length];
        int[] iArr2 = new int[dVarArr.length];
        for (p012xc85e97e9.p085x39fce629.p086x62f6fe4.d dVar : f2925x45e4d7ca) {
            m7322x7ea42678(dVar.f92718b);
        }
        if (this.f3355xa626447f) {
            if (this.f3356xebd4f5ba) {
                m7322x7ea42678(f3296x60596bd4);
                m7322x7ea42678(f3295xbcea680f);
            } else {
                m7322x7ea42678(f3241x2b607f9c);
                m7322x7ea42678(f3242x722b24e9);
            }
        }
        for (int i17 = 0; i17 < f2926x3e555de8.length; i17++) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute>> it = this.f3350xf45fa1a4[i17].entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == null) {
                    it.remove();
                }
            }
        }
        if (!this.f3350xf45fa1a4[1].isEmpty()) {
            this.f3350xf45fa1a4[0].put(f2925x45e4d7ca[1].f92718b, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7373xe1f5a4f5(0L, this.f3352x73633c89));
        }
        if (!this.f3350xf45fa1a4[2].isEmpty()) {
            this.f3350xf45fa1a4[0].put(f2925x45e4d7ca[2].f92718b, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7373xe1f5a4f5(0L, this.f3352x73633c89));
        }
        if (!this.f3350xf45fa1a4[3].isEmpty()) {
            this.f3350xf45fa1a4[1].put(f2925x45e4d7ca[3].f92718b, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7373xe1f5a4f5(0L, this.f3352x73633c89));
        }
        if (this.f3355xa626447f) {
            if (this.f3356xebd4f5ba) {
                this.f3350xf45fa1a4[4].put(f3296x60596bd4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7377x5d1e7523(0, this.f3352x73633c89));
                this.f3350xf45fa1a4[4].put(f3295xbcea680f, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7377x5d1e7523(this.f3367x2ab246c5, this.f3352x73633c89));
            } else {
                this.f3350xf45fa1a4[4].put(f3241x2b607f9c, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7373xe1f5a4f5(0L, this.f3352x73633c89));
                this.f3350xf45fa1a4[4].put(f3242x722b24e9, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7373xe1f5a4f5(this.f3367x2ab246c5, this.f3352x73633c89));
            }
        }
        for (int i18 = 0; i18 < f2926x3e555de8.length; i18++) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute>> it6 = this.f3350xf45fa1a4[i18].entrySet().iterator();
            int i19 = 0;
            while (it6.hasNext()) {
                int m7383x35e001 = it6.next().getValue().m7383x35e001();
                if (m7383x35e001 > 4) {
                    i19 += m7383x35e001;
                }
            }
            iArr2[i18] = iArr2[i18] + i19;
        }
        int i27 = 8;
        for (int i28 = 0; i28 < f2926x3e555de8.length; i28++) {
            if (!this.f3350xf45fa1a4[i28].isEmpty()) {
                iArr[i28] = i27;
                i27 += (this.f3350xf45fa1a4[i28].size() * 12) + 2 + 4 + iArr2[i28];
            }
        }
        if (this.f3355xa626447f) {
            if (this.f3356xebd4f5ba) {
                this.f3350xf45fa1a4[4].put(f3296x60596bd4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7377x5d1e7523(i27, this.f3352x73633c89));
            } else {
                this.f3350xf45fa1a4[4].put(f3241x2b607f9c, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7373xe1f5a4f5(i27, this.f3352x73633c89));
            }
            this.f3368x2fdb7072 = i27;
            i27 += this.f3367x2ab246c5;
        }
        if (this.f3358xd203951b == 4) {
            i27 += 8;
        }
        if (f2923x3de9e33) {
            for (int i29 = 0; i29 < f2926x3e555de8.length; i29++) {
                java.lang.String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(iArr[i29]), java.lang.Integer.valueOf(this.f3350xf45fa1a4[i29].size()), java.lang.Integer.valueOf(iArr2[i29]), java.lang.Integer.valueOf(i27));
            }
        }
        if (!this.f3350xf45fa1a4[1].isEmpty()) {
            this.f3350xf45fa1a4[0].put(f2925x45e4d7ca[1].f92718b, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7373xe1f5a4f5(iArr[1], this.f3352x73633c89));
        }
        if (!this.f3350xf45fa1a4[2].isEmpty()) {
            this.f3350xf45fa1a4[0].put(f2925x45e4d7ca[2].f92718b, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7373xe1f5a4f5(iArr[2], this.f3352x73633c89));
        }
        if (!this.f3350xf45fa1a4[3].isEmpty()) {
            this.f3350xf45fa1a4[1].put(f2925x45e4d7ca[3].f92718b, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7373xe1f5a4f5(iArr[3], this.f3352x73633c89));
        }
        int i37 = this.f3358xd203951b;
        if (i37 == 4) {
            if (i27 > 65535) {
                throw new java.lang.IllegalStateException("Size of exif data (" + i27 + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
            }
            cVar.i(i27);
            cVar.write(f2979x509c8809);
        } else if (i37 == 13) {
            cVar.b(i27);
            cVar.b(f3106xdf69194d);
        } else if (i37 == 14) {
            cVar.write(f3323x6038f4e0);
            cVar.b(i27);
        }
        int size = cVar.f92715d.size();
        cVar.c(this.f3352x73633c89 == java.nio.ByteOrder.BIG_ENDIAN ? f2907x77eaaa91 : f2906x77eaaa11);
        cVar.f92716e = this.f3352x73633c89;
        cVar.i(42);
        cVar.f(8L);
        for (int i38 = 0; i38 < f2926x3e555de8.length; i38++) {
            if (!this.f3350xf45fa1a4[i38].isEmpty()) {
                cVar.i(this.f3350xf45fa1a4[i38].size());
                int size2 = iArr[i38] + 2 + (this.f3350xf45fa1a4[i38].size() * 12) + 4;
                for (java.util.Map.Entry<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute> entry : this.f3350xf45fa1a4[i38].entrySet()) {
                    int i39 = f3344xd610b621[i38].get(entry.getKey()).f92717a;
                    p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute value = entry.getValue();
                    int m7383x35e0012 = value.m7383x35e001();
                    cVar.i(i39);
                    cVar.i(value.f3373xb45ff7f7);
                    cVar.b(value.f3374x275cd636);
                    if (m7383x35e0012 > 4) {
                        cVar.f(size2);
                        size2 += m7383x35e0012;
                    } else {
                        cVar.write(value.f3371x59dc06b);
                        if (m7383x35e0012 < 4) {
                            while (m7383x35e0012 < 4) {
                                cVar.a(0);
                                m7383x35e0012++;
                            }
                        }
                    }
                }
                if (i38 != 0 || this.f3350xf45fa1a4[4].isEmpty()) {
                    cVar.f(0L);
                } else {
                    cVar.f(iArr[4]);
                }
                java.util.Iterator<java.util.Map.Entry<java.lang.String, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute>> it7 = this.f3350xf45fa1a4[i38].entrySet().iterator();
                while (it7.hasNext()) {
                    byte[] bArr = it7.next().getValue().f3371x59dc06b;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f3355xa626447f) {
            cVar.write(m7354x1a4dffd5());
        }
        if (this.f3358xd203951b == 14 && i27 % 2 == 1) {
            cVar.a(0);
        }
        cVar.f92716e = java.nio.ByteOrder.BIG_ENDIAN;
        return size;
    }

    /* renamed from: writePngExifChunk */
    private void m7335xf6cc4493(p012xc85e97e9.p085x39fce629.p086x62f6fe4.c cVar) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        this.f3360x5c018bf5 = cVar.f92715d.size() + m7334x4fa82aa4(new p012xc85e97e9.p085x39fce629.p086x62f6fe4.c(byteArrayOutputStream, java.nio.ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.b((int) crc32.getValue());
    }

    /* renamed from: writePngXmpItxtChunk */
    private void m7336x5fe81255(p012xc85e97e9.p085x39fce629.p086x62f6fe4.c cVar) {
        cVar.b(this.f3369x7f97b095.f3371x59dc06b.length + 22);
        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
        cVar.b(f3109xdf6adda4);
        m7331x126efe7e(crc32, f3109xdf6adda4);
        byte[] bArr = f3110x95a24a23;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.f3369x7f97b095.f3371x59dc06b);
        crc32.update(this.f3369x7f97b095.f3371x59dc06b);
        cVar.b((int) crc32.getValue());
        this.f3353x8fca3a6e = true;
    }

    /* renamed from: flipHorizontally */
    public void m7337x4b4839be() {
        int i17 = 1;
        switch (m7343x245ab229(f3264x118c46b, 1)) {
            case 1:
                i17 = 2;
                break;
            case 2:
                break;
            case 3:
                i17 = 4;
                break;
            case 4:
                i17 = 3;
                break;
            case 5:
                i17 = 6;
                break;
            case 6:
                i17 = 5;
                break;
            case 7:
                i17 = 8;
                break;
            case 8:
                i17 = 7;
                break;
            default:
                i17 = 0;
                break;
        }
        m7364x5c88dc5a(f3264x118c46b, java.lang.Integer.toString(i17));
    }

    /* renamed from: flipVertically */
    public void m7338x6ca267d0() {
        int i17 = 1;
        switch (m7343x245ab229(f3264x118c46b, 1)) {
            case 1:
                i17 = 4;
                break;
            case 2:
                i17 = 3;
                break;
            case 3:
                i17 = 2;
                break;
            case 4:
                break;
            case 5:
                i17 = 8;
                break;
            case 6:
                i17 = 7;
                break;
            case 7:
                i17 = 6;
                break;
            case 8:
                i17 = 5;
                break;
            default:
                i17 = 0;
                break;
        }
        m7364x5c88dc5a(f3264x118c46b, java.lang.Integer.toString(i17));
    }

    /* renamed from: getAltitude */
    public double m7339xf53d8818(double d17) {
        double m7342x8dea7f57 = m7342x8dea7f57(f3198x86afef5c, -1.0d);
        int m7343x245ab229 = m7343x245ab229(f3199xc45d4d10, -1);
        if (m7342x8dea7f57 < 0.0d || m7343x245ab229 < 0) {
            return d17;
        }
        return m7342x8dea7f57 * (m7343x245ab229 != 1 ? 1 : -1);
    }

    /* renamed from: getAttribute */
    public java.lang.String m7340x351be6(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7287x51a0ffb6 = m7287x51a0ffb6(str);
        if (m7287x51a0ffb6 == null) {
            return null;
        }
        if (!str.equals(f3227x9f911b7c)) {
            if (!f3114xef53f2d2.contains(str)) {
                return m7287x51a0ffb6.m7381x7f48eaaa(this.f3352x73633c89);
            }
            try {
                return java.lang.Double.toString(m7287x51a0ffb6.m7379x78e226ea(this.f3352x73633c89));
            } catch (java.lang.NumberFormatException unused) {
                return null;
            }
        }
        int i17 = m7287x51a0ffb6.f3373xb45ff7f7;
        if (i17 != 5 && i17 != 10) {
            return null;
        }
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[] eVarArr = (p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[]) m7287x51a0ffb6.m7382x754a37bb(this.f3352x73633c89);
        if (eVarArr == null || eVarArr.length != 3) {
            java.util.Arrays.toString(eVarArr);
            return null;
        }
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.e eVar = eVarArr[0];
        java.lang.Integer valueOf = java.lang.Integer.valueOf((int) (((float) eVar.f92721a) / ((float) eVar.f92722b)));
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.e eVar2 = eVarArr[1];
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf((int) (((float) eVar2.f92721a) / ((float) eVar2.f92722b)));
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.e eVar3 = eVarArr[2];
        return java.lang.String.format("%02d:%02d:%02d", valueOf, valueOf2, java.lang.Integer.valueOf((int) (((float) eVar3.f92721a) / ((float) eVar3.f92722b))));
    }

    /* renamed from: getAttributeBytes */
    public byte[] m7341x78193425(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7287x51a0ffb6 = m7287x51a0ffb6(str);
        if (m7287x51a0ffb6 != null) {
            return m7287x51a0ffb6.f3371x59dc06b;
        }
        return null;
    }

    /* renamed from: getAttributeDouble */
    public double m7342x8dea7f57(java.lang.String str, double d17) {
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7287x51a0ffb6 = m7287x51a0ffb6(str);
        if (m7287x51a0ffb6 == null) {
            return d17;
        }
        try {
            return m7287x51a0ffb6.m7379x78e226ea(this.f3352x73633c89);
        } catch (java.lang.NumberFormatException unused) {
            return d17;
        }
    }

    /* renamed from: getAttributeInt */
    public int m7343x245ab229(java.lang.String str, int i17) {
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7287x51a0ffb6 = m7287x51a0ffb6(str);
        if (m7287x51a0ffb6 == null) {
            return i17;
        }
        try {
            return m7287x51a0ffb6.m7380x9cfee438(this.f3352x73633c89);
        } catch (java.lang.NumberFormatException unused) {
            return i17;
        }
    }

    /* renamed from: getAttributeRange */
    public long[] m7344x78efacf7(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        if (this.f3359x4daa56) {
            throw new java.lang.IllegalStateException("The underlying file has been modified since being parsed");
        }
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute m7287x51a0ffb6 = m7287x51a0ffb6(str);
        if (m7287x51a0ffb6 != null) {
            return new long[]{m7287x51a0ffb6.f3372xf124d4de, m7287x51a0ffb6.f3371x59dc06b.length};
        }
        return null;
    }

    /* renamed from: getDateTime */
    public java.lang.Long m7345xe6b56d11() {
        return m7316x3c2d4b6e(m7340x351be6(f3172xb3aee2a0), m7340x351be6(f3302xda8596f6), m7340x351be6(f3255xa4b949b4));
    }

    /* renamed from: getDateTimeDigitized */
    public java.lang.Long m7346x52e1822c() {
        return m7316x3c2d4b6e(m7340x351be6(f3173x3cbed13e), m7340x351be6(f3303x22989214), m7340x351be6(f3256x8f126f52));
    }

    /* renamed from: getDateTimeOriginal */
    public java.lang.Long m7347xb390ba02() {
        return m7316x3c2d4b6e(m7340x351be6(f3174x9a13bc90), m7340x351be6(f3304x783388fa), m7340x351be6(f3257xd68a0bfc));
    }

    /* renamed from: getGpsDateTime */
    public java.lang.Long m7348xab6f212f() {
        java.lang.String m7340x351be6 = m7340x351be6(f3201x8e8c633b);
        java.lang.String m7340x351be62 = m7340x351be6(f3227x9f911b7c);
        if (m7340x351be6 != null && m7340x351be62 != null) {
            java.util.regex.Pattern pattern = f3078x8387723;
            if (pattern.matcher(m7340x351be6).matches() || pattern.matcher(m7340x351be62).matches()) {
                java.lang.String str = m7340x351be6 + ' ' + m7340x351be62;
                java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
                try {
                    java.util.Date parse = f3345x27d55c6b.parse(str, parsePosition);
                    if (parse == null && (parse = f3346xc502c99d.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return java.lang.Long.valueOf(parse.getTime());
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @java.lang.Deprecated
    /* renamed from: getLatLong */
    public boolean m7349x3afb3085(float[] fArr) {
        double[] m7350x3afb3085 = m7350x3afb3085();
        if (m7350x3afb3085 == null) {
            return false;
        }
        fArr[0] = (float) m7350x3afb3085[0];
        fArr[1] = (float) m7350x3afb3085[1];
        return true;
    }

    /* renamed from: getRotationDegrees */
    public int m7351x2a7ffb93() {
        switch (m7343x245ab229(f3264x118c46b, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    /* renamed from: getThumbnail */
    public byte[] m7352x4ebbc236() {
        int i17 = this.f3366x710de0e7;
        if (i17 == 6 || i17 == 7) {
            return m7354x1a4dffd5();
        }
        return null;
    }

    /* renamed from: getThumbnailBitmap */
    public android.graphics.Bitmap m7353x2e909f05() {
        if (!this.f3355xa626447f) {
            return null;
        }
        if (this.f3365x32693cac == null) {
            this.f3365x32693cac = m7354x1a4dffd5();
        }
        int i17 = this.f3366x710de0e7;
        if (i17 == 6 || i17 == 7) {
            byte[] bArr = this.f3365x32693cac;
            int i18 = this.f3367x2ab246c5;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(0);
            arrayList.add(bArr);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "androidx/exifinterface/media/ExifInterface", "getThumbnailBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "androidx/exifinterface/media/ExifInterface", "getThumbnailBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            return decodeByteArray;
        }
        if (i17 != 1) {
            return null;
        }
        int length = this.f3365x32693cac.length / 3;
        int[] iArr = new int[length];
        for (int i19 = 0; i19 < length; i19++) {
            byte[] bArr2 = this.f3365x32693cac;
            int i27 = i19 * 3;
            iArr[i19] = (bArr2[i27] << com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028) + 0 + (bArr2[i27 + 1] << 8) + bArr2[i27 + 2];
        }
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute = this.f3350xf45fa1a4[4].get(f3306xa8fb962);
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute exifAttribute2 = this.f3350xf45fa1a4[4].get(f3307x43046baa);
        if (exifAttribute == null || exifAttribute2 == null) {
            return null;
        }
        int m7380x9cfee438 = exifAttribute.m7380x9cfee438(this.f3352x73633c89);
        int m7380x9cfee4382 = exifAttribute2.m7380x9cfee438(this.f3352x73633c89);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(config);
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(m7380x9cfee438));
        arrayList2.add(java.lang.Integer.valueOf(m7380x9cfee4382));
        arrayList2.add(iArr);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "androidx/exifinterface/media/ExifInterface", "getThumbnailBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((int[]) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(3));
        yj0.a.e(obj2, createBitmap, "androidx/exifinterface/media/ExifInterface", "getThumbnailBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[SYNTHETIC] */
    /* renamed from: getThumbnailBytes */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] m7354x1a4dffd5() {
        /*
            r7 = this;
            boolean r0 = r7.f3355xa626447f
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte[] r0 = r7.f3365x32693cac
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.content.res.AssetManager$AssetInputStream r0 = r7.f3349x59ec6567     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L7f
            if (r0 == 0) goto L27
            boolean r2 = r0.markSupported()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L24
            if (r2 == 0) goto L1a
            r0.reset()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L24
        L18:
            r2 = r1
            goto L48
        L1a:
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.a(r0)
            return r1
        L1e:
            r2 = move-exception
            r6 = r1
            r1 = r0
            r0 = r2
            r2 = r6
            goto L76
        L24:
            r2 = r1
            goto L81
        L27:
            java.lang.String r0 = r7.f3354xf931f994     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L7f
            if (r0 == 0) goto L33
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L7f
            java.lang.String r2 = r7.f3354xf931f994     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L7f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L7f
            goto L18
        L33:
            java.io.FileDescriptor r0 = r7.f3364x5d11034a     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L7f
            java.io.FileDescriptor r0 = android.system.Os.dup(r0)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L7f
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L70
            r3 = 0
            android.system.Os.lseek(r0, r3, r2)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L70
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L70
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L70
            r6 = r2
            r2 = r0
            r0 = r6
        L48:
            androidx.exifinterface.media.b r3 = new androidx.exifinterface.media.b     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            int r4 = r7.f3368x2fdb7072     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            int r5 = r7.f3360x5c018bf5     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            int r4 = r4 + r5
            r3.a(r4)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            int r4 = r7.f3367x2ab246c5     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            r3.readFully(r4)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            r7.f3365x32693cac = r4     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.a(r0)
            if (r2 == 0) goto L66
            android.system.Os.close(r2)     // Catch: android.system.ErrnoException -> L66
        L66:
            return r4
        L67:
            r1 = move-exception
            r6 = r1
            r1 = r0
            goto L6e
        L6b:
            r2 = move-exception
            r6 = r2
            r2 = r0
        L6e:
            r0 = r6
            goto L76
        L70:
            r2 = r0
            r0 = r1
            goto L81
        L73:
            r2 = move-exception
            r0 = r2
            r2 = r1
        L76:
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.a(r1)
            if (r2 == 0) goto L7e
            android.system.Os.close(r2)     // Catch: android.system.ErrnoException -> L7e
        L7e:
            throw r0
        L7f:
            r0 = r1
            r2 = r0
        L81:
            p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.a(r0)
            if (r2 == 0) goto L89
            android.system.Os.close(r2)     // Catch: android.system.ErrnoException -> L89
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.m7354x1a4dffd5():byte[]");
    }

    /* renamed from: getThumbnailRange */
    public long[] m7355x1b2478a7() {
        if (this.f3359x4daa56) {
            throw new java.lang.IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.f3355xa626447f) {
            return null;
        }
        if (!this.f3356xebd4f5ba || this.f3348x4df34cca) {
            return new long[]{this.f3368x2fdb7072 + this.f3360x5c018bf5, this.f3367x2ab246c5};
        }
        return null;
    }

    /* renamed from: hasAttribute */
    public boolean m7356xc00a8522(java.lang.String str) {
        return m7287x51a0ffb6(str) != null;
    }

    /* renamed from: hasThumbnail */
    public boolean m7357xe912b72() {
        return this.f3355xa626447f;
    }

    /* renamed from: isFlipped */
    public boolean m7358xaf7484f8() {
        int m7343x245ab229 = m7343x245ab229(f3264x118c46b, 1);
        return m7343x245ab229 == 2 || m7343x245ab229 == 7 || m7343x245ab229 == 4 || m7343x245ab229 == 5;
    }

    /* renamed from: isThumbnailCompressed */
    public boolean m7359xa46f6403() {
        if (!this.f3355xa626447f) {
            return false;
        }
        int i17 = this.f3366x710de0e7;
        return i17 == 6 || i17 == 7;
    }

    /* renamed from: resetOrientation */
    public void m7360xf46901() {
        m7364x5c88dc5a(f3264x118c46b, java.lang.Integer.toString(1));
    }

    /* renamed from: rotate */
    public void m7361xc8dadd5b(int i17) {
        if (i17 % 90 != 0) {
            throw new java.lang.IllegalArgumentException("degree should be a multiple of 90");
        }
        int m7343x245ab229 = m7343x245ab229(f3264x118c46b, 1);
        java.util.List<java.lang.Integer> list = f3120x8ab0db2d;
        if (list.contains(java.lang.Integer.valueOf(m7343x245ab229))) {
            int indexOf = (list.indexOf(java.lang.Integer.valueOf(m7343x245ab229)) + (i17 / 90)) % 4;
            r4 = list.get(indexOf + (indexOf < 0 ? 4 : 0)).intValue();
        } else {
            java.util.List<java.lang.Integer> list2 = f2951xd19a4faa;
            if (list2.contains(java.lang.Integer.valueOf(m7343x245ab229))) {
                int indexOf2 = (list2.indexOf(java.lang.Integer.valueOf(m7343x245ab229)) + (i17 / 90)) % 4;
                r4 = list2.get(indexOf2 + (indexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        m7364x5c88dc5a(f3264x118c46b, java.lang.Integer.toString(r4));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9 A[Catch: all -> 0x0112, Exception -> 0x0115, TryCatch #19 {Exception -> 0x0115, all -> 0x0112, blocks: (B:57:0x00e5, B:59:0x00e9, B:61:0x0101, B:65:0x00f2), top: B:56:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2 A[Catch: all -> 0x0112, Exception -> 0x0115, TryCatch #19 {Exception -> 0x0115, all -> 0x0112, blocks: (B:57:0x00e5, B:59:0x00e9, B:61:0x0101, B:65:0x00f2), top: B:56:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0147  */
    /* renamed from: saveAttributes */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m7362xaf634eb4() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.m7362xaf634eb4():void");
    }

    /* renamed from: setAltitude */
    public void m7363xeff5e924(double d17) {
        java.lang.String str = d17 >= 0.0d ? "0" : "1";
        m7364x5c88dc5a(f3198x86afef5c, p012xc85e97e9.p085x39fce629.p086x62f6fe4.e.a(java.lang.Math.abs(d17)).m7385x9616526c());
        m7364x5c88dc5a(f3199xc45d4d10, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:95:0x01ae. Please report as an issue. */
    /* renamed from: setAttribute */
    public void m7364x5c88dc5a(java.lang.String str, java.lang.String str2) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d dVar;
        java.lang.String str3;
        int i17;
        java.lang.String str4 = str;
        java.lang.String str5 = str2;
        if (str4 == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        if (f3240xa702825f.equals(str4)) {
            str4 = f3265x7309bd5b;
        }
        int i18 = 2;
        java.lang.String str6 = "/";
        int i19 = 1;
        if (str5 != null) {
            if (f3114xef53f2d2.contains(str4) && !str5.contains("/")) {
                try {
                    str5 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.e.a(java.lang.Double.parseDouble(str2)).m7385x9616526c();
                } catch (java.lang.NumberFormatException unused) {
                    return;
                }
            } else if (str4.equals(f3227x9f911b7c)) {
                java.util.regex.Matcher matcher = f2973x33ffb0b2.matcher(str5);
                if (!matcher.find()) {
                    return;
                }
                str5 = java.lang.Integer.parseInt(matcher.group(1)) + "/1," + java.lang.Integer.parseInt(matcher.group(2)) + "/1," + java.lang.Integer.parseInt(matcher.group(3)) + "/1";
            } else if (f3172xb3aee2a0.equals(str4) || f3174x9a13bc90.equals(str4) || f3173x3cbed13e.equals(str4)) {
                boolean find = f2920xeff3069.matcher(str5).find();
                boolean find2 = f2921x677bf5b7.matcher(str5).find();
                if (str2.length() != 19) {
                    return;
                }
                if (!find && !find2) {
                    return;
                }
                if (find2) {
                    str5 = str5.replaceAll("-", ":");
                }
            }
        }
        if (f3313xce8b79b6.equals(str4)) {
            boolean z17 = this.f3350xf45fa1a4[0].containsKey(f3313xce8b79b6) || this.f3350xf45fa1a4[5].containsKey(f3313xce8b79b6);
            int m7298x2b518276 = m7298x2b518276(this.f3358xd203951b);
            if ((m7298x2b518276 == 2 && (this.f3369x7f97b095 != null || !z17)) || (m7298x2b518276 == 3 && !z17)) {
                this.f3369x7f97b095 = str5 != null ? p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7368x51949824(str5) : null;
                return;
            }
        }
        int i27 = 0;
        while (i27 < f2926x3e555de8.length) {
            if ((i27 != 4 || this.f3355xa626447f) && (dVar = f3344xd610b621[i27].get(str4)) != null) {
                if (str5 == null) {
                    this.f3350xf45fa1a4[i27].remove(str4);
                } else {
                    android.util.Pair<java.lang.Integer, java.lang.Integer> m7299x7f59d578 = m7299x7f59d578(str5);
                    int intValue = ((java.lang.Integer) m7299x7f59d578.first).intValue();
                    int i28 = dVar.f92719c;
                    if (i28 != intValue && i28 != ((java.lang.Integer) m7299x7f59d578.second).intValue()) {
                        int i29 = dVar.f92720d;
                        if (i29 != -1 && (i29 == ((java.lang.Integer) m7299x7f59d578.first).intValue() || i29 == ((java.lang.Integer) m7299x7f59d578.second).intValue())) {
                            i28 = i29;
                        } else if (i28 != i19 && i28 != 7 && i28 != i18) {
                            if (f2923x3de9e33) {
                                java.lang.String[] strArr = f2986xada06358;
                                java.lang.String str7 = strArr[i28];
                                if (i29 != -1) {
                                    new java.lang.StringBuilder(", ").append(strArr[i29]);
                                }
                                java.lang.String str8 = strArr[((java.lang.Integer) m7299x7f59d578.first).intValue()];
                                if (((java.lang.Integer) m7299x7f59d578.second).intValue() != -1) {
                                    new java.lang.StringBuilder(", ").append(strArr[((java.lang.Integer) m7299x7f59d578.second).intValue()]);
                                }
                            }
                        }
                    }
                    switch (i28) {
                        case 1:
                            str3 = str6;
                            i17 = i19;
                            this.f3350xf45fa1a4[i27].put(str4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7368x51949824(str5));
                            break;
                        case 2:
                        case 7:
                            str3 = str6;
                            i17 = i19;
                            this.f3350xf45fa1a4[i27].put(str4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7372x5b8a402d(str5));
                            break;
                        case 3:
                            str3 = str6;
                            i17 = i19;
                            java.lang.String[] split = str5.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i37 = 0; i37 < split.length; i37++) {
                                iArr[i37] = java.lang.Integer.parseInt(split[i37]);
                            }
                            this.f3350xf45fa1a4[i27].put(str4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7378x5d1e7523(iArr, this.f3352x73633c89));
                            break;
                        case 4:
                            str3 = str6;
                            i17 = i19;
                            java.lang.String[] split2 = str5.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i38 = 0; i38 < split2.length; i38++) {
                                jArr[i38] = java.lang.Long.parseLong(split2[i38]);
                            }
                            this.f3350xf45fa1a4[i27].put(str4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7374xe1f5a4f5(jArr, this.f3352x73633c89));
                            break;
                        case 5:
                            java.lang.String[] split3 = str5.split(",", -1);
                            p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[] eVarArr = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[split3.length];
                            int i39 = 0;
                            while (i39 < split3.length) {
                                java.lang.String[] split4 = split3[i39].split(str6, -1);
                                eVarArr[i39] = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.e((long) java.lang.Double.parseDouble(split4[0]), (long) java.lang.Double.parseDouble(split4[1]));
                                i39++;
                                str6 = str6;
                            }
                            str3 = str6;
                            i17 = 1;
                            this.f3350xf45fa1a4[i27].put(str4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7376x893d5327(eVarArr, this.f3352x73633c89));
                            break;
                        case 9:
                            java.lang.String[] split5 = str5.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i47 = 0; i47 < split5.length; i47++) {
                                iArr2[i47] = java.lang.Integer.parseInt(split5[i47]);
                            }
                            this.f3350xf45fa1a4[i27].put(str4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7370xe1d975f3(iArr2, this.f3352x73633c89));
                            str3 = str6;
                            i17 = 1;
                            break;
                        case 10:
                            java.lang.String[] split6 = str5.split(",", -1);
                            p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[] eVarArr2 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.e[split6.length];
                            int i48 = 0;
                            while (i48 < split6.length) {
                                java.lang.String[] split7 = split6[i48].split(str6, -1);
                                eVarArr2[i48] = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.e((long) java.lang.Double.parseDouble(split7[0]), (long) java.lang.Double.parseDouble(split7[i19]));
                                i48++;
                                split6 = split6;
                                i19 = 1;
                            }
                            this.f3350xf45fa1a4[i27].put(str4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7371x60b47525(eVarArr2, this.f3352x73633c89));
                            str3 = str6;
                            i17 = 1;
                            break;
                        case 12:
                            java.lang.String[] split8 = str5.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i49 = 0; i49 < split8.length; i49++) {
                                dArr[i49] = java.lang.Double.parseDouble(split8[i49]);
                            }
                            this.f3350xf45fa1a4[i27].put(str4, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.ExifAttribute.m7369x41ac5bed(dArr, this.f3352x73633c89));
                            break;
                    }
                    i27++;
                    i19 = i17;
                    str6 = str3;
                    i18 = 2;
                }
            }
            str3 = str6;
            i17 = i19;
            i27++;
            i19 = i17;
            str6 = str3;
            i18 = 2;
        }
    }

    /* renamed from: setDateTime */
    public void m7365xe16dce1d(java.lang.Long l17) {
        if (l17 == null) {
            throw new java.lang.NullPointerException("Timestamp should not be null.");
        }
        if (l17.longValue() < 0) {
            throw new java.lang.IllegalArgumentException("Timestamp should a positive value.");
        }
        java.lang.String l18 = java.lang.Long.toString(l17.longValue() % 1000);
        for (int length = l18.length(); length < 3; length++) {
            l18 = "0" + l18;
        }
        m7364x5c88dc5a(f3172xb3aee2a0, f3345x27d55c6b.format(new java.util.Date(l17.longValue())));
        m7364x5c88dc5a(f3302xda8596f6, l18);
    }

    /* renamed from: setGpsInfo */
    public void m7366xbf768db6(android.location.Location location) {
        if (location == null) {
            return;
        }
        m7364x5c88dc5a(f3222x86a69813, location.getProvider());
        m7367xae6c7df9(location.getLatitude(), location.getLongitude());
        m7363xeff5e924(location.getAltitude());
        m7364x5c88dc5a(f3225x3a74eae1, "K");
        m7364x5c88dc5a(f3224x8c991dad, p012xc85e97e9.p085x39fce629.p086x62f6fe4.e.a((location.getSpeed() * ((float) java.util.concurrent.TimeUnit.HOURS.toSeconds(1L))) / 1000.0f).m7385x9616526c());
        java.lang.String[] split = f3345x27d55c6b.format(new java.util.Date(location.getTime())).split("\\s+", -1);
        m7364x5c88dc5a(f3201x8e8c633b, split[0]);
        m7364x5c88dc5a(f3227x9f911b7c, split[1]);
    }

    /* renamed from: setLatLong */
    public void m7367xae6c7df9(double d17, double d18) {
        if (d17 < -90.0d || d17 > 90.0d || java.lang.Double.isNaN(d17)) {
            throw new java.lang.IllegalArgumentException("Latitude value " + d17 + " is not valid.");
        }
        if (d18 < -180.0d || d18 > 180.0d || java.lang.Double.isNaN(d18)) {
            throw new java.lang.IllegalArgumentException("Longitude value " + d18 + " is not valid.");
        }
        m7364x5c88dc5a(f3217xb32bb9da, d17 >= 0.0d ? "N" : f3025x7c20d01a);
        m7364x5c88dc5a(f3216xb7785126, m7283x33071a8a(java.lang.Math.abs(d17)));
        m7364x5c88dc5a(f3219x716e5549, d18 >= 0.0d ? f3048xa13f9cad : f3049xa147da5f);
        m7364x5c88dc5a(f3218xa477fc15, m7283x33071a8a(java.lang.Math.abs(d18)));
    }

    /* renamed from: getLatLong */
    public double[] m7350x3afb3085() {
        java.lang.String m7340x351be6 = m7340x351be6(f3216xb7785126);
        java.lang.String m7340x351be62 = m7340x351be6(f3217xb32bb9da);
        java.lang.String m7340x351be63 = m7340x351be6(f3218xa477fc15);
        java.lang.String m7340x351be64 = m7340x351be6(f3219x716e5549);
        if (m7340x351be6 == null || m7340x351be62 == null || m7340x351be63 == null || m7340x351be64 == null) {
            return null;
        }
        try {
            return new double[]{m7284x8f0cc5d9(m7340x351be6, m7340x351be62), m7284x8f0cc5d9(m7340x351be63, m7340x351be64)};
        } catch (java.lang.IllegalArgumentException unused) {
            java.lang.String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", m7340x351be6, m7340x351be62, m7340x351be63, m7340x351be64);
            return null;
        }
    }

    public C1098xe10e35e9(java.lang.String str) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[][] dVarArr = f2926x3e555de8;
        this.f3350xf45fa1a4 = new java.util.HashMap[dVarArr.length];
        this.f3351x6327c3fc = new java.util.HashSet(dVarArr.length);
        this.f3352x73633c89 = java.nio.ByteOrder.BIG_ENDIAN;
        if (str != null) {
            m7302xb970e2c0(str);
            return;
        }
        throw new java.lang.NullPointerException("filename cannot be null");
    }

    public C1098xe10e35e9(java.io.FileDescriptor fileDescriptor) {
        boolean z17;
        java.io.FileInputStream fileInputStream;
        java.lang.Throwable th6;
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[][] dVarArr = f2926x3e555de8;
        this.f3350xf45fa1a4 = new java.util.HashMap[dVarArr.length];
        this.f3351x6327c3fc = new java.util.HashSet(dVarArr.length);
        this.f3352x73633c89 = java.nio.ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f3349x59ec6567 = null;
            this.f3354xf931f994 = null;
            if (m7309x8097c0da(fileDescriptor)) {
                this.f3364x5d11034a = fileDescriptor;
                try {
                    fileDescriptor = android.system.Os.dup(fileDescriptor);
                    z17 = true;
                } catch (java.lang.Exception e17) {
                    throw new java.io.IOException("Failed to duplicate file descriptor", e17);
                }
            } else {
                this.f3364x5d11034a = null;
                z17 = false;
            }
            try {
                fileInputStream = new java.io.FileInputStream(fileDescriptor);
                try {
                    m7315x5705e2dd(fileInputStream);
                    p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.a(fileInputStream);
                    if (z17) {
                        try {
                            android.system.Os.close(fileDescriptor);
                        } catch (android.system.ErrnoException unused) {
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    th6 = th7;
                    p012xc85e97e9.p085x39fce629.p086x62f6fe4.g.a(fileInputStream);
                    if (z17) {
                        try {
                            android.system.Os.close(fileDescriptor);
                        } catch (android.system.ErrnoException unused2) {
                        }
                    }
                    throw th6;
                }
            } catch (java.lang.Throwable th8) {
                fileInputStream = null;
                th6 = th8;
            }
        } else {
            throw new java.lang.NullPointerException("fileDescriptor cannot be null");
        }
    }

    public C1098xe10e35e9(java.io.InputStream inputStream) {
        this(inputStream, 0);
    }

    public C1098xe10e35e9(java.io.InputStream inputStream, int i17) {
        p012xc85e97e9.p085x39fce629.p086x62f6fe4.d[][] dVarArr = f2926x3e555de8;
        this.f3350xf45fa1a4 = new java.util.HashMap[dVarArr.length];
        this.f3351x6327c3fc = new java.util.HashSet(dVarArr.length);
        this.f3352x73633c89 = java.nio.ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f3354xf931f994 = null;
            boolean z17 = i17 == 1;
            this.f3357x617aa7bd = z17;
            if (z17) {
                this.f3349x59ec6567 = null;
                this.f3364x5d11034a = null;
            } else if (inputStream instanceof android.content.res.AssetManager.AssetInputStream) {
                this.f3349x59ec6567 = (android.content.res.AssetManager.AssetInputStream) inputStream;
                this.f3364x5d11034a = null;
            } else {
                if (inputStream instanceof java.io.FileInputStream) {
                    java.io.FileInputStream fileInputStream = (java.io.FileInputStream) inputStream;
                    if (m7309x8097c0da(fileInputStream.getFD())) {
                        this.f3349x59ec6567 = null;
                        this.f3364x5d11034a = fileInputStream.getFD();
                    }
                }
                this.f3349x59ec6567 = null;
                this.f3364x5d11034a = null;
            }
            m7315x5705e2dd(inputStream);
            return;
        }
        throw new java.lang.NullPointerException("inputStream cannot be null");
    }
}
