package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class s4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 f231316a;

    /* renamed from: b, reason: collision with root package name */
    public int f231317b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f231318c = 0;

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f231319d = null;

    /* renamed from: e, reason: collision with root package name */
    public wu5.c f231320e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f231321f = false;

    public s4(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var) {
        this.f231316a = null;
        this.f231316a = c0Var;
    }

    public void a() {
        if (zj3.j.g()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkVideoMgr", "release");
        try {
            synchronized (this) {
                if (this.f231321f) {
                    this.f231321f = false;
                    wu5.c cVar = this.f231319d;
                    if (cVar != null) {
                        cVar.cancel(false);
                        this.f231319d = null;
                    }
                    wu5.c cVar2 = this.f231320e;
                    if (cVar2 != null) {
                        cVar2.cancel(false);
                        this.f231320e = null;
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkVideoMgr", "release error:" + e17.toString());
        }
    }

    public boolean b() {
        if (zj3.j.g()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkVideoMgr", "startPlay");
        try {
            synchronized (this) {
                if (this.f231321f) {
                    return false;
                }
                this.f231321f = true;
                wu5.c cVar = this.f231319d;
                if (cVar != null) {
                    cVar.cancel(false);
                    this.f231319d = null;
                }
                this.f231319d = ((ku5.t0) ku5.t0.f394148d).d(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.o4(this), 0L, 10L);
                wu5.c cVar2 = this.f231320e;
                if (cVar2 != null) {
                    cVar2.cancel(false);
                    this.f231320e = null;
                }
                this.f231320e = ((ku5.t0) ku5.t0.f394148d).d(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.r4(this), 0L, 10L);
                return true;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkVideoMgr", "startPlay error:" + e17.toString());
            return false;
        }
    }
}
