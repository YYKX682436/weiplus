package ox0;

/* loaded from: classes5.dex */
public final class l extends bv0.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 f431091a;

    public l(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 c10986x82320575) {
        this.f431091a = c10986x82320575;
    }

    @Override // bv0.f
    public void a(bv0.h hVar) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10985xedb07cd9 m47382xfa29d16a;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10985xedb07cd9 m47382xfa29d16a2;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10985xedb07cd9 m47382xfa29d16a3;
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.o5(m7Var, null), 3, null);
        yy0.m7 m7Var2 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        p3325xe03a0797.p3326xc267989b.l.d(m7Var2.Di(), null, null, new yy0.l5(m7Var2, null), 3, null);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 c10986x82320575 = this.f431091a;
        m47382xfa29d16a = c10986x82320575.m47382xfa29d16a();
        m47382xfa29d16a.f151158o = true;
        m47382xfa29d16a.invalidate();
        m47382xfa29d16a2 = c10986x82320575.m47382xfa29d16a();
        m47382xfa29d16a2.f151156m = false;
        m47382xfa29d16a2.f151157n = false;
        m47382xfa29d16a2.invalidate();
        m47382xfa29d16a3 = c10986x82320575.m47382xfa29d16a();
        m47382xfa29d16a3.f151159p = false;
        m47382xfa29d16a3.f151160q = false;
        m47382xfa29d16a3.f151161r = false;
        m47382xfa29d16a3.f151162s = false;
        m47382xfa29d16a3.invalidate();
    }

    @Override // bv0.f
    public void b(bv0.h hVar) {
        if (hVar != null) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 c10986x82320575 = this.f431091a;
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad63 = c10986x82320575.f151173p;
            if (c4023x59e5ad63 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentSpatialDesc");
                throw null;
            }
            float m32758x7520af94 = c4023x59e5ad63.m32758x7520af94() * hVar.a();
            if (m32758x7520af94 > 5.0f) {
                m32758x7520af94 = 5.0f;
            }
            if (m32758x7520af94 < 0.2f) {
                m32758x7520af94 = 0.2f;
            }
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad632 = c10986x82320575.f151173p;
            if (c4023x59e5ad632 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentSpatialDesc");
                throw null;
            }
            c4023x59e5ad632.m32758x7520af94();
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad633 = c10986x82320575.f151173p;
            if (c4023x59e5ad633 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentSpatialDesc");
                throw null;
            }
            c4023x59e5ad633.f129440e = m32758x7520af94;
            c10986x82320575.d();
        }
    }

    @Override // bv0.g, bv0.f
    public void c(bv0.h hVar) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10985xedb07cd9 m47382xfa29d16a;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10985xedb07cd9 m47382xfa29d16a2;
        if (hVar != null) {
            float f17 = hVar.f106229b - hVar.f106231d;
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 c10986x82320575 = this.f431091a;
            m47382xfa29d16a = c10986x82320575.m47382xfa29d16a();
            float width = f17 / m47382xfa29d16a.getClipRect().width();
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad63 = c10986x82320575.f151173p;
            if (c4023x59e5ad63 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentSpatialDesc");
                throw null;
            }
            float f18 = width * c4023x59e5ad63.m32761xf6b22cd6().f129332x;
            float f19 = -(hVar.f106230c - hVar.f106232e);
            m47382xfa29d16a2 = c10986x82320575.m47382xfa29d16a();
            float height = f19 / m47382xfa29d16a2.getClipRect().height();
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad632 = c10986x82320575.f151173p;
            if (c4023x59e5ad632 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentSpatialDesc");
                throw null;
            }
            float f27 = height * c4023x59e5ad632.m32761xf6b22cd6().f129333y;
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad633 = c10986x82320575.f151173p;
            if (c4023x59e5ad633 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentSpatialDesc");
                throw null;
            }
            c4023x59e5ad633.m32755xa86cd69f().f129332x += f18;
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad634 = c10986x82320575.f151173p;
            if (c4023x59e5ad634 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentSpatialDesc");
                throw null;
            }
            c4023x59e5ad634.m32755xa86cd69f().f129333y += f27;
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad635 = c10986x82320575.f151173p;
            if (c4023x59e5ad635 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentSpatialDesc");
                throw null;
            }
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m32430x5a5dd5d = c4023x59e5ad635.m32755xa86cd69f().m32430x5a5dd5d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m32430x5a5dd5d, "clone(...)");
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575.b(c10986x82320575);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gesture, move: (");
            sb6.append(f18);
            sb6.append(", ");
            sb6.append(f27);
            sb6.append("), position: ");
            sb6.append(m32430x5a5dd5d);
            sb6.append(", snapPosition: ");
            com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad636 = c10986x82320575.f151173p;
            if (c4023x59e5ad636 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("currentSpatialDesc");
                throw null;
            }
            sb6.append(c4023x59e5ad636.m32755xa86cd69f());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropView", sb6.toString());
            c10986x82320575.d();
        }
    }

    @Override // bv0.f
    public boolean d(bv0.h hVar) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10985xedb07cd9 m47382xfa29d16a;
        m47382xfa29d16a = this.f431091a.m47382xfa29d16a();
        m47382xfa29d16a.f151158o = false;
        m47382xfa29d16a.invalidate();
        return true;
    }
}
