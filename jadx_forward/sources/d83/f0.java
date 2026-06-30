package d83;

/* loaded from: classes5.dex */
public final class f0 implements e70.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d83.h0 f308499a;

    public f0(d83.h0 h0Var) {
        this.f308499a = h0Var;
    }

    @Override // e70.c0
    public void a(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.g data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.Iterator it = this.f308499a.f308506d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).a(data);
        }
    }

    @Override // e70.c0
    public void b(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.b0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.Iterator it = this.f308499a.f308506d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).b(data);
        }
    }

    @Override // e70.c0
    public void c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.v data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.Iterator it = this.f308499a.f308506d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).c(data);
        }
    }

    @Override // e70.c0
    public void d(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.a abortInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abortInfo, "abortInfo");
        d83.h0 h0Var = this.f308499a;
        java.util.Iterator it = h0Var.f308506d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).d(abortInfo);
        }
        h0Var.f308508f.mo152xb9724478();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = h0Var.f308507e;
        if (r2Var != null) {
            h0Var.f308507e = null;
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        h0Var.f308506d.clear();
    }

    @Override // e70.c0
    public void e(java.util.List data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        d83.h0 h0Var = this.f308499a;
        h0Var.a(false);
        java.util.Iterator it = h0Var.f308506d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).e(data);
        }
    }

    @Override // e70.c0
    public void f() {
        java.util.Iterator it = this.f308499a.f308506d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).f();
        }
    }

    @Override // e70.c0
    public void g(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        d83.h0 h0Var = this.f308499a;
        java.util.Iterator it = h0Var.f308506d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).g(error);
        }
        h0Var.f308508f.mo152xb9724478();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = h0Var.f308507e;
        if (r2Var != null) {
            h0Var.f308507e = null;
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        h0Var.f308506d.clear();
    }

    @Override // e70.c0
    public void h() {
        java.util.Iterator it = this.f308499a.f308506d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).h();
        }
    }

    @Override // e70.c0
    /* renamed from: onTimeout */
    public void mo123670x1554e82() {
        d83.h0 h0Var = this.f308499a;
        java.util.Iterator it = h0Var.f308506d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).mo123670x1554e82();
        }
        h0Var.f308508f.mo152xb9724478();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = h0Var.f308507e;
        if (r2Var != null) {
            h0Var.f308507e = null;
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        h0Var.f308506d.clear();
    }
}
