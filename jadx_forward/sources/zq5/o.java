package zq5;

/* loaded from: classes15.dex */
public abstract class o {
    public static final zq5.n a(zq5.n div, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(div, "$this$div");
        return new zq5.n(div.f556615a / zq5.q.b(j17), div.f556616b / zq5.q.c(j17), div.f556617c / zq5.q.b(j17), div.f556618d / zq5.q.c(j17));
    }

    public static final zq5.n b(zq5.n limitTo, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(limitTo, "$this$limitTo");
        float b17 = zq5.t.b(j17);
        float a17 = zq5.t.a(j17);
        float f17 = limitTo.f556615a;
        float f18 = limitTo.f556618d;
        float f19 = limitTo.f556617c;
        float f27 = limitTo.f556616b;
        return (f17 < 0.0f || f17 > b17 || f27 < 0.0f || f27 > a17 || f19 < 0.0f || f19 > b17 || f18 < 0.0f || f18 > a17) ? new zq5.n(e06.p.e(f17, 0.0f, b17), e06.p.e(f27, 0.0f, a17), e06.p.e(f19, 0.0f, b17), e06.p.e(f18, 0.0f, a17)) : limitTo;
    }

    public static final zq5.n c(zq5.n reverseRotateInSpace, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reverseRotateInSpace, "$this$reverseRotateInSpace");
        if (i17 % 180 != 0) {
            j17 = zq5.u.a(zq5.t.a(j17), zq5.t.b(j17));
        }
        int i18 = (360 - i17) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        if (!(i18 % 90 == 0)) {
            throw new java.lang.IllegalArgumentException(("rotation must be a multiple of 90, rotation: " + i18).toString());
        }
        int i19 = i18 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        if (i19 < 0) {
            i19 += com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        }
        float f17 = reverseRotateInSpace.f556617c;
        float f18 = reverseRotateInSpace.f556616b;
        float f19 = reverseRotateInSpace.f556615a;
        float f27 = reverseRotateInSpace.f556618d;
        return i19 != 90 ? i19 != 180 ? i19 != 270 ? reverseRotateInSpace : new zq5.n(f18, zq5.t.b(j17) - f17, f27, zq5.t.b(j17) - f19) : new zq5.n(zq5.t.b(j17) - f17, zq5.t.a(j17) - f27, zq5.t.b(j17) - f19, zq5.t.a(j17) - f18) : new zq5.n(zq5.t.a(j17) - f27, f19, zq5.t.a(j17) - f18, f17);
    }

    public static final zq5.e d(zq5.n nVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        return new zq5.e(a06.d.b(nVar.f556615a), a06.d.b(nVar.f556616b), a06.d.b(nVar.f556617c), a06.d.b(nVar.f556618d));
    }

    public static final java.lang.String e(zq5.n nVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        return "[" + zq5.b.c(nVar.f556615a, 2) + 'x' + zq5.b.c(nVar.f556616b, 2) + ',' + zq5.b.c(nVar.f556617c, 2) + 'x' + zq5.b.c(nVar.f556618d, 2) + ']';
    }
}
