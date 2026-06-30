package sf4;

/* loaded from: classes4.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18493x6cdc7fd6 f489028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18493x6cdc7fd6 c18493x6cdc7fd6) {
        super(2);
        this.f489028d = c18493x6cdc7fd6;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        float floatValue = ((java.lang.Number) obj2).floatValue();
        yz5.p onScrollCallback = this.f489028d.getOnScrollCallback();
        if (onScrollCallback != null) {
            onScrollCallback.mo149xb9724478(java.lang.Integer.valueOf(intValue), java.lang.Float.valueOf(floatValue));
        }
        return jz5.f0.f384359a;
    }
}
