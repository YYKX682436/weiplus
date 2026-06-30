package com.tencent.mm.compatible.util;

/* loaded from: classes4.dex */
public class Exif {
    public static final int PARSE_EXIF_ERROR_CORRUPT = 1985;
    public static final int PARSE_EXIF_ERROR_NO_EXIF = 1983;
    public static final int PARSE_EXIF_ERROR_NO_JPEG = 1982;
    public static final int PARSE_EXIF_ERROR_UNKNOWN_BYTEALIGN = 1984;
    public static final int PARSE_EXIF_SUCCESS = 0;
    private static final java.lang.String TAG = "MicroMsg.Exif";
    public double apertureValue;
    public short bitsPerSample;
    public double brightnessValue;
    public java.lang.String copyright;
    public java.lang.String dateTime;
    public java.lang.String dateTimeDigitized;
    public java.lang.String dateTimeOriginal;
    public double exposureBiasValue;
    public double exposureTime;
    public double fNumber;
    public int fileSource;
    public byte flash;
    public double focalLength;
    public short focalLengthIn35mm;
    public java.lang.String imageDescription;
    public int imageHeight;
    public int imageWidth;
    public short isoSpeedRatings;
    public java.lang.String lensModel;
    private androidx.exifinterface.media.ExifInterface mExif;
    public java.lang.String make;
    public double maxApertureValue;
    public short meteringMode;
    public java.lang.String model;
    public short orientation;
    public int resolutionX;
    public int resolutionY;
    public int sceneType;
    public double shutterSpeedValue;
    public java.lang.String software;
    public java.lang.String subSecTimeOriginal;
    public double subjectDistance;
    public int whiteBalance;
    public java.lang.String yCbCrSubSampling;
    public double latitude = -1.0d;
    public double longitude = -1.0d;
    public double altitude = 0.0d;

    public static com.tencent.mm.compatible.util.Exif fromFile(java.lang.String str) {
        com.tencent.mm.compatible.util.Exif exif = new com.tencent.mm.compatible.util.Exif();
        exif.parseFromFile(str);
        return exif;
    }

    public static com.tencent.mm.compatible.util.Exif fromStream(java.io.InputStream inputStream) {
        com.tencent.mm.compatible.util.Exif exif = new com.tencent.mm.compatible.util.Exif();
        exif.parseFromStream(inputStream);
        return exif;
    }

