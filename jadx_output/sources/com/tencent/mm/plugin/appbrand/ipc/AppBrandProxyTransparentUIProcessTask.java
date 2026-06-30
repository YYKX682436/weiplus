package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes14.dex */
public abstract class AppBrandProxyTransparentUIProcessTask implements android.os.Parcelable {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f78362g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f78363h = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f78364d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.da f78365e = new com.tencent.mm.plugin.appbrand.ipc.p(this);

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f78366f = "" + android.os.Process.myPid() + "" + hashCode();

    public AppBrandProxyTransparentUIProcessTask() {
    }

    public final void a() {
        if (this.f78364d == null) {
            return;
        }
        java.util.Map map = f78362g;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        java.lang.String str = this.f78366f;
        ((java.util.concurrent.ConcurrentHashMap) map).put(str, weakReference);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this.f78364d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUI.class);
        intent.putExtra("task_object", this);
        intent.putExtra("task_class_name", getClass().getName());
        intent.putExtra("task_id", str);
        intent.putExtra("orientation", -1);
        nf.g.a(this.f78364d).j(intent, new com.tencent.mm.plugin.appbrand.ipc.q(this));
    }

    public void b(android.os.Parcel parcel) {
    }

    public void c() {
    }

    public abstract void d(android.content.Context context, com.tencent.mm.plugin.appbrand.ipc.r rVar);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
    }

    public AppBrandProxyTransparentUIProcessTask(android.content.Context context) {
        this.f78364d = context;
    }
}
