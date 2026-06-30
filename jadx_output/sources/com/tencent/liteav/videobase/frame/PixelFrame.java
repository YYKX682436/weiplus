package com.tencent.liteav.videobase.frame;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class PixelFrame extends com.tencent.liteav.videobase.frame.i {
    private byte _hellAccFlag_;
    protected java.nio.ByteBuffer mBuffer;
    private com.tencent.liteav.videobase.base.GLConstants.ColorRange mColorRange;
    private com.tencent.liteav.videobase.base.GLConstants.ColorSpace mColorSpace;
    protected com.tencent.liteav.videobase.utils.ConsumerChainTimestamp mConsumerChainTimestamp;
    protected byte[] mData;
    protected java.lang.Object mGLContext;
    protected int mHeight;
    private boolean mIsMirrorHorizontal;
    private boolean mIsMirrorVertical;
    private float[] mMatrix;
    protected com.tencent.liteav.videobase.frame.FrameMetaData mMetaData;
    protected com.tencent.liteav.videobase.base.GLConstants.a mPixelBufferType;
    protected com.tencent.liteav.videobase.base.GLConstants.PixelFormatType mPixelFormatType;
    protected com.tencent.liteav.videobase.utils.ProducerChainTimestamp mProducerChainTimestamp;
    private com.tencent.liteav.base.util.k mRotation;
    protected int mTextureId;
    private long mTimestamp;
    protected int mWidth;

    public PixelFrame() {
        super(null);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mColorRange = com.tencent.liteav.videobase.base.GLConstants.ColorRange.UNKNOWN;
        this.mColorSpace = com.tencent.liteav.videobase.base.GLConstants.ColorSpace.UNKNOWN;
        this.mRotation = com.tencent.liteav.base.util.k.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        this.mProducerChainTimestamp = new com.tencent.liteav.videobase.utils.ProducerChainTimestamp();
        this.mConsumerChainTimestamp = new com.tencent.liteav.videobase.utils.ConsumerChainTimestamp();
    }

    public static com.tencent.liteav.videobase.frame.PixelFrame createFromBitmap(android.graphics.Bitmap bitmap) {
        int width = (bitmap.getWidth() / 2) * 2;
        int height = (bitmap.getHeight() / 2) * 2;
        if (width != 0 && height != 0 && (bitmap.getWidth() % 2 != 0 || bitmap.getHeight() % 2 != 0)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            arrayList.add(0);
            arrayList.add(0);
            arrayList.add(bitmap);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/liteav/videobase/frame/PixelFrame", "createFromBitmap", "(Landroid/graphics/Bitmap;)Lcom/tencent/liteav/videobase/frame/PixelFrame;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
            yj0.a.e(obj, createBitmap, "com/tencent/liteav/videobase/frame/PixelFrame", "createFromBitmap", "(Landroid/graphics/Bitmap;)Lcom/tencent/liteav/videobase/frame/PixelFrame;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            bitmap = createBitmap;
        }
        java.nio.ByteBuffer b17 = com.tencent.liteav.videobase.utils.d.b(bitmap.getWidth() * 4 * bitmap.getHeight());
        if (b17 == null) {
            return null;
        }
        bitmap.copyPixelsToBuffer(b17);
        b17.position(0);
        com.tencent.liteav.videobase.frame.PixelFrame pixelFrame = new com.tencent.liteav.videobase.frame.PixelFrame();
        pixelFrame.setBuffer(b17);
        pixelFrame.setWidth(bitmap.getWidth());
        pixelFrame.setHeight(bitmap.getHeight());
        pixelFrame.setPixelBufferType(com.tencent.liteav.videobase.base.GLConstants.a.BYTE_BUFFER);
        pixelFrame.setPixelFormatType(com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA);
        return pixelFrame;
    }

    private int getColorRangeValue() {
        return this.mColorRange.getValue();
    }

    private int getColorSpaceValue() {
        return this.mColorSpace.getValue();
    }

    private int getPixelBufferTypeValue() {
        return this.mPixelBufferType.mValue;
    }

    private int getPixelFormatTypeValue() {
        return this.mPixelFormatType.getValue();
    }

    private int getRotationValue() {
        return this.mRotation.mValue;
    }

    public static void releasePixelFrames(java.util.Collection<com.tencent.liteav.videobase.frame.PixelFrame> collection) {
        if (collection == null) {
            return;
        }
        for (com.tencent.liteav.videobase.frame.PixelFrame pixelFrame : collection) {
            if (pixelFrame != null) {
                pixelFrame.release();
            }
        }
        collection.clear();
    }

    public void copy(com.tencent.liteav.videobase.frame.PixelFrame pixelFrame) {
        this.mTimestamp = pixelFrame.mTimestamp;
        this.mWidth = pixelFrame.mWidth;
        this.mHeight = pixelFrame.mHeight;
        this.mPixelBufferType = pixelFrame.mPixelBufferType;
        this.mPixelFormatType = pixelFrame.mPixelFormatType;
        this.mRotation = pixelFrame.mRotation;
        this.mIsMirrorHorizontal = pixelFrame.mIsMirrorHorizontal;
        this.mIsMirrorVertical = pixelFrame.mIsMirrorVertical;
        if (pixelFrame.mMatrix != null) {
            this.mMatrix = new float[16];
            float[] matrix = pixelFrame.getMatrix();
            float[] fArr = this.mMatrix;
            java.lang.System.arraycopy(matrix, 0, fArr, 0, fArr.length);
        }
        this.mMatrix = pixelFrame.mMatrix;
        this.mData = pixelFrame.mData;
        this.mBuffer = pixelFrame.mBuffer;
        this.mTextureId = pixelFrame.mTextureId;
        this.mGLContext = pixelFrame.mGLContext;
        this.mMetaData = pixelFrame.mMetaData;
        this.mConsumerChainTimestamp = pixelFrame.mConsumerChainTimestamp;
        this.mProducerChainTimestamp = pixelFrame.mProducerChainTimestamp;
        this.mColorSpace = pixelFrame.mColorSpace;
        this.mColorRange = pixelFrame.mColorRange;
    }

    public java.nio.ByteBuffer getBuffer() {
        return this.mBuffer;
    }

    public com.tencent.liteav.videobase.base.GLConstants.ColorRange getColorRange() {
        return this.mColorRange;
    }

    public com.tencent.liteav.videobase.base.GLConstants.ColorSpace getColorSpace() {
        return this.mColorSpace;
    }

    public com.tencent.liteav.videobase.utils.ConsumerChainTimestamp getConsumerChainTimestamp() {
        if (this.mConsumerChainTimestamp == null) {
            this.mConsumerChainTimestamp = new com.tencent.liteav.videobase.utils.ConsumerChainTimestamp();
        }
        return this.mConsumerChainTimestamp;
    }

    public byte[] getData() {
        return this.mData;
    }

    public java.lang.Object getGLContext() {
        return this.mGLContext;
    }

    public long getGLContextNativeHandle() {
        return com.tencent.liteav.videobase.utils.OpenGlUtils.getGLContextNativeHandle(this.mGLContext);
    }

    public int getHeight() {
        return this.mHeight;
    }

    public float[] getMatrix() {
        return this.mMatrix;
    }

    public com.tencent.liteav.videobase.frame.FrameMetaData getMetaData() {
        return this.mMetaData;
    }

    public com.tencent.liteav.videobase.base.GLConstants.a getPixelBufferType() {
        return this.mPixelBufferType;
    }

    public com.tencent.liteav.videobase.base.GLConstants.PixelFormatType getPixelFormatType() {
        return this.mPixelFormatType;
    }

    public com.tencent.liteav.videobase.utils.ProducerChainTimestamp getProducerChainTimestamp() {
        if (this.mProducerChainTimestamp == null) {
            this.mProducerChainTimestamp = new com.tencent.liteav.videobase.utils.ProducerChainTimestamp();
        }
        return this.mProducerChainTimestamp;
    }

    public com.tencent.liteav.base.util.k getRotation() {
        return this.mRotation;
    }

    public int getTextureId() {
        return this.mTextureId;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean hasTransformParams() {
        return this.mRotation != com.tencent.liteav.base.util.k.NORMAL || this.mIsMirrorHorizontal || this.mIsMirrorVertical || this.mMatrix != null;
    }

    public boolean isFrameDataValid() {
        com.tencent.liteav.videobase.base.GLConstants.a aVar = this.mPixelBufferType;
        if (aVar == com.tencent.liteav.videobase.base.GLConstants.a.TEXTURE_2D && this.mTextureId == -1) {
            return false;
        }
        if (aVar == com.tencent.liteav.videobase.base.GLConstants.a.BYTE_BUFFER && this.mBuffer == null) {
            return false;
        }
        return (aVar == com.tencent.liteav.videobase.base.GLConstants.a.BYTE_ARRAY && this.mData == null) ? false : true;
    }

    public boolean isMirrorHorizontal() {
        return this.mIsMirrorHorizontal;
    }

    public boolean isMirrorVertical() {
        return this.mIsMirrorVertical;
    }

    public void postRotate(com.tencent.liteav.base.util.k kVar) {
        if (kVar == com.tencent.liteav.base.util.k.ROTATION_90 || kVar == com.tencent.liteav.base.util.k.ROTATION_270) {
            swapWidthHeight();
        }
        setRotation(com.tencent.liteav.base.util.k.a((this.mRotation.mValue + kVar.mValue) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1));
    }

    @Override // com.tencent.liteav.videobase.frame.i
    public void release() {
        super.release();
    }

    public void reset() {
        this.mTimestamp = 0L;
        this.mRotation = com.tencent.liteav.base.util.k.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        this.mMetaData = null;
        this.mProducerChainTimestamp = null;
        this.mConsumerChainTimestamp = null;
        this.mColorRange = com.tencent.liteav.videobase.base.GLConstants.ColorRange.UNKNOWN;
        this.mColorSpace = com.tencent.liteav.videobase.base.GLConstants.ColorSpace.UNKNOWN;
    }

    @Override // com.tencent.liteav.videobase.frame.i
    public int retain() {
        return super.retain();
    }

    public void setBuffer(java.nio.ByteBuffer byteBuffer) {
        this.mBuffer = byteBuffer;
    }

    public void setColorRange(com.tencent.liteav.videobase.base.GLConstants.ColorRange colorRange) {
        this.mColorRange = colorRange;
    }

    public void setColorSpace(com.tencent.liteav.videobase.base.GLConstants.ColorSpace colorSpace) {
        this.mColorSpace = colorSpace;
    }

    public void setConsumerChainTimestamp(com.tencent.liteav.videobase.utils.ConsumerChainTimestamp consumerChainTimestamp) {
        this.mConsumerChainTimestamp = consumerChainTimestamp;
    }

    public void setData(byte[] bArr) {
        this.mData = bArr;
    }

    public void setGLContext(java.lang.Object obj) {
        this.mGLContext = obj;
    }

    public void setHeight(int i17) {
        this.mHeight = i17;
    }

    public void setMatrix(float[] fArr) {
        this.mMatrix = fArr;
    }

    public void setMetaData(com.tencent.liteav.videobase.frame.FrameMetaData frameMetaData) {
        this.mMetaData = frameMetaData;
    }

    public void setMirrorHorizontal(boolean z17) {
        this.mIsMirrorHorizontal = z17;
    }

    public void setMirrorVertical(boolean z17) {
        this.mIsMirrorVertical = z17;
    }

    public void setPixelBufferType(com.tencent.liteav.videobase.base.GLConstants.a aVar) {
        this.mPixelBufferType = aVar;
    }

    public void setPixelFormatType(com.tencent.liteav.videobase.base.GLConstants.PixelFormatType pixelFormatType) {
        this.mPixelFormatType = pixelFormatType;
    }

    public void setProducerChainTimestamp(com.tencent.liteav.videobase.utils.ProducerChainTimestamp producerChainTimestamp) {
        this.mProducerChainTimestamp = producerChainTimestamp;
    }

    public void setRotation(com.tencent.liteav.base.util.k kVar) {
        this.mRotation = kVar;
    }

    public void setTextureId(int i17) {
        this.mTextureId = i17;
    }

    public void setTimestamp(long j17) {
        this.mTimestamp = j17;
    }

    public void setWidth(int i17) {
        this.mWidth = i17;
    }

    public void swapWidthHeight() {
        int i17 = this.mWidth;
        this.mWidth = this.mHeight;
        this.mHeight = i17;
    }

    public PixelFrame(com.tencent.liteav.videobase.frame.PixelFrame pixelFrame) {
        super(null);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mColorRange = com.tencent.liteav.videobase.base.GLConstants.ColorRange.UNKNOWN;
        this.mColorSpace = com.tencent.liteav.videobase.base.GLConstants.ColorSpace.UNKNOWN;
        this.mRotation = com.tencent.liteav.base.util.k.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        this.mProducerChainTimestamp = new com.tencent.liteav.videobase.utils.ProducerChainTimestamp();
        this.mConsumerChainTimestamp = new com.tencent.liteav.videobase.utils.ConsumerChainTimestamp();
        copy(pixelFrame);
    }

    public PixelFrame(int i17, int i18, int i19, int i27, int i28) {
        this(null, i17, i18, i19, com.tencent.liteav.videobase.base.GLConstants.a.a(i27), com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.a(i28));
    }

    public PixelFrame(com.tencent.liteav.videobase.frame.g<com.tencent.liteav.videobase.frame.PixelFrame> gVar, int i17, int i18, com.tencent.liteav.videobase.base.GLConstants.a aVar, com.tencent.liteav.videobase.base.GLConstants.PixelFormatType pixelFormatType) {
        this(gVar, i17, i18, pixelFormatType == com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA ? i17 * i18 * 4 : ((i17 * i18) * 3) / 2, aVar, pixelFormatType);
    }

    public PixelFrame(com.tencent.liteav.videobase.frame.g<com.tencent.liteav.videobase.frame.PixelFrame> gVar, int i17, int i18, int i19, com.tencent.liteav.videobase.base.GLConstants.a aVar, com.tencent.liteav.videobase.base.GLConstants.PixelFormatType pixelFormatType) {
        super(gVar);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mColorRange = com.tencent.liteav.videobase.base.GLConstants.ColorRange.UNKNOWN;
        this.mColorSpace = com.tencent.liteav.videobase.base.GLConstants.ColorSpace.UNKNOWN;
        this.mRotation = com.tencent.liteav.base.util.k.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        this.mProducerChainTimestamp = new com.tencent.liteav.videobase.utils.ProducerChainTimestamp();
        this.mConsumerChainTimestamp = new com.tencent.liteav.videobase.utils.ConsumerChainTimestamp();
        this.mWidth = i17;
        this.mHeight = i18;
        this.mPixelFormatType = pixelFormatType;
        this.mPixelBufferType = aVar;
        if (aVar == com.tencent.liteav.videobase.base.GLConstants.a.BYTE_ARRAY) {
            this.mData = com.tencent.liteav.videobase.utils.d.a(i19);
        } else {
            this.mBuffer = com.tencent.liteav.videobase.utils.d.b(i19);
        }
    }

    public PixelFrame(com.tencent.liteav.videobase.frame.g<? extends com.tencent.liteav.videobase.frame.PixelFrame> gVar) {
        super(gVar);
        this.mTimestamp = 0L;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mColorRange = com.tencent.liteav.videobase.base.GLConstants.ColorRange.UNKNOWN;
        this.mColorSpace = com.tencent.liteav.videobase.base.GLConstants.ColorSpace.UNKNOWN;
        this.mRotation = com.tencent.liteav.base.util.k.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        this.mProducerChainTimestamp = new com.tencent.liteav.videobase.utils.ProducerChainTimestamp();
        this.mConsumerChainTimestamp = new com.tencent.liteav.videobase.utils.ConsumerChainTimestamp();
    }
}
