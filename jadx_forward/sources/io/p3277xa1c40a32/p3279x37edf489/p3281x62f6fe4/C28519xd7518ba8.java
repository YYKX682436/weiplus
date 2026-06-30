package io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4;

/* renamed from: io.clipworks.androidplus.media.ImageDecoderUtils */
/* loaded from: classes13.dex */
public class C28519xd7518ba8 {
    private static final java.lang.String TAG = "ImageDecoderUtils";

    /* renamed from: _hellAccFlag_ */
    private byte f70362x7f11beae;

    /* renamed from: io.clipworks.androidplus.media.ImageDecoderUtils$ImageInfo */
    /* loaded from: classes8.dex */
    public static final class ImageInfo {

        /* renamed from: height */
        private int f70364xb7389127;

        /* renamed from: mimeType */
        private java.lang.String f70365xad05ed8e;

        /* renamed from: rotation */
        private int f70366xfd990f7e;

        /* renamed from: width */
        private int f70367x6be2dc6;

        public ImageInfo(java.lang.String str, int i17, int i18, int i19) {
            this.f70365xad05ed8e = str;
            this.f70367x6be2dc6 = i17;
            this.f70364xb7389127 = i18;
            this.f70366xfd990f7e = i19;
        }

        /* renamed from: equals */
        public boolean m136832xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28519xd7518ba8.ImageInfo)) {
                return false;
            }
            io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28519xd7518ba8.ImageInfo imageInfo = (io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28519xd7518ba8.ImageInfo) obj;
            return imageInfo.f70367x6be2dc6 == this.f70367x6be2dc6 && imageInfo.f70364xb7389127 == this.f70364xb7389127 && imageInfo.f70366xfd990f7e == this.f70366xfd990f7e && imageInfo.f70365xad05ed8e.equals(this.f70365xad05ed8e);
        }

        /* renamed from: getHeight */
        public int m136833x1c4fb41d() {
            return this.f70364xb7389127;
        }

        /* renamed from: getMimeType */
        public java.lang.String m136834x28e02b04() {
            return this.f70365xad05ed8e;
        }

        /* renamed from: getRotation */
        public int m136835x79734cf4() {
            return this.f70366xfd990f7e;
        }

        /* renamed from: getWidth */
        public int m136836x755bd410() {
            return this.f70367x6be2dc6;
        }

        /* renamed from: toString */
        public java.lang.String m136837x9616526c() {
            return "ImageInfo{width=" + this.f70367x6be2dc6 + ", height=" + this.f70364xb7389127 + ", rotation=" + this.f70366xfd990f7e + ", mimeType='" + this.f70365xad05ed8e + "'}";
        }
    }

    private C28519xd7518ba8() {
    }

    /* renamed from: decodeImageBuffer */
    public static android.graphics.Bitmap m136822x2c49aead(java.nio.ByteBuffer byteBuffer) {
        return m136823x2c49aead(byteBuffer, -1);
    }

    /* renamed from: decodeImageFile */
    public static android.graphics.Bitmap m136824x964bc729(java.io.File file) {
        return m136825x964bc729(file, -1);
    }

    /* renamed from: decodeImageFileP */
    private static android.graphics.Bitmap m136826x332d1e47(java.io.File file, int i17) {
        return m136828x48fe8288(android.graphics.ImageDecoder.createSource(file), i17);
    }

    /* renamed from: decodeImageFilePreP */
    private static android.graphics.Bitmap m136827x6f7820d6(java.io.File file, int i17) {
        return null;
    }

    /* renamed from: decodeImageSource */
    private static android.graphics.Bitmap m136828x48fe8288(android.graphics.ImageDecoder.Source source, final int i17) {
        return android.graphics.ImageDecoder.decodeBitmap(source, new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: io.clipworks.androidplus.media.ImageDecoderUtils.1
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source2) {
                int max;
                int i18;
                if (i17 > 0) {
                    android.util.Size size = imageInfo.getSize();
                    if (size.getWidth() > i17 || size.getWidth() > i17) {
                        float max2 = i17 / java.lang.Math.max(size.getWidth(), size.getHeight());
                        int max3 = java.lang.Math.max(java.lang.Math.round(size.getWidth() * max2), 1);
                        max = java.lang.Math.max(java.lang.Math.round(size.getHeight() * max2), 1);
                        i18 = max3;
                    } else {
                        i18 = size.getWidth();
                        max = size.getHeight();
                    }
                    imageDecoder.setTargetSize(i18, max);
                    imageDecoder.setAllocator(1);
                }
            }
        });
    }

    /* renamed from: decodeStreamP */
    private static android.graphics.Bitmap m136829x8e2d3f02(java.nio.ByteBuffer byteBuffer, int i17) {
        return m136828x48fe8288(android.graphics.ImageDecoder.createSource(byteBuffer), i17);
    }

    /* renamed from: decodeStreamPreP */
    private static android.graphics.Bitmap m136830x4359023b(java.nio.ByteBuffer byteBuffer, int i17) {
        return null;
    }

    /* renamed from: getImageInfoFromFile */
    public static io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28519xd7518ba8.ImageInfo m136831xfe8d2b59(java.lang.String str) {
        int i17;
        int i18;
        android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
        io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28519xd7518ba8.ImageInfo imageInfo = null;
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                java.lang.String extractMetadata = mediaMetadataRetriever.extractMetadata(12);
                if (extractMetadata.startsWith("image/")) {
                    imageInfo = new io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28519xd7518ba8.ImageInfo(extractMetadata, java.lang.Integer.parseInt(mediaMetadataRetriever.extractMetadata(29)), java.lang.Integer.parseInt(mediaMetadataRetriever.extractMetadata(30)), java.lang.Integer.parseInt(mediaMetadataRetriever.extractMetadata(31)));
                }
            } catch (java.lang.Exception unused) {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(options);
                    arrayList.add(str);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "io/clipworks/androidplus/media/ImageDecoderUtils", "getImageInfoFromFile", "(Ljava/lang/String;)Lio/clipworks/androidplus/media/ImageDecoderUtils$ImageInfo;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                    yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "io/clipworks/androidplus/media/ImageDecoderUtils", "getImageInfoFromFile", "(Ljava/lang/String;)Lio/clipworks/androidplus/media/ImageDecoderUtils$ImageInfo;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                    java.lang.String str2 = options.outMimeType;
                    if (str2 != null && str2.startsWith("image/") && (i17 = options.outWidth) != -1 && (i18 = options.outHeight) != -1) {
                        imageInfo = new io.p3277xa1c40a32.p3279x37edf489.p3281x62f6fe4.C28519xd7518ba8.ImageInfo(options.outMimeType, i17, i18, 0);
                    }
                } catch (java.lang.Exception unused2) {
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (java.lang.Exception unused3) {
                return imageInfo;
            }
        } catch (java.lang.Throwable th6) {
            try {
                mediaMetadataRetriever.release();
            } catch (java.lang.Exception unused4) {
            }
            throw th6;
        }
    }

    /* renamed from: decodeImageBuffer */
    public static android.graphics.Bitmap m136823x2c49aead(java.nio.ByteBuffer byteBuffer, int i17) {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return m136829x8e2d3f02(byteBuffer, i17);
            }
            return m136830x4359023b(byteBuffer, i17);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    /* renamed from: decodeImageFile */
    public static android.graphics.Bitmap m136825x964bc729(java.io.File file, int i17) {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return m136826x332d1e47(file, i17);
            }
            return m136827x6f7820d6(file, i17);
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}
