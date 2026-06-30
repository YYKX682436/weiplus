package xc5;

/* loaded from: classes12.dex */
public final class c3 implements xf0.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.e3 f534940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f534941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg3.c f534942f;

    public c3(java.lang.String str, xc5.e3 e3Var, mf3.k kVar, gg3.c cVar) {
        this.f534940d = e3Var;
        this.f534941e = kVar;
        this.f534942f = cVar;
    }

    @Override // xf0.e
    public void L0(xf0.g event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event.f535700b != xf0.h.f535703e) {
            return;
        }
        float f17 = event.f535701c;
        this.f534940d.W6(this.f534941e, gg3.d.f353265d, this.f534942f, new gg3.e(null, 0, f17, 3, null));
    }
}
