package u24;

/* loaded from: classes.dex */
public final class l implements java.util.function.BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a24.i f505660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f505661b;

    public l(a24.i iVar, java.util.List list) {
        this.f505660a = iVar;
        this.f505661b = list;
    }

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        a24.i item = (a24.i) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        a24.u b76 = item.b7();
        a24.i iVar = this.f505660a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.getClass(), b76.f82441a)) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar, item)) {
                u24.m.f505662a.a(item);
            } else {
                this.f505661b.add(item);
            }
        }
    }
}
