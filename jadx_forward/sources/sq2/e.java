package sq2;

/* loaded from: classes2.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f492879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f492880e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f492881f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, int i17) {
        super(0);
        this.f492879d = f0Var;
        this.f492880e = e0Var;
        this.f492881f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f492879d.f391649d;
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f492880e;
        if (i17 == 1) {
            i95.m c17 = i95.n0.c(ys5.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ys5.f.D6((ys5.f) c17, ys5.e.f546792g, e0Var.f391648d, null, 4, null);
        } else if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyRefreshServiceImp", "finderLiveHomeEntranceExposePredict: predict do nothing, op=" + this.f492881f);
            if (((sq2.g) ((ys5.f) i95.n0.c(ys5.f.class))).Bi()) {
                ((sq2.g) ((ys5.f) i95.n0.c(ys5.f.class))).f492886h = "";
            }
        } else {
            i95.m c18 = i95.n0.c(ys5.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ys5.f.D6((ys5.f) c18, ys5.e.f546789d, e0Var.f391648d, null, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
