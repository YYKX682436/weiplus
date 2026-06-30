package androidx.exifinterface.media;

/* loaded from: classes13.dex */
public class ExifInterface {
    public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
    public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
    private static final java.nio.charset.Charset ASCII;
    static final short BYTE_ALIGN_II = 18761;
    static final short BYTE_ALIGN_MM = 19789;
    public static final int COLOR_SPACE_S_RGB = 1;
    public static final int COLOR_SPACE_UNCALIBRATED = 65535;
    public static final short CONTRAST_HARD = 2;
    public static final short CONTRAST_NORMAL = 0;
    public static final short CONTRAST_SOFT = 1;
    public static final int DATA_DEFLATE_ZIP = 8;
    public static final int DATA_HUFFMAN_COMPRESSED = 2;
    public static final int DATA_JPEG = 6;
    public static final int DATA_JPEG_COMPRESSED = 7;
    public static final int DATA_LOSSY_JPEG = 34892;
    public static final int DATA_PACK_BITS_COMPRESSED = 32773;
    public static final int DATA_UNCOMPRESSED = 1;
    private static final java.util.regex.Pattern DATETIME_PRIMARY_FORMAT_PATTERN;
    private static final java.util.regex.Pattern DATETIME_SECONDARY_FORMAT_PATTERN;
    private static final int DATETIME_VALUE_STRING_LENGTH = 19;
    private static final androidx.exifinterface.media.d[] EXIF_POINTER_TAGS;
    static final androidx.exifinterface.media.d[][] EXIF_TAGS;
    public static final short EXPOSURE_MODE_AUTO = 0;
    public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;
    public static final short EXPOSURE_MODE_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_ACTION = 6;
    public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
    public static final short EXPOSURE_PROGRAM_CREATIVE = 5;
    public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;
    public static final short EXPOSURE_PROGRAM_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_NORMAL = 2;
    public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
    public static final short EXPOSURE_PROGRAM_PORTRAIT_MODE = 7;
    public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
    public static final short FILE_SOURCE_DSC = 3;
    public static final short FILE_SOURCE_OTHER = 0;
    public static final short FILE_SOURCE_REFLEX_SCANNER = 2;
    public static final short FILE_SOURCE_TRANSPARENT_SCANNER = 1;
    public static final short FLAG_FLASH_FIRED = 1;
    public static final short FLAG_FLASH_MODE_AUTO = 24;
    public static final short FLAG_FLASH_MODE_COMPULSORY_FIRING = 8;
    public static final short FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION = 16;
    public static final short FLAG_FLASH_NO_FLASH_FUNCTION = 32;
    public static final short FLAG_FLASH_RED_EYE_SUPPORTED = 64;
    public static final short FLAG_FLASH_RETURN_LIGHT_DETECTED = 6;
    public static final short FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED = 4;
    public static final short FORMAT_CHUNKY = 1;
    public static final short FORMAT_PLANAR = 2;
    public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
    public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
    public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
    public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
    public static final short GAIN_CONTROL_NONE = 0;
    public static final java.lang.String GPS_DIRECTION_MAGNETIC = "M";
    public static final java.lang.String GPS_DIRECTION_TRUE = "T";
    public static final java.lang.String GPS_DISTANCE_KILOMETERS = "K";
    public static final java.lang.String GPS_DISTANCE_MILES = "M";
    public static final java.lang.String GPS_DISTANCE_NAUTICAL_MILES = "N";
    public static final java.lang.String GPS_MEASUREMENT_2D = "2";
    public static final java.lang.String GPS_MEASUREMENT_3D = "3";
    public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
    public static final java.lang.String GPS_MEASUREMENT_INTERRUPTED = "V";
    public static final java.lang.String GPS_MEASUREMENT_IN_PROGRESS = "A";
    public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
    public static final java.lang.String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
    public static final java.lang.String GPS_SPEED_KNOTS = "N";
    public static final java.lang.String GPS_SPEED_MILES_PER_HOUR = "M";
    private static final java.util.regex.Pattern GPS_TIMESTAMP_PATTERN;
    static final byte[] IDENTIFIER_EXIF_APP1;
    private static final byte[] IDENTIFIER_XMP_APP1;
    private static final androidx.exifinterface.media.d[] IFD_EXIF_TAGS;
    private static final int IFD_FORMAT_BYTE = 1;
    private static final int IFD_FORMAT_DOUBLE = 12;
    private static final int IFD_FORMAT_IFD = 13;
    private static final int IFD_FORMAT_SBYTE = 6;
    private static final int IFD_FORMAT_SINGLE = 11;
    private static final int IFD_FORMAT_SLONG = 9;
    private static final int IFD_FORMAT_SRATIONAL = 10;
    private static final int IFD_FORMAT_SSHORT = 8;
    private static final int IFD_FORMAT_STRING = 2;
    private static final int IFD_FORMAT_ULONG = 4;
    private static final int IFD_FORMAT_UNDEFINED = 7;
    private static final int IFD_FORMAT_URATIONAL = 5;
    private static final int IFD_FORMAT_USHORT = 3;
    private static final androidx.exifinterface.media.d[] IFD_GPS_TAGS;
    private static final androidx.exifinterface.media.d[] IFD_INTEROPERABILITY_TAGS;
    private static final int IFD_OFFSET = 8;
    private static final androidx.exifinterface.media.d[] IFD_THUMBNAIL_TAGS;
    private static final androidx.exifinterface.media.d[] IFD_TIFF_TAGS;
    private static final int IFD_TYPE_EXIF = 1;
    private static final int IFD_TYPE_GPS = 2;
    private static final int IFD_TYPE_INTEROPERABILITY = 3;
    private static final int IFD_TYPE_ORF_CAMERA_SETTINGS = 7;
    private static final int IFD_TYPE_ORF_IMAGE_PROCESSING = 8;
    private static final int IFD_TYPE_ORF_MAKER_NOTE = 6;
    private static final int IFD_TYPE_PEF = 9;
    private static final int IFD_TYPE_PREVIEW = 5;
    private static final int IFD_TYPE_PRIMARY = 0;
    private static final int IFD_TYPE_THUMBNAIL = 4;
    private static final int IMAGE_TYPE_AVIF = 15;
    private static final int IMAGE_TYPE_DNG = 3;
    private static final int IMAGE_TYPE_HEIC = 12;
    private static final int IMAGE_TYPE_JPEG = 4;
    private static final int IMAGE_TYPE_ORF = 7;
    private static final int IMAGE_TYPE_PEF = 8;
    private static final int IMAGE_TYPE_PNG = 13;
    private static final int IMAGE_TYPE_RAF = 9;
    private static final int IMAGE_TYPE_RW2 = 10;
    private static final int IMAGE_TYPE_UNKNOWN = 0;
    private static final int IMAGE_TYPE_WEBP = 14;
    public static final java.lang.String LATITUDE_NORTH = "N";
    public static final java.lang.String LATITUDE_SOUTH = "S";
    public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
    public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
    public static final short LIGHT_SOURCE_D50 = 23;
    public static final short LIGHT_SOURCE_D55 = 20;
    public static final short LIGHT_SOURCE_D65 = 21;
    public static final short LIGHT_SOURCE_D75 = 22;
    public static final short LIGHT_SOURCE_DAYLIGHT = 1;
    public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
    public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
    public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
    public static final short LIGHT_SOURCE_FLASH = 4;
    public static final short LIGHT_SOURCE_FLUORESCENT = 2;
    public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
    public static final short LIGHT_SOURCE_OTHER = 255;
    public static final short LIGHT_SOURCE_SHADE = 11;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
    public static final short LIGHT_SOURCE_TUNGSTEN = 3;
    public static final short LIGHT_SOURCE_UNKNOWN = 0;
    public static final short LIGHT_SOURCE_WARM_WHITE_FLUORESCENT = 16;
    public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
    public static final java.lang.String LONGITUDE_EAST = "E";
    public static final java.lang.String LONGITUDE_WEST = "W";
    static final byte MARKER_APP1 = -31;
    private static final byte MARKER_COM = -2;
    private static final byte MARKER_EOI = -39;
    private static final byte MARKER_SOF0 = -64;
    private static final byte MARKER_SOF1 = -63;
    private static final byte MARKER_SOF10 = -54;
    private static final byte MARKER_SOF11 = -53;
    private static final byte MARKER_SOF13 = -51;
    private static final byte MARKER_SOF14 = -50;
    private static final byte MARKER_SOF15 = -49;
    private static final byte MARKER_SOF2 = -62;
    private static final byte MARKER_SOF3 = -61;
    private static final byte MARKER_SOF5 = -59;
    private static final byte MARKER_SOF6 = -58;
    private static final byte MARKER_SOF7 = -57;
    private static final byte MARKER_SOF9 = -55;
    private static final byte MARKER_SOS = -38;
    private static final int MAX_THUMBNAIL_SIZE = 512;
    public static final short METERING_MODE_AVERAGE = 1;
    public static final short METERING_MODE_CENTER_WEIGHT_AVERAGE = 2;
    public static final short METERING_MODE_MULTI_SPOT = 4;
    public static final short METERING_MODE_OTHER = 255;
    public static final short METERING_MODE_PARTIAL = 6;
    public static final short METERING_MODE_PATTERN = 5;
    public static final short METERING_MODE_SPOT = 3;
    public static final short METERING_MODE_UNKNOWN = 0;
    private static final java.util.regex.Pattern NON_ZERO_TIME_PATTERN;
    private static final androidx.exifinterface.media.d[] ORF_CAMERA_SETTINGS_TAGS;
    private static final androidx.exifinterface.media.d[] ORF_IMAGE_PROCESSING_TAGS;
    private static final int ORF_MAKER_NOTE_HEADER_1_SIZE = 8;
    private static final int ORF_MAKER_NOTE_HEADER_2_SIZE = 12;
    private static final androidx.exifinterface.media.d[] ORF_MAKER_NOTE_TAGS;
    private static final short ORF_SIGNATURE_1 = 20306;
    private static final short ORF_SIGNATURE_2 = 21330;
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final int ORIGINAL_RESOLUTION_IMAGE = 0;
    private static final int PEF_MAKER_NOTE_SKIP_SIZE = 6;
    private static final java.lang.String PEF_SIGNATURE = "PENTAX";
    private static final androidx.exifinterface.media.d[] PEF_TAGS;
    public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
    public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
    public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
    private static final int PNG_CHUNK_CRC_BYTE_LENGTH = 4;
    private static final int PNG_CHUNK_TYPE_EXIF = 1700284774;
    private static final int PNG_CHUNK_TYPE_IEND = 1229278788;
    private static final int PNG_CHUNK_TYPE_IHDR = 1229472850;
    private static final int PNG_CHUNK_TYPE_ITXT = 1767135348;
    private static final int RAF_OFFSET_TO_JPEG_IMAGE_OFFSET = 84;
    private static final java.lang.String RAF_SIGNATURE = "FUJIFILMCCD-RAW";
    private static final java.util.Set<java.lang.String> RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY;
    public static final int REDUCED_RESOLUTION_IMAGE = 1;
    public static final short RENDERED_PROCESS_CUSTOM = 1;
    public static final short RENDERED_PROCESS_NORMAL = 0;
    public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
    public static final short RESOLUTION_UNIT_INCHES = 2;
    private static final short RW2_SIGNATURE = 85;
    public static final short SATURATION_HIGH = 0;
    public static final short SATURATION_LOW = 0;
    public static final short SATURATION_NORMAL = 0;
    public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
    public static final short SCENE_CAPTURE_TYPE_NIGHT = 3;
    public static final short SCENE_CAPTURE_TYPE_PORTRAIT = 2;
    public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
    public static final short SCENE_TYPE_DIRECTLY_PHOTOGRAPHED = 1;
    public static final short SENSITIVITY_TYPE_ISO_SPEED = 3;
    public static final short SENSITIVITY_TYPE_REI = 2;
    public static final short SENSITIVITY_TYPE_REI_AND_ISO = 6;
    public static final short SENSITIVITY_TYPE_SOS = 1;
    public static final short SENSITIVITY_TYPE_SOS_AND_ISO = 5;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI = 4;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO = 7;
    public static final short SENSITIVITY_TYPE_UNKNOWN = 0;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL = 5;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final short SENSOR_TYPE_NOT_DEFINED = 1;
    public static final short SENSOR_TYPE_ONE_CHIP = 2;
    public static final short SENSOR_TYPE_THREE_CHIP = 4;
    public static final short SENSOR_TYPE_TRILINEAR = 7;
    public static final short SENSOR_TYPE_TWO_CHIP = 3;
    public static final short SHARPNESS_HARD = 2;
    public static final short SHARPNESS_NORMAL = 0;
    public static final short SHARPNESS_SOFT = 1;
    private static final int SIGNATURE_CHECK_SIZE = 5000;
    private static final int SKIP_BUFFER_SIZE = 8192;
    public static final int STREAM_TYPE_EXIF_DATA_ONLY = 1;
    public static final int STREAM_TYPE_FULL_IMAGE_DATA = 0;
    public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
    public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
    public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
    public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
    public static final java.lang.String TAG_APERTURE_VALUE = "ApertureValue";
    public static final java.lang.String TAG_ARTIST = "Artist";
    public static final java.lang.String TAG_BITS_PER_SAMPLE = "BitsPerSample";
    public static final java.lang.String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
    public static final java.lang.String TAG_BRIGHTNESS_VALUE = "BrightnessValue";

    @java.lang.Deprecated
    public static final java.lang.String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
    public static final java.lang.String TAG_CAMERA_OWNER_NAME = "CameraOwnerName";
    public static final java.lang.String TAG_CFA_PATTERN = "CFAPattern";
    public static final java.lang.String TAG_COLOR_SPACE = "ColorSpace";
    public static final java.lang.String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
    public static final java.lang.String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
    public static final java.lang.String TAG_COMPRESSION = "Compression";
    public static final java.lang.String TAG_CONTRAST = "Contrast";
    public static final java.lang.String TAG_COPYRIGHT = "Copyright";
    public static final java.lang.String TAG_CUSTOM_RENDERED = "CustomRendered";
    public static final java.lang.String TAG_DATETIME = "DateTime";
    public static final java.lang.String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    public static final java.lang.String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    public static final java.lang.String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
    public static final java.lang.String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
    public static final java.lang.String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
    public static final java.lang.String TAG_DNG_VERSION = "DNGVersion";
    private static final java.lang.String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    public static final java.lang.String TAG_EXIF_VERSION = "ExifVersion";
    public static final java.lang.String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
    public static final java.lang.String TAG_EXPOSURE_INDEX = "ExposureIndex";
    public static final java.lang.String TAG_EXPOSURE_MODE = "ExposureMode";
    public static final java.lang.String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
    public static final java.lang.String TAG_EXPOSURE_TIME = "ExposureTime";
    public static final java.lang.String TAG_FILE_SOURCE = "FileSource";
    public static final java.lang.String TAG_FLASH = "Flash";
    public static final java.lang.String TAG_FLASHPIX_VERSION = "FlashpixVersion";
    public static final java.lang.String TAG_FLASH_ENERGY = "FlashEnergy";
    public static final java.lang.String TAG_FOCAL_LENGTH = "FocalLength";
    public static final java.lang.String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
    public static final java.lang.String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
    public static final java.lang.String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
    public static final java.lang.String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
    public static final java.lang.String TAG_F_NUMBER = "FNumber";
    public static final java.lang.String TAG_GAIN_CONTROL = "GainControl";
    public static final java.lang.String TAG_GAMMA = "Gamma";
    public static final java.lang.String TAG_GPS_ALTITUDE = "GPSAltitude";
    public static final java.lang.String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
    public static final java.lang.String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
    public static final java.lang.String TAG_GPS_DATESTAMP = "GPSDateStamp";
    public static final java.lang.String TAG_GPS_DEST_BEARING = "GPSDestBearing";
    public static final java.lang.String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
    public static final java.lang.String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
    public static final java.lang.String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
    public static final java.lang.String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
    public static final java.lang.String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
    public static final java.lang.String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
    public static final java.lang.String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
    public static final java.lang.String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
    public static final java.lang.String TAG_GPS_DOP = "GPSDOP";
    public static final java.lang.String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
    public static final java.lang.String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    public static final java.lang.String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    private static final java.lang.String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    public static final java.lang.String TAG_GPS_LATITUDE = "GPSLatitude";
    public static final java.lang.String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
    public static final java.lang.String TAG_GPS_LONGITUDE = "GPSLongitude";
    public static final java.lang.String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
    public static final java.lang.String TAG_GPS_MAP_DATUM = "GPSMapDatum";
    public static final java.lang.String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
    public static final java.lang.String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
    public static final java.lang.String TAG_GPS_SATELLITES = "GPSSatellites";
    public static final java.lang.String TAG_GPS_SPEED = "GPSSpeed";
    public static final java.lang.String TAG_GPS_SPEED_REF = "GPSSpeedRef";
    public static final java.lang.String TAG_GPS_STATUS = "GPSStatus";
    public static final java.lang.String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
    public static final java.lang.String TAG_GPS_TRACK = "GPSTrack";
    public static final java.lang.String TAG_GPS_TRACK_REF = "GPSTrackRef";
    public static final java.lang.String TAG_GPS_VERSION_ID = "GPSVersionID";
    public static final java.lang.String TAG_IMAGE_DESCRIPTION = "ImageDescription";
    public static final java.lang.String TAG_IMAGE_LENGTH = "ImageLength";
    public static final java.lang.String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
    public static final java.lang.String TAG_IMAGE_WIDTH = "ImageWidth";
    private static final java.lang.String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    public static final java.lang.String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
    public static final java.lang.String TAG_ISO_SPEED = "ISOSpeed";
    public static final java.lang.String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
    public static final java.lang.String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";

