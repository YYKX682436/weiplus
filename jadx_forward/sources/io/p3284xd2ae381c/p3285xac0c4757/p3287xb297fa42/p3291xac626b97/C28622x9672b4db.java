package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97;

/* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack */
/* loaded from: classes14.dex */
public class C28622x9672b4db {

    /* renamed from: mutators */
    private java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db.FlutterMutator> f71146x3398a991 = new java.util.ArrayList();

    /* renamed from: finalMatrix */
    private android.graphics.Matrix f71144x710bd4d7 = new android.graphics.Matrix();

    /* renamed from: finalClippingPaths */
    private java.util.List<android.graphics.Path> f71143x2feadb76 = new java.util.ArrayList();

    /* renamed from: finalOpacity */
    private float f71145x32c15db5 = 1.0f;

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack$FlutterMutatorType */
    /* loaded from: classes14.dex */
    public enum FlutterMutatorType {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    /* renamed from: getFinalClippingPaths */
    public java.util.List<android.graphics.Path> m137964x43473d6c() {
        return this.f71143x2feadb76;
    }

    /* renamed from: getFinalMatrix */
    public android.graphics.Matrix m137965x4ae21ba1() {
        return this.f71144x710bd4d7;
    }

    /* renamed from: getFinalOpacity */
    public float m137966x93b3f02b() {
        return this.f71145x32c15db5;
    }

    /* renamed from: getMutators */
    public java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db.FlutterMutator> m137967xaf72e707() {
        return this.f71146x3398a991;
    }

    /* renamed from: pushClipPath */
    public void m137968x9d95accf(android.graphics.Path path) {
        this.f71146x3398a991.add(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db.FlutterMutator(path));
        path.transform(this.f71144x710bd4d7);
        this.f71143x2feadb76.add(path);
    }

    /* renamed from: pushClipRRect */
    public void m137969x1535120c(int i17, int i18, int i19, int i27, float[] fArr) {
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, i19, i27);
        this.f71146x3398a991.add(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db.FlutterMutator(rect, fArr));
        android.graphics.Path path = new android.graphics.Path();
        path.addRoundRect(new android.graphics.RectF(rect), fArr, android.graphics.Path.Direction.CCW);
        path.transform(this.f71144x710bd4d7);
        this.f71143x2feadb76.add(path);
    }

    /* renamed from: pushClipRect */
    public void m137970x9d96a28e(int i17, int i18, int i19, int i27) {
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, i19, i27);
        this.f71146x3398a991.add(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db.FlutterMutator(rect));
        android.graphics.Path path = new android.graphics.Path();
        path.addRect(new android.graphics.RectF(rect), android.graphics.Path.Direction.CCW);
        path.transform(this.f71144x710bd4d7);
        this.f71143x2feadb76.add(path);
    }

    /* renamed from: pushOpacity */
    public void m137971xaf878f91(float f17) {
        this.f71146x3398a991.add(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db.FlutterMutator(f17));
        this.f71145x32c15db5 *= f17;
    }

    /* renamed from: pushTransform */
    public void m137972xb4463972(float[] fArr) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db.FlutterMutator flutterMutator = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db.FlutterMutator(matrix);
        this.f71146x3398a991.add(flutterMutator);
        this.f71144x710bd4d7.preConcat(flutterMutator.m137973x24a4bab7());
    }

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack$FlutterMutator */
    /* loaded from: classes14.dex */
    public class FlutterMutator {

        /* renamed from: matrix */
        private android.graphics.Matrix f71147xbf8d97c1;

        /* renamed from: opacity */
        private float f71148xb477f80b;

        /* renamed from: path */
        private android.graphics.Path f71149x346425;

        /* renamed from: radiis */
        private float[] f71150xc80e6b1e;

        /* renamed from: rect */
        private android.graphics.Rect f71151x3559e4;

        /* renamed from: type */
        private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db.FlutterMutatorType f71153x368f3a;

        public FlutterMutator(android.graphics.Rect rect) {
            this.f71148xb477f80b = 1.0f;
            this.f71153x368f3a = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db.FlutterMutatorType.CLIP_RECT;
            this.f71151x3559e4 = rect;
        }

        /* renamed from: getMatrix */
        public android.graphics.Matrix m137973x24a4bab7() {
            return this.f71147xbf8d97c1;
        }

        /* renamed from: getOpacity */
        public float m137974xf24533d5() {
            return this.f71148xb477f80b;
        }

        /* renamed from: getPath */
        public android.graphics.Path m137975xfb83cc9b() {
            return this.f71149x346425;
        }

        /* renamed from: getRect */
        public android.graphics.Rect m137976xfb84c25a() {
            return this.f71151x3559e4;
        }

        /* renamed from: getType */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db.FlutterMutatorType m137977xfb85f7b0() {
            return this.f71153x368f3a;
        }

        public FlutterMutator(android.graphics.Rect rect, float[] fArr) {
            this.f71148xb477f80b = 1.0f;
            this.f71153x368f3a = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db.FlutterMutatorType.CLIP_RRECT;
            this.f71151x3559e4 = rect;
            this.f71150xc80e6b1e = fArr;
        }

        public FlutterMutator(android.graphics.Path path) {
            this.f71148xb477f80b = 1.0f;
            this.f71153x368f3a = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db.FlutterMutatorType.CLIP_PATH;
            this.f71149x346425 = path;
        }

        public FlutterMutator(android.graphics.Matrix matrix) {
            this.f71148xb477f80b = 1.0f;
            this.f71153x368f3a = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db.FlutterMutatorType.TRANSFORM;
            this.f71147xbf8d97c1 = matrix;
        }

        public FlutterMutator(float f17) {
            this.f71148xb477f80b = 1.0f;
            this.f71153x368f3a = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db.FlutterMutatorType.OPACITY;
            this.f71148xb477f80b = f17;
        }
    }
}
