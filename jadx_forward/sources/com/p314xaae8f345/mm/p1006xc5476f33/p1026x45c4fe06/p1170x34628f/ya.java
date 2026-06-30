package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public abstract class ya extends android.content.MutableContextWrapper {
    @android.webkit.JavascriptInterface
    /* renamed from: getPixelRatio */
    public float m52252xebd2e91b() {
        return getResources().getDisplayMetrics().density;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getWidth */
    public float mo52193x755bd410() {
        return (float) java.lang.Math.ceil(getResources().getDisplayMetrics().widthPixels / m52252xebd2e91b());
    }
}