    @java.lang.Deprecated
    public static final java.lang.String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
    public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
    public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
    public static final java.lang.String TAG_LENS_MAKE = "LensMake";
    public static final java.lang.String TAG_LENS_MODEL = "LensModel";
    public static final java.lang.String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
    public static final java.lang.String TAG_LENS_SPECIFICATION = "LensSpecification";
    public static final java.lang.String TAG_LIGHT_SOURCE = "LightSource";
    public static final java.lang.String TAG_MAKE = "Make";
    public static final java.lang.String TAG_MAKER_NOTE = "MakerNote";
    public static final java.lang.String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
    public static final java.lang.String TAG_METERING_MODE = "MeteringMode";
    public static final java.lang.String TAG_MODEL = "Model";
    public static final java.lang.String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
    public static final java.lang.String TAG_OECF = "OECF";
    public static final java.lang.String TAG_OFFSET_TIME = "OffsetTime";
    public static final java.lang.String TAG_OFFSET_TIME_DIGITIZED = "OffsetTimeDigitized";
    public static final java.lang.String TAG_OFFSET_TIME_ORIGINAL = "OffsetTimeOriginal";
    public static final java.lang.String TAG_ORF_ASPECT_FRAME = "AspectFrame";
    private static final java.lang.String TAG_ORF_CAMERA_SETTINGS_IFD_POINTER = "CameraSettingsIFDPointer";
    private static final java.lang.String TAG_ORF_IMAGE_PROCESSING_IFD_POINTER = "ImageProcessingIFDPointer";
    public static final java.lang.String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
    public static final java.lang.String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
    public static final java.lang.String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
    public static final java.lang.String TAG_ORIENTATION = "Orientation";
    public static final java.lang.String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
    public static final java.lang.String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
    public static final java.lang.String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
    public static final java.lang.String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
    public static final java.lang.String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
    public static final java.lang.String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
    private static final androidx.exifinterface.media.d TAG_RAF_IMAGE_SIZE;
    public static final java.lang.String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
    public static final java.lang.String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
    public static final java.lang.String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
    public static final java.lang.String TAG_RESOLUTION_UNIT = "ResolutionUnit";
    public static final java.lang.String TAG_ROWS_PER_STRIP = "RowsPerStrip";
    public static final java.lang.String TAG_RW2_ISO = "ISO";
    public static final java.lang.String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
    public static final java.lang.String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
    public static final java.lang.String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
    public static final java.lang.String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
    public static final java.lang.String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
    public static final java.lang.String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
    public static final java.lang.String TAG_SATURATION = "Saturation";
    public static final java.lang.String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
    public static final java.lang.String TAG_SCENE_TYPE = "SceneType";
    public static final java.lang.String TAG_SENSING_METHOD = "SensingMethod";
    public static final java.lang.String TAG_SENSITIVITY_TYPE = "SensitivityType";
    public static final java.lang.String TAG_SHARPNESS = "Sharpness";
    public static final java.lang.String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
    public static final java.lang.String TAG_SOFTWARE = "Software";
    public static final java.lang.String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
    public static final java.lang.String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
    public static final java.lang.String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
    public static final java.lang.String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
    public static final java.lang.String TAG_STRIP_OFFSETS = "StripOffsets";
    public static final java.lang.String TAG_SUBFILE_TYPE = "SubfileType";
    public static final java.lang.String TAG_SUBJECT_AREA = "SubjectArea";
    public static final java.lang.String TAG_SUBJECT_DISTANCE = "SubjectDistance";
    public static final java.lang.String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
    public static final java.lang.String TAG_SUBJECT_LOCATION = "SubjectLocation";
    public static final java.lang.String TAG_SUBSEC_TIME = "SubSecTime";
    public static final java.lang.String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
    public static final java.lang.String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
    private static final java.lang.String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    public static final java.lang.String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
    public static final java.lang.String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";
    public static final java.lang.String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    public static final java.lang.String TAG_TRANSFER_FUNCTION = "TransferFunction";
    public static final java.lang.String TAG_USER_COMMENT = "UserComment";
    public static final java.lang.String TAG_WHITE_BALANCE = "WhiteBalance";
    public static final java.lang.String TAG_WHITE_POINT = "WhitePoint";
    public static final java.lang.String TAG_XMP = "Xmp";
    public static final java.lang.String TAG_X_RESOLUTION = "XResolution";
    public static final java.lang.String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
    public static final java.lang.String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
    public static final java.lang.String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
    public static final java.lang.String TAG_Y_RESOLUTION = "YResolution";
    private static final int WEBP_CHUNK_SIZE_BYTE_LENGTH = 4;
    private static final int WEBP_CHUNK_TYPE_BYTE_LENGTH = 4;
    private static final int WEBP_CHUNK_TYPE_VP8X_DEFAULT_LENGTH = 10;
    private static final int WEBP_FILE_SIZE_BYTE_LENGTH = 4;
    private static final byte WEBP_VP8L_SIGNATURE = 47;

    @java.lang.Deprecated
    public static final int WHITEBALANCE_AUTO = 0;

