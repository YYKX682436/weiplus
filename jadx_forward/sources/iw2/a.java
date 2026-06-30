package iw2;

/* loaded from: classes10.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iw2.b f376761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(iw2.b bVar) {
        super(1);
        this.f376761d = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17 = ((java.lang.Number) obj).intValue() == 1;
        iw2.b bVar = this.f376761d;
        bVar.f376764f = z17;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", bVar.f376764f);
        bVar.f376763e.w(ju3.c0.f383448y, bundle);
        return jz5.f0.f384359a;
    }
}
