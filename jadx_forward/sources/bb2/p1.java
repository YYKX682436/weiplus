package bb2;

/* loaded from: classes10.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f100475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.o f100476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f100477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f100478g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100479h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(bb2.w1 w1Var, bb2.o oVar, boolean z17, int i17, java.lang.String str) {
        super(0);
        this.f100475d = w1Var;
        this.f100476e = oVar;
        this.f100477f = z17;
        this.f100478g = i17;
        this.f100479h = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bb2.m0 m0Var = bb2.m0.f100451a;
        bb2.w1 w1Var = this.f100475d;
        android.content.Context context = w1Var.f100569a.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        bb2.o oVar = this.f100476e;
        long j17 = 1000;
        m0Var.c(context, oVar.f100459a, w1Var.e(), (int) (w1Var.f100572d / j17), true);
        android.view.View view = w1Var.f100569a;
        android.content.Context context2 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        m0Var.d(view, context2, oVar.f100459a, w1Var.e().mo2128x1ed62e84(), (int) (w1Var.f100572d / j17), true);
        if (this.f100477f) {
            android.content.Context context3 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.class);
            if (c15442xfd56d647 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u4 u4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.A;
                c15442xfd56d647.d7(true, this.f100478g, this.f100479h, false);
            }
        }
        return jz5.f0.f384359a;
    }
}
