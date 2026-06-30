package zn0;

/* loaded from: classes3.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f555872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f555873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f555874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f555875g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f555876h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f555877i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f555878m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        super(2);
        this.f555872d = i17;
        this.f555873e = i18;
        this.f555874f = i19;
        this.f555875g = i27;
        this.f555876h = i28;
        this.f555877i = i29;
        this.f555878m = i37;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser _mixUser = (com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_mixUser, "_mixUser");
        _mixUser.f57072xd4bdd2f4 = intValue + 1;
        int i17 = this.f555872d;
        int i18 = this.f555873e;
        _mixUser.f297232x = ((i17 - i18) - this.f555874f) - this.f555875g;
        int i19 = this.f555877i;
        int i27 = this.f555878m;
        _mixUser.f297233y = this.f555876h + ((i19 + i27) * intValue);
        _mixUser.f57071x6be2dc6 = i18;
        _mixUser.f57062xb7389127 = i27;
        return jz5.f0.f384359a;
    }
}
