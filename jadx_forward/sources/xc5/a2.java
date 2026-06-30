package xc5;

/* loaded from: classes3.dex */
public final class a2 implements dg3.o {

    /* renamed from: a, reason: collision with root package name */
    public final mf3.k f534917a;

    /* renamed from: b, reason: collision with root package name */
    public final mf3.p f534918b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f534919c;

    public a2(mf3.k mediaInfo, mf3.p apiCenter, yz5.a exitAction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exitAction, "exitAction");
        this.f534917a = mediaInfo;
        this.f534918b = apiCenter;
        this.f534919c = exitAction;
    }

    @Override // dg3.o
    public void a(dg3.q type) {
        ag3.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int ordinal = type.ordinal();
        mf3.k kVar = this.f534917a;
        mf3.p pVar = this.f534918b;
        if (ordinal == 0) {
            zf3.a aVar2 = (zf3.a) pVar.c(zf3.a.class);
            if (aVar2 != null) {
                zf3.a.Y5(aVar2, kVar, null, 2, null);
                return;
            }
            return;
        }
        if (ordinal == 1) {
            bg3.f fVar = (bg3.f) pVar.c(bg3.f.class);
            if (fVar != null) {
                fVar.S2(kVar);
                return;
            }
            return;
        }
        if (ordinal == 2) {
            yf3.a aVar3 = (yf3.a) pVar.c(yf3.a.class);
            if (aVar3 != null) {
                aVar3.n3(kVar);
                return;
            }
            return;
        }
        if (ordinal == 4) {
            xf3.a aVar4 = (xf3.a) pVar.c(xf3.a.class);
            if (aVar4 != null) {
                ((rh5.b) aVar4).V6(kVar);
                return;
            }
            return;
        }
        if (ordinal == 5) {
            eg3.b bVar = (eg3.b) pVar.a(eg3.b.class);
            if (bVar != null) {
                ((eg3.g) bVar).T();
                return;
            }
            return;
        }
        if (ordinal == 9) {
            this.f534919c.mo152xb9724478();
        } else if (ordinal == 10 && (aVar = (ag3.a) pVar.c(ag3.a.class)) != null) {
            ((xc5.l1) aVar).V6(kVar);
        }
    }

    @Override // dg3.o
    public void b(dg3.q type, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        zf3.a aVar = (zf3.a) this.f534918b.c(zf3.a.class);
        if (aVar != null) {
            aVar.z4(this.f534917a, userName);
        }
    }
}
