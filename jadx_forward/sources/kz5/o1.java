package kz5;

/* loaded from: classes14.dex */
public abstract class o1 {
    public static final java.util.Set a(java.util.Set builder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        lz5.q qVar = (lz5.q) builder;
        lz5.m mVar = qVar.f403955d;
        mVar.c();
        mVar.f403950s = true;
        if (mVar.f403946o <= 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(lz5.m.f403937t, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        return qVar.f403955d.f403946o > 0 ? qVar : lz5.q.f403954e;
    }

    public static final java.util.Set b() {
        return new lz5.q();
    }

    public static final java.util.Set c(java.lang.Object obj) {
        java.util.Set singleton = java.util.Collections.singleton(obj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(singleton, "singleton(...)");
        return singleton;
    }
}
