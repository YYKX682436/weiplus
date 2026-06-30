package lr1;

/* loaded from: classes9.dex */
public class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f402227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f402228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f402229c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr1.s f402230d;

    public p(lr1.s sVar, java.util.List list, java.util.List list2, java.lang.Runnable runnable) {
        this.f402230d = sVar;
        this.f402227a = list;
        this.f402228b = list2;
        this.f402229c = runnable;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        lr1.s sVar = this.f402230d;
        ((java.util.LinkedList) sVar.f402235e).clear();
        java.util.List list = sVar.f402236f;
        ((java.util.LinkedList) list).clear();
        ((java.util.LinkedList) sVar.f402235e).addAll(this.f402227a);
        ((java.util.LinkedList) list).addAll(this.f402228b);
        this.f402229c.run();
        return null;
    }
}
