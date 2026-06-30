package df;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final df.g f310991a = new df.g();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f310992b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f310993c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static boolean f310994d;

    public final df.z a(android.content.Context context, boolean z17) {
        df.j jVar = new df.j(context);
        return z17 ? new df.z(jVar, new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4(jVar)) : new df.z(jVar, new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56(jVar));
    }

    public final df.z b(android.content.Context context, boolean z17) {
        df.z zVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.Iterator it = f310992b.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            zVar = (df.z) next;
            if ((z17 && zVar.m124146x3569ec4f() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture) || (!z17 && zVar.m124146x3569ec4f() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface)) {
                it.remove();
                zVar.c(context);
                break;
            }
        }
        zVar = null;
        return zVar == null ? a(context, z17) : zVar;
    }

    public final void c(df.z view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        view.c(context);
        view.m137283xa83bcec0(null);
        if (!(f310994d && view.m124146x3569ec4f() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture) && (f310994d || view.m124146x3569ec4f() != io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface)) {
            return;
        }
        f310992b.addLast(view);
    }
}
