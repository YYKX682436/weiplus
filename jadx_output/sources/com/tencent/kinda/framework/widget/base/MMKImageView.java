package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMKImageView extends com.tencent.kinda.framework.widget.base.MMKView<com.tencent.mm.pluginsdk.ui.applet.CdnImageView> implements com.tencent.kinda.gen.KImageView {
    private byte[] ImageData;
    private byte _hellAccFlag_;
    private com.tencent.kinda.gen.ScaleType scaleType;
    private com.tencent.kinda.framework.widget.base.MMKImage image = new com.tencent.kinda.framework.widget.base.MMKImage();
    private com.tencent.kinda.framework.widget.base.MMKImage defaultImage = new com.tencent.kinda.framework.widget.base.MMKImage();
    private com.tencent.kinda.gen.DynamicColor tintColor = new com.tencent.kinda.gen.DynamicColor(0, 0);

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKImageView$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$ScaleType;

        static {
            int[] iArr = new int[com.tencent.kinda.gen.ScaleType.values().length];
            $SwitchMap$com$tencent$kinda$gen$ScaleType = iArr;
            try {
                iArr[com.tencent.kinda.gen.ScaleType.FILL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$ScaleType[com.tencent.kinda.gen.ScaleType.ASPECTFIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$ScaleType[com.tencent.kinda.gen.ScaleType.ASPECTFILL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$ScaleType[com.tencent.kinda.gen.ScaleType.CENTER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private void setIconColor(int i17, android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            int i18 = i17 != 0 ? (16777215 & i17) | (-16777216) : i17;
            int alpha = android.graphics.Color.alpha(i17);
            drawable.mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP));
            if (i17 != 0) {
                drawable.setAlpha(alpha);
            }
        }
    }

    @Override // com.tencent.kinda.gen.KImageView
    public java.lang.String getDarkModeUrl() {
        return this.image.getDarkUrl();
    }

    @Override // com.tencent.kinda.gen.KImageView
    public java.lang.String getDefaultUrl() {
        return this.defaultImage.getUrl();
    }

    @Override // com.tencent.kinda.gen.KImageView
    public com.tencent.kinda.gen.KImage getImage() {
        return this.image;
    }

    @Override // com.tencent.kinda.gen.KImageView
    public byte[] getImageData() {
        return this.ImageData;
    }

    @Override // com.tencent.kinda.gen.KImageView
    public com.tencent.kinda.gen.ScaleType getScaleType() {
        return this.scaleType;
    }

    @Override // com.tencent.kinda.gen.KImageView
    public com.tencent.kinda.gen.DynamicColor getTintColor() {
        return this.tintColor;
    }

    @Override // com.tencent.kinda.gen.KImageView
    public java.lang.String getUrl() {
        return this.image.getUrl();
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView, com.tencent.kinda.gen.KView
    public void setCornerRadius(float f17) {
        super.setCornerRadius(f17);
        if (!(getView() instanceof com.tencent.mm.pluginsdk.ui.applet.CdnImageView) || getWidth() <= 0.0f) {
            return;
        }
        getView().setRoundCorner(true);
        getView().setRoundCornerRate(f17 / getWidth());
    }

    @Override // com.tencent.kinda.gen.KImageView
    public void setDarkModeUrl(java.lang.String str) {
        com.tencent.kinda.framework.widget.base.MMKImage copy = this.image.copy();
        copy.setDarkModeUrl(str);
        setImage(copy);
    }

    @Override // com.tencent.kinda.gen.KImageView
    public void setDefaultUrl(java.lang.String str) {
        if (this.defaultImage == null) {
            this.defaultImage = new com.tencent.kinda.framework.widget.base.MMKImage();
        }
        this.defaultImage.setUrl(str);
        com.tencent.kinda.framework.widget.base.MMKImage mMKImage = this.image;
        if ((mMKImage == null || com.tencent.mm.sdk.platformtools.t8.K0(mMKImage.getUrl())) && !com.tencent.mm.sdk.platformtools.t8.K0(this.defaultImage.getUrl())) {
            if (this.defaultImage.isNetworkImage()) {
                getView().setUrl(this.defaultImage.getUrl());
            } else {
                getView().setImageBitmap(this.defaultImage.getBitmap());
            }
        }
        setCornerRadius(2.0f);
    }

    @Override // com.tencent.kinda.gen.KImageView
    public void setImage(com.tencent.kinda.gen.KImage kImage) {
        if (kImage == null || !(kImage instanceof com.tencent.kinda.framework.widget.base.MMKImage)) {
            return;
        }
        com.tencent.kinda.framework.widget.base.MMKImage mMKImage = this.image;
        com.tencent.kinda.framework.widget.base.MMKImage mMKImage2 = (com.tencent.kinda.framework.widget.base.MMKImage) kImage;
        this.image = mMKImage2;
        if (mMKImage2.isNetworkImage()) {
            if (mMKImage == null || mMKImage.getUrl() == null || this.image.getUrl() == null || !mMKImage.getUrl().equals(this.image.getUrl())) {
                getView().setImageDrawable(null);
                getView().setUrl(this.image.getUrl());
            }
        } else if (this.image.getBitmap() != null) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), this.image.getBitmap());
            if (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(this.tintColor) != 0) {
                bitmapDrawable.setColorFilter((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(this.tintColor), android.graphics.PorterDuff.Mode.SRC_ATOP);
                setIconColor((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(this.tintColor), bitmapDrawable);
            }
            getView().setImageDrawable(bitmapDrawable);
        } else if (this.image.getDrawable() != null) {
            android.graphics.drawable.Drawable drawable = this.image.getDrawable();
            if (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(this.tintColor) != 0) {
                drawable.setColorFilter((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(this.tintColor), android.graphics.PorterDuff.Mode.SRC_ATOP);
                setIconColor((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(this.tintColor), drawable);
            }
            getView().setImageDrawable(drawable);
        }
        notifyChanged();
    }

    @Override // com.tencent.kinda.gen.KImageView
    public void setImageData(byte[] bArr) {
        if (bArr != null) {
            this.ImageData = bArr;
            int length = bArr.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(bArr);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/MMKImageView", "setImageData", "([B)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "com/tencent/kinda/framework/widget/base/MMKImageView", "setImageData", "([B)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            setHeight(decodeByteArray.getHeight());
            getView().setImageBitmap(decodeByteArray);
        }
    }

    @Override // com.tencent.kinda.gen.KImageView
    public void setScaleType(com.tencent.kinda.gen.ScaleType scaleType) {
        this.scaleType = scaleType;
        int i17 = com.tencent.kinda.framework.widget.base.MMKImageView.AnonymousClass1.$SwitchMap$com$tencent$kinda$gen$ScaleType[scaleType.ordinal()];
        if (i17 == 1) {
            getView().setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        } else if (i17 == 2) {
            getView().setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        } else if (i17 == 3) {
            getView().setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        } else if (i17 == 4) {
            getView().setScaleType(android.widget.ImageView.ScaleType.CENTER);
        }
        notifyChanged();
    }

    @Override // com.tencent.kinda.gen.KImageView
    public void setTintColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.tintColor) != com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor)) {
            this.tintColor = dynamicColor;
            android.graphics.drawable.Drawable drawable = getView().getDrawable();
            if (drawable != null) {
                drawable.setColorFilter((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(this.tintColor), android.graphics.PorterDuff.Mode.SRC_ATOP);
                setIconColor((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(this.tintColor), drawable);
                getView().setImageDrawable(drawable);
            }
            notifyChanged();
        }
    }

    @Override // com.tencent.kinda.gen.KImageView
    public void setUrl(java.lang.String str) {
        com.tencent.kinda.framework.widget.base.MMKImage copy = this.image.copy();
        copy.setSvgUrl(str, this.tintColor);
        setImage(copy);
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView createView(android.content.Context context) {
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = new com.tencent.mm.pluginsdk.ui.applet.CdnImageView(context, null);
        cdnImageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        cdnImageView.setAdjustViewBounds(true);
        cdnImageView.setUseSdcardCache(true);
        cdnImageView.setImgSavedDir(com.tencent.mm.wallet_core.f.a());
        this.image.setNeedGetNetworkImageImmediately(false);
        this.defaultImage.setNeedGetNetworkImageImmediately(false);
        cdnImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        return cdnImageView;
    }
}
