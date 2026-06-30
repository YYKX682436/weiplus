package jm;

@j95.b
/* loaded from: classes12.dex */
public final class y extends jm0.o implements qi3.y {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f381791m = jz5.h.b(new jm.q(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f381792n = jz5.h.b(jm.w.f381789d);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f381793o = jz5.h.b(jm.x.f381790d);

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(hm.j.class);
        set.add(hm.f.class);
        set.add(hm.m.class);
    }

    public void Zi(qi3.a0 taskListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskListener, "taskListener");
        v65.i.b(bj(), null, new jm.r(this, taskListener, null), 1, null);
    }

    public final java.util.HashMap aj() {
        return (java.util.HashMap) ((jz5.n) this.f381793o).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a bj() {
        return (com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) this.f381791m).mo141623x754a37bb();
    }

    public void cj(long j17, long j18, int i17, java.lang.String str, java.lang.Throwable th6) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
        c6754x4f2fd58c.p("wcdb_lazy_cursor_leak");
        c6754x4f2fd58c.r("lazyId=" + j17 + "_ageMs=" + j18 + "_status=" + i17);
        c6754x4f2fd58c.s(str);
        c6754x4f2fd58c.f140818n = (int) j18;
        c6754x4f2fd58c.f140819o = i17;
        c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
        c6754x4f2fd58c.k();
    }

    public void fj(qi3.a0 taskListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskListener, "taskListener");
        v65.i.b(bj(), null, new jm.v(this, taskListener, null), 1, null);
    }
}
