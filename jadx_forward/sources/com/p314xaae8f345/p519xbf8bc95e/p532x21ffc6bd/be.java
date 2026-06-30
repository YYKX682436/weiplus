package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class be {

    /* renamed from: d, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd f130414d;

    /* renamed from: a, reason: collision with root package name */
    final java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez> f130411a = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez> f130413c = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    final java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez> f130412b = new java.util.concurrent.CopyOnWriteArrayList<>();

    public be(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar) {
        this.f130414d = bdVar;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar) {
        synchronized (this.f130411a) {
            if (this.f130411a.contains(ezVar)) {
                return;
            }
            this.f130411a.add(ezVar);
        }
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar) {
        if (ezVar == null) {
            return;
        }
        synchronized (this.f130411a) {
            this.f130411a.remove(ezVar);
            this.f130412b.add(ezVar);
        }
    }

    private void a() {
        int a17;
        synchronized (this.f130411a) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = this.f130412b.size();
            for (int i17 = 0; i17 < size; i17++) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar = this.f130412b.get(i17);
                if ((ezVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx) && (a17 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx) ezVar).a()) >= 0) {
                    arrayList.add(java.lang.Integer.valueOf(a17));
                }
            }
            int size2 = arrayList.size();
            int[] iArr = new int[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                iArr[i18] = ((java.lang.Integer) arrayList.get(i18)).intValue();
            }
            this.f130414d.i().a(iArr, size2);
            this.f130412b.clear();
        }
    }

    public final boolean a(float f17, float f18) {
        synchronized (this.f130411a) {
            for (int size = this.f130411a.size() - 1; size >= 0; size--) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar = this.f130411a.get(size);
                if (ezVar != null && ezVar.mo36424x64f7944(f17, f18)) {
                    return true;
                }
            }
            return false;
        }
    }

    @java.lang.Deprecated
    public final boolean a(javax.microedition.khronos.opengles.GL10 gl10) {
        int a17;
        synchronized (this.f130411a) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = this.f130412b.size();
            for (int i17 = 0; i17 < size; i17++) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar = this.f130412b.get(i17);
                if ((ezVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx) && (a17 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx) ezVar).a()) >= 0) {
                    arrayList.add(java.lang.Integer.valueOf(a17));
                }
            }
            int size2 = arrayList.size();
            int[] iArr = new int[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                iArr[i18] = ((java.lang.Integer) arrayList.get(i18)).intValue();
            }
            this.f130414d.i().a(iArr, size2);
            this.f130412b.clear();
        }
        this.f130413c.clear();
        synchronized (this.f130411a) {
            this.f130413c.addAll(this.f130411a);
        }
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez> it = this.f130413c.iterator();
        while (it.hasNext()) {
            it.next().a(gl10);
        }
        return true;
    }
}
