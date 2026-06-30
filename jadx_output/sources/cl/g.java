package cl;

/* loaded from: classes7.dex */
public class g implements cl.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cl.a f42638c;

    public g(cl.a aVar, int i17, int i18) {
        this.f42638c = aVar;
        this.f42636a = i17;
        this.f42637b = i18;
    }

    @Override // cl.i1
    public com.eclipsesource.mmv8.V8Context a() {
        com.eclipsesource.mmv8.MultiContextV8 multiContextV8 = this.f42638c.f42568a;
        if (multiContextV8 != null) {
            return multiContextV8.createContextFromSnapshot(this.f42636a, this.f42637b);
        }
        throw new java.lang.IllegalStateException("createContext mV8 not ready!");
    }
}
