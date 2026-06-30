package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMFalseProgressBar */
/* loaded from: classes8.dex */
public class C21488x3b5d0f43 extends android.widget.ProgressBar {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f278866o = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f278867d;

    /* renamed from: e, reason: collision with root package name */
    public float f278868e;

    /* renamed from: f, reason: collision with root package name */
    public float f278869f;

    /* renamed from: g, reason: collision with root package name */
    public float f278870g;

    /* renamed from: h, reason: collision with root package name */
    public float f278871h;

    /* renamed from: i, reason: collision with root package name */
    public float f278872i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f278873m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f278874n;

    public C21488x3b5d0f43(android.content.Context context) {
        this(context, null);
        b();
    }

    public void a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f278874n;
        if (n3Var != null) {
            n3Var.mo50305x3d8a09a2(1002);
        }
    }

    public final void b() {
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40095x80cd5fb5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            this.f278869f = 4.0f;
            this.f278870g = 1.0f;
            this.f278871h = 0.3f;
            this.f278872i = 50.0f;
            return;
        }
        this.f278869f = 2.0f;
        this.f278870g = 0.5f;
        this.f278871h = 0.15f;
        this.f278872i = 50.0f;
    }

    public void c() {
        if (this.f278873m && !this.f278867d) {
            this.f278867d = true;
            b();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f278874n;
            if (n3Var != null) {
                n3Var.mo50305x3d8a09a2(1000);
                n3Var.mo50305x3d8a09a2(1001);
            }
        }
    }

    public C21488x3b5d0f43(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21488x3b5d0f43(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278867d = false;
        this.f278868e = 0.0f;
        this.f278873m = true;
        this.f278874n = new db5.w1(this, android.os.Looper.getMainLooper());
        setMax(1000);
        b();
    }
}
