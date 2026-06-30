package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class AppBrandPreInitTask extends com.tencent.mm.plugin.appbrand.ipc.AccountScopedMainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask> CREATOR = new com.tencent.mm.plugin.appbrand.launching.n0();

    /* renamed from: f, reason: collision with root package name */
    public final transient com.tencent.mm.plugin.appbrand.launching.o0 f84364f;

    /* renamed from: g, reason: collision with root package name */
    public final transient android.content.Context f84365g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate f84366h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f84367i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel f84368m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f84369n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f84370o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f84371p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f84372q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f84373r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f84374s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f84375t;

    public /* synthetic */ AppBrandPreInitTask(android.os.Parcel parcel, com.tencent.mm.plugin.appbrand.launching.k0 k0Var) {
        this(parcel);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AccountScopedMainProcessTask
    public void E() {
        super.D();
        this.f84374s = true;
        c();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AccountScopedMainProcessTask
    public void F() {
        com.tencent.luggage.sdk.processes.s c17;
        final boolean[] zArr = {true};
        final java.lang.String[] strArr = {null};
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask appBrandPreInitTask = com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask.this;
                com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = appBrandPreInitTask.f84368m;
                java.lang.String str = launchParcel.f84902e;
                java.util.Objects.requireNonNull(str);
                boolean[] zArr2 = zArr;
                java.lang.String f17 = com.tencent.mm.plugin.appbrand.report.quality.u.f(launchParcel, str, zArr2[0]);
                java.lang.String[] strArr2 = strArr;
                strArr2[0] = f17;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreInitTask", "runInAccountScope for appId:%s, preferUseCached:%b, forceCreateNewInstance:%b, forceUseBackup:%b, <reportOpen> newInstance:%b, instanceId:%s", appBrandPreInitTask.f84368m.f84902e, java.lang.Boolean.valueOf(appBrandPreInitTask.f84371p), java.lang.Boolean.valueOf(appBrandPreInitTask.f84370o), java.lang.Boolean.valueOf(appBrandPreInitTask.f84369n), java.lang.Boolean.valueOf(zArr2[0]), strArr2[0]);
                com.tencent.mm.plugin.appbrand.report.b3.f87812a.d(appBrandPreInitTask.f84368m, strArr2[0]);
                if (com.tencent.mm.plugin.appbrand.report.quality.w1.a()) {
                    com.tencent.mm.plugin.appbrand.report.quality.w1.f88373a.g(appBrandPreInitTask.f84368m.f84902e, strArr2[0]);
                    com.tencent.mm.plugin.appbrand.keylogger.w.j(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.class, appBrandPreInitTask.f84368m.f84902e);
                    com.tencent.mm.plugin.appbrand.keylogger.w.a(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.class, appBrandPreInitTask.f84368m.f84902e, java.lang.String.format("Network:%s", com.tencent.mars.comm.NetStatusUtil.getNetTypeString(com.tencent.mm.sdk.platformtools.x2.f193071a)));
                }
            }
        };
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = this.f84368m;
        java.lang.String str = launchParcel.f84902e;
        int i17 = launchParcel.f84904g;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.plugin.appbrand.launching.l0 l0Var = new com.tencent.mm.plugin.appbrand.launching.l0(this, zArr, java.lang.System.currentTimeMillis(), i17, strArr, runnable, str);
        if (!android.text.TextUtils.isEmpty(str) && (c17 = com.tencent.mm.plugin.appbrand.task.u0.C().c(str, i17)) != null) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) c17.f47687d;
            if (appBrandInitConfigWC.f77281g == i17 && this.f84371p && !this.f84370o) {
                zArr[0] = false;
                strArr[0] = c17.f47691h;
                runnable.run();
                if (i17 != 2 || com.tencent.mm.plugin.appbrand.launching.g5.f84619a.c()) {
                    l0Var.b(appBrandInitConfigWC, this.f84368m.f84910o, 1);
                    return;
                } else {
                    new com.tencent.mm.plugin.appbrand.launching.w0(this.f84368m, strArr[0], this.f84369n, l0Var).run();
                    return;
                }
            }
        }
        zArr[0] = true;
        runnable.run();
        new com.tencent.mm.plugin.appbrand.launching.w0(this.f84368m, strArr[0], this.f84369n, l0Var).run();
    }

    public com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask G(boolean z17) {
        this.f84370o = z17;
        return this;
    }

    public com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask H(boolean z17) {
        this.f84371p = z17;
        return this;
    }

    public void I() {
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = this.f84368m;
        if (launchParcel.f84915r <= 0) {
            launchParcel.d();
        }
        d();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f84367i = parcel.readString();
        this.f84368m = (com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel) parcel.readParcelable(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel.class.getClassLoader());
        this.f84369n = parcel.readByte() > 0;
        this.f84370o = parcel.readByte() > 0;
        this.f84371p = parcel.readByte() > 0;
        this.f84372q = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC.class.getClassLoader());
        this.f84366h = (com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate) parcel.readParcelable(com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.class.getClassLoader());
        this.f84373r = parcel.readByte() != 0;
        this.f84374s = parcel.readByte() > 0;
        this.f84375t = parcel.readByte() > 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f84367i);
        parcel.writeParcelable(this.f84368m, i17);
        parcel.writeByte(this.f84369n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f84370o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f84371p ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f84372q, i17);
        parcel.writeParcelable(this.f84366h, i17);
        parcel.writeByte(this.f84373r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f84374s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f84375t ? (byte) 1 : (byte) 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        boolean z17;
        try {
            boolean z18 = this.f84374s;
            android.content.Context context = this.f84365g;
            if (z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreInitTask", "runInClientProcess for %s, account expired, context:%s", this.f84368m, context);
                if (context instanceof android.app.Activity) {
                    com.tencent.mm.plugin.appbrand.ui.m8.f89866a.a((android.app.Activity) context);
                }
                if (z17) {
                    return;
                } else {
                    return;
                }
            }
            com.tencent.mm.plugin.appbrand.launching.o0 o0Var = this.f84364f;
            if (o0Var != null) {
                if (this.f84373r) {
                    com.tencent.mm.plugin.appbrand.launching.teenmode.l.f85202a.b(context, this.f84372q, new com.tencent.mm.plugin.appbrand.launching.k0(this));
                } else {
                    o0Var.a(this.f84372q, this.f84368m.f84910o);
                }
            }
            if (this.f84373r) {
                return;
            }
            x();
        } finally {
            if (!this.f84373r) {
                x();
            }
        }
    }

    public AppBrandPreInitTask(android.content.Context context, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, com.tencent.mm.plugin.appbrand.launching.o0 o0Var) {
        this(context, launchParcel, false, o0Var);
    }

    public AppBrandPreInitTask(android.content.Context context, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, boolean z17, com.tencent.mm.plugin.appbrand.launching.o0 o0Var) {
        this.f84365g = context;
        this.f84367i = bm5.f1.a();
        this.f84368m = launchParcel;
        this.f84369n = z17;
        this.f84370o = false;
        this.f84364f = o0Var;
        android.app.Activity a17 = q75.a.a(context);
        if (a17 != null) {
            this.f84366h = new com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate(a17);
        } else {
            this.f84366h = null;
        }
        this.f84368m.f84921x = this.f84366h;
    }

    private AppBrandPreInitTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
