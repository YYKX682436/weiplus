package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.plugin.appbrand.ipc.MainProcessTask */
/* loaded from: classes15.dex */
public abstract class AbstractC11896x2d96b4fb implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.t0 f159922d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.t0(null);

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.q0 f159923e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.q0(this, null);

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.MainProcessTask$a */
    /* loaded from: classes15.dex */
    public static class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
        private a() {
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb abstractC11896x2d96b4fb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb.b(abstractC11896x2d96b4fb, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.r0(this, rVar, abstractC11896x2d96b4fb));
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.s0(this, abstractC11896x2d96b4fb), "MicroMsg.AppBrand.MainProcessTask");
        }
    }

    @mk0.a
    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.MainProcessTask$b */
    /* loaded from: classes15.dex */
    public static class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb.a implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable> {
        private b() {
            super();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.MainProcessTask$c */
    /* loaded from: classes14.dex */
    public static class c implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
        private c() {
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
        /* renamed from: invoke */
        public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb abstractC11896x2d96b4fb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb) obj;
            abstractC11896x2d96b4fb.z();
            return abstractC11896x2d96b4fb;
        }
    }

    public static void a(android.os.Parcelable parcelable, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb abstractC11896x2d96b4fb) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || parcelable == null) {
            return;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        abstractC11896x2d96b4fb.v(obtain);
        obtain.recycle();
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb abstractC11896x2d96b4fb, java.lang.Runnable runnable) {
        abstractC11896x2d96b4fb.f159922d.f159970a = runnable;
    }

    public final boolean c() {
        java.lang.Runnable runnable = this.f159922d.f159970a;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    public final void d() {
        if (t()) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, this, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb.b.class, null, "MicroMsg.AppBrand.MainProcessTask");
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, this, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb.a.class, this.f159923e.f159963a, "MicroMsg.AppBrand.MainProcessTask");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean s() {
        android.os.Parcelable f17;
        if (!com.p314xaae8f345.mm.p794xb0fa9b5e.d0.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b) || (f17 = com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, this, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb.c.class)) == null) {
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
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
        return rk0.a.a(getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v0.class);
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
        this.f159923e.f159963a.f159971d = null;
    }

    public void y() {
    }

    public abstract void z();
}
