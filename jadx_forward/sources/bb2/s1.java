package bb2;

/* loaded from: classes5.dex */
public final class s1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f100523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f100524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f100525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100526g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f100527h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(boolean z17, bb2.w1 w1Var, int i17, java.lang.String str, boolean z18) {
        super(0);
        this.f100523d = z17;
        this.f100524e = w1Var;
        this.f100525f = i17;
        this.f100526g = str;
        this.f100527h = z18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f100523d) {
            android.content.Context context = this.f100524e.f100569a.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.class);
            if (c15442xfd56d647 != null) {
                c15442xfd56d647.d7(false, this.f100525f, this.f100526g, this.f100527h);
            }
        }
        return jz5.f0.f384359a;
    }
}
