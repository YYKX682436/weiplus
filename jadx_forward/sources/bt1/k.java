package bt1;

/* loaded from: classes4.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f105700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bt1.g f105701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bt1.l f105702f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f105703g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.List list, bt1.g gVar, bt1.l lVar, int i17) {
        super(1);
        this.f105700d = list;
        this.f105701e = gVar;
        this.f105702f = lVar;
        this.f105703g = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        fp0.r singleTask = (fp0.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singleTask, "singleTask");
        java.util.List list = this.f105700d;
        new dt1.h(list, this.f105701e).l().H(new bt1.j(this.f105702f, list, this.f105703g, singleTask));
        return jz5.f0.f384359a;
    }
}
