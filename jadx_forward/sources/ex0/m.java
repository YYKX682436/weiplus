package ex0;

/* loaded from: classes5.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.o f338680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f338681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ex0.o oVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553) {
        super(1);
        this.f338680d = oVar;
        this.f338681e = c4129xdee64553;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float[] decibels = (float[]) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decibels, "decibels");
        ex0.o oVar = this.f338680d;
        oVar.f338690t = this.f338681e;
        oVar.f338689s = by0.w.a(decibels, 0.0f, 0.714f, 1, null);
        return jz5.f0.f384359a;
    }
}
