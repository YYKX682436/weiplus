package ey0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final v51.f f338840a;

    /* renamed from: b, reason: collision with root package name */
    public final ey0.d f338841b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Date f338842c;

    public j(android.content.Context context, java.util.Calendar initDate, java.util.Calendar startDate, java.util.Calendar endDate, v51.f listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initDate, "initDate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(startDate, "startDate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endDate, "endDate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f338840a = listener;
        ey0.d dVar = new ey0.d(context);
        this.f338841b = dVar;
        int i17 = initDate.get(11);
        i17 = i17 < 0 ? 0 : i17;
        i17 = i17 > 23 ? 23 : i17;
        int i18 = initDate.get(12);
        i18 = i18 < 0 ? 0 : i18;
        i18 = i18 > 59 ? 59 : i18;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p914xc515088e.C11002x71313bc9 c11002x71313bc9 = dVar.f338832e;
        if (c11002x71313bc9 != null) {
            c11002x71313bc9.f151249n = i17;
            c11002x71313bc9.f151250o = i18;
        }
        int i19 = startDate.get(11);
        i19 = i19 < 0 ? 0 : i19;
        i19 = i19 > 23 ? 23 : i19;
        int i27 = startDate.get(12);
        i27 = i27 < 0 ? 0 : i27;
        i27 = i27 > 59 ? 59 : i27;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p914xc515088e.C11002x71313bc9 c11002x71313bc92 = dVar.f338832e;
        if (c11002x71313bc92 != null) {
            c11002x71313bc92.f151245g = i19;
            c11002x71313bc92.f151246h = i27;
        }
        int i28 = endDate.get(11);
        i28 = i28 < 0 ? 0 : i28;
        int i29 = i28 <= 23 ? i28 : 23;
        int i37 = endDate.get(12);
        int i38 = i37 >= 0 ? i37 : 0;
        int i39 = i38 <= 59 ? i38 : 59;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p914xc515088e.C11002x71313bc9 c11002x71313bc93 = dVar.f338832e;
        if (c11002x71313bc93 != null) {
            c11002x71313bc93.f151247i = i29;
            c11002x71313bc93.f151248m = i39;
        }
        ey0.h hVar = new ey0.h(this);
        if (c11002x71313bc93 != null) {
            c11002x71313bc93.m47428xb2c39d8f(hVar);
        }
        ey0.i iVar = new ey0.i(this);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p914xc515088e.C11002x71313bc9 c11002x71313bc94 = dVar.f338832e;
        if (c11002x71313bc94 != null) {
            c11002x71313bc94.m47427x57fdf1be(iVar);
        }
    }
}
