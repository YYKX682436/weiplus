package ym5;

/* loaded from: classes2.dex */
public final class c4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f544765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f544766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f544767f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2) {
        super(1);
        this.f544765d = e0Var;
        this.f544766e = c22801x87cbdc00;
        this.f544767f = e0Var2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f544765d;
        int b17 = a06.d.b(floatValue - e0Var.f391648d);
        if (b17 < 0) {
            b17 = 0;
        }
        this.f544766e.m82555x4905e9fa().scrollBy(0, b17);
        this.f544767f.f391648d += b17;
        e0Var.f391648d = floatValue;
        return jz5.f0.f384359a;
    }
}
