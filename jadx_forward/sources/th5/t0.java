package th5;

/* loaded from: classes12.dex */
public final class t0 implements dg3.o {

    /* renamed from: a, reason: collision with root package name */
    public final mf3.k f500993a;

    /* renamed from: b, reason: collision with root package name */
    public final mf3.p f500994b;

    public t0(mf3.k mediaInfo, mf3.p apiCenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.f500993a = mediaInfo;
        this.f500994b = apiCenter;
    }

    @Override // dg3.o
    public void a(dg3.q type) {
        th5.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int ordinal = type.ordinal();
        th5.v0 v0Var = th5.v0.f501003a;
        mf3.p pVar = this.f500994b;
        mf3.k kVar = this.f500993a;
        if (ordinal == 0) {
            zf3.a aVar = (zf3.a) pVar.c(zf3.a.class);
            if (aVar != null) {
                zf3.a.Y5(aVar, kVar, null, 2, null);
            }
            bVar = kVar instanceof th5.b ? (th5.b) kVar : null;
            if (bVar != null) {
                v0Var.a(bVar.f500877c, bVar.f500875a, bVar.f500876b, th5.a.f500868g, th5.e.f500900f);
                return;
            }
            return;
        }
        if (ordinal != 1) {
            return;
        }
        bg3.f fVar = (bg3.f) pVar.c(bg3.f.class);
        if (fVar != null) {
            fVar.S2(kVar);
        }
        bVar = kVar instanceof th5.b ? (th5.b) kVar : null;
        if (bVar != null) {
            v0Var.a(bVar.f500877c, bVar.f500875a, bVar.f500876b, th5.a.f500869h, th5.e.f500900f);
        }
    }

    @Override // dg3.o
    public void b(dg3.q type, java.lang.String userName) {
        zf3.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (th5.s0.f500991a[type.ordinal()] != 2 || (aVar = (zf3.a) this.f500994b.c(zf3.a.class)) == null) {
            return;
        }
        aVar.z4(this.f500993a, userName);
    }
}
