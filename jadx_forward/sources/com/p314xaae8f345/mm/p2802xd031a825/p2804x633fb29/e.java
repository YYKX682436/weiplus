package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public abstract class e {

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.i f295418c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f295416a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f295417b = false;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f295419d = new p012xc85e97e9.p093xedfae76a.j0();

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f295420e = new p012xc85e97e9.p093xedfae76a.j0();

    public abstract r45.js5 a();

    public abstract void b(com.p314xaae8f345.mm.p944x882e457a.f fVar);

    public void c(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d dVar, boolean z17) {
        d(dVar, z17, 0L);
    }

    public void d(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d dVar, boolean z17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AsyncCgiLoader", "try do cgi: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17));
        if (j17 <= 0) {
            e(dVar, z17);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a(this, dVar, z17), j17);
    }

    public final void e(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d dVar, boolean z17) {
        r45.js5 a17 = a();
        boolean z18 = a17 != null;
        if (z18) {
            if (dVar != null) {
                dVar.a(a17);
            }
            this.f295419d.mo7808x76db6cb1(a17);
        }
        if (!z18 || z17) {
            if (dVar != null) {
                java.util.List list = this.f295416a;
                if (!((java.util.ArrayList) list).contains(dVar)) {
                    ((java.util.ArrayList) list).add(dVar);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AsyncCgiLoader", "trigger cgi: %s", java.lang.Boolean.valueOf(this.f295417b));
            if (this.f295417b) {
                return;
            }
            this.f295417b = true;
            com.p314xaae8f345.mm.p944x882e457a.i iVar = this.f295418c;
            iz5.a.d("cgi must not be null", iVar);
            iVar.l().q(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c(this)).h(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.b(this));
        }
    }
}
