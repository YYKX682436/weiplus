package al2;

/* loaded from: classes3.dex */
public final class f implements al2.h {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f87367a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f87368b;

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f87369c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f87370d;

    /* renamed from: e, reason: collision with root package name */
    public wt2.a f87371e;

    public f(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f87367a = context;
        this.f87368b = "FinderLiveAnchorPromoteModel";
        this.f87369c = new p012xc85e97e9.p093xedfae76a.j0();
        this.f87370d = new java.util.LinkedList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x011b, code lost:
    
        if (r0 != 3) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(r45.a52 r22, yz5.l r23) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: al2.f.b(r45.a52, yz5.l):void");
    }

    public void c(r45.z42 info, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        int i17 = ke2.b0.f388465u;
        wt2.a aVar = this.f87371e;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        gk2.e liveData = aVar.q5();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        long j17 = ((mm2.e1) liveData.a(mm2.e1.class)).f410516m;
        long m75942xfb822ef2 = ((mm2.e1) liveData.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        r45.vg1 vg1Var = new r45.vg1();
        vg1Var.set(0, java.lang.Long.valueOf(info.m75942xfb822ef2(0)));
        ke2.b0 b0Var = new ke2.b0(new ke2.z(j17, m75942xfb822ef2, 2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(vg1Var.mo14344x5f01b1f6())));
        az2.j.u(b0Var, this.f87367a, null, 0L, 6, null);
        b0Var.l().K(new al2.c(this, info, lVar));
    }

    public void d(android.content.Context context, r45.z42 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        wt2.a aVar = this.f87371e;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        long j17 = ((mm2.e1) aVar.q5().a(mm2.e1.class)).f410516m;
        wt2.a aVar2 = this.f87371e;
        if (aVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        ke2.e0 e0Var = new ke2.e0(j17, ((mm2.e1) aVar2.q5().a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), item, 0, 8, null);
        e0Var.t(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L);
        e0Var.l().K(new al2.d(this, item));
    }

    public void e(java.lang.Runnable runnable) {
        wt2.a aVar = this.f87371e;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        long j17 = ((mm2.e1) aVar.q5().a(mm2.e1.class)).f410516m;
        wt2.a aVar2 = this.f87371e;
        if (aVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        ke2.x xVar = new ke2.x(j17, ((mm2.e1) aVar2.q5().a(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
        az2.j.u(xVar, this.f87367a, null, 0L, 6, null);
        xVar.l().K(new al2.e(this, runnable));
    }
}
