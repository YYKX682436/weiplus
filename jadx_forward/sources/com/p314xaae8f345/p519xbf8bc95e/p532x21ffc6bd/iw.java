package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes16.dex */
public abstract class iw implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> f131462a = null;

    /* loaded from: classes16.dex */
    public interface a {
        void a();

        void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar);

        void b();

        void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar);
    }

    private java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> i() {
        return this.f131462a;
    }

    private void j() {
        java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList = this.f131462a;
        if (arrayList != null) {
            arrayList.clear();
            this.f131462a = null;
        }
    }

    public void a() {
    }

    public abstract void a(long j17);

    public abstract void a(android.view.animation.Interpolator interpolator);

    public abstract com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw b(long j17);

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
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw mo36792x5a5dd5d() {
        try {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw iwVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iw) super.clone();
            java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList = this.f131462a;
            if (arrayList != null) {
                iwVar.f131462a = new java.util.ArrayList<>();
                int size = arrayList.size();
                for (int i17 = 0; i17 < size; i17++) {
                    iwVar.f131462a.add(arrayList.get(i17));
                }
            }
            return iwVar;
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.AssertionError();
        }
    }

    public final void a(com.tencent.mapsdk.internal.iw.a aVar) {
        if (this.f131462a == null) {
            this.f131462a = new java.util.ArrayList<>();
        }
        this.f131462a.add(aVar);
    }

    public final void b(com.tencent.mapsdk.internal.iw.a aVar) {
        java.util.ArrayList<com.tencent.mapsdk.internal.iw.a> arrayList = this.f131462a;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(aVar);
        if (this.f131462a.size() == 0) {
            this.f131462a = null;
        }
    }
}
