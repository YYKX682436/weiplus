package com.davemorrissey.labs.subscaleview.view;

/* loaded from: classes15.dex */
public class SubsamplingScaleImageView extends android.view.View {
    public static final int EASE_IN_OUT_QUAD = 2;
    public static final int EASE_OUT_QUAD = 1;
    private static final int MAX_TILE_SIZE = 10000;
    private static final int MESSAGE_LONG_CLICK = 1;
    public static final int ORIENTATION_0 = 0;
    public static final int ORIENTATION_180 = 180;
    public static final int ORIENTATION_270 = 270;
    public static final int ORIENTATION_90 = 90;
    public static final int ORIENTATION_USE_EXIF = -1;
    public static final int ORIGIN_ANIM = 1;
    public static final int ORIGIN_DOUBLE_TAP_ZOOM = 4;
    public static final int ORIGIN_FLING = 3;
    public static final int ORIGIN_TOUCH = 2;
    public static final int PAN_LIMIT_CENTER = 3;
    public static final int PAN_LIMIT_INSIDE = 1;
    public static final int PAN_LIMIT_OUTSIDE = 2;
    public static final int SCALE_TYPE_CENTER_CROP = 2;
    public static final int SCALE_TYPE_CENTER_INSIDE = 1;
    public static final int SCALE_TYPE_CUSTOM = 3;
    public static final int SCALE_TYPE_START = 4;
    public static int TILE_SIZE_AUTO = 0;
    private static final java.util.List<java.lang.Integer> VALID_EASING_STYLES;
    private static final java.util.List<java.lang.Integer> VALID_ORIENTATIONS;
    private static final java.util.List<java.lang.Integer> VALID_PAN_LIMITS;
    private static final java.util.List<java.lang.Integer> VALID_SCALE_TYPES;
    private static final java.util.List<java.lang.Integer> VALID_ZOOM_STYLES;
    public static final int ZOOM_FOCUS_CENTER = 2;
    public static final int ZOOM_FOCUS_CENTER_IMMEDIATE = 3;
    public static final int ZOOM_FOCUS_FIXED = 1;
    private static final boolean isUsingZoomOpt;
    private static com.davemorrissey.labs.subscaleview.model.IBitmapLoaderFactory mBitmapLoader = null;
    public static com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.IReporter mReporter = null;
    private static com.davemorrissey.labs.subscaleview.model.ITileInitLoaderFactory mTileInitLoader = null;
    private static com.davemorrissey.labs.subscaleview.model.ITileLoaderFactory mTileLoader = null;
    private static final float needScaleRate = 0.7f;
    private static android.graphics.Bitmap.Config preferredBitmapConfig;
    private static final int reportRate;
    public boolean IsinternalTouchEventConsumed;
    private final java.lang.String TAG;
    private byte _hellAccFlag_;
    private boolean allowInterceptTouch;
    private com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.Anim anim;
    private float animationProgress;
    private float animationScale;
    private android.graphics.Bitmap bitmap;
    private com.davemorrissey.labs.subscaleview.decoder.DecoderFactory<? extends com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder> bitmapDecoderFactory;
    private boolean bitmapIsCached;
    private boolean bitmapIsPreview;
    private android.graphics.Paint bitmapPaint;
    private boolean canDrawPreview;
    private boolean canRefresh;
    private boolean cancelled;
    private boolean debug;
    private android.graphics.Paint debugLinePaint;
    private android.graphics.Paint debugTextPaint;
    private com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder decoder;
    private final java.util.concurrent.locks.ReadWriteLock decoderLock;
    private float density;
    private android.view.GestureDetector detector;
    private int doubleTapZoomDuration;
    private float doubleTapZoomScale;
    private int doubleTapZoomStyle;
    private float[] dstArray;
    private final android.graphics.Rect dstRect;
    private boolean eagerLoadingEnabled;
    private boolean enableZoomToNormal;
    private boolean enter;
    private java.util.concurrent.Executor executor;
    private boolean fitWidth;
    private android.graphics.Bitmap fullImageBitmap;
    private int fullImageSampleSize;
    private long fullImageTileLoadedEnd;
    private long fullImageTileLoadedStart;
    private android.view.GestureDetector.SimpleOnGestureListener gestureDetectorListener;
    private android.os.Handler handler;
    private boolean horizontalLong;
    private boolean ignoreCancelEvent;
    private boolean imageLoadedSent;
    private boolean isFirstLoadFullImage;
    private boolean isPanning;
    private boolean isPreviewLoaded;
    private boolean isQuickScaling;
    private boolean isSwipingXEdge;
    private boolean isSwipingYDown;
    private boolean isSwipingYEdge;
    private boolean isZooming;
    private android.view.MotionEvent lastMotionEvent;
    private boolean mDrawFullSampleSizeBitmap;
    private android.graphics.Matrix mDrawableMatrix;
    private com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.EdgeSwipeListener mEdgeSwipeListener;
    private float mHeightScale;
    private com.davemorrissey.labs.subscaleview.performance.ImageDecodeRecord mImageDecodeRecord;
    private com.davemorrissey.labs.subscaleview.view.ImageSource mMainImageSource;
    private float mMaxZoomScale;
    private boolean mNeedPendingScale;
    private boolean mNeedScaleAndCenterWhenImageLoaded;
    private boolean mPreviewDone;
    private float mPreviewHeightScaleRate;
    private float mPreviewScaleRate;
    private com.davemorrissey.labs.subscaleview.view.ImageSource mPreviewSource;
    private float mPreviewWidthScaleRate;
    public float mScaleRate;
    private float mScreenExtraScale;
    private android.graphics.Matrix mSuppMatrix;
    private java.util.LinkedList<com.davemorrissey.labs.subscaleview.model.ILoadable> mTileLoadTaskList;
    private int mViewHeight;
    private int mViewWidth;
    private float mWidthScale;
    private android.graphics.Matrix matrix;
    private float[] matrixValues;
    private float maxScale;
    private int maxTileHeight;
    private int maxTileWidth;
    private int maxTouchCount;
    private float minScale;
    private int minimumScaleType;
    private int minimumTileDpi;
    private android.view.View.OnAttachStateChangeListener onAttachStateChangeListener;
    private android.view.GestureDetector.OnDoubleTapListener onDoubleTapListener;
    private com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener onImageEventListener;
    private android.view.View.OnLongClickListener onLongClickListener;
    private com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener onStateChangedListener;
    private android.view.View.OnTouchListener onTouchListener;
    private boolean openHardware;
    private int orientation;
    private android.graphics.Rect pRegion;
    private boolean panEnabled;
    private int panLimit;
    private java.lang.Float pendingScale;
    private int previewHeight;
    private int previewOrientation;
    private int previewRotateFlip;
    private int previewWidth;
    private boolean quickScaleEnabled;
    private float quickScaleLastDistance;
    private boolean quickScaleMoved;
    private android.graphics.PointF quickScaleSCenter;
    private final float quickScaleThreshold;
    private android.graphics.PointF quickScaleVLastPoint;
    private android.graphics.PointF quickScaleVStart;
    private int rawExifOrientation;
    private boolean readySent;
    private com.davemorrissey.labs.subscaleview.decoder.DecoderFactory<? extends com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder> regionDecoderFactory;
    private int sHeight;
    private int sOrientation;
    private android.graphics.PointF sPendingCenter;
    private android.graphics.RectF sRect;
    private android.graphics.Rect sRegion;
    private android.graphics.PointF sRequestedCenter;
    private int sWidth;
    private com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleAndTranslate satTemp;
    public float scale;
    private com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleChangeReportListener scaleChangeReportListener;
    private float scaleStart;
    private android.view.GestureDetector singleDetector;
    private float[] srcArray;
    private final android.graphics.Rect srcRect;
    private android.graphics.Paint tileBgPaint;
    private java.util.Map<java.lang.Integer, java.util.List<com.davemorrissey.labs.subscaleview.model.Tile>> tileMap;
    private float tmpScale;
    private android.net.Uri uri;
    private android.graphics.PointF vCenterStart;
    private float vDistStart;
    private android.graphics.PointF vResetCenter;
    public android.graphics.PointF vTranslate;
    private android.graphics.PointF vTranslateBefore;
    private android.graphics.PointF vTranslateStart;
    private final float[] values;
    private boolean verticalLong;
    private float x_down;
    private float y_down;
    private boolean zoomEnabled;
    private int zoomScaleDuration;

    /* loaded from: classes15.dex */
    public static class Anim {
        private long duration;
        private int easing;
        private boolean interruptible;
        private com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnAnimationEventListener listener;
        private int origin;
        private android.graphics.PointF sCenterEnd;
        private android.graphics.PointF sCenterEndRequested;
        private android.graphics.PointF sCenterStart;
        private float scaleEnd;
        private float scaleStart;
        private long time;
        private android.graphics.PointF vFocusEnd;
        private android.graphics.PointF vFocusStart;

        private Anim() {
            this.duration = 200L;
            this.interruptible = true;
            this.easing = 2;
            this.origin = 1;
            this.time = java.lang.System.currentTimeMillis();
        }
    }

    /* loaded from: classes15.dex */
    public static class DefaultOnAnimationEventListener implements com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnAnimationEventListener {
        @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnAnimationEventListener
        public void onComplete() {
        }

        @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnAnimationEventListener
        public void onInterruptedByNewAnim() {
        }

        @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnAnimationEventListener
        public void onInterruptedByUser() {
        }
    }

    /* loaded from: classes12.dex */
    public static class DefaultOnImageEventListener implements com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener {
        @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
        public void onImageLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
        }

        @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
        public void onImageLoaded(android.graphics.Bitmap bitmap) {
        }

