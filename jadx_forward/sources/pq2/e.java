package pq2;

/* loaded from: classes2.dex */
public final class e extends pq2.c implements cp2.e {

    /* renamed from: u, reason: collision with root package name */
    public static int f439120u = -1;

    /* renamed from: o, reason: collision with root package name */
    public final int f439121o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.dd2 f439122p;

    /* renamed from: q, reason: collision with root package name */
    public final int f439123q;

    /* renamed from: r, reason: collision with root package name */
    public r45.qt2 f439124r;

    /* renamed from: s, reason: collision with root package name */
    public final oq2.a f439125s;

    /* renamed from: t, reason: collision with root package name */
    public cp2.m f439126t;

    public e(int i17, r45.dd2 tabInfo, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabInfo, "tabInfo");
        this.f439121o = i17;
        this.f439122p = tabInfo;
        this.f439123q = i18;
        this.f439125s = new oq2.a();
    }

    @Override // cp2.e
    public void a(cp2.m rsp, cp2.l request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rsp, "rsp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        java.lang.String str = this.f439111d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd errType:");
        sb6.append(rsp.getErrType());
        sb6.append(" errCode:");
        sb6.append(rsp.getErrCode());
        sb6.append(" errMsg:");
        sb6.append(rsp.getErrMsg());
        sb6.append(" rsp:");
        sb6.append(hc2.o0.p(rsp.m56409x97891cf7()));
        sb6.append("}pullType: ");
        int i17 = request.f302367a;
        sb6.append(i17);
        sb6.append(" + prefetchMinInterval: ");
        sb6.append(rsp.f302383c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (i17 == 16) {
            this.f439126t = rsp;
            return;
        }
        this.f439117m.c("onFetchDone");
        this.f439114g = new az2.w(rsp.getErrType(), rsp.getErrCode(), rsp.getErrMsg(), rsp, android.os.SystemClock.elapsedRealtime());
        int i18 = request.f302370d;
        java.util.ArrayList arrayList = (java.util.ArrayList) rsp.m56409x97891cf7();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g lastBuffer = rsp.getLastBuffer();
        oq2.a aVar = this.f439125s;
        aVar.getClass();
        if (arrayList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PreloadCacheManager", "store memoryCacheFlag:" + i18 + " return for dataList is null.");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PreloadCacheManager", "store memoryCacheFlag:" + i18 + " dataList:" + arrayList.size() + " lastBuffer:" + lastBuffer);
            ey2.c3.S6(aVar.f428905a, i18, 0, 0, arrayList, null, lastBuffer, true, 0, null, 400, null);
            aVar.f428905a.R6(i18);
        }
        f439120u = rsp.f302383c * 1000;
        int m75939xb282bd08 = this.f439122p.m75939xb282bd08(0) + 1005000 + this.f439121o;
        switch (this.f439123q) {
            case 9:
            case 10:
                this.f439125s.a(m75939xb282bd08, android.os.SystemClock.elapsedRealtime(), 0L, 0L);
                break;
            case 11:
                this.f439125s.a(m75939xb282bd08, 0L, android.os.SystemClock.elapsedRealtime(), 0L);
                break;
            case 12:
            case 14:
            case 15:
                this.f439125s.a(m75939xb282bd08, 0L, 0L, android.os.SystemClock.elapsedRealtime());
                break;
        }
        c(this.f439114g, pq2.d.f439119d);
    }

    @Override // pq2.c
    public void b() {
        this.f439117m.c("fetchInternal");
        r45.dd2 dd2Var = this.f439122p;
        cp2.l lVar = new cp2.l(this.f439123q, this.f439122p, null, dd2Var.m75939xb282bd08(0) + 1005000 + this.f439121o, dd2Var.m75939xb282bd08(0) + 1001, this.f439121o, null, 0, 0L, null, 0, com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27794x4202466e, null);
        j(lVar, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439111d, "fetchInternal request:" + lVar);
    }

    @Override // pq2.c
    public az2.w e() {
        az2.w e17 = super.e();
        if (e17 != null) {
            new db2.x(2, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) e17.f97693d).getLastBuffer()).l();
        }
        return e17;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0136  */
    @Override // pq2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pq2.e.h():void");
    }

    public final void j(cp2.l lVar, cp2.g gVar) {
        tq2.c.f502753i.a(lVar.f302370d).f502758d = java.lang.System.currentTimeMillis();
        r45.qt2 qt2Var = this.f439124r;
        if (qt2Var != null) {
            new cp2.f(qt2Var).E0(lVar, this, gVar);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
    }

    public final void k() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f439111d);
        sb6.append("_@");
        r45.dd2 dd2Var = this.f439122p;
        sb6.append(dd2Var.m75939xb282bd08(0));
        sb6.append('-');
        sb6.append(dd2Var.m75945x2fec8307(1));
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb7, "<set-?>");
        this.f439111d = sb7;
    }
}
