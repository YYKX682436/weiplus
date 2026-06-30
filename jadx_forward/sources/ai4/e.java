package ai4;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f86667a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f86668b;

    public e(java.lang.String topicId, java.util.List items) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicId, "topicId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        this.f86667a = topicId;
        this.f86668b = items;
    }

    public final boolean a() {
        if (this.f86668b.size() <= 0) {
            return false;
        }
        return bk4.i.a().B((mj4.h) this.f86668b.get(0));
    }
}
