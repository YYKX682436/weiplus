package com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5;

/* renamed from: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView */
/* loaded from: classes15.dex */
public class C1451x2b77465d extends android.view.View {

    /* renamed from: EASE_IN_OUT_QUAD */
    public static final int f4506x18cf52c1 = 2;

    /* renamed from: EASE_OUT_QUAD */
    public static final int f4507x9468cce9 = 1;

    /* renamed from: MAX_TILE_SIZE */
    private static final int f4508xfc8621b7 = 10000;

    /* renamed from: MESSAGE_LONG_CLICK */
    private static final int f4509x34d1453d = 1;

    /* renamed from: ORIENTATION_0 */
    public static final int f4510xa30ae961 = 0;

    /* renamed from: ORIENTATION_180 */
    public static final int f4511xbf61fda = 180;

    /* renamed from: ORIENTATION_270 */
    public static final int f4512xbf6237c = 270;

    /* renamed from: ORIENTATION_90 */
    public static final int f4513xbe524406 = 90;

    /* renamed from: ORIENTATION_USE_EXIF */
    public static final int f4514xb1297697 = -1;

    /* renamed from: ORIGIN_ANIM */
    public static final int f4515xe92ad78a = 1;

    /* renamed from: ORIGIN_DOUBLE_TAP_ZOOM */
    public static final int f4516xdc8434a4 = 4;

    /* renamed from: ORIGIN_FLING */
    public static final int f4517x3c75a6e3 = 3;

    /* renamed from: ORIGIN_TOUCH */
    public static final int f4518x3d3c78c6 = 2;

    /* renamed from: PAN_LIMIT_CENTER */
    public static final int f4519x4fa55dfb = 3;

    /* renamed from: PAN_LIMIT_INSIDE */
    public static final int f4520x5a6361a2 = 1;

    /* renamed from: PAN_LIMIT_OUTSIDE */
    public static final int f4521x3b72d89f = 2;

    /* renamed from: SCALE_TYPE_CENTER_CROP */
    public static final int f4522x92d5012a = 2;

    /* renamed from: SCALE_TYPE_CENTER_INSIDE */
    public static final int f4523x3b9fd416 = 1;

    /* renamed from: SCALE_TYPE_CUSTOM */
    public static final int f4524x694b4081 = 3;

    /* renamed from: SCALE_TYPE_START */
    public static final int f4525x35d2a932 = 4;

    /* renamed from: TILE_SIZE_AUTO */
    public static int f4526xf733d2dc = 0;

    /* renamed from: VALID_EASING_STYLES */
    private static final java.util.List<java.lang.Integer> f4527x518f3b53;

    /* renamed from: VALID_ORIENTATIONS */
    private static final java.util.List<java.lang.Integer> f4528xc2d62426;

    /* renamed from: VALID_PAN_LIMITS */
    private static final java.util.List<java.lang.Integer> f4529xbf31ce5d;

    /* renamed from: VALID_SCALE_TYPES */
    private static final java.util.List<java.lang.Integer> f4530x44c1d921;

    /* renamed from: VALID_ZOOM_STYLES */
    private static final java.util.List<java.lang.Integer> f4531x98fb16eb;

    /* renamed from: ZOOM_FOCUS_CENTER */
    public static final int f4532x21957ea8 = 2;

    /* renamed from: ZOOM_FOCUS_CENTER_IMMEDIATE */
    public static final int f4533xc1c30eba = 3;

    /* renamed from: ZOOM_FOCUS_FIXED */
    public static final int f4534x85629aa1 = 1;

    /* renamed from: isUsingZoomOpt */
    private static final boolean f4535x4955af06;

    /* renamed from: mBitmapLoader */
    private static com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1443x7d6b97f f4536x76d4472f = null;

    /* renamed from: mReporter */
    public static com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.IReporter f4537xb898c6e = null;

    /* renamed from: mTileInitLoader */
    private static com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1445xd16cd870 f4538xaa1dac5e = null;

    /* renamed from: mTileLoader */
    private static com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1446xeee9d020 f4539x97592cae = null;

    /* renamed from: needScaleRate */
    private static final float f4540xb7cff554 = 0.7f;

    /* renamed from: preferredBitmapConfig */
    private static android.graphics.Bitmap.Config f4541x8a682872;

    /* renamed from: reportRate */
    private static final int f4542x731d5c34;

    /* renamed from: IsinternalTouchEventConsumed */
    public boolean f4543xf8cf3e0a;
    private final java.lang.String TAG;

    /* renamed from: _hellAccFlag_ */
    private byte f4544x7f11beae;

    /* renamed from: allowInterceptTouch */
    private boolean f4545x9fc87346;

    /* renamed from: anim */
    private com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.Anim f4546x2dc211;

    /* renamed from: animationProgress */
    private float f4547xdad87dd1;

    /* renamed from: animationScale */
    private float f4548xa90d9026;

    /* renamed from: bitmap */
    private android.graphics.Bitmap f4549xad38f12f;

    /* renamed from: bitmapDecoderFactory */
    private com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1433xf1915446<? extends com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135> f4550x2b190735;

    /* renamed from: bitmapIsCached */
    private boolean f4551x74c4e93b;

    /* renamed from: bitmapIsPreview */
    private boolean f4552xf0ae3ecf;

    /* renamed from: bitmapPaint */
    private android.graphics.Paint f4553x6a7e7c6f;

    /* renamed from: canDrawPreview */
    private boolean f4554x240ebff4;

    /* renamed from: canRefresh */
    private boolean f4555xed0140eb;

    /* renamed from: cancelled */
    private boolean f4556x1c682951;

    /* renamed from: debug */
    private boolean f4557x5b09653;

    /* renamed from: debugLinePaint */
    private android.graphics.Paint f4558xa7f027b7;

    /* renamed from: debugTextPaint */
    private android.graphics.Paint f4559xd525ee1e;

    /* renamed from: decoder */
    private com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135 f4560x5befac44;

    /* renamed from: decoderLock */
    private final java.util.concurrent.locks.ReadWriteLock f4561x481c238f;

    /* renamed from: density */
    private float f4562x5c8c94e8;

    /* renamed from: detector */
    private android.view.GestureDetector f4563x3e7b17c6;

    /* renamed from: doubleTapZoomDuration */
    private int f4564xe7ec09b9;

    /* renamed from: doubleTapZoomScale */
    private float f4565x4de84745;

    /* renamed from: doubleTapZoomStyle */
    private int f4566x4df05bac;

    /* renamed from: dstArray */
    private float[] f4567x211dcf94;

    /* renamed from: dstRect */
    private final android.graphics.Rect f4568x74b5e949;

    /* renamed from: eagerLoadingEnabled */
    private boolean f4569x58ceddbd;

    /* renamed from: enableZoomToNormal */
    private boolean f4570x59cd0158;

    /* renamed from: enter */
    private boolean f4571x5c306d8;

    /* renamed from: executor */
    private java.util.concurrent.Executor f4572x79c5f8d3;

    /* renamed from: fitWidth */
    private boolean f4573xe1139435;

    /* renamed from: fullImageBitmap */
    private android.graphics.Bitmap f4574xad787c5b;

    /* renamed from: fullImageSampleSize */
    private int f4575x7a75f9f7;

    /* renamed from: fullImageTileLoadedEnd */
    private long f4576x6034e2dc;

    /* renamed from: fullImageTileLoadedStart */
    private long f4577x274fa223;

    /* renamed from: gestureDetectorListener */
    private android.view.GestureDetector.SimpleOnGestureListener f4578x6dda0a03;

    /* renamed from: handler */
    private android.os.Handler f4579x294b574a;

    /* renamed from: horizontalLong */
    private boolean f4580xa72f14c0;

    /* renamed from: ignoreCancelEvent */
    private boolean f4581xa68c830e;

    /* renamed from: imageLoadedSent */
    private boolean f4582xc483b8f8;

    /* renamed from: isFirstLoadFullImage */
    private boolean f4583x720823c0;

    /* renamed from: isPanning */
    private boolean f4584xadf2fa47;

    /* renamed from: isPreviewLoaded */
    private boolean f4585x8aaa60e3;

    /* renamed from: isQuickScaling */
    private boolean f4586xd614b24;

    /* renamed from: isSwipingXEdge */
    private boolean f4587x98d04568;

    /* renamed from: isSwipingYDown */
    private boolean f4588x98de13ce;

    /* renamed from: isSwipingYEdge */
    private boolean f4589x98de5ce9;

    /* renamed from: isZooming */
    private boolean f4590xd6e2c6a5;

    /* renamed from: lastMotionEvent */
    private android.view.MotionEvent f4591x4d80e00e;

    /* renamed from: mDrawFullSampleSizeBitmap */
    private boolean f4592xec2b2b7a;

    /* renamed from: mDrawableMatrix */
    private android.graphics.Matrix f4593x251a9fcc;

    /* renamed from: mEdgeSwipeListener */
    private com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.EdgeSwipeListener f4594x7dbdd264;

    /* renamed from: mHeightScale */
    private float f4595x6bd439b6;

    /* renamed from: mImageDecodeRecord */
    private com.p151x9ab4726f.p152x329086.p153x9590d8af.p157xa7c31030.C1448xa1904cba f4596x53ad93ed;

    /* renamed from: mMainImageSource */
    private com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 f4597xae0481b0;

    /* renamed from: mMaxZoomScale */
    private float f4598xa492c540;

    /* renamed from: mNeedPendingScale */
    private boolean f4599xe0d96c36;

    /* renamed from: mNeedScaleAndCenterWhenImageLoaded */
    private boolean f4600x2568da81;

    /* renamed from: mPreviewDone */
    private boolean f4601x5d0f68bd;

    /* renamed from: mPreviewHeightScaleRate */
    private float f4602x3e30b7c8;

    /* renamed from: mPreviewScaleRate */
    private float f4603x6240dcef;

    /* renamed from: mPreviewSource */
    private com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 f4604x70744a96;

    /* renamed from: mPreviewWidthScaleRate */
    private float f4605x49f75d9f;

    /* renamed from: mScaleRate */
    public float f4606xac75f5d;

    /* renamed from: mScreenExtraScale */
    private float f4607x8efd5f33;

    /* renamed from: mSuppMatrix */
    private android.graphics.Matrix f4608x7ca69690;

    /* renamed from: mTileLoadTaskList */
    private java.util.LinkedList<com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1444xb96582a9> f4609xd84bcf24;

    /* renamed from: mViewHeight */
    private int f4610x59976079;

    /* renamed from: mViewWidth */
    private int f4611x1c7f2c34;

    /* renamed from: mWidthScale */
    private float f4612x7ce78f71;

    /* renamed from: matrix */
    private android.graphics.Matrix f4613xbf8d97c1;

    /* renamed from: matrixValues */
    private float[] f4614x689d8c43;

    /* renamed from: maxScale */
    private float f4615x17a23246;

    /* renamed from: maxTileHeight */
    private int f4616x6de9a9f9;

    /* renamed from: maxTileWidth */
    private int f4617x77fdb2b4;

    /* renamed from: maxTouchCount */
    private int f4618x59614594;

    /* renamed from: minScale */
    private float f4619xadc39618;

    /* renamed from: minimumScaleType */
    private int f4620x25161736;

    /* renamed from: minimumTileDpi */
    private int f4621x75940fe1;

    /* renamed from: onAttachStateChangeListener */
    private android.view.View.OnAttachStateChangeListener f4622xf46887d1;

    /* renamed from: onDoubleTapListener */
    private android.view.GestureDetector.OnDoubleTapListener f4623xac5fb0c7;

    /* renamed from: onImageEventListener */
    private com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener f4624xfe71e412;

    /* renamed from: onLongClickListener */
    private android.view.View.OnLongClickListener f4625x62e28521;

    /* renamed from: onStateChangedListener */
    private com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnStateChangedListener f4626x8b7f5336;

    /* renamed from: onTouchListener */
    private android.view.View.OnTouchListener f4627xb1453d74;

    /* renamed from: openHardware */
    private boolean f4628x9b488652;

    /* renamed from: orientation */
    private int f4629xaa32f5d0;

    /* renamed from: pRegion */
    private android.graphics.Rect f4630xb666ff84;

    /* renamed from: panEnabled */
    private boolean f4631xb418f7e4;

    /* renamed from: panLimit */
    private int f4632x3dd5851e;

    /* renamed from: pendingScale */
    private java.lang.Float f4633x908f5f3;

    /* renamed from: previewHeight */
    private int f4634x20e6b0f;

    /* renamed from: previewOrientation */
    private int f4635xb4010ce8;

    /* renamed from: previewRotateFlip */
    private int f4636xd24ed250;

    /* renamed from: previewWidth */
    private int f4637xae5176de;

    /* renamed from: quickScaleEnabled */
    private boolean f4638xc607f124;

    /* renamed from: quickScaleLastDistance */
    private float f4639x5c805ca8;

    /* renamed from: quickScaleMoved */
    private boolean f4640xd5c2c156;

    /* renamed from: quickScaleSCenter */
    private android.graphics.PointF f4641x617cbc8b;

    /* renamed from: quickScaleThreshold */
    private final float f4642x2d585d8e;

    /* renamed from: quickScaleVLastPoint */
    private android.graphics.PointF f4643x2dcff001;

    /* renamed from: quickScaleVStart */
    private android.graphics.PointF f4644xf0657f49;

    /* renamed from: rawExifOrientation */
    private int f4645xfe5e4558;

    /* renamed from: readySent */
    private boolean f4646xbf0193db;

    /* renamed from: regionDecoderFactory */
    private com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1433xf1915446<? extends com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135> f4647xd2c0403a;

    /* renamed from: sHeight */
    private int f4648x440a1b7a;

    /* renamed from: sOrientation */
    private int f4649x8269e75d;

    /* renamed from: sPendingCenter */
    private android.graphics.PointF f4650xa32b3719;

    /* renamed from: sRect */
    private android.graphics.RectF f4651x67b5cf7;

    /* renamed from: sRegion */
    private android.graphics.Rect f4652x5519b147;

    /* renamed from: sRequestedCenter */
    private android.graphics.PointF f4653xcd6de870;

    /* renamed from: sWidth */
    private int f4654xc9388d13;

    /* renamed from: satTemp */
    private com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleAndTranslate f4655x6f7d10da;

    /* renamed from: scale */
    public float f4656x683094a;

    /* renamed from: scaleChangeReportListener */
    private com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleChangeReportListener f4657xdd5f6a42;

    /* renamed from: scaleStart */
    private float f4658x72090938;

    /* renamed from: singleDetector */
    private android.view.GestureDetector f4659x5109382e;

    /* renamed from: srcArray */
    private float[] f4660xe566d2d5;

    /* renamed from: srcRect */
    private final android.graphics.Rect f4661x8b8ef9e8;

    /* renamed from: tileBgPaint */
    private android.graphics.Paint f4662x8a29648b;

    /* renamed from: tileMap */
    private java.util.Map<java.lang.Integer, java.util.List<com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce>> f4663xb1a0b3ce;

    /* renamed from: tmpScale */
    private float f4664x5bee6e73;
    private android.net.Uri uri;

    /* renamed from: vCenterStart */
    private android.graphics.PointF f4665x524c56b7;

    /* renamed from: vDistStart */
    private float f4666x2589a286;

    /* renamed from: vResetCenter */
    private android.graphics.PointF f4667xa51c402e;

    /* renamed from: vTranslate */
    public android.graphics.PointF f4668x500d3578;

    /* renamed from: vTranslateBefore */
    private android.graphics.PointF f4669x3edc6717;

    /* renamed from: vTranslateStart */
    private android.graphics.PointF f4670xf27949ca;

    /* renamed from: values */
    private final float[] f4671xcee59d22;

    /* renamed from: verticalLong */
    private boolean f4672xfdd3f712;

    /* renamed from: x_down */
    private float f4673xd22f6809;

    /* renamed from: y_down */
    private float f4674xd3e440a8;

    /* renamed from: zoomEnabled */
    private boolean f4675x68a99bee;

    /* renamed from: zoomScaleDuration */
    private int f4676x34b4ebeb;

    /* renamed from: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$Anim */
    /* loaded from: classes15.dex */
    public static class Anim {

        /* renamed from: duration */
        private long f4692x89444d94;

        /* renamed from: easing */
        private int f4693xb1e63d2b;

        /* renamed from: interruptible */
        private boolean f4694x36587d35;

        /* renamed from: listener */
        private com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnAnimationEventListener f4695x503cc4b4;

        /* renamed from: origin */
        private int f4696xc3e1af26;

        /* renamed from: sCenterEnd */
        private android.graphics.PointF f4697xd615913;

        /* renamed from: sCenterEndRequested */
        private android.graphics.PointF f4698xba54e39b;

        /* renamed from: sCenterStart */
        private android.graphics.PointF f4699x3b37669a;

        /* renamed from: scaleEnd */
        private float f4700xcad70b31;

        /* renamed from: scaleStart */
        private float f4701x72090938;

        /* renamed from: time */
        private long f4702x3652cd;

        /* renamed from: vFocusEnd */
        private android.graphics.PointF f4703x5e86fb79;

        /* renamed from: vFocusStart */
        private android.graphics.PointF f4704xd97e0780;

        private Anim() {
            this.f4692x89444d94 = 200L;
            this.f4694x36587d35 = true;
            this.f4693xb1e63d2b = 2;
            this.f4696xc3e1af26 = 1;
            this.f4702x3652cd = java.lang.System.currentTimeMillis();
        }
    }

