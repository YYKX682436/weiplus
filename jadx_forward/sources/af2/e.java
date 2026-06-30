package af2;

/* loaded from: classes3.dex */
public final class e extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f86057a;

    public e(gk2.e liveContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f86057a = kz5.b0.c(new xe2.d(liveContext));
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respWrapper, "respWrapper");
        java.util.Iterator it = this.f86057a.iterator();
        while (it.hasNext()) {
            ((we2.z) it.next()).b(respWrapper);
        }
        return true;
    }
}
