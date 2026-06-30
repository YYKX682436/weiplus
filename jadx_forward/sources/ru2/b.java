package ru2;

/* loaded from: classes8.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f481267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str) {
        super(0);
        this.f481267d = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (ru2.j.f481281n) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = ru2.j.f481279i;
            java.lang.String name = this.f481267d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "$name");
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((ru2.a) it.next()).C1(name);
            }
        }
        return jz5.f0.f384359a;
    }
}
