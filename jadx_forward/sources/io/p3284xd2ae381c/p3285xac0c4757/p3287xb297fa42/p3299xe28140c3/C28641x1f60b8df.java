package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3;

/* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer */
/* loaded from: classes15.dex */
public class C28641x1f60b8df implements io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 {

    /* renamed from: SURFACE_PRODUCER_USE_IMAGE_DEFAULT */
    public static int f71168x9743e1ca = 0;

    /* renamed from: SURFACE_PRODUCER_USE_IMAGE_FORCE */
    public static int f71169x73a1e8b4 = 1;

    /* renamed from: SURFACE_PRODUCER_USE_IMAGE_FORCE_NOT */
    public static int f71170x8a82cca8 = -1;
    private static final java.lang.String TAG = "FlutterRenderer";

    /* renamed from: debugDisableSurfaceClear */
    public static boolean f71171xd0ff0b55;

    /* renamed from: debugForceSurfaceProducerGlTextures */
    public static boolean f71172xa7831204;

    /* renamed from: flutterJNI */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 f71175x2014a1e9;

    /* renamed from: flutterUiDisplayListener */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 f71176xa34b51a6;

    /* renamed from: processLifecycleOwnerObserver */
    private p012xc85e97e9.p093xedfae76a.f f71182x27f328ae;

    /* renamed from: surface */
    private android.view.Surface f71183x9189ecad;

    /* renamed from: nextTextureId */
    private final java.util.concurrent.atomic.AtomicLong f71180x3cad39e3 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: backgroundExecutor */
    private java.util.concurrent.Executor f71173x735fa421 = new io.p3284xd2ae381c.p3319x36f002.ExecutorC28968xd6131384();

    /* renamed from: isDisplayingFlutterUi */
    private boolean f71179x6250be46 = false;

    /* renamed from: handler */
    private android.os.Handler f71177x294b574a = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: checkSurfaceOnStopOrPause */
    private boolean f71174xdeae198d = false;

    /* renamed from: surfaceProducerUseImage */
    private int f71184x88770893 = f71168x9743e1ca;

    /* renamed from: onTrimMemoryListeners */
    private final java.util.Set<java.lang.ref.WeakReference<io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener>> f71181x1e2ed95d = new java.util.HashSet();

    /* renamed from: imageReaderProducers */
    private final java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer> f71178x8699e2c3 = new java.util.ArrayList();

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeature */
    /* loaded from: classes15.dex */
    public static final class DisplayFeature {

        /* renamed from: bounds */
        public final android.graphics.Rect f71189xad8df6b5;

        /* renamed from: state */
        public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeatureState f71190x68ac491;

        /* renamed from: type */
        public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeatureType f71191x368f3a;

