package ai4;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5134a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f5135b;

    public e(java.lang.String topicId, java.util.List items) {
        kotlin.jvm.internal.o.g(topicId, "topicId");
        kotlin.jvm.internal.o.g(items, "items");
        this.f5134a = topicId;
        this.f5135b = items;
    }

    public final boolean a() {
        if (this.f5135b.size() <= 0) {
            return false;
        }
        return bk4.i.a().B((mj4.h) this.f5135b.get(0));
    }
}
