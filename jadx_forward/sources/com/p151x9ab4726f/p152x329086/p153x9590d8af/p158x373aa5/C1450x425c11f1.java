package com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5;

/* renamed from: com.davemorrissey.labs.subscaleview.view.ImageViewState */
/* loaded from: classes15.dex */
public class C1450x425c11f1 implements java.io.Serializable {

    /* renamed from: centerX */
    private float f4502x27a6bea3;

    /* renamed from: centerY */
    private float f4503x27a6bea4;

    /* renamed from: orientation */
    private int f4504xaa32f5d0;

    /* renamed from: scale */
    private float f4505x683094a;

    public C1450x425c11f1(float f17, android.graphics.PointF pointF, int i17) {
        this.f4505x683094a = f17;
        this.f4502x27a6bea3 = pointF.x;
        this.f4503x27a6bea4 = pointF.y;
        this.f4504xaa32f5d0 = i17;
    }

    /* renamed from: getCenter */
    public android.graphics.PointF m15542x13c9ef4b() {
        return new android.graphics.PointF(this.f4502x27a6bea3, this.f4503x27a6bea4);
    }

    /* renamed from: getOrientation */
    public int m15543x84093c9a() {
        return this.f4504xaa32f5d0;
    }

    /* renamed from: getScale */
    public float m15544x7520af94() {
        return this.f4505x683094a;
    }
}
