package cl;

/* loaded from: classes7.dex */
public class d implements cl.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cl.a f124144b;

    public d(cl.a aVar, int i17) {
        this.f124144b = aVar;
        this.f124143a = i17;
    }

    @Override // cl.i1
    public com.p159x477cd522.p160x333422.InterfaceC1471x242ee8ad a() {
        com.p159x477cd522.p160x333422.C1460x397c7778 c1460x397c7778 = this.f124144b.f124101a;
        if (c1460x397c7778 != null) {
            return c1460x397c7778.m15865xbe9e5913(this.f124143a);
        }
        throw new java.lang.IllegalStateException("createContext mV8 not ready!");
    }
}
