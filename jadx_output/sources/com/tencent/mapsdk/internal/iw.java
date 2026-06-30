package com.tencent.mapsdk.internal;

/* loaded from: classes16.dex */
public abstract class iw implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> f49929a = null;

    /* loaded from: classes16.dex */
    public interface a {
        void a();

        void a(com.tencent.mapsdk.internal.iw iwVar);

        void b();

        void b(com.tencent.mapsdk.internal.iw iwVar);
    }

    private java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> i() {
        return this.f49929a;
    }

    private void j() {
        java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList = this.f49929a;
        if (arrayList != null) {
            arrayList.clear();
            this.f49929a = null;
        }
    }

    public void a() {
    }

    public abstract void a(long j17);

    public abstract void a(android.view.animation.Interpolator interpolator);

    public abstract com.tencent.mapsdk.internal.iw b(long j17);

    public void b() {
    }

    public void c() {
    }

    public abstract long d();

    public abstract long e();

    public abstract boolean f();

    public boolean g() {
        return f();
    }

    @Override // 
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.tencent.mapsdk.internal.iw clone() {
        try {
            com.tencent.mapsdk.internal.iw iwVar = (com.tencent.mapsdk.internal.iw) super.clone();
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList = this.f49929a;
            if (arrayList != null) {
                iwVar.f49929a = new java.util.ArrayList<>();
                int size = arrayList.size();
                for (int i17 = 0; i17 < size; i17++) {
                    iwVar.f49929a.add(arrayList.get(i17));
                }
            }
            return iwVar;
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.AssertionError();
        }
    }

    public final void a(com.tencent.mapsdk.internal.iw.a aVar) {
        if (this.f49929a == null) {
            this.f49929a = new java.util.ArrayList<>();
        }
        this.f49929a.add(aVar);
    }

    public final void b(com.tencent.mapsdk.internal.iw.a aVar) {
        java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList = this.f49929a;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(aVar);
        if (this.f49929a.size() == 0) {
            this.f49929a = null;
        }
    }
}
