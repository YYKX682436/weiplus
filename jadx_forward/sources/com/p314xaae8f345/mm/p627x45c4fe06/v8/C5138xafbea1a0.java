package com.p314xaae8f345.mm.p627x45c4fe06.v8;

/* renamed from: com.tencent.mm.appbrand.v8.IJSRuntime$Config */
/* loaded from: classes7.dex */
public class C5138xafbea1a0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f135476a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f135477b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f135478c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f135479d;

    /* renamed from: e, reason: collision with root package name */
    public int f135480e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f135481f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f135482g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f135483h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f135484i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f135485j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f135486k;

    /* renamed from: l, reason: collision with root package name */
    public int f135487l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f135488m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.ref.WeakReference f135489n;

    /* renamed from: o, reason: collision with root package name */
    public cl.u f135490o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f135491p;

    /* renamed from: q, reason: collision with root package name */
    public cl.o f135492q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f135493r;

    public C5138xafbea1a0(java.lang.String str, byte[] bArr) {
        this.f135477b = null;
        this.f135478c = false;
        this.f135480e = com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success.f5027x1f5f799a;
        this.f135481f = "0";
        this.f135484i = false;
        this.f135485j = false;
        this.f135486k = "";
        this.f135487l = Integer.MIN_VALUE;
        this.f135488m = false;
        this.f135489n = null;
        this.f135491p = true;
        this.f135492q = null;
        this.f135493r = false;
        this.f135476a = str;
        this.f135479d = bArr;
    }

    /* renamed from: toString */
    public java.lang.String m43218x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Config{codeCache='");
        sb6.append(this.f135476a);
        sb6.append("', delaySaveCodeCache=");
        sb6.append(this.f135488m);
        sb6.append(", snapshotPath='");
        sb6.append(this.f135477b);
        sb6.append("', isNodeSnapshot=");
        sb6.append(this.f135478c);
        sb6.append(", snapShot=");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(this.f135479d) ? "null" : "not null");
        sb6.append(", mainContextSnapshotIndex=");
        sb6.append(this.f135480e);
        sb6.append(", nativeBuffer='");
        sb6.append(this.f135481f);
        sb6.append("', supportDirectEvaluation=");
        sb6.append(this.f135482g);
        sb6.append(", enableNativeTrans=");
        sb6.append(this.f135483h);
        sb6.append(", hasGlobalTimer=");
        sb6.append(this.f135484i);
        sb6.append(", ignoreRemainingTaskWhenLoopEnd=");
        sb6.append(this.f135485j);
        sb6.append(", globalAlias=null, jsThreadPriority=");
        sb6.append(this.f135487l);
        sb6.append(", hasComponent=");
        java.lang.ref.WeakReference weakReference = this.f135489n;
        sb6.append((weakReference == null || weakReference.get() == null) ? false : true);
        sb6.append(", hasBufferStore=");
        sb6.append(this.f135490o != null);
        sb6.append(", enableJavaConsole=");
        sb6.append(this.f135491p);
        sb6.append('}');
        return sb6.toString();
    }

    /* renamed from: useNativeBufferJNI */
    public boolean m43219xc0277067() {
        return "1".equalsIgnoreCase(this.f135481f);
    }

    public C5138xafbea1a0() {
        this.f135476a = null;
        this.f135477b = null;
        this.f135478c = false;
        this.f135479d = null;
        this.f135480e = com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success.f5027x1f5f799a;
        this.f135481f = "0";
        this.f135484i = false;
        this.f135485j = false;
        this.f135486k = "";
        this.f135487l = Integer.MIN_VALUE;
        this.f135488m = false;
        this.f135489n = null;
        this.f135491p = true;
        this.f135492q = null;
        this.f135493r = false;
    }
}
