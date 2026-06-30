package cl;

/* loaded from: classes7.dex */
public class d implements cl.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cl.a f42611b;

    public d(cl.a aVar, int i17) {
        this.f42611b = aVar;
        this.f42610a = i17;
    }

    @Override // cl.i1
    public com.eclipsesource.mmv8.V8Context a() {
        com.eclipsesource.mmv8.MultiContextV8 multiContextV8 = this.f42611b.f42568a;
        if (multiContextV8 != null) {
            return multiContextV8.createContext(this.f42610a);
        }
        throw new java.lang.IllegalStateException("createContext mV8 not ready!");
    }
}
