package lo0;

/* loaded from: classes8.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo0.g f401516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(lo0.g gVar) {
        super(1);
        this.f401516d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.ref.WeakReference it = (java.lang.ref.WeakReference) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        lo0.g gVar = (lo0.g) it.get();
        boolean z17 = true;
        if (!(gVar == null) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar, this.f401516d)) {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
