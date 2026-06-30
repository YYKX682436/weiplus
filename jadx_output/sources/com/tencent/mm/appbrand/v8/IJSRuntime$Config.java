package com.tencent.mm.appbrand.v8;

/* loaded from: classes7.dex */
public class IJSRuntime$Config {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f53943a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f53944b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f53945c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f53946d;

    /* renamed from: e, reason: collision with root package name */
    public int f53947e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f53948f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f53949g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f53950h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f53951i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f53952j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f53953k;

    /* renamed from: l, reason: collision with root package name */
    public int f53954l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f53955m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.ref.WeakReference f53956n;

    /* renamed from: o, reason: collision with root package name */
    public cl.u f53957o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f53958p;

    /* renamed from: q, reason: collision with root package name */
    public cl.o f53959q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f53960r;

    public IJSRuntime$Config(java.lang.String str, byte[] bArr) {
        this.f53944b = null;
        this.f53945c = false;
        this.f53947e = com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX;
        this.f53948f = "0";
        this.f53951i = false;
        this.f53952j = false;
        this.f53953k = "";
        this.f53954l = Integer.MIN_VALUE;
        this.f53955m = false;
        this.f53956n = null;
        this.f53958p = true;
        this.f53959q = null;
        this.f53960r = false;
        this.f53943a = str;
        this.f53946d = bArr;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Config{codeCache='");
        sb6.append(this.f53943a);
        sb6.append("', delaySaveCodeCache=");
        sb6.append(this.f53955m);
        sb6.append(", snapshotPath='");
        sb6.append(this.f53944b);
        sb6.append("', isNodeSnapshot=");
        sb6.append(this.f53945c);
        sb6.append(", snapShot=");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.M0(this.f53946d) ? "null" : "not null");
        sb6.append(", mainContextSnapshotIndex=");
        sb6.append(this.f53947e);
        sb6.append(", nativeBuffer='");
        sb6.append(this.f53948f);
        sb6.append("', supportDirectEvaluation=");
        sb6.append(this.f53949g);
        sb6.append(", enableNativeTrans=");
        sb6.append(this.f53950h);
        sb6.append(", hasGlobalTimer=");
        sb6.append(this.f53951i);
        sb6.append(", ignoreRemainingTaskWhenLoopEnd=");
        sb6.append(this.f53952j);
        sb6.append(", globalAlias=null, jsThreadPriority=");
        sb6.append(this.f53954l);
        sb6.append(", hasComponent=");
        java.lang.ref.WeakReference weakReference = this.f53956n;
        sb6.append((weakReference == null || weakReference.get() == null) ? false : true);
        sb6.append(", hasBufferStore=");
        sb6.append(this.f53957o != null);
        sb6.append(", enableJavaConsole=");
        sb6.append(this.f53958p);
        sb6.append('}');
        return sb6.toString();
    }

    public boolean useNativeBufferJNI() {
        return "1".equalsIgnoreCase(this.f53948f);
    }

    public IJSRuntime$Config() {
        this.f53943a = null;
        this.f53944b = null;
        this.f53945c = false;
        this.f53946d = null;
        this.f53947e = com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX;
        this.f53948f = "0";
        this.f53951i = false;
        this.f53952j = false;
        this.f53953k = "";
        this.f53954l = Integer.MIN_VALUE;
        this.f53955m = false;
        this.f53956n = null;
        this.f53958p = true;
        this.f53959q = null;
        this.f53960r = false;
    }
}
