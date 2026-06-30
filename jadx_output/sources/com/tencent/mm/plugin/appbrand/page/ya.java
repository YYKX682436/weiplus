package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public abstract class ya extends android.content.MutableContextWrapper {
    @android.webkit.JavascriptInterface
    public float getPixelRatio() {
        return getResources().getDisplayMetrics().density;
    }

    @android.webkit.JavascriptInterface
    public float getWidth() {
        return (float) java.lang.Math.ceil(getResources().getDisplayMetrics().widthPixels / getPixelRatio());
    }
}