    /* renamed from: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$DefaultOnAnimationEventListener */
    /* loaded from: classes15.dex */
    public static class DefaultOnAnimationEventListener implements com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnAnimationEventListener {
        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnAnimationEventListener
        /* renamed from: onComplete */
        public void mo15802x815f5438() {
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnAnimationEventListener
        /* renamed from: onInterruptedByNewAnim */
        public void mo15803xe532d3d7() {
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnAnimationEventListener
        /* renamed from: onInterruptedByUser */
        public void mo15804x40ef1585() {
        }
    }

    /* renamed from: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$DefaultOnImageEventListener */
    /* loaded from: classes12.dex */
    public static class DefaultOnImageEventListener implements com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener {
        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
        /* renamed from: onImageLoadError */
        public void mo15805x5cb2b166(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886) {
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
        /* renamed from: onImageLoaded */
        public void mo15806x91f79de1(android.graphics.Bitmap bitmap) {
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
        /* renamed from: onPreviewLoadError */
        public void mo15807xaf7fedd9(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886) {
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
        /* renamed from: onPreviewLoaded */
        public void mo15808x3c79ee4e() {
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
        /* renamed from: onPreviewReleased */
        public void mo15809x76d22946() {
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
        /* renamed from: onReady */
        public void mo15810xb03baf04() {
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener
        /* renamed from: onTileLoadError */
        public void mo15811x68961215(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886) {
        }
    }

    /* renamed from: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$DefaultOnStateChangedListener */
    /* loaded from: classes15.dex */
    public static class DefaultOnStateChangedListener implements com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnStateChangedListener {
        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnStateChangedListener
        /* renamed from: onCenterChanged */
        public void mo15812x74e67900(android.graphics.PointF pointF, int i17) {
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnStateChangedListener
        /* renamed from: onScaleChanged */
        public void mo15813x264e5589(float f17, float f18, int i17) {
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnStateChangedListener
        /* renamed from: onScaleFinish */
        public void mo15814xd4e26b1e(float f17) {
        }
    }

    /* renamed from: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$EdgeSwipeListener */
    /* loaded from: classes15.dex */
    public interface EdgeSwipeListener {
        /* renamed from: onSwipeXEdge */
        void mo15762xe1528a7a(android.view.MotionEvent motionEvent);

        /* renamed from: onSwipeXEdgeEnd */
        void mo15763x461bc01(android.view.MotionEvent motionEvent);

        /* renamed from: onSwipeYEdge */
        void mo15764xe160a1fb(android.view.MotionEvent motionEvent, boolean z17);

        /* renamed from: onSwipeYEdgeEnd */
        void mo15765x6c42e8e0(android.view.MotionEvent motionEvent, boolean z17);

        /* renamed from: onSwipeYEdgeStart */
        void mo15766x67f43727(android.view.MotionEvent motionEvent, boolean z17);
    }

    /* renamed from: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$IReporter */
    /* loaded from: classes15.dex */
    public interface IReporter {
        /* renamed from: report */
        void m15815xc84c5534(boolean z17, long j17, long j18);
    }

    /* renamed from: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$OnAnimationEventListener */
    /* loaded from: classes15.dex */
    public interface OnAnimationEventListener {
        /* renamed from: onComplete */
        void mo15802x815f5438();

        /* renamed from: onInterruptedByNewAnim */
        void mo15803xe532d3d7();

        /* renamed from: onInterruptedByUser */
        void mo15804x40ef1585();
    }

    /* renamed from: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$OnImageEventListener */
    /* loaded from: classes15.dex */
    public interface OnImageEventListener {
        /* renamed from: onImageLoadError */
        void mo15805x5cb2b166(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886);

        /* renamed from: onImageLoaded */
        void mo15806x91f79de1(android.graphics.Bitmap bitmap);

        /* renamed from: onPreviewLoadError */
        void mo15807xaf7fedd9(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886);

        /* renamed from: onPreviewLoaded */
        void mo15808x3c79ee4e();

        /* renamed from: onPreviewReleased */
        void mo15809x76d22946();

        /* renamed from: onReady */
        void mo15810xb03baf04();

        /* renamed from: onTileLoadError */
        void mo15811x68961215(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 c1434xa197a886);
    }

    /* renamed from: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$OnStateChangedListener */
    /* loaded from: classes15.dex */
    public interface OnStateChangedListener {
        /* renamed from: onCenterChanged */
        void mo15812x74e67900(android.graphics.PointF pointF, int i17);

        /* renamed from: onScaleChanged */
        void mo15813x264e5589(float f17, float f18, int i17);

        /* renamed from: onScaleFinish */
        void mo15814xd4e26b1e(float f17);
    }

    /* renamed from: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$ScaleAndTranslate */
    /* loaded from: classes15.dex */
    public static class ScaleAndTranslate {

        /* renamed from: scale */
        private float f4715x683094a;

        /* renamed from: vTranslate */
        private android.graphics.PointF f4716x500d3578;

        private ScaleAndTranslate(float f17, android.graphics.PointF pointF) {
            this.f4715x683094a = f17;
            this.f4716x500d3578 = pointF;
        }
    }

    /* renamed from: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$ScaleChangeReportListener */
    /* loaded from: classes15.dex */
    public interface ScaleChangeReportListener {
        /* renamed from: onDoubleClickScale */
        void mo15819x92a4c352(float f17);

        /* renamed from: onFingerScaleEnd */
        void mo15820x6d672179(float f17);
    }

    static {
        f4535x4955af06 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20016x12512b93()) == 1;
        f4542x731d5c34 = java.lang.Integer.parseInt(j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20017xf4594827()));
        f4528xc2d62426 = java.util.Arrays.asList(0, 90, 180, 270, -1);
        f4531x98fb16eb = java.util.Arrays.asList(1, 2, 3);
        f4527x518f3b53 = java.util.Arrays.asList(2, 1);
        f4529xbf31ce5d = java.util.Arrays.asList(1, 2, 3);
        f4530x44c1d921 = java.util.Arrays.asList(2, 1, 3, 4);
        f4526xf733d2dc = Integer.MAX_VALUE;
        f4541x8a682872 = android.graphics.Bitmap.Config.ARGB_8888;
        f4536x76d4472f = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1440xd2ea75df();
        f4539x97592cae = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1442x42812480();
        f4538xaa1dac5e = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1441x2682fcd0();
        f4537xb898c6e = null;
    }

    public C1451x2b77465d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        java.lang.Class cls;
        int resourceId;
        java.lang.String string;
        this.TAG = "SubsamplingScaleImageView" + hashCode();
        this.f4583x720823c0 = true;
        this.f4577x274fa223 = -1L;
        this.f4576x6034e2dc = -1L;
        this.f4672xfdd3f712 = false;
        this.f4580xa72f14c0 = false;
        this.f4557x5b09653 = false;
        this.f4629xaa32f5d0 = -1;
        this.f4615x17a23246 = 2.0f;
        this.f4619xadc39618 = m15609xadc39618();
        this.f4621x75940fe1 = -1;
        this.f4632x3dd5851e = 1;
        this.f4620x25161736 = 3;
        int i17 = f4526xf733d2dc;
        this.f4617x77fdb2b4 = i17;
        this.f4616x6de9a9f9 = i17;
        boolean z17 = f4535x4955af06;
        this.f4569x58ceddbd = !z17;
        this.f4631xb418f7e4 = true;
        this.f4675x68a99bee = true;
        this.f4638xc607f124 = true;
        this.f4565x4de84745 = 2.0f;
        this.f4566x4df05bac = 1;
        this.f4564xe7ec09b9 = 200;
        this.f4676x34b4ebeb = 200;
        this.f4555xed0140eb = true;
        this.f4623xac5fb0c7 = null;
        this.f4657xdd5f6a42 = null;
        this.f4545x9fc87346 = true;
        this.f4581xa68c830e = false;
        this.f4591x4d80e00e = null;
        this.f4614x689d8c43 = new float[9];
        this.f4664x5bee6e73 = 0.0f;
        this.f4635xb4010ce8 = 0;
        this.f4636xd24ed250 = 0;
        this.f4645xfe5e4558 = -1;
        this.f4561x481c238f = new java.util.concurrent.locks.ReentrantReadWriteLock(true);
        cls = com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.class;
        this.f4550x2b190735 = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1432xe9ec7068(z17 ? cls : com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1438x26fbc6c5.class);
        this.f4647xd2c0403a = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1432xe9ec7068(z17 ? com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1439x81c2b3e0.class : com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1438x26fbc6c5.class);
        this.f4613xbf8d97c1 = new android.graphics.Matrix();
        this.f4660xe566d2d5 = new float[8];
        this.f4567x211dcf94 = new float[8];
        this.f4609xd84bcf24 = new java.util.LinkedList<>();
        this.f4556x1c682951 = false;
        this.f4572x79c5f8d3 = android.os.AsyncTask.THREAD_POOL_EXECUTOR;
        this.f4607x8efd5f33 = 1.0f;
        this.f4598xa492c540 = 20.0f;
        this.f4601x5d0f68bd = true;
        this.f4592xec2b2b7a = false;
        this.f4600x2568da81 = false;
        this.f4547xdad87dd1 = 1.0f;
        this.f4548xa90d9026 = 1.0f;
        this.f4571x5c306d8 = true;
        this.f4573xe1139435 = false;
        this.f4570x59cd0158 = false;
        this.f4596x53ad93ed = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p157xa7c31030.C1448xa1904cba();
        this.f4594x7dbdd264 = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.EdgeSwipeListener() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.1
            @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.EdgeSwipeListener
            /* renamed from: onSwipeXEdge */
            public void mo15762xe1528a7a(android.view.MotionEvent motionEvent) {
            }

            @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.EdgeSwipeListener
            /* renamed from: onSwipeXEdgeEnd */
            public void mo15763x461bc01(android.view.MotionEvent motionEvent) {
            }

            @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.EdgeSwipeListener
            /* renamed from: onSwipeYEdge */
            public void mo15764xe160a1fb(android.view.MotionEvent motionEvent, boolean z18) {
            }

            @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.EdgeSwipeListener
            /* renamed from: onSwipeYEdgeEnd */
            public void mo15765x6c42e8e0(android.view.MotionEvent motionEvent, boolean z18) {
            }

            @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.EdgeSwipeListener
            /* renamed from: onSwipeYEdgeStart */
            public void mo15766x67f43727(android.view.MotionEvent motionEvent, boolean z18) {
            }
        };
        this.f4587x98d04568 = false;
        this.f4589x98de5ce9 = false;
        this.f4588x98de13ce = false;
        this.f4628x9b488652 = false;
        this.f4543xf8cf3e0a = true;
        this.f4661x8b8ef9e8 = new android.graphics.Rect();
        this.f4568x74b5e949 = new android.graphics.Rect();
        this.f4671xcee59d22 = new float[9];
        this.f4562x5c8c94e8 = getResources().getDisplayMetrics().density;
        m15709xf8702b47(2.0f);
        m15731x2c2244e3(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e);
        m15625x96eaeb6d(context);
        m15598x28429f70();
        this.f4579x294b574a = new android.os.Handler(new android.os.Handler.Callback() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(android.os.Message message) {
                if (message.what == 1 && com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4625x62e28521 != null) {
                    com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4618x59614594 = 0;
                    com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this;
                    com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.super.setOnLongClickListener(c1451x2b77465d.f4625x62e28521);
                    com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.performLongClick();
                    com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.super.setOnLongClickListener(null);
                }
                return true;
            }
        });
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.p151x9ab4726f.p152x329086.p153x9590d8af.R.C1431x6ba0728b.f4407x2b77465d);
            if (obtainStyledAttributes.hasValue(com.p151x9ab4726f.p152x329086.p153x9590d8af.R.C1431x6ba0728b.f4408x18509239) && (string = obtainStyledAttributes.getString(com.p151x9ab4726f.p152x329086.p153x9590d8af.R.C1431x6ba0728b.f4408x18509239)) != null && string.length() > 0) {
                m15717x53266a19(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536.m15524x58ceaf0(string).m15541xc21f78d6());
            }
            if (obtainStyledAttributes.hasValue(com.p151x9ab4726f.p152x329086.p153x9590d8af.R.C1431x6ba0728b.f4411x77afbd02) && (resourceId = obtainStyledAttributes.getResourceId(com.p151x9ab4726f.p152x329086.p153x9590d8af.R.C1431x6ba0728b.f4411x77afbd02, 0)) > 0) {
                m15717x53266a19(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536.m15527xebabc40e(resourceId).m15541xc21f78d6());
            }
            if (obtainStyledAttributes.hasValue(com.p151x9ab4726f.p152x329086.p153x9590d8af.R.C1431x6ba0728b.f4409x27e15b06)) {
                m15738xd07dfde6(obtainStyledAttributes.getBoolean(com.p151x9ab4726f.p152x329086.p153x9590d8af.R.C1431x6ba0728b.f4409x27e15b06, true));
            }
            if (obtainStyledAttributes.hasValue(com.p151x9ab4726f.p152x329086.p153x9590d8af.R.C1431x6ba0728b.f4413x6ded9d0c)) {
                m15748xd8e5562c(obtainStyledAttributes.getBoolean(com.p151x9ab4726f.p152x329086.p153x9590d8af.R.C1431x6ba0728b.f4413x6ded9d0c, true));
            }
            if (obtainStyledAttributes.hasValue(com.p151x9ab4726f.p152x329086.p153x9590d8af.R.C1431x6ba0728b.f4410xe18223c2)) {
                m15741xf4d284e2(obtainStyledAttributes.getBoolean(com.p151x9ab4726f.p152x329086.p153x9590d8af.R.C1431x6ba0728b.f4410xe18223c2, true));
            }
            if (obtainStyledAttributes.hasValue(com.p151x9ab4726f.p152x329086.p153x9590d8af.R.C1431x6ba0728b.f4412xe42ed65)) {
                m15747x8eff8685(obtainStyledAttributes.getColor(com.p151x9ab4726f.p152x329086.p153x9590d8af.R.C1431x6ba0728b.f4412xe42ed65, android.graphics.Color.argb(0, 0, 0, 0)));
            }
            obtainStyledAttributes.recycle();
        }
        this.f4642x2d585d8e = android.util.TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
        float f17 = getContext().getResources().getDisplayMetrics().widthPixels / 720.0f;
        if (f17 > 1.0f) {
            this.f4607x8efd5f33 = f17;
        }
    }

    /* renamed from: calculateInSampleSize */
    private int m15583x9c8bd256(float f17) {
        int round;
        if (this.f4621x75940fe1 > 0) {
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f17 *= this.f4621x75940fe1 / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int m15621xc9388d13 = (int) (m15621xc9388d13() * f17);
        int m15620x440a1b7a = (int) (m15620x440a1b7a() * f17);
        if (m15621xc9388d13 == 0 || m15620x440a1b7a == 0) {
            return 32;
        }
        int i17 = 1;
        if (m15620x440a1b7a() > m15620x440a1b7a || m15621xc9388d13() > m15621xc9388d13) {
            round = java.lang.Math.round(m15620x440a1b7a() / m15620x440a1b7a);
            int round2 = java.lang.Math.round(m15621xc9388d13() / m15621xc9388d13);
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

    /* renamed from: cancelAllTileLoadTask */
    private void m15584x55249ec0() {
        if (this.f4556x1c682951) {
            return;
        }
        this.f4556x1c682951 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "cancelAllTileLoadTask, task size: %d", java.lang.Integer.valueOf(this.f4609xd84bcf24.size()));
        java.util.Iterator<com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1444xb96582a9> it = this.f4609xd84bcf24.iterator();
        while (it.hasNext()) {
            it.next().mo15504xae7a2e7a();
        }
        this.f4609xd84bcf24.clear();
    }

    /* renamed from: checkImageLoaded */
    private boolean m15585x25cae318() {
        boolean m15606x237a984d = m15606x237a984d();
        if (!this.f4582xc483b8f8 && m15606x237a984d) {
            m15613xecf24a87();
            this.f4582xc483b8f8 = true;
            m15686x91f79de1();
        }
        return m15606x237a984d;
    }

    /* renamed from: checkReady */
    private boolean m15586xe05ce97b() {
        boolean z17 = getWidth() > 0 && getHeight() > 0 && this.f4654xc9388d13 > 0 && this.f4648x440a1b7a > 0 && (this.f4549xad38f12f != null || m15606x237a984d());
        if (!this.f4646xbf0193db && z17) {
            m15613xecf24a87();
            this.f4646xbf0193db = true;
            m15689xb03baf04();
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener onImageEventListener = this.f4624xfe71e412;
            if (onImageEventListener != null) {
                onImageEventListener.mo15810xb03baf04();
            }
        }
        return z17;
    }

    /* renamed from: createPaints */
    private void m15587x555bf3f1() {
        if (this.f4553x6a7e7c6f == null) {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.f4553x6a7e7c6f = paint;
            paint.setAntiAlias(true);
            this.f4553x6a7e7c6f.setFilterBitmap(true);
            this.f4553x6a7e7c6f.setDither(true);
        }
        if ((this.f4559xd525ee1e == null || this.f4558xa7f027b7 == null) && this.f4557x5b09653) {
            android.graphics.Paint paint2 = new android.graphics.Paint();
            this.f4559xd525ee1e = paint2;
            paint2.setTextSize(px(20));
            this.f4559xd525ee1e.setColor(-65281);
            this.f4559xd525ee1e.setStyle(android.graphics.Paint.Style.FILL);
            android.graphics.Paint paint3 = new android.graphics.Paint();
            this.f4558xa7f027b7 = paint3;
            paint3.setColor(-65281);
            this.f4558xa7f027b7.setStyle(android.graphics.Paint.Style.STROKE);
            this.f4558xa7f027b7.setStrokeWidth(px(1));
        }
    }

    /* renamed from: distance */
    private float m15588x11318bf5(float f17, float f18, float f19, float f27) {
        float f28 = f17 - f18;
        float f29 = f19 - f27;
        return (float) java.lang.Math.sqrt((f28 * f28) + (f29 * f29));
    }

    /* renamed from: drawBitmap */
    private void m15590xdd1f0793(android.graphics.Canvas canvas) {
        this.f4613xbf8d97c1.reset();
        int width = this.f4549xad38f12f.getWidth();
        int height = this.f4549xad38f12f.getHeight();
        int i17 = this.f4635xb4010ce8;
        if (i17 == 90 || i17 == 270) {
            width = this.f4549xad38f12f.getHeight();
            height = this.f4549xad38f12f.getWidth();
        }
        if (this.f4552xf0ae3ecf) {
            m15601x9053f392();
            this.f4613xbf8d97c1.postScale(this.f4605x49f75d9f, this.f4602x3e30b7c8, width / 2.0f, height / 2.0f);
        }
        this.f4613xbf8d97c1.postTranslate((this.f4611x1c7f2c34 - this.f4549xad38f12f.getWidth()) / 2, (this.f4610x59976079 - this.f4549xad38f12f.getHeight()) / 2);
        if (this.f4662x8a29648b != null) {
            if (this.f4651x67b5cf7 == null) {
                this.f4651x67b5cf7 = new android.graphics.RectF();
            }
            this.f4651x67b5cf7.set(0.0f, 0.0f, this.f4552xf0ae3ecf ? this.f4549xad38f12f.getWidth() : this.f4654xc9388d13, this.f4552xf0ae3ecf ? this.f4549xad38f12f.getHeight() : this.f4648x440a1b7a);
            this.f4613xbf8d97c1.mapRect(this.f4651x67b5cf7);
            canvas.drawRect(this.f4651x67b5cf7, this.f4662x8a29648b);
        }
        canvas.drawBitmap(this.f4549xad38f12f, this.f4613xbf8d97c1, this.f4553x6a7e7c6f);
    }

    /* renamed from: ease */
    private float m15591x2f63ee(int i17, long j17, float f17, float f18, long j18) {
        if (i17 == 1) {
            return m15593x5df79e7(j17, f17, f18, j18);
        }
        if (i17 == 2) {
            return m15592x53389c82(j17, f17, f18, j18);
        }
        throw new java.lang.IllegalStateException("Unexpected easing type: " + i17);
    }

    /* renamed from: easeInOutQuad */
    private float m15592x53389c82(long j17, float f17, float f18, long j18) {
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

    /* renamed from: easeOutQuad */
    private float m15593x5df79e7(long j17, float f17, float f18, long j18) {
        float f19 = ((float) j17) / ((float) j18);
        return ((-f18) * f19 * (f19 - 2.0f)) + f17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fitToBounds */
    public void m15594x30ea3841(boolean z17, com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleAndTranslate scaleAndTranslate) {
        float max;
        int max2;
        float max3;
        if (this.f4632x3dd5851e == 2 && m15682x7b5e8699()) {
            z17 = false;
        }
        android.graphics.PointF pointF = scaleAndTranslate.f4716x500d3578;
        float m15608xc45833d0 = m15608xc45833d0(scaleAndTranslate.f4715x683094a);
        float m15621xc9388d13 = m15621xc9388d13() * m15608xc45833d0;
        float m15620x440a1b7a = m15620x440a1b7a() * m15608xc45833d0;
        if (this.f4632x3dd5851e == 3 && m15682x7b5e8699()) {
            pointF.x = java.lang.Math.max(pointF.x, (getWidth() / 2) - m15621xc9388d13);
            pointF.y = java.lang.Math.max(pointF.y, (getHeight() / 2) - m15620x440a1b7a);
        } else if (z17) {
            pointF.x = java.lang.Math.max(pointF.x, getWidth() - m15621xc9388d13);
            pointF.y = java.lang.Math.max(pointF.y, getHeight() - m15620x440a1b7a);
        } else {
            pointF.x = java.lang.Math.max(pointF.x, -m15621xc9388d13);
            pointF.y = java.lang.Math.max(pointF.y, -m15620x440a1b7a);
        }
        float paddingLeft = (getPaddingLeft() > 0 || getPaddingRight() > 0) ? getPaddingLeft() / (getPaddingLeft() + getPaddingRight()) : 0.5f;
        float paddingTop = (getPaddingTop() > 0 || getPaddingBottom() > 0) ? getPaddingTop() / (getPaddingTop() + getPaddingBottom()) : 0.5f;
        if (this.f4632x3dd5851e == 3 && m15682x7b5e8699()) {
            max = java.lang.Math.max(0, getWidth() / 2);
            max2 = java.lang.Math.max(0, getHeight() / 2);
        } else {
            if (z17) {
                max = java.lang.Math.max(0.0f, (getWidth() - m15621xc9388d13) * paddingLeft);
                max3 = java.lang.Math.max(0.0f, (getHeight() - m15620x440a1b7a) * paddingTop);
                pointF.x = java.lang.Math.min(pointF.x, max);
                pointF.y = java.lang.Math.min(pointF.y, max3);
                scaleAndTranslate.f4715x683094a = m15608xc45833d0;
            }
            max = java.lang.Math.max(0, getWidth());
            max2 = java.lang.Math.max(0, getHeight());
        }
        max3 = max2;
        pointF.x = java.lang.Math.min(pointF.x, max);
        pointF.y = java.lang.Math.min(pointF.y, max3);
        scaleAndTranslate.f4715x683094a = m15608xc45833d0;
    }

    /* renamed from: getDoubleTapZoomScale */
    private float m15595x6144a93b() {
        float f17 = this.f4606xac75f5d;
        float f18 = this.f4612x7ce78f71;
        if (f18 * f4540xb7cff554 <= f17) {
            f18 = this.f4595x6bd439b6;
            if (f4540xb7cff554 * f18 <= f17) {
                f18 = this.f4565x4de84745 * f17;
            }
        }
        if (f18 < 1.0d) {
            f18 = 1.0f;
        }
        float f19 = this.f4615x17a23246;
        return f18 > f19 ? f19 : f18;
    }

    /* renamed from: getMaxBitmapDimensions */
    private android.graphics.Point m15596xbb671caa(android.graphics.Canvas canvas) {
        int min = java.lang.Math.min(canvas.getMaximumBitmapWidth(), this.f4617x77fdb2b4);
        int min2 = java.lang.Math.min(canvas.getMaximumBitmapHeight(), this.f4616x6de9a9f9);
        if (min > 10000) {
            min = 10000;
        }
        if (min2 > 10000) {
            min2 = 10000;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "getMaxBitmapDimensions %d, %d", java.lang.Integer.valueOf(min), java.lang.Integer.valueOf(min2));
        return new android.graphics.Point(min, min2);
    }

    /* renamed from: getPreferredBitmapConfig */
    public static android.graphics.Bitmap.Config m15597x9613fabc() {
        return f4541x8a682872;
    }

    /* renamed from: initImageView */
    private void m15598x28429f70() {
        this.f4608x7ca69690 = new android.graphics.Matrix();
        m15747x8eff8685(-1);
    }

    /* renamed from: initMaxScale */
    private void m15599x9ebfeb76() {
        this.f4615x17a23246 = m15595x6144a93b() * 2.0f * this.f4607x8efd5f33;
    }

    /* renamed from: initMinScale */
    private void m15600x34e14f48() {
        this.f4619xadc39618 = java.lang.Math.min(m15609xadc39618(), this.f4606xac75f5d * 0.75f);
    }

    /* renamed from: initPreviewScale */
    private void m15601x9053f392() {
        if (this.f4549xad38f12f != null && this.f4552xf0ae3ecf) {
            int m15621xc9388d13 = m15621xc9388d13();
            int m15620x440a1b7a = m15620x440a1b7a();
            float f17 = m15621xc9388d13;
            float f18 = m15620x440a1b7a;
            boolean z17 = f17 > f18 * 2.2f;
            this.f4580xa72f14c0 = z17;
            boolean z18 = f18 > f17 * 2.2f;
            this.f4672xfdd3f712 = z18;
            this.f4580xa72f14c0 = z17 && m15621xc9388d13 > this.f4611x1c7f2c34;
            this.f4672xfdd3f712 = z18 && m15620x440a1b7a > this.f4610x59976079;
            m15676xeca9821a();
            if (this.f4672xfdd3f712) {
                this.f4605x49f75d9f = (this.f4611x1c7f2c34 * 1.0f) / m15615xae5176de();
                this.f4602x3e30b7c8 = (this.f4610x59976079 * 1.0f) / m15614x20e6b0f();
            } else if (this.f4580xa72f14c0) {
                this.f4605x49f75d9f = (this.f4611x1c7f2c34 * 1.0f) / m15615xae5176de();
                this.f4602x3e30b7c8 = (this.f4606xac75f5d * m15620x440a1b7a()) / m15614x20e6b0f();
            } else {
                this.f4605x49f75d9f = (this.f4606xac75f5d * m15621xc9388d13()) / m15615xae5176de();
                this.f4602x3e30b7c8 = (this.f4606xac75f5d * m15620x440a1b7a()) / m15614x20e6b0f();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "initPreviewScaleRate previewWidthScale: %f, previewHeightScale: %f, previewHeight: %d, previewWidth: %d, verticalLong: %b, horizontalLong: %b, %s", java.lang.Float.valueOf(this.f4605x49f75d9f), java.lang.Float.valueOf(this.f4602x3e30b7c8), java.lang.Integer.valueOf(m15614x20e6b0f()), java.lang.Integer.valueOf(m15615xae5176de()), java.lang.Boolean.valueOf(this.f4672xfdd3f712), java.lang.Boolean.valueOf(this.f4580xa72f14c0), this.f4597xae0481b0.m15536xb5887636().toString());
        }
    }

    /* renamed from: initialiseBaseLayer */
    private synchronized void m15602xa250ec09(android.graphics.Point point) {
        m15646x5b09653("initialiseBaseLayer maxTileDimensions=%dx%d", java.lang.Integer.valueOf(point.x), java.lang.Integer.valueOf(point.y));
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleAndTranslate scaleAndTranslate = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleAndTranslate(0.0f, new android.graphics.PointF(0.0f, 0.0f));
        this.f4655x6f7d10da = scaleAndTranslate;
        m15594x30ea3841(true, scaleAndTranslate);
        this.f4575x7a75f9f7 = m15583x9c8bd256(this.f4655x6f7d10da.f4715x683094a);
        m15603xa1ed5517(point);
        for (java.util.Map.Entry<java.lang.Integer, java.util.List<com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce>> entry : this.f4663xb1a0b3ce.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
        for (com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce : this.f4663xb1a0b3ce.get(java.lang.Integer.valueOf(this.f4575x7a75f9f7))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "tile fullSampleSize: %d", java.lang.Integer.valueOf(this.f4575x7a75f9f7));
            m15610xb8e9f94b(c1447x27c6ce);
        }
        m15694x147aac0b(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: initialiseTileMap */
    private void m15603xa1ed5517(android.graphics.Point point) {
        double d17;
        double d18;
        m15646x5b09653("initialiseTileMap maxTileDimensions=%dx%d", java.lang.Integer.valueOf(point.x), java.lang.Integer.valueOf(point.y));
        this.f4663xb1a0b3ce = new java.util.LinkedHashMap();
        int i17 = this.f4575x7a75f9f7;
        int i18 = 1;
        int i19 = 1;
        int i27 = 1;
        while (true) {
            int m15621xc9388d13 = m15621xc9388d13() / i19;
            int m15620x440a1b7a = m15620x440a1b7a() / i27;
            int i28 = m15621xc9388d13 / i17;
            int i29 = m15620x440a1b7a / i17;
            while (true) {
                if (i28 + i19 + i18 <= point.x) {
                    d17 = i28;
                    if (d17 <= getWidth() * 1.25d || i17 >= this.f4575x7a75f9f7) {
                        break;
                    }
                }
                i19++;
                m15621xc9388d13 = m15621xc9388d13() / i19;
                i28 = m15621xc9388d13 / i17;
            }
            while (true) {
                if (i29 + i27 + i18 <= point.y) {
                    d18 = i29;
                    if (d18 <= getHeight() * 1.25d || i17 >= this.f4575x7a75f9f7) {
                        break;
                    }
                }
                i27++;
                m15620x440a1b7a = m15620x440a1b7a() / i27;
                i29 = m15620x440a1b7a / i17;
            }
            if (i17 < this.f4575x7a75f9f7 && i19 * i27 == i18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "fix tiles to make sure there is only one full Image");
                if ((getWidth() * 1.25d) - d17 < (getHeight() * 1.25d) - d18) {
                    i19++;
                    m15621xc9388d13 = m15621xc9388d13() / i19;
                    int i37 = m15621xc9388d13 / i17;
                } else {
                    i27++;
                    m15620x440a1b7a = m15620x440a1b7a() / i27;
                    int i38 = m15620x440a1b7a / i17;
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(i19 * i27);
            int i39 = 0;
            while (i39 < i19) {
                int i47 = 0;
                while (i47 < i27) {
                    com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce();
                    c1447x27c6ce.f4483x887e4cb = i17;
                    c1447x27c6ce.f4485x1bd1f072 = i17 == this.f4575x7a75f9f7 ? i18 : 0;
                    c1447x27c6ce.f4482x67b5cf7 = new android.graphics.Rect(i39 * m15621xc9388d13, i47 * m15620x440a1b7a, i39 == i19 + (-1) ? m15621xc9388d13() : (i39 + 1) * m15621xc9388d13, i47 == i27 + (-1) ? m15620x440a1b7a() : (i47 + 1) * m15620x440a1b7a);
                    c1447x27c6ce.f4484x6a5a37a = new android.graphics.Rect(0, 0, 0, 0);
                    c1447x27c6ce.f4480xb0d284db = new android.graphics.Rect(c1447x27c6ce.f4482x67b5cf7);
                    arrayList.add(c1447x27c6ce);
                    i47++;
                    i18 = 1;
                }
                i39++;
                i18 = 1;
            }
            this.f4663xb1a0b3ce.put(java.lang.Integer.valueOf(i17), arrayList);
            i18 = 1;
            if (i17 == 1) {
                return;
            } else {
                i17 /= 2;
            }
        }
    }

    /* renamed from: invertViewX */
    private float m15604xb623801d(float f17) {
        android.graphics.PointF pointF = this.f4668x500d3578;
        if (pointF == null) {
            return 0.0f;
        }
        float f18 = (f17 - pointF.x) / this.f4656x683094a;
        if (java.lang.Float.isNaN(f18) || java.lang.Float.isInfinite(f18)) {
            return 0.0f;
        }
        return f18;
    }

    /* renamed from: invertViewY */
    private float m15605xb623801e(float f17) {
        android.graphics.PointF pointF = this.f4668x500d3578;
        if (pointF == null) {
            return 0.0f;
        }
        float f18 = (f17 - pointF.y) / this.f4656x683094a;
        if (java.lang.Float.isNaN(f18) || java.lang.Float.isInfinite(f18)) {
            return 0.0f;
        }
        return f18;
    }

    /* renamed from: isBaseLayerReady */
    private boolean m15606x237a984d() {
        boolean z17 = true;
        if (this.f4549xad38f12f != null && !this.f4552xf0ae3ecf) {
            return true;
        }
        java.util.Map<java.lang.Integer, java.util.List<com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce>> map = this.f4663xb1a0b3ce;
        if (map == null) {
            return false;
        }
        for (java.util.Map.Entry<java.lang.Integer, java.util.List<com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce>> entry : map.entrySet()) {
            if (entry.getKey().intValue() == this.f4575x7a75f9f7) {
                for (com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce : entry.getValue()) {
                    if (c1447x27c6ce.f4481x1410e13c || c1447x27c6ce.f4479xad38f12f == null) {
                        z17 = false;
                    }
                }
            }
        }
        return z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: limitedSCenter */
    public android.graphics.PointF m15607xd8b8f7ae(float f17, float f18, float f19, android.graphics.PointF pointF) {
        android.graphics.PointF m15635x7ec6b937 = m15635x7ec6b937(f17, f18, f19);
        pointF.set(((getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2)) - m15635x7ec6b937.x) / f19, ((getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2)) - m15635x7ec6b937.y) / f19);
        return pointF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: limitedScale */
    public float m15608xc45833d0(float f17) {
        return java.lang.Math.max(m15609xadc39618(), f17);
    }

    /* renamed from: minScale */
    private float m15609xadc39618() {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i17 = this.f4620x25161736;
        if (i17 == 2 || i17 == 4) {
            return java.lang.Math.max((getWidth() - paddingLeft) / m15621xc9388d13(), (getHeight() - paddingBottom) / m15620x440a1b7a());
        }
        if (i17 == 3) {
            float f17 = this.f4619xadc39618;
            if (f17 > 0.0f) {
                return f17;
            }
        }
        return java.lang.Math.min((getWidth() - paddingLeft) / m15621xc9388d13(), (getHeight() - paddingBottom) / m15620x440a1b7a());
    }

    /* renamed from: newLoadTask */
    private void m15610xb8e9f94b(com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce) {
        if (this.f4556x1c682951) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "newLoadTask, has cancelled and ignore");
            return;
        }
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1444xb96582a9 mo15509x6bff0255 = f4539x97592cae.mo15509x6bff0255(this, this.f4560x5befac44, c1447x27c6ce);
        mo15509x6bff0255.mo15505x8111fc68();
        this.f4609xd84bcf24.add(mo15509x6bff0255);
        this.f4596x53ad93ed.m15522x87e1db9();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (r1 != 262) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03c9  */
    /* renamed from: onTouchEventInternal */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m15612xc15e62b7(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.m15612xc15e62b7(android.view.MotionEvent):boolean");
    }

    /* renamed from: preDraw */
    private void m15613xecf24a87() {
        java.lang.Float f17;
        if (getWidth() == 0 || getHeight() == 0 || this.f4654xc9388d13 <= 0 || this.f4648x440a1b7a <= 0) {
            return;
        }
        if (this.f4650xa32b3719 != null && (f17 = this.f4633x908f5f3) != null) {
            this.f4656x683094a = f17.floatValue();
            if (this.f4668x500d3578 == null) {
                this.f4668x500d3578 = new android.graphics.PointF();
            }
            this.f4668x500d3578.x = (getWidth() / 2) - (this.f4656x683094a * this.f4650xa32b3719.x);
            this.f4668x500d3578.y = (getHeight() / 2) - (this.f4656x683094a * this.f4650xa32b3719.y);
            this.f4650xa32b3719 = null;
            this.f4633x908f5f3 = null;
            this.f4599xe0d96c36 = false;
            m15649x30ea3841(true);
            m15694x147aac0b(true);
        }
        m15649x30ea3841(false);
    }

    /* renamed from: previewHeight */
    private int m15614x20e6b0f() {
        android.graphics.Bitmap bitmap = this.f4549xad38f12f;
        if (bitmap == null || !this.f4552xf0ae3ecf) {
            return 0;
        }
        int i17 = this.f4635xb4010ce8;
        return (i17 == 90 || i17 == 270) ? bitmap.getWidth() : bitmap.getHeight();
    }

    /* renamed from: previewWidth */
    private int m15615xae5176de() {
        android.graphics.Bitmap bitmap = this.f4549xad38f12f;
        if (bitmap == null || !this.f4552xf0ae3ecf) {
            return 0;
        }
        int i17 = this.f4635xb4010ce8;
        return (i17 == 90 || i17 == 270) ? bitmap.getHeight() : bitmap.getWidth();
    }

    private int px(int i17) {
        return (int) (this.f4562x5c8c94e8 * i17);
    }

    /* renamed from: requestDisallowInterceptTouchEvent */
    private void m15616x8f093973(boolean z17) {
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "requestDisallowInterceptTouchEvent disallow: %b, allowInterceptTouch: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f4545x9fc87346));
            if (this.f4545x9fc87346) {
                parent.requestDisallowInterceptTouchEvent(z17);
            } else {
                this.f4581xa68c830e = true;
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    /* renamed from: reset */
    private void m15617x6761d4f(boolean z17) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener onImageEventListener;
        m15646x5b09653("reset newImage=" + z17, new java.lang.Object[0]);
        this.f4656x683094a = 0.0f;
        this.f4658x72090938 = 0.0f;
        this.f4668x500d3578 = null;
        this.f4670xf27949ca = null;
        this.f4669x3edc6717 = null;
        this.f4633x908f5f3 = java.lang.Float.valueOf(0.0f);
        this.f4650xa32b3719 = null;
        this.f4653xcd6de870 = null;
        this.f4590xd6e2c6a5 = false;
        this.f4584xadf2fa47 = false;
        this.f4586xd614b24 = false;
        this.f4618x59614594 = 0;
        this.f4575x7a75f9f7 = 0;
        this.f4665x524c56b7 = null;
        this.f4666x2589a286 = 0.0f;
        this.f4639x5c805ca8 = 0.0f;
        this.f4640xd5c2c156 = false;
        this.f4641x617cbc8b = null;
        this.f4643x2dcff001 = null;
        this.f4644xf0657f49 = null;
        this.f4546x2dc211 = null;
        this.f4655x6f7d10da = null;
        this.f4613xbf8d97c1.reset();
        this.f4651x67b5cf7 = null;
        if (z17) {
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p157xa7c31030.C1448xa1904cba c1448xa1904cba = this.f4596x53ad93ed;
            if (c1448xa1904cba != null) {
                c1448xa1904cba.m15521x6761d4f();
            }
            this.uri = null;
            this.f4561x481c238f.writeLock().lock();
            try {
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135 interfaceC1436x56c1b135 = this.f4560x5befac44;
                if (interfaceC1436x56c1b135 != null) {
                    interfaceC1436x56c1b135.mo15473x408b7293();
                    this.f4560x5befac44 = null;
                }
                this.f4561x481c238f.writeLock().unlock();
                android.graphics.Bitmap bitmap = this.f4549xad38f12f;
                if (bitmap != null && !this.f4551x74c4e93b) {
                    bitmap.recycle();
                }
                if (this.f4549xad38f12f != null && this.f4551x74c4e93b && (onImageEventListener = this.f4624xfe71e412) != null) {
                    onImageEventListener.mo15809x76d22946();
                }
                this.f4654xc9388d13 = 0;
                this.f4648x440a1b7a = 0;
                this.f4649x8269e75d = 0;
                this.f4652x5519b147 = null;
                this.f4630xb666ff84 = null;
                this.f4646xbf0193db = false;
                this.f4582xc483b8f8 = false;
                this.f4549xad38f12f = null;
                this.f4552xf0ae3ecf = false;
                this.f4551x74c4e93b = false;
                this.f4585x8aaa60e3 = false;
                this.f4554x240ebff4 = false;
                this.f4583x720823c0 = true;
            } catch (java.lang.Throwable th6) {
                this.f4561x481c238f.writeLock().unlock();
                throw th6;
            }
        }
        java.util.Map<java.lang.Integer, java.util.List<com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce>> map = this.f4663xb1a0b3ce;
        if (map != null) {
            java.util.Iterator<java.util.Map.Entry<java.lang.Integer, java.util.List<com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                for (com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce : it.next().getValue()) {
                    c1447x27c6ce.f4485x1bd1f072 = false;
                    if (c1447x27c6ce.f4479xad38f12f != null) {
                        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 c1449xe4cdf536 = this.f4604x70744a96;
                        if (c1449xe4cdf536 != null) {
                            android.graphics.Bitmap m15530x12501425 = c1449xe4cdf536.m15530x12501425();
                            android.graphics.Bitmap bitmap2 = c1447x27c6ce.f4479xad38f12f;
                            if (m15530x12501425 == bitmap2) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "reset tile bitmap not need to recycle: %d", java.lang.Integer.valueOf(bitmap2.hashCode()));
                            }
                        }
                        c1447x27c6ce.f4479xad38f12f.recycle();
                        c1447x27c6ce.f4479xad38f12f = null;
                    }
                }
            }
            this.f4663xb1a0b3ce = null;
        }
        m15625x96eaeb6d(getContext());
    }

    /* renamed from: resetScales */
    private void m15618xd0fbb298() {
        this.f4615x17a23246 = 2.0f;
        this.f4619xadc39618 = 1.0f;
    }

    /* renamed from: restoreState */
    private void m15619x61a06aa3(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1450x425c11f1 c1450x425c11f1) {
        if (c1450x425c11f1 == null || c1450x425c11f1.m15542x13c9ef4b() == null || !f4528xc2d62426.contains(java.lang.Integer.valueOf(c1450x425c11f1.m15543x84093c9a()))) {
            return;
        }
        this.f4629xaa32f5d0 = c1450x425c11f1.m15543x84093c9a();
        this.f4633x908f5f3 = java.lang.Float.valueOf(c1450x425c11f1.m15544x7520af94());
        this.f4650xa32b3719 = c1450x425c11f1.m15542x13c9ef4b();
        invalidate();
    }

    /* renamed from: sHeight */
    private int m15620x440a1b7a() {
        int m15669x602f7b3 = m15669x602f7b3();
        return (m15669x602f7b3 == 90 || m15669x602f7b3 == 270) ? this.f4654xc9388d13 : this.f4648x440a1b7a;
    }

    /* renamed from: sWidth */
    private int m15621xc9388d13() {
        int m15669x602f7b3 = m15669x602f7b3();
        return (m15669x602f7b3 == 90 || m15669x602f7b3 == 270) ? this.f4648x440a1b7a : this.f4654xc9388d13;
    }

    /* renamed from: sendStateChanged */
    private void m15622x40bd388b(float f17, android.graphics.PointF pointF, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "sendStateChanged oldScale: %s, %s", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(this.f4656x683094a));
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnStateChangedListener onStateChangedListener = this.f4626x8b7f5336;
        if (onStateChangedListener != null) {
            float f18 = this.f4656x683094a;
            if (f18 != f17) {
                onStateChangedListener.mo15813x264e5589(f18, f17, i17);
            }
        }
        if (this.f4626x8b7f5336 == null || this.f4668x500d3578.equals(pointF)) {
            return;
        }
        this.f4626x8b7f5336.mo15812x74e67900(m15651x13c9ef4b(), i17);
    }

    /* renamed from: setBitmapLoaderImp */
    public static void m15623x94931188(com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1443x7d6b97f interfaceC1443x7d6b97f) {
        f4536x76d4472f = interfaceC1443x7d6b97f;
    }

    /* renamed from: setFullImageBitmap */
    private void m15624xc8b0e799(final android.graphics.Bitmap bitmap) {
        s75.d.b(new java.lang.Runnable() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.5
            @Override // java.lang.Runnable
            public void run() {
                if (bitmap != null) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this;
                    c1451x2b77465d.f4574xad787c5b = c1451x2b77465d.m15697x8b0166fd(bitmap, c1451x2b77465d.f4649x8269e75d, 1.0f, 1.0f);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.TAG, "rotate and scale fullImageBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            }
        }, "rotateAndScaleBitmap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setGestureDetector */
    public void m15625x96eaeb6d(final android.content.Context context) {
        this.f4563x3e7b17c6 = new android.view.GestureDetector(context, new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.3
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
                if (com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4623xac5fb0c7 != null && com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4623xac5fb0c7.onDoubleTap(motionEvent)) {
                    return true;
                }
                if (com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4675x68a99bee && com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4646xbf0193db) {
                    com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this;
                    if (c1451x2b77465d.f4668x500d3578 != null) {
                        c1451x2b77465d.m15625x96eaeb6d(context);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.TAG, "onDoubleTap, quickScaledEnabled: %b", java.lang.Boolean.valueOf(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4638xc607f124));
                        if (!com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4638xc607f124) {
                            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d2 = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this;
                            c1451x2b77465d2.m15589xa1f42d05(c1451x2b77465d2.m15758x1aa0337a(new android.graphics.PointF(motionEvent.getX(), motionEvent.getY())), new android.graphics.PointF(motionEvent.getX(), motionEvent.getY()));
                            return true;
                        }
                        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4665x524c56b7 = new android.graphics.PointF(motionEvent.getX(), motionEvent.getY());
                        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d3 = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this;
                        android.graphics.PointF pointF = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4668x500d3578;
                        c1451x2b77465d3.f4670xf27949ca = new android.graphics.PointF(pointF.x, pointF.y);
                        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d4 = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this;
                        c1451x2b77465d4.f4658x72090938 = c1451x2b77465d4.f4656x683094a;
                        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4586xd614b24 = true;
                        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4590xd6e2c6a5 = true;
                        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4639x5c805ca8 = -1.0f;
                        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d5 = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this;
                        c1451x2b77465d5.f4641x617cbc8b = c1451x2b77465d5.m15758x1aa0337a(c1451x2b77465d5.f4665x524c56b7);
                        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4644xf0657f49 = new android.graphics.PointF(motionEvent.getX(), motionEvent.getY());
                        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4643x2dcff001 = new android.graphics.PointF(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4641x617cbc8b.x, com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4641x617cbc8b.y);
                        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4640xd5c2c156 = false;
                        return false;
                    }
                }
                return super.onDoubleTapEvent(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
                if (!com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4631xb418f7e4 || !com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4646xbf0193db || com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4668x500d3578 == null || motionEvent == null || motionEvent2 == null || ((java.lang.Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && java.lang.Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((java.lang.Math.abs(f17) <= 500.0f && java.lang.Math.abs(f18) <= 500.0f) || com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4590xd6e2c6a5))) {
                    return super.onFling(motionEvent, motionEvent2, f17, f18);
                }
                android.graphics.PointF pointF = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4668x500d3578;
                android.graphics.PointF pointF2 = new android.graphics.PointF(pointF.x + (f17 * 0.25f), pointF.y + (f18 * 0.25f));
                float width = ((com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.getWidth() / 2) - pointF2.x) / com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4656x683094a;
                float height = (r6.getHeight() / 2) - pointF2.y;
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this;
                new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder(new android.graphics.PointF(width, height / c1451x2b77465d.f4656x683094a)).m15799x6910ad91(1).m15796x60988fa3(false).m15795x7b0c1f8c(3).m15797x68ac462();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
                boolean onSingleTapConfirmed;
                if (com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4623xac5fb0c7 != null && com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4623xac5fb0c7.onSingleTapConfirmed(motionEvent)) {
                    return true;
                }
                if (com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4578x6dda0a03 != null && (onSingleTapConfirmed = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4578x6dda0a03.onSingleTapConfirmed(motionEvent))) {
                    return onSingleTapConfirmed;
                }
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.performClick();
                return true;
            }
        });
        this.f4659x5109382e = new android.view.GestureDetector(context, new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.4
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.performClick();
                return true;
            }
        });
    }

    /* renamed from: setMatrixArray */
    private void m15626x59b55556(float[] fArr, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38) {
        fArr[0] = f17;
        fArr[1] = f18;
        fArr[2] = f19;
        fArr[3] = f27;
        fArr[4] = f28;
        fArr[5] = f29;
        fArr[6] = f37;
        fArr[7] = f38;
    }

    /* renamed from: setPreferredBitmapConfig */
    public static void m15627x6626ad30(android.graphics.Bitmap.Config config) {
        f4541x8a682872 = config;
    }

    /* renamed from: setTileInitLoaderImp */
    public static void m15628x2507bb39(com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1445xd16cd870 interfaceC1445xd16cd870) {
        f4538xaa1dac5e = interfaceC1445xd16cd870;
    }

    /* renamed from: setTileLoaderImp */
    public static void m15629x877fa669(com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1446xeee9d020 interfaceC1446xeee9d020) {
        f4539x97592cae = interfaceC1446xeee9d020;
    }

    /* renamed from: sourceToViewRect */
    private android.graphics.Rect m15630x3033143f(android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (this.f4636xd24ed250 == 4) {
            rect2.set((int) m15631xc04cdbfd(rect.right), (int) m15632xc04cdbfe(rect.top), (int) m15631xc04cdbfd(rect.left), (int) m15632xc04cdbfe(rect.bottom));
        } else {
            rect2.set((int) m15631xc04cdbfd(rect.left), (int) m15632xc04cdbfe(rect.top), (int) m15631xc04cdbfd(rect.right), (int) m15632xc04cdbfe(rect.bottom));
        }
        if (this.f4645xfe5e4558 == 2) {
            rect2.set((int) m15631xc04cdbfd(rect.right), (int) m15632xc04cdbfe(rect.top), (int) m15631xc04cdbfd(rect.left), (int) m15632xc04cdbfe(rect.bottom));
        }
        if (this.f4645xfe5e4558 == 5) {
            rect2.set((int) m15631xc04cdbfd(rect.left), (int) m15632xc04cdbfe(rect.bottom), (int) m15631xc04cdbfd(rect.right), (int) m15632xc04cdbfe(rect.top));
        }
        if (this.f4645xfe5e4558 == 7) {
            rect2.set((int) m15631xc04cdbfd(rect.left), (int) m15632xc04cdbfe(rect.bottom), (int) m15631xc04cdbfd(rect.right), (int) m15632xc04cdbfe(rect.top));
        }
        return rect2;
    }

    /* renamed from: sourceToViewX */
    private float m15631xc04cdbfd(float f17) {
        android.graphics.PointF pointF = this.f4668x500d3578;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f17 * this.f4656x683094a) + pointF.x;
    }

    /* renamed from: sourceToViewY */
    private float m15632xc04cdbfe(float f17) {
        android.graphics.PointF pointF = this.f4668x500d3578;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f17 * this.f4656x683094a) + pointF.y;
    }

    /* renamed from: tileVisible */
    private boolean m15633xb18075e4(com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce) {
        float m15636x6c037d = m15636x6c037d(0.0f);
        float m15636x6c037d2 = m15636x6c037d(getWidth());
        float m15637x6c037e = m15637x6c037e(0.0f);
        float m15637x6c037e2 = m15637x6c037e(getHeight());
        android.graphics.Rect rect = c1447x27c6ce.f4482x67b5cf7;
        return m15636x6c037d <= ((float) rect.right) && ((float) rect.left) <= m15636x6c037d2 && m15637x6c037e <= ((float) rect.bottom) && ((float) rect.top) <= m15637x6c037e2;
    }

    /* renamed from: updateScale */
    private void m15634xdd20f601(float f17) {
        float f18 = this.f4656x683094a;
        float f19 = this.f4614x689d8c43[0];
        this.f4656x683094a = f19;
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnStateChangedListener onStateChangedListener = this.f4626x8b7f5336;
        if (onStateChangedListener != null) {
            onStateChangedListener.mo15813x264e5589(f19, f18, 2);
        }
    }

    /* renamed from: vTranslateForSCenter */
    private android.graphics.PointF m15635x7ec6b937(float f17, float f18, float f19) {
        int paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2);
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        if (this.f4655x6f7d10da == null) {
            this.f4655x6f7d10da = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleAndTranslate(0.0f, new android.graphics.PointF(0.0f, 0.0f));
        }
        this.f4655x6f7d10da.f4715x683094a = f19;
        this.f4655x6f7d10da.f4716x500d3578.set(paddingLeft - (f17 * f19), paddingTop - (f18 * f19));
        m15594x30ea3841(true, this.f4655x6f7d10da);
        return this.f4655x6f7d10da.f4716x500d3578;
    }

    /* renamed from: viewToSourceX */
    private float m15636x6c037d(float f17) {
        android.graphics.PointF pointF = this.f4668x500d3578;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f17 - pointF.x) / this.f4656x683094a;
    }