    @java.lang.Deprecated
    public static final int WHITEBALANCE_MANUAL = 1;
    public static final short WHITE_BALANCE_AUTO = 0;
    public static final short WHITE_BALANCE_MANUAL = 1;
    private static final int XMP_HANDLING_PREFER_SEPARATE = 2;
    private static final int XMP_HANDLING_PREFER_TIFF_700_IF_PRESENT = 3;
    private static final int XMP_HANDLING_TIFF_700_ONLY = 1;
    public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
    public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> sExifPointerTagMap;
    private static final java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.d>[] sExifTagMapsForReading;
    private static final java.util.HashMap<java.lang.String, androidx.exifinterface.media.d>[] sExifTagMapsForWriting;
    private static final java.text.SimpleDateFormat sFormatterPrimary;
    private static final java.text.SimpleDateFormat sFormatterSecondary;
    private byte _hellAccFlag_;
    private boolean mAreThumbnailStripsConsecutive;
    private android.content.res.AssetManager.AssetInputStream mAssetInputStream;
    private final java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>[] mAttributes;
    private java.util.Set<java.lang.Integer> mAttributesOffsets;
    private java.nio.ByteOrder mExifByteOrder;
    private boolean mFileOnDiskContainsSeparateXmpMarker;
    private java.lang.String mFilename;
    private boolean mHasThumbnail;
    private boolean mHasThumbnailStrips;
    private boolean mIsExifDataOnly;
    private int mMimeType;
    private boolean mModified;
    private int mOffsetToExifData;
    private int mOrfMakerNoteOffset;
    private int mOrfThumbnailLength;
    private int mOrfThumbnailOffset;
    private java.io.FileDescriptor mSeekableFileDescriptor;
    private byte[] mThumbnailBytes;
    private int mThumbnailCompression;
    private int mThumbnailLength;
    private int mThumbnailOffset;
    private androidx.exifinterface.media.ExifInterface.ExifAttribute mXmpFromSeparateMarker;
    private static final java.lang.String TAG = "ExifInterface";
    private static final boolean DEBUG = android.util.Log.isLoggable(TAG, 3);
    private static final java.util.List<java.lang.Integer> ROTATION_ORDER = java.util.Arrays.asList(1, 6, 3, 8);
    private static final java.util.List<java.lang.Integer> FLIPPED_ROTATION_ORDER = java.util.Arrays.asList(2, 7, 4, 5);
    public static final int[] BITS_PER_SAMPLE_RGB = {8, 8, 8};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = {4};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = {8};
    private static final byte MARKER = -1;
    private static final byte MARKER_SOI = -40;
    static final byte[] JPEG_SIGNATURE = {MARKER, MARKER_SOI, MARKER};
    private static final byte[] HEIF_TYPE_FTYP = {102, 116, 121, 112};
    private static final byte[] HEIF_BRAND_MIF1 = {109, 105, 102, 49};
    private static final byte[] HEIF_BRAND_HEIC = {104, 101, 105, 99};
    private static final byte[] HEIF_BRAND_AVIF = {97, 118, 105, 102};
    private static final byte[] HEIF_BRAND_AVIS = {97, 118, 105, 115};
    private static final byte[] ORF_MAKER_NOTE_HEADER_1 = {79, 76, 89, 77, 80, 0};
    private static final byte[] ORF_MAKER_NOTE_HEADER_2 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] PNG_SIGNATURE = {-119, 80, 78, 71, 13, 10, 26, 10};
    static final byte[] PNG_ITXT_XMP_KEYWORD = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    private static final byte[] WEBP_SIGNATURE_1 = {82, 73, 70, 70};
    private static final byte[] WEBP_SIGNATURE_2 = {87, 69, 66, 80};
    private static final byte[] WEBP_CHUNK_TYPE_EXIF = {69, 88, 73, 70};
    static final byte START_CODE = 42;
    private static final byte[] WEBP_VP8_SIGNATURE = {-99, 1, START_CODE};
    private static final byte[] WEBP_CHUNK_TYPE_VP8X = "VP8X".getBytes(java.nio.charset.Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_VP8L = "VP8L".getBytes(java.nio.charset.Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_VP8 = "VP8 ".getBytes(java.nio.charset.Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_ANIM = "ANIM".getBytes(java.nio.charset.Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_ANMF = "ANMF".getBytes(java.nio.charset.Charset.defaultCharset());
    private static final java.lang.String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    private static final byte[] EXIF_ASCII_PREFIX = {65, 83, 67, 73, 73, 0, 0, 0};

    /* loaded from: classes13.dex */
    public static class ExifAttribute {
        public static final long BYTES_OFFSET_UNKNOWN = -1;
        public final byte[] bytes;
        public final long bytesOffset;
        public final int format;
        public final int numberOfComponents;

        public ExifAttribute(int i17, int i18, byte[] bArr) {
            this(i17, i18, -1L, bArr);
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createByte(java.lang.String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new androidx.exifinterface.media.ExifInterface.ExifAttribute(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(androidx.exifinterface.media.ExifInterface.ASCII);
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(1, bytes.length, bytes);
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createDouble(double[] dArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d17 : dArr) {
                wrap.putDouble(d17);
            }
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(12, dArr.length, wrap.array());
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createSLong(int[] iArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i17 : iArr) {
                wrap.putInt(i17);
            }
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(9, iArr.length, wrap.array());
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createSRational(androidx.exifinterface.media.e[] eVarArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[10] * eVarArr.length]);
            wrap.order(byteOrder);
            for (androidx.exifinterface.media.e eVar : eVarArr) {
                wrap.putInt((int) eVar.f11188a);
                wrap.putInt((int) eVar.f11189b);
            }
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(10, eVarArr.length, wrap.array());
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createString(java.lang.String str) {
            byte[] bytes = (str + (char) 0).getBytes(androidx.exifinterface.media.ExifInterface.ASCII);
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(2, bytes.length, bytes);
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createULong(long[] jArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j17 : jArr) {
                wrap.putInt((int) j17);
            }
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(4, jArr.length, wrap.array());
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createURational(androidx.exifinterface.media.e[] eVarArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[5] * eVarArr.length]);
            wrap.order(byteOrder);
            for (androidx.exifinterface.media.e eVar : eVarArr) {
                wrap.putInt((int) eVar.f11188a);
                wrap.putInt((int) eVar.f11189b);
            }
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(5, eVarArr.length, wrap.array());
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort(int[] iArr, java.nio.ByteOrder byteOrder) {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i17 : iArr) {
                wrap.putShort((short) i17);
            }
            return new androidx.exifinterface.media.ExifInterface.ExifAttribute(3, iArr.length, wrap.array());
        }

        public double getDoubleValue(java.nio.ByteOrder byteOrder) {
            java.lang.Object value = getValue(byteOrder);
            if (value == null) {
                throw new java.lang.NumberFormatException("NULL can't be converted to a double value");
            }
            if (value instanceof java.lang.String) {
                return java.lang.Double.parseDouble((java.lang.String) value);
            }
            if (value instanceof long[]) {
                if (((long[]) value).length == 1) {
                    return r5[0];
                }
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            if (value instanceof int[]) {
                if (((int[]) value).length == 1) {
                    return r5[0];
                }
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            if (value instanceof double[]) {
                double[] dArr = (double[]) value;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            if (!(value instanceof androidx.exifinterface.media.e[])) {
                throw new java.lang.NumberFormatException("Couldn't find a double value");
            }
            androidx.exifinterface.media.e[] eVarArr = (androidx.exifinterface.media.e[]) value;
            if (eVarArr.length != 1) {
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            androidx.exifinterface.media.e eVar = eVarArr[0];
            return eVar.f11188a / eVar.f11189b;
        }

        public int getIntValue(java.nio.ByteOrder byteOrder) {
            java.lang.Object value = getValue(byteOrder);
            if (value == null) {
                throw new java.lang.NumberFormatException("NULL can't be converted to a integer value");
            }
            if (value instanceof java.lang.String) {
                return java.lang.Integer.parseInt((java.lang.String) value);
            }
            if (value instanceof long[]) {
                long[] jArr = (long[]) value;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new java.lang.NumberFormatException("There are more than one component");
            }
            if (!(value instanceof int[])) {
                throw new java.lang.NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) value;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }

        public java.lang.String getStringValue(java.nio.ByteOrder byteOrder) {
            java.lang.Object value = getValue(byteOrder);
            if (value == null) {
                return null;
            }
            if (value instanceof java.lang.String) {
                return (java.lang.String) value;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = 0;
            if (value instanceof long[]) {
                long[] jArr = (long[]) value;
                while (i17 < jArr.length) {
                    sb6.append(jArr[i17]);
                    i17++;
                    if (i17 != jArr.length) {
                        sb6.append(",");
                    }
                }
                return sb6.toString();
            }
            if (value instanceof int[]) {
                int[] iArr = (int[]) value;
                while (i17 < iArr.length) {
                    sb6.append(iArr[i17]);
                    i17++;
                    if (i17 != iArr.length) {
                        sb6.append(",");
                    }
                }
                return sb6.toString();
            }
            if (value instanceof double[]) {
                double[] dArr = (double[]) value;
                while (i17 < dArr.length) {
                    sb6.append(dArr[i17]);
                    i17++;
                    if (i17 != dArr.length) {
                        sb6.append(",");
                    }
                }
                return sb6.toString();
            }
            if (!(value instanceof androidx.exifinterface.media.e[])) {
                return null;
            }
            androidx.exifinterface.media.e[] eVarArr = (androidx.exifinterface.media.e[]) value;
            while (i17 < eVarArr.length) {
                sb6.append(eVarArr[i17].f11188a);
                sb6.append('/');
                sb6.append(eVarArr[i17].f11189b);
                i17++;
                if (i17 != eVarArr.length) {
                    sb6.append(",");
                }
            }
            return sb6.toString();
        }

        public java.lang.Object getValue(java.nio.ByteOrder byteOrder) {
            androidx.exifinterface.media.b bVar;
            byte b17;
            byte b18;
            androidx.exifinterface.media.b bVar2 = null;
            try {
                bVar = new androidx.exifinterface.media.b(this.bytes);
            } catch (java.io.IOException unused) {
                bVar = null;
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
            try {
                bVar.f11179f = byteOrder;
                boolean z17 = true;
                int i17 = 0;
                switch (this.format) {
                    case 1:
                    case 6:
                        byte[] bArr = this.bytes;
                        if (bArr.length != 1 || (b17 = bArr[0]) < 0 || b17 > 1) {
                            java.lang.String str = new java.lang.String(bArr, androidx.exifinterface.media.ExifInterface.ASCII);
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
                        if (this.numberOfComponents >= androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX.length) {
                            int i18 = 0;
                            while (true) {
                                if (i18 < androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX.length) {
                                    if (this.bytes[i18] != androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX[i18]) {
                                        z17 = false;
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                            if (z17) {
                                i17 = androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX.length;
                            }
                        }
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        while (i17 < this.numberOfComponents && (b18 = this.bytes[i17]) != 0) {
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
                        int[] iArr = new int[this.numberOfComponents];
                        while (i17 < this.numberOfComponents) {
                            iArr[i17] = bVar.readUnsignedShort();
                            i17++;
                        }
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused5) {
                        }
                        return iArr;
                    case 4:
                        long[] jArr = new long[this.numberOfComponents];
                        while (i17 < this.numberOfComponents) {
                            jArr[i17] = bVar.readInt() & io.flutter.embedding.android.KeyboardMap.kValueMask;
                            i17++;
                        }
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused6) {
                        }
                        return jArr;
                    case 5:
                        androidx.exifinterface.media.e[] eVarArr = new androidx.exifinterface.media.e[this.numberOfComponents];
                        while (i17 < this.numberOfComponents) {
                            eVarArr[i17] = new androidx.exifinterface.media.e(bVar.readInt() & io.flutter.embedding.android.KeyboardMap.kValueMask, bVar.readInt() & io.flutter.embedding.android.KeyboardMap.kValueMask);
                            i17++;
                        }
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused7) {
                        }
                        return eVarArr;
                    case 8:
                        int[] iArr2 = new int[this.numberOfComponents];
                        while (i17 < this.numberOfComponents) {
                            iArr2[i17] = bVar.readShort();
                            i17++;
                        }
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused8) {
                        }
                        return iArr2;
                    case 9:
                        int[] iArr3 = new int[this.numberOfComponents];
                        while (i17 < this.numberOfComponents) {
                            iArr3[i17] = bVar.readInt();
                            i17++;
                        }
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused9) {
                        }
                        return iArr3;
                    case 10:
                        androidx.exifinterface.media.e[] eVarArr2 = new androidx.exifinterface.media.e[this.numberOfComponents];
                        while (i17 < this.numberOfComponents) {
                            eVarArr2[i17] = new androidx.exifinterface.media.e(bVar.readInt(), bVar.readInt());
                            i17++;
                        }
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused10) {
                        }
                        return eVarArr2;
                    case 11:
                        double[] dArr = new double[this.numberOfComponents];
                        while (i17 < this.numberOfComponents) {
                            dArr[i17] = bVar.readFloat();
                            i17++;
                        }
                        try {
                            bVar.close();
                        } catch (java.io.IOException unused11) {
                        }
                        return dArr;
                    case 12:
                        double[] dArr2 = new double[this.numberOfComponents];
                        while (i17 < this.numberOfComponents) {
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

        public int size() {
            return androidx.exifinterface.media.ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[this.format] * this.numberOfComponents;
        }

        public java.lang.String toString() {
            return "(" + androidx.exifinterface.media.ExifInterface.IFD_FORMAT_NAMES[this.format] + ", data length:" + this.bytes.length + ")";
        }

        public ExifAttribute(int i17, int i18, long j17, byte[] bArr) {
            this.format = i17;
            this.numberOfComponents = i18;
            this.bytesOffset = j17;
            this.bytes = bArr;
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createULong(long j17, java.nio.ByteOrder byteOrder) {
            return createULong(new long[]{j17}, byteOrder);
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort(int i17, java.nio.ByteOrder byteOrder) {
            return createUShort(new int[]{i17}, byteOrder);
        }

        public static androidx.exifinterface.media.ExifInterface.ExifAttribute createURational(androidx.exifinterface.media.e eVar, java.nio.ByteOrder byteOrder) {
            return createURational(new androidx.exifinterface.media.e[]{eVar}, byteOrder);
        }
    }

    static {
        androidx.exifinterface.media.d[] dVarArr = {new androidx.exifinterface.media.d(TAG_NEW_SUBFILE_TYPE, 254, 4), new androidx.exifinterface.media.d(TAG_SUBFILE_TYPE, 255, 4), new androidx.exifinterface.media.d(TAG_IMAGE_WIDTH, 256, 3, 4), new androidx.exifinterface.media.d(TAG_IMAGE_LENGTH, 257, 3, 4), new androidx.exifinterface.media.d(TAG_BITS_PER_SAMPLE, 258, 3), new androidx.exifinterface.media.d(TAG_COMPRESSION, com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE, 3), new androidx.exifinterface.media.d(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new androidx.exifinterface.media.d(TAG_IMAGE_DESCRIPTION, 270, 2), new androidx.exifinterface.media.d(TAG_MAKE, zc1.b.CTRL_INDEX, 2), new androidx.exifinterface.media.d(TAG_MODEL, 272, 2), new androidx.exifinterface.media.d(TAG_STRIP_OFFSETS, bd1.f.CTRL_INDEX, 3, 4), new androidx.exifinterface.media.d(TAG_ORIENTATION, 274, 3), new androidx.exifinterface.media.d(TAG_SAMPLES_PER_PIXEL, com.tencent.mm.plugin.appbrand.jsapi.bio.soter.k.CTRL_INDEX, 3), new androidx.exifinterface.media.d(TAG_ROWS_PER_STRIP, 278, 3, 4), new androidx.exifinterface.media.d(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new androidx.exifinterface.media.d(TAG_X_RESOLUTION, 282, 5), new androidx.exifinterface.media.d(TAG_Y_RESOLUTION, com.tencent.mm.plugin.appbrand.jsapi.pe.CTRL_INDEX, 5), new androidx.exifinterface.media.d(TAG_PLANAR_CONFIGURATION, nd1.f2.CTRL_INDEX, 3), new androidx.exifinterface.media.d(TAG_RESOLUTION_UNIT, 296, 3), new androidx.exifinterface.media.d(TAG_TRANSFER_FUNCTION, 301, 3), new androidx.exifinterface.media.d(TAG_SOFTWARE, 305, 2), new androidx.exifinterface.media.d(TAG_DATETIME, com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET, 2), new androidx.exifinterface.media.d(TAG_ARTIST, qf1.n.CTRL_INDEX, 2), new androidx.exifinterface.media.d(TAG_WHITE_POINT, qf1.f.CTRL_INDEX, 5), new androidx.exifinterface.media.d(TAG_PRIMARY_CHROMATICITIES, 319, 5), new androidx.exifinterface.media.d(TAG_SUB_IFD_POINTER, 330, 4), new androidx.exifinterface.media.d(TAG_JPEG_INTERCHANGE_FORMAT, 513, 4), new androidx.exifinterface.media.d(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new androidx.exifinterface.media.d(TAG_Y_CB_CR_COEFFICIENTS, yc1.z.CTRL_INDEX, 5), new androidx.exifinterface.media.d(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new androidx.exifinterface.media.d(TAG_Y_CB_CR_POSITIONING, 531, 3), new androidx.exifinterface.media.d(TAG_REFERENCE_BLACK_WHITE, com.tencent.mm.plugin.appbrand.jsapi.media.c4.CTRL_INDEX, 5), new androidx.exifinterface.media.d(TAG_COPYRIGHT, 33432, 2), new androidx.exifinterface.media.d(TAG_EXIF_IFD_POINTER, 34665, 4), new androidx.exifinterface.media.d(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new androidx.exifinterface.media.d(TAG_RW2_SENSOR_TOP_BORDER, 4, 4), new androidx.exifinterface.media.d(TAG_RW2_SENSOR_LEFT_BORDER, 5, 4), new androidx.exifinterface.media.d(TAG_RW2_SENSOR_BOTTOM_BORDER, 6, 4), new androidx.exifinterface.media.d(TAG_RW2_SENSOR_RIGHT_BORDER, 7, 4), new androidx.exifinterface.media.d(TAG_RW2_ISO, 23, 3), new androidx.exifinterface.media.d(TAG_RW2_JPG_FROM_RAW, 46, 7), new androidx.exifinterface.media.d(TAG_XMP, 700, 1)};
        IFD_TIFF_TAGS = dVarArr;
        androidx.exifinterface.media.d[] dVarArr2 = {new androidx.exifinterface.media.d(TAG_EXPOSURE_TIME, 33434, 5), new androidx.exifinterface.media.d(TAG_F_NUMBER, 33437, 5), new androidx.exifinterface.media.d(TAG_EXPOSURE_PROGRAM, 34850, 3), new androidx.exifinterface.media.d(TAG_SPECTRAL_SENSITIVITY, 34852, 2), new androidx.exifinterface.media.d(TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new androidx.exifinterface.media.d(TAG_OECF, 34856, 7), new androidx.exifinterface.media.d(TAG_SENSITIVITY_TYPE, 34864, 3), new androidx.exifinterface.media.d(TAG_STANDARD_OUTPUT_SENSITIVITY, 34865, 4), new androidx.exifinterface.media.d(TAG_RECOMMENDED_EXPOSURE_INDEX, 34866, 4), new androidx.exifinterface.media.d(TAG_ISO_SPEED, 34867, 4), new androidx.exifinterface.media.d(TAG_ISO_SPEED_LATITUDE_YYY, 34868, 4), new androidx.exifinterface.media.d(TAG_ISO_SPEED_LATITUDE_ZZZ, 34869, 4), new androidx.exifinterface.media.d(TAG_EXIF_VERSION, 36864, 2), new androidx.exifinterface.media.d(TAG_DATETIME_ORIGINAL, 36867, 2), new androidx.exifinterface.media.d(TAG_DATETIME_DIGITIZED, 36868, 2), new androidx.exifinterface.media.d(TAG_OFFSET_TIME, 36880, 2), new androidx.exifinterface.media.d(TAG_OFFSET_TIME_ORIGINAL, 36881, 2), new androidx.exifinterface.media.d(TAG_OFFSET_TIME_DIGITIZED, 36882, 2), new androidx.exifinterface.media.d(TAG_COMPONENTS_CONFIGURATION, 37121, 7), new androidx.exifinterface.media.d(TAG_COMPRESSED_BITS_PER_PIXEL, 37122, 5), new androidx.exifinterface.media.d(TAG_SHUTTER_SPEED_VALUE, 37377, 10), new androidx.exifinterface.media.d(TAG_APERTURE_VALUE, 37378, 5), new androidx.exifinterface.media.d(TAG_BRIGHTNESS_VALUE, 37379, 10), new androidx.exifinterface.media.d(TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new androidx.exifinterface.media.d(TAG_MAX_APERTURE_VALUE, 37381, 5), new androidx.exifinterface.media.d(TAG_SUBJECT_DISTANCE, 37382, 5), new androidx.exifinterface.media.d(TAG_METERING_MODE, 37383, 3), new androidx.exifinterface.media.d(TAG_LIGHT_SOURCE, 37384, 3), new androidx.exifinterface.media.d(TAG_FLASH, 37385, 3), new androidx.exifinterface.media.d(TAG_FOCAL_LENGTH, 37386, 5), new androidx.exifinterface.media.d(TAG_SUBJECT_AREA, 37396, 3), new androidx.exifinterface.media.d(TAG_MAKER_NOTE, 37500, 7), new androidx.exifinterface.media.d(TAG_USER_COMMENT, 37510, 7), new androidx.exifinterface.media.d(TAG_SUBSEC_TIME, 37520, 2), new androidx.exifinterface.media.d(TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new androidx.exifinterface.media.d(TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new androidx.exifinterface.media.d(TAG_FLASHPIX_VERSION, 40960, 7), new androidx.exifinterface.media.d(TAG_COLOR_SPACE, 40961, 3), new androidx.exifinterface.media.d(TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new androidx.exifinterface.media.d(TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new androidx.exifinterface.media.d(TAG_RELATED_SOUND_FILE, 40964, 2), new androidx.exifinterface.media.d(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new androidx.exifinterface.media.d(TAG_FLASH_ENERGY, 41483, 5), new androidx.exifinterface.media.d(TAG_SPATIAL_FREQUENCY_RESPONSE, 41484, 7), new androidx.exifinterface.media.d(TAG_FOCAL_PLANE_X_RESOLUTION, 41486, 5), new androidx.exifinterface.media.d(TAG_FOCAL_PLANE_Y_RESOLUTION, 41487, 5), new androidx.exifinterface.media.d(TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new androidx.exifinterface.media.d(TAG_SUBJECT_LOCATION, 41492, 3), new androidx.exifinterface.media.d(TAG_EXPOSURE_INDEX, 41493, 5), new androidx.exifinterface.media.d(TAG_SENSING_METHOD, 41495, 3), new androidx.exifinterface.media.d(TAG_FILE_SOURCE, 41728, 7), new androidx.exifinterface.media.d(TAG_SCENE_TYPE, 41729, 7), new androidx.exifinterface.media.d(TAG_CFA_PATTERN, 41730, 7), new androidx.exifinterface.media.d(TAG_CUSTOM_RENDERED, 41985, 3), new androidx.exifinterface.media.d(TAG_EXPOSURE_MODE, 41986, 3), new androidx.exifinterface.media.d(TAG_WHITE_BALANCE, 41987, 3), new androidx.exifinterface.media.d(TAG_DIGITAL_ZOOM_RATIO, 41988, 5), new androidx.exifinterface.media.d(TAG_FOCAL_LENGTH_IN_35MM_FILM, 41989, 3), new androidx.exifinterface.media.d(TAG_SCENE_CAPTURE_TYPE, 41990, 3), new androidx.exifinterface.media.d(TAG_GAIN_CONTROL, 41991, 3), new androidx.exifinterface.media.d(TAG_CONTRAST, 41992, 3), new androidx.exifinterface.media.d(TAG_SATURATION, 41993, 3), new androidx.exifinterface.media.d(TAG_SHARPNESS, 41994, 3), new androidx.exifinterface.media.d(TAG_DEVICE_SETTING_DESCRIPTION, 41995, 7), new androidx.exifinterface.media.d(TAG_SUBJECT_DISTANCE_RANGE, 41996, 3), new androidx.exifinterface.media.d(TAG_IMAGE_UNIQUE_ID, 42016, 2), new androidx.exifinterface.media.d("CameraOwnerName", 42032, 2), new androidx.exifinterface.media.d(TAG_BODY_SERIAL_NUMBER, 42033, 2), new androidx.exifinterface.media.d(TAG_LENS_SPECIFICATION, 42034, 5), new androidx.exifinterface.media.d(TAG_LENS_MAKE, 42035, 2), new androidx.exifinterface.media.d(TAG_LENS_MODEL, 42036, 2), new androidx.exifinterface.media.d(TAG_GAMMA, 42240, 5), new androidx.exifinterface.media.d(TAG_DNG_VERSION, 50706, 1), new androidx.exifinterface.media.d(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        IFD_EXIF_TAGS = dVarArr2;
        androidx.exifinterface.media.d[] dVarArr3 = {new androidx.exifinterface.media.d(TAG_GPS_VERSION_ID, 0, 1), new androidx.exifinterface.media.d(TAG_GPS_LATITUDE_REF, 1, 2), new androidx.exifinterface.media.d(TAG_GPS_LATITUDE, 2, 5, 10), new androidx.exifinterface.media.d(TAG_GPS_LONGITUDE_REF, 3, 2), new androidx.exifinterface.media.d(TAG_GPS_LONGITUDE, 4, 5, 10), new androidx.exifinterface.media.d(TAG_GPS_ALTITUDE_REF, 5, 1), new androidx.exifinterface.media.d(TAG_GPS_ALTITUDE, 6, 5), new androidx.exifinterface.media.d(TAG_GPS_TIMESTAMP, 7, 5), new androidx.exifinterface.media.d(TAG_GPS_SATELLITES, 8, 2), new androidx.exifinterface.media.d(TAG_GPS_STATUS, 9, 2), new androidx.exifinterface.media.d(TAG_GPS_MEASURE_MODE, 10, 2), new androidx.exifinterface.media.d(TAG_GPS_DOP, 11, 5), new androidx.exifinterface.media.d(TAG_GPS_SPEED_REF, 12, 2), new androidx.exifinterface.media.d(TAG_GPS_SPEED, 13, 5), new androidx.exifinterface.media.d(TAG_GPS_TRACK_REF, 14, 2), new androidx.exifinterface.media.d(TAG_GPS_TRACK, 15, 5), new androidx.exifinterface.media.d(TAG_GPS_IMG_DIRECTION_REF, 16, 2), new androidx.exifinterface.media.d(TAG_GPS_IMG_DIRECTION, 17, 5), new androidx.exifinterface.media.d(TAG_GPS_MAP_DATUM, 18, 2), new androidx.exifinterface.media.d(TAG_GPS_DEST_LATITUDE_REF, 19, 2), new androidx.exifinterface.media.d(TAG_GPS_DEST_LATITUDE, 20, 5), new androidx.exifinterface.media.d(TAG_GPS_DEST_LONGITUDE_REF, 21, 2), new androidx.exifinterface.media.d(TAG_GPS_DEST_LONGITUDE, 22, 5), new androidx.exifinterface.media.d(TAG_GPS_DEST_BEARING_REF, 23, 2), new androidx.exifinterface.media.d(TAG_GPS_DEST_BEARING, 24, 5), new androidx.exifinterface.media.d(TAG_GPS_DEST_DISTANCE_REF, 25, 2), new androidx.exifinterface.media.d(TAG_GPS_DEST_DISTANCE, 26, 5), new androidx.exifinterface.media.d(TAG_GPS_PROCESSING_METHOD, 27, 7), new androidx.exifinterface.media.d(TAG_GPS_AREA_INFORMATION, 28, 7), new androidx.exifinterface.media.d(TAG_GPS_DATESTAMP, 29, 2), new androidx.exifinterface.media.d(TAG_GPS_DIFFERENTIAL, 30, 3), new androidx.exifinterface.media.d(TAG_GPS_H_POSITIONING_ERROR, 31, 5)};
        IFD_GPS_TAGS = dVarArr3;
        androidx.exifinterface.media.d[] dVarArr4 = {new androidx.exifinterface.media.d(TAG_INTEROPERABILITY_INDEX, 1, 2)};
        IFD_INTEROPERABILITY_TAGS = dVarArr4;
        androidx.exifinterface.media.d[] dVarArr5 = {new androidx.exifinterface.media.d(TAG_NEW_SUBFILE_TYPE, 254, 4), new androidx.exifinterface.media.d(TAG_SUBFILE_TYPE, 255, 4), new androidx.exifinterface.media.d(TAG_THUMBNAIL_IMAGE_WIDTH, 256, 3, 4), new androidx.exifinterface.media.d(TAG_THUMBNAIL_IMAGE_LENGTH, 257, 3, 4), new androidx.exifinterface.media.d(TAG_BITS_PER_SAMPLE, 258, 3), new androidx.exifinterface.media.d(TAG_COMPRESSION, com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE, 3), new androidx.exifinterface.media.d(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new androidx.exifinterface.media.d(TAG_IMAGE_DESCRIPTION, 270, 2), new androidx.exifinterface.media.d(TAG_MAKE, zc1.b.CTRL_INDEX, 2), new androidx.exifinterface.media.d(TAG_MODEL, 272, 2), new androidx.exifinterface.media.d(TAG_STRIP_OFFSETS, bd1.f.CTRL_INDEX, 3, 4), new androidx.exifinterface.media.d("ThumbnailOrientation", 274, 3), new androidx.exifinterface.media.d(TAG_SAMPLES_PER_PIXEL, com.tencent.mm.plugin.appbrand.jsapi.bio.soter.k.CTRL_INDEX, 3), new androidx.exifinterface.media.d(TAG_ROWS_PER_STRIP, 278, 3, 4), new androidx.exifinterface.media.d(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new androidx.exifinterface.media.d(TAG_X_RESOLUTION, 282, 5), new androidx.exifinterface.media.d(TAG_Y_RESOLUTION, com.tencent.mm.plugin.appbrand.jsapi.pe.CTRL_INDEX, 5), new androidx.exifinterface.media.d(TAG_PLANAR_CONFIGURATION, nd1.f2.CTRL_INDEX, 3), new androidx.exifinterface.media.d(TAG_RESOLUTION_UNIT, 296, 3), new androidx.exifinterface.media.d(TAG_TRANSFER_FUNCTION, 301, 3), new androidx.exifinterface.media.d(TAG_SOFTWARE, 305, 2), new androidx.exifinterface.media.d(TAG_DATETIME, com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET, 2), new androidx.exifinterface.media.d(TAG_ARTIST, qf1.n.CTRL_INDEX, 2), new androidx.exifinterface.media.d(TAG_WHITE_POINT, qf1.f.CTRL_INDEX, 5), new androidx.exifinterface.media.d(TAG_PRIMARY_CHROMATICITIES, 319, 5), new androidx.exifinterface.media.d(TAG_SUB_IFD_POINTER, 330, 4), new androidx.exifinterface.media.d(TAG_JPEG_INTERCHANGE_FORMAT, 513, 4), new androidx.exifinterface.media.d(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new androidx.exifinterface.media.d(TAG_Y_CB_CR_COEFFICIENTS, yc1.z.CTRL_INDEX, 5), new androidx.exifinterface.media.d(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new androidx.exifinterface.media.d(TAG_Y_CB_CR_POSITIONING, 531, 3), new androidx.exifinterface.media.d(TAG_REFERENCE_BLACK_WHITE, com.tencent.mm.plugin.appbrand.jsapi.media.c4.CTRL_INDEX, 5), new androidx.exifinterface.media.d(TAG_COPYRIGHT, 33432, 2), new androidx.exifinterface.media.d(TAG_EXIF_IFD_POINTER, 34665, 4), new androidx.exifinterface.media.d(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new androidx.exifinterface.media.d(TAG_DNG_VERSION, 50706, 1), new androidx.exifinterface.media.d(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        IFD_THUMBNAIL_TAGS = dVarArr5;
        TAG_RAF_IMAGE_SIZE = new androidx.exifinterface.media.d(TAG_STRIP_OFFSETS, bd1.f.CTRL_INDEX, 3);
        androidx.exifinterface.media.d[] dVarArr6 = {new androidx.exifinterface.media.d(TAG_ORF_THUMBNAIL_IMAGE, 256, 7), new androidx.exifinterface.media.d(TAG_ORF_CAMERA_SETTINGS_IFD_POINTER, 8224, 4), new androidx.exifinterface.media.d(TAG_ORF_IMAGE_PROCESSING_IFD_POINTER, 8256, 4)};
        ORF_MAKER_NOTE_TAGS = dVarArr6;
        androidx.exifinterface.media.d[] dVarArr7 = {new androidx.exifinterface.media.d(TAG_ORF_PREVIEW_IMAGE_START, 257, 4), new androidx.exifinterface.media.d(TAG_ORF_PREVIEW_IMAGE_LENGTH, 258, 4)};
        ORF_CAMERA_SETTINGS_TAGS = dVarArr7;
        androidx.exifinterface.media.d[] dVarArr8 = {new androidx.exifinterface.media.d(TAG_ORF_ASPECT_FRAME, 4371, 3)};
        ORF_IMAGE_PROCESSING_TAGS = dVarArr8;
        androidx.exifinterface.media.d[] dVarArr9 = {new androidx.exifinterface.media.d(TAG_COLOR_SPACE, 55, 3)};
        PEF_TAGS = dVarArr9;
        androidx.exifinterface.media.d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        EXIF_TAGS = dVarArr10;
        EXIF_POINTER_TAGS = new androidx.exifinterface.media.d[]{new androidx.exifinterface.media.d(TAG_SUB_IFD_POINTER, 330, 4), new androidx.exifinterface.media.d(TAG_EXIF_IFD_POINTER, 34665, 4), new androidx.exifinterface.media.d(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new androidx.exifinterface.media.d(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new androidx.exifinterface.media.d(TAG_ORF_CAMERA_SETTINGS_IFD_POINTER, 8224, 1), new androidx.exifinterface.media.d(TAG_ORF_IMAGE_PROCESSING_IFD_POINTER, 8256, 1)};
        sExifTagMapsForReading = new java.util.HashMap[dVarArr10.length];
        sExifTagMapsForWriting = new java.util.HashMap[dVarArr10.length];
        RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(TAG_F_NUMBER, TAG_DIGITAL_ZOOM_RATIO, TAG_EXPOSURE_TIME, TAG_SUBJECT_DISTANCE)));
        sExifPointerTagMap = new java.util.HashMap<>();
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("US-ASCII");
        ASCII = forName;
        IDENTIFIER_EXIF_APP1 = "Exif\u0000\u0000".getBytes(forName);
        IDENTIFIER_XMP_APP1 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        java.util.Locale locale = java.util.Locale.US;
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        sFormatterPrimary = simpleDateFormat;
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        java.text.SimpleDateFormat simpleDateFormat2 = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, locale);
        sFormatterSecondary = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        int i17 = 0;
        while (true) {
            androidx.exifinterface.media.d[][] dVarArr11 = EXIF_TAGS;
            if (i17 >= dVarArr11.length) {
                java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap = sExifPointerTagMap;
                androidx.exifinterface.media.d[] dVarArr12 = EXIF_POINTER_TAGS;
                hashMap.put(java.lang.Integer.valueOf(dVarArr12[0].f11184a), 5);
                hashMap.put(java.lang.Integer.valueOf(dVarArr12[1].f11184a), 1);
                hashMap.put(java.lang.Integer.valueOf(dVarArr12[2].f11184a), 2);
                hashMap.put(java.lang.Integer.valueOf(dVarArr12[3].f11184a), 3);
                hashMap.put(java.lang.Integer.valueOf(dVarArr12[4].f11184a), 7);
                hashMap.put(java.lang.Integer.valueOf(dVarArr12[5].f11184a), 8);
                NON_ZERO_TIME_PATTERN = java.util.regex.Pattern.compile(".*[1-9].*");
                GPS_TIMESTAMP_PATTERN = java.util.regex.Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                DATETIME_PRIMARY_FORMAT_PATTERN = java.util.regex.Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                DATETIME_SECONDARY_FORMAT_PATTERN = java.util.regex.Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            sExifTagMapsForReading[i17] = new java.util.HashMap<>();
            sExifTagMapsForWriting[i17] = new java.util.HashMap<>();
            for (androidx.exifinterface.media.d dVar : dVarArr11[i17]) {
                sExifTagMapsForReading[i17].put(java.lang.Integer.valueOf(dVar.f11184a), dVar);
                sExifTagMapsForWriting[i17].put(dVar.f11185b, dVar);
            }
            i17++;
        }
    }

    public ExifInterface(java.io.File file) {
        androidx.exifinterface.media.d[][] dVarArr = EXIF_TAGS;
        this.mAttributes = new java.util.HashMap[dVarArr.length];
        this.mAttributesOffsets = new java.util.HashSet(dVarArr.length);
        this.mExifByteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        if (file != null) {
            initForFilename(file.getAbsolutePath());
            return;
        }
        throw new java.lang.NullPointerException("file cannot be null");
    }

    private void addDefaultValuesForCompatibility() {
        java.lang.String attribute = getAttribute(TAG_DATETIME_ORIGINAL);
        if (attribute != null && getAttribute(TAG_DATETIME) == null) {
            this.mAttributes[0].put(TAG_DATETIME, androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(attribute));
        }
        if (getAttribute(TAG_IMAGE_WIDTH) == null) {
            this.mAttributes[0].put(TAG_IMAGE_WIDTH, androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (getAttribute(TAG_IMAGE_LENGTH) == null) {
            this.mAttributes[0].put(TAG_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (getAttribute(TAG_ORIENTATION) == null) {
            this.mAttributes[0].put(TAG_ORIENTATION, androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (getAttribute(TAG_LIGHT_SOURCE) == null) {
            this.mAttributes[1].put(TAG_LIGHT_SOURCE, androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
    }

    private java.lang.String convertDecimalDegree(double d17) {
        long j17 = (long) d17;
        double d18 = d17 - j17;
        long j18 = (long) (d18 * 60.0d);
        return j17 + "/1," + j18 + "/1," + java.lang.Math.round((d18 - (j18 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    private static double convertRationalLatLonToDouble(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.String[] split = str.split(",", -1);
            java.lang.String[] split2 = split[0].split("/", -1);
            double parseDouble = java.lang.Double.parseDouble(split2[0].trim()) / java.lang.Double.parseDouble(split2[1].trim());
            java.lang.String[] split3 = split[1].split("/", -1);
            double parseDouble2 = java.lang.Double.parseDouble(split3[0].trim()) / java.lang.Double.parseDouble(split3[1].trim());
            java.lang.String[] split4 = split[2].split("/", -1);
            double parseDouble3 = parseDouble + (parseDouble2 / 60.0d) + ((java.lang.Double.parseDouble(split4[0].trim()) / java.lang.Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals(LATITUDE_SOUTH) && !str2.equals(LONGITUDE_WEST)) {
                if (!str2.equals("N") && !str2.equals(LONGITUDE_EAST)) {
                    throw new java.lang.IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.NumberFormatException e17) {
            throw new java.lang.IllegalArgumentException(e17);
        }
    }

    private void copyChunksUpToGivenChunkType(androidx.exifinterface.media.b bVar, androidx.exifinterface.media.c cVar, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            copyWebPChunk(bVar, cVar, bArr3);
            if (java.util.Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && java.util.Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void copyWebPChunk(androidx.exifinterface.media.b bVar, androidx.exifinterface.media.c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.b(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        androidx.exifinterface.media.g.d(bVar, cVar, readInt);
    }

    private androidx.exifinterface.media.ExifInterface.ExifAttribute getExifAttribute(java.lang.String str) {
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute;
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2;
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        if (TAG_ISO_SPEED_RATINGS.equals(str)) {
            str = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        if (TAG_XMP.equals(str) && getXmpHandlingForImageType(this.mMimeType) == 2 && (exifAttribute2 = this.mXmpFromSeparateMarker) != null) {
            return exifAttribute2;
        }
        for (int i17 = 0; i17 < EXIF_TAGS.length; i17++) {
            androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute3 = this.mAttributes[i17].get(str);
            if (exifAttribute3 != null) {
                return exifAttribute3;
            }
        }
        if (!TAG_XMP.equals(str) || (exifAttribute = this.mXmpFromSeparateMarker) == null) {
            return null;
        }
        return exifAttribute;
    }

    private void getHeifAttributes(androidx.exifinterface.media.f fVar, int i17) {
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
                mediaMetadataRetriever.setDataSource(new androidx.exifinterface.media.a(this, fVar));
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
                    this.mAttributes[0].put(TAG_IMAGE_WIDTH, androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(java.lang.Integer.parseInt(str), this.mExifByteOrder));
                }
                if (str3 != null) {
                    this.mAttributes[0].put(TAG_IMAGE_LENGTH, androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(java.lang.Integer.parseInt(str3), this.mExifByteOrder));
                }
                if (str2 != null) {
                    int parseInt = java.lang.Integer.parseInt(str2);
                    this.mAttributes[0].put(TAG_ORIENTATION, androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.mExifByteOrder));
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
                    if (!java.util.Arrays.equals(bArr, IDENTIFIER_EXIF_APP1)) {
                        throw new java.io.IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i27];
                    fVar.readFully(bArr2);
                    this.mOffsetToExifData = i19;
                    readExifSegment(bArr2, 0);
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
                    this.mXmpFromSeparateMarker = new androidx.exifinterface.media.ExifInterface.ExifAttribute(1, parseInt5, j17, bArr3);
                    this.mFileOnDiskContainsSeparateXmpMarker = true;
                }
                boolean z17 = DEBUG;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getJpegAttributes(androidx.exifinterface.media.b r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.getJpegAttributes(androidx.exifinterface.media.b, int, int):void");
    }

    private int getMimeType(java.io.BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (isJpegFormat(bArr)) {
            return 4;
        }
        if (isRafFormat(bArr)) {
            return 9;
        }
        int isHeicOrAvifFormat = isHeicOrAvifFormat(bArr);
        if (isHeicOrAvifFormat != 0) {
            return isHeicOrAvifFormat;
        }
        if (isOrfFormat(bArr)) {
            return 7;
        }
        if (isRw2Format(bArr)) {
            return 10;
        }
        if (isPngFormat(bArr)) {
            return 13;
        }
        return isWebpFormat(bArr) ? 14 : 0;
    }

    private void getOrfAttributes(androidx.exifinterface.media.f fVar) {
        int i17;
        int i18;
        getRawAttributes(fVar);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = this.mAttributes[1].get(TAG_MAKER_NOTE);
        if (exifAttribute != null) {
            androidx.exifinterface.media.f fVar2 = new androidx.exifinterface.media.f(exifAttribute.bytes);
            fVar2.f11179f = this.mExifByteOrder;
            byte[] bArr = ORF_MAKER_NOTE_HEADER_1;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.b(0L);
            byte[] bArr3 = ORF_MAKER_NOTE_HEADER_2;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (java.util.Arrays.equals(bArr2, bArr)) {
                fVar2.b(8L);
            } else if (java.util.Arrays.equals(bArr4, bArr3)) {
                fVar2.b(12L);
            }
            readImageFileDirectory(fVar2, 6);
            androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.mAttributes[7].get(TAG_ORF_PREVIEW_IMAGE_START);
            androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute3 = this.mAttributes[7].get(TAG_ORF_PREVIEW_IMAGE_LENGTH);
            if (exifAttribute2 != null && exifAttribute3 != null) {
                this.mAttributes[5].put(TAG_JPEG_INTERCHANGE_FORMAT, exifAttribute2);
                this.mAttributes[5].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, exifAttribute3);
            }
            androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute4 = this.mAttributes[8].get(TAG_ORF_ASPECT_FRAME);
            if (exifAttribute4 != null) {
                int[] iArr = (int[]) exifAttribute4.getValue(this.mExifByteOrder);
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
                androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(i28, this.mExifByteOrder);
                androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(i29, this.mExifByteOrder);
                this.mAttributes[0].put(TAG_IMAGE_WIDTH, createUShort);
                this.mAttributes[0].put(TAG_IMAGE_LENGTH, createUShort2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        r18.mFileOnDiskContainsSeparateXmpMarker = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getPngAttributes(androidx.exifinterface.media.b r19) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.getPngAttributes(androidx.exifinterface.media.b):void");
    }

    private void getRafAttributes(androidx.exifinterface.media.b bVar) {
        if (DEBUG) {
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
        bVar.a(i17 - bVar.f11178e);
        bVar.readFully(bArr4);
        getJpegAttributes(new androidx.exifinterface.media.b(bArr4), i17, 5);
        bVar.a(i19 - bVar.f11178e);
        bVar.f11179f = java.nio.ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        for (int i27 = 0; i27 < readInt; i27++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == TAG_RAF_IMAGE_SIZE.f11184a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(readShort, this.mExifByteOrder);
                androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(readShort2, this.mExifByteOrder);
                this.mAttributes[0].put(TAG_IMAGE_LENGTH, createUShort);
                this.mAttributes[0].put(TAG_IMAGE_WIDTH, createUShort2);
                return;
            }
            bVar.a(readUnsignedShort2);
        }
    }

    private void getRawAttributes(androidx.exifinterface.media.f fVar) {
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute;
        parseTiffHeaders(fVar);
        readImageFileDirectory(fVar, 0);
        updateImageSizeValues(fVar, 0);
        updateImageSizeValues(fVar, 5);
        updateImageSizeValues(fVar, 4);
        validateImages();
        if (this.mMimeType != 8 || (exifAttribute = this.mAttributes[1].get(TAG_MAKER_NOTE)) == null) {
            return;
        }
        androidx.exifinterface.media.f fVar2 = new androidx.exifinterface.media.f(exifAttribute.bytes);
        fVar2.f11179f = this.mExifByteOrder;
        fVar2.a(6);
        readImageFileDirectory(fVar2, 9);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.mAttributes[9].get(TAG_COLOR_SPACE);
        if (exifAttribute2 != null) {
            this.mAttributes[1].put(TAG_COLOR_SPACE, exifAttribute2);
        }
    }

    private void getRw2Attributes(androidx.exifinterface.media.f fVar) {
        if (DEBUG) {
            java.util.Objects.toString(fVar);
        }
        getRawAttributes(fVar);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = this.mAttributes[0].get(TAG_RW2_JPG_FROM_RAW);
        if (exifAttribute != null) {
            getJpegAttributes(new androidx.exifinterface.media.b(exifAttribute.bytes), (int) exifAttribute.bytesOffset, 5);
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.mAttributes[0].get(TAG_RW2_ISO);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute3 = this.mAttributes[1].get(TAG_PHOTOGRAPHIC_SENSITIVITY);
        if (exifAttribute2 == null || exifAttribute3 != null) {
            return;
        }
        this.mAttributes[1].put(TAG_PHOTOGRAPHIC_SENSITIVITY, exifAttribute2);
    }

    private boolean getStandaloneAttributes(androidx.exifinterface.media.f fVar) {
        byte[] bArr = IDENTIFIER_EXIF_APP1;
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
            int read = fVar.f11177d.read(bArr3, i17, bArr3.length - i17);
            if (read == -1) {
                byte[] copyOf = java.util.Arrays.copyOf(bArr3, i17);
                this.mOffsetToExifData = IDENTIFIER_EXIF_APP1.length;
                readExifSegment(copyOf, 0);
                return true;
            }
            i17 += read;
            fVar.f11178e += read;
        }
    }

    private void getWebpAttributes(androidx.exifinterface.media.b bVar) {
        if (DEBUG) {
            java.util.Objects.toString(bVar);
        }
        bVar.f11179f = java.nio.ByteOrder.LITTLE_ENDIAN;
        bVar.a(WEBP_SIGNATURE_1.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = WEBP_SIGNATURE_2;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i17 = length + 4 + 4;
                if (java.util.Arrays.equals(WEBP_CHUNK_TYPE_EXIF, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    byte[] bArr4 = IDENTIFIER_EXIF_APP1;
                    if (androidx.exifinterface.media.g.e(bArr3, bArr4)) {
                        bArr3 = java.util.Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.mOffsetToExifData = i17;
                    readExifSegment(bArr3, 0);
                    setThumbnailData(new androidx.exifinterface.media.b(bArr3));
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

    private static int getXmpHandlingForImageType(int i17) {
        if (i17 != 4) {
            return (i17 == 9 || i17 == 15 || i17 == 12 || i17 == 13) ? 2 : 1;
        }
        return 3;
    }

    private static android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat(java.lang.String str) {
        if (str.contains(",")) {
            java.lang.String[] split = str.split(",", -1);
            android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat = guessDataFormat(split[0]);
            if (((java.lang.Integer) guessDataFormat.first).intValue() == 2) {
                return guessDataFormat;
            }
            for (int i17 = 1; i17 < split.length; i17++) {
                android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat2 = guessDataFormat(split[i17]);
                int intValue = (((java.lang.Integer) guessDataFormat2.first).equals(guessDataFormat.first) || ((java.lang.Integer) guessDataFormat2.second).equals(guessDataFormat.first)) ? ((java.lang.Integer) guessDataFormat.first).intValue() : -1;
                int intValue2 = (((java.lang.Integer) guessDataFormat.second).intValue() == -1 || !(((java.lang.Integer) guessDataFormat2.first).equals(guessDataFormat.second) || ((java.lang.Integer) guessDataFormat2.second).equals(guessDataFormat.second))) ? -1 : ((java.lang.Integer) guessDataFormat.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new android.util.Pair<>(2, -1);
                }
                if (intValue == -1) {
                    guessDataFormat = new android.util.Pair<>(java.lang.Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    guessDataFormat = new android.util.Pair<>(java.lang.Integer.valueOf(intValue), -1);
                }
            }
            return guessDataFormat;
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

    private void handleThumbnailFromJfif(androidx.exifinterface.media.b bVar, java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> hashMap) {
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = hashMap.get(TAG_JPEG_INTERCHANGE_FORMAT);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = hashMap.get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
        int intValue2 = exifAttribute2.getIntValue(this.mExifByteOrder);
        if (this.mMimeType == 7) {
            intValue += this.mOrfMakerNoteOffset;
        }
        if (intValue <= 0 || intValue2 <= 0) {
            return;
        }
        this.mHasThumbnail = true;
        if (this.mFilename == null && this.mAssetInputStream == null && this.mSeekableFileDescriptor == null) {
            byte[] bArr = new byte[intValue2];
            bVar.a(intValue);
            bVar.readFully(bArr);
            this.mThumbnailBytes = bArr;
        }
        this.mThumbnailOffset = intValue;
        this.mThumbnailLength = intValue2;
    }

    private void handleThumbnailFromStrips(androidx.exifinterface.media.b bVar, java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> hashMap) {
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = hashMap.get(TAG_STRIP_OFFSETS);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = hashMap.get(TAG_STRIP_BYTE_COUNTS);
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        long[] b17 = androidx.exifinterface.media.g.b(exifAttribute.getValue(this.mExifByteOrder));
        long[] b18 = androidx.exifinterface.media.g.b(exifAttribute2.getValue(this.mExifByteOrder));
        if (b17 == null || b17.length == 0 || b18 == null || b18.length == 0 || b17.length != b18.length) {
            return;
        }
        long j17 = 0;
        for (long j18 : b18) {
            j17 += j18;
        }
        int i17 = (int) j17;
        byte[] bArr = new byte[i17];
        this.mAreThumbnailStripsConsecutive = true;
        this.mHasThumbnailStrips = true;
        this.mHasThumbnail = true;
        int i18 = 0;
        int i19 = 0;
        for (int i27 = 0; i27 < b17.length; i27++) {
            int i28 = (int) b17[i27];
            int i29 = (int) b18[i27];
            if (i27 < b17.length - 1 && i28 + i29 != b17[i27 + 1]) {
                this.mAreThumbnailStripsConsecutive = false;
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
        this.mThumbnailBytes = bArr;
        if (this.mAreThumbnailStripsConsecutive) {
            this.mThumbnailOffset = (int) b17[0];
            this.mThumbnailLength = i17;
        }
    }

    private void initForFilename(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("filename cannot be null");
        }
        java.io.FileInputStream fileInputStream = null;
        this.mAssetInputStream = null;
        this.mFilename = str;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(str);
            try {
                if (isSeekableFD(fileInputStream2.getFD())) {
                    this.mSeekableFileDescriptor = fileInputStream2.getFD();
                } else {
                    this.mSeekableFileDescriptor = null;
                }
                loadAttributes(fileInputStream2);
                androidx.exifinterface.media.g.a(fileInputStream2);
            } catch (java.lang.Throwable th6) {
                th = th6;
                fileInputStream = fileInputStream2;
                androidx.exifinterface.media.g.a(fileInputStream);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    private int isHeicOrAvifFormat(byte[] bArr) {
        androidx.exifinterface.media.b bVar;
        long readInt;
        byte[] bArr2;
        long j17;
        androidx.exifinterface.media.b bVar2 = null;
        try {
            try {
                bVar = new androidx.exifinterface.media.b(bArr);
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
            boolean z17 = DEBUG;
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
        if (!java.util.Arrays.equals(bArr2, HEIF_TYPE_FTYP)) {
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
                    if (java.util.Arrays.equals(bArr3, HEIF_BRAND_MIF1)) {
                        bVar2 = 1;
                    } else if (java.util.Arrays.equals(bArr3, HEIF_BRAND_HEIC)) {
                        z18 = true;
                    } else if (java.util.Arrays.equals(bArr3, HEIF_BRAND_AVIF) || java.util.Arrays.equals(bArr3, HEIF_BRAND_AVIS)) {
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

    private static boolean isJpegFormat(byte[] bArr) {
        int i17 = 0;
        while (true) {
            byte[] bArr2 = JPEG_SIGNATURE;
            if (i17 >= bArr2.length) {
                return true;
            }
            if (bArr[i17] != bArr2[i17]) {
                return false;
            }
            i17++;
        }
    }

    private boolean isOrfFormat(byte[] bArr) {
        androidx.exifinterface.media.b bVar = null;
        try {
            androidx.exifinterface.media.b bVar2 = new androidx.exifinterface.media.b(bArr);
            try {
                java.nio.ByteOrder readByteOrder = readByteOrder(bVar2);
                this.mExifByteOrder = readByteOrder;
                bVar2.f11179f = readByteOrder;
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

    private boolean isPngFormat(byte[] bArr) {
        int i17 = 0;
        while (true) {
            byte[] bArr2 = PNG_SIGNATURE;
            if (i17 >= bArr2.length) {
                return true;
            }
            if (bArr[i17] != bArr2[i17]) {
                return false;
            }
            i17++;
        }
    }

    private boolean isRafFormat(byte[] bArr) {
        byte[] bytes = RAF_SIGNATURE.getBytes(java.nio.charset.Charset.defaultCharset());
        for (int i17 = 0; i17 < bytes.length; i17++) {
            if (bArr[i17] != bytes[i17]) {
                return false;
            }
        }
        return true;
    }

    private boolean isRw2Format(byte[] bArr) {
        androidx.exifinterface.media.b bVar = null;
        try {
            androidx.exifinterface.media.b bVar2 = new androidx.exifinterface.media.b(bArr);
            try {
                java.nio.ByteOrder readByteOrder = readByteOrder(bVar2);
                this.mExifByteOrder = readByteOrder;
                bVar2.f11179f = readByteOrder;
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

    private static boolean isSeekableFD(java.io.FileDescriptor fileDescriptor) {
        try {
            android.system.Os.lseek(fileDescriptor, 0L, android.system.OsConstants.SEEK_CUR);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private boolean isSupportedDataType(java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> hashMap) {
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute;
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = hashMap.get(TAG_BITS_PER_SAMPLE);
        if (exifAttribute2 == null) {
            return false;
        }
        int[] iArr = (int[]) exifAttribute2.getValue(this.mExifByteOrder);
        int[] iArr2 = BITS_PER_SAMPLE_RGB;
        if (java.util.Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.mMimeType != 3 || (exifAttribute = hashMap.get(TAG_PHOTOMETRIC_INTERPRETATION)) == null) {
            return false;
        }
        int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
        return (intValue == 1 && java.util.Arrays.equals(iArr, BITS_PER_SAMPLE_GREYSCALE_2)) || (intValue == 6 && java.util.Arrays.equals(iArr, iArr2));
    }

    private static boolean isSupportedFormatForSavingAttributes(int i17) {
        return i17 == 4 || i17 == 13 || i17 == 14;
    }

    public static boolean isSupportedMimeType(java.lang.String str) {
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

    private boolean isThumbnail(java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> hashMap) {
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = hashMap.get(TAG_IMAGE_LENGTH);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = hashMap.get(TAG_IMAGE_WIDTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.getIntValue(this.mExifByteOrder) <= 512 && exifAttribute2.getIntValue(this.mExifByteOrder) <= 512;
    }

    private boolean isWebpFormat(byte[] bArr) {
        int i17 = 0;
        while (true) {
            byte[] bArr2 = WEBP_SIGNATURE_1;
            if (i17 >= bArr2.length) {
                int i18 = 0;
                while (true) {
                    byte[] bArr3 = WEBP_SIGNATURE_2;
                    if (i18 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[WEBP_SIGNATURE_1.length + i18 + 4] != bArr3[i18]) {
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

    private void loadAttributes(java.io.InputStream inputStream) {
        boolean z17;
        for (int i17 = 0; i17 < EXIF_TAGS.length; i17++) {
            try {
                try {
                    this.mAttributes[i17] = new java.util.HashMap<>();
                } catch (java.io.IOException | java.lang.UnsupportedOperationException unused) {
                    boolean z18 = DEBUG;
                    addDefaultValuesForCompatibility();
                    if (!z18) {
                        return;
                    }
                }
            } finally {
                addDefaultValuesForCompatibility();
                if (DEBUG) {
                    printAttributes();
                }
            }
        }
        if (!this.mIsExifDataOnly) {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream, 5000);
            this.mMimeType = getMimeType(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (shouldSupportSeek(this.mMimeType)) {
            androidx.exifinterface.media.f fVar = new androidx.exifinterface.media.f(inputStream);
            if (!this.mIsExifDataOnly) {
                int i18 = this.mMimeType;
                if (i18 != 12 && i18 != 15) {
                    if (i18 == 7) {
                        getOrfAttributes(fVar);
                    } else if (i18 == 10) {
                        getRw2Attributes(fVar);
                    } else {
                        getRawAttributes(fVar);
                    }
                }
                getHeifAttributes(fVar, i18);
            } else if (!getStandaloneAttributes(fVar)) {
                if (z17) {
                    return;
                } else {
                    return;
                }
            }
            fVar.b(this.mOffsetToExifData);
            setThumbnailData(fVar);
        } else {
            androidx.exifinterface.media.b bVar = new androidx.exifinterface.media.b(inputStream);
            int i19 = this.mMimeType;
            if (i19 == 4) {
                getJpegAttributes(bVar, 0, 0);
            } else if (i19 == 13) {
                getPngAttributes(bVar);
            } else if (i19 == 9) {
                getRafAttributes(bVar);
            } else if (i19 == 14) {
                getWebpAttributes(bVar);
            }
        }
        addDefaultValuesForCompatibility();
        if (!DEBUG) {
            return;
        }
        printAttributes();
    }

    private static java.lang.Long parseDateTime(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        long j17;
        if (str != null && NON_ZERO_TIME_PATTERN.matcher(str).matches()) {
            java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
            try {
                java.util.Date parse = sFormatterPrimary.parse(str, parsePosition);
                if (parse == null && (parse = sFormatterSecondary.parse(str, parsePosition)) == null) {
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

    private void parseTiffHeaders(androidx.exifinterface.media.b bVar) {
        java.nio.ByteOrder readByteOrder = readByteOrder(bVar);
        this.mExifByteOrder = readByteOrder;
        bVar.f11179f = readByteOrder;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i17 = this.mMimeType;
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

    private void printAttributes() {
        int i17 = 0;
        while (true) {
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>[] hashMapArr = this.mAttributes;
            if (i17 >= hashMapArr.length) {
                return;
            }
            hashMapArr[i17].size();
            for (java.util.Map.Entry<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> entry : this.mAttributes[i17].entrySet()) {
                androidx.exifinterface.media.ExifInterface.ExifAttribute value = entry.getValue();
                entry.getKey();
                value.toString();
                value.getStringValue(this.mExifByteOrder);
            }
            i17++;
        }
    }

    private java.nio.ByteOrder readByteOrder(androidx.exifinterface.media.b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            return java.nio.ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return java.nio.ByteOrder.BIG_ENDIAN;
        }
        throw new java.io.IOException("Invalid byte order: " + java.lang.Integer.toHexString(readShort));
    }

    private void readExifSegment(byte[] bArr, int i17) {
        androidx.exifinterface.media.f fVar = new androidx.exifinterface.media.f(bArr);
        parseTiffHeaders(fVar);
        readImageFileDirectory(fVar, i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void readImageFileDirectory(androidx.exifinterface.media.f r27, int r28) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.readImageFileDirectory(androidx.exifinterface.media.f, int):void");
    }

    private void removeAttribute(java.lang.String str) {
        for (int i17 = 0; i17 < EXIF_TAGS.length; i17++) {
            this.mAttributes[i17].remove(str);
        }
    }

    private void replaceInvalidTags(int i17, java.lang.String str, java.lang.String str2) {
        if (this.mAttributes[i17].isEmpty() || this.mAttributes[i17].get(str) == null) {
            return;
        }
        java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> hashMap = this.mAttributes[i17];
        hashMap.put(str2, hashMap.get(str));
        this.mAttributes[i17].remove(str);
    }

    private void retrieveJpegImageSize(androidx.exifinterface.media.f fVar, int i17) {
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = this.mAttributes[i17].get(TAG_IMAGE_LENGTH);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.mAttributes[i17].get(TAG_IMAGE_WIDTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute3 = this.mAttributes[i17].get(TAG_JPEG_INTERCHANGE_FORMAT);
            androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute4 = this.mAttributes[i17].get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
            if (exifAttribute3 == null || exifAttribute4 == null) {
                return;
            }
            int intValue = exifAttribute3.getIntValue(this.mExifByteOrder);
            int intValue2 = exifAttribute3.getIntValue(this.mExifByteOrder);
            fVar.b(intValue);
            byte[] bArr = new byte[intValue2];
            fVar.readFully(bArr);
            getJpegAttributes(new androidx.exifinterface.media.b(bArr), intValue, i17);
        }
    }

    private void saveJpegAttributes(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        byte[] bArr;
        if (DEBUG) {
            java.util.Objects.toString(inputStream);
            java.util.Objects.toString(outputStream);
        }
        androidx.exifinterface.media.b bVar = new androidx.exifinterface.media.b(inputStream);
        androidx.exifinterface.media.c cVar = new androidx.exifinterface.media.c(outputStream, java.nio.ByteOrder.BIG_ENDIAN);
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
        this.mOffsetToExifData = writeExifSegment(cVar);
        if (this.mXmpFromSeparateMarker != null) {
            cVar.write(-1);
            cVar.a(-31);
            byte[] bArr2 = IDENTIFIER_XMP_APP1;
            cVar.i(bArr2.length + 2 + this.mXmpFromSeparateMarker.bytes.length);
            cVar.write(bArr2);
            cVar.write(this.mXmpFromSeparateMarker.bytes);
            this.mFileOnDiskContainsSeparateXmpMarker = true;
        }
        byte[] bArr3 = new byte[4096];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.a(-1);
                cVar.a(readByte);
                androidx.exifinterface.media.g.c(bVar, cVar);
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
                byte[] bArr4 = IDENTIFIER_XMP_APP1;
                if (readUnsignedShort2 >= bArr4.length) {
                    bArr = new byte[bArr4.length];
                } else {
                    byte[] bArr5 = IDENTIFIER_EXIF_APP1;
                    bArr = readUnsignedShort2 >= bArr5.length ? new byte[bArr5.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (androidx.exifinterface.media.g.e(bArr, IDENTIFIER_EXIF_APP1) || androidx.exifinterface.media.g.e(bArr, bArr4)) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void savePngAttributes(java.io.InputStream r9, java.io.OutputStream r10) {
        /*
            r8 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto La
            java.util.Objects.toString(r9)
            java.util.Objects.toString(r10)
        La:
            androidx.exifinterface.media.b r0 = new androidx.exifinterface.media.b
            r0.<init>(r9)
            androidx.exifinterface.media.c r9 = new androidx.exifinterface.media.c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE
            int r10 = r10.length
            androidx.exifinterface.media.g.d(r0, r9, r10)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = r8.mXmpFromSeparateMarker
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L26
            boolean r10 = r8.mFileOnDiskContainsSeparateXmpMarker
            if (r10 == 0) goto L5b
        L26:
            r10 = r1
        L27:
            if (r1 != 0) goto L30
            if (r10 == 0) goto L2c
            goto L30
        L2c:
            androidx.exifinterface.media.g.c(r0, r9)
            return
        L30:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L5d
            r9.b(r3)
            r9.b(r4)
            int r3 = r3 + 4
            androidx.exifinterface.media.g.d(r0, r9, r3)
            int r3 = r8.mOffsetToExifData
            if (r3 != 0) goto L50
            r8.writePngExifChunk(r9)
            r1 = r2
        L50:
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = r8.mXmpFromSeparateMarker
            if (r3 == 0) goto L27
            boolean r3 = r8.mFileOnDiskContainsSeparateXmpMarker
            if (r3 != 0) goto L27
            r8.writePngXmpItxtChunk(r9)
        L5b:
            r10 = r2
            goto L27
        L5d:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L6e
            if (r1 == 0) goto L6e
            r8.writePngExifChunk(r9)
            int r3 = r3 + 4
            r0.a(r3)
            r1 = r2
            goto L27
        L6e:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto La0
            byte[] r5 = androidx.exifinterface.media.ExifInterface.PNG_ITXT_XMP_KEYWORD
            int r6 = r5.length
            if (r3 < r6) goto La0
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto L93
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = r8.mXmpFromSeparateMarker
            if (r10 == 0) goto L8f
            r8.writePngXmpItxtChunk(r9)
        L8f:
            r0.a(r6)
            goto L5b
        L93:
            r9.b(r3)
            r9.b(r4)
            r9.write(r7)
            androidx.exifinterface.media.g.d(r0, r9, r6)
            goto L27
        La0:
            r9.b(r3)
            r9.b(r4)
            int r3 = r3 + 4
            androidx.exifinterface.media.g.d(r0, r9, r3)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.savePngAttributes(java.io.InputStream, java.io.OutputStream):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01e5 A[Catch: all -> 0x01f8, Exception -> 0x01fb, TryCatch #5 {Exception -> 0x01fb, all -> 0x01f8, blocks: (B:9:0x0032, B:11:0x003e, B:13:0x0053, B:14:0x0055, B:16:0x01cb, B:18:0x01e5, B:19:0x01ee, B:23:0x0061, B:25:0x0070, B:27:0x0078, B:28:0x007c, B:31:0x008c, B:33:0x0097, B:34:0x009c, B:36:0x009e, B:41:0x00ac, B:39:0x00b1, B:44:0x00b5, B:46:0x00c1, B:48:0x00c9, B:52:0x00d8, B:54:0x00e0, B:55:0x00e4, B:57:0x00ef, B:59:0x00ff, B:61:0x0151, B:63:0x015d, B:64:0x0166, B:66:0x01a6, B:67:0x01c2, B:68:0x01b2, B:70:0x01ba, B:71:0x010c, B:72:0x0113, B:73:0x0114, B:75:0x011c, B:77:0x0122, B:80:0x013a, B:82:0x0144, B:83:0x014b), top: B:8:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015d A[Catch: all -> 0x01f8, Exception -> 0x01fb, TryCatch #5 {Exception -> 0x01fb, all -> 0x01f8, blocks: (B:9:0x0032, B:11:0x003e, B:13:0x0053, B:14:0x0055, B:16:0x01cb, B:18:0x01e5, B:19:0x01ee, B:23:0x0061, B:25:0x0070, B:27:0x0078, B:28:0x007c, B:31:0x008c, B:33:0x0097, B:34:0x009c, B:36:0x009e, B:41:0x00ac, B:39:0x00b1, B:44:0x00b5, B:46:0x00c1, B:48:0x00c9, B:52:0x00d8, B:54:0x00e0, B:55:0x00e4, B:57:0x00ef, B:59:0x00ff, B:61:0x0151, B:63:0x015d, B:64:0x0166, B:66:0x01a6, B:67:0x01c2, B:68:0x01b2, B:70:0x01ba, B:71:0x010c, B:72:0x0113, B:73:0x0114, B:75:0x011c, B:77:0x0122, B:80:0x013a, B:82:0x0144, B:83:0x014b), top: B:8:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a6 A[Catch: all -> 0x01f8, Exception -> 0x01fb, TryCatch #5 {Exception -> 0x01fb, all -> 0x01f8, blocks: (B:9:0x0032, B:11:0x003e, B:13:0x0053, B:14:0x0055, B:16:0x01cb, B:18:0x01e5, B:19:0x01ee, B:23:0x0061, B:25:0x0070, B:27:0x0078, B:28:0x007c, B:31:0x008c, B:33:0x0097, B:34:0x009c, B:36:0x009e, B:41:0x00ac, B:39:0x00b1, B:44:0x00b5, B:46:0x00c1, B:48:0x00c9, B:52:0x00d8, B:54:0x00e0, B:55:0x00e4, B:57:0x00ef, B:59:0x00ff, B:61:0x0151, B:63:0x015d, B:64:0x0166, B:66:0x01a6, B:67:0x01c2, B:68:0x01b2, B:70:0x01ba, B:71:0x010c, B:72:0x0113, B:73:0x0114, B:75:0x011c, B:77:0x0122, B:80:0x013a, B:82:0x0144, B:83:0x014b), top: B:8:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b2 A[Catch: all -> 0x01f8, Exception -> 0x01fb, TryCatch #5 {Exception -> 0x01fb, all -> 0x01f8, blocks: (B:9:0x0032, B:11:0x003e, B:13:0x0053, B:14:0x0055, B:16:0x01cb, B:18:0x01e5, B:19:0x01ee, B:23:0x0061, B:25:0x0070, B:27:0x0078, B:28:0x007c, B:31:0x008c, B:33:0x0097, B:34:0x009c, B:36:0x009e, B:41:0x00ac, B:39:0x00b1, B:44:0x00b5, B:46:0x00c1, B:48:0x00c9, B:52:0x00d8, B:54:0x00e0, B:55:0x00e4, B:57:0x00ef, B:59:0x00ff, B:61:0x0151, B:63:0x015d, B:64:0x0166, B:66:0x01a6, B:67:0x01c2, B:68:0x01b2, B:70:0x01ba, B:71:0x010c, B:72:0x0113, B:73:0x0114, B:75:0x011c, B:77:0x0122, B:80:0x013a, B:82:0x0144, B:83:0x014b), top: B:8:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void saveWebpAttributes(java.io.InputStream r22, java.io.OutputStream r23) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.saveWebpAttributes(java.io.InputStream, java.io.OutputStream):void");
    }

    private void setThumbnailData(androidx.exifinterface.media.b bVar) {
        java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> hashMap = this.mAttributes[4];
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = hashMap.get(TAG_COMPRESSION);
        if (exifAttribute == null) {
            this.mThumbnailCompression = 6;
            handleThumbnailFromJfif(bVar, hashMap);
            return;
        }
        int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
        this.mThumbnailCompression = intValue;
        if (intValue != 1) {
            if (intValue == 6) {
                handleThumbnailFromJfif(bVar, hashMap);
                return;
            } else if (intValue != 7) {
                return;
            }
        }
        if (isSupportedDataType(hashMap)) {
            handleThumbnailFromStrips(bVar, hashMap);
        }
    }

    private static boolean shouldSupportSeek(int i17) {
        return (i17 == 4 || i17 == 9 || i17 == 13 || i17 == 14) ? false : true;
    }

    private void swapBasedOnImageSize(int i17, int i18) {
        if (this.mAttributes[i17].isEmpty() || this.mAttributes[i18].isEmpty()) {
            return;
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = this.mAttributes[i17].get(TAG_IMAGE_LENGTH);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.mAttributes[i17].get(TAG_IMAGE_WIDTH);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute3 = this.mAttributes[i18].get(TAG_IMAGE_LENGTH);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute4 = this.mAttributes[i18].get(TAG_IMAGE_WIDTH);
        if (exifAttribute == null || exifAttribute2 == null || exifAttribute3 == null || exifAttribute4 == null) {
            return;
        }
        int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
        int intValue2 = exifAttribute2.getIntValue(this.mExifByteOrder);
        int intValue3 = exifAttribute3.getIntValue(this.mExifByteOrder);
        int intValue4 = exifAttribute4.getIntValue(this.mExifByteOrder);
        if (intValue >= intValue3 || intValue2 >= intValue4) {
            return;
        }
        java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>[] hashMapArr = this.mAttributes;
        java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> hashMap = hashMapArr[i17];
        hashMapArr[i17] = hashMapArr[i18];
        hashMapArr[i18] = hashMap;
    }

    private static void updateCrcWithInt(java.util.zip.CRC32 crc32, int i17) {
        crc32.update(i17 >>> 24);
        crc32.update(i17 >>> 16);
        crc32.update(i17 >>> 8);
        crc32.update(i17);
    }

    private void updateImageSizeValues(androidx.exifinterface.media.f fVar, int i17) {
        androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort;
        androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort2;
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = this.mAttributes[i17].get(TAG_DEFAULT_CROP_SIZE);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.mAttributes[i17].get(TAG_RW2_SENSOR_TOP_BORDER);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute3 = this.mAttributes[i17].get(TAG_RW2_SENSOR_LEFT_BORDER);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute4 = this.mAttributes[i17].get(TAG_RW2_SENSOR_BOTTOM_BORDER);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute5 = this.mAttributes[i17].get(TAG_RW2_SENSOR_RIGHT_BORDER);
        if (exifAttribute != null) {
            if (exifAttribute.format == 5) {
                androidx.exifinterface.media.e[] eVarArr = (androidx.exifinterface.media.e[]) exifAttribute.getValue(this.mExifByteOrder);
                if (eVarArr == null || eVarArr.length != 2) {
                    java.util.Arrays.toString(eVarArr);
                    return;
                } else {
                    createUShort = androidx.exifinterface.media.ExifInterface.ExifAttribute.createURational(eVarArr[0], this.mExifByteOrder);
                    createUShort2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createURational(eVarArr[1], this.mExifByteOrder);
                }
            } else {
                int[] iArr = (int[]) exifAttribute.getValue(this.mExifByteOrder);
                if (iArr == null || iArr.length != 2) {
                    java.util.Arrays.toString(iArr);
                    return;
                } else {
                    createUShort = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(iArr[0], this.mExifByteOrder);
                    createUShort2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(iArr[1], this.mExifByteOrder);
                }
            }
            this.mAttributes[i17].put(TAG_IMAGE_WIDTH, createUShort);
            this.mAttributes[i17].put(TAG_IMAGE_LENGTH, createUShort2);
            return;
        }
        if (exifAttribute2 == null || exifAttribute3 == null || exifAttribute4 == null || exifAttribute5 == null) {
            retrieveJpegImageSize(fVar, i17);
            return;
        }
        int intValue = exifAttribute2.getIntValue(this.mExifByteOrder);
        int intValue2 = exifAttribute4.getIntValue(this.mExifByteOrder);
        int intValue3 = exifAttribute5.getIntValue(this.mExifByteOrder);
        int intValue4 = exifAttribute3.getIntValue(this.mExifByteOrder);
        if (intValue2 <= intValue || intValue3 <= intValue4) {
            return;
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort3 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(intValue2 - intValue, this.mExifByteOrder);
        androidx.exifinterface.media.ExifInterface.ExifAttribute createUShort4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(intValue3 - intValue4, this.mExifByteOrder);
        this.mAttributes[i17].put(TAG_IMAGE_LENGTH, createUShort3);
        this.mAttributes[i17].put(TAG_IMAGE_WIDTH, createUShort4);
    }

    private void validateImages() {
        swapBasedOnImageSize(0, 5);
        swapBasedOnImageSize(0, 4);
        swapBasedOnImageSize(5, 4);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = this.mAttributes[1].get(TAG_PIXEL_X_DIMENSION);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.mAttributes[1].get(TAG_PIXEL_Y_DIMENSION);
        if (exifAttribute != null && exifAttribute2 != null) {
            this.mAttributes[0].put(TAG_IMAGE_WIDTH, exifAttribute);
            this.mAttributes[0].put(TAG_IMAGE_LENGTH, exifAttribute2);
        }
        if (this.mAttributes[4].isEmpty() && isThumbnail(this.mAttributes[5])) {
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>[] hashMapArr = this.mAttributes;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new java.util.HashMap<>();
        }
        isThumbnail(this.mAttributes[4]);
        replaceInvalidTags(0, "ThumbnailOrientation", TAG_ORIENTATION);
        replaceInvalidTags(0, TAG_THUMBNAIL_IMAGE_LENGTH, TAG_IMAGE_LENGTH);
        replaceInvalidTags(0, TAG_THUMBNAIL_IMAGE_WIDTH, TAG_IMAGE_WIDTH);
        replaceInvalidTags(5, "ThumbnailOrientation", TAG_ORIENTATION);
        replaceInvalidTags(5, TAG_THUMBNAIL_IMAGE_LENGTH, TAG_IMAGE_LENGTH);
        replaceInvalidTags(5, TAG_THUMBNAIL_IMAGE_WIDTH, TAG_IMAGE_WIDTH);
        replaceInvalidTags(4, TAG_ORIENTATION, "ThumbnailOrientation");
        replaceInvalidTags(4, TAG_IMAGE_LENGTH, TAG_THUMBNAIL_IMAGE_LENGTH);
        replaceInvalidTags(4, TAG_IMAGE_WIDTH, TAG_THUMBNAIL_IMAGE_WIDTH);
    }

    private int writeExifSegment(androidx.exifinterface.media.c cVar) {
        androidx.exifinterface.media.d[][] dVarArr = EXIF_TAGS;
        int[] iArr = new int[dVarArr.length];
        int[] iArr2 = new int[dVarArr.length];
        for (androidx.exifinterface.media.d dVar : EXIF_POINTER_TAGS) {
            removeAttribute(dVar.f11185b);
        }
        if (this.mHasThumbnail) {
            if (this.mHasThumbnailStrips) {
                removeAttribute(TAG_STRIP_OFFSETS);
                removeAttribute(TAG_STRIP_BYTE_COUNTS);
            } else {
                removeAttribute(TAG_JPEG_INTERCHANGE_FORMAT);
                removeAttribute(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
            }
        }
        for (int i17 = 0; i17 < EXIF_TAGS.length; i17++) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>> it = this.mAttributes[i17].entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == null) {
                    it.remove();
                }
            }
        }
        if (!this.mAttributes[1].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[1].f11185b, androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (!this.mAttributes[2].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[2].f11185b, androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (!this.mAttributes[3].isEmpty()) {
            this.mAttributes[1].put(EXIF_POINTER_TAGS[3].f11185b, androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (this.mHasThumbnail) {
            if (this.mHasThumbnailStrips) {
                this.mAttributes[4].put(TAG_STRIP_OFFSETS, androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(0, this.mExifByteOrder));
                this.mAttributes[4].put(TAG_STRIP_BYTE_COUNTS, androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(this.mThumbnailLength, this.mExifByteOrder));
            } else {
                this.mAttributes[4].put(TAG_JPEG_INTERCHANGE_FORMAT, androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(0L, this.mExifByteOrder));
                this.mAttributes[4].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(this.mThumbnailLength, this.mExifByteOrder));
            }
        }
        for (int i18 = 0; i18 < EXIF_TAGS.length; i18++) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>> it6 = this.mAttributes[i18].entrySet().iterator();
            int i19 = 0;
            while (it6.hasNext()) {
                int size = it6.next().getValue().size();
                if (size > 4) {
                    i19 += size;
                }
            }
            iArr2[i18] = iArr2[i18] + i19;
        }
        int i27 = 8;
        for (int i28 = 0; i28 < EXIF_TAGS.length; i28++) {
            if (!this.mAttributes[i28].isEmpty()) {
                iArr[i28] = i27;
                i27 += (this.mAttributes[i28].size() * 12) + 2 + 4 + iArr2[i28];
            }
        }
        if (this.mHasThumbnail) {
            if (this.mHasThumbnailStrips) {
                this.mAttributes[4].put(TAG_STRIP_OFFSETS, androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(i27, this.mExifByteOrder));
            } else {
                this.mAttributes[4].put(TAG_JPEG_INTERCHANGE_FORMAT, androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(i27, this.mExifByteOrder));
            }
            this.mThumbnailOffset = i27;
            i27 += this.mThumbnailLength;
        }
        if (this.mMimeType == 4) {
            i27 += 8;
        }
        if (DEBUG) {
            for (int i29 = 0; i29 < EXIF_TAGS.length; i29++) {
                java.lang.String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(iArr[i29]), java.lang.Integer.valueOf(this.mAttributes[i29].size()), java.lang.Integer.valueOf(iArr2[i29]), java.lang.Integer.valueOf(i27));
            }
        }
        if (!this.mAttributes[1].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[1].f11185b, androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(iArr[1], this.mExifByteOrder));
        }
        if (!this.mAttributes[2].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[2].f11185b, androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(iArr[2], this.mExifByteOrder));
        }
        if (!this.mAttributes[3].isEmpty()) {
            this.mAttributes[1].put(EXIF_POINTER_TAGS[3].f11185b, androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(iArr[3], this.mExifByteOrder));
        }
        int i37 = this.mMimeType;
        if (i37 == 4) {
            if (i27 > 65535) {
                throw new java.lang.IllegalStateException("Size of exif data (" + i27 + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
            }
            cVar.i(i27);
            cVar.write(IDENTIFIER_EXIF_APP1);
        } else if (i37 == 13) {
            cVar.b(i27);
            cVar.b(PNG_CHUNK_TYPE_EXIF);
        } else if (i37 == 14) {
            cVar.write(WEBP_CHUNK_TYPE_EXIF);
            cVar.b(i27);
        }
        int size2 = cVar.f11182d.size();
        cVar.c(this.mExifByteOrder == java.nio.ByteOrder.BIG_ENDIAN ? BYTE_ALIGN_MM : BYTE_ALIGN_II);
        cVar.f11183e = this.mExifByteOrder;
        cVar.i(42);
        cVar.f(8L);
        for (int i38 = 0; i38 < EXIF_TAGS.length; i38++) {
            if (!this.mAttributes[i38].isEmpty()) {
                cVar.i(this.mAttributes[i38].size());
                int size3 = iArr[i38] + 2 + (this.mAttributes[i38].size() * 12) + 4;
                for (java.util.Map.Entry<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute> entry : this.mAttributes[i38].entrySet()) {
                    int i39 = sExifTagMapsForWriting[i38].get(entry.getKey()).f11184a;
                    androidx.exifinterface.media.ExifInterface.ExifAttribute value = entry.getValue();
                    int size4 = value.size();
                    cVar.i(i39);
                    cVar.i(value.format);
                    cVar.b(value.numberOfComponents);
                    if (size4 > 4) {
                        cVar.f(size3);
                        size3 += size4;
                    } else {
                        cVar.write(value.bytes);
                        if (size4 < 4) {
                            while (size4 < 4) {
                                cVar.a(0);
                                size4++;
                            }
                        }
                    }
                }
                if (i38 != 0 || this.mAttributes[4].isEmpty()) {
                    cVar.f(0L);
                } else {
                    cVar.f(iArr[4]);
                }
                java.util.Iterator<java.util.Map.Entry<java.lang.String, androidx.exifinterface.media.ExifInterface.ExifAttribute>> it7 = this.mAttributes[i38].entrySet().iterator();
                while (it7.hasNext()) {
                    byte[] bArr = it7.next().getValue().bytes;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.mHasThumbnail) {
            cVar.write(getThumbnailBytes());
        }
        if (this.mMimeType == 14 && i27 % 2 == 1) {
            cVar.a(0);
        }
        cVar.f11183e = java.nio.ByteOrder.BIG_ENDIAN;
        return size2;
    }

    private void writePngExifChunk(androidx.exifinterface.media.c cVar) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        this.mOffsetToExifData = cVar.f11182d.size() + writeExifSegment(new androidx.exifinterface.media.c(byteArrayOutputStream, java.nio.ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.b((int) crc32.getValue());
    }

    private void writePngXmpItxtChunk(androidx.exifinterface.media.c cVar) {
        cVar.b(this.mXmpFromSeparateMarker.bytes.length + 22);
        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
        cVar.b(PNG_CHUNK_TYPE_ITXT);
        updateCrcWithInt(crc32, PNG_CHUNK_TYPE_ITXT);
        byte[] bArr = PNG_ITXT_XMP_KEYWORD;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.mXmpFromSeparateMarker.bytes);
        crc32.update(this.mXmpFromSeparateMarker.bytes);
        cVar.b((int) crc32.getValue());
        this.mFileOnDiskContainsSeparateXmpMarker = true;
    }

    public void flipHorizontally() {
        int i17 = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
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
        setAttribute(TAG_ORIENTATION, java.lang.Integer.toString(i17));
    }

    public void flipVertically() {
        int i17 = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
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
        setAttribute(TAG_ORIENTATION, java.lang.Integer.toString(i17));
    }

    public double getAltitude(double d17) {
        double attributeDouble = getAttributeDouble(TAG_GPS_ALTITUDE, -1.0d);
        int attributeInt = getAttributeInt(TAG_GPS_ALTITUDE_REF, -1);
        if (attributeDouble < 0.0d || attributeInt < 0) {
            return d17;
        }
        return attributeDouble * (attributeInt != 1 ? 1 : -1);
    }

    public java.lang.String getAttribute(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute == null) {
            return null;
        }
        if (!str.equals(TAG_GPS_TIMESTAMP)) {
            if (!RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY.contains(str)) {
                return exifAttribute.getStringValue(this.mExifByteOrder);
            }
            try {
                return java.lang.Double.toString(exifAttribute.getDoubleValue(this.mExifByteOrder));
            } catch (java.lang.NumberFormatException unused) {
                return null;
            }
        }
        int i17 = exifAttribute.format;
        if (i17 != 5 && i17 != 10) {
            return null;
        }
        androidx.exifinterface.media.e[] eVarArr = (androidx.exifinterface.media.e[]) exifAttribute.getValue(this.mExifByteOrder);
        if (eVarArr == null || eVarArr.length != 3) {
            java.util.Arrays.toString(eVarArr);
            return null;
        }
        androidx.exifinterface.media.e eVar = eVarArr[0];
        java.lang.Integer valueOf = java.lang.Integer.valueOf((int) (((float) eVar.f11188a) / ((float) eVar.f11189b)));
        androidx.exifinterface.media.e eVar2 = eVarArr[1];
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf((int) (((float) eVar2.f11188a) / ((float) eVar2.f11189b)));
        androidx.exifinterface.media.e eVar3 = eVarArr[2];
        return java.lang.String.format("%02d:%02d:%02d", valueOf, valueOf2, java.lang.Integer.valueOf((int) (((float) eVar3.f11188a) / ((float) eVar3.f11189b))));
    }

    public byte[] getAttributeBytes(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            return exifAttribute.bytes;
        }
        return null;
    }

    public double getAttributeDouble(java.lang.String str, double d17) {
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute == null) {
            return d17;
        }
        try {
            return exifAttribute.getDoubleValue(this.mExifByteOrder);
        } catch (java.lang.NumberFormatException unused) {
            return d17;
        }
    }

    public int getAttributeInt(java.lang.String str, int i17) {
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute == null) {
            return i17;
        }
        try {
            return exifAttribute.getIntValue(this.mExifByteOrder);
        } catch (java.lang.NumberFormatException unused) {
            return i17;
        }
    }

    public long[] getAttributeRange(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        if (this.mModified) {
            throw new java.lang.IllegalStateException("The underlying file has been modified since being parsed");
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            return new long[]{exifAttribute.bytesOffset, exifAttribute.bytes.length};
        }
        return null;
    }

    public java.lang.Long getDateTime() {
        return parseDateTime(getAttribute(TAG_DATETIME), getAttribute(TAG_SUBSEC_TIME), getAttribute(TAG_OFFSET_TIME));
    }

    public java.lang.Long getDateTimeDigitized() {
        return parseDateTime(getAttribute(TAG_DATETIME_DIGITIZED), getAttribute(TAG_SUBSEC_TIME_DIGITIZED), getAttribute(TAG_OFFSET_TIME_DIGITIZED));
    }

    public java.lang.Long getDateTimeOriginal() {
        return parseDateTime(getAttribute(TAG_DATETIME_ORIGINAL), getAttribute(TAG_SUBSEC_TIME_ORIGINAL), getAttribute(TAG_OFFSET_TIME_ORIGINAL));
    }

    public java.lang.Long getGpsDateTime() {
        java.lang.String attribute = getAttribute(TAG_GPS_DATESTAMP);
        java.lang.String attribute2 = getAttribute(TAG_GPS_TIMESTAMP);
        if (attribute != null && attribute2 != null) {
            java.util.regex.Pattern pattern = NON_ZERO_TIME_PATTERN;
            if (pattern.matcher(attribute).matches() || pattern.matcher(attribute2).matches()) {
                java.lang.String str = attribute + ' ' + attribute2;
                java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
                try {
                    java.util.Date parse = sFormatterPrimary.parse(str, parsePosition);
                    if (parse == null && (parse = sFormatterSecondary.parse(str, parsePosition)) == null) {
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
    public boolean getLatLong(float[] fArr) {
        double[] latLong = getLatLong();
        if (latLong == null) {
            return false;
        }
        fArr[0] = (float) latLong[0];
        fArr[1] = (float) latLong[1];
        return true;
    }

    public int getRotationDegrees() {
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
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

    public byte[] getThumbnail() {
        int i17 = this.mThumbnailCompression;
        if (i17 == 6 || i17 == 7) {
            return getThumbnailBytes();
        }
        return null;
    }

    public android.graphics.Bitmap getThumbnailBitmap() {
        if (!this.mHasThumbnail) {
            return null;
        }
        if (this.mThumbnailBytes == null) {
            this.mThumbnailBytes = getThumbnailBytes();
        }
        int i17 = this.mThumbnailCompression;
        if (i17 == 6 || i17 == 7) {
            byte[] bArr = this.mThumbnailBytes;
            int i18 = this.mThumbnailLength;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        int length = this.mThumbnailBytes.length / 3;
        int[] iArr = new int[length];
        for (int i19 = 0; i19 < length; i19++) {
            byte[] bArr2 = this.mThumbnailBytes;
            int i27 = i19 * 3;
            iArr[i19] = (bArr2[i27] << com.tencent.wxmm.v2encoder.enumCODEC_vcodec2) + 0 + (bArr2[i27 + 1] << 8) + bArr2[i27 + 2];
        }
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute = this.mAttributes[4].get(TAG_THUMBNAIL_IMAGE_LENGTH);
        androidx.exifinterface.media.ExifInterface.ExifAttribute exifAttribute2 = this.mAttributes[4].get(TAG_THUMBNAIL_IMAGE_WIDTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            return null;
        }
        int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
        int intValue2 = exifAttribute2.getIntValue(this.mExifByteOrder);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(config);
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        arrayList2.add(java.lang.Integer.valueOf(intValue2));
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] getThumbnailBytes() {
        /*
            r7 = this;
            boolean r0 = r7.mHasThumbnail
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            byte[] r0 = r7.mThumbnailBytes
            if (r0 == 0) goto Lb
            return r0
        Lb:
            android.content.res.AssetManager$AssetInputStream r0 = r7.mAssetInputStream     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L7f
            if (r0 == 0) goto L27
            boolean r2 = r0.markSupported()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L24
            if (r2 == 0) goto L1a
            r0.reset()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L24
        L18:
            r2 = r1
            goto L48
        L1a:
            androidx.exifinterface.media.g.a(r0)
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
            java.lang.String r0 = r7.mFilename     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L7f
            if (r0 == 0) goto L33
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L7f
            java.lang.String r2 = r7.mFilename     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L7f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L7f
            goto L18
        L33:
            java.io.FileDescriptor r0 = r7.mSeekableFileDescriptor     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L7f
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
            int r4 = r7.mThumbnailOffset     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            int r5 = r7.mOffsetToExifData     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            int r4 = r4 + r5
            r3.a(r4)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            int r4 = r7.mThumbnailLength     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            r3.readFully(r4)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            r7.mThumbnailBytes = r4     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L81
            androidx.exifinterface.media.g.a(r0)
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
            androidx.exifinterface.media.g.a(r1)
            if (r2 == 0) goto L7e
            android.system.Os.close(r2)     // Catch: android.system.ErrnoException -> L7e
        L7e:
            throw r0
        L7f:
            r0 = r1
            r2 = r0
        L81:
            androidx.exifinterface.media.g.a(r0)
            if (r2 == 0) goto L89
            android.system.Os.close(r2)     // Catch: android.system.ErrnoException -> L89
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.getThumbnailBytes():byte[]");
    }

    public long[] getThumbnailRange() {
        if (this.mModified) {
            throw new java.lang.IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.mHasThumbnail) {
            return null;
        }
        if (!this.mHasThumbnailStrips || this.mAreThumbnailStripsConsecutive) {
            return new long[]{this.mThumbnailOffset + this.mOffsetToExifData, this.mThumbnailLength};
        }
        return null;
    }

    public boolean hasAttribute(java.lang.String str) {
        return getExifAttribute(str) != null;
    }

    public boolean hasThumbnail() {
        return this.mHasThumbnail;
    }

    public boolean isFlipped() {
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        return attributeInt == 2 || attributeInt == 7 || attributeInt == 4 || attributeInt == 5;
    }

    public boolean isThumbnailCompressed() {
        if (!this.mHasThumbnail) {
            return false;
        }
        int i17 = this.mThumbnailCompression;
        return i17 == 6 || i17 == 7;
    }

    public void resetOrientation() {
        setAttribute(TAG_ORIENTATION, java.lang.Integer.toString(1));
    }

    public void rotate(int i17) {
        if (i17 % 90 != 0) {
            throw new java.lang.IllegalArgumentException("degree should be a multiple of 90");
        }
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        java.util.List<java.lang.Integer> list = ROTATION_ORDER;
        if (list.contains(java.lang.Integer.valueOf(attributeInt))) {
            int indexOf = (list.indexOf(java.lang.Integer.valueOf(attributeInt)) + (i17 / 90)) % 4;
            r4 = list.get(indexOf + (indexOf < 0 ? 4 : 0)).intValue();
        } else {
            java.util.List<java.lang.Integer> list2 = FLIPPED_ROTATION_ORDER;
            if (list2.contains(java.lang.Integer.valueOf(attributeInt))) {
                int indexOf2 = (list2.indexOf(java.lang.Integer.valueOf(attributeInt)) + (i17 / 90)) % 4;
                r4 = list2.get(indexOf2 + (indexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        setAttribute(TAG_ORIENTATION, java.lang.Integer.toString(r4));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9 A[Catch: all -> 0x0112, Exception -> 0x0115, TryCatch #19 {Exception -> 0x0115, all -> 0x0112, blocks: (B:57:0x00e5, B:59:0x00e9, B:61:0x0101, B:65:0x00f2), top: B:56:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2 A[Catch: all -> 0x0112, Exception -> 0x0115, TryCatch #19 {Exception -> 0x0115, all -> 0x0112, blocks: (B:57:0x00e5, B:59:0x00e9, B:61:0x0101, B:65:0x00f2), top: B:56:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void saveAttributes() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.saveAttributes():void");
    }

    public void setAltitude(double d17) {
        java.lang.String str = d17 >= 0.0d ? "0" : "1";
        setAttribute(TAG_GPS_ALTITUDE, androidx.exifinterface.media.e.a(java.lang.Math.abs(d17)).toString());
        setAttribute(TAG_GPS_ALTITUDE_REF, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:95:0x01ae. Please report as an issue. */
    public void setAttribute(java.lang.String str, java.lang.String str2) {
        androidx.exifinterface.media.d dVar;
        java.lang.String str3;
        int i17;
        java.lang.String str4 = str;
        java.lang.String str5 = str2;
        if (str4 == null) {
            throw new java.lang.NullPointerException("tag shouldn't be null");
        }
        if (TAG_ISO_SPEED_RATINGS.equals(str4)) {
            str4 = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        int i18 = 2;
        java.lang.String str6 = "/";
        int i19 = 1;
        if (str5 != null) {
            if (RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY.contains(str4) && !str5.contains("/")) {
                try {
                    str5 = androidx.exifinterface.media.e.a(java.lang.Double.parseDouble(str2)).toString();
                } catch (java.lang.NumberFormatException unused) {
                    return;
                }
            } else if (str4.equals(TAG_GPS_TIMESTAMP)) {
                java.util.regex.Matcher matcher = GPS_TIMESTAMP_PATTERN.matcher(str5);
                if (!matcher.find()) {
                    return;
                }
                str5 = java.lang.Integer.parseInt(matcher.group(1)) + "/1," + java.lang.Integer.parseInt(matcher.group(2)) + "/1," + java.lang.Integer.parseInt(matcher.group(3)) + "/1";
            } else if (TAG_DATETIME.equals(str4) || TAG_DATETIME_ORIGINAL.equals(str4) || TAG_DATETIME_DIGITIZED.equals(str4)) {
                boolean find = DATETIME_PRIMARY_FORMAT_PATTERN.matcher(str5).find();
                boolean find2 = DATETIME_SECONDARY_FORMAT_PATTERN.matcher(str5).find();
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
        if (TAG_XMP.equals(str4)) {
            boolean z17 = this.mAttributes[0].containsKey(TAG_XMP) || this.mAttributes[5].containsKey(TAG_XMP);
            int xmpHandlingForImageType = getXmpHandlingForImageType(this.mMimeType);
            if ((xmpHandlingForImageType == 2 && (this.mXmpFromSeparateMarker != null || !z17)) || (xmpHandlingForImageType == 3 && !z17)) {
                this.mXmpFromSeparateMarker = str5 != null ? androidx.exifinterface.media.ExifInterface.ExifAttribute.createByte(str5) : null;
                return;
            }
        }
        int i27 = 0;
        while (i27 < EXIF_TAGS.length) {
            if ((i27 != 4 || this.mHasThumbnail) && (dVar = sExifTagMapsForWriting[i27].get(str4)) != null) {
                if (str5 == null) {
                    this.mAttributes[i27].remove(str4);
                } else {
                    android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat = guessDataFormat(str5);
                    int intValue = ((java.lang.Integer) guessDataFormat.first).intValue();
                    int i28 = dVar.f11186c;
                    if (i28 != intValue && i28 != ((java.lang.Integer) guessDataFormat.second).intValue()) {
                        int i29 = dVar.f11187d;
                        if (i29 != -1 && (i29 == ((java.lang.Integer) guessDataFormat.first).intValue() || i29 == ((java.lang.Integer) guessDataFormat.second).intValue())) {
                            i28 = i29;
                        } else if (i28 != i19 && i28 != 7 && i28 != i18) {
                            if (DEBUG) {
                                java.lang.String[] strArr = IFD_FORMAT_NAMES;
                                java.lang.String str7 = strArr[i28];
                                if (i29 != -1) {
                                    new java.lang.StringBuilder(", ").append(strArr[i29]);
                                }
                                java.lang.String str8 = strArr[((java.lang.Integer) guessDataFormat.first).intValue()];
                                if (((java.lang.Integer) guessDataFormat.second).intValue() != -1) {
                                    new java.lang.StringBuilder(", ").append(strArr[((java.lang.Integer) guessDataFormat.second).intValue()]);
                                }
                            }
                        }
                    }
                    switch (i28) {
                        case 1:
                            str3 = str6;
                            i17 = i19;
                            this.mAttributes[i27].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.createByte(str5));
                            break;
                        case 2:
                        case 7:
                            str3 = str6;
                            i17 = i19;
                            this.mAttributes[i27].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(str5));
                            break;
                        case 3:
                            str3 = str6;
                            i17 = i19;
                            java.lang.String[] split = str5.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i37 = 0; i37 < split.length; i37++) {
                                iArr[i37] = java.lang.Integer.parseInt(split[i37]);
                            }
                            this.mAttributes[i27].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort(iArr, this.mExifByteOrder));
                            break;
                        case 4:
                            str3 = str6;
                            i17 = i19;
                            java.lang.String[] split2 = str5.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i38 = 0; i38 < split2.length; i38++) {
                                jArr[i38] = java.lang.Long.parseLong(split2[i38]);
                            }
                            this.mAttributes[i27].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong(jArr, this.mExifByteOrder));
                            break;
                        case 5:
                            java.lang.String[] split3 = str5.split(",", -1);
                            androidx.exifinterface.media.e[] eVarArr = new androidx.exifinterface.media.e[split3.length];
                            int i39 = 0;
                            while (i39 < split3.length) {
                                java.lang.String[] split4 = split3[i39].split(str6, -1);
                                eVarArr[i39] = new androidx.exifinterface.media.e((long) java.lang.Double.parseDouble(split4[0]), (long) java.lang.Double.parseDouble(split4[1]));
                                i39++;
                                str6 = str6;
                            }
                            str3 = str6;
                            i17 = 1;
                            this.mAttributes[i27].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.createURational(eVarArr, this.mExifByteOrder));
                            break;
                        case 9:
                            java.lang.String[] split5 = str5.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i47 = 0; i47 < split5.length; i47++) {
                                iArr2[i47] = java.lang.Integer.parseInt(split5[i47]);
                            }
                            this.mAttributes[i27].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.createSLong(iArr2, this.mExifByteOrder));
                            str3 = str6;
                            i17 = 1;
                            break;
                        case 10:
                            java.lang.String[] split6 = str5.split(",", -1);
                            androidx.exifinterface.media.e[] eVarArr2 = new androidx.exifinterface.media.e[split6.length];
                            int i48 = 0;
                            while (i48 < split6.length) {
                                java.lang.String[] split7 = split6[i48].split(str6, -1);
                                eVarArr2[i48] = new androidx.exifinterface.media.e((long) java.lang.Double.parseDouble(split7[0]), (long) java.lang.Double.parseDouble(split7[i19]));
                                i48++;
                                split6 = split6;
                                i19 = 1;
                            }
                            this.mAttributes[i27].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.createSRational(eVarArr2, this.mExifByteOrder));
                            str3 = str6;
                            i17 = 1;
                            break;
                        case 12:
                            java.lang.String[] split8 = str5.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i49 = 0; i49 < split8.length; i49++) {
                                dArr[i49] = java.lang.Double.parseDouble(split8[i49]);
                            }
                            this.mAttributes[i27].put(str4, androidx.exifinterface.media.ExifInterface.ExifAttribute.createDouble(dArr, this.mExifByteOrder));
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

    public void setDateTime(java.lang.Long l17) {
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
        setAttribute(TAG_DATETIME, sFormatterPrimary.format(new java.util.Date(l17.longValue())));
        setAttribute(TAG_SUBSEC_TIME, l18);
    }

    public void setGpsInfo(android.location.Location location) {
        if (location == null) {
            return;
        }
        setAttribute(TAG_GPS_PROCESSING_METHOD, location.getProvider());
        setLatLong(location.getLatitude(), location.getLongitude());
        setAltitude(location.getAltitude());
        setAttribute(TAG_GPS_SPEED_REF, "K");
        setAttribute(TAG_GPS_SPEED, androidx.exifinterface.media.e.a((location.getSpeed() * ((float) java.util.concurrent.TimeUnit.HOURS.toSeconds(1L))) / 1000.0f).toString());
        java.lang.String[] split = sFormatterPrimary.format(new java.util.Date(location.getTime())).split("\\s+", -1);
        setAttribute(TAG_GPS_DATESTAMP, split[0]);
        setAttribute(TAG_GPS_TIMESTAMP, split[1]);
    }

    public void setLatLong(double d17, double d18) {
        if (d17 < -90.0d || d17 > 90.0d || java.lang.Double.isNaN(d17)) {
            throw new java.lang.IllegalArgumentException("Latitude value " + d17 + " is not valid.");
        }
        if (d18 < -180.0d || d18 > 180.0d || java.lang.Double.isNaN(d18)) {
            throw new java.lang.IllegalArgumentException("Longitude value " + d18 + " is not valid.");
        }
        setAttribute(TAG_GPS_LATITUDE_REF, d17 >= 0.0d ? "N" : LATITUDE_SOUTH);
        setAttribute(TAG_GPS_LATITUDE, convertDecimalDegree(java.lang.Math.abs(d17)));
        setAttribute(TAG_GPS_LONGITUDE_REF, d18 >= 0.0d ? LONGITUDE_EAST : LONGITUDE_WEST);
        setAttribute(TAG_GPS_LONGITUDE, convertDecimalDegree(java.lang.Math.abs(d18)));
    }

    public double[] getLatLong() {
        java.lang.String attribute = getAttribute(TAG_GPS_LATITUDE);
        java.lang.String attribute2 = getAttribute(TAG_GPS_LATITUDE_REF);
        java.lang.String attribute3 = getAttribute(TAG_GPS_LONGITUDE);
        java.lang.String attribute4 = getAttribute(TAG_GPS_LONGITUDE_REF);
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return null;
        }
        try {
            return new double[]{convertRationalLatLonToDouble(attribute, attribute2), convertRationalLatLonToDouble(attribute3, attribute4)};
        } catch (java.lang.IllegalArgumentException unused) {
            java.lang.String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", attribute, attribute2, attribute3, attribute4);
            return null;
        }
    }

    public ExifInterface(java.lang.String str) {
        androidx.exifinterface.media.d[][] dVarArr = EXIF_TAGS;
        this.mAttributes = new java.util.HashMap[dVarArr.length];
        this.mAttributesOffsets = new java.util.HashSet(dVarArr.length);
        this.mExifByteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        if (str != null) {
            initForFilename(str);
            return;
        }
        throw new java.lang.NullPointerException("filename cannot be null");
    }

    public ExifInterface(java.io.FileDescriptor fileDescriptor) {
        boolean z17;
        java.io.FileInputStream fileInputStream;
        java.lang.Throwable th6;
        androidx.exifinterface.media.d[][] dVarArr = EXIF_TAGS;
        this.mAttributes = new java.util.HashMap[dVarArr.length];
        this.mAttributesOffsets = new java.util.HashSet(dVarArr.length);
        this.mExifByteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.mAssetInputStream = null;
            this.mFilename = null;
            if (isSeekableFD(fileDescriptor)) {
                this.mSeekableFileDescriptor = fileDescriptor;
                try {
                    fileDescriptor = android.system.Os.dup(fileDescriptor);
                    z17 = true;
                } catch (java.lang.Exception e17) {
                    throw new java.io.IOException("Failed to duplicate file descriptor", e17);
                }
            } else {
                this.mSeekableFileDescriptor = null;
                z17 = false;
            }
            try {
                fileInputStream = new java.io.FileInputStream(fileDescriptor);
                try {
                    loadAttributes(fileInputStream);
                    androidx.exifinterface.media.g.a(fileInputStream);
                    if (z17) {
                        try {
                            android.system.Os.close(fileDescriptor);
                        } catch (android.system.ErrnoException unused) {
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    th6 = th7;
                    androidx.exifinterface.media.g.a(fileInputStream);
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

    public ExifInterface(java.io.InputStream inputStream) {
        this(inputStream, 0);
    }

    public ExifInterface(java.io.InputStream inputStream, int i17) {
        androidx.exifinterface.media.d[][] dVarArr = EXIF_TAGS;
        this.mAttributes = new java.util.HashMap[dVarArr.length];
        this.mAttributesOffsets = new java.util.HashSet(dVarArr.length);
        this.mExifByteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.mFilename = null;
            boolean z17 = i17 == 1;
            this.mIsExifDataOnly = z17;
            if (z17) {
                this.mAssetInputStream = null;
                this.mSeekableFileDescriptor = null;
            } else if (inputStream instanceof android.content.res.AssetManager.AssetInputStream) {
                this.mAssetInputStream = (android.content.res.AssetManager.AssetInputStream) inputStream;
                this.mSeekableFileDescriptor = null;
            } else {
                if (inputStream instanceof java.io.FileInputStream) {
                    java.io.FileInputStream fileInputStream = (java.io.FileInputStream) inputStream;
                    if (isSeekableFD(fileInputStream.getFD())) {
                        this.mAssetInputStream = null;
                        this.mSeekableFileDescriptor = fileInputStream.getFD();
                    }
                }
                this.mAssetInputStream = null;
                this.mSeekableFileDescriptor = null;
            }
            loadAttributes(inputStream);
            return;
        }
        throw new java.lang.NullPointerException("inputStream cannot be null");
    }
}
