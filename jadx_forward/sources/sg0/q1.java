package sg0;

/* loaded from: classes8.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489317d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(java.lang.String str) {
        super(1);
        this.f489317d = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        sg0.k1 it = (sg0.k1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.f489272b, this.f489317d)) {
            java.lang.ref.WeakReference weakReference = it.f489271a;
            if ((weakReference != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e) weakReference.get() : null) != null) {
                z17 = false;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = true;
        return java.lang.Boolean.valueOf(z17);
    }
}
