package cp4;

/* loaded from: classes5.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.r f302589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(cp4.r rVar) {
        super(1);
        this.f302589d = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        cp4.r rVar = this.f302589d;
        if (booleanValue) {
            ju3.d0.k(rVar.f546865d, ju3.c0.B2, null, 2, null);
        } else {
            ju3.d0.k(rVar.f546865d, ju3.c0.C2, null, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
