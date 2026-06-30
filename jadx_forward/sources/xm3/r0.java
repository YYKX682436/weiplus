package xm3;

/* loaded from: classes4.dex */
public final class r0 {
    public r0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.d response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        v65.i.b(scope, null, new xm3.q0(b17, response, null), 1, null);
        return b17;
    }

    public final ym3.d b(int i17, ym3.c request, yz5.l creator) {
        int i18;
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(creator, "creator");
        ym3.d dVar = new ym3.d(request);
        int i19 = request.f544677b;
        if (i17 > i19) {
            int i27 = 0;
            while (true) {
                i18 = request.f544678c;
                arrayList = dVar.f544682c;
                if (i27 >= i18) {
                    break;
                }
                int i28 = i19 + i27;
                if (i19 + i27 < i17) {
                    arrayList.add(creator.mo146xb9724478(java.lang.Integer.valueOf(i28)));
                }
                i27++;
            }
            dVar.f544681b = arrayList.size() >= i18;
        } else {
            dVar.f544681b = false;
        }
        return dVar;
    }
}
