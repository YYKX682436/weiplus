package qu0;

/* loaded from: classes5.dex */
public final class g extends qu0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qu0.i f448261a;

    public g(qu0.i iVar) {
        this.f448261a = iVar;
    }

    @Override // uu0.b
    public void c(int i17, java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        if (fy0.i.a()) {
            this.f448261a.f448265c.c(i17, str, str2, bool);
        } else {
            fy0.i.b(new qu0.f(this, i17, str, str2, bool));
        }
    }

    @Override // qu0.c
    public void d(uu0.k recordParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordParam, "recordParam");
        if (fy0.i.a()) {
            this.f448261a.f448265c.d(recordParam);
        } else {
            fy0.i.b(new qu0.e(this, recordParam));
        }
    }
}
