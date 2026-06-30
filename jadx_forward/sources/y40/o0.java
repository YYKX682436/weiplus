package y40;

/* loaded from: classes7.dex */
public abstract class o0 {
    public static final com.p314xaae8f345.mm.p2495xc50a8b8b.f a(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (fVar == null) {
            return result;
        }
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = result.mo11468x92b714fd(fVar.mo14344x5f01b1f6());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type T of com.tencent.mm.feature.finderbox.FinderBoxPbExtKt.fitIn");
            rk0.c.a("Finder.BoxPbExt", "fit in origin" + fVar.mo12245xcc313de3() + ", result: " + result.mo12245xcc313de3(), new java.lang.Object[0]);
            return mo11468x92b714fd;
        } catch (java.lang.Exception e17) {
            rk0.c.b("Finder.BoxPbExt", "fit in origin" + fVar.mo12245xcc313de3(), e17);
            return result;
        }
    }
}
