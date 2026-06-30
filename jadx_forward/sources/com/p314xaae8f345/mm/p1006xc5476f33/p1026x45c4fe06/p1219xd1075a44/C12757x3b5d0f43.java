package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.MMFalseProgressBar */
/* loaded from: classes15.dex */
public class C12757x3b5d0f43 extends android.widget.ProgressBar {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f172545i = 0;

    /* renamed from: d, reason: collision with root package name */
    public float f172546d;

    /* renamed from: e, reason: collision with root package name */
    public float f172547e;

    /* renamed from: f, reason: collision with root package name */
    public float f172548f;

    /* renamed from: g, reason: collision with root package name */
    public float f172549g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f172550h;

    public C12757x3b5d0f43(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C12757x3b5d0f43(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f172546d = 0.0f;
        this.f172550h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.j0(this, android.os.Looper.getMainLooper());
        setMax(1000);
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40095x80cd5fb5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            this.f172547e = 4.0f;
            this.f172548f = 1.0f;
            this.f172549g = 0.3f;
        } else {
            this.f172547e = 2.0f;
            this.f172548f = 0.5f;
            this.f172549g = 0.15f;
        }
    }
}