    /* renamed from: viewToSourceY */
    private float m15637x6c037e(float f17) {
        android.graphics.PointF pointF = this.f4668x500d3578;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f17 - pointF.y) / this.f4656x683094a;
    }

    /* renamed from: zoomScaleAndCenter */
    private void m15638xb5596195(android.graphics.PointF pointF, android.graphics.PointF pointF2, float f17) {
        new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder(f17, pointF, pointF2).m15800xe347ee0f(false).m15798x1f943c7a(this.f4676x34b4ebeb).m15795x7b0c1f8c(2).m15797x68ac462();
    }

    /* renamed from: addOnTouchListener */
    public void m15639x90740693(android.view.View.OnTouchListener onTouchListener) {
        this.f4627xb1453d74 = onTouchListener;
    }

    /* renamed from: addPreviewLoadedTime */
    public synchronized void m15640xb6930fb9(int i17) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p157xa7c31030.C1448xa1904cba c1448xa1904cba = this.f4596x53ad93ed;
        if (c1448xa1904cba != null) {
            c1448xa1904cba.m15513xb6930fb9(i17);
        }
    }

    /* renamed from: addTileDecodeTime */
    public synchronized void m15641xe382f62a(int i17) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p157xa7c31030.C1448xa1904cba c1448xa1904cba = this.f4596x53ad93ed;
        if (c1448xa1904cba != null) {
            c1448xa1904cba.m15514xe382f62a(i17);
        }
    }

    /* renamed from: addTileInitTime */
    public synchronized void m15642xabe2300c(int i17) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p157xa7c31030.C1448xa1904cba c1448xa1904cba = this.f4596x53ad93ed;
        if (c1448xa1904cba != null) {
            c1448xa1904cba.m15515xabe2300c(i17);
        }
    }

    /* renamed from: animateCenter */
    public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder m15643x59f07e96(android.graphics.PointF pointF) {
        if (m15682x7b5e8699()) {
            return new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder(pointF);
        }
        return null;
    }

    /* renamed from: animateScale */
    public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder m15644x3d958ae9(float f17) {
        if (m15682x7b5e8699()) {
            return new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder(f17);
        }
        return null;
    }

    /* renamed from: animateScaleAndCenter */
    public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder m15645x92060023(float f17, android.graphics.PointF pointF) {
        if (m15682x7b5e8699()) {
            return new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder(f17, pointF);
        }
        return null;
    }

    /* renamed from: debug */
    public void m15646x5b09653(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String.format(str, objArr);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: doubleTapZoom */
    public float m15647xa1f42d05(float f17, float f18) {
        android.graphics.PointF pointF = new android.graphics.PointF(f17, f18);
        return m15589xa1f42d05(m15758x1aa0337a(pointF), pointF);
    }

    /* renamed from: fileSRect */
    public void m15648xb0d284db(android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (m15669x602f7b3() == 0) {
            rect2.set(rect);
        } else if (m15669x602f7b3() == 90) {
            int i17 = rect.top;
            int i18 = this.f4648x440a1b7a;
            rect2.set(i17, i18 - rect.right, rect.bottom, i18 - rect.left);
        } else if (m15669x602f7b3() == 180) {
            int i19 = this.f4654xc9388d13;
            int i27 = i19 - rect.right;
            int i28 = this.f4648x440a1b7a;
            rect2.set(i27, i28 - rect.bottom, i19 - rect.left, i28 - rect.top);
        } else {
            int i29 = this.f4654xc9388d13;
            rect2.set(i29 - rect.bottom, rect.left, i29 - rect.top, rect.right);
        }
        int i37 = this.f4636xd24ed250;
        if (i37 == 4) {
            int i38 = this.f4654xc9388d13;
            rect2.set(i38 - rect2.right, rect2.top, i38 - rect2.left, rect2.bottom);
        } else if (i37 == 2) {
            int i39 = rect2.left;
            int i47 = this.f4648x440a1b7a;
            rect2.set(i39, i47 - rect2.bottom, rect2.right, i47 - rect2.top);
        } else if (i37 == 5) {
            int i48 = this.f4654xc9388d13;
            rect2.set(i48 - rect2.right, rect2.top, i48 - rect2.left, rect2.bottom);
        } else if (i37 == 7) {
            int i49 = rect2.left;
            int i57 = this.f4648x440a1b7a;
            rect2.set(i49, i57 - rect2.bottom, rect2.right, i57 - rect2.top);
        }
        if (this.f4645xfe5e4558 == 2) {
            int i58 = this.f4654xc9388d13;
            int i59 = i58 - rect2.right;
            int i66 = this.f4648x440a1b7a;
            rect2.set(i59, i66 - rect2.bottom, i58 - rect2.left, i66 - rect2.top);
        }
        if (this.f4645xfe5e4558 == 7) {
            int i67 = this.f4654xc9388d13;
            int i68 = i67 - rect2.right;
            int i69 = this.f4648x440a1b7a;
            rect2.set(i68, i69 - rect2.bottom, i67 - rect2.left, i69 - rect2.top);
        }
    }

    /* renamed from: getAppliedOrientation */
    public final int m15650x3e008f09() {
        return m15669x602f7b3();
    }

    /* renamed from: getCenter */
    public final android.graphics.PointF m15651x13c9ef4b() {
        return m15756x1aa0337a(getWidth() / 2, getHeight() / 2);
    }

    /* renamed from: getDecoderLock */
    public java.util.concurrent.locks.ReadWriteLock m15652x21f26a59() {
        return this.f4561x481c238f;
    }

    /* renamed from: getExifOrientation */
    public int m15653x2a0b6c6a(android.content.Context context, android.net.Uri uri) {
        return m15654x580f8d47(context, uri, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:66:0x00a5, B:68:0x00a9, B:37:0x00ae, B:39:0x00b4, B:40:0x00b9, B:64:0x00b7, B:36:0x00ac), top: B:65:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7 A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:66:0x00a5, B:68:0x00a9, B:37:0x00ae, B:39:0x00b4, B:40:0x00b9, B:64:0x00b7, B:36:0x00ac), top: B:65:0x00a5 }] */
    /* renamed from: getExifOrientationInternal */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m15654x580f8d47(android.content.Context r16, android.net.Uri r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.m15654x580f8d47(android.content.Context, android.net.Uri, boolean):int");
    }

    /* renamed from: getFullImageBitmap */
    public android.graphics.Bitmap m15655x91da4e25() {
        return this.f4574xad787c5b;
    }

    /* renamed from: getFullImageSampleSize */
    public int m15656xd2a5d6c1() {
        return this.f4575x7a75f9f7;
    }

    /* renamed from: getImageDecodeRecord */
    public synchronized com.p151x9ab4726f.p152x329086.p153x9590d8af.p157xa7c31030.C1448xa1904cba m15657xa009424() {
        return this.f4596x53ad93ed;
    }

    /* renamed from: getImageViewMatrixScale */
    public android.graphics.PointF m15658xfdb07fbf() {
        if (java.lang.Float.isNaN(this.f4656x683094a) || java.lang.Float.isInfinite(this.f4656x683094a)) {
            return new android.graphics.PointF(1.0f, 1.0f);
        }
        float f17 = this.f4656x683094a;
        return new android.graphics.PointF(f17, f17);
    }

    /* renamed from: getImageViewMatrixTranslation */
    public android.graphics.PointF m15659x3ffd66() {
        if (this.f4668x500d3578 == null) {
            return null;
        }
        android.graphics.PointF pointF = this.f4668x500d3578;
        return new android.graphics.PointF(pointF.x, pointF.y);
    }

    /* renamed from: getInternalTouchEventConsumed */
    public boolean m15660xecf7a936() {
        return this.f4543xf8cf3e0a;
    }

    /* renamed from: getMaxScale */
    public float m15661x937c6fbc() {
        return this.f4615x17a23246;
    }

    /* renamed from: getMinScale */
    public final float m15662x299dd38e() {
        return m15609xadc39618();
    }

    /* renamed from: getOnImageEventListener */
    public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener m15663xac3da088() {
        return this.f4624xfe71e412;
    }

    /* renamed from: getOrientation */
    public final int m15664x84093c9a() {
        return this.f4629xaa32f5d0;
    }

    /* renamed from: getPanRemaining */
    public final void m15665xcc2c104f(android.graphics.RectF rectF) {
        if (m15682x7b5e8699()) {
            float m15621xc9388d13 = this.f4656x683094a * m15621xc9388d13();
            float m15620x440a1b7a = this.f4656x683094a * m15620x440a1b7a();
            int i17 = this.f4632x3dd5851e;
            if (i17 == 3) {
                rectF.top = java.lang.Math.max(0.0f, -(this.f4668x500d3578.y - (getHeight() / 2)));
                rectF.left = java.lang.Math.max(0.0f, -(this.f4668x500d3578.x - (getWidth() / 2)));
                rectF.bottom = java.lang.Math.max(0.0f, this.f4668x500d3578.y - ((getHeight() / 2) - m15620x440a1b7a));
                rectF.right = java.lang.Math.max(0.0f, this.f4668x500d3578.x - ((getWidth() / 2) - m15621xc9388d13));
                return;
            }
            if (i17 == 2) {
                rectF.top = java.lang.Math.max(0.0f, -(this.f4668x500d3578.y - getHeight()));
                rectF.left = java.lang.Math.max(0.0f, -(this.f4668x500d3578.x - getWidth()));
                rectF.bottom = java.lang.Math.max(0.0f, this.f4668x500d3578.y + m15620x440a1b7a);
                rectF.right = java.lang.Math.max(0.0f, this.f4668x500d3578.x + m15621xc9388d13);
                return;
            }
            rectF.top = java.lang.Math.max(0.0f, -this.f4668x500d3578.y);
            rectF.left = java.lang.Math.max(0.0f, -this.f4668x500d3578.x);
            rectF.bottom = java.lang.Math.max(0.0f, (m15620x440a1b7a + this.f4668x500d3578.y) - getHeight());
            rectF.right = java.lang.Math.max(0.0f, (m15621xc9388d13 + this.f4668x500d3578.x) - getWidth());
        }
    }

    /* renamed from: getPreviewHeight */
    public int m15666xbf6e2759() {
        return this.f4634x20e6b0f;
    }

    /* renamed from: getPreviewOrientation */
    public int m15667xc75d6ede() {
        return this.f4635xb4010ce8;
    }

    /* renamed from: getPreviewWidth */
    public int m15668xf440954() {
        return this.f4637xae5176de;
    }

    /* renamed from: getRequiredRotation */
    public int m15669x602f7b3() {
        int i17 = this.f4629xaa32f5d0;
        return i17 == -1 ? this.f4649x8269e75d : i17;
    }

    /* renamed from: getSHeight */
    public final int m15670x81d75744() {
        return this.f4648x440a1b7a;
    }

    /* renamed from: getSWidth */
    public final int m15671x2e4fb009() {
        return this.f4654xc9388d13;
    }

    /* renamed from: getScale */
    public final float m15672x7520af94() {
        return this.f4656x683094a;
    }

    /* renamed from: getState */
    public final com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1450x425c11f1 m15673x75286adb() {
        if (this.f4668x500d3578 == null || this.f4654xc9388d13 <= 0 || this.f4648x440a1b7a <= 0) {
            return null;
        }
        return new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1450x425c11f1(m15672x7520af94(), m15651x13c9ef4b(), m15664x84093c9a());
    }

    /* renamed from: getsRegion */
    public android.graphics.Rect m15674x2fae5531() {
        return this.f4652x5519b147;
    }

    /* renamed from: hasImage */
    public boolean m15675x72bb6e1() {
        return (this.uri == null && this.f4549xad38f12f == null) ? false : true;
    }

    /* renamed from: initScaleRate */
    public void m15676xeca9821a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "initScaleRate: %f", java.lang.Float.valueOf(this.f4606xac75f5d));
        m15599x9ebfeb76();
        m15600x34e14f48();
    }

    /* renamed from: invertMapPoint */
    public android.graphics.PointF m15677x6fc9078a(float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            return null;
        }
        return new android.graphics.PointF(m15604xb623801d(fArr[0]), m15605xb623801e(fArr[1]));
    }

    /* renamed from: isHorizontalLong */
    public java.lang.Boolean m15678x4dda9c8a() {
        if (this.f4654xc9388d13 <= 0 || this.f4648x440a1b7a <= 0) {
            return null;
        }
        return java.lang.Boolean.valueOf(this.f4580xa72f14c0);
    }

    /* renamed from: isImageLoaded */
    public final boolean m15679x215db1b6() {
        return this.f4582xc483b8f8;
    }

    /* renamed from: isPanEnabled */
    public final boolean m15680x3583f4ae() {
        return this.f4631xb418f7e4;
    }

    /* renamed from: isQuickScaleEnabled */
    public final boolean m15681x5936dd1a() {
        return this.f4638xc607f124;
    }

    /* renamed from: isReady */
    public final boolean m15682x7b5e8699() {
        return this.f4646xbf0193db;
    }

    /* renamed from: isVerticalLong */
    public java.lang.Boolean m15683xd072e95c() {
        if (this.f4654xc9388d13 <= 0 || this.f4648x440a1b7a <= 0) {
            return null;
        }
        return java.lang.Boolean.valueOf(this.f4672xfdd3f712);
    }

    /* renamed from: isZoomEnabled */
    public final boolean m15684x149e3864() {
        return this.f4675x68a99bee;
    }

    /* renamed from: mapPoint */
    public android.graphics.PointF m15685x9d6b994(float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            return null;
        }
        return new android.graphics.PointF(m15631xc04cdbfd(fArr[0]), m15632xc04cdbfe(fArr[1]));
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = this.f4622xf46887d1;
        if (onAttachStateChangeListener != null) {
            onAttachStateChangeListener.onViewAttachedToWindow(this);
        }
        if (this.f4628x9b488652) {
            setLayerType(2, null);
        }
        this.f4556x1c682951 = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        android.graphics.Bitmap bitmap;
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.IReporter iReporter;
        super.onDetachedFromWindow();
        m15584x55249ec0();
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = this.f4622xf46887d1;
        if (onAttachStateChangeListener != null) {
            onAttachStateChangeListener.onViewDetachedFromWindow(this);
        }
        long m15517x68d705e8 = this.f4596x53ad93ed.m15517x68d705e8();
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        if (m15517x68d705e8 <= 0 || secureRandom.nextInt(f4542x731d5c34) != 0 || (bitmap = this.f4574xad787c5b) == null || bitmap.isRecycled() || (iReporter = f4537xb898c6e) == null) {
            return;
        }
        iReporter.m15815xc84c5534(f4535x4955af06, this.f4574xad787c5b.getByteCount(), m15517x68d705e8);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce;
        super.onDraw(canvas);
        java.lang.System.currentTimeMillis();
        m15587x555bf3f1();
        if (this.f4663xb1a0b3ce == null && this.f4560x5befac44 != null) {
            m15602xa250ec09(m15596xbb671caa(canvas));
        }
        android.graphics.Bitmap bitmap = this.f4574xad787c5b;
        if (bitmap == null) {
            bitmap = this.f4549xad38f12f;
        }
        float f17 = this.f4547xdad87dd1;
        if (f17 >= 0.0f && f17 < 1.0f && bitmap != null) {
            int width = getWidth();
            int height = getHeight();
            int height2 = bitmap.getHeight();
            int width2 = bitmap.getWidth();
            float f18 = height2;
            float f19 = (f18 * 1.0f) / width2;
            if (!this.f4573xe1139435) {
                width = (int) (getHeight() / f19);
            }
            float f27 = width;
            int i17 = (int) (f27 * f19);
            this.f4613xbf8d97c1.getValues(this.f4671xcee59d22);
            float[] fArr = this.f4671xcee59d22;
            float f28 = fArr[0];
            float f29 = fArr[5] / fArr[4];
            float f37 = fArr[2];
            if (height2 > width2) {
                float f38 = this.f4547xdad87dd1;
                int i18 = (int) (((height2 - width2) * (1.0f - f38)) / 2.0f);
                int i19 = f19 > (height * 1.0f) / f27 ? (int) (((int) (((f18 - (r9 * r8)) / 2.0f) * f38)) + (f29 * f38)) : 0;
                this.f4661x8b8ef9e8.set(0, i18 - i19, width2, (height2 - i18) - i19);
                int width3 = ((height - i17) / 2) + ((int) (((i17 - getWidth()) * (1.0f - this.f4547xdad87dd1)) / 2.0f));
                int width4 = (int) ((getWidth() - ((getHeight() - (width3 * 2)) / (((f19 - 1.0f) * this.f4547xdad87dd1) + 1.0f))) / 2.0f);
                this.f4568x74b5e949.set(width4, width3, getWidth() - width4, getHeight() - width3);
            } else {
                int i27 = (int) (((width2 - height2) * (1.0f - this.f4547xdad87dd1)) / 2.0f);
                this.f4661x8b8ef9e8.set(i27, 0, width2 - i27, height2);
                int width5 = (height - ((int) (getWidth() / (((width2 - (i27 * 2)) * 1.0f) / f18)))) / 2;
                if (!this.f4571x5c306d8) {
                    float f39 = 1.0f - ((1.0f - this.f4548xa90d9026) * (1.0f - this.f4547xdad87dd1));
                    if ((height - (width5 * 2)) * f39 > i17) {
                        int i28 = (int) (((f27 / (1.0f / f39)) - f27) / 2.0f);
                        this.f4661x8b8ef9e8.set(i28, 0, width2 - i28, height2);
                        width5 = (height - i17) / 2;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "leextest value:%f crop:%d animationScale:%f ", java.lang.Float.valueOf(this.f4547xdad87dd1), java.lang.Integer.valueOf(width5), java.lang.Float.valueOf(this.f4548xa90d9026));
                this.f4568x74b5e949.set(0, width5, getWidth(), getHeight() - width5);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "onDraw aniBitmap, fullImageBitmap:%s, bitmap:%s", this.f4574xad787c5b, this.f4549xad38f12f);
            canvas.drawBitmap(bitmap, this.f4661x8b8ef9e8, this.f4568x74b5e949, this.f4553x6a7e7c6f);
            return;
        }
        if (this.f4654xc9388d13 == 0 || this.f4648x440a1b7a == 0 || getWidth() == 0 || getHeight() == 0 || !m15586xe05ce97b()) {
            return;
        }
        if (this.f4555xed0140eb) {
            m15613xecf24a87();
        }
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.Anim anim = this.f4546x2dc211;
        if (anim != null && anim.f4704xd97e0780 != null) {
            float f47 = this.f4656x683094a;
            if (this.f4669x3edc6717 == null) {
                this.f4669x3edc6717 = new android.graphics.PointF(0.0f, 0.0f);
            }
            this.f4669x3edc6717.set(this.f4668x500d3578);
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f4546x2dc211.f4702x3652cd;
            boolean z17 = currentTimeMillis > this.f4546x2dc211.f4692x89444d94;
            long min = java.lang.Math.min(currentTimeMillis, this.f4546x2dc211.f4692x89444d94);
            this.f4656x683094a = m15591x2f63ee(this.f4546x2dc211.f4693xb1e63d2b, min, this.f4546x2dc211.f4701x72090938, this.f4546x2dc211.f4700xcad70b31 - this.f4546x2dc211.f4701x72090938, this.f4546x2dc211.f4692x89444d94);
            float m15591x2f63ee = m15591x2f63ee(this.f4546x2dc211.f4693xb1e63d2b, min, this.f4546x2dc211.f4704xd97e0780.x, this.f4546x2dc211.f4703x5e86fb79.x - this.f4546x2dc211.f4704xd97e0780.x, this.f4546x2dc211.f4692x89444d94);
            float m15591x2f63ee2 = m15591x2f63ee(this.f4546x2dc211.f4693xb1e63d2b, min, this.f4546x2dc211.f4704xd97e0780.y, this.f4546x2dc211.f4703x5e86fb79.y - this.f4546x2dc211.f4704xd97e0780.y, this.f4546x2dc211.f4692x89444d94);
            this.f4668x500d3578.x -= m15631xc04cdbfd(this.f4546x2dc211.f4697xd615913.x) - m15591x2f63ee;
            this.f4668x500d3578.y -= m15632xc04cdbfe(this.f4546x2dc211.f4697xd615913.y) - m15591x2f63ee2;
            m15649x30ea3841(z17 || this.f4546x2dc211.f4701x72090938 == this.f4546x2dc211.f4700xcad70b31);
            m15622x40bd388b(f47, this.f4669x3edc6717, this.f4546x2dc211.f4696xc3e1af26);
            m15694x147aac0b(z17);
            if (z17) {
                if (this.f4546x2dc211.f4695x503cc4b4 != null) {
                    try {
                        this.f4546x2dc211.f4695x503cc4b4.mo15802x815f5438();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.TAG, "Error thrown by animation listener", e17);
                    }
                }
                this.f4546x2dc211 = null;
            }
            invalidate();
        }
        if (this.f4663xb1a0b3ce != null && m15606x237a984d() && this.f4601x5d0f68bd) {
            int min2 = java.lang.Math.min(this.f4575x7a75f9f7, m15583x9c8bd256(this.f4656x683094a));
            if (this.f4592xec2b2b7a) {
                min2 = this.f4575x7a75f9f7;
            }
            boolean z18 = false;
            for (java.util.Map.Entry<java.lang.Integer, java.util.List<com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce>> entry : this.f4663xb1a0b3ce.entrySet()) {
                if (entry.getKey().intValue() == min2) {
                    for (com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce2 : entry.getValue()) {
                        if (c1447x27c6ce2.f4485x1bd1f072 && (c1447x27c6ce2.f4481x1410e13c || c1447x27c6ce2.f4479xad38f12f == null)) {
                            z18 = true;
                        }
                    }
                }
            }
            for (java.util.Map.Entry<java.lang.Integer, java.util.List<com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce>> entry2 : this.f4663xb1a0b3ce.entrySet()) {
                if (entry2.getKey().intValue() == min2 || z18) {
                    for (com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce3 : entry2.getValue()) {
                        m15630x3033143f(c1447x27c6ce3.f4482x67b5cf7, c1447x27c6ce3.f4484x6a5a37a);
                        boolean z19 = c1447x27c6ce3.f4481x1410e13c;
                        if (z19 || c1447x27c6ce3.f4479xad38f12f == null) {
                            c1447x27c6ce = c1447x27c6ce3;
                            if (z19 && this.f4557x5b09653) {
                                canvas.drawText("LOADING", c1447x27c6ce.f4484x6a5a37a.left + px(5), c1447x27c6ce.f4484x6a5a37a.top + px(35), this.f4559xd525ee1e);
                            }
                        } else {
                            android.graphics.Paint paint = this.f4662x8a29648b;
                            if (paint != null) {
                                canvas.drawRect(c1447x27c6ce3.f4484x6a5a37a, paint);
                            }
                            if (this.f4613xbf8d97c1 == null) {
                                this.f4613xbf8d97c1 = new android.graphics.Matrix();
                            }
                            this.f4613xbf8d97c1.reset();
                            c1447x27c6ce = c1447x27c6ce3;
                            m15626x59b55556(this.f4660xe566d2d5, 0.0f, 0.0f, c1447x27c6ce3.f4479xad38f12f.getWidth(), 0.0f, c1447x27c6ce3.f4479xad38f12f.getWidth(), c1447x27c6ce3.f4479xad38f12f.getHeight(), 0.0f, c1447x27c6ce3.f4479xad38f12f.getHeight());
                            if (m15669x602f7b3() == 0) {
                                float[] fArr2 = this.f4567x211dcf94;
                                android.graphics.Rect rect = c1447x27c6ce.f4484x6a5a37a;
                                int i29 = rect.left;
                                int i37 = rect.top;
                                int i38 = rect.right;
                                int i39 = rect.bottom;
                                m15626x59b55556(fArr2, i29, i37, i38, i37, i38, i39, i29, i39);
                            } else if (m15669x602f7b3() == 90) {
                                float[] fArr3 = this.f4567x211dcf94;
                                android.graphics.Rect rect2 = c1447x27c6ce.f4484x6a5a37a;
                                int i47 = rect2.right;
                                int i48 = rect2.top;
                                float f48 = i47;
                                int i49 = rect2.bottom;
                                int i57 = rect2.left;
                                m15626x59b55556(fArr3, i47, i48, f48, i49, i57, i49, i57, i48);
                            } else if (m15669x602f7b3() == 180) {
                                float[] fArr4 = this.f4567x211dcf94;
                                android.graphics.Rect rect3 = c1447x27c6ce.f4484x6a5a37a;
                                int i58 = rect3.right;
                                int i59 = rect3.bottom;
                                int i66 = rect3.left;
                                int i67 = rect3.top;
                                m15626x59b55556(fArr4, i58, i59, i66, i59, i66, i67, i58, i67);
                            } else if (m15669x602f7b3() == 270) {
                                float[] fArr5 = this.f4567x211dcf94;
                                android.graphics.Rect rect4 = c1447x27c6ce.f4484x6a5a37a;
                                int i68 = rect4.left;
                                int i69 = rect4.bottom;
                                float f49 = i68;
                                int i76 = rect4.top;
                                int i77 = rect4.right;
                                m15626x59b55556(fArr5, i68, i69, f49, i76, i77, i76, i77, i69);
                            }
                            this.f4613xbf8d97c1.setPolyToPoly(this.f4660xe566d2d5, 0, this.f4567x211dcf94, 0, 4);
                            if (!c1447x27c6ce.f4479xad38f12f.isRecycled()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "onDraw previewRotateFlip:%s tile.bitmap:%s tileSampleSize:%s tile.vRect:%s tile.bitmapSize: %s-%s matrix: %s", java.lang.Integer.valueOf(this.f4636xd24ed250), c1447x27c6ce.f4479xad38f12f, java.lang.Integer.valueOf(c1447x27c6ce.f4483x887e4cb), c1447x27c6ce.f4484x6a5a37a, java.lang.Integer.valueOf(c1447x27c6ce.f4479xad38f12f.getWidth()), java.lang.Integer.valueOf(c1447x27c6ce.f4479xad38f12f.getHeight()), this.f4613xbf8d97c1);
                                canvas.drawBitmap(c1447x27c6ce.f4479xad38f12f, this.f4613xbf8d97c1, this.f4553x6a7e7c6f);
                            }
                            if (this.f4557x5b09653) {
                                canvas.drawRect(c1447x27c6ce.f4484x6a5a37a, this.f4558xa7f027b7);
                            }
                        }
                        if (c1447x27c6ce.f4485x1bd1f072 && this.f4557x5b09653) {
                            canvas.drawText("ISS " + c1447x27c6ce.f4483x887e4cb + " RECT " + c1447x27c6ce.f4482x67b5cf7.top + "," + c1447x27c6ce.f4482x67b5cf7.left + "," + c1447x27c6ce.f4482x67b5cf7.bottom + "," + c1447x27c6ce.f4482x67b5cf7.right, c1447x27c6ce.f4484x6a5a37a.left + px(5), c1447x27c6ce.f4484x6a5a37a.top + px(40), this.f4559xd525ee1e);
                        }
                    }
                }
            }
        } else {
            android.graphics.Bitmap bitmap2 = this.f4549xad38f12f;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                if (!this.f4552xf0ae3ecf) {
                    m15590xdd1f0793(canvas);
                } else if (this.f4554x240ebff4) {
                    m15590xdd1f0793(canvas);
                }
            }
        }
        if (this.f4557x5b09653) {
            float f57 = this.f4668x500d3578.x;
            float f58 = this.f4668x500d3578.y;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Scale: ");
            java.util.Locale locale = java.util.Locale.ENGLISH;
            sb6.append(java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(this.f4656x683094a)));
            sb6.append(" (");
            sb6.append(java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(m15609xadc39618())));
            sb6.append(" - ");
            sb6.append(java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(this.f4615x17a23246)));
            sb6.append(")");
            canvas.drawText(sb6.toString(), px(5), px(15), this.f4559xd525ee1e);
            canvas.drawText("Translate: " + java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(this.f4668x500d3578.x)) + ":" + java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(this.f4668x500d3578.y)), px(5), px(30), this.f4559xd525ee1e);
            android.graphics.PointF m15651x13c9ef4b = m15651x13c9ef4b();
            canvas.drawText("Source center: " + java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(m15651x13c9ef4b.x)) + ":" + java.lang.String.format(locale, "%.2f", java.lang.Float.valueOf(m15651x13c9ef4b.y)), px(5), px(45), this.f4559xd525ee1e);
            canvas.drawText("Orientation: " + this.f4645xfe5e4558 + " Hash@" + hashCode(), px(5), px(60), this.f4559xd525ee1e);
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.Anim anim2 = this.f4546x2dc211;
            if (anim2 != null) {
                android.graphics.PointF m15752xd560cbfa = m15752xd560cbfa(anim2.f4699x3b37669a);
                android.graphics.PointF m15752xd560cbfa2 = m15752xd560cbfa(this.f4546x2dc211.f4698xba54e39b);
                android.graphics.PointF m15752xd560cbfa3 = m15752xd560cbfa(this.f4546x2dc211.f4697xd615913);
                canvas.drawCircle(m15752xd560cbfa.x, m15752xd560cbfa.y, px(10), this.f4558xa7f027b7);
                this.f4558xa7f027b7.setColor(-65536);
                canvas.drawCircle(m15752xd560cbfa2.x, m15752xd560cbfa2.y, px(20), this.f4558xa7f027b7);
                this.f4558xa7f027b7.setColor(-16776961);
                canvas.drawCircle(m15752xd560cbfa3.x, m15752xd560cbfa3.y, px(25), this.f4558xa7f027b7);
                this.f4558xa7f027b7.setColor(-16711936);
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, px(30), this.f4558xa7f027b7);
            }
            if (this.f4665x524c56b7 != null) {
                this.f4558xa7f027b7.setColor(-65536);
                android.graphics.PointF pointF = this.f4665x524c56b7;
                canvas.drawCircle(pointF.x, pointF.y, px(20), this.f4558xa7f027b7);
            }
            if (this.f4641x617cbc8b != null) {
                this.f4558xa7f027b7.setColor(-16776961);
                canvas.drawCircle(m15631xc04cdbfd(this.f4641x617cbc8b.x), m15632xc04cdbfe(this.f4641x617cbc8b.y), px(35), this.f4558xa7f027b7);
            }
            if (this.f4644xf0657f49 != null && this.f4586xd614b24) {
                this.f4558xa7f027b7.setColor(-12303292);
                android.graphics.PointF pointF2 = this.f4644xf0657f49;
                canvas.drawCircle(pointF2.x, pointF2.y, px(30), this.f4558xa7f027b7);
            }
            this.f4558xa7f027b7.setColor(-65281);
        }
    }

    /* renamed from: onImageLoaded */
    public synchronized void m15687x91f79de1(final android.graphics.Bitmap bitmap, final int i17, boolean z17) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener onImageEventListener;
        m15646x5b09653("onImageLoaded has bitmap", new java.lang.Object[0]);
        int i18 = this.f4654xc9388d13;
        if (i18 > 0 && this.f4648x440a1b7a > 0 && (i18 != bitmap.getWidth() || this.f4648x440a1b7a != bitmap.getHeight())) {
            m15617x6761d4f(false);
        }
        android.graphics.Bitmap bitmap2 = this.f4549xad38f12f;
        if (bitmap2 != null && !this.f4551x74c4e93b) {
            bitmap2.recycle();
        }
        if (this.f4549xad38f12f != null && this.f4551x74c4e93b && (onImageEventListener = this.f4624xfe71e412) != null) {
            onImageEventListener.mo15809x76d22946();
        }
        this.f4552xf0ae3ecf = false;
        this.f4551x74c4e93b = z17;
        this.f4549xad38f12f = bitmap;
        this.f4654xc9388d13 = bitmap.getWidth();
        this.f4648x440a1b7a = bitmap.getHeight();
        this.f4649x8269e75d = i17;
        final boolean m15586xe05ce97b = m15586xe05ce97b();
        final boolean m15585x25cae318 = m15585x25cae318();
        s75.d.b(new java.lang.Runnable() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.6
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                int i19 = i17;
                if (i19 != 0) {
                    com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this;
                    c1451x2b77465d.f4549xad38f12f = c1451x2b77465d.m15697x8b0166fd(bitmap, i19, 1.0f, 1.0f);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.TAG, "onImageLoaded rotaeAndScaleBitmap %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.post(new java.lang.Runnable() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnonymousClass6 anonymousClass6 = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnonymousClass6.this;
                        if (m15586xe05ce97b || m15585x25cae318) {
                            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.invalidate();
                            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.requestLayout();
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
        if (this.f4654xc9388d13 > 0 && this.f4648x440a1b7a > 0) {
            if (z18 && z19) {
                size = m15621xc9388d13();
                size2 = m15620x440a1b7a();
            } else if (z19) {
                size2 = (int) ((m15620x440a1b7a() / m15621xc9388d13()) * size);
            } else if (z18) {
                size = (int) ((m15621xc9388d13() / m15620x440a1b7a()) * size2);
            }
        }
        int max = java.lang.Math.max(size, getSuggestedMinimumWidth());
        int max2 = java.lang.Math.max(size2, getSuggestedMinimumHeight());
        setMeasuredDimension(max, max2);
        if (max == this.f4611x1c7f2c34 && max2 == this.f4610x59976079) {
            z17 = false;
        } else {
            this.f4611x1c7f2c34 = max;
            this.f4610x59976079 = max2;
        }
        if (z17 && this.f4555xed0140eb) {
            invalidate();
        }
    }

    /* renamed from: onPreviewLoaded */
    public synchronized void m15688x3c79ee4e(android.graphics.Bitmap bitmap, java.lang.Integer num) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "onPreviewLoaded");
        if (bitmap != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "onPreviewLoaded %d, recycle: %b", java.lang.Integer.valueOf(bitmap.hashCode()), java.lang.Boolean.valueOf(bitmap.isRecycled()));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f4582xc483b8f8) {
            android.graphics.Bitmap bitmap2 = this.f4549xad38f12f;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            return;
        }
        android.graphics.Rect rect = this.f4630xb666ff84;
        if (rect != null) {
            if (rect.width() > 0 && this.f4630xb666ff84.height() > 0) {
                android.graphics.Rect rect2 = this.f4630xb666ff84;
                int i17 = rect2.left;
                int i18 = rect2.top;
                int width = rect2.width();
                int height = this.f4630xb666ff84.height();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
                this.f4549xad38f12f = createBitmap;
                this.f4635xb4010ce8 = 0;
            }
        } else if (num != null) {
            this.f4635xb4010ce8 = num.intValue();
            this.f4549xad38f12f = bitmap;
        } else {
            this.f4549xad38f12f = bitmap;
        }
        this.f4552xf0ae3ecf = true;
        this.f4554x240ebff4 = false;
        this.f4637xae5176de = this.f4549xad38f12f.getWidth();
        this.f4634x20e6b0f = this.f4549xad38f12f.getHeight();
        m15601x9053f392();
        this.f4554x240ebff4 = true;
        if (m15586xe05ce97b()) {
            invalidate();
            requestLayout();
        }
        m15640xb6930fb9((int) (java.lang.System.currentTimeMillis() - currentTimeMillis));
        m15611x3c79ee4e();
    }

    /* renamed from: onReady */
    public void m15689xb03baf04() {
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        m15646x5b09653("onSizeChanged %dx%d -> %dx%d scale: %f, pendingScale: %f, needPendingScale: %b", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(this.f4656x683094a), this.f4633x908f5f3, java.lang.Boolean.valueOf(this.f4599xe0d96c36));
        m15676xeca9821a();
        android.graphics.PointF m15651x13c9ef4b = m15651x13c9ef4b();
        if ((this.f4646xbf0193db || this.f4599xe0d96c36) && m15651x13c9ef4b != null) {
            this.f4546x2dc211 = null;
            if (this.f4599xe0d96c36) {
                return;
            }
            this.f4633x908f5f3 = java.lang.Float.valueOf(this.f4656x683094a);
            this.f4650xa32b3719 = m15651x13c9ef4b;
        }
    }

    /* renamed from: onTileLoaded */
    public synchronized void m15690x82449392(com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce) {
        android.graphics.Bitmap bitmap;
        this.f4577x274fa223 = java.lang.System.currentTimeMillis();
        android.graphics.Rect rect = c1447x27c6ce.f4482x67b5cf7;
        boolean z17 = rect != null && rect.top == 0;
        android.graphics.Bitmap bitmap2 = c1447x27c6ce.f4479xad38f12f;
        if ((z17 || c1447x27c6ce.f4482x67b5cf7 == null) && c1447x27c6ce.f4483x887e4cb == this.f4575x7a75f9f7 && c1447x27c6ce.f4479xad38f12f != null && this.f4583x720823c0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "onTileLoaded set fullImageBitmap");
            this.f4583x720823c0 = false;
            this.f4574xad787c5b = c1447x27c6ce.f4479xad38f12f;
        }
        m15586xe05ce97b();
        m15585x25cae318();
        if (m15606x237a984d() && (bitmap = this.f4549xad38f12f) != null) {
            if (!this.f4551x74c4e93b) {
                bitmap.recycle();
            }
            this.f4549xad38f12f = null;
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener onImageEventListener = this.f4624xfe71e412;
            if (onImageEventListener != null && this.f4551x74c4e93b) {
                onImageEventListener.mo15809x76d22946();
            }
            this.f4552xf0ae3ecf = false;
            this.f4551x74c4e93b = false;
        }
        invalidate();
    }

    /* renamed from: onTilesInited */
    public synchronized void m15691x95426e35(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135 interfaceC1436x56c1b135, int i17, int i18, int i19) {
        int i27;
        int i28;
        int i29;
        int i37;
        m15646x5b09653("onTilesInited sWidth: %d, sHeight: %d, this.sWidth: %d, this.sHeight: %d, sOrientation: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f4654xc9388d13), java.lang.Integer.valueOf(this.f4648x440a1b7a), java.lang.Integer.valueOf(i19));
        int i38 = this.f4654xc9388d13;
        if (i38 > 0 && (i37 = this.f4648x440a1b7a) > 0 && (i38 != i17 || i37 != i18)) {
            m15617x6761d4f(false);
            android.graphics.Bitmap bitmap = this.f4549xad38f12f;
            if (bitmap != null) {
                if (!this.f4551x74c4e93b) {
                    bitmap.recycle();
                }
                this.f4549xad38f12f = null;
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener onImageEventListener = this.f4624xfe71e412;
                if (onImageEventListener != null && this.f4551x74c4e93b) {
                    onImageEventListener.mo15809x76d22946();
                }
                this.f4552xf0ae3ecf = false;
                this.f4551x74c4e93b = false;
            }
        }
        this.f4560x5befac44 = interfaceC1436x56c1b135;
        this.f4654xc9388d13 = i17;
        this.f4648x440a1b7a = i18;
        this.f4649x8269e75d = i19;
        m15586xe05ce97b();
        if (!m15585x25cae318() && (i27 = this.f4617x77fdb2b4) > 0 && i27 != (i28 = f4526xf733d2dc) && (i29 = this.f4616x6de9a9f9) > 0 && i29 != i28 && getWidth() > 0 && getHeight() > 0) {
            m15602xa250ec09(new android.graphics.Point(this.f4617x77fdb2b4, this.f4616x6de9a9f9));
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
        throw new UnsupportedOperationException("Method not decompiled: com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: provideExecutor */
    public java.util.concurrent.Executor m15692x5691fa94() {
        return this.f4572x79c5f8d3;
    }

    /* renamed from: recycle */
    public void m15693x408b7293() {
        m15617x6761d4f(true);
        this.f4553x6a7e7c6f = null;
        this.f4559xd525ee1e = null;
        this.f4558xa7f027b7 = null;
        this.f4662x8a29648b = null;
    }

    /* renamed from: refreshRequiredTiles */
    public void m15694x147aac0b(boolean z17) {
        if (this.f4560x5befac44 == null || this.f4663xb1a0b3ce == null) {
            return;
        }
        int min = java.lang.Math.min(this.f4575x7a75f9f7, m15583x9c8bd256(this.f4656x683094a));
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, java.util.List<com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce>>> it = this.f4663xb1a0b3ce.entrySet().iterator();
        while (it.hasNext()) {
            for (com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce : it.next().getValue()) {
                int i17 = c1447x27c6ce.f4483x887e4cb;
                if (i17 < min || (i17 > min && i17 != this.f4575x7a75f9f7)) {
                    c1447x27c6ce.f4485x1bd1f072 = false;
                    android.graphics.Bitmap bitmap = c1447x27c6ce.f4479xad38f12f;
                    if (bitmap != null) {
                        bitmap.recycle();
                        c1447x27c6ce.f4479xad38f12f = null;
                    }
                }
                int i18 = c1447x27c6ce.f4483x887e4cb;
                if (i18 == min) {
                    if (m15633xb18075e4(c1447x27c6ce)) {
                        c1447x27c6ce.f4485x1bd1f072 = true;
                        if (!c1447x27c6ce.f4481x1410e13c && c1447x27c6ce.f4479xad38f12f == null && z17) {
                            m15610xb8e9f94b(c1447x27c6ce);
                        }
                    } else if (c1447x27c6ce.f4483x887e4cb != this.f4575x7a75f9f7) {
                        c1447x27c6ce.f4485x1bd1f072 = false;
                        android.graphics.Bitmap bitmap2 = c1447x27c6ce.f4479xad38f12f;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            c1447x27c6ce.f4479xad38f12f = null;
                        }
                    }
                } else if (i18 == this.f4575x7a75f9f7) {
                    c1447x27c6ce.f4485x1bd1f072 = true;
                }
            }
        }
    }

    /* renamed from: resetScaleAndCenter */
    public final void m15695x13361211() {
        this.f4546x2dc211 = null;
        this.f4633x908f5f3 = java.lang.Float.valueOf(m15608xc45833d0(0.0f));
        if (m15682x7b5e8699()) {
            this.f4650xa32b3719 = new android.graphics.PointF(m15621xc9388d13() / 2, m15620x440a1b7a() / 2);
        } else {
            this.f4650xa32b3719 = new android.graphics.PointF(0.0f, 0.0f);
        }
        invalidate();
    }

    /* renamed from: resetSize */
    public void m15696x78a031f0() {
        m15744xefc853e4(this.f4606xac75f5d, new android.graphics.PointF(0.0f, 0.0f));
    }

    /* renamed from: rotateAndScaleBitmap */
    public android.graphics.Bitmap m15697x8b0166fd(android.graphics.Bitmap bitmap, int i17, float f17, float f18) {
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.TAG, "rotateAndScaleBitmap bitmap is null");
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
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.TAG, e17, "createBitmap oom", new java.lang.Object[0]);
                f4541x8a682872 = android.graphics.Bitmap.Config.RGB_565;
            }
        }
        return null;
    }

    /* renamed from: setAllowInterceptTouchEvent */
    public void m15698x95d78576(boolean z17) {
        this.f4545x9fc87346 = z17;
    }

    /* renamed from: setAnimationProgress */
    public void m15699x9a3118f(float f17, boolean z17) {
        this.f4571x5c306d8 = z17;
        this.f4547xdad87dd1 = f17;
        invalidate();
    }

    /* renamed from: setAnimationScale */
    public void m15700x5f9bc528(float f17) {
        this.f4548xa90d9026 = f17;
    }

    /* renamed from: setBitmapDecoderClass */
    public final void m15701x2ba0f265(java.lang.Class<? extends com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135> cls) {
        if (cls == null) {
            throw new java.lang.IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.f4550x2b190735 = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1432xe9ec7068(cls);
    }

    /* renamed from: setBitmapDecoderFactory */
    public final void m15702x5337f2b7(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1433xf1915446<? extends com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135> interfaceC1433xf1915446) {
        if (interfaceC1433xf1915446 == null) {
            throw new java.lang.IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.f4550x2b190735 = interfaceC1433xf1915446;
    }

    /* renamed from: setCanRefresh */
    public void m15703x96646ed(boolean z17) {
        this.f4555xed0140eb = z17;
    }

    /* renamed from: setCustomPlaceHolderBitmap */
    public void m15704x2090c66f(android.graphics.Bitmap bitmap) {
        this.f4549xad38f12f = bitmap;
        this.f4554x240ebff4 = true;
        invalidate();
    }

    /* renamed from: setDebug */
    public final void m15705x52dc5711(boolean z17) {
        this.f4557x5b09653 = z17;
    }

    /* renamed from: setDoubleTabZoomToNormal */
    public void m15706xbc839517(boolean z17) {
        this.f4570x59cd0158 = z17;
    }

    /* renamed from: setDoubleTapZoomDpi */
    public final void m15707x9d9029a(int i17) {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        m15709xf8702b47(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i17);
    }

    /* renamed from: setDoubleTapZoomDuration */
    public final void m15708xc3aa8e77(int i17) {
        this.f4564xe7ec09b9 = java.lang.Math.max(0, i17);
    }

    /* renamed from: setDoubleTapZoomScale */
    public final void m15709xf8702b47(float f17) {
        this.f4565x4de84745 = f17;
    }

    /* renamed from: setDoubleTapZoomStyle */
    public final void m15710xf8783fae(int i17) {
        if (f4531x98fb16eb.contains(java.lang.Integer.valueOf(i17))) {
            this.f4566x4df05bac = i17;
        } else {
            throw new java.lang.IllegalArgumentException("Invalid zoom style: " + i17);
        }
    }

    /* renamed from: setDrawFullSampleSizeBitmap */
    public void m15711x3a5986f(boolean z17) {
        if (this.f4628x9b488652 || this.f4592xec2b2b7a == z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "setDrawFullSampleSizeBitmap %s", java.lang.Boolean.valueOf(z17));
        this.f4592xec2b2b7a = z17;
        invalidate();
    }

    /* renamed from: setEagerLoadingEnabled */
    public void m15712xff4379fb(boolean z17) {
        this.f4569x58ceddbd = z17;
    }

    /* renamed from: setEdgeSwipeListener */
    public void m15713xfa6df0f(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.EdgeSwipeListener edgeSwipeListener) {
        this.f4594x7dbdd264 = edgeSwipeListener;
    }

    /* renamed from: setExecutor */
    public void m15714xf0589755(java.util.concurrent.Executor executor) {
        if (executor == null) {
            throw new java.lang.NullPointerException("Executor must not be null");
        }
        this.f4572x79c5f8d3 = executor;
    }

    /* renamed from: setFitWidth */
    public void m15715x57a632b7(boolean z17) {
        this.f4573xe1139435 = z17;
    }

    /* renamed from: setGestureDetectorListener */
    public void m15716x540a5741(android.view.GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.f4578x6dda0a03 = simpleOnGestureListener;
    }

    /* renamed from: setImage */
    public final void m15717x53266a19(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 c1449xe4cdf536) {
        m15719x53266a19(c1449xe4cdf536, null, null);
    }

    /* renamed from: setImageViewMatrix */
    public void m15721x548ba9bf(android.graphics.Matrix matrix) {
        if (this.f4668x500d3578 == null) {
            this.f4668x500d3578 = new android.graphics.PointF();
        }
        matrix.getValues(this.f4614x689d8c43);
        android.graphics.PointF pointF = this.f4668x500d3578;
        float[] fArr = this.f4614x689d8c43;
        pointF.set(fArr[2], fArr[5]);
        m15634xdd20f601(this.f4614x689d8c43[0]);
        m15649x30ea3841(false);
        invalidate();
    }

    /* renamed from: setInternalTouchEventConsumed */
    public void m15722xdcb65f42(boolean z17) {
        this.f4543xf8cf3e0a = z17;
    }

    /* renamed from: setLastTileTimeStamp */
    public synchronized void m15723x7a11beb0() {
        this.f4596x53ad93ed.m15523x7a11beb0();
    }

    /* renamed from: setMaxScale */
    public final void m15724x8e34d0c8(float f17) {
        this.f4615x17a23246 = f17;
    }

    /* renamed from: setMaxTileSize */
    public void m15725x6bd6bf91(int i17) {
        this.f4617x77fdb2b4 = i17;
        this.f4616x6de9a9f9 = i17;
    }

    /* renamed from: setMaximumDpi */
    public final void m15727x7237291f(int i17) {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        m15728x2456349a(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i17);
    }

    /* renamed from: setMinScale */
    public final void m15728x2456349a(float f17) {
        this.f4619xadc39618 = f17;
    }

    /* renamed from: setMinimumDpi */
    public final void m15729x58ee071(int i17) {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        m15724x8e34d0c8(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i17);
    }

    /* renamed from: setMinimumScaleType */
    public final void m15730x70eb13b8(int i17) {
        if (!f4530x44c1d921.contains(java.lang.Integer.valueOf(i17))) {
            throw new java.lang.IllegalArgumentException("Invalid scale type: " + i17);
        }
        this.f4620x25161736 = i17;
        if (m15682x7b5e8699()) {
            m15649x30ea3841(true);
            invalidate();
        }
    }

    /* renamed from: setMinimumTileDpi */
    public void m15731x2c2244e3(int i17) {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f4621x75940fe1 = (int) java.lang.Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, i17);
        if (m15682x7b5e8699()) {
            m15617x6761d4f(false);
            invalidate();
        }
    }

    /* renamed from: setOnAttachStateChangeListener */
    public void m15732x8314060f(android.view.View.OnAttachStateChangeListener onAttachStateChangeListener) {
        this.f4622xf46887d1 = onAttachStateChangeListener;
    }

    /* renamed from: setOnDoubleTapListener */
    public void m15733x52d44d05(android.view.GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f4623xac5fb0c7 = onDoubleTapListener;
    }

    /* renamed from: setOnImageEventListener */
    public void m15734x2690cf94(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener onImageEventListener) {
        this.f4624xfe71e412 = onImageEventListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.f4625x62e28521 = onLongClickListener;
    }

    /* renamed from: setOnStateChangedListener */
    public void m15735x27916638(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnStateChangedListener onStateChangedListener) {
        this.f4626x8b7f5336 = onStateChangedListener;
    }

    /* renamed from: setOpenHardware */
    public void m15736x328413d4(boolean z17) {
        this.f4628x9b488652 = z17;
    }

    /* renamed from: setOrientation */
    public final void m15737x1a6eb00e(int i17) {
        if (!f4528xc2d62426.contains(java.lang.Integer.valueOf(i17))) {
            throw new java.lang.IllegalArgumentException("Invalid orientation: " + i17);
        }
        this.f4629xaa32f5d0 = i17;
        m15617x6761d4f(false);
        invalidate();
        requestLayout();
    }

    /* renamed from: setPanEnabled */
    public final void m15738xd07dfde6(boolean z17) {
        android.graphics.PointF pointF;
        this.f4631xb418f7e4 = z17;
        if (z17 || (pointF = this.f4668x500d3578) == null) {
            return;
        }
        pointF.x = (getWidth() / 2) - (this.f4656x683094a * (m15621xc9388d13() / 2));
        this.f4668x500d3578.y = (getHeight() / 2) - (this.f4656x683094a * (m15620x440a1b7a() / 2));
        if (m15682x7b5e8699()) {
            m15694x147aac0b(true);
            invalidate();
        }
    }

    /* renamed from: setPanLimit */
    public final void m15739xb46823a0(int i17) {
        if (!f4529xbf31ce5d.contains(java.lang.Integer.valueOf(i17))) {
            throw new java.lang.IllegalArgumentException("Invalid pan limit: " + i17);
        }
        this.f4632x3dd5851e = i17;
        if (m15682x7b5e8699()) {
            m15649x30ea3841(true);
            invalidate();
        }
    }

    /* renamed from: setPreviewDone */
    public void m15740x233e11a8(boolean z17) {
        this.f4601x5d0f68bd = z17;
        invalidate();
    }

    /* renamed from: setQuickScaleEnabled */
    public final void m15741xf4d284e2(boolean z17) {
        this.f4638xc607f124 = z17;
    }

    /* renamed from: setRegionDecoderClass */
    public final void m15742xd35ca8aa(java.lang.Class<? extends com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135> cls) {
        if (cls == null) {
            throw new java.lang.IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.f4647xd2c0403a = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1432xe9ec7068(cls);
    }

    /* renamed from: setRegionDecoderFactory */
    public final void m15743xfadf2bbc(com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1433xf1915446<? extends com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135> interfaceC1433xf1915446) {
        if (interfaceC1433xf1915446 == null) {
            throw new java.lang.IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.f4647xd2c0403a = interfaceC1433xf1915446;
    }

    /* renamed from: setScaleAndCenter */
    public final void m15744xefc853e4(float f17, android.graphics.PointF pointF) {
        this.f4546x2dc211 = null;
        this.f4599xe0d96c36 = true;
        this.f4633x908f5f3 = java.lang.Float.valueOf(f17);
        this.f4650xa32b3719 = pointF;
        this.f4653xcd6de870 = pointF;
        invalidate();
    }

    /* renamed from: setScaleChangeReportListener */
    public void m15745xf8b16000(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleChangeReportListener scaleChangeReportListener) {
        this.f4657xdd5f6a42 = scaleChangeReportListener;
    }

    /* renamed from: setScaleRate */
    public void m15746xebd14708(float f17) {
        this.f4606xac75f5d = f17;
        m15618xd0fbb298();
        m15599x9ebfeb76();
        m15600x34e14f48();
    }

    /* renamed from: setTileBackgroundColor */
    public final void m15747x8eff8685(int i17) {
        if (android.graphics.Color.alpha(i17) == 0) {
            this.f4662x8a29648b = null;
        } else {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.f4662x8a29648b = paint;
            paint.setStyle(android.graphics.Paint.Style.FILL);
            this.f4662x8a29648b.setColor(i17);
        }
        invalidate();
    }

    /* renamed from: setZoomEnabled */
    public final void m15748xd8e5562c(boolean z17) {
        this.f4675x68a99bee = z17;
    }

    /* renamed from: setsRegion */
    public void m15749xa31fa2a5(android.graphics.Rect rect) {
        this.f4652x5519b147 = rect;
    }

    /* renamed from: sourceToViewCoord */
    public final android.graphics.PointF m15752xd560cbfa(android.graphics.PointF pointF) {
        return m15751xd560cbfa(pointF.x, pointF.y, new android.graphics.PointF());
    }

    /* renamed from: startRevertAnimation */
    public float m15754x736b953e() {
        return m15589xa1f42d05(m15758x1aa0337a(new android.graphics.PointF(m15621xc9388d13() / 2, m15620x440a1b7a() / 2)), (android.graphics.PointF) null);
    }

    /* renamed from: viewToFileRect */
    public void m15755x792539a0(android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (this.f4668x500d3578 == null || !this.f4646xbf0193db) {
            return;
        }
        rect2.set((int) m15636x6c037d(rect.left), (int) m15637x6c037e(rect.top), (int) m15636x6c037d(rect.right), (int) m15637x6c037e(rect.bottom));
        m15648xb0d284db(rect2, rect2);
        rect2.set(java.lang.Math.max(0, rect2.left), java.lang.Math.max(0, rect2.top), java.lang.Math.min(this.f4654xc9388d13, rect2.right), java.lang.Math.min(this.f4648x440a1b7a, rect2.bottom));
        android.graphics.Rect rect3 = this.f4652x5519b147;
        if (rect3 != null) {
            rect2.offset(rect3.left, rect3.top);
        }
    }

    /* renamed from: viewToSourceCoord */
    public final android.graphics.PointF m15758x1aa0337a(android.graphics.PointF pointF) {
        return m15757x1aa0337a(pointF.x, pointF.y, new android.graphics.PointF());
    }

    /* renamed from: visibleFileRect */
    public void m15760xc15d6812(android.graphics.Rect rect) {
        if (this.f4668x500d3578 == null || !this.f4646xbf0193db) {
            return;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m15755x792539a0(rect, rect);
    }

    /* renamed from: zoomToWithAnimation */
    public void m15761x5457de50(float f17, float f18, float f19) {
        new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder(f17, m15758x1aa0337a(new android.graphics.PointF(f18, f19))).m15800xe347ee0f(false).m15798x1f943c7a(this.f4564xe7ec09b9).m15795x7b0c1f8c(4).m15797x68ac462();
        invalidate();
    }

    /* renamed from: setImage */
    public final void m15720x53266a19(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 c1449xe4cdf536, com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1450x425c11f1 c1450x425c11f1) {
        m15719x53266a19(c1449xe4cdf536, null, c1450x425c11f1);
    }

    /* renamed from: sourceToViewCoord */
    public final android.graphics.PointF m15750xd560cbfa(float f17, float f18) {
        return m15751xd560cbfa(f17, f18, new android.graphics.PointF());
    }

    /* renamed from: viewToSourceCoord */
    public final android.graphics.PointF m15756x1aa0337a(float f17, float f18) {
        return m15757x1aa0337a(f17, f18, new android.graphics.PointF());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doubleTapZoom */
    public float m15589xa1f42d05(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        if (!this.f4631xb418f7e4) {
            android.graphics.PointF pointF3 = this.f4653xcd6de870;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = pointF3.y;
            } else {
                pointF.x = m15621xc9388d13() / 2;
                pointF.y = m15620x440a1b7a() / 2;
            }
        }
        float m15595x6144a93b = m15595x6144a93b();
        float f17 = this.f4656x683094a;
        double d17 = m15595x6144a93b * 0.9d;
        boolean z17 = ((double) f17) <= d17 || f17 == this.f4606xac75f5d;
        if (this.f4570x59cd0158 && f17 > this.f4606xac75f5d && f17 <= d17) {
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "doubleTapZoom %f, scale: %s, mScaleRate: %s, zoomIn: %b", java.lang.Float.valueOf(m15595x6144a93b), java.lang.Float.valueOf(this.f4656x683094a), java.lang.Float.valueOf(this.f4606xac75f5d), java.lang.Boolean.valueOf(z17));
        if (!z17) {
            m15595x6144a93b = this.f4606xac75f5d;
        }
        float f18 = m15595x6144a93b;
        int i17 = this.f4566x4df05bac;
        if (i17 == 3) {
            m15744xefc853e4(f18, pointF);
        } else if (i17 == 2 || !z17 || !this.f4631xb418f7e4) {
            new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder(f18, pointF).m15800xe347ee0f(false).m15798x1f943c7a(this.f4564xe7ec09b9).m15795x7b0c1f8c(4).m15797x68ac462();
        } else if (i17 == 1) {
            new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder(f18, pointF, pointF2).m15800xe347ee0f(false).m15798x1f943c7a(this.f4564xe7ec09b9).m15795x7b0c1f8c(4).m15797x68ac462();
        }
        invalidate();
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleChangeReportListener scaleChangeReportListener = this.f4657xdd5f6a42;
        if (scaleChangeReportListener != null) {
            scaleChangeReportListener.mo15819x92a4c352(f18);
        }
        return f18;
    }

    /* renamed from: setImage */
    public final void m15718x53266a19(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 c1449xe4cdf536, com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 c1449xe4cdf5362) {
        m15719x53266a19(c1449xe4cdf536, c1449xe4cdf5362, null);
    }

    /* renamed from: setMaxTileSize */
    public void m15726x6bd6bf91(int i17, int i18) {
        this.f4617x77fdb2b4 = i17;
        this.f4616x6de9a9f9 = i18;
    }

    /* renamed from: sourceToViewCoord */
    public final android.graphics.PointF m15753xd560cbfa(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        return m15751xd560cbfa(pointF.x, pointF.y, pointF2);
    }

    /* renamed from: viewToSourceCoord */
    public final android.graphics.PointF m15759x1aa0337a(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        return m15757x1aa0337a(pointF.x, pointF.y, pointF2);
    }

    /* renamed from: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView$AnimationBuilder */
    /* loaded from: classes15.dex */
    public final class AnimationBuilder {

        /* renamed from: duration */
        private long f4705x89444d94;

        /* renamed from: easing */
        private int f4706xb1e63d2b;

        /* renamed from: interruptible */
        private boolean f4707x36587d35;

        /* renamed from: listener */
        private com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnAnimationEventListener f4708x503cc4b4;

        /* renamed from: origin */
        private int f4709xc3e1af26;

        /* renamed from: panLimited */
        private boolean f4710x1e88c23d;

        /* renamed from: targetSCenter */
        private final android.graphics.PointF f4711xc4d7c7d7;

        /* renamed from: targetScale */
        private final float f4712x830efa39;

        /* renamed from: vFocus */
        private final android.graphics.PointF f4714xcd6a3e02;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: withOrigin */
        public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder m15795x7b0c1f8c(int i17) {
            this.f4709xc3e1af26 = i17;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: withPanLimited */
        public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder m15796x60988fa3(boolean z17) {
            this.f4710x1e88c23d = z17;
            return this;
        }

        /* renamed from: start */
        public void m15797x68ac462() {
            android.graphics.PointF pointF;
            if (com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211 != null && com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4695x503cc4b4 != null) {
                try {
                    com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4695x503cc4b4.mo15803xe532d3d7();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.TAG, "Error thrown by animation listener", e17);
                }
            }
            int paddingLeft = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.getPaddingLeft() + (((com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.getWidth() - com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.getPaddingRight()) - com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.getPaddingLeft()) / 2);
            int paddingTop = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.getPaddingTop() + (((com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.getHeight() - com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.getPaddingBottom()) - com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.getPaddingTop()) / 2);
            float m15608xc45833d0 = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.m15608xc45833d0(this.f4712x830efa39);
            if (this.f4710x1e88c23d) {
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this;
                android.graphics.PointF pointF2 = this.f4711xc4d7c7d7;
                pointF = c1451x2b77465d.m15607xd8b8f7ae(pointF2.x, pointF2.y, m15608xc45833d0, new android.graphics.PointF());
            } else {
                pointF = this.f4711xc4d7c7d7;
            }
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211 = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.Anim();
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4701x72090938 = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4656x683094a;
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4700xcad70b31 = m15608xc45833d0;
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4702x3652cd = java.lang.System.currentTimeMillis();
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4698xba54e39b = pointF;
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4699x3b37669a = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.m15651x13c9ef4b();
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4697xd615913 = pointF;
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4704xd97e0780 = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.m15752xd560cbfa(pointF);
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4703x5e86fb79 = new android.graphics.PointF(paddingLeft, paddingTop);
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4692x89444d94 = this.f4705x89444d94;
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4694x36587d35 = this.f4707x36587d35;
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4693xb1e63d2b = this.f4706xb1e63d2b;
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4696xc3e1af26 = this.f4709xc3e1af26;
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4702x3652cd = java.lang.System.currentTimeMillis();
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4695x503cc4b4 = this.f4708x503cc4b4;
            android.graphics.PointF pointF3 = this.f4714xcd6a3e02;
            if (pointF3 != null) {
                float f17 = pointF3.x - (com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4699x3b37669a.x * m15608xc45833d0);
                float f18 = this.f4714xcd6a3e02.y - (com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4699x3b37669a.y * m15608xc45833d0);
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleAndTranslate scaleAndTranslate = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleAndTranslate(m15608xc45833d0, new android.graphics.PointF(f17, f18));
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.m15594x30ea3841(true, scaleAndTranslate);
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4546x2dc211.f4703x5e86fb79 = new android.graphics.PointF(this.f4714xcd6a3e02.x + (scaleAndTranslate.f4716x500d3578.x - f17), this.f4714xcd6a3e02.y + (scaleAndTranslate.f4716x500d3578.y - f18));
            }
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.invalidate();
        }

        /* renamed from: withDuration */
        public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder m15798x1f943c7a(long j17) {
            this.f4705x89444d94 = j17;
            return this;
        }

        /* renamed from: withEasing */
        public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder m15799x6910ad91(int i17) {
            if (com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.f4527x518f3b53.contains(java.lang.Integer.valueOf(i17))) {
                this.f4706xb1e63d2b = i17;
                return this;
            }
            throw new java.lang.IllegalArgumentException("Unknown easing type: " + i17);
        }

        /* renamed from: withInterruptible */
        public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder m15800xe347ee0f(boolean z17) {
            this.f4707x36587d35 = z17;
            return this;
        }

        /* renamed from: withOnAnimationEventListener */
        public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.AnimationBuilder m15801x668127ef(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnAnimationEventListener onAnimationEventListener) {
            this.f4708x503cc4b4 = onAnimationEventListener;
            return this;
        }

        private AnimationBuilder(android.graphics.PointF pointF) {
            this.f4705x89444d94 = 500L;
            this.f4706xb1e63d2b = 2;
            this.f4709xc3e1af26 = 1;
            this.f4707x36587d35 = true;
            this.f4710x1e88c23d = true;
            this.f4712x830efa39 = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4656x683094a;
            this.f4711xc4d7c7d7 = pointF;
            this.f4714xcd6a3e02 = null;
        }

        private AnimationBuilder(float f17) {
            this.f4705x89444d94 = 500L;
            this.f4706xb1e63d2b = 2;
            this.f4709xc3e1af26 = 1;
            this.f4707x36587d35 = true;
            this.f4710x1e88c23d = true;
            this.f4712x830efa39 = f17;
            this.f4711xc4d7c7d7 = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.m15651x13c9ef4b();
            this.f4714xcd6a3e02 = null;
        }

        private AnimationBuilder(float f17, android.graphics.PointF pointF) {
            this.f4705x89444d94 = 500L;
            this.f4706xb1e63d2b = 2;
            this.f4709xc3e1af26 = 1;
            this.f4707x36587d35 = true;
            this.f4710x1e88c23d = true;
            this.f4712x830efa39 = f17;
            this.f4711xc4d7c7d7 = pointF;
            this.f4714xcd6a3e02 = null;
        }

        private AnimationBuilder(float f17, android.graphics.PointF pointF, android.graphics.PointF pointF2) {
            this.f4705x89444d94 = 500L;
            this.f4706xb1e63d2b = 2;
            this.f4709xc3e1af26 = 1;
            this.f4707x36587d35 = true;
            this.f4710x1e88c23d = true;
            this.f4712x830efa39 = f17;
            this.f4711xc4d7c7d7 = pointF;
            this.f4714xcd6a3e02 = pointF2;
        }
    }

    /* renamed from: setImage */
    public final void m15719x53266a19(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 c1449xe4cdf536, com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 c1449xe4cdf5362, com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1450x425c11f1 c1450x425c11f1) {
        android.net.Uri uri;
        if (c1449xe4cdf536 != null) {
            this.f4597xae0481b0 = c1449xe4cdf536;
            this.f4604x70744a96 = c1449xe4cdf5362;
            m15617x6761d4f(true);
            if (c1450x425c11f1 != null) {
                m15619x61a06aa3(c1450x425c11f1);
            }
            if (c1449xe4cdf536.m15536xb5887636() != null) {
                this.f4649x8269e75d = m15654x580f8d47(getContext(), c1449xe4cdf536.m15536xb5887636(), true);
            }
            if (c1449xe4cdf5362 != null) {
                c1449xe4cdf536.m15530x12501425();
                if (c1449xe4cdf536.m15534x2e4fb009() > 0 && c1449xe4cdf536.m15532x81d75744() > 0) {
                    this.f4654xc9388d13 = c1449xe4cdf536.m15534x2e4fb009();
                    this.f4648x440a1b7a = c1449xe4cdf536.m15532x81d75744();
                    this.f4630xb666ff84 = c1449xe4cdf5362.m15533x92e6ed11();
                    if (c1449xe4cdf5362.m15530x12501425() != null) {
                        this.f4551x74c4e93b = c1449xe4cdf5362.m15537xd6a232ec();
                        m15688x3c79ee4e(c1449xe4cdf5362.m15530x12501425(), 0);
                    } else {
                        android.net.Uri m15536xb5887636 = c1449xe4cdf5362.m15536xb5887636();
                        if (m15536xb5887636 != null || c1449xe4cdf5362.m15531x67860184() == null) {
                            uri = m15536xb5887636;
                        } else {
                            uri = android.net.Uri.parse("android.resource://" + getContext().getPackageName() + "/" + c1449xe4cdf5362.m15531x67860184());
                        }
                        f4536x76d4472f.mo15501x6bff0255(this, getContext(), this.f4550x2b190735, uri, true).mo15505x8111fc68();
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.TAG, "Preview image cannot be used unless dimensions are provided for the main image");
                }
            }
            if (c1449xe4cdf536.m15530x12501425() != null && c1449xe4cdf536.m15533x92e6ed11() != null) {
                android.graphics.Bitmap m15530x12501425 = c1449xe4cdf536.m15530x12501425();
                int i17 = c1449xe4cdf536.m15533x92e6ed11().left;
                int i18 = c1449xe4cdf536.m15533x92e6ed11().top;
                int width = c1449xe4cdf536.m15533x92e6ed11().width();
                int height = c1449xe4cdf536.m15533x92e6ed11().height();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(width));
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(m15530x12501425);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView", "setImage", "(Lcom/davemorrissey/labs/subscaleview/view/ImageSource;Lcom/davemorrissey/labs/subscaleview/view/ImageSource;Lcom/davemorrissey/labs/subscaleview/view/ImageViewState;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                yj0.a.e(obj, createBitmap, "com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView", "setImage", "(Lcom/davemorrissey/labs/subscaleview/view/ImageSource;Lcom/davemorrissey/labs/subscaleview/view/ImageSource;Lcom/davemorrissey/labs/subscaleview/view/ImageViewState;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                m15687x91f79de1(createBitmap, 0, false);
                return;
            }
            if (c1449xe4cdf536.m15530x12501425() != null) {
                m15687x91f79de1(c1449xe4cdf536.m15530x12501425(), 0, c1449xe4cdf536.m15537xd6a232ec());
                return;
            }
            this.f4652x5519b147 = c1449xe4cdf536.m15533x92e6ed11();
            android.net.Uri m15536xb58876362 = c1449xe4cdf536.m15536xb5887636();
            this.uri = m15536xb58876362;
            if (m15536xb58876362 == null && c1449xe4cdf536.m15531x67860184() != null) {
                this.uri = android.net.Uri.parse("android.resource://" + getContext().getPackageName() + "/" + c1449xe4cdf536.m15531x67860184());
            }
            if (!c1449xe4cdf536.m15535xfb85bb24() && this.f4652x5519b147 == null) {
                f4536x76d4472f.mo15501x6bff0255(this, getContext(), this.f4550x2b190735, this.uri, false).mo15505x8111fc68();
                return;
            } else {
                f4538xaa1dac5e.mo15506x6bff0255(this, getContext(), this.f4647xd2c0403a, this.uri).mo15505x8111fc68();
                return;
            }
        }
        throw new java.lang.NullPointerException("imageSource must not be null");
    }

    /* renamed from: sourceToViewCoord */
    public final android.graphics.PointF m15751xd560cbfa(float f17, float f18, android.graphics.PointF pointF) {
        if (this.f4668x500d3578 == null) {
            return null;
        }
        pointF.set(m15631xc04cdbfd(f17), m15632xc04cdbfe(f18));
        return pointF;
    }

    /* renamed from: viewToSourceCoord */
    public final android.graphics.PointF m15757x1aa0337a(float f17, float f18, android.graphics.PointF pointF) {
        if (this.f4668x500d3578 == null) {
            return null;
        }
        pointF.set(m15636x6c037d(f17), m15637x6c037e(f18));
        return pointF;
    }

    /* renamed from: onImageLoaded */
    public void m15686x91f79de1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "onImageLoaded");
        m15676xeca9821a();
        m15744xefc853e4(this.f4606xac75f5d, new android.graphics.PointF(0.0f, 0.0f));
        if (this.f4577x274fa223 != -1) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f4576x6034e2dc = currentTimeMillis;
            m15641xe382f62a((int) (currentTimeMillis - this.f4577x274fa223));
        }
        s75.d.b(new java.lang.Runnable() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.7
            @Override // java.lang.Runnable
            public void run() {
                if (com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4574xad787c5b != null && !com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4574xad787c5b.isRecycled()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.TAG, "rotateAndScale fullImageBitmap");
                    com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this;
                    c1451x2b77465d.f4574xad787c5b = c1451x2b77465d.m15697x8b0166fd(c1451x2b77465d.f4574xad787c5b, com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4649x8269e75d, 1.0f, 1.0f);
                }
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.post(new java.lang.Runnable() { // from class: com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4624xfe71e412 != null) {
                            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4624xfe71e412.mo15806x91f79de1(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.this.f4574xad787c5b);
                        }
                    }
                });
            }
        }, "rotateAndScaleFullImageBitmap");
    }

    /* renamed from: fitToBounds */
    public void m15649x30ea3841(boolean z17) {
        boolean z18;
        float f17 = 0.0f;
        if (this.f4668x500d3578 == null) {
            this.f4668x500d3578 = new android.graphics.PointF(0.0f, 0.0f);
            z18 = true;
        } else {
            z18 = false;
        }
        if (this.f4655x6f7d10da == null) {
            this.f4655x6f7d10da = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleAndTranslate(f17, new android.graphics.PointF(0.0f, 0.0f));
        }
        this.f4655x6f7d10da.f4715x683094a = this.f4656x683094a;
        this.f4655x6f7d10da.f4716x500d3578.set(this.f4668x500d3578);
        m15594x30ea3841(z17, this.f4655x6f7d10da);
        this.f4656x683094a = this.f4655x6f7d10da.f4715x683094a;
        this.f4668x500d3578.set(this.f4655x6f7d10da.f4716x500d3578);
        if (!z18 || this.f4620x25161736 == 4) {
            return;
        }
        this.f4668x500d3578.set(m15635x7ec6b937(m15621xc9388d13() / 2, m15620x440a1b7a() / 2, this.f4656x683094a));
    }

    /* renamed from: onPreviewLoaded */
    private void m15611x3c79ee4e() {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnImageEventListener onImageEventListener;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "onPreviewLoaded");
        if (this.f4585x8aaa60e3 || (onImageEventListener = this.f4624xfe71e412) == null) {
            return;
        }
        onImageEventListener.mo15808x3c79ee4e();
    }

    public C1451x2b77465d(android.content.Context context) {
        this(context, null);
    }
}
