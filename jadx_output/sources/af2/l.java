package af2;

/* loaded from: classes3.dex */
public final class l extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f4531a;

    public l(gk2.e liveContext) {
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f4531a = kz5.c0.i(new ye2.b(liveContext), new ye2.c(liveContext));
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        kotlin.jvm.internal.o.g(respWrapper, "respWrapper");
        java.util.Iterator it = this.f4531a.iterator();
        while (it.hasNext()) {
            ((we2.b0) it.next()).b(respWrapper);
        }
        return true;
    }
}
