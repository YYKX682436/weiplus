package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes15.dex */
public class MMFalseProgressBar extends android.widget.ProgressBar {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f91012i = 0;

    /* renamed from: d, reason: collision with root package name */
    public float f91013d;

    /* renamed from: e, reason: collision with root package name */
    public float f91014e;

    /* renamed from: f, reason: collision with root package name */
    public float f91015f;

    /* renamed from: g, reason: collision with root package name */
    public float f91016g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f91017h;

    public MMFalseProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MMFalseProgressBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91013d = 0.0f;
        this.f91017h = new com.tencent.mm.plugin.appbrand.widget.j0(this, android.os.Looper.getMainLooper());
        setMax(1000);
        if (com.tencent.mars.comm.NetStatusUtil.isWifiOr4G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            this.f91014e = 4.0f;
            this.f91015f = 1.0f;
            this.f91016g = 0.3f;
        } else {
            this.f91014e = 2.0f;
            this.f91015f = 0.5f;
            this.f91016g = 0.15f;
        }
    }
}
