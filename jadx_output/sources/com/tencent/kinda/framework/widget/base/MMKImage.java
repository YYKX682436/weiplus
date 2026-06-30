package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMKImage implements com.tencent.kinda.gen.KImage {
    private static final java.lang.String PATTERN_FILE = "file://";
    private static final java.lang.String PATTERN_HTTP = "http://";
    private static final java.lang.String PATTERN_HTTPS = "https://";
    private com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo lightImage = new com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo();
    private com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo darkImage = new com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo();

    private com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo getImage() {
        return (!com.tencent.mm.ui.bk.C() || com.tencent.mm.sdk.platformtools.t8.K0(this.darkImage.url)) ? this.lightImage : this.darkImage;
    }

    private void setIconColor(int i17) {
        getImage().setIconColor(i17);
    }

    public com.tencent.kinda.framework.widget.base.MMKImage copy() {
        com.tencent.kinda.framework.widget.base.MMKImage mMKImage = new com.tencent.kinda.framework.widget.base.MMKImage();
        com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo imageInfo = this.lightImage;
        if (imageInfo != null) {
            mMKImage.lightImage = imageInfo.copy();
        }
        com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo imageInfo2 = this.darkImage;
        if (imageInfo2 != null) {
            mMKImage.darkImage = imageInfo2.copy();
        }
        return mMKImage;
    }

    public void drawableTint(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        getImage().drawableTint(dynamicColor);
    }

    public android.graphics.Bitmap getBitmap() {
        return getImage().getBitmap();
    }

    public java.lang.String getDarkUrl() {
        return this.darkImage.url;
    }

    public android.graphics.drawable.Drawable getDrawable() {
        return getImage().getDrawable();
    }

    @Override // com.tencent.kinda.gen.KImage
    public float getHeight() {
        return getImage().getHeight();
    }

    public float getInputHeight() {
        com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo imageInfo = this.lightImage;
        if (imageInfo == null) {
            return 0.0f;
        }
        return imageInfo.inputHeight;
    }

    public float getInputWidth() {
        com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo imageInfo = this.lightImage;
        if (imageInfo == null) {
            return 0.0f;
        }
        return imageInfo.inputWidth;
    }

    @Override // com.tencent.kinda.gen.KImage
    public boolean getSupportDynamicSize() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KImage
    public java.lang.String getUrl() {
        return getImage().url;
    }

    @Override // com.tencent.kinda.gen.KImage
    public float getWidth() {
        return getImage().getWidth();
    }

    public boolean isNeedGetNetworkImageImmediately() {
        return getImage().needGetNetworkImageImmediately;
    }

    public boolean isNetworkImage() {
        return getImage().isNetworkImage;
    }

    @Override // com.tencent.kinda.gen.KImage
    public void setDarkModeUrl(java.lang.String str) {
        com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo imageInfo = this.darkImage;
        imageInfo.url = str;
        imageInfo.parse();
    }

    @Override // com.tencent.kinda.gen.KImage
    public void setEmoticonContent(java.lang.String str, int i17, int i18, boolean z17) {
    }

    public void setNeedGetNetworkImageImmediately(boolean z17) {
        this.lightImage.needGetNetworkImageImmediately = z17;
        this.darkImage.needGetNetworkImageImmediately = z17;
    }

    @Override // com.tencent.kinda.gen.KImage
    public void setSupportDynamicSize(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KImage
    public void setSvgUrl(java.lang.String str, com.tencent.kinda.gen.DynamicColor dynamicColor) {
        getImage().setSvgUrl(str, dynamicColor);
    }

    @Override // com.tencent.kinda.gen.KImage
    public void setUrl(java.lang.String str) {
        if (str.equals("PaidDetail_WeChatPay.png")) {
            return;
        }
        com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo imageInfo = this.lightImage;
        imageInfo.url = str;
        imageInfo.parse();
    }

    @Override // com.tencent.kinda.gen.KImage
    public void stretchImage(float f17, float f18) {
    }

    @Override // com.tencent.kinda.gen.KImage
    public void setSvgUrl(java.lang.String str, com.tencent.kinda.gen.DynamicColor dynamicColor, com.tencent.kinda.gen.KSize kSize) {
        getImage().setSvgUrl(str, dynamicColor, kSize);
    }

    /* loaded from: classes9.dex */
    public static class ImageInfo {
        private byte _hellAccFlag_;
        android.graphics.drawable.Drawable drawable;
        android.graphics.Bitmap imageBitmap;
        boolean isSvgUrl;
        int localResId;
        private int mSvgColor;
        java.lang.String url;
        float width = -1.0f;
        float height = -1.0f;
        boolean isNetworkImage = false;
        boolean needGetNetworkImageImmediately = false;
        float inputWidth = 0.0f;
        float inputHeight = 0.0f;

        /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private android.graphics.Bitmap getImageFromNet(java.lang.String r6) {
            /*
                r5 = this;
                boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
                r1 = 0
                if (r0 != 0) goto L54
                java.lang.String r0 = "http://"
                boolean r0 = r6.startsWith(r0)
                java.lang.String r2 = "GET"
                r3 = 20000(0x4e20, float:2.8026E-41)
                r4 = 10000(0x2710, float:1.4013E-41)
                if (r0 == 0) goto L2f
                com.tencent.mm.network.h2 r6 = com.tencent.mm.network.n.d(r6, r1)
                r6.g(r4)
                r6.k(r3)
                r6.c(r2)
                int r0 = r6.f()
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 != r2) goto L4c
                java.io.InputStream r6 = r6.getInputStream()
                goto L4d
            L2f:
                java.lang.String r0 = "https://"
                boolean r0 = r6.startsWith(r0)
                if (r0 == 0) goto L4c
                com.tencent.mm.network.k2 r0 = new com.tencent.mm.network.k2
                r0.<init>(r6)
                javax.net.ssl.HttpsURLConnection r6 = r0.f72060a
                r6.setConnectTimeout(r4)
                r6.setReadTimeout(r3)
                r6.setRequestMethod(r2)
                java.io.InputStream r6 = r6.getInputStream()
                goto L4d
            L4c:
                r6 = r1
            L4d:
                if (r6 == 0) goto L54
                android.graphics.Bitmap r6 = com.tencent.mm.graphics.e.f(r6)
                return r6
            L54:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo.getImageFromNet(java.lang.String):android.graphics.Bitmap");
        }

        public com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo copy() {
            com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo imageInfo = new com.tencent.kinda.framework.widget.base.MMKImage.ImageInfo();
            imageInfo.url = this.url;
            imageInfo.imageBitmap = this.imageBitmap;
            imageInfo.drawable = this.drawable;
            imageInfo.width = this.width;
            imageInfo.height = this.height;
            imageInfo.isSvgUrl = this.isSvgUrl;
            imageInfo.mSvgColor = this.mSvgColor;
            imageInfo.isNetworkImage = this.isNetworkImage;
            imageInfo.needGetNetworkImageImmediately = this.needGetNetworkImageImmediately;
            imageInfo.inputWidth = this.inputWidth;
            imageInfo.inputHeight = this.inputHeight;
            return imageInfo;
        }

        public void drawableTint(com.tencent.kinda.gen.DynamicColor dynamicColor) {
            android.graphics.drawable.Drawable drawable = this.drawable;
            if (drawable == null || dynamicColor == null) {
                return;
            }
            drawable.setColorFilter((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor), android.graphics.PorterDuff.Mode.SRC_ATOP);
            this.mSvgColor = (int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor);
        }

        public android.graphics.Bitmap getBitmap() {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.url) && this.imageBitmap == null && !this.isNetworkImage) {
                parse();
            }
            return this.imageBitmap;
        }

        public android.graphics.drawable.Drawable getDrawable() {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.url) && ((this.imageBitmap == null || this.drawable == null) && !this.isNetworkImage)) {
                parse();
            }
            if (this.imageBitmap != null) {
                return new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), this.imageBitmap);
            }
            if (this.drawable == null) {
                return null;
            }
            setIconColor(this.mSvgColor);
            return this.drawable;
        }

        public float getHeight() {
            if (this.imageBitmap != null) {
                return r0.getHeight();
            }
            return 0.0f;
        }

        public float getWidth() {
            if (this.imageBitmap != null) {
                return r0.getWidth();
            }
            return 0.0f;
        }

        public void parse() {
            int resId;
            java.lang.String str = this.url;
            if (str == null) {
                return;
            }
            if (str.startsWith(com.tencent.kinda.framework.widget.base.MMKImage.PATTERN_FILE)) {
                this.imageBitmap = com.tencent.mm.sdk.platformtools.x.i0(this.url.replaceFirst(com.tencent.kinda.framework.widget.base.MMKImage.PATTERN_FILE, ""));
            } else if (this.url.startsWith(com.tencent.kinda.framework.widget.base.MMKImage.PATTERN_HTTP) || this.url.startsWith(com.tencent.kinda.framework.widget.base.MMKImage.PATTERN_HTTPS)) {
                this.isNetworkImage = true;
                if (this.needGetNetworkImageImmediately) {
                    try {
                        this.imageBitmap = getImageFromNet(this.url);
                    } catch (java.lang.Exception unused) {
                        this.imageBitmap = null;
                    }
                }
            } else {
                int drawableId = com.tencent.kinda.framework.widget.tools.ResourcesUtils.getDrawableId(com.tencent.mm.sdk.platformtools.x2.f193071a, this.url);
                this.localResId = drawableId;
                if ((drawableId == 0 || this.isSvgUrl) && (resId = com.tencent.kinda.framework.widget.tools.ResourcesUtils.getResId(com.tencent.mm.sdk.platformtools.x2.f193071a, this.url, com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW)) != 0) {
                    this.localResId = resId;
                }
                android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
                int i17 = this.localResId;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(resources);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/MMKImage$ImageInfo", "parse", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.e(obj, decodeResource, "com/tencent/kinda/framework/widget/base/MMKImage$ImageInfo", "parse", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                this.imageBitmap = decodeResource;
                if (decodeResource == null) {
                    try {
                        this.drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(this.localResId);
                    } catch (android.content.res.Resources.NotFoundException unused2) {
                        this.drawable = null;
                    }
                }
            }
            if (this.imageBitmap != null) {
                this.width = r0.getWidth();
                this.height = this.imageBitmap.getHeight();
            }
        }

        public void setIconColor(int i17) {
            if (this.drawable != null) {
                int i18 = i17 != 0 ? (16777215 & i17) | (-16777216) : i17;
                int alpha = android.graphics.Color.alpha(i17);
                this.drawable.mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP));
                if (i17 != 0) {
                    this.drawable.setAlpha(alpha);
                }
            }
        }

        public void setSvgUrl(java.lang.String str, com.tencent.kinda.gen.DynamicColor dynamicColor) {
            this.isSvgUrl = true;
            this.url = str;
            parse();
            if (this.drawable == null || dynamicColor == null) {
                return;
            }
            setIconColor((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor));
            this.mSvgColor = (int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor);
        }

        public void setSvgUrl(java.lang.String str, com.tencent.kinda.gen.DynamicColor dynamicColor, com.tencent.kinda.gen.KSize kSize) {
            this.inputWidth = kSize.getWidth();
            this.inputHeight = kSize.getHeight();
            setSvgUrl(str, dynamicColor);
        }
    }
}
