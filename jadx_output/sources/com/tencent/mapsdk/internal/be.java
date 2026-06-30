package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class be {

    /* renamed from: d, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.bd f48881d;

    /* renamed from: a, reason: collision with root package name */
    final java.util.concurrent.CopyOnWriteArrayList<com.tencent.mapsdk.internal.ez> f48878a = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList<com.tencent.mapsdk.internal.ez> f48880c = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    final java.util.concurrent.CopyOnWriteArrayList<com.tencent.mapsdk.internal.ez> f48879b = new java.util.concurrent.CopyOnWriteArrayList<>();

    public be(com.tencent.mapsdk.internal.bd bdVar) {
        this.f48881d = bdVar;
    }

    private void a(com.tencent.mapsdk.internal.ez ezVar) {
        synchronized (this.f48878a) {
            if (this.f48878a.contains(ezVar)) {
                return;
            }
            this.f48878a.add(ezVar);
        }
    }

    private void b(com.tencent.mapsdk.internal.ez ezVar) {
        if (ezVar == null) {
            return;
        }
        synchronized (this.f48878a) {
            this.f48878a.remove(ezVar);
            this.f48879b.add(ezVar);
        }
    }

    private void a() {
        int a17;
        synchronized (this.f48878a) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = this.f48879b.size();
            for (int i17 = 0; i17 < size; i17++) {
                com.tencent.mapsdk.internal.ez ezVar = this.f48879b.get(i17);
                if ((ezVar instanceof com.tencent.mapsdk.internal.qx) && (a17 = ((com.tencent.mapsdk.internal.qx) ezVar).a()) >= 0) {
                    arrayList.add(java.lang.Integer.valueOf(a17));
                }
            }
            int size2 = arrayList.size();
            int[] iArr = new int[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                iArr[i18] = ((java.lang.Integer) arrayList.get(i18)).intValue();
            }
            this.f48881d.i().a(iArr, size2);
            this.f48879b.clear();
        }
    }

    public final boolean a(float f17, float f18) {
        synchronized (this.f48878a) {
            for (int size = this.f48878a.size() - 1; size >= 0; size--) {
                com.tencent.mapsdk.internal.ez ezVar = this.f48878a.get(size);
                if (ezVar != null && ezVar.onTap(f17, f18)) {
                    return true;
                }
            }
            return false;
        }
    }

    @java.lang.Deprecated
    public final boolean a(javax.microedition.khronos.opengles.GL10 gl10) {
        int a17;
        synchronized (this.f48878a) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = this.f48879b.size();
            for (int i17 = 0; i17 < size; i17++) {
                com.tencent.mapsdk.internal.ez ezVar = this.f48879b.get(i17);
                if ((ezVar instanceof com.tencent.mapsdk.internal.qx) && (a17 = ((com.tencent.mapsdk.internal.qx) ezVar).a()) >= 0) {
                    arrayList.add(java.lang.Integer.valueOf(a17));
                }
            }
            int size2 = arrayList.size();
            int[] iArr = new int[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                iArr[i18] = ((java.lang.Integer) arrayList.get(i18)).intValue();
            }
            this.f48881d.i().a(iArr, size2);
            this.f48879b.clear();
        }
        this.f48880c.clear();
        synchronized (this.f48878a) {
            this.f48880c.addAll(this.f48878a);
        }
        java.util.Iterator<com.tencent.mapsdk.internal.ez> it = this.f48880c.iterator();
        while (it.hasNext()) {
            it.next().a(gl10);
        }
        return true;
    }
}
