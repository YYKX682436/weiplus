package com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5;

/* renamed from: com.davemorrissey.labs.subscaleview.view.ImageSource */
/* loaded from: classes15.dex */
public final class C1449xe4cdf536 {

    /* renamed from: ASSET_SCHEME */
    static final java.lang.String f4492xad4969f4 = "assets:///";

    /* renamed from: FILE_SCHEME */
    static final java.lang.String f4493x966055c8 = "file:///";

    /* renamed from: bitmap */
    private final android.graphics.Bitmap f4494xad38f12f;

    /* renamed from: cached */
    private boolean f4495xae754122;

    /* renamed from: file */
    private final com.p314xaae8f345.mm.vfs.r6 f4496x2ff57c;

    /* renamed from: resource */
    private final java.lang.Integer f4497xebabc40e;

    /* renamed from: sHeight */
    private int f4498x440a1b7a;

    /* renamed from: sRegion */
    private android.graphics.Rect f4499x5519b147;

    /* renamed from: sWidth */
    private int f4500xc9388d13;

    /* renamed from: tile */
    private boolean f4501x3652ae;

    private C1449xe4cdf536(android.graphics.Bitmap bitmap, boolean z17) {
        this.f4494xad38f12f = bitmap;
        this.f4496x2ff57c = null;
        this.f4497xebabc40e = null;
        this.f4501x3652ae = false;
        this.f4500xc9388d13 = bitmap.getWidth();
        this.f4498x440a1b7a = bitmap.getHeight();
        this.f4495xae754122 = z17;
    }

    /* renamed from: asset */
    public static com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 m15524x58ceaf0(java.lang.String str) {
        if (str != null) {
            return uri(f4492xad4969f4.concat(str));
        }
        throw new java.lang.NullPointerException("Asset name must not be null");
    }

    /* renamed from: bitmap */
    public static com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 m15525xad38f12f(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            return new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536(bitmap, false);
        }
        throw new java.lang.NullPointerException("Bitmap must not be null");
    }

    /* renamed from: cachedBitmap */
    public static com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 m15526x34f23cf1(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            return new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536(bitmap, true);
        }
        throw new java.lang.NullPointerException("Bitmap must not be null");
    }

    /* renamed from: resource */
    public static com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 m15527xebabc40e(int i17) {
        return new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536(i17);
    }

    /* renamed from: setInvariants */
    private void m15528xb9711eb5() {
        android.graphics.Rect rect = this.f4499x5519b147;
        if (rect != null) {
            this.f4501x3652ae = true;
            this.f4500xc9388d13 = rect.width();
            this.f4498x440a1b7a = this.f4499x5519b147.height();
        }
    }

    public static com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 uri(java.lang.String str) {
        if (str != null) {
            return new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)));
        }
        throw new java.lang.NullPointerException("Uri must not be null");
    }

    /* renamed from: dimensions */
    public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 m15529x18b23fcd(int i17, int i18) {
        if (this.f4494xad38f12f == null) {
            this.f4500xc9388d13 = i17;
            this.f4498x440a1b7a = i18;
        }
        m15528xb9711eb5();
        return this;
    }

    /* renamed from: getBitmap */
    public final android.graphics.Bitmap m15530x12501425() {
        return this.f4494xad38f12f;
    }

    /* renamed from: getResource */
    public final java.lang.Integer m15531x67860184() {
        return this.f4497xebabc40e;
    }

    /* renamed from: getSHeight */
    public final int m15532x81d75744() {
        return this.f4498x440a1b7a;
    }

    /* renamed from: getSRegion */
    public final android.graphics.Rect m15533x92e6ed11() {
        return this.f4499x5519b147;
    }

    /* renamed from: getSWidth */
    public final int m15534x2e4fb009() {
        return this.f4500xc9388d13;
    }

    /* renamed from: getTile */
    public final boolean m15535xfb85bb24() {
        return this.f4501x3652ae;
    }

    /* renamed from: getUri */
    public final android.net.Uri m15536xb5887636() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f4496x2ff57c;
        if (r6Var == null) {
            return null;
        }
        return r6Var.f294699d.h();
    }

    /* renamed from: isCached */
    public final boolean m15537xd6a232ec() {
        return this.f4495xae754122;
    }

    /* renamed from: region */
    public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 m15538xc84826f4(android.graphics.Rect rect) {
        this.f4499x5519b147 = rect;
        m15528xb9711eb5();
        return this;
    }

    /* renamed from: tiling */
    public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 m15539xcbec7beb(boolean z17) {
        this.f4501x3652ae = z17;
        return this;
    }

    /* renamed from: tilingDisabled */
    public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 m15540x3013ff87() {
        return m15539xcbec7beb(false);
    }

    /* renamed from: tilingEnabled */
    public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 m15541xc21f78d6() {
        return m15539xcbec7beb(true);
    }

    public static com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 uri(android.net.Uri uri) {
        if (uri != null) {
            return new com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536(new com.p314xaae8f345.mm.vfs.r6(uri));
        }
        throw new java.lang.NullPointerException("Uri must not be null");
    }

    private C1449xe4cdf536(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        this.f4494xad38f12f = null;
        this.f4496x2ff57c = r6Var;
        this.f4497xebabc40e = null;
        this.f4501x3652ae = true;
    }

    private C1449xe4cdf536(int i17) {
        this.f4494xad38f12f = null;
        this.f4496x2ff57c = null;
        this.f4497xebabc40e = java.lang.Integer.valueOf(i17);
        this.f4501x3652ae = true;
    }
}
