package i9;

/* loaded from: classes15.dex */
public final class l extends m8.a implements android.os.Handler.Callback {
    public int A;

    /* renamed from: o, reason: collision with root package name */
    public final android.os.Handler f371206o;

    /* renamed from: p, reason: collision with root package name */
    public final i9.k f371207p;

    /* renamed from: q, reason: collision with root package name */
    public final i9.h f371208q;

    /* renamed from: r, reason: collision with root package name */
    public final m8.s f371209r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f371210s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f371211t;

    /* renamed from: u, reason: collision with root package name */
    public int f371212u;

    /* renamed from: v, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f371213v;

    /* renamed from: w, reason: collision with root package name */
    public i9.e f371214w;

    /* renamed from: x, reason: collision with root package name */
    public i9.i f371215x;

    /* renamed from: y, reason: collision with root package name */
    public i9.j f371216y;

    /* renamed from: z, reason: collision with root package name */
    public i9.j f371217z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i9.k kVar, android.os.Looper looper) {
        super(3);
        i9.h hVar = i9.h.f371202a;
        kVar.getClass();
        this.f371207p = kVar;
        this.f371206o = looper == null ? null : new android.os.Handler(looper, this);
        this.f371208q = hVar;
        this.f371209r = new m8.s();
    }

    @Override // m8.c0
    public int c(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417) {
        ((i9.g) this.f371208q).getClass();
        java.lang.String str = c1601x7dc4e417.f125613i;
        if ("text/vtt".equals(str) || com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54272xf2e74fcf.equals(str) || com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54239x122ad1ce.equals(str) || com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54232x26881eb4.equals(str) || com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54238x3111f4c8.equals(str) || com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54240x122adda7.equals(str) || com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54222x14e2122e.equals(str) || com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54231xd925ae21.equals(str) || com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54223x14e215ef.equals(str) || com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54224xd964a414.equals(str)) {
            return 4;
        }
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24.equals(t9.k.b(c1601x7dc4e417.f125613i)) ? 1 : 0;
    }

    @Override // m8.b0
    public boolean h() {
        return this.f371211t;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what != 0) {
            throw new java.lang.IllegalStateException();
        }
        this.f371207p.a((java.util.List) message.obj);
        return true;
    }

    @Override // m8.b0
    public void i(long j17, long j18) {
        boolean z17;
        m8.s sVar = this.f371209r;
        if (this.f371211t) {
            return;
        }
        if (this.f371217z == null) {
            this.f371214w.b(j17);
            try {
                this.f371217z = (i9.j) this.f371214w.mo140477x436dd5f1();
            } catch (i9.f e17) {
                throw m8.e.a(e17, this.f406070f);
            }
        }
        if (this.f406071g != 2) {
            return;
        }
        if (this.f371216y != null) {
            long s17 = s();
            z17 = false;
            while (s17 <= j17) {
                this.A++;
                s17 = s();
                z17 = true;
            }
        } else {
            z17 = false;
        }
        i9.j jVar = this.f371217z;
        if (jVar != null) {
            if (jVar.b(4)) {
                if (!z17 && s() == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                    if (this.f371212u == 2) {
                        t();
                        this.f371214w.mo140475x41012807();
                        this.f371214w = null;
                        this.f371212u = 0;
                        this.f371214w = ((i9.g) this.f371208q).a(this.f371213v);
                    } else {
                        t();
                        this.f371211t = true;
                    }
                }
            } else if (this.f371217z.f425146e <= j17) {
                i9.j jVar2 = this.f371216y;
                if (jVar2 != null) {
                    jVar2.l();
                }
                i9.j jVar3 = this.f371217z;
                this.f371216y = jVar3;
                this.f371217z = null;
                this.A = jVar3.i(j17);
                z17 = true;
            }
        }
        if (z17) {
            java.util.List j19 = this.f371216y.j(j17);
            android.os.Handler handler = this.f371206o;
            if (handler != null) {
                handler.obtainMessage(0, j19).sendToTarget();
            } else {
                this.f371207p.a(j19);
            }
        }
        if (this.f371212u == 2) {
            return;
        }
        while (!this.f371210s) {
            try {
                if (this.f371215x == null) {
                    i9.i iVar = (i9.i) this.f371214w.a();
                    this.f371215x = iVar;
                    if (iVar == null) {
                        return;
                    }
                }
                if (this.f371212u == 1) {
                    i9.i iVar2 = this.f371215x;
                    iVar2.f425127d = 4;
                    this.f371214w.c(iVar2);
                    this.f371215x = null;
                    this.f371212u = 2;
                    return;
                }
                int r17 = r(sVar, this.f371215x, false);
                if (r17 == -4) {
                    if (this.f371215x.b(4)) {
                        this.f371210s = true;
                    } else {
                        i9.i iVar3 = this.f371215x;
                        iVar3.f371203i = sVar.f406199a.C;
                        iVar3.f425143f.flip();
                    }
                    this.f371214w.c(this.f371215x);
                    this.f371215x = null;
                } else if (r17 == -3) {
                    return;
                }
            } catch (i9.f e18) {
                throw m8.e.a(e18, this.f406070f);
            }
        }
    }

    @Override // m8.b0
    /* renamed from: isReady */
    public boolean mo134934x7b5e8699() {
        return true;
    }

    @Override // m8.a
    public void l() {
        this.f371213v = null;
        java.util.List emptyList = java.util.Collections.emptyList();
        android.os.Handler handler = this.f371206o;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f371207p.a(emptyList);
        }
        t();
        this.f371214w.mo140475x41012807();
        this.f371214w = null;
        this.f371212u = 0;
    }

    @Override // m8.a
    public void n(long j17, boolean z17) {
        java.util.List emptyList = java.util.Collections.emptyList();
        android.os.Handler handler = this.f371206o;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f371207p.a(emptyList);
        }
        this.f371210s = false;
        this.f371211t = false;
        if (this.f371212u == 0) {
            t();
            this.f371214w.mo140474x5d03b04();
            return;
        }
        t();
        this.f371214w.mo140475x41012807();
        this.f371214w = null;
        this.f371212u = 0;
        this.f371214w = ((i9.g) this.f371208q).a(this.f371213v);
    }

    @Override // m8.a
    public void q(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[] c1601x7dc4e417Arr, long j17) {
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 c1601x7dc4e417 = c1601x7dc4e417Arr[0];
        this.f371213v = c1601x7dc4e417;
        if (this.f371214w != null) {
            this.f371212u = 1;
        } else {
            this.f371214w = ((i9.g) this.f371208q).a(c1601x7dc4e417);
        }
    }

    public final long s() {
        int i17 = this.A;
        return (i17 == -1 || i17 >= this.f371216y.h()) ? com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 : this.f371216y.a(this.A);
    }

    public final void t() {
        this.f371215x = null;
        this.A = -1;
        i9.j jVar = this.f371216y;
        if (jVar != null) {
            jVar.l();
            this.f371216y = null;
        }
        i9.j jVar2 = this.f371217z;
        if (jVar2 != null) {
            jVar2.l();
            this.f371217z = null;
        }
    }
}
