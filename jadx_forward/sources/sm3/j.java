package sm3;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm3.n f491411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp4.a f491412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sm3.o f491413f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(sm3.n nVar, kp4.a aVar, sm3.o oVar) {
        super(1);
        this.f491411d = nVar;
        this.f491412e = aVar;
        this.f491413f = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16709x6913f423 c16709x6913f423 = this.f491411d.f491426e;
        c16709x6913f423.m67430x3ae760af(c16709x6913f423.getStart() + ((int) (((float) (longValue - this.f491412e.f392613j)) * this.f491413f.f491430e.mo67411xf6b910ea())));
        return jz5.f0.f384359a;
    }
}
