package ey0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final v51.f f338835a;

    /* renamed from: b, reason: collision with root package name */
    public final ey0.c f338836b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Date f338837c;

    public g(android.content.Context context, java.util.Calendar initDate, java.util.Calendar startDate, java.util.Calendar endDate, com.p314xaae8f345.p457x3304c6.p479x4179489f.e options, v51.f listener) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p914xc515088e.C11001x619eebea c11001x619eebea;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initDate, "initDate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(startDate, "startDate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endDate, "endDate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f338835a = listener;
        ey0.c cVar = new ey0.c(context);
        this.f338836b = cVar;
        int i17 = initDate.get(1);
        int i18 = initDate.get(2) + 1;
        int i19 = initDate.get(5);
        if (i17 >= 0 && i18 >= 0 && i19 >= 0 && (c11001x619eebea = cVar.f338830e) != null) {
            c11001x619eebea.f151236o = i17;
            c11001x619eebea.f151237p = i18;
            c11001x619eebea.f151238q = i19;
            if (c11001x619eebea.f151228d == null) {
                c11001x619eebea.f151228d = c11001x619eebea.f151229e.d();
            }
        }
        int i27 = options.f130023a;
        boolean z17 = (i27 & 1) != 0;
        boolean z18 = (i27 & 2) != 0;
        boolean z19 = (i27 & 4) != 0;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p914xc515088e.C11001x619eebea c11001x619eebea2 = cVar.f338830e;
        if (c11001x619eebea2 != null) {
            c11001x619eebea2.f151233i = z19;
            c11001x619eebea2.f151234m = z18;
            c11001x619eebea2.f151235n = z17;
        }
        int i28 = startDate.get(1);
        int i29 = startDate.get(2) + 1;
        int i37 = startDate.get(5);
        if (i28 >= 0 && i29 >= 0 && i37 >= 0) {
            java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.Locale.US);
            calendar.set(i28, i29 - 1, i37);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p914xc515088e.C11001x619eebea c11001x619eebea3 = cVar.f338830e;
            if (c11001x619eebea3 != null) {
                c11001x619eebea3.m47423xf0a11a5e(java.lang.Long.valueOf(calendar.getTimeInMillis()));
            }
        }
        int i38 = endDate.get(1);
        int i39 = endDate.get(2) + 1;
        int i47 = endDate.get(5);
        if (i38 >= 0 && i39 >= 0 && i47 >= 0) {
            java.util.Calendar calendar2 = java.util.Calendar.getInstance(java.util.Locale.US);
            calendar2.set(i38, i39 - 1, i47);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p914xc515088e.C11001x619eebea c11001x619eebea4 = cVar.f338830e;
            if (c11001x619eebea4 != null) {
                c11001x619eebea4.m47422xe3874070(java.lang.Long.valueOf(calendar2.getTimeInMillis()));
            }
        }
        ey0.e eVar = new ey0.e(this);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p914xc515088e.C11001x619eebea c11001x619eebea5 = cVar.f338830e;
        if (c11001x619eebea5 != null) {
            c11001x619eebea5.m47425xb2c39d8f(eVar);
        }
        ey0.f fVar = new ey0.f(this);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p914xc515088e.C11001x619eebea c11001x619eebea6 = cVar.f338830e;
        if (c11001x619eebea6 != null) {
            c11001x619eebea6.m47424x57fdf1be(fVar);
        }
    }
}
