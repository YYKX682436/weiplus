package q04;

/* loaded from: classes4.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f440919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o04.q f440921f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i17, java.lang.String str, o04.q qVar) {
        super(0);
        this.f440919d = i17;
        this.f440920e = str;
        this.f440921f = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(r04.a.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(r04.a.class);
        }
        r04.d dVar = (r04.d) ((r04.a) a17).P6(r04.d.class);
        java.lang.String id6 = this.f440919d + '_' + this.f440920e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        r04.b X6 = dVar.X6(id6);
        int S6 = X6 != null ? com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.S6(dVar, X6, false, false, 6, null) : 0;
        o04.q qVar = this.f440921f;
        if (qVar != null) {
            qVar.a(4, S6 > 0, null, null);
        }
        return jz5.f0.f384359a;
    }
}
