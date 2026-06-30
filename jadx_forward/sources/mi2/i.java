package mi2;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi2.l f408301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(mi2.l lVar) {
        super(2);
        this.f408301d = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        mi2.l lVar = this.f408301d;
        lVar.f408306y = booleanValue;
        lVar.f408305x = intValue;
        lVar.G();
        return jz5.f0.f384359a;
    }
}
