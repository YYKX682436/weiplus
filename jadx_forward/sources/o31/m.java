package o31;

/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final o31.m f424214a = new o31.m();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(java.lang.String userName, com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 data, im5.b bVar, yz5.l receiver) {
        f31.f c17;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        f31.c cVar = f31.d.f340804a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = data.f153369f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it.next();
            java.util.Iterator it6 = data.f153371h.f153318h.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it6.next();
                    if (android.text.TextUtils.equals(((com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) obj).f153336f, c11159x8f55e6d3.f153336f)) {
                        break;
                    }
                }
            }
            com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) obj;
            if (c11159x8f55e6d32 != null) {
                if ((c11159x8f55e6d32.f153340m == c11159x8f55e6d3.f153340m && c11159x8f55e6d32.f153348u == c11159x8f55e6d3.f153348u && c11159x8f55e6d32.f153351x == c11159x8f55e6d3.f153351x && c11159x8f55e6d32.C == c11159x8f55e6d3.C) ? false : true) {
                    arrayList.add(c11159x8f55e6d3);
                }
            }
        }
        o31.l lVar = new o31.l(receiver, userName);
        if (bVar != null) {
            o31.j jVar = new o31.j();
            jVar.f424209d = lVar;
            bVar.mo46316x322b85(jVar);
            lVar = jVar;
        }
        c17 = cVar.c(userName, "", data.f153368e, lVar, arrayList, 1, new byte[0], (r22 & 128) != 0 ? null : null, (r22 & 256) != 0 ? "" : null);
        c17.a(f31.b.f340802a);
    }

    public final void b(java.lang.String userName, com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 data, yz5.l receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        a(userName, data, null, receiver);
    }
}
