package cl;

/* loaded from: classes7.dex */
public class g implements cl.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f124170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cl.a f124171c;

    public g(cl.a aVar, int i17, int i18) {
        this.f124171c = aVar;
        this.f124169a = i17;
        this.f124170b = i18;
    }

    @Override // cl.i1
    public com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad a() {
        com.p159x477cd522.p160x333422.C1460x397c7778 c1460x397c7778 = this.f124171c.f124101a;
        if (c1460x397c7778 != null) {
            return c1460x397c7778.m15866x8cd5b041(this.f124169a, this.f124170b);
        }
        throw new java.lang.IllegalStateException("createContext mV8 not ready!");
    }
}
