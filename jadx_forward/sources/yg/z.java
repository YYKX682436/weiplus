package yg;

/* loaded from: classes7.dex */
public final class z implements e8.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad f543678a;

    public z(com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad) {
        this.f543678a = c4209xd2d3ddad;
    }

    @Override // e8.d
    public void a(java.lang.String path, e8.c event, e8.a decodeInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decodeInfo, "decodeInfo");
    }

    @Override // e8.d
    public void b(java.lang.String path, java.lang.Object obj, e8.e recycleHandler, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycleHandler, "recycleHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = this.f543678a;
        if (c4209xd2d3ddad.f130110a == 0) {
            if (obj != null) {
                ((com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8) obj).mo17133x408b7293();
                return;
            }
            return;
        }
        ch.g gVar = c4209xd2d3ddad.f130116g;
        if (gVar != null) {
            gVar.k(new yg.m(c4209xd2d3ddad, recycleHandler, path, obj, config), false);
        } else if (obj != null) {
            ((com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8) obj).mo17133x408b7293();
        }
    }
}
