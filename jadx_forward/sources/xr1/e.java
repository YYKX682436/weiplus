package xr1;

/* loaded from: classes8.dex */
public final class e extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.yk f537717d;

    /* renamed from: e, reason: collision with root package name */
    public final xr1.n f537718e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f537719f;

    public e(r45.yk appMsgInfo, xr1.n nVar, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String format;
        xr1.n itemType = (i17 & 2) != 0 ? xr1.n.f537737f : nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appMsgInfo, "appMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemType, "itemType");
        this.f537717d = appMsgInfo;
        this.f537718e = itemType;
        java.lang.String str = "";
        if (appMsgInfo.f472699h > 0) {
            vr1.k0 k0Var = vr1.k0.f521109a;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            long j17 = 1000;
            long j18 = appMsgInfo.f472699h * j17;
            java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
            if (j18 >= 3600000) {
                java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
                java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
                gregorianCalendar3.setTimeInMillis(j18);
                long timeInMillis = j18 - gregorianCalendar2.getTimeInMillis();
                if (timeInMillis <= 0 || timeInMillis > 86400000) {
                    long j19 = timeInMillis + 86400000;
                    if (j19 <= 0 || j19 > 86400000) {
                        long j27 = timeInMillis + 604800000;
                        if (j27 <= 0 || j27 > 604800000) {
                            boolean j28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j();
                            if (gregorianCalendar2.get(1) == gregorianCalendar3.get(1)) {
                                if (j28) {
                                    format = k35.m1.d(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), j18 / j17);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
                                } else {
                                    format = java.lang.String.format("%s %d", java.util.Arrays.copyOf(new java.lang.Object[]{k0Var.a(gregorianCalendar3.get(2)), java.lang.Integer.valueOf(gregorianCalendar3.get(5))}, 2));
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                                }
                            } else if (j28) {
                                format = k35.m1.d(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), j18 / j17);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
                            } else {
                                format = java.lang.String.format("%s %d, %d", java.util.Arrays.copyOf(new java.lang.Object[]{k0Var.a(gregorianCalendar3.get(2)), java.lang.Integer.valueOf(gregorianCalendar3.get(5)), java.lang.Integer.valueOf(gregorianCalendar3.get(1))}, 3));
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                            }
                        } else {
                            int i18 = gregorianCalendar3.get(7) - 1;
                            format = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559562ae)[(i18 != 0 ? i18 : 7) - 1];
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "get(...)");
                        }
                    } else {
                        format = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "getString(...)");
                    }
                } else {
                    format = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fd_);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "getString(...)");
                }
                str = format;
            }
        }
        this.f537719f = str;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        xr1.e other = (xr1.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        r45.yk ykVar = this.f537717d;
        java.lang.String str = ykVar.f472697f;
        r45.yk ykVar2 = other.f537717d;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ykVar2.f472697f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ykVar.f472698g, ykVar2.f472698g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ykVar.f472696e, ykVar2.f472696e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537719f, other.f537719f);
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        xr1.e other = (xr1.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return 0;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f537718e.f537739d;
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.yk ykVar = this.f537717d;
        sb6.append(ykVar.f472702n);
        sb6.append(ykVar.f472703o);
        sb6.append(ykVar.f472704p);
        sb6.append(this.f537719f);
        return sb6.toString();
    }
}
