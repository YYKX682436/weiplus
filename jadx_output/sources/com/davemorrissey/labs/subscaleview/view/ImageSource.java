package com.davemorrissey.labs.subscaleview.view;

/* loaded from: classes15.dex */
public final class ImageSource {
    static final java.lang.String ASSET_SCHEME = "assets:///";
    static final java.lang.String FILE_SCHEME = "file:///";
    private final android.graphics.Bitmap bitmap;
    private boolean cached;
    private final com.tencent.mm.vfs.r6 file;
    private final java.lang.Integer resource;
    private int sHeight;
    private android.graphics.Rect sRegion;
    private int sWidth;
    private boolean tile;

    private ImageSource(android.graphics.Bitmap bitmap, boolean z17) {
        this.bitmap = bitmap;
        this.file = null;
        this.resource = null;
        this.tile = false;
        this.sWidth = bitmap.getWidth();
        this.sHeight = bitmap.getHeight();
        this.cached = z17;
    }

    public static com.davemorrissey.labs.subscaleview.view.ImageSource asset(java.lang.String str) {
        if (str != null) {
            return uri(ASSET_SCHEME.concat(str));
        }
        throw new java.lang.NullPointerException("Asset name must not be null");
    }

    public static com.davemorrissey.labs.subscaleview.view.ImageSource bitmap(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            return new com.davemorrissey.labs.subscaleview.view.ImageSource(bitmap, false);
        }
        throw new java.lang.NullPointerException("Bitmap must not be null");
    }

    public static com.davemorrissey.labs.subscaleview.view.ImageSource cachedBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            return new com.davemorrissey.labs.subscaleview.view.ImageSource(bitmap, true);
        }
        throw new java.lang.NullPointerException("Bitmap must not be null");
    }

    public static com.davemorrissey.labs.subscaleview.view.ImageSource resource(int i17) {
        return new com.davemorrissey.labs.subscaleview.view.ImageSource(i17);
    }

    private void setInvariants() {
        android.graphics.Rect rect = this.sRegion;
        if (rect != null) {
            this.tile = true;
            this.sWidth = rect.width();
            this.sHeight = this.sRegion.height();
        }
    }

    public static com.davemorrissey.labs.subscaleview.view.ImageSource uri(java.lang.String str) {
        if (str != null) {
            return new com.davemorrissey.labs.subscaleview.view.ImageSource(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)));
        }
        throw new java.lang.NullPointerException("Uri must not be null");
    }

    public com.davemorrissey.labs.subscaleview.view.ImageSource dimensions(int i17, int i18) {
        if (this.bitmap == null) {
            this.sWidth = i17;
            this.sHeight = i18;
        }
        setInvariants();
        return this;
    }

    public final android.graphics.Bitmap getBitmap() {
        return this.bitmap;
    }

    public final java.lang.Integer getResource() {
        return this.resource;
    }

    public final int getSHeight() {
        return this.sHeight;
    }

    public final android.graphics.Rect getSRegion() {
        return this.sRegion;
    }

    public final int getSWidth() {
        return this.sWidth;
    }

    public final boolean getTile() {
        return this.tile;
    }

    public final android.net.Uri getUri() {
        com.tencent.mm.vfs.r6 r6Var = this.file;
        if (r6Var == null) {
            return null;
        }
        return r6Var.f213166d.h();
    }

    public final boolean isCached() {
        return this.cached;
    }

    public com.davemorrissey.labs.subscaleview.view.ImageSource region(android.graphics.Rect rect) {
        this.sRegion = rect;
        setInvariants();
        return this;
    }

    public com.davemorrissey.labs.subscaleview.view.ImageSource tiling(boolean z17) {
        this.tile = z17;
        return this;
    }

    public com.davemorrissey.labs.subscaleview.view.ImageSource tilingDisabled() {
        return tiling(false);
    }

    public com.davemorrissey.labs.subscaleview.view.ImageSource tilingEnabled() {
        return tiling(true);
    }

    public static com.davemorrissey.labs.subscaleview.view.ImageSource uri(android.net.Uri uri) {
        if (uri != null) {
            return new com.davemorrissey.labs.subscaleview.view.ImageSource(new com.tencent.mm.vfs.r6(uri));
        }
        throw new java.lang.NullPointerException("Uri must not be null");
    }

    private ImageSource(com.tencent.mm.vfs.r6 r6Var) {
        this.bitmap = null;
        this.file = r6Var;
        this.resource = null;
        this.tile = true;
    }

    private ImageSource(int i17) {
        this.bitmap = null;
        this.file = null;
        this.resource = java.lang.Integer.valueOf(i17);
        this.tile = true;
    }
}
