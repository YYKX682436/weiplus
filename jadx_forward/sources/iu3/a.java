package iu3;

/* loaded from: classes5.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu3.e f376518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(iu3.e eVar) {
        super(1);
        this.f376518d = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        iu3.e eVar = this.f376518d;
        if (booleanValue) {
            ju3.d0.k(eVar.f376525e, ju3.c0.S, null, 2, null);
        } else {
            ju3.d0.k(eVar.f376525e, ju3.c0.W, null, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