        public DisplayFeature(android.graphics.Rect rect, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeatureType displayFeatureType, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeatureState displayFeatureState) {
            this.f71189xad8df6b5 = rect;
            this.f71191x368f3a = displayFeatureType;
            this.f71190x68ac491 = displayFeatureState;
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeatureState */
    /* loaded from: classes15.dex */
    public enum DisplayFeatureState {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);


        /* renamed from: encodedValue */
        public final int f71196xe7c71503;

        DisplayFeatureState(int i17) {
            this.f71196xe7c71503 = i17;
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$DisplayFeatureType */
    /* loaded from: classes15.dex */
    public enum DisplayFeatureType {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);


        /* renamed from: encodedValue */
        public final int f71202xe7c71503;

        DisplayFeatureType(int i17) {
            this.f71202xe7c71503 = i17;
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer */
    /* loaded from: classes15.dex */
    public final class ImageReaderSurfaceProducer implements io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.ImageConsumer, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener {

        /* renamed from: CLEANUP_ON_MEMORY_PRESSURE */
        private static final boolean f71203xdb3c86fe = true;

        /* renamed from: MAX_DEQUEUED_IMAGES */
        private static final int f71204xe7f606e8 = 2;

        /* renamed from: MAX_IMAGES */
        private static final int f71205xf73c15d3 = 6;
        private static final java.lang.String TAG = "ImageReaderSurfaceProducer";

        /* renamed from: VERBOSE_LOGS */
        private static final boolean f71206xe0bb7e6c = false;

        /* renamed from: trimOnMemoryPressure */
        private static final boolean f71207x2fb28267 = true;

        /* renamed from: id, reason: collision with root package name */
        private final long f374761id;

        /* renamed from: released */
        private boolean f71222xdf23d93d;

        /* renamed from: ignoringFence */
        private boolean f71210xe2e38362 = false;

        /* renamed from: requestedWidth */
        private int f71224xbc9a1af8 = 1;

        /* renamed from: requestedHeight */
        private int f71223xbcda4a35 = 1;

        /* renamed from: createNewReader */
        private boolean f71209x829a10e7 = true;

        /* renamed from: notifiedDestroy */
        private boolean f71219x1eee0342 = false;

        /* renamed from: lastDequeueTime */
        private long f71212xa5001fa7 = 0;

        /* renamed from: lastQueueTime */
        private long f71214x2d5e0588 = 0;

        /* renamed from: lastScheduleTime */
        private long f71216xebdebba = 0;

        /* renamed from: numTrims */
        private int f71220x8ecfb8ab = 0;

        /* renamed from: lock */
        private final java.lang.Object f71218x32c52b = new java.lang.Object();

        /* renamed from: imageReaderQueue */
        private final java.util.ArrayDeque<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader> f71211xd63ff9b3 = new java.util.ArrayDeque<>();

        /* renamed from: perImageReaders */
        private final java.util.HashMap<android.media.ImageReader, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader> f71221x10b1c3f2 = new java.util.HashMap<>();

        /* renamed from: lastDequeuedImage */
        private java.util.ArrayList<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImage> f71213x7f016991 = new java.util.ArrayList<>();

        /* renamed from: lastReaderDequeuedFrom */
        private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader f71215xb0027897 = null;

        /* renamed from: callback */
        private io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer.Callback f71208xf5bc2045 = null;

        /* renamed from: listener */
        private io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameAvailableListener f71217x503cc4b4 = null;

        /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer$PerImage */
        /* loaded from: classes15.dex */
        public class PerImage {

            /* renamed from: image */
            public final android.media.Image f71226x5faa95b;

            /* renamed from: queuedTime */
            public final long f71227x72c3dee0;

            public PerImage(android.media.Image image, long j17) {
                this.f71226x5faa95b = image;
                this.f71227x72c3dee0 = j17;
            }
        }

        /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer$PerImageReader */
        /* loaded from: classes15.dex */
        public class PerImageReader {

            /* renamed from: reader */
            public final android.media.ImageReader f71231xc84558c3;

            /* renamed from: imageQueue */
            private final java.util.ArrayDeque<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImage> f71230xa93c2076 = new java.util.ArrayDeque<>();

            /* renamed from: closed */
            private boolean f71229xaf15e16c = false;

            public PerImageReader(android.media.ImageReader imageReader) {
                this.f71231xc84558c3 = imageReader;
                imageReader.setOnImageAvailableListener(new android.media.ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer$PerImageReader$$a
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(android.media.ImageReader imageReader2) {
                        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader.this.m138100x51ef5f0f(imageReader2);
                    }
                }, new android.os.Handler(android.os.Looper.getMainLooper()));
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: lambda$new$0 */
            public /* synthetic */ void m138100x51ef5f0f(android.media.ImageReader imageReader) {
                android.media.Image image;
                try {
                    image = imageReader.acquireLatestImage();
                } catch (java.lang.IllegalStateException e17) {
                    io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e17);
                    image = null;
                }
                if (image == null) {
                    return;
                }
                if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.this.f71222xdf23d93d || this.f71229xaf15e16c) {
                    image.close();
                } else {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.this.m138090xafc07ebc(imageReader, image);
                }
            }

            /* renamed from: canPrune */
            public boolean m138101xf7a2d1ba() {
                return this.f71230xa93c2076.isEmpty() && io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.this.f71215xb0027897 != this;
            }

            /* renamed from: close */
            public void m138102x5a5ddf8() {
                this.f71229xaf15e16c = true;
                this.f71231xc84558c3.close();
                this.f71230xa93c2076.clear();
            }

            /* renamed from: dequeueImage */
            public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImage m138103x30f1c20b() {
                if (this.f71230xa93c2076.isEmpty()) {
                    return null;
                }
                return this.f71230xa93c2076.removeFirst();
            }

            /* renamed from: imageQueueIsEmpty */
            public boolean m138104xa08e58ed() {
                return this.f71230xa93c2076.isEmpty();
            }

            /* renamed from: queueImage */
            public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImage m138105x7152a2ca(android.media.Image image) {
                if (this.f71229xaf15e16c) {
                    return null;
                }
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImage perImage = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImage(image, java.lang.System.nanoTime());
                this.f71230xa93c2076.add(perImage);
                while (this.f71230xa93c2076.size() > 2) {
                    this.f71230xa93c2076.removeFirst().f71226x5faa95b.close();
                }
                return perImage;
            }
        }

        public ImageReaderSurfaceProducer(long j17) {
            this.f374761id = j17;
        }

        /* renamed from: cleanup */
        private void m138066x331156a4() {
            synchronized (this.f71218x32c52b) {
                for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader perImageReader : this.f71221x10b1c3f2.values()) {
                    if (this.f71215xb0027897 == perImageReader) {
                        this.f71215xb0027897 = null;
                    }
                    perImageReader.m138102x5a5ddf8();
                }
                this.f71221x10b1c3f2.clear();
                if (this.f71213x7f016991.size() > 0) {
                    java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImage> it = this.f71213x7f016991.iterator();
                    while (it.hasNext()) {
                        it.next().f71226x5faa95b.close();
                    }
                    this.f71213x7f016991.clear();
                }
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader perImageReader2 = this.f71215xb0027897;
                if (perImageReader2 != null) {
                    perImageReader2.m138102x5a5ddf8();
                    this.f71215xb0027897 = null;
                }
                this.f71211xd63ff9b3.clear();
            }
        }

        /* renamed from: createImageReader29 */
        private android.media.ImageReader m138067x7e71c529() {
            return android.media.ImageReader.newInstance(this.f71224xbc9a1af8, this.f71223xbcda4a35, 34, 6, 256L);
        }

        /* renamed from: createImageReader33 */
        private android.media.ImageReader m138068x7e71c542() {
            android.media.ImageReader.Builder builder = new android.media.ImageReader.Builder(this.f71224xbc9a1af8, this.f71223xbcda4a35);
            builder.setMaxImages(6);
            builder.setImageFormat(34);
            builder.setUsage(256L);
            return builder.build();
        }

        /* renamed from: getActiveReader */
        private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader m138069xb35679df() {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader peekLast;
            synchronized (this.f71218x32c52b) {
                if (!this.f71209x829a10e7 && (peekLast = this.f71211xd63ff9b3.peekLast()) != null && peekLast.f71231xc84558c3.getSurface().isValid()) {
                    return peekLast;
                }
                this.f71209x829a10e7 = false;
                return m138070x55563e36(m138076xac380f62());
            }
        }

        /* renamed from: getOrCreatePerImageReader */
        private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader m138070x55563e36(android.media.ImageReader imageReader) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader perImageReader = this.f71221x10b1c3f2.get(imageReader);
            if (perImageReader != null) {
                return perImageReader;
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader m138077xefa954bd = m138077xefa954bd(imageReader);
            this.f71221x10b1c3f2.put(imageReader, m138077xefa954bd);
            this.f71211xd63ff9b3.add(m138077xefa954bd);
            return m138077xefa954bd;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$dequeueImage$0 */
        public /* synthetic */ void m138071x3f422654() {
            if (this.f71222xdf23d93d) {
                return;
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.m138041xef603934();
        }

        /* renamed from: maybeWaitOnFence */
        private void m138072x4ec398d5(android.media.Image image) {
            if (image == null || this.f71210xe2e38362) {
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                m138074xbb082e5d(image);
            } else {
                this.f71210xe2e38362 = true;
                io.p3284xd2ae381c.Log.w(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        /* renamed from: releaseInternal */
        private void m138073x95125be4() {
            m138066x331156a4();
            this.f71222xdf23d93d = true;
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.m138038x8940247a(this);
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.f71178x8699e2c3.remove(this);
        }

        /* renamed from: waitOnFence */
        private void m138074xbb082e5d(android.media.Image image) {
            try {
                image.getFence().awaitForever();
            } catch (java.io.IOException unused) {
            }
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.ImageConsumer
        /* renamed from: acquireLatestImage */
        public android.media.Image mo138075xaf314b5e() {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImage m138079x30f1c20b = m138079x30f1c20b();
            if (m138079x30f1c20b == null) {
                return null;
            }
            m138072x4ec398d5(m138079x30f1c20b.f71226x5faa95b);
            return m138079x30f1c20b.f71226x5faa95b;
        }

        /* renamed from: createImageReader */
        public android.media.ImageReader m138076xac380f62() {
            int i17 = android.os.Build.VERSION.SDK_INT;
            if (i17 >= 33) {
                return m138068x7e71c542();
            }
            if (i17 >= 29) {
                return m138067x7e71c529();
            }
            throw new java.lang.UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        /* renamed from: createPerImageReader */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader m138077xefa954bd(android.media.ImageReader imageReader) {
            return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader(imageReader);
        }

        /* renamed from: deltaMillis */
        public double m138078xbdd2981e(long j17) {
            return j17 / 1000000.0d;
        }

        /* renamed from: dequeueImage */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImage m138079x30f1c20b() {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImage perImage;
            boolean z17;
            synchronized (this.f71218x32c52b) {
                java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader> it = this.f71211xd63ff9b3.iterator();
                perImage = null;
                while (true) {
                    z17 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader next = it.next();
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImage m138103x30f1c20b = next.m138103x30f1c20b();
                    if (m138103x30f1c20b == null) {
                        perImage = m138103x30f1c20b;
                    } else {
                        while (this.f71213x7f016991.size() > 2) {
                            this.f71213x7f016991.remove(0).f71226x5faa95b.close();
                        }
                        this.f71213x7f016991.add(m138103x30f1c20b);
                        this.f71215xb0027897 = next;
                        perImage = m138103x30f1c20b;
                    }
                }
                m138093x9593897d();
                java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader> it6 = this.f71211xd63ff9b3.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    if (!it6.next().m138104xa08e58ed()) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (z17) {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.f71177x294b574a.post(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.this.m138071x3f422654();
                    }
                });
            }
            return perImage;
        }

        /* renamed from: disableFenceForTest */
        public void m138080xd1af5292() {
            this.f71210xe2e38362 = true;
        }

        /* renamed from: finalize */
        public void m138081xd764dc1e() {
            try {
                if (this.f71222xdf23d93d) {
                    return;
                }
                m138073x95125be4();
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.f71177x294b574a.post(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.TextureFinalizerRunnable(this.f374761id, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.f71175x2014a1e9));
            } finally {
                super.finalize();
            }
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
        /* renamed from: getForcedNewSurface */
        public android.view.Surface mo138082xadc3e21c() {
            this.f71209x829a10e7 = true;
            return mo138084xcf572877();
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
        /* renamed from: getHeight */
        public int mo138083x1c4fb41d() {
            return this.f71223xbcda4a35;
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
        /* renamed from: getSurface */
        public android.view.Surface mo138084xcf572877() {
            return m138069xb35679df().f71231xc84558c3.getSurface();
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
        /* renamed from: getWidth */
        public int mo138085x755bd410() {
            return this.f71224xbc9a1af8;
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
        /* renamed from: handlesCropAndRotation */
        public boolean mo138086xf2ff5afa() {
            return false;
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.TextureEntry
        public long id() {
            return this.f374761id;
        }

        /* renamed from: numImageReaders */
        public int m138087xd24868db() {
            int size;
            synchronized (this.f71218x32c52b) {
                size = this.f71211xd63ff9b3.size();
            }
            return size;
        }

        /* renamed from: numImages */
        public int m138088x3817dd9e() {
            int i17;
            synchronized (this.f71218x32c52b) {
                java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader> it = this.f71211xd63ff9b3.iterator();
                i17 = 0;
                while (it.hasNext()) {
                    i17 += it.next().f71230xa93c2076.size();
                }
            }
            return i17;
        }

        /* renamed from: numTrims */
        public int m138089x8ecfb8ab() {
            int i17;
            synchronized (this.f71218x32c52b) {
                i17 = this.f71220x8ecfb8ab;
            }
            return i17;
        }

        /* renamed from: onImage */
        public void m138090xafc07ebc(android.media.ImageReader imageReader, android.media.Image image) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImage m138105x7152a2ca;
            boolean z17;
            synchronized (this.f71218x32c52b) {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader m138070x55563e36 = m138070x55563e36(imageReader);
                m138105x7152a2ca = m138070x55563e36.m138105x7152a2ca(image);
                z17 = true;
                if (this.f71217x503cc4b4 != null && m138070x55563e36 != this.f71211xd63ff9b3.peekLast()) {
                    z17 = false;
                }
            }
            if (m138105x7152a2ca == null) {
                return;
            }
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameAvailableListener onFrameAvailableListener = this.f71217x503cc4b4;
            if (onFrameAvailableListener != null) {
                onFrameAvailableListener.mo125886x5fe1f39b(z17);
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.m138041xef603934();
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener
        /* renamed from: onTrimMemory */
        public void mo138091x29685b02(int i17) {
            if (i17 < 40) {
                return;
            }
            synchronized (this.f71218x32c52b) {
                this.f71220x8ecfb8ab++;
            }
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer.Callback callback = this.f71208xf5bc2045;
            if (callback != null) {
                this.f71219x1eee0342 = true;
                callback.mo133095xdff77cf6();
            }
            m138066x331156a4();
            this.f71209x829a10e7 = true;
        }

        /* renamed from: pendingDequeuedImages */
        public int m138092xee8ea43() {
            return this.f71213x7f016991.size();
        }

        /* renamed from: pruneImageReaderQueue */
        public void m138093x9593897d() {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer.PerImageReader peekFirst;
            while (this.f71211xd63ff9b3.size() > 1 && (peekFirst = this.f71211xd63ff9b3.peekFirst()) != null && peekFirst.m138101xf7a2d1ba()) {
                this.f71211xd63ff9b3.removeFirst();
                this.f71221x10b1c3f2.remove(peekFirst.f71231xc84558c3);
                peekFirst.m138102x5a5ddf8();
            }
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.TextureEntry
        /* renamed from: release */
        public void mo138094x41012807() {
            if (this.f71222xdf23d93d) {
                return;
            }
            m138073x95125be4();
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.m138016x6d19dd3f(this.f374761id);
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
        /* renamed from: scheduleFrame */
        public void mo138095x62a02d16() {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.m138041xef603934();
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
        /* renamed from: setCallback */
        public void mo138096x6c4ebec7(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer.Callback callback) {
            this.f71208xf5bc2045 = callback;
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.TextureEntry
        /* renamed from: setOnFrameAvailableListener */
        public void mo138097xdd9eabf1(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameAvailableListener onFrameAvailableListener) {
            this.f71217x503cc4b4 = onFrameAvailableListener;
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer
        /* renamed from: setSize */
        public void mo138098x76500f83(int i17, int i18) {
            int max = java.lang.Math.max(1, i17);
            int max2 = java.lang.Math.max(1, i18);
            if (this.f71224xbc9a1af8 == max && this.f71223xbcda4a35 == max2) {
                return;
            }
            this.f71209x829a10e7 = true;
            this.f71223xbcda4a35 = max2;
            this.f71224xbc9a1af8 = max;
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$ImageTextureRegistryEntry */
    /* loaded from: classes15.dex */
    public final class ImageTextureRegistryEntry implements io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.ImageTextureEntry, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.ImageConsumer {
        private static final java.lang.String TAG = "ImageTextureRegistryEntry";

        /* renamed from: id, reason: collision with root package name */
        private final long f374762id;

        /* renamed from: ignoringFence */
        private boolean f71233xe2e38362 = false;

        /* renamed from: image */
        private android.media.Image f71234x5faa95b;

        /* renamed from: released */
        private boolean f71235xdf23d93d;

        public ImageTextureRegistryEntry(long j17) {
            this.f374762id = j17;
        }

        /* renamed from: maybeWaitOnFence */
        private void m138106x4ec398d5(android.media.Image image) {
            if (image == null || this.f71233xe2e38362) {
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                m138107xbb082e5d(image);
            } else {
                this.f71233xe2e38362 = true;
                io.p3284xd2ae381c.Log.d(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        /* renamed from: waitOnFence */
        private void m138107xbb082e5d(android.media.Image image) {
            try {
                image.getFence().awaitForever();
            } catch (java.io.IOException unused) {
            }
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.ImageConsumer
        /* renamed from: acquireLatestImage */
        public android.media.Image mo138075xaf314b5e() {
            android.media.Image image;
            synchronized (this) {
                image = this.f71234x5faa95b;
                this.f71234x5faa95b = null;
            }
            m138106x4ec398d5(image);
            return image;
        }

        /* renamed from: finalize */
        public void m138108xd764dc1e() {
            try {
                if (this.f71235xdf23d93d) {
                    return;
                }
                android.media.Image image = this.f71234x5faa95b;
                if (image != null) {
                    image.close();
                    this.f71234x5faa95b = null;
                }
                this.f71235xdf23d93d = true;
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.f71177x294b574a.post(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.TextureFinalizerRunnable(this.f374762id, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.f71175x2014a1e9));
            } finally {
                super.finalize();
            }
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.TextureEntry
        public long id() {
            return this.f374762id;
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.ImageTextureEntry
        /* renamed from: pushImage */
        public void mo138109xd0f66a61(android.media.Image image) {
            android.media.Image image2;
            if (this.f71235xdf23d93d) {
                return;
            }
            synchronized (this) {
                image2 = this.f71234x5faa95b;
                this.f71234x5faa95b = image;
            }
            if (image2 != null) {
                io.p3284xd2ae381c.Log.e(TAG, "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.m138041xef603934();
            }
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.TextureEntry
        /* renamed from: release */
        public void mo138094x41012807() {
            if (this.f71235xdf23d93d) {
                return;
            }
            this.f71235xdf23d93d = true;
            android.media.Image image = this.f71234x5faa95b;
            if (image != null) {
                image.close();
                this.f71234x5faa95b = null;
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.m138016x6d19dd3f(this.f374762id);
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$SurfaceTextureRegistryEntry */
    /* loaded from: classes15.dex */
    public final class SurfaceTextureRegistryEntry implements io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener {

        /* renamed from: frameAvailableListener */
        private io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameAvailableListener f71237xa87fd8b0;

        /* renamed from: frameConsumedListener */
        private io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameConsumedListener f71238x5889b849;

        /* renamed from: id, reason: collision with root package name */
        private final long f374763id;

        /* renamed from: released */
        private boolean f71239xdf23d93d;

        /* renamed from: textureWrapper */
        private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28650xcd7638e5 f71240xef4a62f8;

        /* renamed from: trimMemoryListener */
        private io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener f71242xd557b197;

        public SurfaceTextureRegistryEntry(long j17, android.graphics.SurfaceTexture surfaceTexture) {
            this.f374763id = j17;
            this.f71240xef4a62f8 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28650xcd7638e5(surfaceTexture, new java.lang.Runnable() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer$SurfaceTextureRegistryEntry$$a
                @Override // java.lang.Runnable
                public final void run() {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.SurfaceTextureRegistryEntry.this.m138111x51ef5f0f();
                }
            });
            mo138117x299653ae().setOnFrameAvailableListener(new android.graphics.SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer$SurfaceTextureRegistryEntry$$b
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture2) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.SurfaceTextureRegistryEntry.this.m138112x51ef5f10(surfaceTexture2);
                }
            }, new android.os.Handler());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$new$0 */
        public /* synthetic */ void m138111x51ef5f0f() {
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameConsumedListener onFrameConsumedListener = this.f71238x5889b849;
            if (onFrameConsumedListener != null) {
                onFrameConsumedListener.mo52732x774eb8d6();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$new$1 */
        public /* synthetic */ void m138112x51ef5f10(android.graphics.SurfaceTexture surfaceTexture) {
            if (this.f71239xdf23d93d || !io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.f71175x2014a1e9.m137686xf0d424ee()) {
                return;
            }
            this.f71240xef4a62f8.m138136xc681e505();
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameAvailableListener onFrameAvailableListener = this.f71237xa87fd8b0;
            if (onFrameAvailableListener != null) {
                onFrameAvailableListener.mo125886x5fe1f39b(true);
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.m138041xef603934();
        }

        /* renamed from: removeListener */
        private void m138113xf1335d58() {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.m138038x8940247a(this);
        }

        /* renamed from: finalize */
        public void m138114xd764dc1e() {
            try {
                if (this.f71239xdf23d93d) {
                    return;
                }
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.f71177x294b574a.post(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.TextureFinalizerRunnable(this.f374763id, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.f71175x2014a1e9));
            } finally {
                super.finalize();
            }
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.TextureEntry
        public long id() {
            return this.f374763id;
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener
        /* renamed from: onTrimMemory */
        public void mo138091x29685b02(int i17) {
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener onTrimMemoryListener = this.f71242xd557b197;
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.mo138091x29685b02(i17);
            }
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.TextureEntry
        /* renamed from: release */
        public void mo138094x41012807() {
            if (this.f71239xdf23d93d) {
                return;
            }
            io.p3284xd2ae381c.Log.i(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.TAG, "Releasing a SurfaceTexture (" + this.f374763id + ").");
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.f71173x735fa421.execute(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.SurfaceTextureRegistryEntry.1
                @Override // java.lang.Runnable
                public void run() {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.SurfaceTextureRegistryEntry.this.f71240xef4a62f8.m138137x41012807();
                }
            });
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.m138016x6d19dd3f(this.f374763id);
            m138113xf1335d58();
            this.f71239xdf23d93d = true;
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.TextureEntry
        /* renamed from: setOnFrameAvailableListener */
        public void mo138097xdd9eabf1(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameAvailableListener onFrameAvailableListener) {
            this.f71237xa87fd8b0 = onFrameAvailableListener;
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry
        /* renamed from: setOnFrameConsumedListener */
        public void mo138115xa492f8e8(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnFrameConsumedListener onFrameConsumedListener) {
            this.f71238x5889b849 = onFrameConsumedListener;
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry
        /* renamed from: setOnTrimMemoryListener */
        public void mo138116x399c4d58(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener onTrimMemoryListener) {
            this.f71242xd557b197 = onTrimMemoryListener;
        }

        @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry
        /* renamed from: surfaceTexture */
        public android.graphics.SurfaceTexture mo138117x299653ae() {
            return this.f71240xef4a62f8.m138139x299653ae();
        }

        /* renamed from: textureWrapper */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28650xcd7638e5 m138118xef4a62f8() {
            return this.f71240xef4a62f8;
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$TextureFinalizerRunnable */
    /* loaded from: classes15.dex */
    public static final class TextureFinalizerRunnable implements java.lang.Runnable {

        /* renamed from: flutterJNI */
        private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 f71244x2014a1e9;

        /* renamed from: id, reason: collision with root package name */
        private final long f374764id;

        public TextureFinalizerRunnable(long j17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
            this.f374764id = j17;
            this.f71244x2014a1e9 = c28586x96e67e09;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f71244x2014a1e9.m137686xf0d424ee()) {
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.TAG, "Releasing a Texture (" + this.f374764id + ").");
                this.f71244x2014a1e9.m137761x6d19dd3f(this.f374764id);
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$ViewportMetrics */
    /* loaded from: classes11.dex */
    public static final class ViewportMetrics {

        /* renamed from: unsetValue */
        public static final int f71245xaed0b7c8 = -1;

        /* renamed from: devicePixelRatio */
        public float f71246xacd5b81b = 1.0f;

        /* renamed from: width */
        public int f71263x6be2dc6 = 0;

        /* renamed from: height */
        public int f71249xb7389127 = 0;

        /* renamed from: viewPaddingTop */
        public int f71262xab8f1409 = 0;

        /* renamed from: viewPaddingRight */
        public int f71261x3fb37d0 = 0;

        /* renamed from: viewPaddingBottom */
        public int f71259x6078daf7 = 0;

        /* renamed from: viewPaddingLeft */
        public int f71260xc64fa3d3 = 0;

        /* renamed from: viewInsetTop */
        public int f71258xe9ea0bd = 0;

        /* renamed from: viewInsetRight */
        public int f71257xe15a6784 = 0;

        /* renamed from: viewInsetBottom */
        public int f71255x2effa1c3 = 0;

        /* renamed from: viewInsetLeft */
        public int f71256xc531ad9f = 0;

        /* renamed from: systemGestureInsetTop */
        public int f71254x9a0ea132 = 0;

        /* renamed from: systemGestureInsetRight */
        public int f71253x50cc1eb9 = 0;

        /* renamed from: systemGestureInsetBottom */
        public int f71251xadc4d12e = 0;

        /* renamed from: systemGestureInsetLeft */
        public int f71252xa7c1bbca = 0;

        /* renamed from: physicalTouchSlop */
        public int f71250xb11ec6c2 = -1;

        /* renamed from: displayFeatures */
        private final java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeature> f71248xa7707f1f = new java.util.ArrayList();

        /* renamed from: displayCutouts */
        private final java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeature> f71247xa4134d05 = new java.util.ArrayList();

        /* renamed from: windowStatus */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.WindowStatus f71264xbd85e402 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.WindowStatus.NORMAL;

        /* renamed from: getDisplayCutouts */
        public java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeature> m138121x92ab19fb() {
            return this.f71247xa4134d05;
        }

        /* renamed from: getDisplayFeatures */
        public java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeature> m138122x8bd250e9() {
            return this.f71248xa7707f1f;
        }

        /* renamed from: setDisplayCutouts */
        public void m138123x5aa18207(java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeature> list) {
            this.f71247xa4134d05.clear();
            this.f71247xa4134d05.addAll(list);
        }

        /* renamed from: setDisplayFeatures */
        public void m138124xc2a8ea5d(java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeature> list) {
            this.f71248xa7707f1f.clear();
            this.f71248xa7707f1f.addAll(list);
        }

        /* renamed from: validate */
        public boolean m138125xab491916() {
            return this.f71263x6be2dc6 > 0 && this.f71249xb7389127 > 0 && this.f71246xacd5b81b > 0.0f;
        }
    }

    /* renamed from: io.flutter.embedding.engine.renderer.FlutterRenderer$WindowStatus */
    /* loaded from: classes11.dex */
    public enum WindowStatus {
        NORMAL(0),
        FLOATING(1),
        SPLIT_SCREEN(2);


        /* renamed from: encodedValue */
        public final int f71269xe7c71503;

        WindowStatus(int i17) {
            this.f71269xe7c71503 = i17;
        }
    }

    public C28641x1f60b8df(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 interfaceC28647x231975c6 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.1
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiDisplayed */
            public void mo2121x6c956b30() {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.f71179x6250be46 = true;
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
            /* renamed from: onFlutterUiNoLongerDisplayed */
            public void mo2122xb9179606() {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.f71179x6250be46 = false;
            }
        };
        this.f71176xa34b51a6 = interfaceC28647x231975c6;
        this.f71175x2014a1e9 = c28586x96e67e09;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            c28586x96e67e09.m137644x9a2d27f9(interfaceC28647x231975c6);
            m138014xb74710d2();
        } else {
            c28586x96e67e09.m137645xe8c56962(interfaceC28647x231975c6);
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.2
                @Override // java.lang.Runnable
                public void run() {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.m138014xb74710d2();
                }
            });
        }
    }

    /* renamed from: clearDeadListeners */
    private void m138010x159184ee() {
        java.util.Iterator<java.lang.ref.WeakReference<io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener>> it = this.f71181x1e2ed95d.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    /* renamed from: registerImageTexture */
    private void m138011xae663d83(long j17, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.ImageConsumer imageConsumer, boolean z17) {
        this.f71175x2014a1e9.m137718xae663d83(j17, imageConsumer, z17);
    }

    /* renamed from: registerTexture */
    private void m138013xa2ca10f8(long j17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28650xcd7638e5 c28650xcd7638e5) {
        this.f71175x2014a1e9.m137719xa2ca10f8(j17, c28650xcd7638e5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupLifecycleCallback */
    public void m138014xb74710d2() {
        p012xc85e97e9.p093xedfae76a.f fVar = new p012xc85e97e9.p093xedfae76a.f() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.3
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onCreate */
            public /* bridge */ /* synthetic */ void mo7794x3e5a77bb(p012xc85e97e9.p093xedfae76a.y yVar) {
            }

            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public /* bridge */ /* synthetic */ void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y yVar) {
            }

            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onPause */
            public /* bridge */ /* synthetic */ void mo7796xb01dfb57(p012xc85e97e9.p093xedfae76a.y yVar) {
            }

            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onResume */
            public void mo7055x57429eec(p012xc85e97e9.p093xedfae76a.y yVar) {
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.TAG, "onResume called; notifying SurfaceProducers");
                for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer imageReaderSurfaceProducer : io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.f71178x8699e2c3) {
                    if (imageReaderSurfaceProducer.f71208xf5bc2045 != null && imageReaderSurfaceProducer.f71219x1eee0342) {
                        imageReaderSurfaceProducer.f71219x1eee0342 = false;
                        imageReaderSurfaceProducer.f71208xf5bc2045.mo133094xe037649b();
                    }
                }
            }

            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onStart */
            public /* bridge */ /* synthetic */ void mo7797xb05099c3(p012xc85e97e9.p093xedfae76a.y yVar) {
            }

            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onStop */
            public /* bridge */ /* synthetic */ void mo7798xc39f8281(p012xc85e97e9.p093xedfae76a.y yVar) {
            }
        };
        this.f71182x27f328ae = fVar;
        p012xc85e97e9.p093xedfae76a.q0.f93173o.f93179i.a(fVar);
    }

    /* renamed from: translateFeatureBounds */
    private void m138015xdd01a9d(int[] iArr, int i17, android.graphics.Rect rect) {
        iArr[i17] = rect.left;
        iArr[i17 + 1] = rect.top;
        iArr[i17 + 2] = rect.right;
        iArr[i17 + 3] = rect.bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: unregisterTexture */
    public void m138016x6d19dd3f(long j17) {
        this.f71175x2014a1e9.m137761x6d19dd3f(j17);
    }

    /* renamed from: addIsDisplayingFlutterUiListener */
    public void m138017x9a2d27f9(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 interfaceC28647x231975c6) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            this.f71175x2014a1e9.m137644x9a2d27f9(interfaceC28647x231975c6);
        } else {
            this.f71175x2014a1e9.m137645xe8c56962(interfaceC28647x231975c6);
        }
        if (this.f71179x6250be46) {
            interfaceC28647x231975c6.mo2121x6c956b30();
        }
    }

    /* renamed from: addOnTrimMemoryListener */
    public void m138018xb20a7417(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener onTrimMemoryListener) {
        m138010x159184ee();
        this.f71181x1e2ed95d.add(new java.lang.ref.WeakReference<>(onTrimMemoryListener));
    }

    /* renamed from: clearNextFrameDisplayedListener */
    public void m138019xd94bbdc8() {
        this.f71175x2014a1e9.m137656x8e0ee3d9();
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658
    /* renamed from: createImageTexture */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.ImageTextureEntry mo138020x45e1f25c() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageTextureRegistryEntry imageTextureRegistryEntry = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageTextureRegistryEntry(this.f71180x3cad39e3.getAndIncrement());
        io.p3284xd2ae381c.Log.v(TAG, "New ImageTextureEntry ID: " + imageTextureRegistryEntry.id());
        m138011xae663d83(imageTextureRegistryEntry.id(), imageTextureRegistryEntry, false);
        return imageTextureRegistryEntry;
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658
    /* renamed from: createSurfaceProducer */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer mo138021xfdf2a2c3(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceLifecycle surfaceLifecycle) {
        int i17 = this.f71184x88770893;
        boolean z17 = i17 != f71168x9743e1ca ? i17 > 0 : android.os.Build.VERSION.SDK_INT >= 29;
        if (f71172xa7831204 || !z17) {
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry mo138022xdee757ca = mo138022xdee757ca();
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28649xf77765b1 c28649xf77765b1 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28649xf77765b1(mo138022xdee757ca.id(), this.f71177x294b574a, this.f71175x2014a1e9, mo138022xdee757ca);
            io.p3284xd2ae381c.Log.v(TAG, "New SurfaceTextureSurfaceProducer ID: " + mo138022xdee757ca.id());
            return c28649xf77765b1;
        }
        long andIncrement = this.f71180x3cad39e3.getAndIncrement();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer imageReaderSurfaceProducer = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ImageReaderSurfaceProducer(andIncrement);
        boolean z18 = surfaceLifecycle == io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceLifecycle.resetInBackground;
        m138011xae663d83(andIncrement, imageReaderSurfaceProducer, z18);
        if (z18) {
            m138018xb20a7417(imageReaderSurfaceProducer);
        }
        this.f71178x8699e2c3.add(imageReaderSurfaceProducer);
        io.p3284xd2ae381c.Log.v(TAG, "New ImageReaderSurfaceProducer ID: " + andIncrement);
        return imageReaderSurfaceProducer;
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658
    /* renamed from: createSurfaceTexture */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry mo138022xdee757ca() {
        io.p3284xd2ae381c.Log.v(TAG, "Creating a SurfaceTexture.");
        return mo138035x37857531(new android.graphics.SurfaceTexture(0));
    }

    /* renamed from: dispatchPointerDataPacket */
    public void m138023x6067b195(java.nio.ByteBuffer byteBuffer, int i17) {
        this.f71175x2014a1e9.m137669x6067b195(byteBuffer, i17);
    }

    /* renamed from: dispatchSemanticsAction */
    public void m138024x92ca6029(int i17, int i18, java.nio.ByteBuffer byteBuffer, int i19) {
        this.f71175x2014a1e9.m137670x92ca6029(i17, i18, byteBuffer, i19);
    }

    /* renamed from: getBitmap */
    public android.graphics.Bitmap m138025x12501425() {
        return this.f71175x2014a1e9.m137676x12501425();
    }

    /* renamed from: getCheckSurfaceOnStopOrPause */
    public boolean m138026xb033b6d7() {
        return this.f71174xdeae198d;
    }

    /* renamed from: getSurfaceProducerUseImage */
    public int m138027x5877705d() {
        return this.f71184x88770893;
    }

    /* renamed from: isDisplayingFlutterUi */
    public boolean m138028x6250be46() {
        return this.f71179x6250be46;
    }

    /* renamed from: isSoftwareRenderingEnabled */
    public boolean m138029x42505226() {
        return this.f71175x2014a1e9.m137678xa17e5e1c();
    }

    /* renamed from: onNextFrameDisplayed */
    public void m138030x29812006(final java.lang.Runnable runnable) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09 = this.f71175x2014a1e9;
        java.util.Objects.requireNonNull(runnable);
        c28586x96e67e09.m137641xe19dea2d(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28639xef994e18() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer$$a
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28639xef994e18
            /* renamed from: onFlutterDisplayNextFrame */
            public final void mo138001x79dc32f5() {
                runnable.run();
            }
        });
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658
    /* renamed from: onTrimMemory */
    public void mo138031x29685b02(int i17) {
        java.util.Iterator<java.lang.ref.WeakReference<io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener>> it = this.f71181x1e2ed95d.iterator();
        while (it.hasNext()) {
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener onTrimMemoryListener = it.next().get();
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.mo138091x29685b02(i17);
            } else {
                it.remove();
            }
        }
    }

    /* renamed from: pauseRenderingToSurface */
    public void m138032x96b5ad1c() {
        m138033x96b5ad1c(null);
    }

    /* renamed from: pauseScheduleFrame */
    public void m138034xb42b16c0() {
        this.f71175x2014a1e9.m137711xb42b16c0();
    }

    @Override // io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658
    /* renamed from: registerSurfaceTexture */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry mo138035x37857531(android.graphics.SurfaceTexture surfaceTexture) {
        return m138012x37857531(this.f71180x3cad39e3.getAndIncrement(), surfaceTexture);
    }

    /* renamed from: release */
    public void m138036x41012807() {
        if (this.f71182x27f328ae != null) {
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                p012xc85e97e9.p093xedfae76a.q0.f93173o.f93179i.c(this.f71182x27f328ae);
            } else {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.4
                    @Override // java.lang.Runnable
                    public void run() {
                        p012xc85e97e9.p093xedfae76a.q0.f93173o.f93179i.c(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.this.f71182x27f328ae);
                    }
                });
            }
        }
    }

    /* renamed from: removeIsDisplayingFlutterUiListener */
    public void m138037x4c436f6(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 interfaceC28647x231975c6) {
        this.f71175x2014a1e9.m137724x4c436f6(interfaceC28647x231975c6);
    }

    /* renamed from: removeOnTrimMemoryListener */
    public void m138038x8940247a(io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener onTrimMemoryListener) {
        for (java.lang.ref.WeakReference<io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.OnTrimMemoryListener> weakReference : this.f71181x1e2ed95d) {
            if (weakReference.get() == onTrimMemoryListener) {
                this.f71181x1e2ed95d.remove(weakReference);
                return;
            }
        }
    }

    /* renamed from: requestDrawLastFrame */
    public void m138039x4fb41144() {
        this.f71175x2014a1e9.m137728x4fb41144();
    }

    /* renamed from: resumeScheduleFrame */
    public void m138040x689305e9() {
        this.f71175x2014a1e9.m137730x689305e9();
    }

    /* renamed from: scheduleEngineFrame */
    public void m138041xef603934() {
        this.f71175x2014a1e9.m137732x62a02d16();
    }

    /* renamed from: setAccessibilityFeatures */
    public void m138042xb1a6069(int i17) {
        this.f71175x2014a1e9.m137734xb1a6069(i17);
    }

    /* renamed from: setBackgroundExecutor */
    public void m138043x1de78823(java.util.concurrent.Executor executor) {
        this.f71173x735fa421 = executor;
    }

    /* renamed from: setCheckSurfaceOnStopOrPause */
    public void m138044xfa000f4b(boolean z17) {
        io.p3284xd2ae381c.Log.i(TAG, "setCheckSurfaceOnStopOrPause: " + z17);
        this.f71174xdeae198d = z17;
    }

    /* renamed from: setSemanticsEnabled */
    public void m138045x9afc8f96(boolean z17) {
        this.f71175x2014a1e9.m137750x9afc8f96(z17);
    }

    /* renamed from: setSurfaceProducerUseImage */
    public void m138046x6ea755d1(int i17) {
        io.p3284xd2ae381c.Log.i(TAG, "setSurfaceProducerUseImage: " + i17);
        this.f71184x88770893 = i17;
    }

    /* renamed from: setViewportMetrics */
    public void m138047x9c31e47b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics) {
        if (viewportMetrics.m138125xab491916()) {
            io.p3284xd2ae381c.Log.v(TAG, "Setting viewport metrics\nSize: " + viewportMetrics.f71263x6be2dc6 + " x " + viewportMetrics.f71249xb7389127 + "\nPadding - L: " + viewportMetrics.f71260xc64fa3d3 + ", T: " + viewportMetrics.f71262xab8f1409 + ", R: " + viewportMetrics.f71261x3fb37d0 + ", B: " + viewportMetrics.f71259x6078daf7 + "\nInsets - L: " + viewportMetrics.f71256xc531ad9f + ", T: " + viewportMetrics.f71258xe9ea0bd + ", R: " + viewportMetrics.f71257xe15a6784 + ", B: " + viewportMetrics.f71255x2effa1c3 + "\nSystem Gesture Insets - L: " + viewportMetrics.f71252xa7c1bbca + ", T: " + viewportMetrics.f71254x9a0ea132 + ", R: " + viewportMetrics.f71253x50cc1eb9 + ", B: " + viewportMetrics.f71253x50cc1eb9 + "\nDisplay Features: " + viewportMetrics.f71248xa7707f1f.size() + "\nDisplay Cutouts: " + viewportMetrics.f71247xa4134d05.size());
            int size = viewportMetrics.f71248xa7707f1f.size() + viewportMetrics.f71247xa4134d05.size();
            int[] iArr = new int[size * 4];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            for (int i17 = 0; i17 < viewportMetrics.f71248xa7707f1f.size(); i17++) {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeature displayFeature = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeature) viewportMetrics.f71248xa7707f1f.get(i17);
                m138015xdd01a9d(iArr, i17 * 4, displayFeature.f71189xad8df6b5);
                iArr2[i17] = displayFeature.f71191x368f3a.f71202xe7c71503;
                iArr3[i17] = displayFeature.f71190x68ac491.f71196xe7c71503;
            }
            int size2 = viewportMetrics.f71248xa7707f1f.size() * 4;
            for (int i18 = 0; i18 < viewportMetrics.f71247xa4134d05.size(); i18++) {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeature displayFeature2 = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.DisplayFeature) viewportMetrics.f71247xa4134d05.get(i18);
                m138015xdd01a9d(iArr, (i18 * 4) + size2, displayFeature2.f71189xad8df6b5);
                iArr2[viewportMetrics.f71248xa7707f1f.size() + i18] = displayFeature2.f71191x368f3a.f71202xe7c71503;
                iArr3[viewportMetrics.f71248xa7707f1f.size() + i18] = displayFeature2.f71190x68ac491.f71196xe7c71503;
            }
            this.f71175x2014a1e9.m137752x9c31e47b(viewportMetrics.f71246xacd5b81b, viewportMetrics.f71263x6be2dc6, viewportMetrics.f71249xb7389127, viewportMetrics.f71262xab8f1409, viewportMetrics.f71261x3fb37d0, viewportMetrics.f71259x6078daf7, viewportMetrics.f71260xc64fa3d3, viewportMetrics.f71258xe9ea0bd, viewportMetrics.f71257xe15a6784, viewportMetrics.f71255x2effa1c3, viewportMetrics.f71256xc531ad9f, viewportMetrics.f71254x9a0ea132, viewportMetrics.f71253x50cc1eb9, viewportMetrics.f71251xadc4d12e, viewportMetrics.f71252xa7c1bbca, viewportMetrics.f71250xb11ec6c2, iArr, iArr2, iArr3, viewportMetrics.f71264xbd85e402.f71269xe7c71503);
        }
    }

    /* renamed from: startRenderingToSurface */
    public void m138048x9a9e0888(android.view.Surface surface, boolean z17) {
        io.p3284xd2ae381c.Log.i(TAG, "startRendering to surface, keepCurrentSurface:" + z17 + ", surface:" + surface);
        if (this.f71183x9189ecad != null && !z17) {
            m138049xc19ba428();
        }
        this.f71183x9189ecad = surface;
        if (z17) {
            this.f71175x2014a1e9.m137709x97467176(surface);
        } else {
            this.f71175x2014a1e9.m137707xea34a53a(surface);
        }
    }

    /* renamed from: stopRenderingToSurface */
    public void m138049xc19ba428() {
        m138050xc19ba428(null);
    }

    /* renamed from: surfaceChanged */
    public void m138051xaa23e147(int i17, int i18) {
        io.p3284xd2ae381c.Log.i(TAG, "surfaceChange: " + i17 + "," + i18 + ", surface: " + this.f71183x9189ecad);
        if (this.f71183x9189ecad == null) {
            io.p3284xd2ae381c.Log.e(TAG, "not attach a surface when surfaceChanged call");
        } else {
            this.f71175x2014a1e9.m137706xd8f18906(i17, i18);
        }
    }

    /* renamed from: swapSurface */
    public void m138052x614179a(android.view.Surface surface) {
        this.f71183x9189ecad = surface;
        this.f71175x2014a1e9.m137709x97467176(surface);
    }

    /* renamed from: registerSurfaceTexture */
    private io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry m138012x37857531(long j17, android.graphics.SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.SurfaceTextureRegistryEntry(j17, surfaceTexture);
        io.p3284xd2ae381c.Log.v(TAG, "New SurfaceTexture ID: " + surfaceTextureRegistryEntry.id() + ", " + surfaceTexture);
        m138013xa2ca10f8(surfaceTextureRegistryEntry.id(), surfaceTextureRegistryEntry.m138118xef4a62f8());
        m138018xb20a7417(surfaceTextureRegistryEntry);
        return surfaceTextureRegistryEntry;
    }

    /* renamed from: pauseRenderingToSurface */
    public void m138033x96b5ad1c(android.view.Surface surface) {
        io.p3284xd2ae381c.Log.i(TAG, "pauseRenderingToSurface " + surface);
        if (this.f71174xdeae198d && surface != null && this.f71183x9189ecad != surface) {
            io.p3284xd2ae381c.Log.i(TAG, "surface  " + this.f71183x9189ecad + " != targetSurface " + surface + ", do not pauseRenderingToSurface");
            return;
        }
        this.f71175x2014a1e9.m137655xdbe50f2b();
        this.f71183x9189ecad = null;
    }

    /* renamed from: stopRenderingToSurface */
    public void m138050xc19ba428(android.view.Surface surface) {
        io.p3284xd2ae381c.Log.i(TAG, "stopRenderingToSurface " + surface);
        if (this.f71174xdeae198d && surface != null && this.f71183x9189ecad != surface) {
            io.p3284xd2ae381c.Log.i(TAG, "surface  " + this.f71183x9189ecad + " != targetSurface " + surface + ", do not stopRenderingToSurface");
            return;
        }
        if (this.f71183x9189ecad == null) {
            io.p3284xd2ae381c.Log.i(TAG, "stopRenderingToSurface surface is null");
            return;
        }
        this.f71175x2014a1e9.m137708x82616feb();
        if (this.f71179x6250be46) {
            this.f71176xa34b51a6.mo2122xb9179606();
        }
        this.f71179x6250be46 = false;
        this.f71183x9189ecad = null;
    }
}
