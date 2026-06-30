package ix5;

/* loaded from: classes12.dex */
public class b implements com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25498xa2251f91 {

    /* renamed from: b, reason: collision with root package name */
    public static final ix5.b f377158b = new ix5.b();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentMap f377159a = new java.util.concurrent.ConcurrentHashMap();

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25498xa2251f91
    /* renamed from: getLogger */
    public com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 mo46974x23af1886(java.lang.String str) {
        java.util.concurrent.ConcurrentMap concurrentMap = this.f377159a;
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b0 = (com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0) ((java.util.concurrent.ConcurrentHashMap) concurrentMap).get(str);
        if (interfaceC25508x87fce1b0 != null) {
            return interfaceC25508x87fce1b0;
        }
        ix5.a aVar = new ix5.a(this, str);
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b02 = (com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0) ((java.util.concurrent.ConcurrentHashMap) concurrentMap).putIfAbsent(str, aVar);
        return interfaceC25508x87fce1b02 == null ? aVar : interfaceC25508x87fce1b02;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25498xa2251f91
    /* renamed from: getNativeLogFunc */
    public long mo46975x98af045b() {
        return 0L;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25498xa2251f91
    /* renamed from: init */
    public void mo46976x316510(boolean z17) {
    }
}