    private void readExifFromInterface() {
        androidx.exifinterface.media.ExifInterface exifInterface = this.mExif;
        if (exifInterface == null) {
            return;
        }
        this.imageDescription = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_DESCRIPTION);
        this.make = this.mExif.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_MAKE);
        this.model = this.mExif.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_MODEL);
        this.orientation = (short) this.mExif.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
        this.bitsPerSample = (short) this.mExif.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_BITS_PER_SAMPLE, 0);
        this.software = this.mExif.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_SOFTWARE);
        this.dateTime = this.mExif.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME);
        this.dateTimeOriginal = this.mExif.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL);
        this.dateTimeDigitized = this.mExif.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED);
        this.subSecTimeOriginal = this.mExif.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL);
        this.copyright = this.mExif.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_COPYRIGHT);
        this.exposureTime = this.mExif.getAttributeDouble(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, 0.0d);
        this.fNumber = this.mExif.getAttributeDouble(androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, 0.0d);
        this.isoSpeedRatings = (short) this.mExif.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_RATINGS, 0);
        this.brightnessValue = this.mExif.getAttributeDouble(androidx.exifinterface.media.ExifInterface.TAG_BRIGHTNESS_VALUE, 0.0d);
        this.apertureValue = this.mExif.getAttributeDouble(androidx.exifinterface.media.ExifInterface.TAG_APERTURE_VALUE, 0.0d);
        this.maxApertureValue = this.mExif.getAttributeDouble(androidx.exifinterface.media.ExifInterface.TAG_MAX_APERTURE_VALUE, 0.0d);
        this.exposureBiasValue = this.mExif.getAttributeDouble(androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_BIAS_VALUE, 0.0d);
        this.subjectDistance = this.mExif.getAttributeDouble(androidx.exifinterface.media.ExifInterface.TAG_SUBJECT_DISTANCE, 0.0d);
        this.shutterSpeedValue = this.mExif.getAttributeDouble(androidx.exifinterface.media.ExifInterface.TAG_SHUTTER_SPEED_VALUE, 0.0d);
        this.focalLength = this.mExif.getAttributeDouble(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH, 0.0d);
        this.meteringMode = (short) this.mExif.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_METERING_MODE, 0);
        this.whiteBalance = this.mExif.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_WHITE_BALANCE, 0);
        this.lensModel = this.mExif.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_LENS_MODEL);
        this.isoSpeedRatings = (short) this.mExif.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_RATINGS, 0);
        this.flash = (byte) this.mExif.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_FLASH, 0);
        this.imageWidth = this.mExif.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, 0);
        this.imageHeight = this.mExif.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, 0);
        this.resolutionX = this.mExif.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_X_RESOLUTION, 72);
        this.resolutionY = this.mExif.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_Y_RESOLUTION, 72);
        this.fileSource = this.mExif.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_FILE_SOURCE, 0);
        this.sceneType = this.mExif.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_SCENE_TYPE, 0);
        double[] latLong = this.mExif.getLatLong();
        if (latLong != null) {
            this.latitude = latLong[0];
            this.longitude = latLong[1];
        }
        this.altitude = this.mExif.getAltitude(0.0d);
    }

    public fp.n getGlobalLocation() {
        double[] latLong;
        androidx.exifinterface.media.ExifInterface exifInterface = this.mExif;
        if (exifInterface == null || (latLong = exifInterface.getLatLong()) == null) {
            return null;
        }
        return new fp.n(latLong[0], latLong[1], this.altitude);
    }

    public fp.n getLocation() {
        double d17 = this.latitude;
        if (d17 < 0.0d) {
            return null;
        }
        double d18 = this.longitude;
        if (d18 < 0.0d) {
            return null;
        }
        return new fp.n(d17, d18, this.altitude);
    }

    public int getOrientationInDegree() {
        androidx.exifinterface.media.ExifInterface exifInterface = this.mExif;
        if (exifInterface != null) {
            return exifInterface.getRotationDegrees();
        }
        short s17 = this.orientation;
        if (s17 == 3) {
            return 180;
        }
        if (s17 != 6) {
            return s17 != 8 ? 0 : 270;
        }
        return 90;
    }

    public int getRawOrientation() {
        androidx.exifinterface.media.ExifInterface exifInterface = this.mExif;
        if (exifInterface != null) {
            return exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
        }
        return 0;
    }

    public long getUxtimeDatatimeOriginal() {
        try {
            if (this.dateTimeOriginal == null) {
                return 0L;
            }
            return new java.text.SimpleDateFormat("yyyy:MM:dd HH:mm:ss").parse(this.dateTimeOriginal).getTime() / 1000;
        } catch (java.text.ParseException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return 0L;
        }
    }

    public int parseFrom(byte[] bArr) {
        return parseFromStream(new java.io.ByteArrayInputStream(bArr));
    }

    public int parseFromFile(java.lang.String str) {
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = com.tencent.mm.vfs.w6.E(str);
                this.mExif = new androidx.exifinterface.media.ExifInterface(inputStream);
                readExifFromInterface();
                return 0;
            } finally {
                com.tencent.mm.sdk.platformtools.t8.v1(null);
            }
        } catch (java.lang.OutOfMemoryError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "parseFromFile", new java.lang.Object[0]);
            return 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w(TAG, "Cannot read EXIF from file '%s': %s", str, th6.getMessage());
            com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
            return -1;
        }
    }

    public int parseFromStream(java.io.InputStream inputStream) {
        try {
            this.mExif = new androidx.exifinterface.media.ExifInterface(inputStream);
            readExifFromInterface();
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(TAG, "Cannot read EXIF from stream '%s': %s", inputStream, e17.getMessage());
            return -1;
        }
    }

    public int parseFrom(byte[] bArr, int i17, int i18) {
        return parseFromStream(new java.io.ByteArrayInputStream(bArr, i17, i18));
    }
}
