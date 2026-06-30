package xd3;

/* loaded from: classes15.dex */
public abstract class d implements xd3.a {
    public void b(ve3.r service, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478 data, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    public void c(ve3.u action, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478 data, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        ve3.r rVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String str = data.f229697f;
        if (str == null) {
            e(rVar, -1, "texture type invalid");
            return;
        }
        xd3.f fVar = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "finder-live") ? xd3.f.f535150d : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "video") ? xd3.f.f535151e : null;
        if (fVar == null) {
            e(rVar, -1, "service type invalid");
            return;
        }
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            rVar2 = (ve3.r) i95.n0.c(ve3.n.class);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            rVar2 = (ve3.r) i95.n0.c(ve3.s.class);
        }
        if (rVar2 == null) {
            e(rVar, -1, "service not found");
            return;
        }
        b(rVar2, data, rVar);
        if (rVar2 instanceof ve3.s) {
            d((ve3.s) rVar2, data, rVar);
        }
    }

    public void d(ve3.s service, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478 data, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    public final void e(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, int i17, java.lang.String errorMessage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMessage, "errorMessage");
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b(i17, errorMessage, null, 4, null));
        }
    }

    public void f(ve3.u action, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478 data, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }
}
