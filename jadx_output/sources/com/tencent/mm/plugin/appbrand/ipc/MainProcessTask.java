package com.tencent.mm.plugin.appbrand.ipc;

@java.lang.Deprecated
/* loaded from: classes15.dex */
public abstract class MainProcessTask implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ipc.t0 f78389d = new com.tencent.mm.plugin.appbrand.ipc.t0(null);

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ipc.q0 f78390e = new com.tencent.mm.plugin.appbrand.ipc.q0(this, null);

    /* loaded from: classes15.dex */
    public static class a implements com.tencent.mm.ipcinvoker.j {
        private a() {
        }

        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            com.tencent.mm.plugin.appbrand.ipc.MainProcessTask mainProcessTask = (com.tencent.mm.plugin.appbrand.ipc.MainProcessTask) obj;
            com.tencent.mm.plugin.appbrand.ipc.MainProcessTask.b(mainProcessTask, new com.tencent.mm.plugin.appbrand.ipc.r0(this, rVar, mainProcessTask));
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.ipc.s0(this, mainProcessTask), "MicroMsg.AppBrand.MainProcessTask");
        }
    }

    @mk0.a
    /* loaded from: classes15.dex */
    public static class b extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask.a implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable> {
        private b() {
            super();
        }
    }

    /* loaded from: classes14.dex */
    public static class c implements com.tencent.mm.ipcinvoker.k0 {
        private c() {
        }

        @Override // com.tencent.mm.ipcinvoker.k0
        public java.lang.Object invoke(java.lang.Object obj) {
            com.tencent.mm.plugin.appbrand.ipc.MainProcessTask mainProcessTask = (com.tencent.mm.plugin.appbrand.ipc.MainProcessTask) obj;
            mainProcessTask.z();
            return mainProcessTask;
        }
    }

    public static void a(android.os.Parcelable parcelable, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask mainProcessTask) {
        if (com.tencent.mm.sdk.platformtools.x2.n() || parcelable == null) {
            return;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        mainProcessTask.v(obtain);
        obtain.recycle();
    }

    public static void b(com.tencent.mm.plugin.appbrand.ipc.MainProcessTask mainProcessTask, java.lang.Runnable runnable) {
        mainProcessTask.f78389d.f78437a = runnable;
    }

    public final boolean c() {
        java.lang.Runnable runnable = this.f78389d.f78437a;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    public final void d() {
        if (t()) {
            com.tencent.mm.ipcinvoker.d0.e(com.tencent.mm.sdk.platformtools.x2.f193072b, this, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask.b.class, null, "MicroMsg.AppBrand.MainProcessTask");
        } else {
            com.tencent.mm.ipcinvoker.d0.e(com.tencent.mm.sdk.platformtools.x2.f193072b, this, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask.a.class, this.f78390e.f78430a, "MicroMsg.AppBrand.MainProcessTask");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean s() {
        android.os.Parcelable f17;
        if (!com.tencent.mm.ipcinvoker.d0.g(com.tencent.mm.sdk.platformtools.x2.f193072b) || (f17 = com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.x2.f193072b, this, com.tencent.mm.plugin.appbrand.ipc.MainProcessTask.c.class)) == null) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            f17.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            v(obtain);
            obtain.recycle();
        }
        y();
        return true;
    }

    public final boolean t() {
        return rk0.a.a(getClass(), com.tencent.mm.plugin.appbrand.ipc.v0.class);
    }

    @java.lang.Deprecated
    public final void u() {
    }

    public void v(android.os.Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
    }

    @java.lang.Deprecated
    public final void x() {
        this.f78390e.f78430a.f78438d = null;
    }

    public void y() {
    }

    public abstract void z();
}
