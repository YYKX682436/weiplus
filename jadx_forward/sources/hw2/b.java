package hw2;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.e f367035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hw2.e eVar) {
        super(1);
        this.f367035d = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        hw2.e eVar = this.f367035d;
        if (booleanValue) {
            ju3.d0.k(eVar.f367046e, ju3.c0.S, null, 2, null);
        } else {
            ju3.d0.k(eVar.f367046e, ju3.c0.W, null, 2, null);
            ju3.d0.k(eVar.f367046e, ju3.c0.T, null, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