        @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
        public void onPreviewLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
        }

        @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
        public void onPreviewLoaded() {
        }

        @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
        public void onPreviewReleased() {
        }

        @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
        public void onReady() {
        }

        @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
        public void onTileLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
        }
    }

    /* loaded from: classes15.dex */
    public static class DefaultOnStateChangedListener implements com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener {
        @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener
        public void onCenterChanged(android.graphics.PointF pointF, int i17) {
        }

        @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener
        public void onScaleChanged(float f17, float f18, int i17) {
        }

        @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener
        public void onScaleFinish(float f17) {
        }
    }

    /* loaded from: classes15.dex */
    public interface EdgeSwipeListener {
        void onSwipeXEdge(android.view.MotionEvent motionEvent);

        void onSwipeXEdgeEnd(android.view.MotionEvent motionEvent);

        void onSwipeYEdge(android.view.MotionEvent motionEvent, boolean z17);

        void onSwipeYEdgeEnd(android.view.MotionEvent motionEvent, boolean z17);

        void onSwipeYEdgeStart(android.view.MotionEvent motionEvent, boolean z17);
    }

    /* loaded from: classes15.dex */
    public interface IReporter {
        void report(boolean z17, long j17, long j18);
    }

    /* loaded from: classes15.dex */
    public interface OnAnimationEventListener {
        void onComplete();

        void onInterruptedByNewAnim();

        void onInterruptedByUser();
    }

    /* loaded from: classes15.dex */
    public interface OnImageEventListener {
        void onImageLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult);

        void onImageLoaded(android.graphics.Bitmap bitmap);

        void onPreviewLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult);

        void onPreviewLoaded();

        void onPreviewReleased();

        void onReady();

        void onTileLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult);
    }

    /* loaded from: classes15.dex */
    public interface OnStateChangedListener {
        void onCenterChanged(android.graphics.PointF pointF, int i17);

        void onScaleChanged(float f17, float f18, int i17);

        void onScaleFinish(float f17);
    }

    /* loaded from: classes15.dex */
    public static class ScaleAndTranslate {
        private float scale;
        private android.graphics.PointF vTranslate;

        private ScaleAndTranslate(float f17, android.graphics.PointF pointF) {
            this.scale = f17;
            this.vTranslate = pointF;
        }
    }

    /* loaded from: classes15.dex */
    public interface ScaleChangeReportListener {
        void onDoubleClickScale(float f17);

        void onFingerScaleEnd(float f17);
    }

    static {
        isUsingZoomOpt = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigImageGalleryZoomOptimization()) == 1;
        reportRate = java.lang.Integer.parseInt(j62.e.g().f(new com.tencent.mm.repairer.config.chatting.RepairerConfigImageGalleryZoomOptimizationReportRate()));
        VALID_ORIENTATIONS = java.util.Arrays.asList(0, 90, 180, 270, -1);
        VALID_ZOOM_STYLES = java.util.Arrays.asList(1, 2, 3);
        VALID_EASING_STYLES = java.util.Arrays.asList(2, 1);
        VALID_PAN_LIMITS = java.util.Arrays.asList(1, 2, 3);
        VALID_SCALE_TYPES = java.util.Arrays.asList(2, 1, 3, 4);
        TILE_SIZE_AUTO = Integer.MAX_VALUE;
        preferredBitmapConfig = android.graphics.Bitmap.Config.ARGB_8888;
        mBitmapLoader = new com.davemorrissey.labs.subscaleview.legacy.LegacyBitmapLoaderFactory();
        mTileLoader = new com.davemorrissey.labs.subscaleview.legacy.LegacyTileLoaderFactory();
        mTileInitLoader = new com.davemorrissey.labs.subscaleview.legacy.LegacyTileInitLoaderFactory();
        mReporter = null;
    }

    public SubsamplingScaleImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        java.lang.Class cls;
        int resourceId;
        java.lang.String string;
        this.TAG = "SubsamplingScaleImageView" + hashCode();
        this.isFirstLoadFullImage = true;
        this.fullImageTileLoadedStart = -1L;
        this.fullImageTileLoadedEnd = -1L;
        this.verticalLong = false;
        this.horizontalLong = false;
        this.debug = false;
        this.orientation = -1;
        this.maxScale = 2.0f;
        this.minScale = minScale();
        this.minimumTileDpi = -1;
        this.panLimit = 1;
        this.minimumScaleType = 3;
        int i17 = TILE_SIZE_AUTO;
        this.maxTileWidth = i17;
        this.maxTileHeight = i17;
        boolean z17 = isUsingZoomOpt;
        this.eagerLoadingEnabled = !z17;
        this.panEnabled = true;
        this.zoomEnabled = true;
        this.quickScaleEnabled = true;
        this.doubleTapZoomScale = 2.0f;
        this.doubleTapZoomStyle = 1;
        this.doubleTapZoomDuration = 200;
        this.zoomScaleDuration = 200;
        this.canRefresh = true;
        this.onDoubleTapListener = null;
        this.scaleChangeReportListener = null;
        this.allowInterceptTouch = true;
        this.ignoreCancelEvent = false;
        this.lastMotionEvent = null;
        this.matrixValues = new float[9];
        this.tmpScale = 0.0f;
        this.previewOrientation = 0;
        this.previewRotateFlip = 0;
        this.rawExifOrientation = -1;
        this.decoderLock = new java.util.concurrent.locks.ReentrantReadWriteLock(true);
        cls = com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.class;
        this.bitmapDecoderFactory = new com.davemorrissey.labs.subscaleview.decoder.CompatDecoderFactory(z17 ? cls : com.davemorrissey.labs.subscaleview.decoder.SkiaImageRegionDecoder.class);
        this.regionDecoderFactory = new com.davemorrissey.labs.subscaleview.decoder.CompatDecoderFactory(z17 ? com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder.class : com.davemorrissey.labs.subscaleview.decoder.SkiaImageRegionDecoder.class);
        this.matrix = new android.graphics.Matrix();
        this.srcArray = new float[8];
        this.dstArray = new float[8];
        this.mTileLoadTaskList = new java.util.LinkedList<>();
        this.cancelled = false;
        this.executor = android.os.AsyncTask.THREAD_POOL_EXECUTOR;
        this.mScreenExtraScale = 1.0f;
        this.mMaxZoomScale = 20.0f;
        this.mPreviewDone = true;
        this.mDrawFullSampleSizeBitmap = false;
        this.mNeedScaleAndCenterWhenImageLoaded = false;
        this.animationProgress = 1.0f;
        this.animationScale = 1.0f;
        this.enter = true;
        this.fitWidth = false;
        this.enableZoomToNormal = false;
        this.mImageDecodeRecord = new com.davemorrissey.labs.subscaleview.performance.ImageDecodeRecord();
        this.mEdgeSwipeListener = new com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.EdgeSwipeListener() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.1
            @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.EdgeSwipeListener
            public void onSwipeXEdge(android.view.MotionEvent motionEvent) {
            }

            @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.EdgeSwipeListener
            public void onSwipeXEdgeEnd(android.view.MotionEvent motionEvent) {
            }

            @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.EdgeSwipeListener
            public void onSwipeYEdge(android.view.MotionEvent motionEvent, boolean z18) {
            }

            @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.EdgeSwipeListener
            public void onSwipeYEdgeEnd(android.view.MotionEvent motionEvent, boolean z18) {
            }

            @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.EdgeSwipeListener
            public void onSwipeYEdgeStart(android.view.MotionEvent motionEvent, boolean z18) {
            }
        };
        this.isSwipingXEdge = false;
        this.isSwipingYEdge = false;
        this.isSwipingYDown = false;
        this.openHardware = false;
        this.IsinternalTouchEventConsumed = true;
        this.srcRect = new android.graphics.Rect();
        this.dstRect = new android.graphics.Rect();
        this.values = new float[9];
        this.density = getResources().getDisplayMetrics().density;
        setDoubleTapZoomScale(2.0f);
        setMinimumTileDpi(com.tencent.mapsdk.internal.km.f50100e);
        setGestureDetector(context);
        initImageView();
        this.handler = new android.os.Handler(new android.os.Handler.Callback() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(android.os.Message message) {
                if (message.what == 1 && com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.onLongClickListener != null) {
                    com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.maxTouchCount = 0;
                    com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this;
                    com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.super.setOnLongClickListener(subsamplingScaleImageView.onLongClickListener);
                    com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.performLongClick();
                    com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.super.setOnLongClickListener(null);
                }
                return true;
            }
        });
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.davemorrissey.labs.subscaleview.R.styleable.SubsamplingScaleImageView);
            if (obtainStyledAttributes.hasValue(com.davemorrissey.labs.subscaleview.R.styleable.SubsamplingScaleImageView_assetName) && (string = obtainStyledAttributes.getString(com.davemorrissey.labs.subscaleview.R.styleable.SubsamplingScaleImageView_assetName)) != null && string.length() > 0) {
                setImage(com.davemorrissey.labs.subscaleview.view.ImageSource.asset(string).tilingEnabled());
            }
            if (obtainStyledAttributes.hasValue(com.davemorrissey.labs.subscaleview.R.styleable.SubsamplingScaleImageView_src) && (resourceId = obtainStyledAttributes.getResourceId(com.davemorrissey.labs.subscaleview.R.styleable.SubsamplingScaleImageView_src, 0)) > 0) {
                setImage(com.davemorrissey.labs.subscaleview.view.ImageSource.resource(resourceId).tilingEnabled());
            }
            if (obtainStyledAttributes.hasValue(com.davemorrissey.labs.subscaleview.R.styleable.SubsamplingScaleImageView_panEnabled)) {
                setPanEnabled(obtainStyledAttributes.getBoolean(com.davemorrissey.labs.subscaleview.R.styleable.SubsamplingScaleImageView_panEnabled, true));
            }
            if (obtainStyledAttributes.hasValue(com.davemorrissey.labs.subscaleview.R.styleable.SubsamplingScaleImageView_zoomEnabled)) {
                setZoomEnabled(obtainStyledAttributes.getBoolean(com.davemorrissey.labs.subscaleview.R.styleable.SubsamplingScaleImageView_zoomEnabled, true));
            }
            if (obtainStyledAttributes.hasValue(com.davemorrissey.labs.subscaleview.R.styleable.SubsamplingScaleImageView_quickScaleEnabled)) {
                setQuickScaleEnabled(obtainStyledAttributes.getBoolean(com.davemorrissey.labs.subscaleview.R.styleable.SubsamplingScaleImageView_quickScaleEnabled, true));
            }
            if (obtainStyledAttributes.hasValue(com.davemorrissey.labs.subscaleview.R.styleable.SubsamplingScaleImageView_tileBackgroundColor)) {
                setTileBackgroundColor(obtainStyledAttributes.getColor(com.davemorrissey.labs.subscaleview.R.styleable.SubsamplingScaleImageView_tileBackgroundColor, android.graphics.Color.argb(0, 0, 0, 0)));
            }
            obtainStyledAttributes.recycle();
        }
        this.quickScaleThreshold = android.util.TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
        float f17 = getContext().getResources().getDisplayMetrics().widthPixels / 720.0f;
        if (f17 > 1.0f) {
            this.mScreenExtraScale = f17;
        }
    }

    private int calculateInSampleSize(float f17) {
        int round;
        if (this.minimumTileDpi > 0) {
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f17 *= this.minimumTileDpi / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int sWidth = (int) (sWidth() * f17);
        int sHeight = (int) (sHeight() * f17);
        if (sWidth == 0 || sHeight == 0) {
            return 32;
        }
        int i17 = 1;
        if (sHeight() > sHeight || sWidth() > sWidth) {
            round = java.lang.Math.round(sHeight() / sHeight);
            int round2 = java.lang.Math.round(sWidth() / sWidth);
            if (round >= round2) {
                round = round2;
            }
        } else {
            round = 1;
        }
        while (true) {
            int i18 = i17 * 2;
            if (i18 >= round) {
                return i17;
            }
            i17 = i18;
        }
    }

    private void cancelAllTileLoadTask() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        com.tencent.mars.xlog.Log.i(this.TAG, "cancelAllTileLoadTask, task size: %d", java.lang.Integer.valueOf(this.mTileLoadTaskList.size()));
        java.util.Iterator<com.davemorrissey.labs.subscaleview.model.ILoadable> it = this.mTileLoadTaskList.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.mTileLoadTaskList.clear();
    }

    private boolean checkImageLoaded() {
        boolean isBaseLayerReady = isBaseLayerReady();
        if (!this.imageLoadedSent && isBaseLayerReady) {
            preDraw();
            this.imageLoadedSent = true;
            onImageLoaded();
        }
        return isBaseLayerReady;
    }

    private boolean checkReady() {
        boolean z17 = getWidth() > 0 && getHeight() > 0 && this.sWidth > 0 && this.sHeight > 0 && (this.bitmap != null || isBaseLayerReady());
        if (!this.readySent && z17) {
            preDraw();
            this.readySent = true;
            onReady();
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener onImageEventListener = this.onImageEventListener;
            if (onImageEventListener != null) {
                onImageEventListener.onReady();
            }
        }
        return z17;
    }

    private void createPaints() {
        if (this.bitmapPaint == null) {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.bitmapPaint = paint;
            paint.setAntiAlias(true);
            this.bitmapPaint.setFilterBitmap(true);
            this.bitmapPaint.setDither(true);
        }
        if ((this.debugTextPaint == null || this.debugLinePaint == null) && this.debug) {
            android.graphics.Paint paint2 = new android.graphics.Paint();
            this.debugTextPaint = paint2;
            paint2.setTextSize(px(20));
            this.debugTextPaint.setColor(-65281);
            this.debugTextPaint.setStyle(android.graphics.Paint.Style.FILL);
            android.graphics.Paint paint3 = new android.graphics.Paint();
            this.debugLinePaint = paint3;
            paint3.setColor(-65281);
            this.debugLinePaint.setStyle(android.graphics.Paint.Style.STROKE);
            this.debugLinePaint.setStrokeWidth(px(1));
        }
    }

    private float distance(float f17, float f18, float f19, float f27) {
        float f28 = f17 - f18;
        float f29 = f19 - f27;
        return (float) java.lang.Math.sqrt((f28 * f28) + (f29 * f29));
    }

    private void drawBitmap(android.graphics.Canvas canvas) {
        this.matrix.reset();
        int width = this.bitmap.getWidth();
        int height = this.bitmap.getHeight();
        int i17 = this.previewOrientation;
        if (i17 == 90 || i17 == 270) {
            width = this.bitmap.getHeight();
            height = this.bitmap.getWidth();
        }
        if (this.bitmapIsPreview) {
            initPreviewScale();
            this.matrix.postScale(this.mPreviewWidthScaleRate, this.mPreviewHeightScaleRate, width / 2.0f, height / 2.0f);
        }
        this.matrix.postTranslate((this.mViewWidth - this.bitmap.getWidth()) / 2, (this.mViewHeight - this.bitmap.getHeight()) / 2);
        if (this.tileBgPaint != null) {
            if (this.sRect == null) {
                this.sRect = new android.graphics.RectF();
            }
            this.sRect.set(0.0f, 0.0f, this.bitmapIsPreview ? this.bitmap.getWidth() : this.sWidth, this.bitmapIsPreview ? this.bitmap.getHeight() : this.sHeight);
            this.matrix.mapRect(this.sRect);
            canvas.drawRect(this.sRect, this.tileBgPaint);
        }
        canvas.drawBitmap(this.bitmap, this.matrix, this.bitmapPaint);
    }

    private float ease(int i17, long j17, float f17, float f18, long j18) {
        if (i17 == 1) {
            return easeOutQuad(j17, f17, f18, j18);
        }
        if (i17 == 2) {
            return easeInOutQuad(j17, f17, f18, j18);
        }
        throw new java.lang.IllegalStateException("Unexpected easing type: " + i17);
    }

    private float easeInOutQuad(long j17, float f17, float f18, long j18) {
        float f19;
        float f27 = ((float) j17) / (((float) j18) / 2.0f);
        if (f27 < 1.0f) {
            f19 = (f18 / 2.0f) * f27;
        } else {
            float f28 = f27 - 1.0f;
            f19 = (-f18) / 2.0f;
            f27 = (f28 * (f28 - 2.0f)) - 1.0f;
        }
        return (f19 * f27) + f17;
    }

    private float easeOutQuad(long j17, float f17, float f18, long j18) {
        float f19 = ((float) j17) / ((float) j18);
        return ((-f18) * f19 * (f19 - 2.0f)) + f17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fitToBounds(boolean z17, com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleAndTranslate scaleAndTranslate) {
        float max;
        int max2;
        float max3;
        if (this.panLimit == 2 && isReady()) {
            z17 = false;
        }
        android.graphics.PointF pointF = scaleAndTranslate.vTranslate;
        float limitedScale = limitedScale(scaleAndTranslate.scale);
        float sWidth = sWidth() * limitedScale;
        float sHeight = sHeight() * limitedScale;
        if (this.panLimit == 3 && isReady()) {
            pointF.x = java.lang.Math.max(pointF.x, (getWidth() / 2) - sWidth);
            pointF.y = java.lang.Math.max(pointF.y, (getHeight() / 2) - sHeight);
        } else if (z17) {
            pointF.x = java.lang.Math.max(pointF.x, getWidth() - sWidth);
            pointF.y = java.lang.Math.max(pointF.y, getHeight() - sHeight);
        } else {
            pointF.x = java.lang.Math.max(pointF.x, -sWidth);
            pointF.y = java.lang.Math.max(pointF.y, -sHeight);
        }
        float paddingLeft = (getPaddingLeft() > 0 || getPaddingRight() > 0) ? getPaddingLeft() / (getPaddingLeft() + getPaddingRight()) : 0.5f;
        float paddingTop = (getPaddingTop() > 0 || getPaddingBottom() > 0) ? getPaddingTop() / (getPaddingTop() + getPaddingBottom()) : 0.5f;
        if (this.panLimit == 3 && isReady()) {
            max = java.lang.Math.max(0, getWidth() / 2);
            max2 = java.lang.Math.max(0, getHeight() / 2);
        } else {
            if (z17) {
                max = java.lang.Math.max(0.0f, (getWidth() - sWidth) * paddingLeft);
                max3 = java.lang.Math.max(0.0f, (getHeight() - sHeight) * paddingTop);
                pointF.x = java.lang.Math.min(pointF.x, max);
                pointF.y = java.lang.Math.min(pointF.y, max3);
                scaleAndTranslate.scale = limitedScale;
            }
            max = java.lang.Math.max(0, getWidth());
            max2 = java.lang.Math.max(0, getHeight());
        }
        max3 = max2;
        pointF.x = java.lang.Math.min(pointF.x, max);
        pointF.y = java.lang.Math.min(pointF.y, max3);
        scaleAndTranslate.scale = limitedScale;
    }

    private float getDoubleTapZoomScale() {
        float f17 = this.mScaleRate;
        float f18 = this.mWidthScale;
        if (f18 * needScaleRate <= f17) {
            f18 = this.mHeightScale;
            if (needScaleRate * f18 <= f17) {
                f18 = this.doubleTapZoomScale * f17;
            }
        }
        if (f18 < 1.0d) {
            f18 = 1.0f;
        }
        float f19 = this.maxScale;
        return f18 > f19 ? f19 : f18;
    }

    private android.graphics.Point getMaxBitmapDimensions(android.graphics.Canvas canvas) {
        int min = java.lang.Math.min(canvas.getMaximumBitmapWidth(), this.maxTileWidth);
        int min2 = java.lang.Math.min(canvas.getMaximumBitmapHeight(), this.maxTileHeight);
        if (min > 10000) {
            min = 10000;
        }
        if (min2 > 10000) {
            min2 = 10000;
        }
        com.tencent.mars.xlog.Log.i(this.TAG, "getMaxBitmapDimensions %d, %d", java.lang.Integer.valueOf(min), java.lang.Integer.valueOf(min2));
        return new android.graphics.Point(min, min2);
    }

    public static android.graphics.Bitmap.Config getPreferredBitmapConfig() {
        return preferredBitmapConfig;
    }

    private void initImageView() {
        this.mSuppMatrix = new android.graphics.Matrix();
        setTileBackgroundColor(-1);
    }

    private void initMaxScale() {
        this.maxScale = getDoubleTapZoomScale() * 2.0f * this.mScreenExtraScale;
    }

    private void initMinScale() {
        this.minScale = java.lang.Math.min(minScale(), this.mScaleRate * 0.75f);
    }

    private void initPreviewScale() {
        if (this.bitmap != null && this.bitmapIsPreview) {
            int sWidth = sWidth();
            int sHeight = sHeight();
            float f17 = sWidth;
            float f18 = sHeight;
            boolean z17 = f17 > f18 * 2.2f;
            this.horizontalLong = z17;
            boolean z18 = f18 > f17 * 2.2f;
            this.verticalLong = z18;
            this.horizontalLong = z17 && sWidth > this.mViewWidth;
            this.verticalLong = z18 && sHeight > this.mViewHeight;
            initScaleRate();
            if (this.verticalLong) {
                this.mPreviewWidthScaleRate = (this.mViewWidth * 1.0f) / previewWidth();
                this.mPreviewHeightScaleRate = (this.mViewHeight * 1.0f) / previewHeight();
            } else if (this.horizontalLong) {
                this.mPreviewWidthScaleRate = (this.mViewWidth * 1.0f) / previewWidth();
                this.mPreviewHeightScaleRate = (this.mScaleRate * sHeight()) / previewHeight();
            } else {
                this.mPreviewWidthScaleRate = (this.mScaleRate * sWidth()) / previewWidth();
                this.mPreviewHeightScaleRate = (this.mScaleRate * sHeight()) / previewHeight();
            }
            com.tencent.mars.xlog.Log.i(this.TAG, "initPreviewScaleRate previewWidthScale: %f, previewHeightScale: %f, previewHeight: %d, previewWidth: %d, verticalLong: %b, horizontalLong: %b, %s", java.lang.Float.valueOf(this.mPreviewWidthScaleRate), java.lang.Float.valueOf(this.mPreviewHeightScaleRate), java.lang.Integer.valueOf(previewHeight()), java.lang.Integer.valueOf(previewWidth()), java.lang.Boolean.valueOf(this.verticalLong), java.lang.Boolean.valueOf(this.horizontalLong), this.mMainImageSource.getUri().toString());
        }
    }

    private synchronized void initialiseBaseLayer(android.graphics.Point point) {
        debug("initialiseBaseLayer maxTileDimensions=%dx%d", java.lang.Integer.valueOf(point.x), java.lang.Integer.valueOf(point.y));
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleAndTranslate scaleAndTranslate = new com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleAndTranslate(0.0f, new android.graphics.PointF(0.0f, 0.0f));
        this.satTemp = scaleAndTranslate;
        fitToBounds(true, scaleAndTranslate);
        this.fullImageSampleSize = calculateInSampleSize(this.satTemp.scale);
        initialiseTileMap(point);
        for (java.util.Map.Entry<java.lang.Integer, java.util.List<com.davemorrissey.labs.subscaleview.model.Tile>> entry : this.tileMap.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
        for (com.davemorrissey.labs.subscaleview.model.Tile tile : this.tileMap.get(java.lang.Integer.valueOf(this.fullImageSampleSize))) {
            com.tencent.mars.xlog.Log.i(this.TAG, "tile fullSampleSize: %d", java.lang.Integer.valueOf(this.fullImageSampleSize));
            newLoadTask(tile);
        }
        refreshRequiredTiles(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initialiseTileMap(android.graphics.Point point) {
        double d17;
        double d18;
        debug("initialiseTileMap maxTileDimensions=%dx%d", java.lang.Integer.valueOf(point.x), java.lang.Integer.valueOf(point.y));
        this.tileMap = new java.util.LinkedHashMap();
        int i17 = this.fullImageSampleSize;
        int i18 = 1;
        int i19 = 1;
        int i27 = 1;
        while (true) {
            int sWidth = sWidth() / i19;
            int sHeight = sHeight() / i27;
            int i28 = sWidth / i17;
            int i29 = sHeight / i17;
            while (true) {
                if (i28 + i19 + i18 <= point.x) {
                    d17 = i28;
                    if (d17 <= getWidth() * 1.25d || i17 >= this.fullImageSampleSize) {
                        break;
                    }
                }
                i19++;
                sWidth = sWidth() / i19;
                i28 = sWidth / i17;
            }
            while (true) {
                if (i29 + i27 + i18 <= point.y) {
                    d18 = i29;
                    if (d18 <= getHeight() * 1.25d || i17 >= this.fullImageSampleSize) {
                        break;
                    }
                }
                i27++;
                sHeight = sHeight() / i27;
                i29 = sHeight / i17;
            }
            if (i17 < this.fullImageSampleSize && i19 * i27 == i18) {
                com.tencent.mars.xlog.Log.i(this.TAG, "fix tiles to make sure there is only one full Image");
                if ((getWidth() * 1.25d) - d17 < (getHeight() * 1.25d) - d18) {
                    i19++;
                    sWidth = sWidth() / i19;
                    int i37 = sWidth / i17;
                } else {
                    i27++;
                    sHeight = sHeight() / i27;
                    int i38 = sHeight / i17;
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(i19 * i27);
            int i39 = 0;
            while (i39 < i19) {
                int i47 = 0;
                while (i47 < i27) {
                    com.davemorrissey.labs.subscaleview.model.Tile tile = new com.davemorrissey.labs.subscaleview.model.Tile();
                    tile.sampleSize = i17;
                    tile.visible = i17 == this.fullImageSampleSize ? i18 : 0;
                    tile.sRect = new android.graphics.Rect(i39 * sWidth, i47 * sHeight, i39 == i19 + (-1) ? sWidth() : (i39 + 1) * sWidth, i47 == i27 + (-1) ? sHeight() : (i47 + 1) * sHeight);
                    tile.vRect = new android.graphics.Rect(0, 0, 0, 0);
                    tile.fileSRect = new android.graphics.Rect(tile.sRect);
                    arrayList.add(tile);
                    i47++;
                    i18 = 1;
                }
                i39++;
                i18 = 1;
            }
            this.tileMap.put(java.lang.Integer.valueOf(i17), arrayList);
            i18 = 1;
            if (i17 == 1) {
                return;
            } else {
                i17 /= 2;
            }
        }
    }

    private float invertViewX(float f17) {
        android.graphics.PointF pointF = this.vTranslate;
        if (pointF == null) {
            return 0.0f;
        }
        float f18 = (f17 - pointF.x) / this.scale;
        if (java.lang.Float.isNaN(f18) || java.lang.Float.isInfinite(f18)) {
            return 0.0f;
        }
        return f18;
    }

    private float invertViewY(float f17) {
        android.graphics.PointF pointF = this.vTranslate;
        if (pointF == null) {
            return 0.0f;
        }
        float f18 = (f17 - pointF.y) / this.scale;
        if (java.lang.Float.isNaN(f18) || java.lang.Float.isInfinite(f18)) {
            return 0.0f;
        }
        return f18;
    }

    private boolean isBaseLayerReady() {
        boolean z17 = true;
        if (this.bitmap != null && !this.bitmapIsPreview) {
            return true;
        }
        java.util.Map<java.lang.Integer, java.util.List<com.davemorrissey.labs.subscaleview.model.Tile>> map = this.tileMap;
        if (map == null) {
            return false;
        }
        for (java.util.Map.Entry<java.lang.Integer, java.util.List<com.davemorrissey.labs.subscaleview.model.Tile>> entry : map.entrySet()) {
            if (entry.getKey().intValue() == this.fullImageSampleSize) {
                for (com.davemorrissey.labs.subscaleview.model.Tile tile : entry.getValue()) {
                    if (tile.loading || tile.bitmap == null) {
                        z17 = false;
                    }
                }
            }
        }
        return z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.graphics.PointF limitedSCenter(float f17, float f18, float f19, android.graphics.PointF pointF) {
        android.graphics.PointF vTranslateForSCenter = vTranslateForSCenter(f17, f18, f19);
        pointF.set(((getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2)) - vTranslateForSCenter.x) / f19, ((getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2)) - vTranslateForSCenter.y) / f19);
        return pointF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float limitedScale(float f17) {
        return java.lang.Math.max(minScale(), f17);
    }

    private float minScale() {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i17 = this.minimumScaleType;
        if (i17 == 2 || i17 == 4) {
            return java.lang.Math.max((getWidth() - paddingLeft) / sWidth(), (getHeight() - paddingBottom) / sHeight());
        }
        if (i17 == 3) {
            float f17 = this.minScale;
            if (f17 > 0.0f) {
                return f17;
            }
        }
        return java.lang.Math.min((getWidth() - paddingLeft) / sWidth(), (getHeight() - paddingBottom) / sHeight());
    }

    private void newLoadTask(com.davemorrissey.labs.subscaleview.model.Tile tile) {
        if (this.cancelled) {
            com.tencent.mars.xlog.Log.i(this.TAG, "newLoadTask, has cancelled and ignore");
            return;
        }
        com.davemorrissey.labs.subscaleview.model.ILoadable newInstance = mTileLoader.newInstance(this, this.decoder, tile);
        newInstance.startLoad();
        this.mTileLoadTaskList.add(newInstance);
        this.mImageDecodeRecord.setLastTaskTimeStamp();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (r1 != 262) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean onTouchEventInternal(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.onTouchEventInternal(android.view.MotionEvent):boolean");
    }

    private void preDraw() {
        java.lang.Float f17;
        if (getWidth() == 0 || getHeight() == 0 || this.sWidth <= 0 || this.sHeight <= 0) {
            return;
        }
        if (this.sPendingCenter != null && (f17 = this.pendingScale) != null) {
            this.scale = f17.floatValue();
            if (this.vTranslate == null) {
                this.vTranslate = new android.graphics.PointF();
            }
            this.vTranslate.x = (getWidth() / 2) - (this.scale * this.sPendingCenter.x);
            this.vTranslate.y = (getHeight() / 2) - (this.scale * this.sPendingCenter.y);
            this.sPendingCenter = null;
            this.pendingScale = null;
            this.mNeedPendingScale = false;
            fitToBounds(true);
            refreshRequiredTiles(true);
        }
        fitToBounds(false);
    }

    private int previewHeight() {
        android.graphics.Bitmap bitmap = this.bitmap;
        if (bitmap == null || !this.bitmapIsPreview) {
            return 0;
        }
        int i17 = this.previewOrientation;
        return (i17 == 90 || i17 == 270) ? bitmap.getWidth() : bitmap.getHeight();
    }

    private int previewWidth() {
        android.graphics.Bitmap bitmap = this.bitmap;
        if (bitmap == null || !this.bitmapIsPreview) {
            return 0;
        }
        int i17 = this.previewOrientation;
        return (i17 == 90 || i17 == 270) ? bitmap.getHeight() : bitmap.getWidth();
    }

    private int px(int i17) {
        return (int) (this.density * i17);
    }

    private void requestDisallowInterceptTouchEvent(boolean z17) {
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            com.tencent.mars.xlog.Log.i(this.TAG, "requestDisallowInterceptTouchEvent disallow: %b, allowInterceptTouch: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.allowInterceptTouch));
            if (this.allowInterceptTouch) {
                parent.requestDisallowInterceptTouchEvent(z17);
            } else {
                this.ignoreCancelEvent = true;
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    private void reset(boolean z17) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener onImageEventListener;
        debug("reset newImage=" + z17, new java.lang.Object[0]);
        this.scale = 0.0f;
        this.scaleStart = 0.0f;
        this.vTranslate = null;
        this.vTranslateStart = null;
        this.vTranslateBefore = null;
        this.pendingScale = java.lang.Float.valueOf(0.0f);
        this.sPendingCenter = null;
        this.sRequestedCenter = null;
        this.isZooming = false;
        this.isPanning = false;
        this.isQuickScaling = false;
        this.maxTouchCount = 0;
        this.fullImageSampleSize = 0;
        this.vCenterStart = null;
        this.vDistStart = 0.0f;
        this.quickScaleLastDistance = 0.0f;
        this.quickScaleMoved = false;
        this.quickScaleSCenter = null;
        this.quickScaleVLastPoint = null;
        this.quickScaleVStart = null;
        this.anim = null;
        this.satTemp = null;
        this.matrix.reset();
        this.sRect = null;
        if (z17) {
            com.davemorrissey.labs.subscaleview.performance.ImageDecodeRecord imageDecodeRecord = this.mImageDecodeRecord;
            if (imageDecodeRecord != null) {
                imageDecodeRecord.reset();
            }
            this.uri = null;
            this.decoderLock.writeLock().lock();
            try {
                com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder imageRegionDecoder = this.decoder;
                if (imageRegionDecoder != null) {
                    imageRegionDecoder.recycle();
                    this.decoder = null;
                }
                this.decoderLock.writeLock().unlock();
                android.graphics.Bitmap bitmap = this.bitmap;
                if (bitmap != null && !this.bitmapIsCached) {
                    bitmap.recycle();
                }
                if (this.bitmap != null && this.bitmapIsCached && (onImageEventListener = this.onImageEventListener) != null) {
                    onImageEventListener.onPreviewReleased();
                }
                this.sWidth = 0;
                this.sHeight = 0;
                this.sOrientation = 0;
                this.sRegion = null;
                this.pRegion = null;
                this.readySent = false;
                this.imageLoadedSent = false;
                this.bitmap = null;
                this.bitmapIsPreview = false;
                this.bitmapIsCached = false;
                this.isPreviewLoaded = false;
                this.canDrawPreview = false;
                this.isFirstLoadFullImage = true;
            } catch (java.lang.Throwable th6) {
                this.decoderLock.writeLock().unlock();
                throw th6;
            }
        }
        java.util.Map<java.lang.Integer, java.util.List<com.davemorrissey.labs.subscaleview.model.Tile>> map = this.tileMap;
        if (map != null) {
            java.util.Iterator<java.util.Map.Entry<java.lang.Integer, java.util.List<com.davemorrissey.labs.subscaleview.model.Tile>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                for (com.davemorrissey.labs.subscaleview.model.Tile tile : it.next().getValue()) {
                    tile.visible = false;
                    if (tile.bitmap != null) {
                        com.davemorrissey.labs.subscaleview.view.ImageSource imageSource = this.mPreviewSource;
                        if (imageSource != null) {
                            android.graphics.Bitmap bitmap2 = imageSource.getBitmap();
                            android.graphics.Bitmap bitmap3 = tile.bitmap;
                            if (bitmap2 == bitmap3) {
                                com.tencent.mars.xlog.Log.i(this.TAG, "reset tile bitmap not need to recycle: %d", java.lang.Integer.valueOf(bitmap3.hashCode()));
                            }
                        }
                        tile.bitmap.recycle();
                        tile.bitmap = null;
                    }
                }
            }
            this.tileMap = null;
        }
        setGestureDetector(getContext());
    }

    private void resetScales() {
        this.maxScale = 2.0f;
        this.minScale = 1.0f;
    }

    private void restoreState(com.davemorrissey.labs.subscaleview.view.ImageViewState imageViewState) {
        if (imageViewState == null || imageViewState.getCenter() == null || !VALID_ORIENTATIONS.contains(java.lang.Integer.valueOf(imageViewState.getOrientation()))) {
            return;
        }
        this.orientation = imageViewState.getOrientation();
        this.pendingScale = java.lang.Float.valueOf(imageViewState.getScale());
        this.sPendingCenter = imageViewState.getCenter();
        invalidate();
    }

    private int sHeight() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.sWidth : this.sHeight;
    }

    private int sWidth() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.sHeight : this.sWidth;
    }

    private void sendStateChanged(float f17, android.graphics.PointF pointF, int i17) {
        com.tencent.mars.xlog.Log.i(this.TAG, "sendStateChanged oldScale: %s, %s", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(this.scale));
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener onStateChangedListener = this.onStateChangedListener;
        if (onStateChangedListener != null) {
            float f18 = this.scale;
            if (f18 != f17) {
                onStateChangedListener.onScaleChanged(f18, f17, i17);
            }
        }
        if (this.onStateChangedListener == null || this.vTranslate.equals(pointF)) {
            return;
        }
        this.onStateChangedListener.onCenterChanged(getCenter(), i17);
    }

    public static void setBitmapLoaderImp(com.davemorrissey.labs.subscaleview.model.IBitmapLoaderFactory iBitmapLoaderFactory) {
        mBitmapLoader = iBitmapLoaderFactory;
    }

    private void setFullImageBitmap(final android.graphics.Bitmap bitmap) {
        s75.d.b(new java.lang.Runnable() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.5
            @Override // java.lang.Runnable
            public void run() {
                if (bitmap != null) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this;
                    subsamplingScaleImageView.fullImageBitmap = subsamplingScaleImageView.rotateAndScaleBitmap(bitmap, subsamplingScaleImageView.sOrientation, 1.0f, 1.0f);
                    com.tencent.mars.xlog.Log.i(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.TAG, "rotate and scale fullImageBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            }
        }, "rotateAndScaleBitmap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGestureDetector(final android.content.Context context) {
        this.detector = new android.view.GestureDetector(context, new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.3
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
                if (com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.onDoubleTapListener != null && com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.onDoubleTapListener.onDoubleTap(motionEvent)) {
                    return true;
                }
                if (com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.zoomEnabled && com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.readySent) {
                    com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this;
                    if (subsamplingScaleImageView.vTranslate != null) {
                        subsamplingScaleImageView.setGestureDetector(context);
                        com.tencent.mars.xlog.Log.i(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.TAG, "onDoubleTap, quickScaledEnabled: %b", java.lang.Boolean.valueOf(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.quickScaleEnabled));
                        if (!com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.quickScaleEnabled) {
                            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView2 = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this;
                            subsamplingScaleImageView2.doubleTapZoom(subsamplingScaleImageView2.viewToSourceCoord(new android.graphics.PointF(motionEvent.getX(), motionEvent.getY())), new android.graphics.PointF(motionEvent.getX(), motionEvent.getY()));
                            return true;
                        }
                        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.vCenterStart = new android.graphics.PointF(motionEvent.getX(), motionEvent.getY());
                        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView3 = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this;
                        android.graphics.PointF pointF = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.vTranslate;
                        subsamplingScaleImageView3.vTranslateStart = new android.graphics.PointF(pointF.x, pointF.y);
                        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView4 = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this;
                        subsamplingScaleImageView4.scaleStart = subsamplingScaleImageView4.scale;
                        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.isQuickScaling = true;
                        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.isZooming = true;
                        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.quickScaleLastDistance = -1.0f;
                        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView5 = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this;
                        subsamplingScaleImageView5.quickScaleSCenter = subsamplingScaleImageView5.viewToSourceCoord(subsamplingScaleImageView5.vCenterStart);
                        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.quickScaleVStart = new android.graphics.PointF(motionEvent.getX(), motionEvent.getY());
                        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.quickScaleVLastPoint = new android.graphics.PointF(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.quickScaleSCenter.x, com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.quickScaleSCenter.y);
                        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.quickScaleMoved = false;
                        return false;
                    }
                }
                return super.onDoubleTapEvent(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
                if (!com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.panEnabled || !com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.readySent || com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.vTranslate == null || motionEvent == null || motionEvent2 == null || ((java.lang.Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && java.lang.Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((java.lang.Math.abs(f17) <= 500.0f && java.lang.Math.abs(f18) <= 500.0f) || com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.isZooming))) {
                    return super.onFling(motionEvent, motionEvent2, f17, f18);
                }
                android.graphics.PointF pointF = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.vTranslate;
                android.graphics.PointF pointF2 = new android.graphics.PointF(pointF.x + (f17 * 0.25f), pointF.y + (f18 * 0.25f));
                float width = ((com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.getWidth() / 2) - pointF2.x) / com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.scale;
                float height = (r6.getHeight() / 2) - pointF2.y;
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this;
                new com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder(new android.graphics.PointF(width, height / subsamplingScaleImageView.scale)).withEasing(1).withPanLimited(false).withOrigin(3).start();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
                boolean onSingleTapConfirmed;
                if (com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.onDoubleTapListener != null && com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.onDoubleTapListener.onSingleTapConfirmed(motionEvent)) {
                    return true;
                }
                if (com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.gestureDetectorListener != null && (onSingleTapConfirmed = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.gestureDetectorListener.onSingleTapConfirmed(motionEvent))) {
                    return onSingleTapConfirmed;
                }
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.performClick();
                return true;
            }
        });
        this.singleDetector = new android.view.GestureDetector(context, new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.4
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.performClick();
                return true;
            }
        });
    }

    private void setMatrixArray(float[] fArr, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        fArr[0] = f17;
        fArr[1] = f18;
        fArr[2] = f19;
        fArr[3] = f27;
        fArr[4] = f28;
        fArr[5] = f29;
        fArr[6] = f37;
        fArr[7] = f38;
    }

    public static void setPreferredBitmapConfig(android.graphics.Bitmap.Config config) {
        preferredBitmapConfig = config;
    }

    public static void setTileInitLoaderImp(com.davemorrissey.labs.subscaleview.model.ITileInitLoaderFactory iTileInitLoaderFactory) {
        mTileInitLoader = iTileInitLoaderFactory;
    }

    public static void setTileLoaderImp(com.davemorrissey.labs.subscaleview.model.ITileLoaderFactory iTileLoaderFactory) {
        mTileLoader = iTileLoaderFactory;
    }

    private android.graphics.Rect sourceToViewRect(android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (this.previewRotateFlip == 4) {
            rect2.set((int) sourceToViewX(rect.right), (int) sourceToViewY(rect.top), (int) sourceToViewX(rect.left), (int) sourceToViewY(rect.bottom));
        } else {
            rect2.set((int) sourceToViewX(rect.left), (int) sourceToViewY(rect.top), (int) sourceToViewX(rect.right), (int) sourceToViewY(rect.bottom));
        }
        if (this.rawExifOrientation == 2) {
            rect2.set((int) sourceToViewX(rect.right), (int) sourceToViewY(rect.top), (int) sourceToViewX(rect.left), (int) sourceToViewY(rect.bottom));
        }
        if (this.rawExifOrientation == 5) {
            rect2.set((int) sourceToViewX(rect.left), (int) sourceToViewY(rect.bottom), (int) sourceToViewX(rect.right), (int) sourceToViewY(rect.top));
        }
        if (this.rawExifOrientation == 7) {
            rect2.set((int) sourceToViewX(rect.left), (int) sourceToViewY(rect.bottom), (int) sourceToViewX(rect.right), (int) sourceToViewY(rect.top));
        }
        return rect2;
    }

    private float sourceToViewX(float f17) {
        android.graphics.PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f17 * this.scale) + pointF.x;
    }

    private float sourceToViewY(float f17) {
        android.graphics.PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f17 * this.scale) + pointF.y;
    }

    private boolean tileVisible(com.davemorrissey.labs.subscaleview.model.Tile tile) {
        float viewToSourceX = viewToSourceX(0.0f);
        float viewToSourceX2 = viewToSourceX(getWidth());
        float viewToSourceY = viewToSourceY(0.0f);
        float viewToSourceY2 = viewToSourceY(getHeight());
        android.graphics.Rect rect = tile.sRect;
        return viewToSourceX <= ((float) rect.right) && ((float) rect.left) <= viewToSourceX2 && viewToSourceY <= ((float) rect.bottom) && ((float) rect.top) <= viewToSourceY2;
    }

    private void updateScale(float f17) {
        float f18 = this.scale;
        float f19 = this.matrixValues[0];
        this.scale = f19;
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener onStateChangedListener = this.onStateChangedListener;
        if (onStateChangedListener != null) {
            onStateChangedListener.onScaleChanged(f19, f18, 2);
        }
    }

    private android.graphics.PointF vTranslateForSCenter(float f17, float f18, float f19) {
        int paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2);
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        if (this.satTemp == null) {
            this.satTemp = new com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleAndTranslate(0.0f, new android.graphics.PointF(0.0f, 0.0f));
        }
        this.satTemp.scale = f19;
        this.satTemp.vTranslate.set(paddingLeft - (f17 * f19), paddingTop - (f18 * f19));
        fitToBounds(true, this.satTemp);
        return this.satTemp.vTranslate;
    }

    private float viewToSourceX(float f17) {
        android.graphics.PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f17 - pointF.x) / this.scale;
    }

    private float viewToSourceY(float f17) {
        android.graphics.PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f17 - pointF.y) / this.scale;
    }

    private void zoomScaleAndCenter(android.graphics.PointF pointF, android.graphics.PointF pointF2, float f17) {
        new com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder(f17, pointF, pointF2).withInterruptible(false).withDuration(this.zoomScaleDuration).withOrigin(2).start();
    }

    public void addOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.onTouchListener = onTouchListener;
    }

    public synchronized void addPreviewLoadedTime(int i17) {
        com.davemorrissey.labs.subscaleview.performance.ImageDecodeRecord imageDecodeRecord = this.mImageDecodeRecord;
        if (imageDecodeRecord != null) {
            imageDecodeRecord.addPreviewLoadedTime(i17);
        }
    }

    public synchronized void addTileDecodeTime(int i17) {
        com.davemorrissey.labs.subscaleview.performance.ImageDecodeRecord imageDecodeRecord = this.mImageDecodeRecord;
        if (imageDecodeRecord != null) {
            imageDecodeRecord.addTileDecodeTime(i17);
        }
    }

    public synchronized void addTileInitTime(int i17) {
        com.davemorrissey.labs.subscaleview.performance.ImageDecodeRecord imageDecodeRecord = this.mImageDecodeRecord;
        if (imageDecodeRecord != null) {
            imageDecodeRecord.addTileInitTime(i17);
        }
    }

    public com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder animateCenter(android.graphics.PointF pointF) {
        if (isReady()) {
            return new com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder(pointF);
        }
        return null;
    }

    public com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder animateScale(float f17) {
        if (isReady()) {
            return new com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder(f17);
        }
        return null;
    }

    public com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder animateScaleAndCenter(float f17, android.graphics.PointF pointF) {
        if (isReady()) {
            return new com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder(f17, pointF);
        }
        return null;
    }

    public void debug(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String.format(str, objArr);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public float doubleTapZoom(float f17, float f18) {
        android.graphics.PointF pointF = new android.graphics.PointF(f17, f18);
        return doubleTapZoom(viewToSourceCoord(pointF), pointF);
    }

    public void fileSRect(android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (getRequiredRotation() == 0) {
            rect2.set(rect);
        } else if (getRequiredRotation() == 90) {
            int i17 = rect.top;
            int i18 = this.sHeight;
            rect2.set(i17, i18 - rect.right, rect.bottom, i18 - rect.left);
        } else if (getRequiredRotation() == 180) {
            int i19 = this.sWidth;
            int i27 = i19 - rect.right;
            int i28 = this.sHeight;
            rect2.set(i27, i28 - rect.bottom, i19 - rect.left, i28 - rect.top);
        } else {
            int i29 = this.sWidth;
            rect2.set(i29 - rect.bottom, rect.left, i29 - rect.top, rect.right);
        }
        int i37 = this.previewRotateFlip;
        if (i37 == 4) {
            int i38 = this.sWidth;
            rect2.set(i38 - rect2.right, rect2.top, i38 - rect2.left, rect2.bottom);
        } else if (i37 == 2) {
            int i39 = rect2.left;
            int i47 = this.sHeight;
            rect2.set(i39, i47 - rect2.bottom, rect2.right, i47 - rect2.top);
        } else if (i37 == 5) {
            int i48 = this.sWidth;
            rect2.set(i48 - rect2.right, rect2.top, i48 - rect2.left, rect2.bottom);
        } else if (i37 == 7) {
            int i49 = rect2.left;
            int i57 = this.sHeight;
            rect2.set(i49, i57 - rect2.bottom, rect2.right, i57 - rect2.top);
        }
        if (this.rawExifOrientation == 2) {
            int i58 = this.sWidth;
            int i59 = i58 - rect2.right;
            int i66 = this.sHeight;
            rect2.set(i59, i66 - rect2.bottom, i58 - rect2.left, i66 - rect2.top);
        }
        if (this.rawExifOrientation == 7) {
            int i67 = this.sWidth;
            int i68 = i67 - rect2.right;
            int i69 = this.sHeight;
            rect2.set(i68, i69 - rect2.bottom, i67 - rect2.left, i69 - rect2.top);
        }
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    public final android.graphics.PointF getCenter() {
        return viewToSourceCoord(getWidth() / 2, getHeight() / 2);
    }

    public java.util.concurrent.locks.ReadWriteLock getDecoderLock() {
        return this.decoderLock;
    }

    public int getExifOrientation(android.content.Context context, android.net.Uri uri) {
        return getExifOrientationInternal(context, uri, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:66:0x00a5, B:68:0x00a9, B:37:0x00ae, B:39:0x00b4, B:40:0x00b9, B:64:0x00b7, B:36:0x00ac), top: B:65:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7 A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:66:0x00a5, B:68:0x00a9, B:37:0x00ae, B:39:0x00b4, B:40:0x00b9, B:64:0x00b7, B:36:0x00ac), top: B:65:0x00a5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getExifOrientationInternal(android.content.Context r16, android.net.Uri r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.getExifOrientationInternal(android.content.Context, android.net.Uri, boolean):int");
    }

    public android.graphics.Bitmap getFullImageBitmap() {
        return this.fullImageBitmap;
    }

    public int getFullImageSampleSize() {
        return this.fullImageSampleSize;
    }

    public synchronized com.davemorrissey.labs.subscaleview.performance.ImageDecodeRecord getImageDecodeRecord() {
        return this.mImageDecodeRecord;
    }

    public android.graphics.PointF getImageViewMatrixScale() {
        if (java.lang.Float.isNaN(this.scale) || java.lang.Float.isInfinite(this.scale)) {
            return new android.graphics.PointF(1.0f, 1.0f);
        }
        float f17 = this.scale;
        return new android.graphics.PointF(f17, f17);
    }

    public android.graphics.PointF getImageViewMatrixTranslation() {
        if (this.vTranslate == null) {
            return null;
        }
        android.graphics.PointF pointF = this.vTranslate;
        return new android.graphics.PointF(pointF.x, pointF.y);
    }

    public boolean getInternalTouchEventConsumed() {
        return this.IsinternalTouchEventConsumed;
    }

    public float getMaxScale() {
        return this.maxScale;
    }

    public final float getMinScale() {
        return minScale();
    }

    public com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener getOnImageEventListener() {
        return this.onImageEventListener;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final void getPanRemaining(android.graphics.RectF rectF) {
        if (isReady()) {
            float sWidth = this.scale * sWidth();
            float sHeight = this.scale * sHeight();
            int i17 = this.panLimit;
            if (i17 == 3) {
                rectF.top = java.lang.Math.max(0.0f, -(this.vTranslate.y - (getHeight() / 2)));
                rectF.left = java.lang.Math.max(0.0f, -(this.vTranslate.x - (getWidth() / 2)));
                rectF.bottom = java.lang.Math.max(0.0f, this.vTranslate.y - ((getHeight() / 2) - sHeight));
                rectF.right = java.lang.Math.max(0.0f, this.vTranslate.x - ((getWidth() / 2) - sWidth));
                return;
            }
            if (i17 == 2) {
                rectF.top = java.lang.Math.max(0.0f, -(this.vTranslate.y - getHeight()));
                rectF.left = java.lang.Math.max(0.0f, -(this.vTranslate.x - getWidth()));
                rectF.bottom = java.lang.Math.max(0.0f, this.vTranslate.y + sHeight);
                rectF.right = java.lang.Math.max(0.0f, this.vTranslate.x + sWidth);
                return;
            }
            rectF.top = java.lang.Math.max(0.0f, -this.vTranslate.y);
            rectF.left = java.lang.Math.max(0.0f, -this.vTranslate.x);
            rectF.bottom = java.lang.Math.max(0.0f, (sHeight + this.vTranslate.y) - getHeight());
            rectF.right = java.lang.Math.max(0.0f, (sWidth + this.vTranslate.x) - getWidth());
        }
    }

    public int getPreviewHeight() {
        return this.previewHeight;
    }

    public int getPreviewOrientation() {
        return this.previewOrientation;
    }

    public int getPreviewWidth() {
        return this.previewWidth;
    }

    public int getRequiredRotation() {
        int i17 = this.orientation;
        return i17 == -1 ? this.sOrientation : i17;
    }

    public final int getSHeight() {
        return this.sHeight;
    }

    public final int getSWidth() {
        return this.sWidth;
    }

    public final float getScale() {
        return this.scale;
    }

    public final com.davemorrissey.labs.subscaleview.view.ImageViewState getState() {
        if (this.vTranslate == null || this.sWidth <= 0 || this.sHeight <= 0) {
            return null;
        }
        return new com.davemorrissey.labs.subscaleview.view.ImageViewState(getScale(), getCenter(), getOrientation());
    }

    public android.graphics.Rect getsRegion() {
        return this.sRegion;
    }

    public boolean hasImage() {
        return (this.uri == null && this.bitmap == null) ? false : true;
    }

    public void initScaleRate() {
        com.tencent.mars.xlog.Log.i(this.TAG, "initScaleRate: %f", java.lang.Float.valueOf(this.mScaleRate));
        initMaxScale();
        initMinScale();
    }

    public android.graphics.PointF invertMapPoint(float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            return null;
        }
        return new android.graphics.PointF(invertViewX(fArr[0]), invertViewY(fArr[1]));
    }

    public java.lang.Boolean isHorizontalLong() {
        if (this.sWidth <= 0 || this.sHeight <= 0) {
            return null;
        }
        return java.lang.Boolean.valueOf(this.horizontalLong);
    }

    public final boolean isImageLoaded() {
        return this.imageLoadedSent;
    }

    public final boolean isPanEnabled() {
        return this.panEnabled;
    }

    public final boolean isQuickScaleEnabled() {
        return this.quickScaleEnabled;
    }

    public final boolean isReady() {
        return this.readySent;
    }

    public java.lang.Boolean isVerticalLong() {
        if (this.sWidth <= 0 || this.sHeight <= 0) {
            return null;
        }
        return java.lang.Boolean.valueOf(this.verticalLong);
    }

    public final boolean isZoomEnabled() {
        return this.zoomEnabled;
    }

    public android.graphics.PointF mapPoint(float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            return null;
        }
        return new android.graphics.PointF(sourceToViewX(fArr[0]), sourceToViewY(fArr[1]));
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = this.onAttachStateChangeListener;
        if (onAttachStateChangeListener != null) {
            onAttachStateChangeListener.onViewAttachedToWindow(this);
        }
        if (this.openHardware) {
            setLayerType(2, null);
        }
        this.cancelled = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        android.graphics.Bitmap bitmap;
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.IReporter iReporter;
        super.onDetachedFromWindow();
        cancelAllTileLoadTask();
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = this.onAttachStateChangeListener;
        if (onAttachStateChangeListener != null) {
            onAttachStateChangeListener.onViewDetachedFromWindow(this);
        }
        long maxLoadDuration = this.mImageDecodeRecord.getMaxLoadDuration();
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        if (maxLoadDuration <= 0 || secureRandom.nextInt(reportRate) != 0 || (bitmap = this.fullImageBitmap) == null || bitmap.isRecycled() || (iReporter = mReporter) == null) {
            return;
        }
        iReporter.report(isUsingZoomOpt, this.fullImageBitmap.getByteCount(), maxLoadDuration);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.davemorrissey.labs.subscaleview.model.Tile tile;
        super.onDraw(canvas);
        java.lang.System.currentTimeMillis();
        createPaints();
        if (this.tileMap == null && this.decoder != null) {
            initialiseBaseLayer(getMaxBitmapDimensions(canvas));
        }
        android.graphics.Bitmap bitmap = this.fullImageBitmap;
        if (bitmap == null) {
            bitmap = this.bitmap;
        }
        float f17 = this.animationProgress;
        if (f17 >= 0.0f && f17 < 1.0f && bitmap != null) {
            int width = getWidth();
            int height = getHeight();
            int height2 = bitmap.getHeight();
            int width2 = bitmap.getWidth();
            float f18 = height2;
            float f19 = (f18 * 1.0f) / width2;
            if (!this.fitWidth) {
                width = (int) (getHeight() / f19);
            }
            float f27 = width;
            int i17 = (int) (f27 * f19);
            this.matrix.getValues(this.values);
            float[] fArr = this.values;
            float f28 = fArr[0];
            float f29 = fArr[5] / fArr[4];
            float f37 = fArr[2];
            if (height2 > width2) {
                float f38 = this.animationProgress;
                int i18 = (int) (((height2 - width2) * (1.0f - f38)) / 2.0f);
                int i19 = f19 > (height * 1.0f) / f27 ? (int) (((int) (((f18 - (r9 * r8)) / 2.0f) * f38)) + (f29 * f38)) : 0;
                this.srcRect.set(0, i18 - i19, width2, (height2 - i18) - i19);
                int width3 = ((height - i17) / 2) + ((int) (((i17 - getWidth()) * (1.0f - this.animationProgress)) / 2.0f));
                int width4 = (int) ((getWidth() - ((getHeight() - (width3 * 2)) / (((f19 - 1.0f) * this.animationProgress) + 1.0f))) / 2.0f);
                this.dstRect.set(width4, width3, getWidth() - width4, getHeight() - width3);
            } else {
                int i27 = (int) (((width2 - height2) * (1.0f - this.animationProgress)) / 2.0f);
                this.srcRect.set(i27, 0, width2 - i27, height2);
                int width5 = (height - ((int) (getWidth() / (((width2 - (i27 * 2)) * 1.0f) / f18)))) / 2;
                if (!this.enter) {
                    float f39 = 1.0f - ((1.0f - this.animationScale) * (1.0f - this.animationProgress));
                    if ((height - (width5 * 2)) * f39 > i17) {
                        int i28 = (int) (((f27 / (1.0f / f39)) - f27) / 2.0f);
                        this.srcRect.set(i28, 0, width2 - i28, height2);
                        width5 = (height - i17) / 2;
                    }
                }
                com.tencent.mars.xlog.Log.i(this.TAG, "leextest value:%f crop:%d animationScale:%f ", java.lang.Float.valueOf(this.animationProgress), java.lang.Integer.valueOf(width5), java.lang.Float.valueOf(this.animationScale));
                this.dstRect.set(0, width5, getWidth(), getHeight() - width5);
            }
            com.tencent.mars.xlog.Log.i(this.TAG, "onDraw aniBitmap, fullImageBitmap:%s, bitmap:%s", this.fullImageBitmap, this.bitmap);
            canvas.drawBitmap(bitmap, this.srcRect, this.dstRect, this.bitmapPaint);
            return;
        }
        if (this.sWidth == 0 || this.sHeight == 0 || getWidth() == 0 || getHeight() == 0 || !checkReady()) {
            return;
        }
        if (this.canRefresh) {
            preDraw();
        }
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.Anim anim = this.anim;
        if (anim != null && anim.vFocusStart != null) {
            float f47 = this.scale;
            if (this.vTranslateBefore == null) {
                this.vTranslateBefore = new android.graphics.PointF(0.0f, 0.0f);
            }
            this.vTranslateBefore.set(this.vTranslate);
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.anim.time;
            boolean z17 = currentTimeMillis > this.anim.duration;
            long min = java.lang.Math.min(currentTimeMillis, this.anim.duration);
            this.scale = ease(this.anim.easing, min, this.anim.scaleStart, this.anim.scaleEnd - this.anim.scaleStart, this.anim.duration);
            float ease = ease(this.anim.easing, min, this.anim.vFocusStart.x, this.anim.vFocusEnd.x - this.anim.vFocusStart.x, this.anim.duration);
            float ease2 = ease(this.anim.easing, min, this.anim.vFocusStart.y, this.anim.vFocusEnd.y - this.anim.vFocusStart.y, this.anim.duration);
            this.vTranslate.x -= sourceToViewX(this.anim.sCenterEnd.x) - ease;
            this.vTranslate.y -= sourceToViewY(this.anim.sCenterEnd.y) - ease2;
            fitToBounds(z17 || this.anim.scaleStart == this.anim.scaleEnd);
            sendStateChanged(f47, this.vTranslateBefore, this.anim.origin);
            refreshRequiredTiles(z17);
            if (z17) {
                if (this.anim.listener != null) {
                    try {
                        this.anim.listener.onComplete();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.w(this.TAG, "Error thrown by animation listener", e17);
                    }
                }
                this.anim = null;
            }
            invalidate();
        }
        if (this.tileMap != null && isBaseLayerReady() && this.mPreviewDone) {
            int min2 = java.lang.Math.min(this.fullImageSampleSize, calculateInSampleSize(this.scale));
            if (this.mDrawFullSampleSizeBitmap) {
                min2 = this.fullImageSampleSize;
            }
            boolean z18 = false;
            for (java.util.Map.Entry<java.lang.Integer, java.util.List<com.davemorrissey.labs.subscaleview.model.Tile>> entry : this.tileMap.entrySet()) {
                if (entry.getKey().intValue() == min2) {
                    for (com.davemorrissey.labs.subscaleview.model.Tile tile2 : entry.getValue()) {
                        if (tile2.visible && (tile2.loading || tile2.bitmap == null)) {
                            z18 = true;
                        }
                    }
                }
            }
            for (java.util.Map.Entry<java.lang.Integer, java.util.List<com.davemorrissey.labs.subscaleview.model.Tile>> entry2 : this.tileMap.entrySet()) {
                if (entry2.getKey().intValue() == min2 || z18) {
                    for (com.davemorrissey.labs.subscaleview.model.Tile tile3 : entry2.getValue()) {
                        sourceToViewRect(tile3.sRect, tile3.vRect);
                        boolean z19 = tile3.loading;
                        if (z19 || tile3.bitmap == null) {
                            tile = tile3;
                            if (z19 && this.debug) {
                                canvas.drawText("LOADING", tile.vRect.left + px(5), tile.vRect.top + px(35), this.debugTextPaint);
                            }
                        } else {
                            android.graphics.Paint paint = this.tileBgPaint;
                            if (paint != null) {
                                canvas.drawRect(tile3.vRect, paint);
                            }
                            if (this.matrix == null) {
                                this.matrix = new android.graphics.Matrix();
                            }
                            this.matrix.reset();
                            tile = tile3;
                            setMatrixArray(this.srcArray, 0.0f, 0.0f, tile3.bitmap.getWidth(), 0.0f, tile3.bitmap.getWidth(), tile3.bitmap.getHeight(), 0.0f, tile3.bitmap.getHeight());
                            if (getRequiredRotation() == 0) {
                                float[] fArr2 = this.dstArray;
                                android.graphics.Rect rect = tile.vRect;
                                int i29 = rect.left;
                                int i37 = rect.top;
                                int i38 = rect.right;
                                int i39 = rect.bottom;
                                setMatrixArray(fArr2, i29, i37, i38, i37, i38, i39, i29, i39);
                            } else if (getRequiredRotation() == 90) {
                                float[] fArr3 = this.dstArray;
                                android.graphics.Rect rect2 = tile.vRect;
                                int i47 = rect2.right;
                                int i48 = rect2.top;
                                float f48 = i47;
                                int i49 = rect2.bottom;
                                int i57 = rect2.left;
                                setMatrixArray(fArr3, i47, i48, f48, i49, i57, i49, i57, i48);
                            } else if (getRequiredRotation() == 180) {
                                float[] fArr4 = this.dstArray;
                                android.graphics.Rect rect3 = tile.vRect;
                                int i58 = rect3.right;
                                int i59 = rect3.bottom;
                                int i66 = rect3.left;
                                int i67 = rect3.top;
                                setMatrixArray(fArr4, i58, i59, i66, i59, i66, i67, i58, i67);
                            } else if (getRequiredRotation() == 270) {
                                float[] fArr5 = this.dstArray;
                                android.graphics.Rect rect4 = tile.vRect;
                                int i68 = rect4.left;
                                int i69 = rect4.bottom;
                                float f49 = i68;
                                int i76 = rect4.top;
                                int i77 = rect4.right;
                                setMatrixArray(fArr5, i68, i69, f49, i76, i77, i76, i77, i69);
                            }
                            this.matrix.setPolyToPoly(this.srcArray, 0, this.dstArray, 0, 4);
                            if (!tile.bitmap.isRecycled()) {
                                com.tencent.mars.xlog.Log.i(this.TAG, "onDraw previewRotateFlip:%s tile.bitmap:%s tileSampleSize:%s tile.vRect:%s tile.bitmapSize: %s-%s matrix: %s", java.lang.Integer.valueOf(this.previewRotateFlip), tile.bitmap, java.lang.Integer.valueOf(tile.sampleSize), tile.vRect, java.lang.Integer.valueOf(tile.bitmap.getWidth()), java.lang.Integer.valueOf(tile.bitmap.getHeight()), this.matrix);
                                canvas.drawBitmap(tile.bitmap, this.matrix, this.bitmapPaint);
                            }
                            if (this.debug) {
                                canvas.drawRect(tile.vRect, this.debugLinePaint);
                            }
                        }
                        if (tile.visible && this.debug) {
                            canvas.drawText("ISS " + tile.sampleSize + " RECT " + tile.sRect.top + "," + tile.sRect.left + "," + tile.sRect.bottom + "," + tile.sRect.right, tile.vRect.left + px(5), tile.vRect.top + px(40), this.debugTextPaint);
                        }
                    }
                }
            }
        } else {
            android.graphics.Bitmap bitmap2 = this.bitmap;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                if (!this.bitmapIsPreview) {
                    drawBitmap(canvas);
                } else if (this.canDrawPreview) {
                    drawBitmap(canvas);
                }
            }
        }
        if (this.debug) {
            float f57 = this.vTranslate.x;
            float f58 = this.vTranslate.y;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Scale: ");
            java.util.Locale locale = java.util.Locale.ENGLISH;
            sb6.append(java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(this.scale)));
            sb6.append(" (");
            sb6.append(java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(minScale())));
            sb6.append(" - ");
            sb6.append(java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(this.maxScale)));
            sb6.append(")");
            canvas.drawText(sb6.toString(), px(5), px(15), this.debugTextPaint);
            canvas.drawText("Translate: " + java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(this.vTranslate.x)) + ":" + java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(this.vTranslate.y)), px(5), px(30), this.debugTextPaint);
            android.graphics.PointF center = getCenter();
            canvas.drawText("Source center: " + java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(center.x)) + ":" + java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(center.y)), px(5), px(45), this.debugTextPaint);
            canvas.drawText("Orientation: " + this.rawExifOrientation + " Hash@" + hashCode(), px(5), px(60), this.debugTextPaint);
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.Anim anim2 = this.anim;
            if (anim2 != null) {
                android.graphics.PointF sourceToViewCoord = sourceToViewCoord(anim2.sCenterStart);
                android.graphics.PointF sourceToViewCoord2 = sourceToViewCoord(this.anim.sCenterEndRequested);
                android.graphics.PointF sourceToViewCoord3 = sourceToViewCoord(this.anim.sCenterEnd);
                canvas.drawCircle(sourceToViewCoord.x, sourceToViewCoord.y, px(10), this.debugLinePaint);
                this.debugLinePaint.setColor(-65536);
                canvas.drawCircle(sourceToViewCoord2.x, sourceToViewCoord2.y, px(20), this.debugLinePaint);
                this.debugLinePaint.setColor(-16776961);
                canvas.drawCircle(sourceToViewCoord3.x, sourceToViewCoord3.y, px(25), this.debugLinePaint);
                this.debugLinePaint.setColor(-16711936);
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, px(30), this.debugLinePaint);
            }
            if (this.vCenterStart != null) {
                this.debugLinePaint.setColor(-65536);
                android.graphics.PointF pointF = this.vCenterStart;
                canvas.drawCircle(pointF.x, pointF.y, px(20), this.debugLinePaint);
            }
            if (this.quickScaleSCenter != null) {
                this.debugLinePaint.setColor(-16776961);
                canvas.drawCircle(sourceToViewX(this.quickScaleSCenter.x), sourceToViewY(this.quickScaleSCenter.y), px(35), this.debugLinePaint);
            }
            if (this.quickScaleVStart != null && this.isQuickScaling) {
                this.debugLinePaint.setColor(-12303292);
                android.graphics.PointF pointF2 = this.quickScaleVStart;
                canvas.drawCircle(pointF2.x, pointF2.y, px(30), this.debugLinePaint);
            }
            this.debugLinePaint.setColor(-65281);
        }
    }

    public synchronized void onImageLoaded(final android.graphics.Bitmap bitmap, final int i17, boolean z17) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener onImageEventListener;
        debug("onImageLoaded has bitmap", new java.lang.Object[0]);
        int i18 = this.sWidth;
        if (i18 > 0 && this.sHeight > 0 && (i18 != bitmap.getWidth() || this.sHeight != bitmap.getHeight())) {
            reset(false);
        }
        android.graphics.Bitmap bitmap2 = this.bitmap;
        if (bitmap2 != null && !this.bitmapIsCached) {
            bitmap2.recycle();
        }
        if (this.bitmap != null && this.bitmapIsCached && (onImageEventListener = this.onImageEventListener) != null) {
            onImageEventListener.onPreviewReleased();
        }
        this.bitmapIsPreview = false;
        this.bitmapIsCached = z17;
        this.bitmap = bitmap;
        this.sWidth = bitmap.getWidth();
        this.sHeight = bitmap.getHeight();
        this.sOrientation = i17;
        final boolean checkReady = checkReady();
        final boolean checkImageLoaded = checkImageLoaded();
        s75.d.b(new java.lang.Runnable() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.6
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                int i19 = i17;
                if (i19 != 0) {
                    com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this;
                    subsamplingScaleImageView.bitmap = subsamplingScaleImageView.rotateAndScaleBitmap(bitmap, i19, 1.0f, 1.0f);
                }
                com.tencent.mars.xlog.Log.i(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.TAG, "onImageLoaded rotaeAndScaleBitmap %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.post(new java.lang.Runnable() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnonymousClass6 anonymousClass6 = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnonymousClass6.this;
                        if (checkReady || checkImageLoaded) {
                            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.invalidate();
                            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.requestLayout();
                        }
                    }
                });
            }
        }, "rotateAndScaleBitmap");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        boolean z17 = true;
        boolean z18 = mode != 1073741824;
        boolean z19 = mode2 != 1073741824;
        if (this.sWidth > 0 && this.sHeight > 0) {
            if (z18 && z19) {
                size = sWidth();
                size2 = sHeight();
            } else if (z19) {
                size2 = (int) ((sHeight() / sWidth()) * size);
            } else if (z18) {
                size = (int) ((sWidth() / sHeight()) * size2);
            }
        }
        int max = java.lang.Math.max(size, getSuggestedMinimumWidth());
        int max2 = java.lang.Math.max(size2, getSuggestedMinimumHeight());
        setMeasuredDimension(max, max2);
        if (max == this.mViewWidth && max2 == this.mViewHeight) {
            z17 = false;
        } else {
            this.mViewWidth = max;
            this.mViewHeight = max2;
        }
        if (z17 && this.canRefresh) {
            invalidate();
        }
    }

    public synchronized void onPreviewLoaded(android.graphics.Bitmap bitmap, java.lang.Integer num) {
        com.tencent.mars.xlog.Log.i(this.TAG, "onPreviewLoaded");
        if (bitmap != null) {
            com.tencent.mars.xlog.Log.i(this.TAG, "onPreviewLoaded %d, recycle: %b", java.lang.Integer.valueOf(bitmap.hashCode()), java.lang.Boolean.valueOf(bitmap.isRecycled()));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.imageLoadedSent) {
            android.graphics.Bitmap bitmap2 = this.bitmap;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            return;
        }
        android.graphics.Rect rect = this.pRegion;
        if (rect != null) {
            if (rect.width() > 0 && this.pRegion.height() > 0) {
                android.graphics.Rect rect2 = this.pRegion;
                int i17 = rect2.left;
                int i18 = rect2.top;
                int width = rect2.width();
                int height = this.pRegion.height();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(width));
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(bitmap);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView", "onPreviewLoaded", "(Landroid/graphics/Bitmap;Ljava/lang/Integer;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                yj0.a.e(obj, createBitmap, "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView", "onPreviewLoaded", "(Landroid/graphics/Bitmap;Ljava/lang/Integer;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                this.bitmap = createBitmap;
                this.previewOrientation = 0;
            }
        } else if (num != null) {
            this.previewOrientation = num.intValue();
            this.bitmap = bitmap;
        } else {
            this.bitmap = bitmap;
        }
        this.bitmapIsPreview = true;
        this.canDrawPreview = false;
        this.previewWidth = this.bitmap.getWidth();
        this.previewHeight = this.bitmap.getHeight();
        initPreviewScale();
        this.canDrawPreview = true;
        if (checkReady()) {
            invalidate();
            requestLayout();
        }
        addPreviewLoadedTime((int) (java.lang.System.currentTimeMillis() - currentTimeMillis));
        onPreviewLoaded();
    }

    public void onReady() {
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        debug("onSizeChanged %dx%d -> %dx%d scale: %f, pendingScale: %f, needPendingScale: %b", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(this.scale), this.pendingScale, java.lang.Boolean.valueOf(this.mNeedPendingScale));
        initScaleRate();
        android.graphics.PointF center = getCenter();
        if ((this.readySent || this.mNeedPendingScale) && center != null) {
            this.anim = null;
            if (this.mNeedPendingScale) {
                return;
            }
            this.pendingScale = java.lang.Float.valueOf(this.scale);
            this.sPendingCenter = center;
        }
    }

    public synchronized void onTileLoaded(com.davemorrissey.labs.subscaleview.model.Tile tile) {
        android.graphics.Bitmap bitmap;
        this.fullImageTileLoadedStart = java.lang.System.currentTimeMillis();
        android.graphics.Rect rect = tile.sRect;
        boolean z17 = rect != null && rect.top == 0;
        android.graphics.Bitmap bitmap2 = tile.bitmap;
        if ((z17 || tile.sRect == null) && tile.sampleSize == this.fullImageSampleSize && tile.bitmap != null && this.isFirstLoadFullImage) {
            com.tencent.mars.xlog.Log.i(this.TAG, "onTileLoaded set fullImageBitmap");
            this.isFirstLoadFullImage = false;
            this.fullImageBitmap = tile.bitmap;
        }
        checkReady();
        checkImageLoaded();
        if (isBaseLayerReady() && (bitmap = this.bitmap) != null) {
            if (!this.bitmapIsCached) {
                bitmap.recycle();
            }
            this.bitmap = null;
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener onImageEventListener = this.onImageEventListener;
            if (onImageEventListener != null && this.bitmapIsCached) {
                onImageEventListener.onPreviewReleased();
            }
            this.bitmapIsPreview = false;
            this.bitmapIsCached = false;
        }
        invalidate();
    }

    public synchronized void onTilesInited(com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder imageRegionDecoder, int i17, int i18, int i19) {
        int i27;
        int i28;
        int i29;
        int i37;
        debug("onTilesInited sWidth: %d, sHeight: %d, this.sWidth: %d, this.sHeight: %d, sOrientation: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.sWidth), java.lang.Integer.valueOf(this.sHeight), java.lang.Integer.valueOf(i19));
        int i38 = this.sWidth;
        if (i38 > 0 && (i37 = this.sHeight) > 0 && (i38 != i17 || i37 != i18)) {
            reset(false);
            android.graphics.Bitmap bitmap = this.bitmap;
            if (bitmap != null) {
                if (!this.bitmapIsCached) {
                    bitmap.recycle();
                }
                this.bitmap = null;
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener onImageEventListener = this.onImageEventListener;
                if (onImageEventListener != null && this.bitmapIsCached) {
                    onImageEventListener.onPreviewReleased();
                }
                this.bitmapIsPreview = false;
                this.bitmapIsCached = false;
            }
        }
        this.decoder = imageRegionDecoder;
        this.sWidth = i17;
        this.sHeight = i18;
        this.sOrientation = i19;
        checkReady();
        if (!checkImageLoaded() && (i27 = this.maxTileWidth) > 0 && i27 != (i28 = TILE_SIZE_AUTO) && (i29 = this.maxTileHeight) > 0 && i29 != i28 && getWidth() > 0 && getHeight() > 0) {
            initialiseBaseLayer(new android.graphics.Point(this.maxTileWidth, this.maxTileHeight));
        }
        invalidate();
        requestLayout();
        java.lang.System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        if (r11 != false) goto L48;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public java.util.concurrent.Executor provideExecutor() {
        return this.executor;
    }

    public void recycle() {
        reset(true);
        this.bitmapPaint = null;
        this.debugTextPaint = null;
        this.debugLinePaint = null;
        this.tileBgPaint = null;
    }

    public void refreshRequiredTiles(boolean z17) {
        if (this.decoder == null || this.tileMap == null) {
            return;
        }
        int min = java.lang.Math.min(this.fullImageSampleSize, calculateInSampleSize(this.scale));
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, java.util.List<com.davemorrissey.labs.subscaleview.model.Tile>>> it = this.tileMap.entrySet().iterator();
        while (it.hasNext()) {
            for (com.davemorrissey.labs.subscaleview.model.Tile tile : it.next().getValue()) {
                int i17 = tile.sampleSize;
                if (i17 < min || (i17 > min && i17 != this.fullImageSampleSize)) {
                    tile.visible = false;
                    android.graphics.Bitmap bitmap = tile.bitmap;
                    if (bitmap != null) {
                        bitmap.recycle();
                        tile.bitmap = null;
                    }
                }
                int i18 = tile.sampleSize;
                if (i18 == min) {
                    if (tileVisible(tile)) {
                        tile.visible = true;
                        if (!tile.loading && tile.bitmap == null && z17) {
                            newLoadTask(tile);
                        }
                    } else if (tile.sampleSize != this.fullImageSampleSize) {
                        tile.visible = false;
                        android.graphics.Bitmap bitmap2 = tile.bitmap;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            tile.bitmap = null;
                        }
                    }
                } else if (i18 == this.fullImageSampleSize) {
                    tile.visible = true;
                }
            }
        }
    }

    public final void resetScaleAndCenter() {
        this.anim = null;
        this.pendingScale = java.lang.Float.valueOf(limitedScale(0.0f));
        if (isReady()) {
            this.sPendingCenter = new android.graphics.PointF(sWidth() / 2, sHeight() / 2);
        } else {
            this.sPendingCenter = new android.graphics.PointF(0.0f, 0.0f);
        }
        invalidate();
    }

    public void resetSize() {
        setScaleAndCenter(this.mScaleRate, new android.graphics.PointF(0.0f, 0.0f));
    }

    public android.graphics.Bitmap rotateAndScaleBitmap(android.graphics.Bitmap bitmap, int i17, float f17, float f18) {
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e(this.TAG, "rotateAndScaleBitmap bitmap is null");
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(f17, f18);
        if (i17 != 0) {
            matrix.postRotate(i17);
        }
        matrix.isIdentity();
        bitmap.getWidth();
        bitmap.getHeight();
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            if (matrix.isIdentity()) {
                return bitmap;
            }
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                aVar.c(java.lang.Boolean.TRUE);
                aVar.c(matrix);
                aVar.c(java.lang.Integer.valueOf(height));
                aVar.c(java.lang.Integer.valueOf(width));
                aVar.c(0);
                aVar.c(0);
                aVar.c(bitmap);
                java.lang.Object obj = new java.lang.Object();
                yj0.a.d(obj, aVar.b(), "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView", "rotateAndScaleBitmap", "(Landroid/graphics/Bitmap;IFF)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                yj0.a.e(obj, createBitmap, "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView", "rotateAndScaleBitmap", "(Landroid/graphics/Bitmap;IFF)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                return createBitmap;
            } catch (java.lang.OutOfMemoryError e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.TAG, e17, "createBitmap oom", new java.lang.Object[0]);
                preferredBitmapConfig = android.graphics.Bitmap.Config.RGB_565;
            }
        }
        return null;
    }

    public void setAllowInterceptTouchEvent(boolean z17) {
        this.allowInterceptTouch = z17;
    }

    public void setAnimationProgress(float f17, boolean z17) {
        this.enter = z17;
        this.animationProgress = f17;
        invalidate();
    }

    public void setAnimationScale(float f17) {
        this.animationScale = f17;
    }

    public final void setBitmapDecoderClass(java.lang.Class<? extends com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder> cls) {
        if (cls == null) {
            throw new java.lang.IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.bitmapDecoderFactory = new com.davemorrissey.labs.subscaleview.decoder.CompatDecoderFactory(cls);
    }

    public final void setBitmapDecoderFactory(com.davemorrissey.labs.subscaleview.decoder.DecoderFactory<? extends com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder> decoderFactory) {
        if (decoderFactory == null) {
            throw new java.lang.IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.bitmapDecoderFactory = decoderFactory;
    }

    public void setCanRefresh(boolean z17) {
        this.canRefresh = z17;
    }

    public void setCustomPlaceHolderBitmap(android.graphics.Bitmap bitmap) {
        this.bitmap = bitmap;
        this.canDrawPreview = true;
        invalidate();
    }

    public final void setDebug(boolean z17) {
        this.debug = z17;
    }

    public void setDoubleTabZoomToNormal(boolean z17) {
        this.enableZoomToNormal = z17;
    }

    public final void setDoubleTapZoomDpi(int i17) {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i17);
    }

    public final void setDoubleTapZoomDuration(int i17) {
        this.doubleTapZoomDuration = java.lang.Math.max(0, i17);
    }

    public final void setDoubleTapZoomScale(float f17) {
        this.doubleTapZoomScale = f17;
    }

    public final void setDoubleTapZoomStyle(int i17) {
        if (VALID_ZOOM_STYLES.contains(java.lang.Integer.valueOf(i17))) {
            this.doubleTapZoomStyle = i17;
        } else {
            throw new java.lang.IllegalArgumentException("Invalid zoom style: " + i17);
        }
    }

    public void setDrawFullSampleSizeBitmap(boolean z17) {
        if (this.openHardware || this.mDrawFullSampleSizeBitmap == z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.TAG, "setDrawFullSampleSizeBitmap %s", java.lang.Boolean.valueOf(z17));
        this.mDrawFullSampleSizeBitmap = z17;
        invalidate();
    }

    public void setEagerLoadingEnabled(boolean z17) {
        this.eagerLoadingEnabled = z17;
    }

    public void setEdgeSwipeListener(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.EdgeSwipeListener edgeSwipeListener) {
        this.mEdgeSwipeListener = edgeSwipeListener;
    }

    public void setExecutor(java.util.concurrent.Executor executor) {
        if (executor == null) {
            throw new java.lang.NullPointerException("Executor must not be null");
        }
        this.executor = executor;
    }

    public void setFitWidth(boolean z17) {
        this.fitWidth = z17;
    }

    public void setGestureDetectorListener(android.view.GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.gestureDetectorListener = simpleOnGestureListener;
    }

    public final void setImage(com.davemorrissey.labs.subscaleview.view.ImageSource imageSource) {
        setImage(imageSource, null, null);
    }

    public void setImageViewMatrix(android.graphics.Matrix matrix) {
        if (this.vTranslate == null) {
            this.vTranslate = new android.graphics.PointF();
        }
        matrix.getValues(this.matrixValues);
        android.graphics.PointF pointF = this.vTranslate;
        float[] fArr = this.matrixValues;
        pointF.set(fArr[2], fArr[5]);
        updateScale(this.matrixValues[0]);
        fitToBounds(false);
        invalidate();
    }

    public void setInternalTouchEventConsumed(boolean z17) {
        this.IsinternalTouchEventConsumed = z17;
    }

    public synchronized void setLastTileTimeStamp() {
        this.mImageDecodeRecord.setLastTileTimeStamp();
    }

    public final void setMaxScale(float f17) {
        this.maxScale = f17;
    }

    public void setMaxTileSize(int i17) {
        this.maxTileWidth = i17;
        this.maxTileHeight = i17;
    }

    public final void setMaximumDpi(int i17) {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i17);
    }

    public final void setMinScale(float f17) {
        this.minScale = f17;
    }

    public final void setMinimumDpi(int i17) {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i17);
    }

    public final void setMinimumScaleType(int i17) {
        if (!VALID_SCALE_TYPES.contains(java.lang.Integer.valueOf(i17))) {
            throw new java.lang.IllegalArgumentException("Invalid scale type: " + i17);
        }
        this.minimumScaleType = i17;
        if (isReady()) {
            fitToBounds(true);
            invalidate();
        }
    }

    public void setMinimumTileDpi(int i17) {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.minimumTileDpi = (int) java.lang.Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, i17);
        if (isReady()) {
            reset(false);
            invalidate();
        }
    }

    public void setOnAttachStateChangeListener(android.view.View.OnAttachStateChangeListener onAttachStateChangeListener) {
        this.onAttachStateChangeListener = onAttachStateChangeListener;
    }

    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.onDoubleTapListener = onDoubleTapListener;
    }

    public void setOnImageEventListener(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener onImageEventListener) {
        this.onImageEventListener = onImageEventListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.onLongClickListener = onLongClickListener;
    }

    public void setOnStateChangedListener(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener onStateChangedListener) {
        this.onStateChangedListener = onStateChangedListener;
    }

    public void setOpenHardware(boolean z17) {
        this.openHardware = z17;
    }

    public final void setOrientation(int i17) {
        if (!VALID_ORIENTATIONS.contains(java.lang.Integer.valueOf(i17))) {
            throw new java.lang.IllegalArgumentException("Invalid orientation: " + i17);
        }
        this.orientation = i17;
        reset(false);
        invalidate();
        requestLayout();
    }

    public final void setPanEnabled(boolean z17) {
        android.graphics.PointF pointF;
        this.panEnabled = z17;
        if (z17 || (pointF = this.vTranslate) == null) {
            return;
        }
        pointF.x = (getWidth() / 2) - (this.scale * (sWidth() / 2));
        this.vTranslate.y = (getHeight() / 2) - (this.scale * (sHeight() / 2));
        if (isReady()) {
            refreshRequiredTiles(true);
            invalidate();
        }
    }

    public final void setPanLimit(int i17) {
        if (!VALID_PAN_LIMITS.contains(java.lang.Integer.valueOf(i17))) {
            throw new java.lang.IllegalArgumentException("Invalid pan limit: " + i17);
        }
        this.panLimit = i17;
        if (isReady()) {
            fitToBounds(true);
            invalidate();
        }
    }

    public void setPreviewDone(boolean z17) {
        this.mPreviewDone = z17;
        invalidate();
    }

    public final void setQuickScaleEnabled(boolean z17) {
        this.quickScaleEnabled = z17;
    }

    public final void setRegionDecoderClass(java.lang.Class<? extends com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder> cls) {
        if (cls == null) {
            throw new java.lang.IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.regionDecoderFactory = new com.davemorrissey.labs.subscaleview.decoder.CompatDecoderFactory(cls);
    }

    public final void setRegionDecoderFactory(com.davemorrissey.labs.subscaleview.decoder.DecoderFactory<? extends com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder> decoderFactory) {
        if (decoderFactory == null) {
            throw new java.lang.IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.regionDecoderFactory = decoderFactory;
    }

    public final void setScaleAndCenter(float f17, android.graphics.PointF pointF) {
        this.anim = null;
        this.mNeedPendingScale = true;
        this.pendingScale = java.lang.Float.valueOf(f17);
        this.sPendingCenter = pointF;
        this.sRequestedCenter = pointF;
        invalidate();
    }

    public void setScaleChangeReportListener(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleChangeReportListener scaleChangeReportListener) {
        this.scaleChangeReportListener = scaleChangeReportListener;
    }

    public void setScaleRate(float f17) {
        this.mScaleRate = f17;
        resetScales();
        initMaxScale();
        initMinScale();
    }

    public final void setTileBackgroundColor(int i17) {
        if (android.graphics.Color.alpha(i17) == 0) {
            this.tileBgPaint = null;
        } else {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.tileBgPaint = paint;
            paint.setStyle(android.graphics.Paint.Style.FILL);
            this.tileBgPaint.setColor(i17);
        }
        invalidate();
    }

    public final void setZoomEnabled(boolean z17) {
        this.zoomEnabled = z17;
    }

    public void setsRegion(android.graphics.Rect rect) {
        this.sRegion = rect;
    }

    public final android.graphics.PointF sourceToViewCoord(android.graphics.PointF pointF) {
        return sourceToViewCoord(pointF.x, pointF.y, new android.graphics.PointF());
    }

    public float startRevertAnimation() {
        return doubleTapZoom(viewToSourceCoord(new android.graphics.PointF(sWidth() / 2, sHeight() / 2)), (android.graphics.PointF) null);
    }

    public void viewToFileRect(android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (this.vTranslate == null || !this.readySent) {
            return;
        }
        rect2.set((int) viewToSourceX(rect.left), (int) viewToSourceY(rect.top), (int) viewToSourceX(rect.right), (int) viewToSourceY(rect.bottom));
        fileSRect(rect2, rect2);
        rect2.set(java.lang.Math.max(0, rect2.left), java.lang.Math.max(0, rect2.top), java.lang.Math.min(this.sWidth, rect2.right), java.lang.Math.min(this.sHeight, rect2.bottom));
        android.graphics.Rect rect3 = this.sRegion;
        if (rect3 != null) {
            rect2.offset(rect3.left, rect3.top);
        }
    }

    public final android.graphics.PointF viewToSourceCoord(android.graphics.PointF pointF) {
        return viewToSourceCoord(pointF.x, pointF.y, new android.graphics.PointF());
    }

    public void visibleFileRect(android.graphics.Rect rect) {
        if (this.vTranslate == null || !this.readySent) {
            return;
        }
        rect.set(0, 0, getWidth(), getHeight());
        viewToFileRect(rect, rect);
    }

    public void zoomToWithAnimation(float f17, float f18, float f19) {
        new com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder(f17, viewToSourceCoord(new android.graphics.PointF(f18, f19))).withInterruptible(false).withDuration(this.doubleTapZoomDuration).withOrigin(4).start();
        invalidate();
    }

    public final void setImage(com.davemorrissey.labs.subscaleview.view.ImageSource imageSource, com.davemorrissey.labs.subscaleview.view.ImageViewState imageViewState) {
        setImage(imageSource, null, imageViewState);
    }

    public final android.graphics.PointF sourceToViewCoord(float f17, float f18) {
        return sourceToViewCoord(f17, f18, new android.graphics.PointF());
    }

    public final android.graphics.PointF viewToSourceCoord(float f17, float f18) {
        return viewToSourceCoord(f17, f18, new android.graphics.PointF());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float doubleTapZoom(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        if (!this.panEnabled) {
            android.graphics.PointF pointF3 = this.sRequestedCenter;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = pointF3.y;
            } else {
                pointF.x = sWidth() / 2;
                pointF.y = sHeight() / 2;
            }
        }
        float doubleTapZoomScale = getDoubleTapZoomScale();
        float f17 = this.scale;
        double d17 = doubleTapZoomScale * 0.9d;
        boolean z17 = ((double) f17) <= d17 || f17 == this.mScaleRate;
        if (this.enableZoomToNormal && f17 > this.mScaleRate && f17 <= d17) {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i(this.TAG, "doubleTapZoom %f, scale: %s, mScaleRate: %s, zoomIn: %b", java.lang.Float.valueOf(doubleTapZoomScale), java.lang.Float.valueOf(this.scale), java.lang.Float.valueOf(this.mScaleRate), java.lang.Boolean.valueOf(z17));
        if (!z17) {
            doubleTapZoomScale = this.mScaleRate;
        }
        float f18 = doubleTapZoomScale;
        int i17 = this.doubleTapZoomStyle;
        if (i17 == 3) {
            setScaleAndCenter(f18, pointF);
        } else if (i17 == 2 || !z17 || !this.panEnabled) {
            new com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder(f18, pointF).withInterruptible(false).withDuration(this.doubleTapZoomDuration).withOrigin(4).start();
        } else if (i17 == 1) {
            new com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder(f18, pointF, pointF2).withInterruptible(false).withDuration(this.doubleTapZoomDuration).withOrigin(4).start();
        }
        invalidate();
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleChangeReportListener scaleChangeReportListener = this.scaleChangeReportListener;
        if (scaleChangeReportListener != null) {
            scaleChangeReportListener.onDoubleClickScale(f18);
        }
        return f18;
    }

    public final void setImage(com.davemorrissey.labs.subscaleview.view.ImageSource imageSource, com.davemorrissey.labs.subscaleview.view.ImageSource imageSource2) {
        setImage(imageSource, imageSource2, null);
    }

    public void setMaxTileSize(int i17, int i18) {
        this.maxTileWidth = i17;
        this.maxTileHeight = i18;
    }

    public final android.graphics.PointF sourceToViewCoord(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        return sourceToViewCoord(pointF.x, pointF.y, pointF2);
    }

    public final android.graphics.PointF viewToSourceCoord(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        return viewToSourceCoord(pointF.x, pointF.y, pointF2);
    }

    /* loaded from: classes15.dex */
    public final class AnimationBuilder {
        private long duration;
        private int easing;
        private boolean interruptible;
        private com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnAnimationEventListener listener;
        private int origin;
        private boolean panLimited;
        private final android.graphics.PointF targetSCenter;
        private final float targetScale;
        private final android.graphics.PointF vFocus;

        /* JADX INFO: Access modifiers changed from: private */
        public com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder withOrigin(int i17) {
            this.origin = i17;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder withPanLimited(boolean z17) {
            this.panLimited = z17;
            return this;
        }

        public void start() {
            android.graphics.PointF pointF;
            if (com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim != null && com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.listener != null) {
                try {
                    com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.listener.onInterruptedByNewAnim();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.TAG, "Error thrown by animation listener", e17);
                }
            }
            int paddingLeft = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.getPaddingLeft() + (((com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.getWidth() - com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.getPaddingRight()) - com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.getPaddingLeft()) / 2);
            int paddingTop = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.getPaddingTop() + (((com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.getHeight() - com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.getPaddingBottom()) - com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.getPaddingTop()) / 2);
            float limitedScale = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.limitedScale(this.targetScale);
            if (this.panLimited) {
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this;
                android.graphics.PointF pointF2 = this.targetSCenter;
                pointF = subsamplingScaleImageView.limitedSCenter(pointF2.x, pointF2.y, limitedScale, new android.graphics.PointF());
            } else {
                pointF = this.targetSCenter;
            }
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim = new com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.Anim();
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.scaleStart = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.scale;
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.scaleEnd = limitedScale;
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.time = java.lang.System.currentTimeMillis();
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.sCenterEndRequested = pointF;
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.sCenterStart = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.getCenter();
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.sCenterEnd = pointF;
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.vFocusStart = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.sourceToViewCoord(pointF);
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.vFocusEnd = new android.graphics.PointF(paddingLeft, paddingTop);
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.duration = this.duration;
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.interruptible = this.interruptible;
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.easing = this.easing;
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.origin = this.origin;
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.time = java.lang.System.currentTimeMillis();
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.listener = this.listener;
            android.graphics.PointF pointF3 = this.vFocus;
            if (pointF3 != null) {
                float f17 = pointF3.x - (com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.sCenterStart.x * limitedScale);
                float f18 = this.vFocus.y - (com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.sCenterStart.y * limitedScale);
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleAndTranslate scaleAndTranslate = new com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleAndTranslate(limitedScale, new android.graphics.PointF(f17, f18));
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.fitToBounds(true, scaleAndTranslate);
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.anim.vFocusEnd = new android.graphics.PointF(this.vFocus.x + (scaleAndTranslate.vTranslate.x - f17), this.vFocus.y + (scaleAndTranslate.vTranslate.y - f18));
            }
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.invalidate();
        }

        public com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder withDuration(long j17) {
            this.duration = j17;
            return this;
        }

        public com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder withEasing(int i17) {
            if (com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.VALID_EASING_STYLES.contains(java.lang.Integer.valueOf(i17))) {
                this.easing = i17;
                return this;
            }
            throw new java.lang.IllegalArgumentException("Unknown easing type: " + i17);
        }

        public com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder withInterruptible(boolean z17) {
            this.interruptible = z17;
            return this;
        }

        public com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.AnimationBuilder withOnAnimationEventListener(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnAnimationEventListener onAnimationEventListener) {
            this.listener = onAnimationEventListener;
            return this;
        }

        private AnimationBuilder(android.graphics.PointF pointF) {
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.scale;
            this.targetSCenter = pointF;
            this.vFocus = null;
        }

        private AnimationBuilder(float f17) {
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f17;
            this.targetSCenter = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.getCenter();
            this.vFocus = null;
        }

        private AnimationBuilder(float f17, android.graphics.PointF pointF) {
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f17;
            this.targetSCenter = pointF;
            this.vFocus = null;
        }

        private AnimationBuilder(float f17, android.graphics.PointF pointF, android.graphics.PointF pointF2) {
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f17;
            this.targetSCenter = pointF;
            this.vFocus = pointF2;
        }
    }

    public final void setImage(com.davemorrissey.labs.subscaleview.view.ImageSource imageSource, com.davemorrissey.labs.subscaleview.view.ImageSource imageSource2, com.davemorrissey.labs.subscaleview.view.ImageViewState imageViewState) {
        android.net.Uri uri;
        if (imageSource != null) {
            this.mMainImageSource = imageSource;
            this.mPreviewSource = imageSource2;
            reset(true);
            if (imageViewState != null) {
                restoreState(imageViewState);
            }
            if (imageSource.getUri() != null) {
                this.sOrientation = getExifOrientationInternal(getContext(), imageSource.getUri(), true);
            }
            if (imageSource2 != null) {
                imageSource.getBitmap();
                if (imageSource.getSWidth() > 0 && imageSource.getSHeight() > 0) {
                    this.sWidth = imageSource.getSWidth();
                    this.sHeight = imageSource.getSHeight();
                    this.pRegion = imageSource2.getSRegion();
                    if (imageSource2.getBitmap() != null) {
                        this.bitmapIsCached = imageSource2.isCached();
                        onPreviewLoaded(imageSource2.getBitmap(), 0);
                    } else {
                        android.net.Uri uri2 = imageSource2.getUri();
                        if (uri2 != null || imageSource2.getResource() == null) {
                            uri = uri2;
                        } else {
                            uri = android.net.Uri.parse("android.resource://" + getContext().getPackageName() + "/" + imageSource2.getResource());
                        }
                        mBitmapLoader.newInstance(this, getContext(), this.bitmapDecoderFactory, uri, true).startLoad();
                    }
                } else {
                    com.tencent.mars.xlog.Log.e(this.TAG, "Preview image cannot be used unless dimensions are provided for the main image");
                }
            }
            if (imageSource.getBitmap() != null && imageSource.getSRegion() != null) {
                android.graphics.Bitmap bitmap = imageSource.getBitmap();
                int i17 = imageSource.getSRegion().left;
                int i18 = imageSource.getSRegion().top;
                int width = imageSource.getSRegion().width();
                int height = imageSource.getSRegion().height();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(width));
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(bitmap);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView", "setImage", "(Lcom/davemorrissey/labs/subscaleview/view/ImageSource;Lcom/davemorrissey/labs/subscaleview/view/ImageSource;Lcom/davemorrissey/labs/subscaleview/view/ImageViewState;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                yj0.a.e(obj, createBitmap, "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView", "setImage", "(Lcom/davemorrissey/labs/subscaleview/view/ImageSource;Lcom/davemorrissey/labs/subscaleview/view/ImageSource;Lcom/davemorrissey/labs/subscaleview/view/ImageViewState;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                onImageLoaded(createBitmap, 0, false);
                return;
            }
            if (imageSource.getBitmap() != null) {
                onImageLoaded(imageSource.getBitmap(), 0, imageSource.isCached());
                return;
            }
            this.sRegion = imageSource.getSRegion();
            android.net.Uri uri3 = imageSource.getUri();
            this.uri = uri3;
            if (uri3 == null && imageSource.getResource() != null) {
                this.uri = android.net.Uri.parse("android.resource://" + getContext().getPackageName() + "/" + imageSource.getResource());
            }
            if (!imageSource.getTile() && this.sRegion == null) {
                mBitmapLoader.newInstance(this, getContext(), this.bitmapDecoderFactory, this.uri, false).startLoad();
                return;
            } else {
                mTileInitLoader.newInstance(this, getContext(), this.regionDecoderFactory, this.uri).startLoad();
                return;
            }
        }
        throw new java.lang.NullPointerException("imageSource must not be null");
    }

    public final android.graphics.PointF sourceToViewCoord(float f17, float f18, android.graphics.PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(sourceToViewX(f17), sourceToViewY(f18));
        return pointF;
    }

    public final android.graphics.PointF viewToSourceCoord(float f17, float f18, android.graphics.PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(viewToSourceX(f17), viewToSourceY(f18));
        return pointF;
    }

    public void onImageLoaded() {
        com.tencent.mars.xlog.Log.i(this.TAG, "onImageLoaded");
        initScaleRate();
        setScaleAndCenter(this.mScaleRate, new android.graphics.PointF(0.0f, 0.0f));
        if (this.fullImageTileLoadedStart != -1) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.fullImageTileLoadedEnd = currentTimeMillis;
            addTileDecodeTime((int) (currentTimeMillis - this.fullImageTileLoadedStart));
        }
        s75.d.b(new java.lang.Runnable() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.7
            @Override // java.lang.Runnable
            public void run() {
                if (com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.fullImageBitmap != null && !com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.fullImageBitmap.isRecycled()) {
                    com.tencent.mars.xlog.Log.i(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.TAG, "rotateAndScale fullImageBitmap");
                    com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this;
                    subsamplingScaleImageView.fullImageBitmap = subsamplingScaleImageView.rotateAndScaleBitmap(subsamplingScaleImageView.fullImageBitmap, com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.sOrientation, 1.0f, 1.0f);
                }
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.post(new java.lang.Runnable() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.onImageEventListener != null) {
                            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.onImageEventListener.onImageLoaded(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.this.fullImageBitmap);
                        }
                    }
                });
            }
        }, "rotateAndScaleFullImageBitmap");
    }

    public void fitToBounds(boolean z17) {
        boolean z18;
        float f17 = 0.0f;
        if (this.vTranslate == null) {
            this.vTranslate = new android.graphics.PointF(0.0f, 0.0f);
            z18 = true;
        } else {
            z18 = false;
        }
        if (this.satTemp == null) {
            this.satTemp = new com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleAndTranslate(f17, new android.graphics.PointF(0.0f, 0.0f));
        }
        this.satTemp.scale = this.scale;
        this.satTemp.vTranslate.set(this.vTranslate);
        fitToBounds(z17, this.satTemp);
        this.scale = this.satTemp.scale;
        this.vTranslate.set(this.satTemp.vTranslate);
        if (!z18 || this.minimumScaleType == 4) {
            return;
        }
        this.vTranslate.set(vTranslateForSCenter(sWidth() / 2, sHeight() / 2, this.scale));
    }

    private void onPreviewLoaded() {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener onImageEventListener;
        com.tencent.mars.xlog.Log.i(this.TAG, "onPreviewLoaded");
        if (this.isPreviewLoaded || (onImageEventListener = this.onImageEventListener) == null) {
            return;
        }
        onImageEventListener.onPreviewLoaded();
    }

    public SubsamplingScaleImageView(android.content.Context context) {
        this(context, null);
    }
}
