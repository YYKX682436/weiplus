package tl5;

/* loaded from: classes10.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl5.s f501913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(tl5.s sVar) {
        super(1);
        this.f501913d = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        tl5.d dVar = this.f501913d.f501921d;
        if (dVar != null) {
            dVar.b(floatValue, true);
        }
        return jz5.f0.f384359a;
    }
}
