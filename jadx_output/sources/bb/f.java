package bb;

/* loaded from: classes13.dex */
public final class f implements com.google.firebase.inject.Provider {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f18711c = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile java.lang.Object f18712a = f18711c;

    /* renamed from: b, reason: collision with root package name */
    public volatile com.google.firebase.inject.Provider f18713b;

    public f(final com.google.firebase.components.ComponentFactory componentFactory, final com.google.firebase.components.ComponentContainer componentContainer) {
        this.f18713b = new com.google.firebase.inject.Provider(componentFactory, componentContainer) { // from class: bb.g

            /* renamed from: a, reason: collision with root package name */
            public final com.google.firebase.components.ComponentFactory f18714a;

            /* renamed from: b, reason: collision with root package name */
            public final com.google.firebase.components.ComponentContainer f18715b;

            {
                this.f18714a = componentFactory;
                this.f18715b = componentContainer;
            }

            @Override // com.google.firebase.inject.Provider
            public final java.lang.Object get() {
                return this.f18714a.create(this.f18715b);
            }
        };
    }

    @Override // com.google.firebase.inject.Provider
    public final java.lang.Object get() {
        java.lang.Object obj = this.f18712a;
        java.lang.Object obj2 = f18711c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f18712a;
                if (obj == obj2) {
                    obj = this.f18713b.get();
                    this.f18712a = obj;
                    this.f18713b = null;
                }
            }
        }
        return obj;
    }
}
