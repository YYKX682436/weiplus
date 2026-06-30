package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask */
/* loaded from: classes14.dex */
public abstract class AbstractC11885x29239176 implements android.os.Parcelable {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f159895g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f159896h = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f159897d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.da f159898e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.p(this);

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f159899f = "" + android.os.Process.myPid() + "" + hashCode();

    public AbstractC11885x29239176() {
    }

    public final void a() {
        if (this.f159897d == null) {
            return;
        }
        java.util.Map map = f159895g;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        java.lang.String str = this.f159899f;
        ((java.util.concurrent.ConcurrentHashMap) map).put(str, weakReference);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this.f159897d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11884x35a49c3e.class);
        intent.putExtra("task_object", this);
        intent.putExtra("task_class_name", getClass().getName());
        intent.putExtra("task_id", str);
        intent.putExtra("orientation", -1);
        nf.g.a(this.f159897d).j(intent, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.q(this));
    }

    public void b(android.os.Parcel parcel) {
    }

    public void c() {
    }

    public abstract void d(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.r rVar);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
    }

    public AbstractC11885x29239176(android.content.Context context) {
        this.f159897d = context;
    }
}
