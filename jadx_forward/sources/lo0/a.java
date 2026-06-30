package lo0;

/* loaded from: classes4.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo0.h f401482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(lo0.h hVar) {
        super(1);
        this.f401482d = hVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.ref.WeakReference it = (java.lang.ref.WeakReference) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        lo0.h hVar = (lo0.h) it.get();
        boolean z17 = true;
        if (!(hVar == null) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar, this.f401482d)) {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
