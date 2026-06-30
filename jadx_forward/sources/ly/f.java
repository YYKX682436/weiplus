package ly;

/* loaded from: classes11.dex */
public final class f implements u4.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f403711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f403713f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p112x993b6d55.C1173xe703c6a5 f403714g;

    public f(yz5.a aVar, yz5.l lVar, yz5.a aVar2, p012xc85e97e9.p112x993b6d55.C1173xe703c6a5 c1173xe703c6a5) {
        this.f403711d = aVar;
        this.f403712e = lVar;
        this.f403713f = aVar2;
        this.f403714g = c1173xe703c6a5;
    }

    @Override // u4.b1
    public void a(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 transition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transition, "transition");
    }

    @Override // u4.b1
    public void b(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 transition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transition, "transition");
        try {
            yz5.a aVar = this.f403711d;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } catch (java.lang.Exception e17) {
            yz5.l lVar = this.f403712e;
            if (lVar != null) {
                lVar.mo146xb9724478(e17);
            }
        }
    }

    @Override // u4.b1
    public void c(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 transition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transition, "transition");
    }

    @Override // u4.b1
    public void d(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 transition) {
        p012xc85e97e9.p112x993b6d55.C1173xe703c6a5 c1173xe703c6a5 = this.f403714g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transition, "transition");
        try {
            try {
                yz5.a aVar = this.f403713f;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
            } catch (java.lang.Exception e17) {
                yz5.l lVar = this.f403712e;
                if (lVar != null) {
                    lVar.mo146xb9724478(e17);
                }
            }
        } finally {
            c1173xe703c6a5.E(this);
        }
    }
}
