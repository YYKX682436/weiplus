package bb;

/* loaded from: classes13.dex */
public final class f implements com.p176xb6135e39.p271xde6bf207.p277xb96ca991.InterfaceC2748xc8fe6a11 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f100244c = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile java.lang.Object f100245a = f100244c;

    /* renamed from: b, reason: collision with root package name */
    public volatile com.p176xb6135e39.p271xde6bf207.p277xb96ca991.InterfaceC2748xc8fe6a11 f100246b;

    public f(final com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2737x1eeac96d interfaceC2737x1eeac96d, final com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2735x45fc5824 interfaceC2735x45fc5824) {
        this.f100246b = new com.p176xb6135e39.p271xde6bf207.p277xb96ca991.InterfaceC2748xc8fe6a11(interfaceC2737x1eeac96d, interfaceC2735x45fc5824) { // from class: bb.g

            /* renamed from: a, reason: collision with root package name */
            public final com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2737x1eeac96d f100247a;

            /* renamed from: b, reason: collision with root package name */
            public final com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2735x45fc5824 f100248b;

            {
                this.f100247a = interfaceC2737x1eeac96d;
                this.f100248b = interfaceC2735x45fc5824;
            }

            @Override // com.p176xb6135e39.p271xde6bf207.p277xb96ca991.InterfaceC2748xc8fe6a11
            public final java.lang.Object get() {
                return this.f100247a.mo947xaf65a0fc(this.f100248b);
            }
        };
    }

    @Override // com.p176xb6135e39.p271xde6bf207.p277xb96ca991.InterfaceC2748xc8fe6a11
    public final java.lang.Object get() {
        java.lang.Object obj = this.f100245a;
        java.lang.Object obj2 = f100244c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100245a;
                if (obj == obj2) {
                    obj = this.f100246b.get();
                    this.f100245a = obj;
                    this.f100246b = null;
                }
            }
        }
        return obj;
    }
}
