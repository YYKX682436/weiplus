package com.tencent.mm.plugin.facedetectlight.ui;

/* loaded from: classes14.dex */
public class PreviewFrameLayout extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public double f100213d;

    public PreviewFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f100213d = 1.3333333333333333d;
    }

    public double getmAspectRatio() {
        return this.f100213d;
    }

    public void setAspectRatio(double d17) {
        if (d17 <= 0.0d) {
            throw new java.lang.IllegalArgumentException();
        }
        if (this.f100213d != d17) {
            this.f100213d = d17;
            requestLayout();
        }
    }
}
