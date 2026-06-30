package af2;

/* loaded from: classes3.dex */
public final class e extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f4524a;

    public e(gk2.e liveContext) {
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f4524a = kz5.b0.c(new xe2.d(liveContext));
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        kotlin.jvm.internal.o.g(respWrapper, "respWrapper");
        java.util.Iterator it = this.f4524a.iterator();
        while (it.hasNext()) {
            ((we2.z) it.next()).b(respWrapper);
        }
        return true;
    }
}
